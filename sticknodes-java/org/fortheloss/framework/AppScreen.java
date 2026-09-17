package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class AppScreen implements com.badlogic.gdx.utils.Disposable {
    protected org.fortheloss.sticknodes.App _appRef;
    protected org.fortheloss.framework.Assets _assetsRef;
    private int _bufferWaitAfterLoading;
    protected boolean _flagLoadLoadingTexture;
    protected boolean _flagUnloadAssetsOnDispose;
    private boolean _flagUnloadLoadingTexture;
    private com.badlogic.gdx.graphics.Texture _loadingTexture;
    protected int _screenState;
    protected com.badlogic.gdx.scenes.scene2d.Stage _stageRef;

    public AppScreen(org.fortheloss.sticknodes.App r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._flagUnloadAssetsOnDispose = r0
            r0 = 0
            r1._screenState = r0
            r1._flagLoadLoadingTexture = r0
            r1._flagUnloadLoadingTexture = r0
            r0 = 5
            r1._bufferWaitAfterLoading = r0
            r1._appRef = r2
            return
    }

    private void loadLoadingTexture() {
            r4 = this;
            r0 = 1
            r4._screenState = r0
            org.fortheloss.framework.Assets r1 = r4._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.loadingTexture
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r3 = com.badlogic.gdx.graphics.Texture.class
            r1.load(r2, r3, r0)
            return
    }

    private void unloadLoadingTexture() {
            r4 = this;
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.loadingTexture
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r2 = com.badlogic.gdx.graphics.Texture.class
            r3 = 1
            boolean r0 = r0.isLoaded(r1, r2, r3)
            if (r0 == 0) goto L14
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.loadingTexture
            r0.unload(r1, r3)
        L14:
            return
    }

    public void checkOutsideOpenRequests() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            boolean r0 = r2._flagUnloadAssetsOnDispose
            if (r0 == 0) goto L7
            r2.unloadAssets()
        L7:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r1 = 0
            if (r0 == 0) goto L11
            r0.clear()
            r2._stageRef = r1
        L11:
            r2._appRef = r1
            r2._assetsRef = r1
            r2._loadingTexture = r1
            return
    }

    public void draw() {
            r0 = this;
            return
    }

    public com.badlogic.gdx.scenes.scene2d.Stage getStage() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            return r0
    }

    public void initialize() {
            r1 = this;
            org.fortheloss.sticknodes.App r0 = r1._appRef
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            r1._stageRef = r0
            org.fortheloss.sticknodes.App r0 = r1._appRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            r1._assetsRef = r0
            boolean r0 = r1._flagLoadLoadingTexture
            if (r0 == 0) goto L18
            r1.loadLoadingTexture()
            goto L1b
        L18:
            r1.loadAssets()
        L1b:
            return
    }

    protected void loadAssets() {
            r1 = this;
            r0 = 1
            r1._screenState = r0
            return
    }

    protected void loadingComplete() {
            r1 = this;
            boolean r0 = r1._flagUnloadLoadingTexture
            if (r0 == 0) goto L7
            r1.unloadLoadingTexture()
        L7:
            r0 = 0
            r1._screenState = r0
            return
    }

    public void pause() {
            r0 = this;
            return
    }

    protected void renderLoadingTexture() {
            r6 = this;
            com.badlogic.gdx.graphics.Texture r0 = r6._loadingTexture
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r0 = r0.getBatch()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.glClearColor(r2, r2, r2, r3)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
            r0.begin()
            r1 = 1061158912(0x3f400000, float:0.75)
            r0.setColor(r3, r3, r3, r1)
            com.badlogic.gdx.graphics.Texture r1 = r6._loadingTexture
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r6._stageRef
            float r2 = r2.getWidth()
            com.badlogic.gdx.graphics.Texture r3 = r6._loadingTexture
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = (int) r2
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r6._stageRef
            float r4 = r4.getHeight()
            com.badlogic.gdx.graphics.Texture r5 = r6._loadingTexture
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 - r5
            float r4 = r4 * r3
            int r3 = (int) r4
            float r3 = (float) r3
            r0.draw(r1, r2, r3)
            r0.end()
            return
    }

    public void resize() {
            r0 = this;
            return
    }

    public void resume() {
            r0 = this;
            return
    }

    protected void unloadAssets() {
            r0 = this;
            return
    }

    public void update(float r4) {
            r3 = this;
            int r4 = r3._screenState
            r0 = 1
            if (r4 != r0) goto L3f
            org.fortheloss.framework.Assets r4 = r3._assetsRef
            r4.update()
            org.fortheloss.framework.Assets r4 = r3._assetsRef
            float r4 = r4.getLoadingProgress()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L3f
            int r4 = r3._bufferWaitAfterLoading
            if (r4 <= 0) goto L1e
            int r4 = r4 - r0
            r3._bufferWaitAfterLoading = r4
            goto L3f
        L1e:
            r4 = 5
            r3._bufferWaitAfterLoading = r4
            boolean r4 = r3._flagLoadLoadingTexture
            if (r4 == 0) goto L3c
            org.fortheloss.framework.Assets r4 = r3._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.loadingTexture
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r2 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Object r4 = r4.get(r1, r2, r0)
            com.badlogic.gdx.graphics.Texture r4 = (com.badlogic.gdx.graphics.Texture) r4
            r3._loadingTexture = r4
            r4 = 0
            r3._flagLoadLoadingTexture = r4
            r3._flagUnloadLoadingTexture = r0
            r3.loadAssets()
            goto L3f
        L3c:
            r3.loadingComplete()
        L3f:
            return
    }
}
