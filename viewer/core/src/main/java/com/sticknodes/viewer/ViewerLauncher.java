package com.sticknodes.viewer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.math.Vector3;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class ViewerLauncher extends ApplicationAdapter {
    private OrthographicCamera camera;
    private SNShapeRenderer shapeRenderer;
    private Stickfigure stickfigure;
    private StickNode selectedNode;

    private float cameraX = 0;
    private float cameraY = 0;
    private float cameraZoom = 1.0f;

    private boolean isDraggingNode = false;
    private boolean isPanning = false;
    private float lastTouchX;
    private float lastTouchY;

    @Override
    public void create() {
        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.position.set(0, 0, 0);
        camera.update();

        shapeRenderer = new SNShapeRenderer();

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                Vector3 world = camera.unproject(new Vector3(screenX, screenY, 0));

                float threshold = 25.0f * cameraZoom;
                StickNode clicked = findNodeAt(world.x, world.y, threshold);

                if (clicked != null) {
                    selectedNode = clicked;
                    isDraggingNode = true;
                    isPanning = false;
                } else {
                    isPanning = true;
                    isDraggingNode = false;
                }

                lastTouchX = screenX;
                lastTouchY = screenY;
                return true;
            }

            @Override
            public boolean touchDragged(int screenX, int screenY, int pointer) {
                Vector3 world = camera.unproject(new Vector3(screenX, screenY, 0));

                if (isDraggingNode && selectedNode != null) {
                    if (selectedNode.isMainNode()) {
                        selectedNode.worldX = world.x;
                        selectedNode.worldY = world.y;
                        stickfigure.updateTransforms(world.x, world.y);
                    } else {
                        StickNode parent = selectedNode.getParentNode();
                        if (parent != null) {
                            float dx = world.x - parent.worldX;
                            float dy = world.y - parent.worldY;
                            float newAngle = (float) Math.toDegrees(Math.atan2(dy, dx));
                            float parentAngle = parent.worldAngle;

                            selectedNode.setLocalAngle(newAngle - parentAngle);
                            if (selectedNode.isStretchy()) {
                                float newLength = (float) Math.hypot(dx, dy);
                                selectedNode.setLength(newLength);
                            }
                            stickfigure.updateTransforms(stickfigure.getMainNode().worldX, stickfigure.getMainNode().worldY);
                        }
                    }
                } else if (isPanning) {
                    float dx = (screenX - lastTouchX) * cameraZoom;
                    float dy = (screenY - lastTouchY) * cameraZoom;
                    cameraX -= dx;
                    cameraY += dy;
                    updateCamera();
                }

                lastTouchX = screenX;
                lastTouchY = screenY;
                return true;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                isDraggingNode = false;
                isPanning = false;
                return true;
            }

            @Override
            public boolean scrolled(float amountX, float amountY) {
                if (amountY > 0) {
                    cameraZoom *= 1.1f;
                } else if (amountY < 0) {
                    cameraZoom /= 1.1f;
                }
                updateCamera();
                return true;
            }
        });

        loadEmbeddedTestNodes();
    }

    public void loadEmbeddedTestNodes() {
        try {
            FileHandle handle = Gdx.files.internal("assets/test.nodes");
            if (!handle.exists()) {
                handle = Gdx.files.internal("test.nodes");
            }
            if (handle.exists()) {
                loadNodesBytes(handle.readBytes());
            } else {
                Gdx.app.log("ViewerLauncher", "Embedded test.nodes not found");
            }
        } catch (Exception e) {
            Gdx.app.error("ViewerLauncher", "Error loading test.nodes", e);
        }
    }

    public void loadNodesBytes(byte[] bytes) {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes));
            Stickfigure fig = new Stickfigure();
            fig.readData(in);
            this.stickfigure = fig;
            this.selectedNode = null;
            resetView();
            Gdx.app.log("ViewerLauncher", "Successfully loaded .nodes figure!");
        } catch (Exception e) {
            Gdx.app.error("ViewerLauncher", "Error parsing .nodes bytes", e);
        }
    }

    public void resetView() {
        cameraX = 0;
        cameraY = 0;
        cameraZoom = 1.0f;
        updateCamera();
    }

    private void updateCamera() {
        camera.viewportWidth = Gdx.graphics.getWidth() * cameraZoom;
        camera.viewportHeight = Gdx.graphics.getHeight() * cameraZoom;
        camera.position.set(cameraX, cameraY, 0);
        camera.update();
    }

    @Override
    public void resize(int width, int height) {
        updateCamera();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.25f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (stickfigure == null) return;

        shapeRenderer.begin(camera.combined, GL20.GL_TRIANGLES);
        renderNodeRecursive(stickfigure.getMainNode());
        shapeRenderer.end();

        if (selectedNode != null) {
            shapeRenderer.begin(camera.combined, GL20.GL_TRIANGLES);
            shapeRenderer.circle(selectedNode.worldX, selectedNode.worldY, 8.0f * cameraZoom, 16, com.badlogic.gdx.graphics.Color.YELLOW, com.badlogic.gdx.graphics.Color.YELLOW);
            shapeRenderer.end();
        }
    }

    private void renderNodeRecursive(StickNode node) {
        node.drawLimb(shapeRenderer, 0, 0, 1.0f, false);
        for (StickNode child : node.getChildrenNodes()) {
            renderNodeRecursive(child);
        }
    }

    public StickNode findNodeAt(float worldX, float worldY, float threshold) {
        if (stickfigure == null) return null;
        return findNodeRecursive(stickfigure.getMainNode(), worldX, worldY, threshold);
    }

    private StickNode findNodeRecursive(StickNode node, float wx, float wy, float threshold) {
        float dx = node.worldX - wx;
        float dy = node.worldY - wy;
        if (Math.hypot(dx, dy) <= threshold) {
            return node;
        }
        for (StickNode child : node.getChildrenNodes()) {
            StickNode found = findNodeRecursive(child, wx, wy, threshold);
            if (found != null) return found;
        }
        return null;
    }

    public Stickfigure getStickfigure() { return stickfigure; }
    public StickNode getSelectedNode() { return selectedNode; }
    public void setSelectedNode(StickNode node) { this.selectedNode = node; }
    public OrthographicCamera getCamera() { return camera; }

    @Override
    public void dispose() {
        if (shapeRenderer != null) shapeRenderer.dispose();
    }
}
