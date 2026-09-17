package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class GetProDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.framework.Assets _assetsRef;
    private org.fortheloss.framework.AnimationWidget _effectsAnimationWidget;
    private com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup _proStuffGroup;


    public GetProDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.framework.Assets r2) {
            r0 = this;
            r0.<init>(r1)
            r0._assetsRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r0 = com.badlogic.gdx.graphics.Texture.class
            super.dialogResult(r5)
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proFiltersAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r3 = 1
            boolean r5 = r5.isLoaded(r1, r2, r3)
            if (r5 == 0) goto L19
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proFiltersAtlas
            r5.unload(r1, r3)
        L19:
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdMP4Texture
            boolean r5 = r5.isLoaded(r1, r0, r3)
            if (r5 == 0) goto L2a
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdMP4Texture
            r5.unload(r1, r3)
        L2a:
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            boolean r5 = r5.isLoaded(r1, r0, r3)
            if (r5 == 0) goto L3b
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            r5.unload(r1, r3)
        L3b:
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            boolean r5 = r5.isLoaded(r1, r0, r3)
            if (r5 == 0) goto L4c
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            r5.unload(r1, r3)
        L4c:
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            boolean r5 = r5.isLoaded(r1, r0, r3)
            if (r5 == 0) goto L5d
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            r5.unload(r1, r3)
        L5d:
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            boolean r5 = r5.isLoaded(r1, r0, r3)
            if (r5 == 0) goto L6e
            org.fortheloss.framework.Assets r5 = r4._assetsRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            r5.unload(r0, r3)
        L6e:
            r4.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._assetsRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r2._proStuffGroup
            if (r1 == 0) goto La
            r1.clear()
        La:
            r2._proStuffGroup = r0
            org.fortheloss.framework.AnimationWidget r1 = r2._effectsAnimationWidget
            if (r1 == 0) goto L15
            r1.dispose()
            r2._effectsAnimationWidget = r0
        L15:
            super.dispose()
            return
    }

    public void initialize() {
            r13 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r0 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            java.lang.String r2 = "Stick Nodes Pro!"
            super.initialize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "getProMessage"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3, r4)
            r3 = 1
            r2.setWrap(r3)
            r2.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r13.addContent(r2)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r4 = r4 * r5
            r2.width(r4)
            r13.addContentRow()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1107296256(0x42000000, float:32.0)
            float r2 = r2 * r4
            org.fortheloss.framework.Assets r4 = r13._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.proFiltersAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r6 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r4 = r4.get(r5, r6, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            int r5 = r5.getStore()
            r6 = 2
            if (r5 != r6) goto L5e
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r6 = r13._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.proStoreAmazonTexture
            java.lang.Object r6 = r6.get(r7, r1, r3)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r5.<init>(r6)
            goto L7f
        L5e:
            if (r5 != 0) goto L70
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r6 = r13._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.proStoreAppStoreTexture
            java.lang.Object r6 = r6.get(r7, r1, r3)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r5.<init>(r6)
            goto L7f
        L70:
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r6 = r13._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.proStoreGooglePlayTexture
            java.lang.Object r6 = r6.get(r7, r1, r3)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r5.<init>(r6)
        L7f:
            boolean r6 = org.fortheloss.sticknodes.App.isInternationalUI()
            if (r6 != 0) goto L97
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r7 = r13._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            java.lang.Object r0 = r7.get(r8, r0, r3)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.WHITE
            r6.<init>(r0, r7)
            goto La8
        L97:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r7 = r13._assetsRef
            java.lang.String r8 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r0 = r7.get(r8, r0, r3)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            com.badlogic.gdx.graphics.Color r7 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r6.<init>(r0, r7)
        La8:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "splashProFeatures1"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r0.<init>(r7, r6)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "splashProFeatures2"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r7.<init>(r8, r6)
            r7.setWrap(r3)
            r7.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "splashProFeatures3"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r8.<init>(r9, r6)
            r8.setWrap(r3)
            r8.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r13._assetsRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.proAdSoundsTexture
            java.lang.Object r9 = r9.get(r10, r1, r3)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r6.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r10 = r13._assetsRef
            java.lang.String r11 = org.fortheloss.sticknodes.App.proAdMP4Texture
            java.lang.Object r1 = r10.get(r11, r1, r3)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r9.<init>(r1)
            com.badlogic.gdx.graphics.g2d.Animation r1 = new com.badlogic.gdx.graphics.g2d.Animation
            r10 = 1051260355(0x3ea8f5c3, float:0.33)
            java.lang.String r11 = "image-filters"
            com.badlogic.gdx.utils.Array r4 = r4.findRegions(r11)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r11 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r1.<init>(r10, r4, r11)
            org.fortheloss.framework.AnimationWidget r4 = new org.fortheloss.framework.AnimationWidget
            r4.<init>(r1)
            r13._effectsAnimationWidget = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r1.pad(r4)
            r10.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r4)
            r10.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Widget r10 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r10.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r1.add(r10)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r12 = 1123024896(0x42f00000, float:120.0)
            float r11 = r11 * r12
            r10.height(r11)
            r1.row()
            r1.add(r6)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1138753536(0x43e00000, float:448.0)
            float r6 = r6 * r10
            r0.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0.pad(r4)
            r6.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.space(r4)
            r6.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r6 = 1101004800(0x41a00000, float:20.0)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r6
            r5.spaceBottom(r11)
            r0.row()
            r0.add(r9)
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r7)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r10
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r5.pad(r4)
            r6.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.space(r4)
            r6.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Widget r6 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r12
            r6.height(r7)
            r5.row()
            org.fortheloss.framework.AnimationWidget r6 = r13._effectsAnimationWidget
            r5.add(r6)
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r8)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r10
            r6.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r13._proStuffGroup = r6
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r6.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r4.space(r2)
            r2.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r13._proStuffGroup
            r2.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r13._proStuffGroup
            r1.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r13._proStuffGroup
            r0.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r13._proStuffGroup
            r0.pack()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r13._proStuffGroup
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r13._proStuffGroup
            org.fortheloss.sticknodes.animationscreen.dialogs.GetProDialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.GetProDialog$1
            r1.<init>(r13)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r13._proStuffGroup
            r13.addContent(r0)
            java.lang.String r0 = "okay"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r13.createTextButton(r0)
            r1 = 0
            r13.addButton(r0, r1)
            return
    }
}
