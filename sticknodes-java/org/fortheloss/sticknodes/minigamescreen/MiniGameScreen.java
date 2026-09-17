package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class MiniGameScreen extends org.fortheloss.framework.AppScreen {
    private com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> _animMoney;
    private float _bestDistance;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud1TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud2TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud3TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud4TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud5TR;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _cloud6TR;
    private java.util.ArrayList<java.lang.Float> _cloudYPositions;
    private int _cloudYPositionsIter;
    private int _currentAttempt;
    private float _desaturationAndRed;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _distanceFieldShader;
    private float _distanceMeters;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _dustTR;
    private boolean _flagExit;
    private float _floorY;
    private org.fortheloss.framework.SimpleDirectionGestureDetector _gestureDetector;
    private org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture _grass;
    private org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture _grassBlades;
    private com.badlogic.gdx.scenes.scene2d.Group _groupBackground;
    private com.badlogic.gdx.scenes.scene2d.Group _groupCharacters;
    private com.badlogic.gdx.scenes.scene2d.Group _groupForeground;
    private com.badlogic.gdx.scenes.scene2d.Group _groupHUD;
    private com.badlogic.gdx.scenes.scene2d.Group _groupObjects;
    private com.badlogic.gdx.scenes.scene2d.Group _groupParticles;
    private com.badlogic.gdx.scenes.scene2d.Group _groupTransition;
    private com.badlogic.gdx.scenes.scene2d.Group[] _groups;
    private boolean _hasShownInstructions;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _hudLabelBottom;
    private com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle _hudLabelStyle;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _hudLabelTop;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _instructionsImage;
    private int _lastCloudAdded;
    private com.badlogic.gdx.scenes.scene2d.ui.Skin _mainMenuButtonSkin;
    private float _nextCloudToAddAtDistance;
    private int _numAttemptsOnStart;
    private java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> _obstacles;
    private int _obstaclesClearCount;
    private com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> _particlePool;
    private java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> _particles;
    private org.fortheloss.sticknodes.minigamescreen.Ralph _ralph;
    private org.fortheloss.sticknodes.minigamescreen.Sean _sean;
    private org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture _sky;
    private org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler _soundHandler;
    private float _speedMultiple;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _squareTR;
    private int _state;
    private com.badlogic.gdx.graphics.Color _tempColor;



















    private class CustomAnimationWidget extends org.fortheloss.framework.AnimationWidget {
        protected int lastIndexPlayedSound;
        public boolean playSound;
        final /* synthetic */ org.fortheloss.sticknodes.minigamescreen.MiniGameScreen this$0;

        public CustomAnimationWidget(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1, com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r1 = 0
                r0.playSound = r1
                r1 = -1
                r0.lastIndexPlayedSound = r1
                return
        }
    }

    private class ScaledShaderLabel extends com.badlogic.gdx.scenes.scene2d.ui.Label {
        final /* synthetic */ org.fortheloss.sticknodes.minigamescreen.MiniGameScreen this$0;

        public ScaledShaderLabel(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r1, java.lang.CharSequence r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Label, com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
        public void draw(com.badlogic.gdx.graphics.g2d.Batch r11, float r12) {
                r10 = this;
                float r0 = r10.getX()
                float r1 = r10.getY()
                float r2 = r10.getScaleX()
                com.badlogic.gdx.graphics.Color r3 = r10.getColor()
                float r4 = r3.r
                float r5 = r3.g
                float r6 = r3.b
                r10.setFontScale(r2)
                r11.flush()
                org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r7 = r10.this$0
                com.badlogic.gdx.graphics.glutils.ShaderProgram r7 = org.fortheloss.sticknodes.minigamescreen.MiniGameScreen.m1304$$Nest$fget_distanceFieldShader(r7)
                r11.setShader(r7)
                org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r7 = r10.this$0
                com.badlogic.gdx.graphics.glutils.ShaderProgram r7 = org.fortheloss.sticknodes.minigamescreen.MiniGameScreen.m1304$$Nest$fget_distanceFieldShader(r7)
                java.lang.String r8 = "u_scale"
                r7.setUniformf(r8, r2)
                org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r7 = r10.this$0
                com.badlogic.gdx.graphics.glutils.ShaderProgram r7 = org.fortheloss.sticknodes.minigamescreen.MiniGameScreen.m1304$$Nest$fget_distanceFieldShader(r7)
                float r8 = r3.a
                java.lang.String r9 = "u_textAlpha"
                r7.setUniformf(r9, r8)
                r7 = 0
                r8 = 1065353216(0x3f800000, float:1.0)
                r10.setColor(r7, r7, r7, r8)
                r7 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 * r7
                float r7 = org.fortheloss.sticknodes.App.assetScaling
                float r9 = r2 * r7
                float r9 = r9 + r0
                float r2 = r2 * r7
                float r2 = r1 - r2
                r10.setPosition(r9, r2)
                super.draw(r11, r12)
                float r2 = r3.a
                r10.setColor(r4, r5, r6, r2)
                r10.setPosition(r0, r1)
                super.draw(r11, r12)
                r11.flush()
                r12 = 0
                r11.setShader(r12)
                r10.setFontScale(r8)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Label, com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
        public float getPrefHeight() {
                r2 = this;
                float r0 = super.getPrefHeight()
                float r1 = r2.getScaleY()
                float r0 = r0 * r1
                return r0
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Label, com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
        public float getPrefWidth() {
                r2 = this;
                float r0 = super.getPrefWidth()
                float r1 = r2.getScaleX()
                float r0 = r0 * r1
                return r0
        }
    }

    /* renamed from: -$$Nest$fget_distanceFieldShader, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.glutils.ShaderProgram m1304$$Nest$fget_distanceFieldShader(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r0._distanceFieldShader
            return r0
    }

    /* renamed from: -$$Nest$fget_dustTR, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.TextureRegion m1305$$Nest$fget_dustTR(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0._dustTR
            return r0
    }

    /* renamed from: -$$Nest$fget_groupCharacters, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group m1306$$Nest$fget_groupCharacters(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0._groupCharacters
            return r0
    }

    /* renamed from: -$$Nest$fget_groupForeground, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group m1307$$Nest$fget_groupForeground(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0._groupForeground
            return r0
    }

    /* renamed from: -$$Nest$fget_groupTransition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group m1308$$Nest$fget_groupTransition(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0._groupTransition
            return r0
    }

    /* renamed from: -$$Nest$fget_instructionsImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m1309$$Nest$fget_instructionsImage(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._instructionsImage
            return r0
    }

    /* renamed from: -$$Nest$fget_ralph, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.minigamescreen.Ralph m1310$$Nest$fget_ralph(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            org.fortheloss.sticknodes.minigamescreen.Ralph r0 = r0._ralph
            return r0
    }

    /* renamed from: -$$Nest$fget_soundHandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler m1311$$Nest$fget_soundHandler(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r0._soundHandler
            return r0
    }

    /* renamed from: -$$Nest$fget_squareTR, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.g2d.TextureRegion m1312$$Nest$fget_squareTR(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0._squareTR
            return r0
    }

    /* renamed from: -$$Nest$fget_state, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1313$$Nest$fget_state(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            int r0 = r0._state
            return r0
    }

    /* renamed from: -$$Nest$fput_flagExit, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1314$$Nest$fput_flagExit(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0, boolean r1) {
            r0._flagExit = r1
            return
    }

    /* renamed from: -$$Nest$fput_instructionsImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1315$$Nest$fput_instructionsImage(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0, com.badlogic.gdx.scenes.scene2d.ui.Image r1) {
            r0._instructionsImage = r1
            return
    }

    /* renamed from: -$$Nest$mgotoCutscene, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1316$$Nest$mgotoCutscene(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.gotoCutscene()
            return
    }

    /* renamed from: -$$Nest$mgotoGamePlay, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1317$$Nest$mgotoGamePlay(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.gotoGamePlay()
            return
    }

    /* renamed from: -$$Nest$mgotoMainMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1318$$Nest$mgotoMainMenu(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.gotoMainMenu()
            return
    }

    /* renamed from: -$$Nest$monBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1319$$Nest$monBackClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.onBackClick()
            return
    }

    /* renamed from: -$$Nest$monGameOverBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1320$$Nest$monGameOverBackClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.onGameOverBackClick()
            return
    }

    /* renamed from: -$$Nest$monGameOverPlayClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1321$$Nest$monGameOverPlayClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.onGameOverPlayClick()
            return
    }

    /* renamed from: -$$Nest$monGameOverScoresClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1322$$Nest$monGameOverScoresClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0, boolean r1) {
            r0.onGameOverScoresClick(r1)
            return
    }

    /* renamed from: -$$Nest$monMusicClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1323$$Nest$monMusicClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0, boolean r1) {
            r0.onMusicClick(r1)
            return
    }

    /* renamed from: -$$Nest$monPlayClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1324$$Nest$monPlayClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            r0.onPlayClick()
            return
    }

    /* renamed from: -$$Nest$monSoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1325$$Nest$monSoundClick(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0, boolean r1) {
            r0.onSoundClick(r1)
            return
    }

    public MiniGameScreen(org.fortheloss.sticknodes.App r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2._state = r3
            r2._hasShownInstructions = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2._speedMultiple = r0
            r0 = 0
            r2._floorY = r0
            r1 = 1
            r2._lastCloudAdded = r1
            r2._cloudYPositionsIter = r3
            r2._distanceMeters = r0
            r2._bestDistance = r0
            r2._currentAttempt = r3
            r2._numAttemptsOnStart = r3
            r2._flagExit = r3
            r2._desaturationAndRed = r0
            r2._nextCloudToAddAtDistance = r0
            r2._obstaclesClearCount = r3
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = "current_screen"
            java.lang.String r1 = "minigame"
            r3.setCrashlyticsKeyString(r0, r1)
            return
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$000(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$100(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$200(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$300(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$400(org.fortheloss.sticknodes.minigamescreen.MiniGameScreen r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    private void buildBackground() {
            r7 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7._particles = r1
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r1 = new org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.minigameAtlas4
            r4 = 1
            java.lang.Object r2 = r2.get(r3, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r3 = "tile_sky"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r7._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r7._stageRef
            float r5 = r5.getHeight()
            r1.<init>(r2, r3, r5)
            r7._sky = r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r7._stageRef
            float r2 = r2.getHeight()
            r3 = 0
            r1.setPosition(r3, r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r7._groupBackground
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r2 = r7._sky
            r1.addActor(r2)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r1 = new org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r2 = r2.get(r5, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r5 = "tile_floor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r5)
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r7._stageRef
            float r5 = r5.getWidth()
            float r6 = r7._floorY
            r1.<init>(r2, r5, r6)
            r7._grass = r1
            float r2 = r7._floorY
            r1.setPosition(r3, r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r7._groupForeground
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r2 = r7._grass
            r1.addActor(r2)
            org.fortheloss.framework.Assets r1 = r7._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r0 = r1.get(r2, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            java.lang.String r1 = "tile_grass_blades"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r0.findRegion(r1)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r1 = new org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r7._stageRef
            float r2 = r2.getWidth()
            float r4 = r7._floorY
            int r5 = r0.getRegionHeight()
            float r5 = (float) r5
            float r4 = r4 + r5
            r1.<init>(r0, r2, r4)
            r7._grassBlades = r1
            float r2 = r7._floorY
            int r0 = r0.getRegionHeight()
            float r0 = (float) r0
            float r2 = r2 + r0
            r1.setPosition(r3, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7._groupForeground
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r1 = r7._grassBlades
            r0.addActor(r1)
            r7.fillWithClouds()
            return
    }

    private void clearLayers() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Group[] r0 = r3._groups
            int r0 = r0.length
            int r0 = r0 + (-1)
        L5:
            if (r0 < 0) goto L15
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r3._groups
            r1 = r1[r0]
            com.badlogic.gdx.scenes.scene2d.Group r2 = r3._groupTransition
            if (r1 == r2) goto L12
            r1.clear()
        L12:
            int r0 = r0 + (-1)
            goto L5
        L15:
            r3.disposeObjects()
            return
    }

    private void createVolumeButtons() {
            r9 = this;
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = new com.badlogic.gdx.graphics.g2d.BitmapFont
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r9._mainMenuButtonSkin
            java.lang.String r3 = "btn_sound_off"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r3 = r9._mainMenuButtonSkin
            java.lang.String r4 = "btn_sound_on"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.getDrawable(r4)
            com.badlogic.gdx.graphics.Color r4 = com.badlogic.gdx.graphics.Color.BLACK
            r1.<init>(r2, r3, r0, r4)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1054867456(0xffffffffc1200000, float:-10.0)
            float r2 = r2 * r3
            r1.pressedOffsetY = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r5 = ""
            r2.<init>(r5, r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r9._soundHandler
            boolean r1 = r1.isSoundOn()
            r2.setChecked(r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$11 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$11
            r1.<init>(r9, r2)
            r2.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r9._groupHUD
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = r9._mainMenuButtonSkin
            java.lang.String r7 = "btn_music_off"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r7 = r9._mainMenuButtonSkin
            java.lang.String r8 = "btn_music_on"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r7 = r7.getDrawable(r8)
            r1.<init>(r6, r7, r0, r4)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            r1.pressedOffsetY = r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            r0.<init>(r5, r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r9._soundHandler
            boolean r1 = r1.isMusicOn()
            r0.setChecked(r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$12 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$12
            r1.<init>(r9, r0)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r9._groupHUD
            r1.addActor(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1109393408(0x42200000, float:40.0)
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r9._stageRef
            float r3 = r3.getWidth()
            float r3 = r3 - r1
            float r4 = r0.getWidth()
            float r3 = r3 - r4
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r9._stageRef
            float r4 = r4.getHeight()
            float r4 = r4 - r1
            float r5 = r0.getHeight()
            float r4 = r4 - r5
            r0.setPosition(r3, r4)
            float r3 = r0.getX()
            float r3 = r3 - r1
            float r1 = r2.getWidth()
            float r3 = r3 - r1
            float r0 = r0.getY()
            r2.setPosition(r3, r0)
            return
    }

    private void disposeObjects() {
            r3 = this;
            org.fortheloss.sticknodes.minigamescreen.Ralph r0 = r3._ralph
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r3._ralph = r1
        La:
            org.fortheloss.sticknodes.minigamescreen.Sean r0 = r3._sean
            if (r0 == 0) goto L13
            r0.dispose()
            r3._sean = r1
        L13:
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r0 = r3._grass
            if (r0 == 0) goto L1c
            r0.dispose()
            r3._grass = r1
        L1c:
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r0 = r3._grassBlades
            if (r0 == 0) goto L25
            r0.dispose()
            r3._grassBlades = r1
        L25:
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r0 = r3._sky
            if (r0 == 0) goto L2e
            r0.dispose()
            r3._sky = r1
        L2e:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r0 = r3._particles
            if (r0 == 0) goto L4a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L38:
            if (r0 < 0) goto L48
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r2 = r3._particles
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r2 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r2
            r2.reset()
            int r0 = r0 + (-1)
            goto L38
        L48:
            r3._particles = r1
        L4a:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r0 = r3._obstacles
            if (r0 == 0) goto L66
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L54:
            if (r0 < 0) goto L64
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r2 = r3._obstacles
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle r2 = (org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L54
        L64:
            r3._obstacles = r1
        L66:
            r3._hudLabelTop = r1
            r3._hudLabelBottom = r1
            return
    }

    private void fillWithClouds() {
            r5 = this;
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1142292480(0x44160000, float:600.0)
            float r1 = r1 * r0
            float r2 = r5._speedMultiple
            float r1 = r1 * r2
            r2 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r2
            r2 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = r0 * r2
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r5._stageRef
            float r2 = r2.getWidth()
            r3 = 1041865114(0x3e19999a, float:0.15)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5._stageRef
            float r3 = r3.getWidth()
        L23:
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L2c
            r5.generateCloud(r1, r0)
            float r0 = r0 + r2
            goto L23
        L2c:
            return
    }

    private void generateCloud(float r1, float r2) {
            r0 = this;
            r0.generateClouds(r1, r2)
            return
    }

    private void generateClouds(float r15, float r16) {
            r14 = this;
            r8 = r14
            float r0 = r8._desaturationAndRed
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r2 = r8._cloudYPositionsIter
            java.util.ArrayList<java.lang.Float> r3 = r8._cloudYPositions
            int r3 = r3.size()
            if (r2 < r3) goto L1c
            r2 = 0
            r8._cloudYPositionsIter = r2
            java.util.ArrayList<java.lang.Float> r2 = r8._cloudYPositions
            java.util.Collections.shuffle(r2)
        L1c:
            r2 = 1124073472(0x43000000, float:128.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            float r2 = r8._floorY
            float r2 = r2 + r3
            java.util.ArrayList<java.lang.Float> r4 = r8._cloudYPositions
            int r5 = r8._cloudYPositionsIter
            int r6 = r5 + 1
            r8._cloudYPositionsIter = r6
            java.lang.Object r4 = r4.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r8._stageRef
            float r5 = r5.getHeight()
            float r6 = r8._floorY
            float r5 = r5 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            float r5 = r5 - r3
            float r4 = r4 * r5
            float r3 = r2 + r4
            r2 = 1058642330(0x3f19999a, float:0.6)
            double r4 = java.lang.Math.random()
            float r4 = (float) r4
            r5 = 1053609165(0x3ecccccd, float:0.4)
            float r4 = r4 * r5
            float r4 = r4 + r2
            double r5 = java.lang.Math.random()
            float r2 = (float) r5
            r5 = 1048576000(0x3e800000, float:0.25)
            float r2 = r2 * r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r6
            float r7 = r1 - r2
            float r7 = r7 * r6
            float r6 = r8._desaturationAndRed
            float r7 = r7 * r6
            float r2 = r2 + r7
            int r7 = r8._lastCloudAdded
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 7
            if (r7 != r13) goto L77
            r9 = 2
            goto L87
        L77:
            if (r7 != r12) goto L7b
            r9 = 3
            goto L87
        L7b:
            if (r7 != r11) goto L7f
            r9 = 4
            goto L87
        L7f:
            if (r7 != r10) goto L82
            goto L87
        L82:
            if (r7 != r9) goto L86
            r9 = 6
            goto L87
        L86:
            r9 = 7
        L87:
            float r1 = r1 - r6
            r6 = 1061158912(0x3f400000, float:0.75)
            float r6 = r6 * r1
            float r6 = r6 + r5
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r7
            float r1 = r1 + r5
            com.badlogic.gdx.graphics.Color r5 = r8._tempColor
            r5.set(r6, r1, r1, r2)
            com.badlogic.gdx.graphics.Color r1 = r8._tempColor
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r1)
            float r1 = r15 * r4
            float r1 = -r1
            float r4 = r1 * r0
            r5 = 0
            r7 = 0
            r0 = r14
            r1 = r9
            r2 = r16
            r0.addParticle(r1, r2, r3, r4, r5, r6, r7)
            r8._lastCloudAdded = r9
            return
    }

    private void gotoCutscene() {
            r18 = this;
            r7 = r18
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r1 = 1
            r7._state = r1
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r7._speedMultiple = r2
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1134559232(0x43a00000, float:320.0)
            float r3 = r3 * r4
            r7._floorY = r3
            r18.clearLayers()
            r18.buildBackground()
            r18.createVolumeButtons()
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r3 = r7._soundHandler
            r3.setMusicVolume(r2)
            r3 = 0
            r7._speedMultiple = r3
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r7._squareTR
            r4.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r7._stageRef
            float r5 = r5.getWidth()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 * r8
            float r5 = r5 + r6
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r7._stageRef
            float r6 = r6.getHeight()
            r9 = 1041865114(0x3e19999a, float:0.15)
            float r6 = r6 * r9
            r4.setSize(r5, r6)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r5 = r5 * r6
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r7._stageRef
            float r9 = r9.getHeight()
            float r10 = r4.getHeight()
            float r9 = r9 - r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1084227584(0x40a00000, float:5.0)
            float r10 = r10 * r11
            float r9 = r9 + r10
            r4.setPosition(r5, r9)
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r3, r3, r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureRegion r10 = r7._squareTR
            r9.<init>(r10)
            float r10 = r4.getWidth()
            float r11 = r4.getHeight()
            r9.setSize(r10, r11)
            float r10 = r4.getX()
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r6
            r9.setPosition(r10, r11)
            r9.setColor(r3, r3, r3, r5)
            com.badlogic.gdx.scenes.scene2d.Group r6 = r7._groupForeground
            r6.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r7._groupForeground
            r4.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r4 = r7._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.minigameAtlas2
            java.lang.Object r4 = r4.get(r9, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r9 = "ralph_stand"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r4.findRegion(r9)
            r6.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r4 = r7._assetsRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.minigameAtlas2
            java.lang.Object r4 = r4.get(r10, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r10 = "ralph_fall"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r4.findRegion(r10)
            r9.<init>(r4)
            float r4 = r6.getWidth()
            r10 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r10
            r6.setOrigin(r4, r3)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.setScale(r4, r5)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r12 = 1151336448(0x44a00000, float:1280.0)
            float r12 = r12 * r11
            float r13 = r7._floorY
            r14 = 1106247680(0x41f00000, float:30.0)
            float r11 = r11 * r14
            float r13 = r13 - r11
            r6.setPosition(r12, r13)
            float r11 = r9.getWidth()
            float r11 = r11 * r10
            float r12 = r9.getHeight()
            float r12 = r12 * r10
            r9.setOrigin(r11, r12)
            r11 = 1176255488(0x461c3c00, float:9999.0)
            r9.setPosition(r11, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r13 = r7._assetsRef
            java.lang.String r15 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r13 = r13.get(r15, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r13 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r13
            java.lang.String r15 = "money"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r13.findRegion(r15)
            r12.<init>(r13)
            float r13 = r6.getX()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1133903872(0x43960000, float:300.0)
            float r15 = r15 * r16
            float r13 = r13 + r15
            float r15 = r7._floorY
            r12.setPosition(r13, r15)
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r15 = r7._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r5 = r15.get(r5, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r5
            java.lang.String r15 = "sean_no_money"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r5.findRegion(r15)
            r13.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r15 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r4 = r15.get(r4, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r15 = "sean_with_money"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r4.findRegion(r15)
            r5.<init>(r4)
            float r4 = r12.getX()
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r17 = 1112014848(0x42480000, float:50.0)
            float r15 = r15 * r17
            float r4 = r4 - r15
            com.badlogic.gdx.scenes.scene2d.Stage r15 = r7._stageRef
            float r15 = r15.getHeight()
            r13.setPosition(r4, r15)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1121452032(0x42d80000, float:108.0)
            float r15 = r15 * r4
            float r4 = r4 * r8
            r5.setOrigin(r15, r4)
            r5.setPosition(r11, r11)
            com.badlogic.gdx.graphics.g2d.Animation r4 = new com.badlogic.gdx.graphics.g2d.Animation
            org.fortheloss.framework.Assets r11 = r7._assetsRef
            java.lang.String r15 = org.fortheloss.sticknodes.App.minigameAtlas1
            java.lang.Object r0 = r11.get(r15, r0, r1)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            java.lang.String r11 = "ralph_run"
            com.badlogic.gdx.utils.Array r0 = r0.findRegions(r11)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r11 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r4.<init>(r2, r0, r11)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$3 r0 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$3
            r0.<init>(r7, r4)
            java.lang.Object r2 = r4.getKeyFrame(r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r2
            int r4 = r2.getRegionWidth()
            float r4 = (float) r4
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            r0.setSize(r4, r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = -1013579776(0xffffffffc3960000, float:-300.0)
            float r4 = r4 * r2
            float r11 = r7._floorY
            float r2 = r2 * r14
            float r11 = r11 - r2
            r0.setPosition(r4, r11)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r12)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r7._groupCharacters
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r8)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$4 r4 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$4
            r4.<init>(r7, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r11 = r7._stageRef
            float r11 = r11.getWidth()
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r8
            float r11 = r11 + r14
            float r8 = r0.getY()
            com.badlogic.gdx.math.Interpolation r14 = com.badlogic.gdx.math.Interpolation.linear
            r15 = 1078984704(0x40500000, float:3.25)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r11, r8, r15, r14)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$5 r11 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$5
            r11.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r4, r8, r11)
            r0.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r10)
            com.badlogic.gdx.math.Interpolation$SwingIn r2 = com.badlogic.gdx.math.Interpolation.swingIn
            r4 = 1064514355(0x3f733333, float:0.95)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r4, r8, r2)
            com.badlogic.gdx.math.Interpolation$SwingOut r11 = com.badlogic.gdx.math.Interpolation.swingOut
            r14 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r14, r8, r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r4, r8)
            r4 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r4, r0)
            r6.addAction(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 * r8
            com.badlogic.gdx.math.Interpolation r8 = com.badlogic.gdx.math.Interpolation.sine
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r3, r0, r14, r8)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r10 = r10 * r11
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r3, r10, r14, r8)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r3)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r4, r0)
            r13.addAction(r0)
            r0 = 6
            com.badlogic.gdx.scenes.scene2d.Action[] r8 = new com.badlogic.gdx.scenes.scene2d.Action[r0]
            r0 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r0)
            r4 = 0
            r8[r4] = r3
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$6 r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$6
            r3.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r3)
            r8[r1] = r3
            float r1 = r13.getX()
            float r3 = r12.getY()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 * r10
            float r3 = r3 + r4
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r1, r3, r0, r4)
            r1 = 2
            r8[r1] = r0
            r0 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r0)
            r1 = 3
            r8[r1] = r0
            float r0 = r13.getX()
            float r1 = r12.getY()
            r3 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r0, r1, r3, r2)
            r1 = 4
            r8[r1] = r0
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$7 r11 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$7
            r0 = r11
            r1 = r18
            r2 = r12
            r3 = r5
            r4 = r13
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r11)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r10, r0)
            r1 = 5
            r8[r1] = r0
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8)
            r13.addAction(r0)
            return
    }

    private void gotoGameOver() {
            r19 = this;
            r0 = r19
            r1 = 3
            r0._state = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0._speedMultiple = r1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1128267776(0x43400000, float:192.0)
            float r2 = r2 * r3
            r0._floorY = r2
            r2 = 0
            r0._desaturationAndRed = r2
            r0._nextCloudToAddAtDistance = r2
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._sky
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r4, r4, r4, r4)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grass
            r3.setColor(r4, r4, r4, r4)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grassBlades
            r3.setColor(r4, r4, r4, r4)
            float r3 = r0._distanceMeters
            float r5 = r0._bestDistance
            r7 = 1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L46
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            java.lang.String r5 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r3 = r3.getPreferences(r5)
            float r5 = r0._distanceMeters
            r0._bestDistance = r5
            java.lang.String r8 = "minigameHighScore"
            r3.putFloat(r8, r5)
            r3.flush()
            r3 = 1
            goto L47
        L46:
            r3 = 0
        L47:
            org.fortheloss.sticknodes.minigamescreen.Sean r5 = r0._sean
            r5.setState(r7)
            com.badlogic.gdx.scenes.scene2d.Group r5 = r0._groupCharacters
            org.fortheloss.sticknodes.minigamescreen.Ralph r8 = r0._ralph
            r5.removeActor(r8)
            com.badlogic.gdx.scenes.scene2d.Group r5 = r0._groupForeground
            org.fortheloss.sticknodes.minigamescreen.Ralph r8 = r0._ralph
            r5.addActor(r8)
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r5 = r0._obstacles
            int r5 = r5.size()
            int r5 = r5 - r7
        L61:
            r8 = 2
            if (r5 < 0) goto L7d
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r9 = r0._obstacles
            java.lang.Object r9 = r9.get(r5)
            org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle r9 = (org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle) r9
            int r10 = r9.getState()
            if (r10 == r8) goto L7a
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r8 = r0._obstacles
            r8.remove(r5)
            r9.dispose()
        L7a:
            int r5 = r5 + (-1)
            goto L61
        L7d:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r5 = r0._particles
            int r5 = r5.size()
            int r5 = r5 - r7
        L84:
            if (r5 < 0) goto L96
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r9 = r0._particles
            java.lang.Object r9 = r9.remove(r5)
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r9 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r9
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r10 = r0._particlePool
            r10.free(r9)
            int r5 = r5 + (-1)
            goto L84
        L96:
            r19.fillWithClouds()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureRegion r9 = r0._squareTR
            r5.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            float r9 = r9.getWidth()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 * r11
            float r9 = r9 + r10
            com.badlogic.gdx.scenes.scene2d.Stage r10 = r0._stageRef
            float r10 = r10.getHeight()
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r11
            float r10 = r10 + r12
            r5.setSize(r9, r10)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r12 = r9 * r10
            float r9 = r9 * r10
            r5.setPosition(r12, r9)
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.sineIn
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r1, r9)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r12)
            r5.addAction(r9)
            com.badlogic.gdx.scenes.scene2d.Group r9 = r0._groupForeground
            r9.addActor(r5)
            org.fortheloss.sticknodes.minigamescreen.Ralph r5 = r0._ralph
            int r5 = r5.getState()
            r9 = 6
            r8 = 1050253722(0x3e99999a, float:0.3)
            r7 = 1077936128(0x40400000, float:3.0)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r5 != r9) goto L26b
            org.fortheloss.sticknodes.minigamescreen.Ralph r5 = r0._ralph
            float r5 = r5.getX()
            r9 = 1125515264(0x43160000, float:150.0)
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r16 = r16 * r9
            float r5 = r5 + r16
            org.fortheloss.sticknodes.minigamescreen.Ralph r9 = r0._ralph
            float r9 = r9.getY()
            r16 = 1124073472(0x43000000, float:128.0)
            float r17 = org.fortheloss.sticknodes.App.assetScaling
            float r17 = r17 * r16
            float r9 = r9 + r17
            r11 = 1086324736(0x40c00000, float:6.0)
            r12 = 1082130432(0x40800000, float:4.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r11, r12)
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r12, r4)
            r10 = 1094713344(0x41400000, float:12.0)
            r15 = 1090519040(0x41000000, float:8.0)
            com.badlogic.gdx.math.Interpolation$ExpOut r14 = com.badlogic.gdx.math.Interpolation.exp10Out
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r15, r12, r14)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r12)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r1)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r11, r13, r10, r1)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r10 = r0._particlePool
            java.lang.Object r10 = r10.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r10 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r10
            com.badlogic.gdx.graphics.g2d.TextureRegion r11 = r0._dustTR
            r10.initialize(r11, r2, r2)
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r10.setColor(r11, r11, r11, r13)
            float r11 = r10.getOriginX()
            float r11 = r11 + r5
            float r15 = r10.getOriginY()
            float r15 = r15 + r9
            r10.setPosition(r11, r15)
            r10.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupForeground
            r1.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r12, r7, r14)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r18 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r18)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r15, r6)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r7)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r7)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r10, r11, r6, r7)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r6 = r0._particlePool
            java.lang.Object r6 = r6.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r6 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0._dustTR
            r6.initialize(r7, r2, r2)
            r7 = 1056964608(0x3f000000, float:0.5)
            r6.setColor(r7, r7, r7, r8)
            float r7 = r6.getOriginX()
            float r7 = r7 + r5
            r10 = 1119879168(0x42c00000, float:96.0)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r10
            float r7 = r7 - r11
            float r10 = r6.getOriginY()
            float r10 = r10 + r9
            r6.setPosition(r7, r10)
            r6.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupForeground
            r1.addActor(r6)
            r1 = 1069547520(0x3fc00000, float:1.5)
            r6 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r6)
            r6 = 1080033280(0x40600000, float:3.5)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r6, r4)
            r10 = 1083179008(0x40900000, float:4.5)
            r11 = 1083179008(0x40900000, float:4.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r11, r6, r14)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r15 = -1098907648(0xffffffffbe800000, float:-0.25)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r15)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r11, r15)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r6)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r6)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r7, r10, r11, r6)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r6 = r0._particlePool
            java.lang.Object r6 = r6.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r6 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0._dustTR
            r6.initialize(r7, r2, r2)
            r6.setColor(r13, r13, r13, r13)
            float r7 = r6.getOriginX()
            float r7 = r7 + r5
            r10 = 1115684864(0x42800000, float:64.0)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r10
            float r7 = r7 + r11
            float r10 = r6.getOriginY()
            float r10 = r10 + r9
            r6.setPosition(r7, r10)
            r6.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupForeground
            r1.addActor(r6)
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r1)
            r6 = 1077936128(0x40400000, float:3.0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r6, r4)
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            com.badlogic.gdx.math.Interpolation r10 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r7, r8, r10)
            r8 = 1084227584(0x40a00000, float:5.0)
            r10 = -1063256064(0xffffffffc0a00000, float:-5.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r8, r10, r6, r14)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r6)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r6, r8)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r4, r7, r11, r6)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r4 = r0._particlePool
            java.lang.Object r4 = r4.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r4 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r4
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r0._dustTR
            r4.initialize(r6, r2, r2)
            r6 = 1063675494(0x3f666666, float:0.9)
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r8, r7, r7, r6)
            float r6 = r4.getOriginX()
            float r5 = r5 + r6
            float r6 = r4.getOriginY()
            float r9 = r9 + r6
            r4.setPosition(r5, r9)
            r4.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupForeground
            r1.addActor(r4)
            goto L2cd
        L26b:
            org.fortheloss.sticknodes.minigamescreen.Ralph r1 = r0._ralph
            float r1 = r1.getX()
            org.fortheloss.sticknodes.minigamescreen.Ralph r4 = r0._ralph
            float r4 = r4.getY()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r5)
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r5, r6)
            com.badlogic.gdx.math.Interpolation$ExpOut r9 = com.badlogic.gdx.math.Interpolation.exp10Out
            r10 = 1084227584(0x40a00000, float:5.0)
            r11 = 1077936128(0x40400000, float:3.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r11, r10, r5, r9)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r5)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r10, r5)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r7, r6, r9, r5)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r6 = r0._particlePool
            java.lang.Object r6 = r6.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r6 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r6
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0._dustTR
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r10
            r6.initialize(r7, r9, r2)
            r7 = 1058642330(0x3f19999a, float:0.6)
            r6.setColor(r8, r8, r8, r7)
            float r7 = r6.getOriginX()
            float r1 = r1 + r7
            float r7 = r6.getOriginY()
            float r4 = r4 + r7
            r6.setPosition(r1, r4)
            r6.addAction(r5)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupForeground
            r1.addActor(r6)
        L2cd:
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._squareTR
            r1.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r0._stageRef
            float r4 = r4.getWidth()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r6
            float r4 = r4 + r5
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r0._stageRef
            float r5 = r5.getHeight()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            float r5 = r5 + r7
            r1.setSize(r4, r5)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r10 = r4 * r5
            float r4 = r4 * r5
            r1.setPosition(r10, r4)
            r1.setColor(r2, r2, r2, r2)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r4)
            r6 = 1063675494(0x3f666666, float:0.9)
            com.badlogic.gdx.math.Interpolation r7 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r6, r4, r7)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r5, r6)
            r1.addAction(r4)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0._groupHUD
            r5 = 0
            r4.addActorAt(r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r4 = r0._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameTitleSeanTexture
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r6 = com.badlogic.gdx.graphics.Texture.class
            r8 = 1
            java.lang.Object r4 = r4.get(r5, r6, r8)
            com.badlogic.gdx.graphics.Texture r4 = (com.badlogic.gdx.graphics.Texture) r4
            r1.<init>(r4)
            float r4 = r1.getWidth()
            r5 = 1084227584(0x40a00000, float:5.0)
            float r4 = r4 * r5
            float r6 = r1.getHeight()
            float r6 = r6 * r5
            r1.setSize(r4, r6)
            r4 = 1117782016(0x42a00000, float:80.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r6 = -983498752(0xffffffffc5610000, float:-3600.0)
            float r5 = r5 * r6
            r1.setPosition(r4, r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r4, r4, r4, r2)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r4)
            r4 = 1088421888(0x40e00000, float:7.0)
            com.badlogic.gdx.math.Interpolation r6 = com.badlogic.gdx.math.Interpolation.linear
            r8 = 1036831949(0x3dcccccd, float:0.1)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r8, r4, r6)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r5, r4)
            r1.addAction(r4)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0._groupHUD
            r5 = 1
            r4.addActorAt(r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r1.pad(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.defaults()
            r6 = 1109393408(0x42200000, float:40.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r2, r2, r8, r2)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r2, r2, r2, r8)
            r4.align(r5)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r4 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = r0._hudLabelStyle
            java.lang.String r6 = "GAME OVER"
            r4.<init>(r0, r6, r5)
            r5 = 1080033280(0x40600000, float:3.5)
            r4.setScale(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r1.add(r4)
            r5 = 1123024896(0x42f00000, float:120.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padBottom(r6)
            r5 = 4
            r4.colspan(r5)
            r1.row()
            if (r3 == 0) goto L3d7
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r0._hudLabelStyle
            java.lang.String r6 = "NEW BEST DISTANCE!!!"
            r3.<init>(r0, r6, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.setScale(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r4, r2, r2, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r3)
            r3.colspan(r5)
            r1.row()
        L3d7:
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            java.util.Locale r4 = java.util.Locale.US
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            float r8 = r0._distanceMeters
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r9 = 0
            r6[r9] = r8
            java.lang.String r8 = "%.2f"
            java.lang.String r4 = java.lang.String.format(r4, r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "DISTANCE: "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = "m"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = r0._hudLabelStyle
            r3.<init>(r0, r4, r6)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.setScale(r4)
            com.badlogic.gdx.graphics.Color r4 = com.badlogic.gdx.graphics.Color.YELLOW
            r3.setColor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r3)
            r4 = 1123024896(0x42f00000, float:120.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r6)
            r3.colspan(r5)
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r4 = r0._mainMenuButtonSkin
            java.lang.String r5 = "button_scores_up"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r4.getDrawable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = r0._mainMenuButtonSkin
            java.lang.String r6 = "button_scores_down"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r6 = 0
            r3.<init>(r4, r5, r6)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = -1054867456(0xffffffffc1200000, float:-10.0)
            float r4 = r4 * r5
            r3.pressedOffsetY = r4
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            r4.<init>(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$8 r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$8
            r3.<init>(r0)
            r4.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r4)
            float r8 = r4.getWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r9
            float r4 = r4.getHeight()
            float r4 = r4 * r9
            r3.size(r8, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r4 = r0._mainMenuButtonSkin
            java.lang.String r8 = "button_play_up"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r4.getDrawable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r8 = r0._mainMenuButtonSkin
            java.lang.String r9 = "button_play_down"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r8 = r8.getDrawable(r9)
            r3.<init>(r4, r8, r6)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r3.pressedOffsetY = r4
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            r4.<init>(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$9 r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$9
            r3.<init>(r0)
            r4.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r4)
            float r8 = r4.getWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r9
            float r4 = r4.getHeight()
            float r4 = r4 * r9
            r3.size(r8, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r4 = r0._mainMenuButtonSkin
            java.lang.String r8 = "button_back_up"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r4.getDrawable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r8 = r0._mainMenuButtonSkin
            java.lang.String r9 = "button_back_down"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r8 = r8.getDrawable(r9)
            r3.<init>(r4, r8, r6)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r3.pressedOffsetY = r4
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            r4.<init>(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$10 r3 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$10
            r3.<init>(r0)
            r4.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r4)
            float r5 = r4.getWidth()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            float r4 = r4.getHeight()
            float r4 = r4 * r6
            r3.size(r5, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r0._stageRef
            float r3 = r3.getWidth()
            float r4 = r1.getWidth()
            float r3 = r3 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r0._stageRef
            float r5 = r5.getHeight()
            float r6 = r1.getHeight()
            float r5 = r5 - r6
            float r5 = r5 * r4
            r1.setPosition(r3, r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r3, r3, r3, r2)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r3, r3, r7)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r3)
            r1.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0._groupHUD
            r3 = 2
            r2.addActorAt(r3, r1)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r0._soundHandler
            com.badlogic.gdx.audio.Sound r2 = r1.sndOnDeath
            r3 = 1058642330(0x3f19999a, float:0.6)
            r1.playSound(r2, r3)
            return
    }

    private void gotoGamePlay() {
            r12 = this;
            r0 = 2
            r12._state = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r12._speedMultiple = r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1128267776(0x43400000, float:192.0)
            float r1 = r1 * r2
            r12._floorY = r1
            r1 = 0
            r12._distanceMeters = r1
            r12._desaturationAndRed = r1
            r12._nextCloudToAddAtDistance = r1
            r1 = 0
            r12._obstaclesClearCount = r1
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            java.lang.String r3 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r2 = r2.getPreferences(r3)
            java.lang.String r3 = "minigameAttempts"
            int r4 = r2.getInteger(r3, r1)
            r5 = 1
            int r4 = r4 + r5
            r12._currentAttempt = r4
            r2.putInteger(r3, r4)
            r2.flush()
            r12.clearLayers()
            r12.buildBackground()
            r12.createVolumeButtons()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r12._obstacles = r2
            org.fortheloss.sticknodes.minigamescreen.Ralph r2 = new org.fortheloss.sticknodes.minigamescreen.Ralph
            org.fortheloss.framework.Assets r3 = r12._assetsRef
            r2.<init>(r12, r3)
            r12._ralph = r2
            float r3 = r12._floorY
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1106247680(0x41f00000, float:30.0)
            float r7 = r4 * r6
            float r7 = r3 - r7
            float r8 = r4 * r6
            float r3 = r3 - r8
            r8 = 1134559232(0x43a00000, float:320.0)
            float r4 = r4 * r8
            float r3 = r3 + r4
            r2.setFloorAndJumpY(r7, r3)
            org.fortheloss.sticknodes.minigamescreen.Ralph r2 = r12._ralph
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r12._stageRef
            float r3 = r3.getWidth()
            r4 = 1041865114(0x3e19999a, float:0.15)
            float r3 = r3 * r4
            float r4 = r12._floorY
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            float r4 = r4 - r7
            r2.setPosition(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r12._groupCharacters
            org.fortheloss.sticknodes.minigamescreen.Ralph r3 = r12._ralph
            r2.addActor(r3)
            org.fortheloss.sticknodes.minigamescreen.Sean r2 = new org.fortheloss.sticknodes.minigamescreen.Sean
            org.fortheloss.framework.Assets r3 = r12._assetsRef
            r2.<init>(r12, r3)
            r12._sean = r2
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r12._stageRef
            float r3 = r3.getWidth()
            r4 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 * r4
            float r4 = r12._floorY
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1141374976(0x44080000, float:544.0)
            float r6 = r6 * r7
            float r4 = r4 + r6
            r2.setPosition(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r12._groupCharacters
            org.fortheloss.sticknodes.minigamescreen.Sean r3 = r12._sean
            r2.addActor(r3)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r2 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            int r3 = r12._currentAttempt
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r5]
            float r7 = r12._bestDistance
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r6[r1] = r7
            java.lang.String r7 = "%.2f"
            java.lang.String r6 = java.lang.String.format(r4, r7, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ATTEMPT #"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = "\nBEST "
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = "m"
            r8.append(r3)
            java.lang.String r6 = r8.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = r12._hudLabelStyle
            r2.<init>(r12, r6, r8)
            r12._hudLabelTop = r2
            com.badlogic.gdx.graphics.Color r6 = com.badlogic.gdx.graphics.Color.YELLOW
            r2.setColor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r12._hudLabelTop
            r2.setScale(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r12._hudLabelTop
            r6 = 8
            r2.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r12._hudLabelTop
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1109393408(0x42200000, float:40.0)
            float r8 = r8 * r9
            com.badlogic.gdx.scenes.scene2d.Stage r10 = r12._stageRef
            float r10 = r10.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = r12._hudLabelTop
            float r11 = r11.getPrefHeight()
            float r10 = r10 - r11
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r9
            float r10 = r10 - r11
            r2.setPosition(r8, r10)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r12._groupHUD
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r12._hudLabelTop
            r2.addActor(r8)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r2 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            java.lang.Object[] r5 = new java.lang.Object[r5]
            float r8 = r12._distanceMeters
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r5[r1] = r8
            java.lang.String r1 = java.lang.String.format(r4, r7, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DISTANCE "
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r12._hudLabelStyle
            r2.<init>(r12, r1, r3)
            r12._hudLabelBottom = r2
            r1 = 1073741824(0x40000000, float:2.0)
            r2.setScale(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12._hudLabelBottom
            r1.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r12._hudLabelBottom
            r0.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r12._hudLabelBottom
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r1
            r2 = 1117782016(0x42a00000, float:80.0)
            float r1 = r1 * r2
            r0.setPosition(r9, r1)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r12._groupHUD
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12._hudLabelBottom
            r0.addActor(r1)
            return
    }

    private void gotoMainMenu() {
            r17 = this;
            r0 = r17
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            r2 = 0
            r0._state = r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r0._speedMultiple = r3
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1128267776(0x43400000, float:192.0)
            float r4 = r4 * r5
            r0._floorY = r4
            r0._hasShownInstructions = r2
            r4 = 0
            r0._desaturationAndRed = r4
            r0._nextCloudToAddAtDistance = r4
            r17.clearLayers()
            r17.buildBackground()
            r17.createVolumeButtons()
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r5 = r0._soundHandler
            com.badlogic.gdx.audio.Music r6 = r5.musMenu
            r7 = 1050253722(0x3e99999a, float:0.3)
            r5.playMusic(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.minigameTitleLogoTexture
            r8 = 1
            java.lang.Object r6 = r6.get(r7, r1, r8)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r5.<init>(r6)
            float r6 = r5.getWidth()
            float r6 = r6 * r3
            float r7 = r5.getHeight()
            float r7 = r7 * r3
            r5.setOrigin(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r7 = r0._assetsRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.minigameTitleRalphTexture
            java.lang.Object r7 = r7.get(r9, r1, r8)
            com.badlogic.gdx.graphics.Texture r7 = (com.badlogic.gdx.graphics.Texture) r7
            r6.<init>(r7)
            float r7 = r6.getWidth()
            float r7 = r7 * r3
            float r9 = r6.getHeight()
            float r9 = r9 * r3
            r6.setOrigin(r7, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = org.fortheloss.sticknodes.App.minigameTitleSeanTexture
            java.lang.Object r1 = r9.get(r10, r1, r8)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r7.<init>(r1)
            float r1 = r7.getWidth()
            float r1 = r1 * r3
            float r9 = r7.getHeight()
            float r9 = r9 * r3
            r7.setOrigin(r1, r9)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupHUD
            r1.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupHUD
            r1.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupHUD
            r1.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            float r1 = r1.getWidth()
            float r9 = r5.getWidth()
            float r1 = r1 - r9
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            float r9 = r9.getHeight()
            float r10 = r5.getHeight()
            float r9 = r9 - r10
            r10 = 1062836634(0x3f59999a, float:0.85)
            float r9 = r9 * r10
            r5.setPosition(r1, r9)
            float r1 = r5.getX()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 * r10
            float r1 = r1 - r9
            float r9 = r5.getY()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1142292480(0x44160000, float:600.0)
            float r10 = r10 * r11
            float r9 = r9 - r10
            r6.setPosition(r1, r9)
            float r1 = r5.getX()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1144094720(0x44318000, float:710.0)
            float r9 = r9 * r10
            float r1 = r1 + r9
            float r9 = r6.getY()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1101004800(0x41a00000, float:20.0)
            float r10 = r10 * r11
            float r9 = r9 - r10
            r7.setPosition(r1, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = r0._mainMenuButtonSkin
            java.lang.String r10 = "button_play_up"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r10 = r0._mainMenuButtonSkin
            java.lang.String r12 = "button_play_down"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r10 = r10.getDrawable(r12)
            r12 = 0
            r1.<init>(r9, r10, r12)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = -1054867456(0xffffffffc1200000, float:-10.0)
            float r9 = r9 * r10
            r1.pressedOffsetY = r9
            com.badlogic.gdx.scenes.scene2d.ui.Button r9 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            r9.<init>(r1)
            float r1 = r9.getWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r13
            float r14 = r9.getHeight()
            float r14 = r14 * r13
            r9.setSize(r1, r14)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$1 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$1
            r1.<init>(r0)
            r9.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupHUD
            r1.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r14 = r0._mainMenuButtonSkin
            java.lang.String r15 = "button_back_up"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r14 = r14.getDrawable(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r15 = r0._mainMenuButtonSkin
            java.lang.String r11 = "button_back_down"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r11 = r15.getDrawable(r11)
            r1.<init>(r14, r11, r12)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r10
            r1.pressedOffsetY = r11
            com.badlogic.gdx.scenes.scene2d.ui.Button r10 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            r10.<init>(r1)
            float r1 = r10.getWidth()
            float r1 = r1 * r13
            float r11 = r10.getHeight()
            float r11 = r11 * r13
            r10.setSize(r1, r11)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$2 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$2
            r1.<init>(r0)
            r10.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0._groupHUD
            r1.addActor(r10)
            float r1 = r5.getX()
            float r11 = r6.getY()
            float r12 = r5.getY()
            float r13 = r6.getY()
            float r12 = r12 - r13
            float r13 = r9.getHeight()
            float r12 = r12 - r13
            float r12 = r12 * r3
            float r11 = r11 + r12
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1113325568(0x425c0000, float:55.0)
            float r12 = r12 * r13
            float r11 = r11 + r12
            r9.setPosition(r1, r11)
            float r1 = r5.getX()
            float r11 = r5.getWidth()
            float r1 = r1 + r11
            float r11 = r10.getWidth()
            float r1 = r1 - r11
            float r11 = r9.getY()
            r10.setPosition(r1, r11)
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$ScaledShaderLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = r0._hudLabelStyle
            java.lang.String r12 = "Created by Ralph instead of working on actual Stick Nodes. Special appearance by Sean.\nLogo stickfigures by Epitaph and Arman.\nMusic: \"Boss Battle (Sonic & Knuck)\" by NexhasUnleashed and \"Doomsday Zone\" by EliteFerrex"
            r1.<init>(r0, r12, r11)
            r11 = 8
            r1.setAlignment(r11, r8)
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            r1.setScale(r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r11, r11, r11, r11)
            float r12 = r5.getX()
            float r13 = r5.getWidth()
            float r13 = r13 * r3
            float r12 = r12 + r13
            float r13 = r1.getPrefWidth()
            float r13 = r13 * r3
            float r12 = r12 - r13
            float r13 = r10.getY()
            float r14 = r1.getPrefHeight()
            float r13 = r13 - r14
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1122369536(0x42e60000, float:115.0)
            float r14 = r14 * r15
            float r13 = r13 - r14
            r1.setPosition(r12, r13)
            com.badlogic.gdx.scenes.scene2d.Group r12 = r0._groupHUD
            r12.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r0._squareTR
            r12.<init>(r13)
            com.badlogic.gdx.scenes.scene2d.Group r13 = r0._groupHUD
            r13.addActor(r12)
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r0._stageRef
            float r13 = r13.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r14 = r0._stageRef
            float r14 = r14.getHeight()
            com.badlogic.gdx.scenes.scene2d.Group r15 = r0._groupForeground
            float r8 = -r14
            r15.setY(r8)
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0._groupParticles
            r8.setY(r14)
            r6.setColor(r11, r11, r11, r4)
            r7.setColor(r11, r11, r11, r4)
            r5.setColor(r11, r11, r11, r4)
            r8 = 1082130432(0x40800000, float:4.0)
            r5.setScale(r8, r8)
            r9.setColor(r11, r11, r11, r4)
            r9.setVisible(r2)
            r10.setColor(r11, r11, r11, r4)
            r10.setVisible(r2)
            r12.setSize(r13, r14)
            r12.setColor(r11, r11, r11, r4)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0._groupForeground
            r14 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r14)
            com.badlogic.gdx.math.Interpolation$ExpOut r8 = com.badlogic.gdx.math.Interpolation.exp10Out
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r4, r4, r11, r8)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r3)
            r2.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0._groupParticles
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r14)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r4, r4, r11, r8)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r14)
            r2.addAction(r3)
            r2 = 1073322394(0x3ff9999a, float:1.95)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r2)
            r14 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r11, r11, r14, r8)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11, r14, r8)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r15, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r2)
            r5.addAction(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r3
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sine
            r14 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r4, r2, r14, r3)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r4, r15, r14, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r14)
            r14 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r14, r2)
            r5.addAction(r2)
            r2 = 1073322394(0x3ff9999a, float:1.95)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r2)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11)
            r15 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r15)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r5, r14)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r5, r14)
            r12.addAction(r2)
            float r2 = r6.getX()
            float r5 = r6.getWidth()
            float r5 = r13 - r5
            float r5 = r5 * r15
            r6.setX(r5)
            r5 = 1076048691(0x40233333, float:2.55)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r5)
            float r12 = r6.getY()
            com.badlogic.gdx.math.Interpolation$ElasticOut r14 = com.badlogic.gdx.math.Interpolation.elasticOut
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r2, r12, r15, r14)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11, r15, r8)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r2, r12)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r5, r2)
            r6.addAction(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r16
            r5 = 1075838976(0x40200000, float:2.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r4, r5, r3)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1101004800(0x41a00000, float:20.0)
            float r12 = r12 * r15
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r4, r5, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r12)
            r12 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r12, r2)
            r6.addAction(r2)
            float r2 = r7.getX()
            float r6 = r7.getWidth()
            float r13 = r13 - r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r6
            r7.setX(r13)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r5)
            float r13 = r7.getY()
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r2, r13, r6, r14)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11, r6, r8)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r2, r8)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r12, r2)
            r7.addAction(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r6
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r4, r5, r3)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r16
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r4, r5, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r3, r2)
            r7.addAction(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r2)
            r5 = 1
            com.badlogic.gdx.scenes.scene2d.actions.VisibleAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.visible(r5)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11, r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r6, r7)
            r9.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r2)
            com.badlogic.gdx.scenes.scene2d.actions.VisibleAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.visible(r5)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r11, r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r3, r5)
            r10.addAction(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = -1007026176(0xffffffffc3fa0000, float:-500.0)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r4, r2)
            r3 = 1077936128(0x40400000, float:3.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r3)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1140457472(0x43fa0000, float:500.0)
            float r5 = r5 * r6
            com.badlogic.gdx.math.Interpolation$SwingOut r6 = com.badlogic.gdx.math.Interpolation.swingOut
            r7 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r4, r5, r7, r6)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r3, r4)
            r1.addAction(r2)
            return
    }

    private void onBackClick() {
            r5 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r5._soundHandler
            com.badlogic.gdx.audio.Sound r1 = r0.sndButtonNo
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r0.playSound(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5._groupTransition
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$14 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$14
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._squareTR
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r5._stageRef
            float r4 = r4.getHeight()
            r1.<init>(r5, r2, r3, r4)
            r0.addActor(r1)
            return
    }

    private void onGameOverBackClick() {
            r5 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r5._soundHandler
            com.badlogic.gdx.audio.Sound r1 = r0.sndButtonNo
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r0.playSound(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5._groupTransition
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$16 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$16
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._squareTR
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r5._stageRef
            float r4 = r4.getHeight()
            r1.<init>(r5, r2, r3, r4)
            r0.addActor(r1)
            return
    }

    private void onGameOverPlayClick() {
            r5 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r5._soundHandler
            com.badlogic.gdx.audio.Sound r1 = r0.sndButtonYes
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r0.playSound(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5._groupTransition
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$15 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$15
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._squareTR
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r5._stageRef
            float r4 = r4.getHeight()
            r1.<init>(r5, r2, r3, r4)
            r0.addActor(r1)
            return
    }

    private void onGameOverScoresClick(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L1f
            float r4 = r3._distanceMeters
            r0 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L1f
            int r1 = r3._obstaclesClearCount
            float r1 = (float) r1
            float r0 = r4 / r0
            int r0 = (int) r0
            float r0 = (float) r0
            r2 = 1093664768(0x41300000, float:11.0)
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.minigameSubmitToLeaderboard(r4)
            goto L24
        L1f:
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            r4.minigameDisplayLeaderboard()
        L24:
            return
    }

    private void onMusicClick(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r2._soundHandler
            r0.setMusicOn(r3)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r1)
            java.lang.String r1 = "minigameMusicOn"
            r0.putBoolean(r1, r3)
            r0.flush()
            return
    }

    private void onPlayClick() {
            r5 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r5._soundHandler
            com.badlogic.gdx.audio.Sound r1 = r0.sndButtonYes
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r0.playSound(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5._groupTransition
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$13 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$13
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._squareTR
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r5._stageRef
            float r3 = r3.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r5._stageRef
            float r4 = r4.getHeight()
            r1.<init>(r5, r2, r3, r4)
            r0.addActor(r1)
            return
    }

    private void onSoundClick(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r2._soundHandler
            r0.setSoundOn(r3)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r1)
            java.lang.String r1 = "minigameSoundOn"
            r0.putBoolean(r1, r3)
            r0.flush()
            return
    }

    public void addParticle(int r9, float r10, float r11, float r12, float r13, com.badlogic.gdx.scenes.scene2d.Action r14) {
            r8 = this;
            r7 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.addParticle(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void addParticle(int r3, float r4, float r5, float r6, float r7, com.badlogic.gdx.scenes.scene2d.Action r8, boolean r9) {
            r2 = this;
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r0 = r2._particlePool
            java.lang.Object r0 = r0.obtain()
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r0 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r0
            if (r3 != 0) goto L13
            com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r3 = r2._animMoney
            r0.initialize(r3, r6, r7)
            r0.randomizeFrame()
            goto L4e
        L13:
            r1 = 1
            if (r3 != r1) goto L1c
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._dustTR
            r0.initialize(r3, r6, r7)
            goto L4e
        L1c:
            r1 = 2
            if (r3 != r1) goto L25
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud1TR
            r0.initialize(r3, r6, r7)
            goto L4e
        L25:
            r1 = 3
            if (r3 != r1) goto L2e
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud2TR
            r0.initialize(r3, r6, r7)
            goto L4e
        L2e:
            r1 = 4
            if (r3 != r1) goto L37
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud3TR
            r0.initialize(r3, r6, r7)
            goto L4e
        L37:
            r1 = 5
            if (r3 != r1) goto L40
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud4TR
            r0.initialize(r3, r6, r7)
            goto L4e
        L40:
            r1 = 6
            if (r3 != r1) goto L49
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud5TR
            r0.initialize(r3, r6, r7)
            goto L4e
        L49:
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r2._cloud6TR
            r0.initialize(r3, r6, r7)
        L4e:
            if (r9 == 0) goto L5e
            float r3 = r0.getOriginX()
            float r4 = r4 + r3
            float r3 = r0.getOriginY()
            float r5 = r5 + r3
            r0.setPosition(r4, r5)
            goto L61
        L5e:
            r0.setPosition(r4, r5)
        L61:
            if (r8 == 0) goto L66
            r0.addAction(r8)
        L66:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r3 = r2._particles
            r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.Group r3 = r2._groupParticles
            r3.addActor(r0)
            return
    }

    @Override // org.fortheloss.framework.AppScreen, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r3._soundHandler
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r3._soundHandler = r1
        La:
            org.fortheloss.framework.SimpleDirectionGestureDetector r0 = r3._gestureDetector
            if (r0 == 0) goto L15
            com.badlogic.gdx.InputMultiplexer r2 = org.fortheloss.sticknodes.App.inputMultiplexer
            r2.removeProcessor(r0)
            r3._gestureDetector = r1
        L15:
            r3._groupBackground = r1
            r3._groupParticles = r1
            r3._groupCharacters = r1
            r3._groupObjects = r1
            r3._groupForeground = r1
            r3._groupHUD = r1
            r3._groupTransition = r1
            com.badlogic.gdx.scenes.scene2d.Group[] r0 = r3._groups
            if (r0 == 0) goto L3b
            int r0 = r0.length
            int r0 = r0 + (-1)
        L2a:
            if (r0 < 0) goto L39
            com.badlogic.gdx.scenes.scene2d.Group[] r2 = r3._groups
            r2 = r2[r0]
            r2.clear()
            r2.remove()
            int r0 = r0 + (-1)
            goto L2a
        L39:
            r3._groups = r1
        L3b:
            r3.disposeObjects()
            r3._animMoney = r1
            r3._dustTR = r1
            r3._cloud1TR = r1
            r3._cloud2TR = r1
            r3._cloud3TR = r1
            r3._cloud4TR = r1
            r3._cloud5TR = r1
            r3._cloud6TR = r1
            r3._squareTR = r1
            r3._distanceFieldShader = r1
            r3._hudLabelStyle = r1
            r3._instructionsImage = r1
            r3._tempColor = r1
            r3._cloudYPositions = r1
            com.badlogic.gdx.scenes.scene2d.ui.Skin r0 = r3._mainMenuButtonSkin
            if (r0 == 0) goto L63
            r0.dispose()
            r3._mainMenuButtonSkin = r1
        L63:
            r3._particlePool = r1
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void draw() {
            r3 = this;
            super.draw()
            int r0 = r3._screenState
            r1 = 1
            if (r0 != r1) goto Lc
            r3.renderLoadingTexture()
            goto L22
        Lc:
            if (r0 != 0) goto L22
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.glClearColor(r2, r2, r2, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3._stageRef
            r0.draw()
        L22:
            return
    }

    public org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler getSoundHandler() {
            r1 = this;
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r1._soundHandler
            return r0
    }

    @Override // org.fortheloss.framework.AppScreen
    public void initialize() {
            r1 = this;
            r0 = 1
            r1._flagLoadLoadingTexture = r0
            super.initialize()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadAssets() {
            r9 = this;
            java.lang.Class<com.badlogic.gdx.audio.Music> r0 = com.badlogic.gdx.audio.Music.class
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Class<com.badlogic.gdx.audio.Sound> r3 = com.badlogic.gdx.audio.Sound.class
            super.loadAssets()
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "last_status_event"
            java.lang.String r6 = "MiniGameScreen.loadAssets()"
            r4.setCrashlyticsKeyString(r5, r6)
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas1
            r6 = 1
            r4.load(r5, r2, r6)
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas2
            r4.load(r5, r2, r6)
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas3
            r4.load(r5, r2, r6)
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas4
            r4.load(r5, r2, r6)
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.minigameAtlas5
            r4.load(r5, r2, r6)
            org.fortheloss.framework.Assets r2 = r9._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameTitleLogoTexture
            r2.load(r4, r1, r6)
            org.fortheloss.framework.Assets r2 = r9._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameTitleRalphTexture
            r2.load(r4, r1, r6)
            org.fortheloss.framework.Assets r2 = r9._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameTitleSeanTexture
            r2.load(r4, r1, r6)
            org.fortheloss.framework.Assets r2 = r9._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r5 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r7 = 0
            r2.load(r4, r5, r7)
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r2 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter
            r2.<init>()
            r2.genMipMaps = r6
            com.badlogic.gdx.graphics.Texture$TextureFilter r4 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r2.minFilter = r4
            r2.magFilter = r4
            org.fortheloss.framework.Assets r4 = r9._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.fntTextfieldBoxVCROSDMonoDF
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r8 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r4.load(r5, r8, r2, r6)
            org.fortheloss.framework.Assets r2 = r9._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameInstructionsTexture
            r2.load(r4, r1, r6)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "buttonNo.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "buttonYes.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanHit.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanHover.wav"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanRelease.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanWiggle.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "deathExplosion.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "deathSplat.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep4.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep5.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep6.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "jump.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "jumpLand.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "onDeath.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punchSwing.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "slide.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.load(r2, r3, r7)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r1 = r1.getType()
            com.badlogic.gdx.Application$ApplicationType r2 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r1 != r2) goto L34f
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "musGameplay.mp3"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "musMenu.mp3"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.load(r2, r0, r7)
            goto L37f
        L34f:
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "musGameplay.ogg"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.load(r2, r0, r7)
            org.fortheloss.framework.Assets r1 = r9._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "musMenu.ogg"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.load(r2, r0, r7)
        L37f:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadingComplete() {
            r11 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.loadingComplete()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "last_status_event"
            java.lang.String r3 = "MiniGameScreen.loadingComplete()"
            r1.setCrashlyticsKeyString(r2, r3)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r1 = r1.getPreferences(r2)
            java.lang.String r2 = "minigameSoundOn"
            r3 = 1
            boolean r4 = r1.getBoolean(r2, r3)
            java.lang.String r5 = "minigameMusicOn"
            boolean r6 = r1.getBoolean(r5, r3)
            java.lang.String r7 = "minigameAttempts"
            r8 = 0
            int r9 = r1.getInteger(r7, r8)
            r11._currentAttempt = r9
            java.lang.String r9 = "minigameHighScore"
            r10 = 0
            float r10 = r1.getFloat(r9, r10)
            r11._bestDistance = r10
            int r10 = r11._currentAttempt
            r1.putInteger(r7, r10)
            float r7 = r11._bestDistance
            r1.putFloat(r9, r7)
            r1.putBoolean(r2, r4)
            r1.putBoolean(r5, r6)
            r1.flush()
            int r1 = r11._currentAttempt
            r11._numAttemptsOnStart = r1
            com.badlogic.gdx.utils.viewport.FitViewport r1 = new com.badlogic.gdx.utils.viewport.FitViewport
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1159069696(0x45160000, float:2400.0)
            float r5 = r5 * r2
            r7 = 1152647168(0x44b40000, float:1440.0)
            float r2 = r2 * r7
            r1.<init>(r5, r2)
            com.badlogic.gdx.Graphics r2 = com.badlogic.gdx.Gdx.graphics
            int r2 = r2.getWidth()
            com.badlogic.gdx.Graphics r5 = com.badlogic.gdx.Gdx.graphics
            int r5 = r5.getHeight()
            r1.update(r2, r5)
            r1.apply(r3)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r11._stageRef
            r2.setViewport(r1)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            r1.update()
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler
            r1.<init>()
            r11._soundHandler = r1
            org.fortheloss.framework.Assets r2 = r11._assetsRef
            r1.getSoundsFromAssets(r2)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r11._soundHandler
            r1.setSoundOn(r4)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r11._soundHandler
            r1.setMusicOn(r6)
            r1 = 7
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = new com.badlogic.gdx.scenes.scene2d.Group[r1]
            r11._groups = r1
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupBackground = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupBackground
            r1[r8] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupParticles = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupParticles
            r1[r3] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupCharacters = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupCharacters
            r4 = 2
            r1[r4] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupObjects = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupObjects
            r4 = 3
            r1[r4] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupForeground = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupForeground
            r4 = 4
            r1[r4] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupHUD = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupHUD
            r4 = 5
            r1[r4] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r11._groupTransition = r1
            r1.setTransform(r8)
            com.badlogic.gdx.scenes.scene2d.Group[] r1 = r11._groups
            com.badlogic.gdx.scenes.scene2d.Group r2 = r11._groupTransition
            r4 = 6
            r1[r4] = r2
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            r1.addActor(r2)
            double r1 = java.lang.Math.random()
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r1 = r1 * r4
            int r1 = (int) r1
            int r1 = r1 + r3
            r11._lastCloudAdded = r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1128267776(0x43400000, float:192.0)
            float r1 = r1 * r2
            r11._floorY = r1
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$17 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$17
            r2 = 100
            r1.<init>(r11, r8, r2)
            r11._particlePool = r1
            com.badlogic.gdx.graphics.g2d.Animation r1 = new com.badlogic.gdx.graphics.g2d.Animation
            org.fortheloss.framework.Assets r2 = r11._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r2 = r2.get(r4, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r4 = "dollar"
            com.badlogic.gdx.utils.Array r2 = r2.findRegions(r4)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r4 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r1.<init>(r5, r2, r4)
            r11._animMoney = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "dust"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._dustTR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud1"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud1TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud2"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud2TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud3"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud3TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud4"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud4TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud5"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud5TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "cloud6"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._cloud6TR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas5
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r11._squareTR = r1
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r4 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.Object r1 = r1.get(r2, r4, r8)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r1
            r11._distanceFieldShader = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r2 = r11._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.fntTextfieldBoxVCROSDMonoDF
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r6 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Object r2 = r2.get(r4, r6, r3)
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r2
            com.badlogic.gdx.graphics.Color r4 = com.badlogic.gdx.graphics.Color.WHITE
            r1.<init>(r2, r4)
            r11._hudLabelStyle = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            r11._tempColor = r1
            r1 = 9
            r11._cloudYPositionsIter = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11._cloudYPositions = r1
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1053609165(0x3ecccccd, float:0.4)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1060320051(0x3f333333, float:0.7)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Float> r1 = r11._cloudYPositions
            r2 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r11._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            int r1 = r1.getScreenWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r11._stageRef
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            float r2 = r2.getWorldWidth()
            float r1 = r1 / r2
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11._distanceFieldShader
            r2.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11._distanceFieldShader
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r5
            java.lang.String r5 = "u_spread"
            r2.setUniformf(r5, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r11._distanceFieldShader
            java.lang.String r4 = "u_viewportScale"
            r2.setUniformf(r4, r1)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11._distanceFieldShader
            r1.end()
            org.fortheloss.framework.Assets r1 = r11._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameAtlas5
            java.lang.Object r1 = r1.get(r2, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            org.fortheloss.framework.Assets r2 = r11._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.minigameAtlas4
            java.lang.Object r0 = r2.get(r4, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = new com.badlogic.gdx.scenes.scene2d.ui.Skin
            r2.<init>()
            r11._mainMenuButtonSkin = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_play_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r4.<init>(r6)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_play_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r4.<init>(r6)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_back_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r4.<init>(r6)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_back_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r4.<init>(r6)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_scores_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r4.<init>(r6)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r5 = "button_scores_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r5)
            r4.<init>(r1)
            r2.add(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "btn_music_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r0.findRegion(r4)
            r2.<init>(r5)
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "btn_music_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r0.findRegion(r4)
            r2.<init>(r5)
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "btn_sound_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r0.findRegion(r4)
            r2.<init>(r5)
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = r11._mainMenuButtonSkin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "btn_sound_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r0.findRegion(r4)
            r2.<init>(r0)
            r1.add(r4, r2)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 == r1) goto L39a
            org.fortheloss.framework.SimpleDirectionGestureDetector r0 = new org.fortheloss.framework.SimpleDirectionGestureDetector
            org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$18 r1 = new org.fortheloss.sticknodes.minigamescreen.MiniGameScreen$18
            r1.<init>(r11)
            r0.<init>(r1)
            r11._gestureDetector = r0
            com.badlogic.gdx.InputMultiplexer r1 = org.fortheloss.sticknodes.App.inputMultiplexer
            r1.addProcessor(r8, r0)
        L39a:
            r11.gotoMainMenu()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r11._groupTransition
            org.fortheloss.sticknodes.minigamescreen.TransitionEffect r1 = new org.fortheloss.sticknodes.minigamescreen.TransitionEffect
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r11._squareTR
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r11._stageRef
            float r4 = r4.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r11._stageRef
            float r5 = r5.getHeight()
            r1.<init>(r2, r4, r5, r3)
            r0.addActor(r1)
            return
    }

    public boolean throwObstacle(float r9, float r10, float r11, boolean r12) {
            r8 = this;
            double r0 = java.lang.Math.random()
            if (r12 == 0) goto L9
            r2 = 12
            goto Lb
        L9:
            r2 = 10
        Lb:
            double r2 = (double) r2
            double r0 = r0 * r2
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 0
            r6 = 1
            r7 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L27
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBCC r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBCC
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L27:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L3d
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBTC r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBTC
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L3d:
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L53
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L53:
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L69
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCC r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCC
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L69:
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L7f
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCBB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCBB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L7f:
            r1 = 1084227584(0x40a00000, float:5.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L95
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleTBB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleTBB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        L95:
            r1 = 1086324736(0x40c00000, float:6.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lab
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBCB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBCB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        Lab:
            r1 = 1088421888(0x40e00000, float:7.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc0
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBTB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBTB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        Lc0:
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Ld5
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCT r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleCCT
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        Ld5:
            r1 = 1091567616(0x41100000, float:9.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lea
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleTCB r6 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleTCB
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r6
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10f
        Lea:
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lff
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBBT r7 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBBT
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r7
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L10d
        Lff:
            org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBBC r7 = new org.fortheloss.sticknodes.minigamescreen.obstacles.ObstacleBBC
            org.fortheloss.framework.Assets r1 = r8._assetsRef
            float r3 = r8._floorY
            float r5 = r8._speedMultiple
            r0 = r7
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L10d:
            r6 = r7
            r7 = 1
        L10f:
            r6.setPosition(r9, r10)
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r0 = r8._obstacles
            r0.add(r6)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r8._groupObjects
            r0.addActor(r6)
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r8._soundHandler
            com.badlogic.gdx.audio.Sound r0 = r0.sndSeanThrow1
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L131
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r8._soundHandler
            com.badlogic.gdx.audio.Sound r0 = r0.sndSeanThrow2
            goto L13c
        L131:
            r2 = 1059648963(0x3f28f5c3, float:0.66)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L13c
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r0 = r8._soundHandler
            com.badlogic.gdx.audio.Sound r0 = r0.sndSeanThrow3
        L13c:
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r1 = r8._soundHandler
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r1.playSound(r0, r2)
            return r7
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void unloadAssets() {
            r4 = this;
            super.unloadAssets()
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas1
            r2 = 1
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas2
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas3
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas4
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameAtlas5
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameTitleLogoTexture
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameTitleRalphTexture
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameTitleSeanTexture
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader
            r3 = 0
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntTextfieldBoxVCROSDMonoDF
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameInstructionsTexture
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "buttonNo.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "buttonYes.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "cutsceneSeanHit.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "cutsceneSeanHover.wav"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "cutsceneSeanRelease.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "cutsceneSeanWiggle.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "deathExplosion.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "deathSplat.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep1.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep2.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep3.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep4.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep5.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "footstep6.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "jump.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "jumpLand.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "onDeath.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "punch1.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "punch2.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "punch3.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "punchSwing.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "seanThrow1.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "seanThrow2.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "seanThrow3.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "slide.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "stack1.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "stack2.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "stack3.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r1) goto L32d
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musGameplay.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musMenu.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            goto L35d
        L32d:
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musGameplay.ogg"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musMenu.ogg"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.unload(r1, r3)
        L35d:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void update(float r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            super.update(r20)
            int r2 = r0._screenState
            if (r2 != 0) goto L4dd
            org.fortheloss.sticknodes.minigamescreen.MiniGameSoundHandler r2 = r0._soundHandler
            r2.updateMusicFade(r1)
            int r2 = r0._state
            r3 = 1000593162(0x3ba3d70a, float:0.005)
            r4 = 0
            r5 = 1048576000(0x3e800000, float:0.25)
            r6 = 1142292480(0x44160000, float:600.0)
            r7 = 1092616192(0x41200000, float:10.0)
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            if (r2 != 0) goto Lc1
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r6
            float r10 = r0._speedMultiple
            float r2 = r2 * r10
            float r2 = r2 * r1
            float r5 = r5 * r2
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r10 = r0._grass
            float r2 = -r2
            r10.incrementOffsetX(r2)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r10 = r0._grassBlades
            r10.incrementOffsetX(r2)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r2 = r0._sky
            float r10 = -r5
            r2.incrementOffsetX(r10)
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r2 = r0._particles
            int r2 = r2.size()
            int r2 = r2 - r9
        L45:
            if (r2 < 0) goto L98
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r10 = r0._particles
            java.lang.Object r10 = r10.get(r2)
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r10 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r10
            float r11 = r10.getWidth()
            float r11 = r11 * r8
            float r12 = r10.getHeight()
            float r12 = r12 * r8
            float r13 = r10.getX()
            float r14 = -r11
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 < 0) goto L8b
            float r13 = r10.getX()
            com.badlogic.gdx.scenes.scene2d.Stage r14 = r0._stageRef
            float r14 = r14.getWidth()
            float r14 = r14 + r11
            int r11 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r11 > 0) goto L8b
            float r11 = r10.getY()
            float r13 = -r12
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L8b
            float r11 = r10.getY()
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r0._stageRef
            float r13 = r13.getHeight()
            float r13 = r13 + r12
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L95
        L8b:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r11 = r0._particles
            r11.remove(r2)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r11 = r0._particlePool
            r11.free(r10)
        L95:
            int r2 = r2 + (-1)
            goto L45
        L98:
            float r2 = r0._distanceMeters
            float r8 = r0._speedMultiple
            float r6 = r6 * r8
            float r6 = r6 * r1
            float r6 = r6 * r3
            float r2 = r2 + r6
            r0._distanceMeters = r2
            float r3 = r0._nextCloudToAddAtDistance
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L44a
            float r3 = r7 / r8
            float r2 = r2 + r3
            r0._nextCloudToAddAtDistance = r2
            float r5 = r5 / r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            float r2 = r2.getWidth()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r7
            float r2 = r2 + r3
            r0.generateCloud(r5, r2)
            goto L44a
        Lc1:
            r10 = 2
            if (r2 != r10) goto L3b3
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._instructionsImage
            if (r2 == 0) goto Led
            r2.act(r1)
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r2 != r3) goto L44a
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r3 = -1
            boolean r2 = r2.isKeyJustPressed(r3)
            if (r2 == 0) goto L44a
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._instructionsImage
            r2.clear()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._instructionsImage
            r2.remove()
            r2 = 0
            r0._instructionsImage = r2
            goto L44a
        Led:
            float r2 = r0._speedMultiple
            r11 = 1025758986(0x3d23d70a, float:0.04)
            float r11 = r11 * r1
            float r2 = r2 + r11
            r0._speedMultiple = r2
            float r11 = r0._distanceMeters
            r12 = 1140457472(0x43fa0000, float:500.0)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L108
            r12 = 1077936128(0x40400000, float:3.0)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L12f
            r0._speedMultiple = r12
            goto L12f
        L108:
            r12 = 1148846080(0x447a0000, float:1000.0)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L117
            r12 = 1080033280(0x40600000, float:3.5)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L12f
            r0._speedMultiple = r12
            goto L12f
        L117:
            r12 = 1153138688(0x44bb8000, float:1500.0)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L127
            r12 = 1082130432(0x40800000, float:4.0)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L12f
            r0._speedMultiple = r12
            goto L12f
        L127:
            r12 = 1082654720(0x40880000, float:4.25)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L12f
            r0._speedMultiple = r12
        L12f:
            boolean r2 = r0._hasShownInstructions
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L1a2
            r2 = 1084437299(0x40a33333, float:5.1)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a2
            r0._hasShownInstructions = r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r11 = r0._assetsRef
            java.lang.String r14 = org.fortheloss.sticknodes.App.minigameInstructionsTexture
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r15 = com.badlogic.gdx.graphics.Texture.class
            java.lang.Object r11 = r11.get(r14, r15, r9)
            com.badlogic.gdx.graphics.Texture r11 = (com.badlogic.gdx.graphics.Texture) r11
            r2.<init>(r11)
            r0._instructionsImage = r2
            com.badlogic.gdx.scenes.scene2d.Stage r11 = r0._stageRef
            float r11 = r11.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0._instructionsImage
            float r14 = r14.getWidth()
            float r11 = r11 - r14
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r14
            com.badlogic.gdx.scenes.scene2d.Stage r15 = r0._stageRef
            float r15 = r15.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = r0._instructionsImage
            float r8 = r8.getHeight()
            float r15 = r15 - r8
            float r15 = r15 * r14
            r2.setPosition(r11, r15)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._instructionsImage
            r8 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1109393408(0x42200000, float:40.0)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r11
            com.badlogic.gdx.math.Interpolation r11 = com.badlogic.gdx.math.Interpolation.sine
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r14 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r14, r13, r11)
            r15 = -1038090240(0xffffffffc2200000, float:-40.0)
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r15, r13, r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r14, r11)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat(r8, r11)
            r2.addAction(r8)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0._groupHUD
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = r0._instructionsImage
            r2.addActor(r8)
        L1a2:
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r6
            float r8 = r0._speedMultiple
            float r2 = r2 * r8
            float r2 = r2 * r1
            float r11 = r2 * r5
            float r14 = r0._distanceMeters
            float r8 = r8 * r6
            float r8 = r8 * r1
            float r8 = r8 * r3
            float r14 = r14 + r8
            r0._distanceMeters = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0._hudLabelTop
            int r6 = r0._currentAttempt
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Object[] r14 = new java.lang.Object[r9]
            float r15 = r0._bestDistance
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r14[r4] = r15
            java.lang.String r15 = "%.2f"
            java.lang.String r14 = java.lang.String.format(r8, r15, r14)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = "ATTEMPT #"
            r12.append(r10)
            r12.append(r6)
            java.lang.String r6 = "\nBEST "
            r12.append(r6)
            r12.append(r14)
            java.lang.String r6 = "m"
            r12.append(r6)
            java.lang.String r10 = r12.toString()
            r3.setText(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0._hudLabelBottom
            java.lang.Object[] r10 = new java.lang.Object[r9]
            float r12 = r0._distanceMeters
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r10[r4] = r12
            java.lang.String r8 = java.lang.String.format(r8, r15, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "DISTANCE "
            r10.append(r12)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r3.setText(r6)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grass
            float r6 = -r2
            r3.incrementOffsetX(r6)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grassBlades
            r3.incrementOffsetX(r6)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._sky
            float r6 = -r11
            r3.incrementOffsetX(r6)
            org.fortheloss.sticknodes.minigamescreen.Ralph r3 = r0._ralph
            float r6 = r0._speedMultiple
            r3.setSpeedMultiple(r6)
            org.fortheloss.sticknodes.minigamescreen.Sean r3 = r0._sean
            float r6 = r0._speedMultiple
            r3.setSpeedMultiple(r6)
            float r3 = r0._distanceMeters
            r6 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r6
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r7
            float r3 = java.lang.Math.min(r13, r3)
            float r6 = r0._desaturationAndRed
            double r14 = (double) r6
            double r7 = (double) r1
            r17 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
            double r7 = r7 * r17
            double r14 = r14 + r7
            float r6 = (float) r14
            r0._desaturationAndRed = r6
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L257
            r0._desaturationAndRed = r3
        L257:
            float r3 = r0._desaturationAndRed
            float r3 = r13 - r3
            r6 = 1061158912(0x3f400000, float:0.75)
            float r7 = r3 * r6
            float r7 = r7 + r5
            r8 = 1036831949(0x3dcccccd, float:0.1)
            r12 = 1063675494(0x3f666666, float:0.9)
            float r12 = r12 * r3
            float r12 = r12 + r8
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r8 = r0._sky
            float r3 = r3 * r5
            float r3 = r3 + r6
            r8.setColor(r3, r7, r7, r13)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grass
            r3.setColor(r7, r12, r12, r13)
            org.fortheloss.sticknodes.minigamescreen.ScrollingRepeatTexture r3 = r0._grassBlades
            r3.setColor(r7, r12, r12, r13)
            org.fortheloss.sticknodes.minigamescreen.Ralph r3 = r0._ralph
            float r3 = r3.getX()
            r5 = 1125122048(0x43100000, float:144.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            float r3 = r3 + r6
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r5 = r0._obstacles
            int r5 = r5.size()
            int r5 = r5 - r9
        L28f:
            if (r5 < 0) goto L2e2
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r6 = r0._obstacles
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle r6 = (org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle) r6
            int r7 = r6.getState()
            r8 = 2
            if (r7 != r8) goto L2df
            float r7 = r6.getX()
            float r12 = r6.getX()
            float r12 = r12 - r2
            r6.setX(r12)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L2c6
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 > 0) goto L2df
            org.fortheloss.sticknodes.minigamescreen.Ralph r7 = r0._ralph
            boolean r6 = r6.ralphDeathOnContact(r7)
            if (r6 == 0) goto L2c0
            r19.gotoGameOver()
            goto L2df
        L2c0:
            int r6 = r0._obstaclesClearCount
            int r6 = r6 + r9
            r0._obstaclesClearCount = r6
            goto L2df
        L2c6:
            float r7 = r6.getX()
            float r12 = r6.getWidth()
            float r12 = -r12
            r14 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r14
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 >= 0) goto L2df
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.obstacles.Obstacle> r7 = r0._obstacles
            r7.remove(r5)
            r6.dispose()
        L2df:
            int r5 = r5 + (-1)
            goto L28f
        L2e2:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r2 = r0._particles
            int r2 = r2.size()
            int r2 = r2 - r9
        L2e9:
            if (r2 < 0) goto L33e
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r3 = r0._particles
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r3 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r3
            float r5 = r3.getWidth()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            float r7 = r3.getHeight()
            float r7 = r7 * r6
            float r6 = r3.getX()
            float r8 = -r5
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L331
            float r6 = r3.getX()
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r0._stageRef
            float r8 = r8.getWidth()
            float r8 = r8 + r5
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L331
            float r5 = r3.getY()
            float r6 = -r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L331
            float r5 = r3.getY()
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r0._stageRef
            float r6 = r6.getHeight()
            float r6 = r6 + r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L33b
        L331:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r5 = r0._particles
            r5.remove(r2)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r5 = r0._particlePool
            r5.free(r3)
        L33b:
            int r2 = r2 + (-1)
            goto L2e9
        L33e:
            float r2 = r0._distanceMeters
            float r3 = r0._nextCloudToAddAtDistance
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L35e
            float r3 = r0._speedMultiple
            r5 = 1092616192(0x41200000, float:10.0)
            float r7 = r5 / r3
            float r2 = r2 + r7
            r0._nextCloudToAddAtDistance = r2
            float r11 = r11 / r1
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            float r2 = r2.getWidth()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            float r2 = r2 + r3
            r0.generateCloud(r11, r2)
        L35e:
            float r2 = r0._bestDistance
            double r5 = (double) r2
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L376
            float r3 = r0._distanceMeters
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L376
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._hudLabelBottom
            r3 = 1057803469(0x3f0ccccd, float:0.55)
            r5 = 0
            r2.setColor(r5, r3, r13, r13)
        L376:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r2 != r3) goto L44a
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r3 = 19
            boolean r2 = r2.isKeyJustPressed(r3)
            if (r2 == 0) goto L391
            org.fortheloss.sticknodes.minigamescreen.Ralph r2 = r0._ralph
            r2.jump()
            goto L44a
        L391:
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r3 = 22
            boolean r2 = r2.isKeyJustPressed(r3)
            if (r2 == 0) goto L3a2
            org.fortheloss.sticknodes.minigamescreen.Ralph r2 = r0._ralph
            r2.punch()
            goto L44a
        L3a2:
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            r3 = 20
            boolean r2 = r2.isKeyJustPressed(r3)
            if (r2 == 0) goto L44a
            org.fortheloss.sticknodes.minigamescreen.Ralph r2 = r0._ralph
            r2.slide()
            goto L44a
        L3b3:
            r3 = 3
            if (r2 != r3) goto L44a
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r6
            float r3 = r0._speedMultiple
            float r2 = r2 * r3
            float r2 = r2 * r1
            float r2 = r2 * r5
            org.fortheloss.sticknodes.minigamescreen.Ralph r5 = r0._ralph
            r5.setSpeedMultiple(r3)
            org.fortheloss.sticknodes.minigamescreen.Sean r3 = r0._sean
            float r5 = r0._speedMultiple
            r3.setSpeedMultiple(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r3 = r0._particles
            int r3 = r3.size()
            int r3 = r3 - r9
        L3d5:
            if (r3 < 0) goto L42a
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r5 = r0._particles
            java.lang.Object r5 = r5.get(r3)
            org.fortheloss.sticknodes.minigamescreen.ScrollingParticle r5 = (org.fortheloss.sticknodes.minigamescreen.ScrollingParticle) r5
            float r6 = r5.getWidth()
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            float r8 = r5.getHeight()
            float r8 = r8 * r7
            float r11 = r5.getX()
            float r12 = -r6
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L41d
            float r11 = r5.getX()
            com.badlogic.gdx.scenes.scene2d.Stage r12 = r0._stageRef
            float r12 = r12.getWidth()
            float r12 = r12 + r6
            int r6 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r6 > 0) goto L41d
            float r6 = r5.getY()
            float r11 = -r8
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 < 0) goto L41d
            float r6 = r5.getY()
            com.badlogic.gdx.scenes.scene2d.Stage r11 = r0._stageRef
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 <= 0) goto L427
        L41d:
            java.util.ArrayList<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r6 = r0._particles
            r6.remove(r3)
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.minigamescreen.ScrollingParticle> r6 = r0._particlePool
            r6.free(r5)
        L427:
            int r3 = r3 + (-1)
            goto L3d5
        L42a:
            float r3 = r0._distanceMeters
            float r5 = r0._nextCloudToAddAtDistance
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L44a
            float r5 = r0._speedMultiple
            r6 = 1092616192(0x41200000, float:10.0)
            float r7 = r6 / r5
            float r3 = r3 + r7
            r0._nextCloudToAddAtDistance = r3
            float r2 = r2 / r1
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r0._stageRef
            float r3 = r3.getWidth()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            float r3 = r3 + r5
            r0.generateCloud(r2, r3)
        L44a:
            boolean r2 = r0._flagExit
            if (r2 == 0) goto L4c6
            r0._flagExit = r4
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            int r2 = r0._currentAttempt
            int r3 = r0._numAttemptsOnStart
            int r2 = r2 - r3
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "minigame"
            java.lang.String r5 = "user_session_minigame_plays"
            r1.analyticsSendValue(r3, r5, r2)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            float r2 = r0._bestDistance
            double r5 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            java.lang.String r5 = "user_session_minigame_current_best"
            r1.analyticsSendValue(r3, r5, r2)
            com.badlogic.gdx.utils.viewport.ExtendViewport r1 = new com.badlogic.gdx.utils.viewport.ExtendViewport
            r2 = 1159069696(0x45160000, float:2400.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r5 = 1152647168(0x44b40000, float:1440.0)
            float r3 = r3 * r5
            r1.<init>(r2, r3)
            com.badlogic.gdx.Graphics r2 = com.badlogic.gdx.Gdx.graphics
            int r2 = r2.getWidth()
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            int r3 = r3.getHeight()
            r1.update(r2, r3, r9)
            r1.apply(r9)
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            r2.setViewport(r1)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.getBatch()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.data.ProjectData r1 = new org.fortheloss.sticknodes.data.ProjectData
            org.fortheloss.sticknodes.animationscreen.FontLoader r2 = new org.fortheloss.sticknodes.animationscreen.FontLoader
            boolean r3 = org.fortheloss.sticknodes.App.isInternationalUI()
            r2.<init>(r3)
            r1.<init>(r2)
            r1.newProject()
            org.fortheloss.sticknodes.App r2 = r0._appRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen
            org.fortheloss.sticknodes.App r5 = r0._appRef
            r3.<init>(r5, r1, r4)
            r2.setScreen(r3)
            return
        L4c6:
            boolean r2 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r2 == 0) goto L4dd
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0._groupTransition
            if (r2 == 0) goto L4d4
            boolean r2 = r2.hasChildren()
            if (r2 != 0) goto L4dd
        L4d4:
            int r2 = r0._state
            if (r2 != 0) goto L4db
            r19.onBackClick()
        L4db:
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r4
        L4dd:
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._instructionsImage
            if (r2 != 0) goto L4e6
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            r2.act(r1)
        L4e6:
            return
    }
}
