package com.sticknodes.viewer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer20;

public class SNShapeRenderer {
    private final ImmediateModeRenderer20 renderer;

    public SNShapeRenderer() {
        this.renderer = new ImmediateModeRenderer20(5000, false, true, 0);
    }

    public void begin(com.badlogic.gdx.math.Matrix4 combinedMatrix, int primitiveType) {
        renderer.begin(combinedMatrix, primitiveType);
    }

    public void end() {
        renderer.end();
    }

    public void drawNodeSegment(StickNode node) {
        if (node.isMainNode()) {
            drawCircle(node.worldX, node.worldY, node.getThickness() / 2.0f, node.getColor());
            return;
        }

        StickNode parent = node.getParentNode();
        if (parent == null) return;

        float x1 = parent.worldX;
        float y1 = parent.worldY;
        float x2 = node.worldX;
        float y2 = node.worldY;
        float thickness = node.getThickness();
        Color col = node.getColor();

        switch (node.getLimbType()) {
            case StickNode.LIMB_SEGMENT:
                drawLineSegment(x1, y1, x2, y2, thickness, col);
                drawCircle(x2, y2, thickness / 2.0f, col);
                break;
            case StickNode.LIMB_CIRCLE:
                drawCircle(x2, y2, node.getLength(), col);
                break;
            default:
                drawLineSegment(x1, y1, x2, y2, thickness, col);
                drawCircle(x2, y2, thickness / 2.0f, col);
                break;
        }
    }

    public void drawLineSegment(float x1, float y1, float x2, float y2, float thickness, Color color) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float len = (float) Math.hypot(dx, dy);
        if (len == 0) return;

        float nx = -dy / len * (thickness / 2.0f);
        float ny = dx / len * (thickness / 2.0f);

        float colorBits = color.toFloatBits();

        renderer.color(colorBits);
        renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(colorBits);
        renderer.vertex(x1 - nx, y1 - ny, 0);
        renderer.color(colorBits);
        renderer.vertex(x2 - nx, y2 - ny, 0);

        renderer.color(colorBits);
        renderer.vertex(x1 + nx, y1 + ny, 0);
        renderer.color(colorBits);
        renderer.vertex(x2 - nx, y2 - ny, 0);
        renderer.color(colorBits);
        renderer.vertex(x2 + nx, y2 + ny, 0);
    }

    public void drawCircle(float cx, float cy, float radius, Color color) {
        int segments = 24;
        float angleStep = (float) (2 * Math.PI / segments);
        float colorBits = color.toFloatBits();

        for (int i = 0; i < segments; i++) {
            float a1 = i * angleStep;
            float a2 = (i + 1) * angleStep;

            float x1 = cx + (float) (Math.cos(a1) * radius);
            float y1 = cy + (float) (Math.sin(a1) * radius);
            float x2 = cx + (float) (Math.cos(a2) * radius);
            float y2 = cy + (float) (Math.sin(a2) * radius);

            renderer.color(colorBits);
            renderer.vertex(cx, cy, 0);
            renderer.color(colorBits);
            renderer.vertex(x1, y1, 0);
            renderer.color(colorBits);
            renderer.vertex(x2, y2, 0);
        }
    }

    public void dispose() {
        renderer.dispose();
    }
}
