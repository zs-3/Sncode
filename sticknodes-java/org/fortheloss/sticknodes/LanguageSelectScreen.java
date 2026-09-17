package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class LanguageSelectScreen extends org.fortheloss.framework.AppScreen {
    private com.badlogic.gdx.graphics.g2d.TextureRegion _backgroundTile;
    private int _backgroundTileHeight;
    private int _backgroundTileWidth;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _dfShaderRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _doneButton;
    private org.fortheloss.sticknodes.LanguageButton _englishButton;
    private org.fortheloss.sticknodes.LanguageButton _filipinoButton;
    private boolean _flagChangeScreen;
    private org.fortheloss.sticknodes.LanguageButton _frenchButton;
    private org.fortheloss.sticknodes.LanguageButton _japaneseButton;
    private java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> _languageButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup _languageGroup;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _languageLabel;
    private org.fortheloss.sticknodes.LanguageButton _portugueseButton;
    private org.fortheloss.sticknodes.LanguageButton _russianButton;
    private int _selectedLanguageID;
    private com.badlogic.gdx.scenes.scene2d.ui.Skin _skin;
    private org.fortheloss.sticknodes.LanguageButton _spanishButton;
    private org.fortheloss.sticknodes.LanguageButton _turkishButton;










    /* renamed from: -$$Nest$fget_englishButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m187$$Nest$fget_englishButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._englishButton
            return r0
    }

    /* renamed from: -$$Nest$fget_filipinoButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m188$$Nest$fget_filipinoButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._filipinoButton
            return r0
    }

    /* renamed from: -$$Nest$fget_frenchButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m189$$Nest$fget_frenchButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._frenchButton
            return r0
    }

    /* renamed from: -$$Nest$fget_japaneseButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m190$$Nest$fget_japaneseButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._japaneseButton
            return r0
    }

    /* renamed from: -$$Nest$fget_portugueseButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m191$$Nest$fget_portugueseButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._portugueseButton
            return r0
    }

    /* renamed from: -$$Nest$fget_russianButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m192$$Nest$fget_russianButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._russianButton
            return r0
    }

    /* renamed from: -$$Nest$fget_spanishButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m193$$Nest$fget_spanishButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._spanishButton
            return r0
    }

    /* renamed from: -$$Nest$fget_turkishButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.LanguageButton m194$$Nest$fget_turkishButton(org.fortheloss.sticknodes.LanguageSelectScreen r0) {
            org.fortheloss.sticknodes.LanguageButton r0 = r0._turkishButton
            return r0
    }

    /* renamed from: -$$Nest$fput_flagChangeScreen, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m195$$Nest$fput_flagChangeScreen(org.fortheloss.sticknodes.LanguageSelectScreen r0, boolean r1) {
            r0._flagChangeScreen = r1
            return
    }

    /* renamed from: -$$Nest$msetSelectedLanguage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m196$$Nest$msetSelectedLanguage(org.fortheloss.sticknodes.LanguageSelectScreen r0, org.fortheloss.sticknodes.LanguageButton r1) {
            r0.setSelectedLanguage(r1)
            return
    }

    public LanguageSelectScreen(org.fortheloss.sticknodes.App r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2._backgroundTileWidth = r3
            r2._backgroundTileHeight = r3
            r2._selectedLanguageID = r3
            r2._flagChangeScreen = r3
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "current_screen"
            java.lang.String r1 = "language_select"
            r3.setCrashlyticsKeyString(r0, r1)
            return
    }

    private void setDoneButtonText() {
            r2 = this;
            int r0 = r2._selectedLanguageID
            if (r0 != 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "English >"
            r0.setText(r1)
            goto L58
        Lc:
            r1 = 1
            if (r0 != r1) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Español >"
            r0.setText(r1)
            goto L58
        L17:
            r1 = 5
            if (r0 != r1) goto L22
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Filipino >"
            r0.setText(r1)
            goto L58
        L22:
            r1 = 2
            if (r0 != r1) goto L2d
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Français >"
            r0.setText(r1)
            goto L58
        L2d:
            r1 = 6
            if (r0 != r1) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "日本語 >"
            r0.setText(r1)
            goto L58
        L38:
            r1 = 3
            if (r0 != r1) goto L43
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Português >"
            r0.setText(r1)
            goto L58
        L43:
            r1 = 7
            if (r0 != r1) goto L4e
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Русский >"
            r0.setText(r1)
            goto L58
        L4e:
            r1 = 4
            if (r0 != r1) goto L58
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._doneButton
            java.lang.String r1 = "Türkçe >"
            r0.setText(r1)
        L58:
            return
    }

    private void setSelectedLanguage(org.fortheloss.sticknodes.LanguageButton r5) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r0 = r4._languageButtons
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r2 = r4._languageButtons
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.LanguageButton r2 = (org.fortheloss.sticknodes.LanguageButton) r2
            if (r2 != r5) goto L1e
            r2.setSelected(r1)
            int r2 = r2.getLanguageID()
            r4._selectedLanguageID = r2
            goto L22
        L1e:
            r3 = 0
            r2.setSelected(r3)
        L22:
            int r0 = r0 + (-1)
            goto L8
        L25:
            r4.setDoneButtonText()
            return
    }

    @Override // org.fortheloss.framework.AppScreen, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._backgroundTile = r0
            r3._languageLabel = r0
            r3._dfShaderRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r1 = r3._languageButtons
            if (r1 == 0) goto L23
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r2 = r3._languageButtons
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.LanguageButton r2 = (org.fortheloss.sticknodes.LanguageButton) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L11
        L21:
            r3._languageButtons = r0
        L23:
            r3._englishButton = r0
            r3._spanishButton = r0
            r3._filipinoButton = r0
            r3._frenchButton = r0
            r3._japaneseButton = r0
            r3._portugueseButton = r0
            r3._russianButton = r0
            r3._turkishButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r3._doneButton
            if (r1 == 0) goto L41
            r1.clear()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r3._doneButton
            r1.remove()
            r3._doneButton = r0
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r3._skin
            if (r1 == 0) goto L4a
            r1.dispose()
            r3._skin = r0
        L4a:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r3._languageGroup
            if (r1 == 0) goto L58
            r1.clear()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r3._languageGroup
            r1.remove()
            r3._languageGroup = r0
        L58:
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void draw() {
            r13 = this;
            int r0 = r13._screenState
            if (r0 != 0) goto L7f
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r13._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r0 = r0.getBatch()
            com.badlogic.gdx.graphics.g2d.SpriteBatch r0 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r0
            r0.begin()
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r7, r7, r7, r7)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r13._stageRef
            float r8 = r1.getWidth()
            r9 = 0
            r10 = 0
        L1c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L43
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r13._stageRef
            float r11 = r1.getHeight()
            r12 = 0
        L27:
            int r1 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r1 >= 0) goto L3e
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r13._backgroundTile
            int r1 = r13._backgroundTileWidth
            float r5 = (float) r1
            int r1 = r13._backgroundTileHeight
            float r6 = (float) r1
            r1 = r0
            r3 = r10
            r4 = r12
            r1.draw(r2, r3, r4, r5, r6)
            int r1 = r13._backgroundTileHeight
            float r1 = (float) r1
            float r12 = r12 + r1
            goto L27
        L3e:
            int r1 = r13._backgroundTileWidth
            float r1 = (float) r1
            float r10 = r10 + r1
            goto L1c
        L43:
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r13._dfShaderRef
            r0.setShader(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r13._languageLabel
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r13._dfShaderRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r13._languageLabel
            float r3 = r3.getFontScaleX()
            java.lang.String r4 = "u_scale"
            r2.setUniformf(r4, r3)
            r0.setColor(r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r13._dfShaderRef
            java.lang.String r2 = "u_textAlpha"
            r1.setUniformf(r2, r7)
            r0.flush()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r13._languageLabel
            r1.draw(r0, r7)
            r0.flush()
            r1 = 0
            r0.setShader(r1)
            r0.end()
            r0.setColor(r7, r7, r7, r7)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r13._stageRef
            r0.draw()
        L7f:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadAssets() {
            r6 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r0 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            super.loadAssets()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "LanguageSelectScreen.loadAssets()"
            r1.setCrashlyticsKeyString(r2, r3)
            org.fortheloss.framework.Assets r1 = r6._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.languageScreenAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            r1.load(r2, r3, r4)
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r1 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter
            r1.<init>()
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r1.minFilter = r2
            r1.magFilter = r2
            org.fortheloss.framework.Assets r3 = r6._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r3.load(r5, r0, r1, r4)
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r1 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter
            r1.<init>()
            r1.minFilter = r2
            r1.magFilter = r2
            org.fortheloss.framework.Assets r2 = r6._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntTextfieldBoxDefaultDF
            r2.load(r3, r0, r1, r4)
            org.fortheloss.framework.Assets r0 = r6._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r3 = 0
            r0.load(r1, r2, r3)
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadingComplete() {
            r14 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r0 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            super.loadingComplete()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "LanguageSelectScreen.loadingComplete()"
            r1.setCrashlyticsKeyString(r2, r3)
            org.fortheloss.framework.Assets r1 = r14._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r3 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r4 = 0
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r1
            r14._dfShaderRef = r1
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r14._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            int r1 = r1.getScreenWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r14._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            float r2 = r2.getWorldWidth()
            float r1 = r1 / r2
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14._dfShaderRef
            r3 = 1082130432(0x40800000, float:4.0)
            if (r2 == 0) goto L4e
            r2.bind()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14._dfShaderRef
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            java.lang.String r5 = "u_spread"
            r2.setUniformf(r5, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r14._dfShaderRef
            java.lang.String r4 = "u_viewportScale"
            r2.setUniformf(r4, r1)
        L4e:
            org.fortheloss.framework.Assets r1 = r14._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.languageScreenAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5 = 1
            java.lang.Object r1 = r1.get(r2, r4, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r1.findRegion(r2)
            r14._backgroundTile = r2
            int r2 = r2.getRegionWidth()
            r14._backgroundTileWidth = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r14._backgroundTile
            int r2 = r2.getRegionHeight()
            r14._backgroundTileHeight = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r4 = r14._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntTextfieldBoxDefaultDF
            java.lang.Object r4 = r4.get(r6, r0, r5)
            com.badlogic.gdx.graphics.g2d.BitmapFont r4 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r4
            com.badlogic.gdx.graphics.Color r6 = com.badlogic.gdx.graphics.Color.WHITE
            r2.<init>(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "???"
            r4.<init>(r6, r2)
            r14._languageLabel = r4
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r14._languageLabel
            r4.setFontScale(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r14._languageLabel
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r3.setColor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r14._languageLabel
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r14._stageRef
            float r4 = r4.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r14._languageLabel
            float r6 = r6.getWidth()
            float r4 = r4 - r6
            r13 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r13
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r14._stageRef
            float r6 = r6.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r14._languageLabel
            float r7 = r7.getHeight()
            float r6 = r6 - r7
            r7 = 1128792064(0x43480000, float:200.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            float r6 = r6 - r8
            r3.setPosition(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r3.<init>()
            r14._languageGroup = r3
            r4 = 1109393408(0x42200000, float:40.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            r3.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r14._languageGroup
            r3.bottom()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r14._languageGroup
            r3.rowBottom()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            r3.<init>(r4)
            r14._languageButtons = r3
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._englishButton = r6
            java.lang.String r3 = "english"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r3)
            java.lang.String r3 = "shadow"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 0
            r12 = 1
            r9 = r2
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._englishButton
            org.fortheloss.sticknodes.LanguageSelectScreen$1 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$1
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._englishButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._englishButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._spanishButton = r6
            java.lang.String r4 = "spanish"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 1
            r12 = 0
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._spanishButton
            org.fortheloss.sticknodes.LanguageSelectScreen$2 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$2
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._spanishButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._spanishButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._filipinoButton = r6
            java.lang.String r4 = "filipino"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 5
            r12 = 1
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._filipinoButton
            org.fortheloss.sticknodes.LanguageSelectScreen$3 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$3
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._filipinoButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._filipinoButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._frenchButton = r6
            java.lang.String r4 = "french"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 2
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._frenchButton
            org.fortheloss.sticknodes.LanguageSelectScreen$4 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$4
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._frenchButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._frenchButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._japaneseButton = r6
            java.lang.String r4 = "japanese"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 6
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._japaneseButton
            org.fortheloss.sticknodes.LanguageSelectScreen$5 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$5
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._japaneseButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._japaneseButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._portugueseButton = r6
            java.lang.String r4 = "portuguese"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 3
            r12 = 0
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._portugueseButton
            org.fortheloss.sticknodes.LanguageSelectScreen$6 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$6
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._portugueseButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._portugueseButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._russianButton = r6
            java.lang.String r4 = "russian"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 7
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r4 = r14._russianButton
            org.fortheloss.sticknodes.LanguageSelectScreen$7 r6 = new org.fortheloss.sticknodes.LanguageSelectScreen$7
            r6.<init>(r14)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r6 = r14._russianButton
            r4.addActor(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r4 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r6 = r14._russianButton
            r4.add(r6)
            org.fortheloss.sticknodes.LanguageButton r6 = new org.fortheloss.sticknodes.LanguageButton
            r6.<init>()
            r14._turkishButton = r6
            java.lang.String r4 = "turkish"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r14._dfShaderRef
            r11 = 4
            r12 = 1
            r6.initialize(r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.LanguageButton r2 = r14._turkishButton
            org.fortheloss.sticknodes.LanguageSelectScreen$8 r3 = new org.fortheloss.sticknodes.LanguageSelectScreen$8
            r3.<init>(r14)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r14._languageGroup
            org.fortheloss.sticknodes.LanguageButton r3 = r14._turkishButton
            r2.addActor(r3)
            java.util.ArrayList<org.fortheloss.sticknodes.LanguageButton> r2 = r14._languageButtons
            org.fortheloss.sticknodes.LanguageButton r3 = r14._turkishButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r14._languageGroup
            r2.pack()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r14._languageGroup
            r3 = 1060320051(0x3f333333, float:0.7)
            r2.setScale(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r14._languageGroup
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r14._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r4 = r14._languageGroup
            float r4 = r4.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = r14._languageGroup
            float r6 = r6.getScaleX()
            float r4 = r4 * r6
            float r3 = r3 - r4
            float r3 = r3 * r13
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r14._stageRef
            float r4 = r4.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = r14._languageGroup
            float r6 = r6.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r7 = r14._languageGroup
            float r7 = r7.getScaleY()
            float r6 = r6 * r7
            float r4 = r4 - r6
            float r4 = r4 * r13
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            float r4 = r4 + r6
            r2.setPosition(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r14._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r14._languageGroup
            r2.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = new com.badlogic.gdx.scenes.scene2d.ui.Skin
            r2.<init>()
            r14._skin = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "button_large_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r1.findRegion(r4)
            r3.<init>(r4)
            java.lang.String r4 = "largeButtonUp"
            r2.add(r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r14._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r6 = "button_large_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r6)
            r3.<init>(r1)
            java.lang.String r1 = "largeButtonDown"
            r2.add(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Skin r3 = r14._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.getDrawable(r4)
            r2.up = r3
            com.badlogic.gdx.scenes.scene2d.ui.Skin r3 = r14._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r3.getDrawable(r1)
            r2.down = r1
            r1 = -1056964608(0xffffffffc1000000, float:-8.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            r2.pressedOffsetY = r3
            org.fortheloss.framework.Assets r1 = r14._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r0 = r1.get(r3, r0, r5)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            r2.font = r0
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            r2.fontColor = r0
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_RED
            r2.downFontColor = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r1 = "English"
            r0.<init>(r1, r2)
            r14._doneButton = r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L329
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.setFontScale(r1)
        L329:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r14._doneButton
            org.fortheloss.sticknodes.LanguageSelectScreen$9 r1 = new org.fortheloss.sticknodes.LanguageSelectScreen$9
            r1.<init>(r14)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r14._doneButton
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r14._stageRef
            float r1 = r1.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r14._doneButton
            float r2 = r2.getWidth()
            float r1 = r1 - r2
            float r1 = r1 * r13
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r7
            r0.setPosition(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r14._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r14._doneButton
            r0.addActor(r1)
            org.fortheloss.sticknodes.LanguageButton r0 = r14._englishButton
            r14.setSelectedLanguage(r0)
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void resume() {
            r4 = this;
            super.resume()
            int r0 = r4._screenState
            r1 = 1
            if (r0 != r1) goto L9
            return
        L9:
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r3 = 0
            java.lang.Object r0 = r0.get(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r4._dfShaderRef = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r4._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            int r0 = r0.getScreenWidth()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r4._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            float r1 = r1.getWorldWidth()
            float r0 = r0 / r1
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r4._dfShaderRef
            if (r1 == 0) goto L49
            r1.bind()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r4._dfShaderRef
            r2 = 1082130432(0x40800000, float:4.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            java.lang.String r2 = "u_spread"
            r1.setUniformf(r2, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r4._dfShaderRef
            java.lang.String r2 = "u_viewportScale"
            r1.setUniformf(r2, r0)
        L49:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void unloadAssets() {
            r3 = this;
            super.unloadAssets()
            org.fortheloss.framework.Assets r0 = r3._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.languageScreenAtlas
            r2 = 1
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r3._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r3._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntTextfieldBoxDefaultDF
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r3._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            r2 = 0
            r0.unload(r1, r2)
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void update(float r4) {
            r3 = this;
            super.update(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3._stageRef
            if (r0 == 0) goto La
            r0.act(r4)
        La:
            int r4 = r3._screenState
            if (r4 != 0) goto L36
            boolean r4 = r3._flagChangeScreen
            if (r4 == 0) goto L36
            r4 = 0
            r3._flagChangeScreen = r4
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            int r0 = r3._selectedLanguageID
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r1 = "language_fix"
            java.lang.String r2 = "(language select screen)"
            r4.analyticsSendValue(r1, r2, r0)
            int r4 = r3._selectedLanguageID
            org.fortheloss.sticknodes.App.setLanguage(r4)
            org.fortheloss.sticknodes.App r4 = r3._appRef
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023
            org.fortheloss.sticknodes.App r1 = r3._appRef
            r0.<init>(r1)
            r4.setScreen(r0)
        L36:
            return
    }
}
