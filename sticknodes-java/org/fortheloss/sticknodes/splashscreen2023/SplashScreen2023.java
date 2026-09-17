package org.fortheloss.sticknodes.splashscreen2023;

/* loaded from: classes2.dex */
public class SplashScreen2023 extends org.fortheloss.framework.AppScreen implements org.fortheloss.framework.IAdListener, org.fortheloss.sticknodes.splashscreen2023.IEmitter {
    public static boolean DEMON_SHOWN;
    private java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.SplashCharacterData> mAllSplashCharacterDatas;
    private float mAssetScaling;
    private com.badlogic.gdx.scenes.scene2d.Actor mCharActorRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mCharLabel;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> mDemonTextures;
    private boolean mDemonTriggered;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mDio;
    private boolean mExitRequested;
    private boolean mFlagGoToAnimationScreen;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupBadges;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupButtons;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupCharScale;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupDio;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupEverything;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupGlobe;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupLabel;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupParticles;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupParticlesFront;
    private com.badlogic.gdx.scenes.scene2d.Group mGroupPlane;
    private boolean mHasPausedBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageBlackness;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageBoat;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageBros;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageFallers1;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageFallers2;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageGlobe;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageLogo;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImagePlane;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageSky;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageSunbeams;
    private com.badlogic.gdx.scenes.scene2d.ui.Image mImageTouchPause;
    private boolean mIsPaused;
    private boolean mIsTransitioning;
    private float mLeaveScreenSeconds;
    private float mLeaveScreenTimer;
    private com.badlogic.gdx.audio.Music mMusicRickRoll;
    private java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> mParticles;
    private java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> mParticlesFront;
    private int mPlaneTaps;
    private com.badlogic.gdx.scenes.scene2d.Actor mRandomizerWidgetRef;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> mRickTextures;
    private boolean mRickTriggered;
    private float mSecondsPassed;
    private int mSelectedCharacterIndex;
    private org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.SplashCharacterData mSelectedSplashCharacterData;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram mShaderGlitchRef;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram mShaderWhiteTint;
    private float mShakeIntensity;
    private float mShakeSeconds;
    private float mShakeTimer;
    private com.badlogic.gdx.audio.Sound mSoundExplosion;
    private com.badlogic.gdx.audio.Sound mSoundLaugh;
    private float mWhiteTintValue;













    /* renamed from: org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23, reason: invalid class name */
    class AnonymousClass23 implements java.lang.Runnable {
        final /* synthetic */ org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 this$0;

        /* renamed from: org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23$1, reason: invalid class name */
        class AnonymousClass1 implements java.lang.Runnable {
            final /* synthetic */ org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.AnonymousClass23 this$1;


            AnonymousClass1(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.AnonymousClass23 r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23 r0 = r4.this$1
                    org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0 = r0.this$0
                    com.badlogic.gdx.scenes.scene2d.ui.Image r0 = org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.m1329$$Nest$fgetmImageBlackness(r0)
                    com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
                    r2 = 1065353216(0x3f800000, float:1.0)
                    r3 = 1048576000(0x3e800000, float:0.25)
                    com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r3, r1)
                    org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23$1$1 r2 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23$1$1
                    r2.<init>(r4)
                    com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r2)
                    r0.addAction(r1)
                    return
            }
        }

        AnonymousClass23(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
                org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23$1 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23$1
                r1.<init>(r2)
                r0.postRunnable(r1)
                return
        }
    }








    private static class SplashCharacterData {
        public int badge;
        public java.lang.String filename;
        public boolean isCutoff;
        public java.lang.String name;
        public float scale;
        public java.lang.String url;

        public SplashCharacterData(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
                r7 = this;
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public SplashCharacterData(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, float r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.filename = r1
                r0.name = r2
                r0.url = r3
                r0.isCutoff = r4
                r0.scale = r5
                r0.badge = r6
                return
        }

        public SplashCharacterData(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12) {
                r7 = this;
                r5 = 1065353216(0x3f800000, float:1.0)
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: -$$Nest$fgetmGroupParticles, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group m1326$$Nest$fgetmGroupParticles(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.mGroupParticles
            return r0
    }

    /* renamed from: -$$Nest$fgetmGroupParticlesFront, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group m1327$$Nest$fgetmGroupParticlesFront(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.mGroupParticlesFront
            return r0
    }

    /* renamed from: -$$Nest$fgetmHasPausedBefore, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1328$$Nest$fgetmHasPausedBefore(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            boolean r0 = r0.mHasPausedBefore
            return r0
    }

    /* renamed from: -$$Nest$fgetmImageBlackness, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m1329$$Nest$fgetmImageBlackness(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0.mImageBlackness
            return r0
    }

    /* renamed from: -$$Nest$fgetmImagePlane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m1330$$Nest$fgetmImagePlane(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0.mImagePlane
            return r0
    }

    /* renamed from: -$$Nest$fgetmImageTouchPause, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m1331$$Nest$fgetmImageTouchPause(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0.mImageTouchPause
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsPaused, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1332$$Nest$fgetmIsPaused(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            boolean r0 = r0.mIsPaused
            return r0
    }

    /* renamed from: -$$Nest$fgetmIsTransitioning, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1333$$Nest$fgetmIsTransitioning(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            boolean r0 = r0.mIsTransitioning
            return r0
    }

    /* renamed from: -$$Nest$fgetmMusicRickRoll, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.audio.Music m1334$$Nest$fgetmMusicRickRoll(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.audio.Music r0 = r0.mMusicRickRoll
            return r0
    }

    /* renamed from: -$$Nest$fgetmParticles, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1335$$Nest$fgetmParticles(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r0.mParticles
            return r0
    }

    /* renamed from: -$$Nest$fgetmParticlesFront, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1336$$Nest$fgetmParticlesFront(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r0.mParticlesFront
            return r0
    }

    /* renamed from: -$$Nest$fgetmRickTriggered, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1337$$Nest$fgetmRickTriggered(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            boolean r0 = r0.mRickTriggered
            return r0
    }

    /* renamed from: -$$Nest$fgetmSelectedSplashCharacterData, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.SplashCharacterData m1338$$Nest$fgetmSelectedSplashCharacterData(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r0 = r0.mSelectedSplashCharacterData
            return r0
    }

    /* renamed from: -$$Nest$fgetmShaderWhiteTint, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.glutils.ShaderProgram m1339$$Nest$fgetmShaderWhiteTint(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r0.mShaderWhiteTint
            return r0
    }

    /* renamed from: -$$Nest$fgetmWhiteTintValue, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1340$$Nest$fgetmWhiteTintValue(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            float r0 = r0.mWhiteTintValue
            return r0
    }

    /* renamed from: -$$Nest$fputmHasPausedBefore, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1341$$Nest$fputmHasPausedBefore(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0, boolean r1) {
            r0.mHasPausedBefore = r1
            return
    }

    /* renamed from: -$$Nest$fputmIsPaused, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1342$$Nest$fputmIsPaused(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0, boolean r1) {
            r0.mIsPaused = r1
            return
    }

    /* renamed from: -$$Nest$mburstParticles, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1343$$Nest$mburstParticles(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            r0.burstParticles()
            return
    }

    /* renamed from: -$$Nest$monPlaneTap, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1344$$Nest$monPlaneTap(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            r0.onPlaneTap()
            return
    }

    /* renamed from: -$$Nest$mshowAd, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1345$$Nest$mshowAd(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            r0.showAd()
            return
    }

    static {
            return
    }

    public SplashScreen2023(org.fortheloss.sticknodes.App r4) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.mPlaneTaps = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mAssetScaling = r0
            r1 = 0
            r3.mShakeTimer = r1
            r3.mShakeSeconds = r1
            r3.mShakeIntensity = r1
            r3.mLeaveScreenTimer = r1
            r3.mLeaveScreenSeconds = r1
            r3.mFlagGoToAnimationScreen = r4
            r3.mIsTransitioning = r4
            r2 = -1
            r3.mSelectedCharacterIndex = r2
            r3.mWhiteTintValue = r0
            r3.mIsPaused = r4
            r3.mHasPausedBefore = r4
            r3.mExitRequested = r4
            r3.mDemonTriggered = r4
            r3.mRickTriggered = r4
            r3.mSecondsPassed = r1
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.DEMON_SHOWN = r4
            return
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$000(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    static /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage access$100(org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    private void beginTransition() {
            r6 = this;
            boolean r0 = r6.mIsTransitioning
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r6.mIsTransitioning = r0
            com.badlogic.gdx.scenes.scene2d.Group r0 = r6.mGroupButtons
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6.mImagePlane
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6.mImageTouchPause
            r2 = 0
            if (r0 == 0) goto L2f
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6.mImageTouchPause
            r1 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r3)
            r0.addAction(r1)
        L2f:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stageRef
            float r0 = r0.getWidth()
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$23
            r1.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6.mImagePlane
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r3.getStage()
            if (r3 == 0) goto L64
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6.mImagePlane
            float r4 = r3.getX()
            float r0 = r0 - r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r5 = r6.mAssetScaling
            float r5 = r5 * r4
            float r0 = r0 + r5
            r4 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.math.Interpolation$SwingIn r5 = com.badlogic.gdx.math.Interpolation.swingIn
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r0, r2, r4, r5)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r1)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r1)
            r3.addAction(r0)
            goto L67
        L64:
            r1.run()
        L67:
            return
    }

    private void buildCharacterDatas() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.mAllSplashCharacterDatas = r0
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "001_dio_and_ralph.png"
            java.lang.String r3 = "Dio (& Ralph)"
            java.lang.String r4 = "https://youtube.com/@FTLRalph"
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "002_kamuki_project_zertos_by_dxanimations.png"
            java.lang.String r3 = "Kamuki - Project Zertos by DXAnimations"
            java.lang.String r4 = "https://youtube.com/@dxanimations"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "003_anta.png"
            java.lang.String r8 = "Anta"
            java.lang.String r9 = "https://youtube.com/@AnimAsians"
            r10 = 0
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "004_kyouko.png"
            java.lang.String r3 = "Kyouko"
            java.lang.String r4 = "https://youtube.com/@maxp_m68"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "005_chain.png"
            java.lang.String r8 = "CHaIN"
            java.lang.String r9 = "https://x.com/Project_CH_a_IN"
            r11 = 8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "006_murrci.png"
            java.lang.String r3 = "Murrci"
            java.lang.String r4 = "Https://youtube.com/@me-thatswho-2"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "007_sherlock.png"
            java.lang.String r3 = "Sherlock"
            java.lang.String r4 = "https://tumblr.com/severusherlockadrenusmikayilov"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "008_ryzen.png"
            java.lang.String r3 = "Ryzen"
            java.lang.String r4 = "https://bsky.app/profile/underbaselevel.bsky.social"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "009_risu_and_kyutha.png"
            java.lang.String r3 = "Risu & Kyutha"
            java.lang.String r4 = "https://youtube.com/@risuboii"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "010_sakana_tan.png"
            java.lang.String r3 = "Sakana-Tan"
            java.lang.String r4 = "https://sticknodes.com/members/stickonatofu/profile/"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "011_capzos.png"
            java.lang.String r3 = "CaPzos"
            java.lang.String r4 = "https://youtube.com/@capzos2544"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "012_aegis_scorpius.png"
            java.lang.String r3 = "Aegis Scorpius"
            java.lang.String r4 = "https://youtube.com/@ewqmadness344"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "013_zean_camerron.png"
            java.lang.String r8 = "Zean Camerron"
            java.lang.String r9 = "https://youtube.com/@darrenzconanims"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "014_jay_and_percia.png"
            java.lang.String r3 = "Jay & Percia"
            java.lang.String r4 = "https://youtube.com/@mjanims9860"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "015_kxixx.png"
            java.lang.String r3 = "KXIXX"
            java.lang.String r4 = "https://youtube.com/@kxixxmation"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "016_warlock.png"
            java.lang.String r3 = "Warlock"
            java.lang.String r4 = "https://sticknodes.com/stickfigures/author/?user=Demonic"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "017_coolbraker.png"
            java.lang.String r8 = "CoolBraker"
            java.lang.String r9 = "https://youtube.com/@brakieee"
            r11 = 2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "018_pat_and_dunn.png"
            java.lang.String r3 = "Pat & Dunn"
            java.lang.String r4 = "https://youtube.com/@gamerxonfire"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "019_mike_the_medic.png"
            java.lang.String r3 = "Mike the Medic"
            java.lang.String r4 = "https://youtube.com/@iffitworks.2004"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "theStickNodesTranslators"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Heckray (ES), Squi (FL), Dmlan (FR), Berke (TR),\nZordoron (JP), Ronny (PT), HauntedOne (RU)\n("
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "020_the_translators.png"
            java.lang.String r4 = "https://sticknodes.com"
            r6 = 1
            r1.<init>(r3, r2, r4, r6)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "021_asurarusa.png"
            java.lang.String r3 = "Asurarusa"
            java.lang.String r4 = "https://youtube.com/@romeo_of_romelution"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "022_sakaki.png"
            java.lang.String r3 = "Sakaki"
            java.lang.String r4 = "https://youtube.com/@sticks_studioshq"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "023_dron.png"
            java.lang.String r3 = "Dron"
            java.lang.String r4 = "https://x.com/letjboiii"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "024_noelle_and_adaline.png"
            java.lang.String r3 = "Noelle & Adaline"
            java.lang.String r4 = "https://youtube.com/@adalineaurora6261"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "025_uncan.png"
            java.lang.String r3 = "Uncan"
            java.lang.String r4 = "https://youtube.com/@k-zilla8148"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "026_thoughtsofeverything.png"
            java.lang.String r3 = "ThoughtsOfEverything"
            java.lang.String r4 = "https://youtube.com/@thoughtsofeverything"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "027_seraphon.png"
            java.lang.String r3 = "Seraphon"
            java.lang.String r4 = "https://youtube.com/@saip."
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "028_carnelia.png"
            java.lang.String r3 = "Carnelia"
            java.lang.String r4 = "https://youtube.com/@charliefoxanims"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "029_mr_tophat.png"
            java.lang.String r3 = "Mr.TopHat"
            java.lang.String r4 = "https://youtube.com/@Mr.TopHatAnimations"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "030_hector_zephyr.png"
            java.lang.String r3 = "Hector Zephyr"
            java.lang.String r4 = "https://youtube.com/@its_hz_lmao"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "031_reddy_greeny_and_pingy.png"
            java.lang.String r3 = "Reddy, Greeny & Pingy"
            java.lang.String r4 = "https://youtube.com/@grinee_5866"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "032_natalie.png"
            java.lang.String r3 = "Natalie"
            java.lang.String r4 = "https://youtube.com/@arcionek"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "033_mikhail.png"
            java.lang.String r3 = "Mikhail"
            java.lang.String r4 = "https://youtube.com/@mikesparkc"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "034_karz_and_alyssa.png"
            java.lang.String r3 = "Karz & Alyssa"
            java.lang.String r4 = "https://youtube.com/@shinmations"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "035_max_millard_and_nick_bassius.png"
            java.lang.String r3 = "Max Millard & Nick Bassius"
            java.lang.String r4 = "https://youtube.com/@cheesebiscuitanimations"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "036_paint.png"
            java.lang.String r3 = "Paint"
            java.lang.String r4 = "https://x.com/RefrigeratorRi2"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "037_coll.png"
            java.lang.String r8 = "Coll"
            java.lang.String r9 = "https://youtube.com/@collo6629"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "038_ashtarte_toyama_and_amara_toyama.png"
            java.lang.String r3 = "Ashtarte Toyama & Amara Toyama"
            java.lang.String r4 = "https://youtube.com/@toyamadrop"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "039_beyond_ones_richla_and_strike_v3.png"
            java.lang.String r8 = "Beyond Ones - Richla & Strike (V3)"
            java.lang.String r9 = "https://youtube.com/@cocarichla"
            r11 = 8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "040_dangen.png"
            java.lang.String r3 = "Dangen"
            java.lang.String r4 = "https://youtube.com/@slingminanim5701"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "041_the_revenant.png"
            java.lang.String r3 = "The Revenant"
            java.lang.String r4 = "https://youtube.com/@REV_ENANT"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "042_assault_and_ira_manaka.png"
            java.lang.String r3 = "Assault & Ira Manaka"
            java.lang.String r4 = "https://youtube.com/@assault28"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "043_cloudy_1.png"
            java.lang.String r3 = "Cloudy 1"
            java.lang.String r4 = "https://youtube.com/@cloudy1"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "044_nonex.png"
            java.lang.String r8 = "Nonex"
            java.lang.String r9 = "https://youtube.com/@NonexAnims13"
            r11 = 10
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "045_che_yungg_mia_zinccc.png"
            java.lang.String r3 = "“Che-yungg!” (Mia) - Zinccc"
            java.lang.String r4 = "https://youtube.com/@zincccotw"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "046_zaeva_and_avant.png"
            java.lang.String r3 = "Zaeva & Avant"
            java.lang.String r4 = "https://youtube.com/@Mr_Zungo"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "047_elina.png"
            java.lang.String r8 = "Elina"
            java.lang.String r9 = "https://x.com/IAmEvla"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "048_chill_the_manstick.png"
            java.lang.String r8 = "Chill The Manstick"
            java.lang.String r9 = "https://youtube.com/@the_manstick"
            r11 = 40
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "049_chloe_paige_joe347.png"
            java.lang.String r3 = "Chloe Paige (Joe347)"
            java.lang.String r4 = "https://youtube.com/@joe-ww8uw"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "050_riot_pneuma_and_abeer.png"
            java.lang.String r3 = "Riot, Pneuma, & Abeer"
            java.lang.String r4 = "https://youtube.com/@humbledamien"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "051_keizen_and_dronis.png"
            java.lang.String r3 = "Keizen & Dronis"
            java.lang.String r4 = "https://youtube.com/@ironkeizertech2585"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "052_danny_andy_and_nathan.png"
            java.lang.String r3 = "Danny, Andy, and Nathan"
            java.lang.String r4 = "https://youtube.com/@kitovesn"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "053_neon_anims.png"
            java.lang.String r8 = "Neon Anims"
            java.lang.String r9 = "https://youtube.com/@neonanims6181"
            r11 = 2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "054_completelyrandomizedusername.png"
            java.lang.String r3 = "CompletelyRandomizedUsername"
            java.lang.String r4 = "https://youtube.com/@Samchong2005"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "055_glisty.png"
            java.lang.String r3 = "Glisty"
            java.lang.String r4 = "https://youtube.com/@glisty9281"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "056_gunther_gutter_p_ziegler.png"
            java.lang.String r3 = "Gunther \"Gutter\" P. Ziegler"
            java.lang.String r4 = "https://youtube.com/@gutteranims6994"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "057_aze.png"
            java.lang.String r3 = "Aze"
            java.lang.String r4 = "https://youtube.com/@nganims"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "058_zambu.png"
            java.lang.String r8 = "Zambu"
            java.lang.String r9 = "https://youtube.com/@TypicalAnimates"
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "059_benz.png"
            java.lang.String r3 = "BENZ"
            java.lang.String r4 = "https://youtube.com/@timstks"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "060_sour_head.png"
            java.lang.String r8 = "Sour Head"
            java.lang.String r9 = "https://youtube.com/@noobish"
            r11 = 8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "061_jelo_and_rocky.png"
            java.lang.String r3 = "Jelo And Rocky"
            java.lang.String r4 = "https://youtube.com/@arcaneknight-j8o"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "062_nyx.png"
            java.lang.String r3 = "Nyx"
            java.lang.String r4 = "https://youtube.com/@aaronhernandez-v9b"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "063_glimmyest.png"
            java.lang.String r3 = "Glimmyest"
            java.lang.String r4 = "https://youtube.com/@glimmy8556"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "064_heckray.png"
            java.lang.String r3 = "Heckray"
            java.lang.String r4 = "https://youtube.com/@heckrayanims"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "065_marinette_paif_and_stitches.png"
            java.lang.String r8 = "Marinette Paif & Stitches"
            java.lang.String r9 = "https://youtube.com/@vulcanimatehd7506"
            r11 = 10
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "066_abidemi_b_kadogo.png"
            java.lang.String r3 = "Abidemi B. Kadogo"
            java.lang.String r4 = "https://youtube.com/@-burstverse-1010"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "067_narr.png"
            java.lang.String r3 = "Narr"
            java.lang.String r4 = "https://youtube.com/@swirl_man"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "068_kari_and_lilac.png"
            java.lang.String r3 = "Kari & Lilac"
            java.lang.String r4 = "https://youtube.com/@permadeathstudios6446"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "069_mc.png"
            java.lang.String r3 = "Mc"
            java.lang.String r4 = "https://youtube.com/@thetotalmc"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "070_kai_yazaki.png"
            java.lang.String r3 = "Kai Yazaki"
            java.lang.String r4 = "https://youtube.com/@_notrohan"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "071_canister_v2.png"
            java.lang.String r8 = "Canister (v2)"
            java.lang.String r9 = "https://youtube.com/@ClinicallyFrench"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "072_kirenma_and_tymere.png"
            java.lang.String r3 = "Kirenma & Tymere"
            java.lang.String r4 = "https://youtube.com/@kirenma"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "073_spike_and_rae.png"
            java.lang.String r8 = "Spike & Rae"
            java.lang.String r9 = "https://youtube.com/@spike_777"
            r11 = 8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "074_charlotte_and_corrina.png"
            java.lang.String r8 = "Charlotte & Corrina"
            java.lang.String r9 = "https://youtube.com/@SultanTheDerp"
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "075_etranger_sm.png"
            java.lang.String r3 = "Etranger; SM"
            java.lang.String r4 = "https://youtube.com/@etrangersm"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "076_kiro.png"
            java.lang.String r8 = "Kiro"
            java.lang.String r9 = "https://youtube.com/@ak_kiro"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "077_elpman.png"
            java.lang.String r3 = "ElpMan"
            java.lang.String r4 = "https://youtube.com/@elpman5054"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "078_redblade.png"
            java.lang.String r3 = "RedBlade"
            java.lang.String r4 = "https://youtube.com/@mrjanims0224"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "079_obelia_alaina_ayaka.png"
            java.lang.String r8 = "Obelia Alaina Ayaka"
            java.lang.String r9 = "https://youtube.com/@shachiimu_meimei"
            r11 = 8
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "080_sir_isaac_the_3rd.png"
            java.lang.String r8 = "Sir Isaac the 3rd"
            java.lang.String r9 = "https://bsky.app/profile/sir-isaac-the-3rd.bsky.social"
            r11 = 4
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "081_kyoro_shinsoku.png"
            java.lang.String r3 = "Kyoro Shinsoku"
            java.lang.String r4 = "https://youtube.com/@soulkjg"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "082_kai_and_jayx.png"
            java.lang.String r3 = "Kai & Jay-X"
            java.lang.String r4 = "https://youtube.com/@BlayzingPhoenix"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "083_charlotte.png"
            java.lang.String r3 = "Charlotte"
            java.lang.String r4 = "https://youtube.com/@cdn48"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "084_akari_cody_and_iro.png"
            java.lang.String r3 = "Akari, Cody, & Iro"
            java.lang.String r4 = "https://youtube.com/@codyfreezioranims8278"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "085_luigiz.png"
            java.lang.String r3 = "LuigiZ"
            java.lang.String r4 = "https://youtube.com/@luigizsz"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "086_rin_nekoshima.png"
            java.lang.String r3 = "Rin Nekoshima"
            java.lang.String r4 = "https://youtube.com/@Kimmsey"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "087_kiyoto_kawasaki.png"
            java.lang.String r3 = "Kiyoto Kawasaki"
            java.lang.String r4 = "https://youtube.com/@pairo_mestro"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "088_feral.png"
            java.lang.String r3 = "Feral"
            java.lang.String r4 = "https://youtube.com/@Thespian-Z"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "089_alisdair_and_eleanor_kestrel.png"
            java.lang.String r3 = "Alisdair & Eleanor Kestrel"
            java.lang.String r4 = "https://youtube.com/@theposseegs-renegade"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "090_the_firstborn_omniarchs_rigel_and_polaris.png"
            java.lang.String r3 = "The Firstborn Omniarchs: Rigel & Polaris"
            java.lang.String r4 = "https://youtube.com/@parsonide"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "091_ellie_aquines.png"
            java.lang.String r3 = "Ellie Aquines"
            java.lang.String r4 = "https://x.com/ZhonSN"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "092_scott_and_lulu.png"
            java.lang.String r3 = "Scott & Lulu"
            java.lang.String r4 = "https://youtube.com/@scouttrooperanims"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "093_blem_n_his_friends_in_a_car.png"
            java.lang.String r3 = "Blem n' His Friends In A Car"
            java.lang.String r4 = "https://youtube.com/@realblemton"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "094_lbrr_08.png"
            java.lang.String r3 = "LBRR 08"
            java.lang.String r4 = "https://youtube.com/@lbsn08"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "095_vlizzurd_and_everest.png"
            java.lang.String r8 = "Vlizzurd & Everest"
            java.lang.String r9 = "https://youtube.com/@vlizzurd"
            r11 = 40
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "096_eden_and_faye.png"
            java.lang.String r3 = "Eden & Faye"
            java.lang.String r4 = "https://tiktok.com/@door._vy"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "097_mattsteady_with_toxic_and_ryzen.png"
            java.lang.String r3 = "Mattsteady With Toxic & Ryzen"
            java.lang.String r4 = "https://youtube.com/@mattsteadystudio4006"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "098_mei_yamazuki.png"
            java.lang.String r3 = "Mei Yamazuki"
            java.lang.String r4 = "https://youtube.com/@meiyamazuki99"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "099_kurotama_rito_the_yog_sothoth.png"
            java.lang.String r8 = "Kurotama Rito -  The Yog-Sothoth"
            java.lang.String r9 = "https://youtube.com/@DarkboyAnimation"
            r11 = 6
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r7 = "100_jackfly.png"
            java.lang.String r8 = "JackFly"
            java.lang.String r9 = "https://youtube.com/@JackFlySN"
            r11 = 28
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "101_marko_bob.png"
            java.lang.String r3 = "Marko (BoB)"
            java.lang.String r4 = "https://x.com/0xoph"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "102_jyokin.png"
            java.lang.String r3 = "Jyokin"
            java.lang.String r4 = "https://youtube.com/@tradanims"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "103_ao_sollertia.png"
            java.lang.String r3 = "Ao Sollertia"
            java.lang.String r4 = "https://youtube.com/@inactivestudio"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "104_ax_label.png"
            java.lang.String r3 = "AX LABEL"
            java.lang.String r4 = "https://youtube.com/@axstudio_official"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r12.mAllSplashCharacterDatas
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r2 = "105_saiko.png"
            java.lang.String r3 = "Saiko"
            java.lang.String r4 = "https://youtube.com/@SquiSN"
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            return
    }

    private void burstParticles() {
            r30 = this;
            r12 = r30
            org.fortheloss.framework.Assets r0 = r12._assetsRef
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r1 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.String r2 = "splashscreen/particlesAtlas.txt"
            r13 = 0
            java.lang.Object r0 = r0.get(r2, r1, r13)
            r14 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r14 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r14
            java.lang.String r15 = "p00"
            java.lang.String r16 = "p02"
            java.lang.String r17 = "p03"
            java.lang.String r18 = "p04"
            java.lang.String r19 = "p05"
            java.lang.String r20 = "p06"
            java.lang.String r21 = "p07"
            java.lang.String r22 = "p08"
            java.lang.String r23 = "p09"
            java.lang.String r24 = "p10"
            java.lang.String r25 = "p11"
            java.lang.String r26 = "p12"
            java.lang.String r27 = "p13"
            java.lang.String r28 = "p01"
            java.lang.String[] r15 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1112014848(0x42480000, float:50.0)
            float r16 = r0 * r1
            r1 = 1128792064(0x43480000, float:200.0)
            float r17 = r0 * r1
            r18 = 1137180672(0x43c80000, float:400.0)
            float r19 = r0 * r18
            r2 = 1120403456(0x42c80000, float:100.0)
            float r20 = r0 * r2
            float r21 = r0 * r1
            double r0 = java.lang.Math.random()
            float r0 = (float) r0
            r22 = 1
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L55
            r23 = 1
            goto L57
        L55:
            r23 = 0
        L57:
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r24 = r1 * r0
            r0 = 0
        L5e:
            float r11 = (float) r0
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 >= 0) goto L181
            r0 = 0
        L64:
            float r10 = (float) r0
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 >= 0) goto L177
            float r0 = r20 + r11
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            float r1 = r1 * r16
            float r3 = r0 + r1
            float r0 = r21 + r10
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            float r1 = r1 * r16
            float r4 = r0 + r1
            r0 = -1001914368(0xffffffffc4480000, float:-800.0)
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            r2 = 1159069696(0x45160000, float:2400.0)
            float r1 = r1 * r2
            float r1 = r1 + r0
            double r5 = java.lang.Math.random()
            float r0 = (float) r5
            float r0 = r0 * r2
            float r0 = r0 + r18
            double r5 = java.lang.Math.random()
            float r2 = (float) r5
            r5 = 1135869952(0x43b40000, float:360.0)
            float r7 = r2 * r5
            r2 = 1161527296(0x453b8000, float:3000.0)
            float r2 = r1 / r2
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r5
            double r8 = java.lang.Math.random()
            float r6 = (float) r8
            float r6 = r6 * r5
            float r2 = r2 + r6
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto Lb7
            r5 = -1
            goto Lb8
        Lb7:
            r5 = 1
        Lb8:
            float r5 = (float) r5
            float r8 = r2 * r5
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r5 = 1058642330(0x3f19999a, float:0.6)
            r26 = r14
            double r13 = java.lang.Math.random()
            float r6 = (float) r13
            float r6 = r6 * r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            float r6 = r6 + r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            r5 = 1157234688(0x44fa0000, float:2000.0)
            double r13 = java.lang.Math.random()
            float r9 = (float) r13
            float r9 = r9 * r5
            float r9 = r9 + r2
            float r2 = -r9
            r5 = 1063675494(0x3f666666, float:0.9)
            r9 = 1036818527(0x3dcc985f, float:0.0999)
            double r13 = java.lang.Math.random()
            float r13 = (float) r13
            float r13 = r13 * r9
            float r13 = r13 + r5
            if (r23 == 0) goto Lf2
            r5 = 13
            r5 = r15[r5]
            r14 = r10
            goto L103
        Lf2:
            double r27 = java.lang.Math.random()
            r5 = 14
            r14 = r10
            double r9 = (double) r5
            double r27 = r27 * r9
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r27 - r9
            int r5 = (int) r9
            r5 = r15[r5]
        L103:
            double r9 = java.lang.Math.random()
            r27 = 4594572340058128384(0x3fc3333340000000, double:0.15000000596046448)
            int r29 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1))
            if (r29 >= 0) goto L141
            r9 = 1066192077(0x3f8ccccd, float:1.1)
            float r9 = r9 * r6
            org.fortheloss.sticknodes.splashscreen2023.Particle r10 = new org.fortheloss.sticknodes.splashscreen2023.Particle
            r6 = r26
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r6.findRegion(r5)
            float r26 = org.fortheloss.sticknodes.App.assetScaling
            float r27 = r1 * r26
            float r28 = r0 * r26
            float r26 = r26 * r2
            r0 = r10
            r1 = r30
            r2 = r5
            r5 = r27
            r27 = r14
            r14 = r6
            r6 = r28
            r28 = r15
            r15 = r10
            r10 = r26
            r26 = r11
            r11 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r12.mParticlesFront
            r0.add(r15)
            goto L16d
        L141:
            r27 = r14
            r28 = r15
            r14 = r26
            r26 = r11
            r9 = 1060320051(0x3f333333, float:0.7)
            float r9 = r9 * r6
            org.fortheloss.sticknodes.splashscreen2023.Particle r15 = new org.fortheloss.sticknodes.splashscreen2023.Particle
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r14.findRegion(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r1 * r6
            float r11 = r0 * r6
            float r29 = r2 * r6
            r0 = r15
            r1 = r30
            r2 = r5
            r5 = r10
            r6 = r11
            r10 = r29
            r11 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r12.mParticles
            r0.add(r15)
        L16d:
            float r10 = r27 + r24
            int r0 = (int) r10
            r11 = r26
            r15 = r28
            r13 = 0
            goto L64
        L177:
            r26 = r11
            r28 = r15
            float r11 = r26 + r24
            int r0 = (int) r11
            r13 = 0
            goto L5e
        L181:
            return
    }

    private void clearLayout() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageSky
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageSunbeams
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageGlobe
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageBoat
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageBros
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImagePlane
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mDio
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageBlackness
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageLogo
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageFallers1
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.mImageFallers2
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupEverything
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupCharScale
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupGlobe
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupBadges
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupPlane
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupParticles
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupParticlesFront
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupDio
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupButtons
            r1.remove(r0)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r1.mGroupLabel
            r1.remove(r0)
            r0 = 0
            r1.mImageSky = r0
            r1.mImageSunbeams = r0
            r1.mImageGlobe = r0
            r1.mImageBoat = r0
            r1.mImageBros = r0
            r1.mImagePlane = r0
            r1.mImageTouchPause = r0
            r1.mDio = r0
            r1.mImageBlackness = r0
            r1.mImageLogo = r0
            r1.mImageFallers1 = r0
            r1.mImageFallers2 = r0
            r1.mGroupEverything = r0
            r1.mGroupCharScale = r0
            r1.mGroupGlobe = r0
            r1.mGroupBadges = r0
            r1.mGroupPlane = r0
            r1.mGroupParticles = r0
            r1.mGroupParticlesFront = r0
            r1.mGroupDio = r0
            r1.mGroupButtons = r0
            r1.mGroupLabel = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stageRef
            if (r0 == 0) goto L9d
            r0.clear()
        L9d:
            return
    }

    private void createLayout() {
            r30 = this;
            r0 = r30
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            r2 = 0
            r0.mLeaveScreenTimer = r2
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            r4 = 1090519040(0x41000000, float:8.0)
            if (r3 == 0) goto L1b
            boolean r3 = org.fortheloss.sticknodes.App.isParroted
            if (r3 == 0) goto L16
            goto L1b
        L16:
            r3 = 1086324736(0x40c00000, float:6.0)
            r0.mLeaveScreenSeconds = r3
            goto L1d
        L1b:
            r0.mLeaveScreenSeconds = r4
        L1d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mParticles = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mParticlesFront = r3
            org.fortheloss.framework.Assets r3 = r0._assetsRef
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r5 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.String r6 = "splashscreen/glitch.vert"
            r7 = 0
            java.lang.Object r3 = r3.get(r6, r5, r7)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r3
            r0.mShaderGlitchRef = r3
            java.lang.Class<com.badlogic.gdx.math.Vector2> r3 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.math.Vector2 r3 = (com.badlogic.gdx.math.Vector2) r3
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r0._stageRef
            float r5 = r5.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r0._stageRef
            float r6 = r6.getHeight()
            r8 = 1063675494(0x3f666666, float:0.9)
            float r8 = r8 * r6
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/globe.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            int r9 = r9.getHeight()
            float r9 = (float) r9
            float r8 = r8 / r9
            r0.mAssetScaling = r8
            r9 = 1143111680(0x44228000, float:650.0)
            float r8 = r8 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r10 = r0._assetsRef
            java.lang.String r11 = "splashscreen/sky.png"
            java.lang.Object r10 = r10.get(r11, r1, r7)
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            r9.<init>(r10)
            r0.mImageSky = r9
            com.badlogic.gdx.utils.Scaling r10 = com.badlogic.gdx.utils.Scaling.fill
            float r9 = r9.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Image r11 = r0.mImageSky
            float r11 = r11.getHeight()
            com.badlogic.gdx.math.Vector2 r9 = r10.apply(r9, r11, r5, r6)
            r3.set(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageSky
            float r10 = r3.x
            float r11 = r3.y
            r9.setSize(r10, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageSky
            float r10 = r9.getWidth()
            float r10 = r5 - r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageSky
            float r12 = r12.getHeight()
            float r12 = r6 - r12
            float r12 = r12 * r11
            r9.setPosition(r10, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageSky
            float r10 = r9.getWidth()
            float r10 = r10 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageSky
            float r12 = r12.getHeight()
            float r12 = r12 * r11
            r9.setOrigin(r10, r12)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = r0.mImageSky
            r9.addActor(r10)
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.mWhiteTintValue = r9
            com.badlogic.gdx.graphics.glutils.ShaderProgram r10 = r30.getWhitenessShader()
            r0.mShaderWhiteTint = r10
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r10 = r0.mSelectedSplashCharacterData
            java.lang.String r10 = r10.filename
            r12 = 1120403456(0x42c80000, float:100.0)
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r14 = 1066192077(0x3f8ccccd, float:1.1)
            if (r10 != 0) goto L11b
            float r10 = r0.mLeaveScreenSeconds
            float r10 = r10 + r4
            r0.mLeaveScreenSeconds = r10
            com.badlogic.gdx.graphics.g2d.Animation r10 = new com.badlogic.gdx.graphics.g2d.Animation
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r15 = r0.mRickTextures
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r4 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_PINGPONG
            r10.<init>(r13, r15, r4)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$1 r4 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$1
            r4.<init>(r0, r10, r7, r7)
            r4.validate()
            r10 = 1133903872(0x43960000, float:300.0)
            float r15 = r0.mAssetScaling
            float r15 = r15 * r10
            float r10 = r6 - r15
            float r15 = r4.getHeight()
            float r10 = r10 / r15
            r4.setScale(r10)
            float r10 = r0.mAssetScaling
            float r10 = r10 * r12
            r4.setPosition(r10, r2)
            float r10 = r4.getWidth()
            float r10 = r10 * r11
            r4.setOrigin(r10, r2)
            r0.mCharActorRef = r4
            goto L172
        L11b:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$2 r4 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$2
            org.fortheloss.framework.Assets r15 = r0._assetsRef
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r9 = "splashscreen/characters2025/"
            r13.append(r9)
            r13.append(r10)
            java.lang.String r9 = r13.toString()
            java.lang.Object r9 = r15.get(r9, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.<init>(r0, r9)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r9 = r0.mSelectedSplashCharacterData
            float r9 = r9.scale
            float r10 = r4.getWidth()
            float r13 = r0.mAssetScaling
            float r10 = r10 * r13
            float r10 = r10 * r14
            float r10 = r10 * r9
            float r13 = r4.getHeight()
            float r15 = r0.mAssetScaling
            float r13 = r13 * r15
            float r13 = r13 * r14
            float r13 = r13 * r9
            r4.setSize(r10, r13)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r9 = r0.mSelectedSplashCharacterData
            boolean r9 = r9.isCutoff
            if (r9 == 0) goto L160
            r9 = 0
            goto L164
        L160:
            float r9 = r0.mAssetScaling
            float r9 = r9 * r12
        L164:
            r4.setPosition(r9, r2)
            float r9 = r4.getWidth()
            float r9 = r9 * r11
            r4.setOrigin(r9, r2)
            r0.mCharActorRef = r4
        L172:
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>()
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random1.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random2.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random3.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random4.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random5.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random6.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random7.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/random/random8.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.add(r9)
            com.badlogic.gdx.graphics.g2d.Animation r9 = new com.badlogic.gdx.graphics.g2d.Animation
            r10 = 1031127695(0x3d75c28f, float:0.06)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r13 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r9.<init>(r10, r4, r13)
            org.fortheloss.framework.AnimationWidget r4 = new org.fortheloss.framework.AnimationWidget
            r4.<init>(r9, r7, r7)
            r4.validate()
            r9 = 1080033280(0x40600000, float:3.5)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r9
            r4.setScale(r10)
            float r9 = r4.getWidth()
            float r9 = r9 * r11
            r4.setOrigin(r9, r2)
            r0.mRandomizerWidgetRef = r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r10 = "splashscreen/globe.png"
            java.lang.Object r9 = r9.get(r10, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r4.<init>(r9)
            r0.mImageGlobe = r4
            float r9 = r4.getWidth()
            float r10 = r0.mAssetScaling
            float r9 = r9 * r10
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = r0.mImageGlobe
            float r10 = r10.getHeight()
            float r15 = r0.mAssetScaling
            float r10 = r10 * r15
            r4.setSize(r9, r10)
            float r4 = r5 - r8
            float r4 = r4 * r11
            float r8 = r8 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageGlobe
            float r4 = r4.getWidth()
            float r4 = r4 * r11
            float r8 = r8 - r4
            r4 = -1010958336(0xffffffffc3be0000, float:-380.0)
            float r9 = r0.mAssetScaling
            float r9 = r9 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageGlobe
            r4.setPosition(r8, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageGlobe
            float r10 = r4.getWidth()
            float r10 = r10 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = r0.mImageGlobe
            float r15 = r15.getHeight()
            float r15 = r15 * r11
            r4.setOrigin(r10, r15)
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageGlobe
            float r4 = r4.getOriginX()
            float r4 = r4 + r8
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = r0.mImageGlobe
            float r10 = r10.getOriginY()
            float r10 = r10 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/sunbeams.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r15.<init>(r12)
            r0.mImageSunbeams = r15
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageGlobe
            float r12 = r12.getWidth()
            float r12 = r12 * r11
            float r12 = r12 + r8
            com.badlogic.gdx.scenes.scene2d.Stage r14 = r0._stageRef
            float r14 = r14.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = r0.mImageGlobe
            float r15 = r15.getHeight()
            float r15 = r15 * r11
            float r15 = r15 + r9
            float r14 = r14 - r15
            r15 = 1073741824(0x40000000, float:2.0)
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 <= 0) goto L298
            float r12 = r12 * r15
            goto L29a
        L298:
            float r12 = r14 * r15
        L29a:
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageSunbeams
            r14.setSize(r12, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageSunbeams
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageGlobe
            float r14 = r14.getWidth()
            float r14 = r14 * r11
            float r14 = r14 + r8
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = r0.mImageSunbeams
            float r15 = r15.getWidth()
            float r15 = r15 * r11
            float r14 = r14 - r15
            float r15 = r0.mAssetScaling
            r18 = 1101004800(0x41a00000, float:20.0)
            float r15 = r15 * r18
            float r14 = r14 - r15
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = r0.mImageGlobe
            float r15 = r15.getHeight()
            float r15 = r15 * r11
            float r15 = r15 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageSunbeams
            float r2 = r2.getHeight()
            float r2 = r2 * r11
            float r15 = r15 - r2
            r12.setPosition(r14, r15)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageSunbeams
            r12 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r12, r12, r12, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageSunbeams
            r12 = 1067030938(0x3f99999a, float:1.2)
            r2.setScale(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageSunbeams
            float r12 = r2.getWidth()
            float r12 = r12 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageSunbeams
            float r14 = r14.getHeight()
            float r14 = r14 * r11
            r2.setOrigin(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/bros.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r2.<init>(r12)
            r0.mImageBros = r2
            float r12 = r2.getWidth()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageBros
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r2.setSize(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBros
            r12 = 1127481344(0x43340000, float:180.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            float r12 = r12 + r8
            r15 = 1150763008(0x44974000, float:1210.0)
            float r14 = r14 * r15
            float r14 = r14 + r9
            r2.setPosition(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBros
            float r12 = r2.getX()
            float r12 = -r12
            float r12 = r12 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageBros
            float r14 = r14.getY()
            float r14 = -r14
            float r14 = r14 + r10
            r2.setOrigin(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/boat.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r2.<init>(r12)
            r0.mImageBoat = r2
            float r12 = r2.getWidth()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageBoat
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r2.setSize(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBoat
            r12 = 1147207680(0x44610000, float:900.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            float r12 = r12 + r8
            r15 = 1140457472(0x43fa0000, float:500.0)
            float r14 = r14 * r15
            float r14 = r14 + r9
            r2.setPosition(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBoat
            r12 = 1129119744(0x434d0000, float:205.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            r15 = 1132068864(0x437a0000, float:250.0)
            float r14 = r14 * r15
            r2.setOrigin(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/fallers1.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r2.<init>(r12)
            r0.mImageFallers1 = r2
            float r12 = r2.getWidth()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageFallers1
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r2.setSize(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers1
            r12 = 1127809024(0x43390000, float:185.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            float r12 = r12 + r8
            r15 = 1138491392(0x43dc0000, float:440.0)
            float r14 = r14 * r15
            float r14 = r14 + r9
            r2.setPosition(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers1
            r12 = 1141145600(0x44048000, float:530.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            r15 = 1134886912(0x43a50000, float:330.0)
            float r14 = r14 * r15
            r2.setOrigin(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/fallers2.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r2.<init>(r12)
            r0.mImageFallers2 = r2
            float r12 = r2.getWidth()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageFallers2
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r2.setSize(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers2
            r12 = 1147863040(0x446b0000, float:940.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            float r12 = r12 + r8
            r15 = 1149173760(0x447f0000, float:1020.0)
            float r14 = r14 * r15
            float r14 = r14 + r9
            r2.setPosition(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers2
            float r12 = r2.getX()
            float r12 = -r12
            float r12 = r12 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImageFallers2
            float r14 = r14.getY()
            float r14 = -r14
            float r14 = r14 + r10
            r2.setOrigin(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r14 = "splashscreen/plane.png"
            java.lang.Object r12 = r12.get(r14, r1, r7)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r2.<init>(r12)
            r0.mImagePlane = r2
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$3 r12 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$3
            r12.<init>(r0)
            r2.addListener(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            float r12 = r2.getWidth()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mImagePlane
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r2.setSize(r12, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            r12 = 1137180672(0x43c80000, float:400.0)
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            float r8 = r8 - r12
            r12 = 1132593152(0x43820000, float:260.0)
            float r14 = r14 * r12
            float r9 = r9 + r14
            r2.setPosition(r8, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            r8 = 1135869952(0x43b40000, float:360.0)
            float r9 = r0.mAssetScaling
            float r8 = r8 * r9
            r12 = 1136525312(0x43be0000, float:380.0)
            float r9 = r9 * r12
            r2.setOrigin(r8, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r8 = r0._assetsRef
            java.lang.String r9 = "splashscreen/square.png"
            java.lang.Object r8 = r8.get(r9, r1, r7)
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r2.<init>(r8)
            r0.mImageBlackness = r2
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r2.setColor(r9, r9, r9, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBlackness
            r2.setSize(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBlackness
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r12 = "splashscreen/logo.png"
            java.lang.Object r9 = r9.get(r12, r1, r7)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r2.<init>(r9)
            r0.mImageLogo = r2
            float r9 = r2.getWidth()
            float r12 = r0.mAssetScaling
            float r9 = r9 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageLogo
            float r12 = r12.getHeight()
            float r14 = r0.mAssetScaling
            float r12 = r12 * r14
            r2.setSize(r9, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageLogo
            float r9 = r0.mAssetScaling
            float r12 = r9 * r18
            float r9 = r9 * r18
            float r9 = r6 - r9
            float r14 = r2.getHeight()
            float r9 = r9 - r14
            r2.setPosition(r12, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageLogo
            float r9 = r2.getHeight()
            r12 = 0
            r2.setOrigin(r12, r9)
            int r2 = org.fortheloss.sticknodes.App.language_id
            r9 = 1
            if (r2 != r9) goto L4d0
            java.lang.String r2 = "es"
            goto L4f6
        L4d0:
            r12 = 5
            if (r2 != r12) goto L4d6
            java.lang.String r2 = "fl"
            goto L4f6
        L4d6:
            r12 = 2
            if (r2 != r12) goto L4dc
            java.lang.String r2 = "fr"
            goto L4f6
        L4dc:
            r12 = 6
            if (r2 != r12) goto L4e2
            java.lang.String r2 = "jp"
            goto L4f6
        L4e2:
            r12 = 3
            if (r2 != r12) goto L4e8
            java.lang.String r2 = "pt"
            goto L4f6
        L4e8:
            r12 = 7
            if (r2 != r12) goto L4ee
            java.lang.String r2 = "ru"
            goto L4f6
        L4ee:
            r12 = 4
            if (r2 != r12) goto L4f4
            java.lang.String r2 = "tr"
            goto L4f6
        L4f4:
            java.lang.String r2 = "en"
        L4f6:
            r12 = 1103626240(0x41c80000, float:25.0)
            float r14 = r0.mAssetScaling
            float r14 = r14 * r12
            r12 = 1112014848(0x42480000, float:50.0)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r15 * r12
            com.badlogic.gdx.scenes.scene2d.Group r12 = new com.badlogic.gdx.scenes.scene2d.Group
            r12.<init>()
            r0.mGroupButtons = r12
            org.fortheloss.framework.IPlatform r12 = org.fortheloss.sticknodes.App.platform
            boolean r12 = r12.isPro()
            if (r12 != 0) goto L5d7
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r7 = "splashscreen/button_pro_"
            r11.append(r7)
            r11.append(r2)
            java.lang.String r2 = ".png"
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            r7 = 0
            java.lang.Object r2 = r9.get(r2, r1, r7)
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            r12.<init>(r2)
            float r2 = r12.getWidth()
            float r7 = r0.mAssetScaling
            float r2 = r2 * r7
            float r7 = r12.getHeight()
            float r9 = r0.mAssetScaling
            float r7 = r7 * r9
            r12.setSize(r2, r7)
            float r2 = r12.getWidth()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r7
            float r9 = r12.getHeight()
            float r9 = r9 * r7
            r12.setOrigin(r2, r9)
            com.badlogic.gdx.utils.Array r2 = new com.badlogic.gdx.utils.Array
            r2.<init>()
            org.fortheloss.framework.Assets r7 = r0._assetsRef
            java.lang.String r9 = "splashscreen/button_pro_shine_1.png"
            r11 = 0
            java.lang.Object r7 = r7.get(r9, r1, r11)
            com.badlogic.gdx.graphics.Texture r7 = (com.badlogic.gdx.graphics.Texture) r7
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            r20 = r3
            java.lang.String r3 = "splashscreen/button_pro_shine_2.png"
            java.lang.Object r3 = r9.get(r3, r1, r11)
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            r21 = r6
            java.lang.String r6 = "splashscreen/button_pro_shine_3.png"
            java.lang.Object r6 = r9.get(r6, r1, r11)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            r22 = r8
            java.lang.String r8 = "splashscreen/button_pro_shine_4.png"
            java.lang.Object r8 = r9.get(r8, r1, r11)
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r2.add(r7, r3, r6, r8)
            r3 = 0
            r2.add(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Animation r3 = new com.badlogic.gdx.graphics.g2d.Animation
            r6 = 1039516303(0x3df5c28f, float:0.12)
            r3.<init>(r6, r2, r13)
            org.fortheloss.framework.AnimationWidget r2 = new org.fortheloss.framework.AnimationWidget
            r6 = 1
            r2.<init>(r3, r6, r6)
            r2.setLayoutEnabled(r11)
            float r3 = r12.getWidth()
            float r7 = r12.getHeight()
            r2.setSize(r3, r7)
            float r3 = r12.getOriginX()
            float r7 = r12.getOriginY()
            r2.setOrigin(r3, r7)
            com.badlogic.gdx.scenes.scene2d.Group r9 = new com.badlogic.gdx.scenes.scene2d.Group
            r9.<init>()
            r9.setTransform(r6)
            float r3 = r12.getOriginX()
            float r6 = r12.getOriginY()
            r9.setOrigin(r3, r6)
            r9.addActor(r12)
            r9.addActor(r2)
            r3 = r9
            r9 = r12
            goto L5df
        L5d7:
            r20 = r3
            r21 = r6
            r22 = r8
            r3 = 0
            r9 = r3
        L5df:
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.isPro()
            if (r2 == 0) goto L5e9
            r2 = 0
            goto L5f9
        L5e9:
            float r2 = r9.getY()
            float r6 = r9.getHeight()
            float r2 = r2 + r6
            r6 = 1097859072(0x41700000, float:15.0)
            float r7 = r0.mAssetScaling
            float r7 = r7 * r6
            float r2 = r2 + r7
        L5f9:
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r7 = r0._assetsRef
            java.lang.String r8 = "splashscreen/button_twitter.png"
            r11 = 0
            java.lang.Object r7 = r7.get(r8, r1, r11)
            com.badlogic.gdx.graphics.Texture r7 = (com.badlogic.gdx.graphics.Texture) r7
            r6.<init>(r7)
            float r7 = r6.getWidth()
            float r8 = r0.mAssetScaling
            float r7 = r7 * r8
            float r8 = r6.getHeight()
            float r11 = r0.mAssetScaling
            float r8 = r8 * r11
            r6.setSize(r7, r8)
            r7 = 0
            r6.setPosition(r7, r2)
            float r2 = r6.getWidth()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r7
            float r8 = r6.getHeight()
            float r8 = r8 * r7
            r6.setOrigin(r2, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r7 = r0._assetsRef
            java.lang.String r8 = "splashscreen/button_youtube.png"
            r11 = 0
            java.lang.Object r7 = r7.get(r8, r1, r11)
            com.badlogic.gdx.graphics.Texture r7 = (com.badlogic.gdx.graphics.Texture) r7
            r2.<init>(r7)
            float r7 = r2.getWidth()
            float r8 = r0.mAssetScaling
            float r7 = r7 * r8
            float r8 = r2.getHeight()
            float r11 = r0.mAssetScaling
            float r8 = r8 * r11
            r2.setSize(r7, r8)
            float r7 = r6.getX()
            float r8 = r6.getWidth()
            float r7 = r7 + r8
            float r7 = r7 + r14
            float r8 = r6.getY()
            r2.setPosition(r7, r8)
            float r7 = r2.getWidth()
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r11 = r2.getHeight()
            float r11 = r11 * r8
            r2.setOrigin(r7, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r8 = r0._assetsRef
            java.lang.String r11 = "splashscreen/button_website.png"
            r12 = 0
            java.lang.Object r8 = r8.get(r11, r1, r12)
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r7.<init>(r8)
            float r8 = r7.getWidth()
            float r11 = r0.mAssetScaling
            float r8 = r8 * r11
            float r11 = r7.getHeight()
            float r12 = r0.mAssetScaling
            float r11 = r11 * r12
            r7.setSize(r8, r11)
            float r8 = r2.getX()
            float r11 = r2.getWidth()
            float r8 = r8 + r11
            float r8 = r8 + r14
            float r11 = r2.getY()
            r7.setPosition(r8, r11)
            float r8 = r7.getWidth()
            r11 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r11
            float r12 = r7.getHeight()
            float r12 = r12 * r11
            r7.setOrigin(r8, r12)
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            boolean r8 = r8.isPro()
            if (r8 != 0) goto L6c8
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0.mGroupButtons
            r8.addActor(r3)
        L6c8:
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0.mGroupButtons
            r8.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0.mGroupButtons
            r8.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0.mGroupButtons
            r8.addActor(r7)
            float r8 = r6.getWidth()
            float r11 = r2.getWidth()
            float r8 = r8 + r11
            float r11 = r7.getWidth()
            float r8 = r8 + r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r14 * r11
            float r8 = r8 + r12
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupButtons
            float r12 = r5 - r8
            float r12 = r12 - r14
            float r13 = r15 + r14
            r11.setPosition(r12, r13)
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupButtons
            r12 = 0
            r11.setOrigin(r8, r12)
            float r8 = r6.getHeight()
            float r8 = r8 + r14
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupButtons
            float r11 = r11.getY()
            float r8 = r8 + r11
            org.fortheloss.framework.IPlatform r11 = org.fortheloss.sticknodes.App.platform
            boolean r11 = r11.isPro()
            if (r11 != 0) goto L714
            float r9 = r9.getHeight()
            float r9 = r9 + r14
            float r8 = r8 + r9
        L714:
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r11 = r0._assetsRef
            java.lang.String r12 = "splashscreen/icon_touch_pause.png"
            r13 = 0
            java.lang.Object r11 = r11.get(r12, r1, r13)
            com.badlogic.gdx.graphics.Texture r11 = (com.badlogic.gdx.graphics.Texture) r11
            r9.<init>(r11)
            r0.mImageTouchPause = r9
            float r11 = r9.getWidth()
            float r12 = r0.mAssetScaling
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageTouchPause
            float r12 = r12.getHeight()
            float r13 = r0.mAssetScaling
            float r12 = r12 * r13
            r9.setSize(r11, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageTouchPause
            float r11 = r9.getWidth()
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r12
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = r0.mImageTouchPause
            float r13 = r13.getHeight()
            float r13 = r13 * r12
            r9.setOrigin(r11, r13)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageTouchPause
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.setColor(r11, r11, r11, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageTouchPause
            float r11 = r9.getWidth()
            float r11 = r5 - r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = r0.mImageTouchPause
            float r12 = r12.getWidth()
            float r11 = r11 + r12
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1092616192(0x41200000, float:10.0)
            float r12 = r12 * r13
            float r11 = r11 + r12
            r9.setPosition(r11, r8)
            com.badlogic.gdx.scenes.scene2d.Group r8 = new com.badlogic.gdx.scenes.scene2d.Group
            r8.<init>()
            r0.mGroupLabel = r8
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r9 = r0._assetsRef
            java.lang.String r11 = "splashscreen/square.png"
            r12 = 0
            java.lang.Object r9 = r9.get(r11, r1, r12)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r8.<init>(r9)
            r8.setSize(r5, r15)
            r9 = 1061158912(0x3f400000, float:0.75)
            r11 = 0
            r8.setColor(r11, r11, r11, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r15 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r9 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r13 = 1
            java.lang.Object r9 = r12.get(r15, r9, r13)
            com.badlogic.gdx.graphics.g2d.BitmapFont r9 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r9
            com.badlogic.gdx.graphics.Color r12 = com.badlogic.gdx.graphics.Color.WHITE
            r11.<init>(r9, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform
            boolean r13 = r13.isPro()
            if (r13 == 0) goto L7b1
            java.lang.String r13 = "pro"
            goto L7b3
        L7b1:
            java.lang.String r13 = "free"
        L7b3:
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            r23 = r3
            r3 = 1
            int r15 = r15.get(r3)
            java.lang.String r3 = "allRightsReserved"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r24 = "privacyPolicy"
            r25 = r7
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r24)
            r24 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r26 = r6
            java.lang.String r6 = "Stick Nodes® ("
            r2.append(r6)
            r2.append(r13)
            java.lang.String r6 = ") 4.2.5 | © 2014-"
            r2.append(r6)
            r2.append(r15)
            java.lang.String r6 = " Ralph Damiano | "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r3 = " | "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " >"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.<init>(r2, r11)
            r2 = 12
            r9.setAlignment(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r11 = r5 * r2
            float r3 = r9.getWidth()
            float r3 = r3 * r2
            float r11 = r11 - r3
            float r3 = r8.getHeight()
            float r3 = r3 * r2
            float r6 = r9.getHeight()
            float r6 = r6 * r2
            float r3 = r3 - r6
            r9.setPosition(r11, r3)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.mGroupLabel
            r2.addActor(r8)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.mGroupLabel
            r2.addActor(r9)
            int r2 = r0.mSelectedCharacterIndex
            if (r2 < 0) goto L835
            int r2 = r2 + 1
        L835:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r3 = r0.mSelectedSplashCharacterData
            java.lang.String r3 = r3.name
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = " (#"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = " / 105)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r3 = r0.mSelectedSplashCharacterData
            java.lang.String r3 = r3.url
            if (r3 == 0) goto L878
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L878
            java.lang.String r3 = java.lang.System.lineSeparator()
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r6 = r0.mSelectedSplashCharacterData
            java.lang.String r6 = r6.url
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
        L878:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            java.lang.String r7 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r11 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r13 = 1
            java.lang.Object r6 = r6.get(r7, r11, r13)
            com.badlogic.gdx.graphics.g2d.BitmapFont r6 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r6
            r3.<init>(r6, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r6.<init>(r2, r3)
            r0.mCharLabel = r6
            r2 = 12
            r6.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.mCharLabel
            float r3 = r0.mAssetScaling
            r6 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r6
            float r7 = r8.getHeight()
            float r8 = r0.mAssetScaling
            float r8 = r8 * r6
            float r7 = r7 + r8
            r2.setPosition(r3, r7)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.mGroupLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0.mCharLabel
            r2.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r3 = r0._assetsRef
            java.lang.String r6 = "splashscreen/badge_tt.png"
            r7 = 0
            java.lang.Object r3 = r3.get(r6, r1, r7)
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r2.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r6 = r0._assetsRef
            java.lang.String r8 = "splashscreen/badge_mm.png"
            java.lang.Object r6 = r6.get(r8, r1, r7)
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r3.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r8 = r0._assetsRef
            java.lang.String r11 = "splashscreen/badge_si.png"
            java.lang.Object r8 = r8.get(r11, r1, r7)
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r6.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r11 = r0._assetsRef
            java.lang.String r12 = "splashscreen/badge_mom.png"
            java.lang.Object r11 = r11.get(r12, r1, r7)
            com.badlogic.gdx.graphics.Texture r11 = (com.badlogic.gdx.graphics.Texture) r11
            r8.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r11 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r13 = "splashscreen/badge_youtried.png"
            java.lang.Object r1 = r12.get(r13, r1, r7)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r11.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r0.mGroupBadges = r1
            float r12 = r0.mAssetScaling
            float r13 = r12 * r18
            r15 = 1125515264(0x43160000, float:150.0)
            float r12 = r12 * r15
            r1.setPosition(r13, r12)
            r1 = 1058642330(0x3f19999a, float:0.6)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r12 = r0.mSelectedSplashCharacterData
            int r12 = r12.badge
            r12 = r12 & 16
            if (r12 == 0) goto L951
            float r12 = r11.getWidth()
            float r13 = r0.mAssetScaling
            float r12 = r12 * r13
            float r12 = r12 * r1
            float r13 = r11.getHeight()
            float r15 = r0.mAssetScaling
            float r13 = r13 * r15
            float r13 = r13 * r1
            r11.setSize(r12, r13)
            float r12 = r11.getWidth()
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r13
            float r15 = r11.getHeight()
            float r15 = r15 * r13
            r11.setOrigin(r12, r15)
            r12 = 0
            r11.setY(r12)
            com.badlogic.gdx.scenes.scene2d.Group r13 = r0.mGroupBadges
            r13.addActor(r11)
            float r13 = r11.getHeight()
            float r13 = r13 + r12
            goto L952
        L951:
            r13 = 0
        L952:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r12 = r0.mSelectedSplashCharacterData
            int r12 = r12.badge
            r12 = r12 & 2
            if (r12 == 0) goto L98f
            float r12 = r2.getWidth()
            float r15 = r0.mAssetScaling
            float r12 = r12 * r15
            float r12 = r12 * r1
            float r15 = r2.getHeight()
            float r7 = r0.mAssetScaling
            float r15 = r15 * r7
            float r15 = r15 * r1
            r2.setSize(r12, r15)
            float r7 = r2.getWidth()
            r12 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r12
            float r15 = r2.getHeight()
            float r15 = r15 * r12
            r2.setOrigin(r7, r15)
            r2.setY(r13)
            com.badlogic.gdx.scenes.scene2d.Group r7 = r0.mGroupBadges
            r7.addActor(r2)
            float r7 = r2.getHeight()
            float r13 = r13 + r7
        L98f:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r7 = r0.mSelectedSplashCharacterData
            int r7 = r7.badge
            r7 = r7 & 4
            if (r7 == 0) goto L9cc
            float r7 = r3.getWidth()
            float r12 = r0.mAssetScaling
            float r7 = r7 * r12
            float r7 = r7 * r1
            float r12 = r3.getHeight()
            float r15 = r0.mAssetScaling
            float r12 = r12 * r15
            float r12 = r12 * r1
            r3.setSize(r7, r12)
            float r7 = r3.getWidth()
            r12 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r12
            float r15 = r3.getHeight()
            float r15 = r15 * r12
            r3.setOrigin(r7, r15)
            r3.setY(r13)
            com.badlogic.gdx.scenes.scene2d.Group r7 = r0.mGroupBadges
            r7.addActor(r3)
            float r7 = r3.getHeight()
            float r13 = r13 + r7
        L9cc:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r7 = r0.mSelectedSplashCharacterData
            int r7 = r7.badge
            r7 = r7 & 8
            if (r7 == 0) goto La09
            float r7 = r6.getWidth()
            float r12 = r0.mAssetScaling
            float r7 = r7 * r12
            float r7 = r7 * r1
            float r12 = r6.getHeight()
            float r15 = r0.mAssetScaling
            float r12 = r12 * r15
            float r12 = r12 * r1
            r6.setSize(r7, r12)
            float r7 = r6.getWidth()
            r12 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r12
            float r15 = r6.getHeight()
            float r15 = r15 * r12
            r6.setOrigin(r7, r15)
            r6.setY(r13)
            com.badlogic.gdx.scenes.scene2d.Group r7 = r0.mGroupBadges
            r7.addActor(r6)
            float r7 = r6.getHeight()
            float r13 = r13 + r7
        La09:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r7 = r0.mSelectedSplashCharacterData
            int r7 = r7.badge
            r7 = r7 & 32
            if (r7 == 0) goto La44
            float r7 = r8.getWidth()
            float r12 = r0.mAssetScaling
            float r7 = r7 * r12
            float r7 = r7 * r1
            float r12 = r8.getHeight()
            float r15 = r0.mAssetScaling
            float r12 = r12 * r15
            float r12 = r12 * r1
            r8.setSize(r7, r12)
            float r1 = r8.getWidth()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r7
            float r12 = r8.getHeight()
            float r12 = r12 * r7
            r8.setOrigin(r1, r12)
            r8.setY(r13)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupBadges
            r1.addActor(r8)
            r8.getHeight()
        La44:
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.mRandomizerWidgetRef
            r1.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r0.mGroupGlobe = r1
            r1.setOrigin(r4, r10)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupGlobe
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mImageGlobe
            r1.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupGlobe
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mImageBoat
            r1.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r0.mGroupPlane = r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mImagePlane
            r1.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r0.mGroupCharScale = r1
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.mCharActorRef
            float r7 = r7.getWidth()
            r12 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r12
            r12 = 0
            r1.setOrigin(r7, r12)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupCharScale
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.mCharActorRef
            r1.addActor(r7)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$4 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$4
            r1.<init>(r0)
            r0.mGroupParticles = r1
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$5 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$5
            r1.<init>(r0)
            r0.mGroupParticlesFront = r1
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupParticles
            r7 = r22
            r1.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupParticlesFront
            r1.setTouchable(r7)
            com.badlogic.gdx.scenes.scene2d.Group r1 = new com.badlogic.gdx.scenes.scene2d.Group
            r1.<init>()
            r0.mGroupEverything = r1
            r1.setOrigin(r4, r10)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageBros
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupGlobe
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupCharScale
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupBadges
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageFallers1
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupEverything
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageFallers2
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageSunbeams
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupParticles
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupEverything
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupParticlesFront
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageTouchPause
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupPlane
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageLogo
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupButtons
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupLabel
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r0._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImageBlackness
            r1.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupGlobe
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.sine
            r7 = 1077936128(0x40400000, float:3.0)
            r10 = 1090519040(0x41000000, float:8.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            r13 = -1056964608(0xffffffffc1000000, float:-8.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r13, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r12, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r12)
            r1.addAction(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageBoat
            com.badlogic.gdx.math.Interpolation$Exp r12 = com.badlogic.gdx.math.Interpolation.exp5
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r12)
            r13 = -1056964608(0xffffffffc1000000, float:-8.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r13, r7, r12)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r10, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r10)
            r13 = 1067450368(0x3fa00000, float:1.25)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r13, r10)
            r1.addAction(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageFallers1
            r10 = 1084227584(0x40a00000, float:5.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            r10 = -1063256064(0xffffffffc0a00000, float:-5.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r10)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r10)
            r15 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r15, r10)
            r1.addAction(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageFallers2
            r10 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r10)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r10)
            r15 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r15, r10)
            r1.addAction(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageBros
            r10 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r10, r7, r4)
            r13 = -1077936128(0xffffffffbfc00000, float:-1.5)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r13, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r15, r4)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r4)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r10, r4)
            r1.addAction(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageSunbeams
            r4 = -1045141914(0xffffffffc1b46666, float:-22.55)
            r13 = 1067450368(0x3fa00000, float:1.25)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r4, r13, r12)
            r12 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r12)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r4)
            r1.addAction(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mCharLabel
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r12)
            r12 = 1071644672(0x3fe00000, float:1.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r12)
            r7 = 1065353216(0x3f800000, float:1.0)
            r15 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r7, r15)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r13, r12)
            r1.addAction(r4)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupBadges
            com.badlogic.gdx.utils.SnapshotArray r1 = r1.getChildren()
            r7 = 0
            r12 = 1075838976(0x40200000, float:2.5)
        Lbf5:
            int r13 = r1.size
            r15 = 1036831949(0x3dcccccd, float:0.1)
            if (r7 >= r13) goto Lc58
            java.lang.Object r13 = r1.get(r7)
            com.badlogic.gdx.scenes.scene2d.Actor r13 = (com.badlogic.gdx.scenes.scene2d.Actor) r13
            r4 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r13.setColor(r10, r10, r10, r4)
            r13.setScale(r15, r15)
            r4 = 1084227584(0x40a00000, float:5.0)
            r13.setRotation(r4)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r12)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r10)
            r28 = r1
            com.badlogic.gdx.math.Interpolation$ElasticOut r1 = com.badlogic.gdx.math.Interpolation.elasticOut
            r29 = r9
            r9 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r10, r9, r1)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r15, r1)
            r13.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r12)
            r4 = -1054867456(0xffffffffc1200000, float:-10.0)
            com.badlogic.gdx.math.Interpolation r10 = com.badlogic.gdx.math.Interpolation.sine
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r4, r9, r10)
            r15 = 1092616192(0x41200000, float:10.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r15, r9, r10)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r10)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r4)
            r13.addAction(r1)
            r1 = 1048576000(0x3e800000, float:0.25)
            float r12 = r12 + r1
            int r7 = r7 + 1
            r1 = r28
            r9 = r29
            r10 = 1069547520(0x3fc00000, float:1.5)
            goto Lbf5
        Lc58:
            r29 = r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageSky
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.sine
            r7 = 1075838976(0x40200000, float:2.5)
            r9 = 1066192077(0x3f8ccccd, float:1.1)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r10 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r9, r9, r7, r4)
            r9 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r9, r9, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r10, r12)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r7)
            r1.addAction(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImagePlane
            float r7 = r0.mAssetScaling
            r9 = 1084227584(0x40a00000, float:5.0)
            float r7 = r7 * r9
            r9 = 1041865114(0x3e19999a, float:0.15)
            com.badlogic.gdx.math.Interpolation r10 = com.badlogic.gdx.math.Interpolation.sineOut
            r12 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r7, r9, r10)
            r9 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r13 = r0.mAssetScaling
            float r13 = r13 * r9
            r9 = 1041865114(0x3e19999a, float:0.15)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r13, r9, r10)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r7, r9)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r7)
            r1.addAction(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImagePlane
            r7 = 1109393408(0x42200000, float:40.0)
            float r9 = r0.mAssetScaling
            float r9 = r9 * r7
            r7 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r9, r12, r7, r4)
            r13 = -1038090240(0xffffffffc2200000, float:-40.0)
            float r15 = r0.mAssetScaling
            float r15 = r15 * r13
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r15, r12, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r7)
            r1.addAction(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageFallers1
            r7 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r9 = r0.mAssetScaling
            float r9 = r9 * r7
            r7 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r9, r7, r4)
            float r13 = r0.mAssetScaling
            float r13 = r13 * r18
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r13, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r9)
            r13 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r13, r9)
            r1.addAction(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageFallers2
            r9 = -1038090240(0xffffffffc2200000, float:-40.0)
            float r13 = r0.mAssetScaling
            float r13 = r13 * r9
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r13, r7, r4)
            r13 = 1109393408(0x42200000, float:40.0)
            float r15 = r0.mAssetScaling
            float r15 = r15 * r13
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r12, r15, r7, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r9)
            r1.addAction(r9)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupButtons
            r9 = 1067450368(0x3fa00000, float:1.25)
            r12 = 1066192077(0x3f8ccccd, float:1.1)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r12, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r7, r7, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r13, r15)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r13)
            r1.addAction(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageLogo
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r12, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r7, r7, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r12, r13)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r7 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r7)
            r1.addAction(r7)
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.mCharActorRef
            float r1 = r1.getScaleX()
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.mCharActorRef
            r12 = 1036831949(0x3dcccccd, float:0.1)
            float r15 = r1 + r12
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r15, r15, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1, r9, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r12, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r7.addAction(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = r0.mSelectedSplashCharacterData
            boolean r1 = r1.isCutoff
            if (r1 == 0) goto Ld65
            r1 = 1112014848(0x42480000, float:50.0)
            goto Ld67
        Ld65:
            r1 = 1125515264(0x43160000, float:150.0)
        Ld67:
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r0.mCharActorRef
            float r9 = -r1
            float r12 = r0.mAssetScaling
            float r9 = r9 * r12
            r12 = 1075838976(0x40200000, float:2.5)
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r9, r13, r12, r4)
            float r15 = r0.mAssetScaling
            float r1 = r1 * r15
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r1, r13, r12, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r7.addAction(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$6 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$6
            r1.<init>(r0)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$7 r7 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$7
            r7.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageSunbeams
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r13)
            r15 = 1051931443(0x3eb33333, float:0.35)
            r13 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r15, r13)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r12, r15)
            r9.addAction(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r0.mImageBlackness
            r12 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.math.Interpolation r13 = com.badlogic.gdx.math.Interpolation.linear
            r15 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r15, r12, r13)
            r9.addAction(r12)
            com.badlogic.gdx.scenes.scene2d.Group r9 = r0.mGroupEverything
            r12 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r12)
            r16 = 1106247680(0x41f00000, float:30.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r16)
            r16 = r11
            com.badlogic.gdx.math.Interpolation$ElasticOut r11 = com.badlogic.gdx.math.Interpolation.elasticOut
            r19 = r6
            r18 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r8, r8, r12, r11)
            r27 = r3
            r8 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r8, r12, r11)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r6, r3)
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            r28 = r2
            r2 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r8, r2, r10)
            r6 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6, r12, r11)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r13, r15, r3, r2, r8)
            r9.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers2
            float r2 = r2.getY()
            float r6 = r21 - r2
            float r2 = r0.mAssetScaling
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            float r6 = r6 - r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageFallers2
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r3)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r3, r6)
            r12 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r12)
            float r6 = -r6
            com.badlogic.gdx.math.Interpolation$SwingOut r15 = com.badlogic.gdx.math.Interpolation.swingOut
            r12 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r3, r6, r12, r15)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r13, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r6, r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r9, r3)
            r2.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            float r2 = r2.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mImagePlane
            float r3 = r3.getWidth()
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r6
            float r2 = r2 + r3
            float r2 = -r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mImagePlane
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r6)
            float r2 = -r2
            r9 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r6, r9, r15)
            r9 = 1071644672(0x3fe00000, float:1.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r9, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r2)
            r3.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageBros
            float r2 = r2.getHeight()
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r3
            float r2 = -r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mImageBros
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r6)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r2)
            r12 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r12)
            float r2 = -r2
            r12 = 1077936128(0x40400000, float:3.0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r2, r12, r10)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r9, r13, r2)
            r3.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageLogo
            float r2 = r2.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mImageLogo
            float r3 = r3.getWidth()
            r8 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r8
            float r2 = r2 + r3
            float r2 = -r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mImageLogo
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r6)
            float r2 = -r2
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r2, r6, r8, r11)
            r6 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r6, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r9, r2)
            r3.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r0.mCharActorRef
            float r2 = r2.getY()
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r0.mCharActorRef
            float r3 = r3.getHeight()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r6
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r0.mCharActorRef
            float r6 = r6.getScaleY()
            float r3 = r3 * r6
            float r2 = r2 + r3
            float r2 = -r2
            com.badlogic.gdx.scenes.scene2d.Group r3 = r0.mGroupCharScale
            r6 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6)
            r6 = 1071644672(0x3fe00000, float:1.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r6)
            r6 = 1061158912(0x3f400000, float:0.75)
            r12 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r12, r12, r6, r10)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r9, r13)
            r3.addAction(r6)
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r0.mCharActorRef
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r6)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r2)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r1)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r13 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r12)
            float r2 = -r2
            com.badlogic.gdx.math.Interpolation$ExpOut r12 = com.badlogic.gdx.math.Interpolation.exp10Out
            r21 = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r2, r4, r12)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r13, r2)
            r2 = 1071644672(0x3fe00000, float:1.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r2, r1)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r9, r1)
            r3.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.mRandomizerWidgetRef
            float r1 = r1.getScaleX()
            float r3 = r1 - r4
            float r3 = java.lang.Math.max(r2, r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r0.mRandomizerWidgetRef
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r6
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r1, r1)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r6, r6)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r3, r3, r2, r10)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r9, r3)
            com.badlogic.gdx.scenes.scene2d.actions.RunnableAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.run(r7)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r1, r2, r3, r6)
            r4.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupButtons
            float r1 = r1.getX()
            float r1 = r5 - r1
            float r2 = r0.mAssetScaling
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            float r1 = r1 + r2
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.mGroupButtons
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r1, r3)
            float r1 = -r1
            r6 = 1069547520(0x3fc00000, float:1.5)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r1, r3, r6, r11)
            r3 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r3, r1)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r1)
            r2.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageTouchPause
            float r2 = r1.getWidth()
            float r5 = r5 - r2
            float r5 = r5 - r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageTouchPause
            float r2 = r2.getY()
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r5, r2, r3, r15)
            r3 = 1071644672(0x3fe00000, float:1.75)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r3, r2)
            r1.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageTouchPause
            r2 = 1084227584(0x40a00000, float:5.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r2)
            r3 = -1054867456(0xffffffffc1200000, float:-10.0)
            r4 = r21
            r5 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r3, r5, r4)
            r6 = 1092616192(0x41200000, float:10.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r6, r5, r4)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r4)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r3)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r2, r3)
            r1.addAction(r2)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 != 0) goto L1005
            r1 = 1080033280(0x40600000, float:3.5)
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.mGroupButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r2 = r2.size
            r7 = 0
        Lfcc:
            if (r7 >= r2) goto L1005
            com.badlogic.gdx.scenes.scene2d.Group r3 = r0.mGroupButtons
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getChild(r7)
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.sineOut
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r6 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6, r5, r4)
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.sine
            r10 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r11 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r10, r5, r9)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r12 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r10)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r6, r6, r5, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r10, r10, r5, r9)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r11, r12, r4, r9)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r1, r4)
            r3.addAction(r4)
            r3 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 + r3
            int r7 = r7 + 1
            goto Lfcc
        L1005:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$8 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$8
            r1.<init>(r0)
            r2 = r28
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$9 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$9
            r1.<init>(r0)
            r2 = r27
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$10 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$10
            r1.<init>(r0)
            r2 = r19
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$11 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$11
            r1.<init>(r0)
            r2 = r18
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$12 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$12
            r1.<init>(r0)
            r2 = r16
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$13 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$13
            r1.<init>(r0)
            r2 = r29
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$14 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$14
            r1.<init>(r0)
            r2 = r26
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$15 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$15
            r1.<init>(r0)
            r2 = r24
            r2.addListener(r1)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$16 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$16
            r1.<init>(r0)
            r2 = r25
            r2.addListener(r1)
            if (r23 == 0) goto L106b
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$17 r1 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$17
            r1.<init>(r0)
            r3 = r23
            r3.addListener(r1)
        L106b:
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageTouchPause
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$18 r2 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$18
            r2.<init>(r0)
            r1.addListener(r2)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r1 = r0.mSelectedSplashCharacterData
            java.lang.String r1 = r1.url
            if (r1 == 0) goto L1090
            int r2 = r1.length()
            if (r2 <= 0) goto L1090
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$19 r2 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$19
            r2.<init>(r0, r1)
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.mCharActorRef
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.mCharLabel
            r1.addListener(r2)
        L1090:
            com.badlogic.gdx.utils.Pools.free(r20)
            return
    }

    private void explodePlane() {
            r22 = this;
            r0 = r22
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r1 = com.badlogic.gdx.graphics.Texture.class
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            if (r2 == 0) goto L6ce
            boolean r2 = r0.mDemonTriggered
            if (r2 == 0) goto L12
            goto L6ce
        L12:
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImagePlane
            r2.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageTouchPause
            r3 = 0
            if (r2 == 0) goto L34
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mImageTouchPause
            r4 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r3, r4)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r5)
            r2.addAction(r4)
        L34:
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r0._stageRef
            float r2 = r2.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r0.mImagePlane
            float r4 = r4.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r0.mImagePlane
            float r5 = r5.getWidth()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r4 = r4 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r0.mImagePlane
            float r5 = r5.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mImagePlane
            float r7 = r7.getHeight()
            float r7 = r7 * r6
            float r5 = r5 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r8 = r0._assetsRef
            java.lang.String r9 = "config/values.xml"
            r10 = 0
            java.lang.Object r8 = r8.get(r9, r1, r10)
            com.badlogic.gdx.graphics.Texture r8 = (com.badlogic.gdx.graphics.Texture) r8
            r7.<init>(r8)
            float r8 = r7.getWidth()
            float r11 = r0.mAssetScaling
            float r8 = r8 * r11
            float r11 = r7.getHeight()
            float r12 = r0.mAssetScaling
            float r11 = r11 * r12
            r7.setSize(r8, r11)
            float r8 = r7.getWidth()
            float r8 = r8 * r6
            float r8 = r4 - r8
            float r11 = r0.mAssetScaling
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r12
            float r8 = r8 - r11
            float r11 = r7.getHeight()
            float r11 = r11 * r6
            float r11 = r5 - r11
            r7.setPosition(r8, r11)
            float r8 = r0.mAssetScaling
            r11 = 1132756992(0x43848000, float:265.0)
            float r13 = r8 * r11
            r14 = 1132593152(0x43820000, float:260.0)
            float r8 = r8 * r14
            r7.setOrigin(r13, r8)
            r8 = 1053609165(0x3ecccccd, float:0.4)
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r7.setColor(r8, r8, r8, r13)
            r7.setScale(r13)
            r15 = 1124532224(0x43070000, float:135.0)
            r7.setRotation(r15)
            com.badlogic.gdx.scenes.scene2d.Group r15 = r0.mGroupPlane
            r15.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r3 = r0._assetsRef
            java.lang.Object r3 = r3.get(r9, r1, r10)
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r15.<init>(r3)
            float r3 = r15.getWidth()
            float r8 = r0.mAssetScaling
            float r3 = r3 * r8
            float r8 = r15.getHeight()
            float r12 = r0.mAssetScaling
            float r8 = r8 * r12
            r15.setSize(r3, r8)
            float r3 = r15.getWidth()
            float r3 = r3 * r6
            float r3 = r4 - r3
            float r8 = r0.mAssetScaling
            r12 = 1125515264(0x43160000, float:150.0)
            float r8 = r8 * r12
            float r3 = r3 + r8
            float r8 = r15.getHeight()
            float r8 = r8 * r6
            float r8 = r5 - r8
            float r12 = r0.mAssetScaling
            r18 = 1112014848(0x42480000, float:50.0)
            float r12 = r12 * r18
            float r8 = r8 + r12
            r15.setPosition(r3, r8)
            float r3 = r0.mAssetScaling
            float r8 = r3 * r11
            float r3 = r3 * r14
            r15.setOrigin(r8, r3)
            r3 = 1060320051(0x3f333333, float:0.7)
            r15.setColor(r3, r3, r3, r13)
            r3 = 1058642330(0x3f19999a, float:0.6)
            r15.setScale(r3)
            r3 = 1110704128(0x42340000, float:45.0)
            r15.setRotation(r3)
            com.badlogic.gdx.scenes.scene2d.Group r8 = r0.mGroupPlane
            r8.addActor(r15)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r8 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r3 = "config/config1.xml"
            java.lang.Object r3 = r12.get(r3, r1, r10)
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r8.<init>(r3)
            float r3 = r8.getWidth()
            float r12 = r0.mAssetScaling
            float r3 = r3 * r12
            float r12 = r8.getHeight()
            float r13 = r0.mAssetScaling
            float r12 = r12 * r13
            r8.setSize(r3, r12)
            float r3 = r8.getWidth()
            float r3 = r3 * r6
            float r3 = r4 - r3
            float r12 = r0.mAssetScaling
            r13 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r13
            float r3 = r3 + r12
            float r12 = r8.getHeight()
            float r12 = r12 * r6
            float r12 = r5 - r12
            float r13 = r0.mAssetScaling
            r17 = 1125515264(0x43160000, float:150.0)
            float r13 = r13 * r17
            float r12 = r12 + r13
            r8.setPosition(r3, r12)
            r3 = 1121714176(0x42dc0000, float:110.0)
            float r12 = r0.mAssetScaling
            float r3 = r3 * r12
            r13 = 1125646336(0x43180000, float:152.0)
            float r12 = r12 * r13
            r8.setOrigin(r3, r12)
            com.badlogic.gdx.scenes.scene2d.Group r3 = r0.mGroupPlane
            r3.addActor(r8)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r3 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r12 = r0._assetsRef
            java.lang.String r13 = "config/config2.xml"
            java.lang.Object r12 = r12.get(r13, r1, r10)
            com.badlogic.gdx.graphics.Texture r12 = (com.badlogic.gdx.graphics.Texture) r12
            r3.<init>(r12)
            float r12 = r3.getWidth()
            float r13 = r0.mAssetScaling
            float r12 = r12 * r13
            float r13 = r3.getHeight()
            float r14 = r0.mAssetScaling
            float r13 = r13 * r14
            r3.setSize(r12, r13)
            float r12 = r3.getWidth()
            float r12 = r12 * r6
            float r12 = r4 - r12
            r13 = 1132068864(0x437a0000, float:250.0)
            float r14 = r0.mAssetScaling
            float r14 = r14 * r13
            float r12 = r12 - r14
            float r13 = r3.getHeight()
            float r13 = r13 * r6
            float r13 = r5 - r13
            float r14 = r0.mAssetScaling
            float r14 = r14 * r18
            float r13 = r13 - r14
            r3.setPosition(r12, r13)
            r12 = 1118568448(0x42ac0000, float:86.0)
            float r13 = r0.mAssetScaling
            float r12 = r12 * r13
            r14 = 1124204544(0x43020000, float:130.0)
            float r13 = r13 * r14
            r3.setOrigin(r12, r13)
            com.badlogic.gdx.scenes.scene2d.Group r12 = r0.mGroupPlane
            r12.addActor(r3)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r12 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r13 = r0._assetsRef
            java.lang.String r14 = "config/config4.xml"
            java.lang.Object r13 = r13.get(r14, r1, r10)
            com.badlogic.gdx.graphics.Texture r13 = (com.badlogic.gdx.graphics.Texture) r13
            r12.<init>(r13)
            float r13 = r12.getWidth()
            float r14 = r0.mAssetScaling
            float r13 = r13 * r14
            float r14 = r12.getHeight()
            float r11 = r0.mAssetScaling
            float r14 = r14 * r11
            r12.setSize(r13, r14)
            float r11 = r12.getWidth()
            float r11 = r11 * r6
            float r11 = r4 - r11
            r13 = 1133903872(0x43960000, float:300.0)
            float r14 = r0.mAssetScaling
            float r14 = r14 * r13
            float r11 = r11 + r14
            float r13 = r12.getHeight()
            float r13 = r13 * r6
            float r13 = r5 - r13
            r12.setPosition(r11, r13)
            float r11 = r0.mAssetScaling
            r13 = 1128792064(0x43480000, float:200.0)
            float r14 = r11 * r13
            r20 = 1126170624(0x43200000, float:160.0)
            float r11 = r11 * r20
            r12.setOrigin(r14, r11)
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupPlane
            r11.addActor(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Image r11 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r14 = r0._assetsRef
            java.lang.Object r9 = r14.get(r9, r1, r10)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r11.<init>(r9)
            float r9 = r11.getWidth()
            float r14 = r0.mAssetScaling
            float r9 = r9 * r14
            float r14 = r11.getHeight()
            float r13 = r0.mAssetScaling
            float r14 = r14 * r13
            r11.setSize(r9, r14)
            float r9 = r11.getWidth()
            float r9 = r9 * r6
            float r9 = r4 - r9
            float r13 = r11.getHeight()
            float r13 = r13 * r6
            float r13 = r5 - r13
            r11.setPosition(r9, r13)
            float r9 = r0.mAssetScaling
            r13 = 1132756992(0x43848000, float:265.0)
            float r13 = r13 * r9
            r14 = 1132593152(0x43820000, float:260.0)
            float r9 = r9 * r14
            r11.setOrigin(r13, r9)
            r9 = 1065353216(0x3f800000, float:1.0)
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r11.setColor(r9, r9, r9, r13)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r11.setScale(r13)
            com.badlogic.gdx.scenes.scene2d.Group r13 = r0.mGroupPlane
            r13.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r14 = r0._assetsRef
            java.lang.String r9 = "config/keys.xml"
            java.lang.Object r9 = r14.get(r9, r1, r10)
            com.badlogic.gdx.graphics.Texture r9 = (com.badlogic.gdx.graphics.Texture) r9
            r13.<init>(r9)
            float r9 = r13.getWidth()
            float r14 = r0.mAssetScaling
            float r9 = r9 * r14
            float r14 = r13.getHeight()
            float r10 = r0.mAssetScaling
            float r14 = r14 * r10
            r13.setSize(r9, r14)
            float r9 = r13.getWidth()
            float r9 = r9 * r6
            float r9 = r4 - r9
            float r10 = r13.getHeight()
            float r10 = r10 * r6
            float r10 = r5 - r10
            r13.setPosition(r9, r10)
            r9 = 1135083520(0x43a80000, float:336.0)
            float r10 = r0.mAssetScaling
            float r9 = r9 * r10
            r14 = 1133051904(0x43890000, float:274.0)
            float r10 = r10 * r14
            r13.setOrigin(r9, r10)
            com.badlogic.gdx.scenes.scene2d.Group r9 = r0.mGroupPlane
            r9.addActor(r13)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r9 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r10 = r0._assetsRef
            java.lang.String r14 = "config/randomizer2.xml"
            r6 = 0
            java.lang.Object r10 = r10.get(r14, r1, r6)
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            r9.<init>(r10)
            float r6 = r9.getWidth()
            float r10 = r0.mAssetScaling
            float r6 = r6 * r10
            float r10 = r9.getHeight()
            float r14 = r0.mAssetScaling
            float r10 = r10 * r14
            r9.setSize(r6, r10)
            float r6 = r9.getWidth()
            r10 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r10
            float r6 = r4 - r6
            float r14 = r0.mAssetScaling
            r20 = 1128792064(0x43480000, float:200.0)
            float r14 = r14 * r20
            float r6 = r6 - r14
            float r14 = r9.getHeight()
            float r14 = r14 * r10
            float r10 = r5 - r14
            float r14 = r0.mAssetScaling
            r16 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 * r16
            float r10 = r10 + r14
            r9.setPosition(r6, r10)
            r6 = 1130496000(0x43620000, float:226.0)
            float r10 = r0.mAssetScaling
            float r6 = r6 * r10
            r14 = 1124859904(0x430c0000, float:140.0)
            float r10 = r10 * r14
            r9.setOrigin(r6, r10)
            com.badlogic.gdx.scenes.scene2d.Group r6 = r0.mGroupPlane
            r6.addActor(r9)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r6 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r10 = r0._assetsRef
            java.lang.String r14 = "config/randomizer3.xml"
            r21 = r11
            r11 = 0
            java.lang.Object r10 = r10.get(r14, r1, r11)
            com.badlogic.gdx.graphics.Texture r10 = (com.badlogic.gdx.graphics.Texture) r10
            r6.<init>(r10)
            float r10 = r6.getWidth()
            float r11 = r0.mAssetScaling
            float r10 = r10 * r11
            float r11 = r6.getHeight()
            float r14 = r0.mAssetScaling
            float r11 = r11 * r14
            r6.setSize(r10, r11)
            float r10 = r6.getWidth()
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r11
            float r10 = r4 - r10
            float r14 = r0.mAssetScaling
            r20 = 1128792064(0x43480000, float:200.0)
            float r14 = r14 * r20
            float r10 = r10 + r14
            float r14 = r6.getHeight()
            float r14 = r14 * r11
            float r11 = r5 - r14
            float r14 = r0.mAssetScaling
            r17 = 1125515264(0x43160000, float:150.0)
            float r14 = r14 * r17
            float r11 = r11 + r14
            r6.setPosition(r10, r11)
            r10 = 1124204544(0x43020000, float:130.0)
            float r11 = r0.mAssetScaling
            float r10 = r10 * r11
            r14 = 1126170624(0x43200000, float:160.0)
            float r11 = r11 * r14
            r6.setOrigin(r10, r11)
            com.badlogic.gdx.scenes.scene2d.Group r10 = r0.mGroupPlane
            r10.addActor(r6)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r10 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r11 = r0._assetsRef
            java.lang.String r14 = "config/config3.xml"
            r17 = r15
            r15 = 0
            java.lang.Object r11 = r11.get(r14, r1, r15)
            com.badlogic.gdx.graphics.Texture r11 = (com.badlogic.gdx.graphics.Texture) r11
            r10.<init>(r11)
            float r11 = r10.getWidth()
            float r14 = r0.mAssetScaling
            float r11 = r11 * r14
            float r14 = r10.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r10.setSize(r11, r14)
            float r11 = r10.getWidth()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r14
            float r11 = r4 - r11
            float r15 = r10.getHeight()
            float r15 = r15 * r14
            float r14 = r5 - r15
            float r15 = r0.mAssetScaling
            r16 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 * r16
            float r14 = r14 - r15
            r10.setPosition(r11, r14)
            r11 = 1126825984(0x432a0000, float:170.0)
            float r14 = r0.mAssetScaling
            float r11 = r11 * r14
            float r14 = r14 * r16
            r10.setOrigin(r11, r14)
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupPlane
            r11.addActor(r10)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r11 = new org.fortheloss.sticknodes.splashscreen2023.GravityObject
            org.fortheloss.framework.Assets r14 = r0._assetsRef
            java.lang.String r15 = "config/randomizer1.xml"
            r20 = r7
            r7 = 0
            java.lang.Object r14 = r14.get(r15, r1, r7)
            com.badlogic.gdx.graphics.Texture r14 = (com.badlogic.gdx.graphics.Texture) r14
            r11.<init>(r14)
            r0.mDio = r11
            float r7 = r11.getWidth()
            float r14 = r0.mAssetScaling
            float r7 = r7 * r14
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = r0.mDio
            float r14 = r14.getHeight()
            float r15 = r0.mAssetScaling
            float r14 = r14 * r15
            r11.setSize(r7, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mDio
            float r11 = r7.getWidth()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r14
            float r11 = r4 - r11
            com.badlogic.gdx.scenes.scene2d.ui.Image r15 = r0.mDio
            float r15 = r15.getHeight()
            float r15 = r15 * r14
            float r14 = r5 - r15
            r7.setPosition(r11, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0.mDio
            r11 = 1134100480(0x43990000, float:306.0)
            float r14 = r0.mAssetScaling
            float r11 = r11 * r14
            r15 = 1136328704(0x43bb0000, float:374.0)
            float r14 = r14 * r15
            r7.setOrigin(r11, r14)
            com.badlogic.gdx.scenes.scene2d.Group r7 = new com.badlogic.gdx.scenes.scene2d.Group
            r7.<init>()
            r0.mGroupDio = r7
            com.badlogic.gdx.scenes.scene2d.Group r11 = r0.mGroupPlane
            r11.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.Group r7 = r0.mGroupDio
            com.badlogic.gdx.scenes.scene2d.ui.Image r11 = r0.mDio
            r7.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.framework.Assets r11 = r0._assetsRef
            java.lang.String r14 = "config/keys.xml"
            r15 = 0
            java.lang.Object r1 = r11.get(r14, r1, r15)
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r7.<init>(r1)
            float r1 = r7.getWidth()
            float r11 = r0.mAssetScaling
            float r1 = r1 * r11
            float r11 = r7.getHeight()
            float r14 = r0.mAssetScaling
            float r11 = r11 * r14
            r7.setSize(r1, r11)
            float r1 = r7.getWidth()
            r11 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r11
            float r4 = r4 - r1
            float r1 = r7.getHeight()
            float r1 = r1 * r11
            float r5 = r5 - r1
            r7.setPosition(r4, r5)
            r1 = 1135083520(0x43a80000, float:336.0)
            float r4 = r0.mAssetScaling
            float r1 = r1 * r4
            r5 = 1133051904(0x43890000, float:274.0)
            float r4 = r4 * r5
            r7.setOrigin(r1, r4)
            r1 = 1061158912(0x3f400000, float:0.75)
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.setColor(r4, r4, r4, r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            r7.setScale(r1)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r0.mGroupPlane
            r4.addActor(r7)
            r4 = -1029701632(0xffffffffc2a00000, float:-80.0)
            float r5 = r0.mAssetScaling
            float r4 = r4 * r5
            r11 = -1035468800(0xffffffffc2480000, float:-50.0)
            float r5 = r5 * r11
            r11 = 1065017672(0x3f7ae148, float:0.98)
            r14 = 1065336439(0x3f7fbe77, float:0.999)
            r15 = 1086324736(0x40c00000, float:6.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r19 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r15)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r15 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r19)
            r8.addAction(r15)
            r15 = 1094713344(0x41400000, float:12.0)
            float r1 = r0.mAssetScaling
            float r1 = r1 * r15
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r8.setSpeedX(r1)
            r8 = 1109393408(0x42200000, float:40.0)
            float r15 = r0.mAssetScaling
            float r15 = r15 * r8
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r15)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r4, r11)
            float r8 = -r2
            r1.setRemoveThresholdY(r8)
            r1 = 1090519040(0x41000000, float:8.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r3.addAction(r1)
            r1 = -1049624576(0xffffffffc1700000, float:-15.0)
            float r15 = r0.mAssetScaling
            float r15 = r15 * r1
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r3.setSpeedX(r15)
            float r3 = r0.mAssetScaling
            r15 = 1110704128(0x42340000, float:45.0)
            float r3 = r3 * r15
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r3)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r4, r11)
            r1.setRemoveThresholdY(r8)
            r1 = -1050673152(0xffffffffc1600000, float:-14.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r12.addAction(r1)
            r1 = 1106247680(0x41f00000, float:30.0)
            float r3 = r0.mAssetScaling
            float r3 = r3 * r1
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r12.setSpeedX(r3)
            r3 = 1103626240(0x41c80000, float:25.0)
            float r12 = r0.mAssetScaling
            float r12 = r12 * r3
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r12)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r5, r11)
            r1.setRemoveThresholdY(r8)
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r9.addAction(r1)
            r1 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r3 = r0.mAssetScaling
            float r3 = r3 * r1
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r9.setSpeedX(r3)
            r3 = 1108082688(0x420c0000, float:35.0)
            float r9 = r0.mAssetScaling
            float r9 = r9 * r3
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r9)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r5, r11)
            r1.setRemoveThresholdY(r8)
            r1 = -1052770304(0xffffffffc1400000, float:-12.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r6.addAction(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            float r3 = r0.mAssetScaling
            float r3 = r3 * r1
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r6.setSpeedX(r3)
            r3 = 1108082688(0x420c0000, float:35.0)
            float r6 = r0.mAssetScaling
            float r6 = r6 * r3
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r6)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r5, r14)
            r1.setRemoveThresholdY(r8)
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r1)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r1)
            r10.addAction(r1)
            r1 = -1063256064(0xffffffffc0a00000, float:-5.0)
            float r3 = r0.mAssetScaling
            float r3 = r3 * r1
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r10.setSpeedX(r3)
            float r3 = r0.mAssetScaling
            r5 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 * r5
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setSpeedY(r3)
            org.fortheloss.sticknodes.splashscreen2023.GravityObject r1 = r1.setForces(r4, r11)
            r1.setRemoveThresholdY(r8)
            r1 = 1067450368(0x3fa00000, float:1.25)
            com.badlogic.gdx.math.Interpolation$ExpOut r3 = com.badlogic.gdx.math.Interpolation.exp10Out
            r4 = 1086324736(0x40c00000, float:6.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo(r4, r4, r1, r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r5, r4)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r6)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r4)
            r13.addAction(r1)
            r1 = 1069547520(0x3fc00000, float:1.5)
            r4 = 1069547520(0x3fc00000, float:1.5)
            r6 = 1077936128(0x40400000, float:3.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleBy(r1, r4, r6, r3)
            com.badlogic.gdx.math.Interpolation r4 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r5, r6, r4)
            r9 = 1140457472(0x43fa0000, float:500.0)
            float r10 = r0.mAssetScaling
            float r10 = r10 * r9
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r5, r10, r6, r9)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r8, r6)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r6)
            r6 = r20
            r6.addAction(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleBy(r1, r1, r1, r3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r5, r1, r4)
            r10 = 1138819072(0x43e10000, float:450.0)
            float r11 = r0.mAssetScaling
            float r11 = r11 * r10
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r5, r11, r1, r9)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r6, r8, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r6)
            r6 = r17
            r6.addAction(r1)
            r1 = 1075838976(0x40200000, float:2.5)
            r6 = 1075838976(0x40200000, float:2.5)
            r8 = 1073741824(0x40000000, float:2.0)
            com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleBy(r1, r6, r8, r3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r5, r8, r4)
            r6 = 1133903872(0x43960000, float:300.0)
            float r10 = r0.mAssetScaling
            float r10 = r10 * r6
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r5, r10, r8, r9)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r3, r6)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r3)
            r3 = r21
            r3.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupDio
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mDio
            float r3 = r3.getWidth()
            float r3 = -r3
            float r5 = r0.mAssetScaling
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            float r2 = r2 + r5
            r1.setPosition(r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mDio
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.sine
            r3 = 1101004800(0x41a00000, float:20.0)
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r3, r5, r2)
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.actions.RotateToAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo(r6, r5, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r5)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r3)
            r1.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mDio
            r3 = -1038090240(0xffffffffc2200000, float:-40.0)
            float r5 = r0.mAssetScaling
            float r5 = r5 * r3
            r3 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r5, r3, r2)
            r8 = 1109393408(0x42200000, float:40.0)
            float r10 = r0.mAssetScaling
            float r10 = r10 * r8
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r10, r3, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r5, r2)
            com.badlogic.gdx.scenes.scene2d.actions.RepeatAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.forever(r2)
            r1.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r0.mGroupDio
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0.mDio
            float r2 = r2.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r0.mDio
            float r3 = r3.getHeight()
            float r5 = r0.mAssetScaling
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            float r3 = r3 + r5
            float r3 = -r3
            r5 = 1084227584(0x40a00000, float:5.0)
            com.badlogic.gdx.scenes.scene2d.actions.MoveToAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(r2, r3, r5, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.actions.DelayAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.delay(r3, r2)
            r1.addAction(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageSky
            r2 = 0
            r1.setColor(r2, r2, r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.mImageSky
            com.badlogic.gdx.graphics.Color r3 = com.badlogic.gdx.graphics.Color.WHITE
            r6 = 1061158912(0x3f400000, float:0.75)
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r3, r6, r9)
            r1.addAction(r3)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r2, r1, r4)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r1, r3)
            r7.addAction(r1)
            com.badlogic.gdx.audio.Sound r1 = r0.mSoundExplosion
            if (r1 == 0) goto L6a8
            r1.play()
        L6a8:
            r0.mShakeTimer = r2
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mShakeSeconds = r1
            r1 = 1106247680(0x41f00000, float:30.0)
            float r3 = r0.mAssetScaling
            float r3 = r3 * r1
            r0.mShakeIntensity = r3
            float r1 = r0.mLeaveScreenSeconds
            float r3 = r0.mLeaveScreenTimer
            float r3 = r1 - r3
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 > 0) goto L6c3
            r3 = 1084227584(0x40a00000, float:5.0)
            goto L6cb
        L6c3:
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 >= 0) goto L6ca
            float r3 = r5 - r3
            goto L6cb
        L6ca:
            r3 = 0
        L6cb:
            float r1 = r1 + r3
            r0.mLeaveScreenSeconds = r1
        L6ce:
            return
    }

    private java.lang.String generateCharArray() {
            r3 = this;
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 104(0x68, float:1.46E-43)
        L6:
            if (r1 < 0) goto L11
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r0[r1] = r2
            int r1 = r1 + (-1)
            goto L6
        L11:
            r3.shuffleArray(r0)
            r1 = 44
            java.lang.String r0 = org.apache.commons.lang3.StringUtils.join(r0, r1)
            return r0
    }

    private com.badlogic.gdx.graphics.glutils.ShaderProgram getWhitenessShader() {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = new com.badlogic.gdx.graphics.glutils.ShaderProgram
            java.lang.String r1 = "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n"
            java.lang.String r2 = "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP\n#endif\nuniform sampler2D u_texture;\nuniform float u_whiteness;\nvarying vec2 v_texCoords;\nvarying LOWP vec4 v_color;\nvoid main()\n{\nvec4 tex = texture2D(u_texture, v_texCoords) * v_color;\ntex.r = tex.r + (1.0 - tex.r) * u_whiteness;\ntex.g = tex.g + (1.0 - tex.g) * u_whiteness;\ntex.b = tex.b + (1.0 - tex.b) * u_whiteness;\ngl_FragColor = tex;\n}"
            r0.<init>(r1, r2)
            boolean r1 = r0.isCompiled()
            if (r1 == 0) goto L10
            return r0
        L10:
            r0 = 0
            return r0
    }

    private void onPlaneTap() {
            r10 = this;
            int r0 = r10.mPlaneTaps
            r1 = 50
            if (r0 >= r1) goto Lcd
            boolean r2 = r10.mIsPaused
            if (r2 != 0) goto Lcd
            boolean r2 = r10.mDemonTriggered
            if (r2 != 0) goto Lcd
            boolean r2 = r10.mRickTriggered
            if (r2 == 0) goto L14
            goto Lcd
        L14:
            int r0 = r0 + 1
            r10.mPlaneTaps = r0
            if (r0 < r1) goto L1f
            r10.explodePlane()
            goto Lcd
        L1f:
            r1 = 5
            if (r0 >= r1) goto L23
            return
        L23:
            float r0 = r10.mLeaveScreenSeconds
            r2 = 1041865114(0x3e19999a, float:0.15)
            float r0 = r0 + r2
            r10.mLeaveScreenSeconds = r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r10.mCharActorRef
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r10.mCharLabel
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r10.mGroupBadges
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            int r0 = r10.mPlaneTaps
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = 1110704128(0x42340000, float:45.0)
            float r0 = r0 / r1
            r1 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r3)
            r1 = 359(0x167, float:5.03E-43)
            int r1 = com.badlogic.gdx.math.MathUtils.random(r1)
            float r1 = (float) r1
            r4 = 1112014848(0x42480000, float:50.0)
            float r4 = r4 * r0
            float r5 = r10.mAssetScaling
            float r4 = r4 * r5
            float r5 = com.badlogic.gdx.math.MathUtils.cosDeg(r1)
            float r5 = r5 * r4
            float r1 = com.badlogic.gdx.math.MathUtils.sinDeg(r1)
            float r1 = r1 * r4
            r4 = 20
            int r4 = com.badlogic.gdx.math.MathUtils.random(r4)
            int r4 = r4 + (-10)
            float r4 = (float) r4
            float r4 = r4 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = r10.mImagePlane
            com.badlogic.gdx.math.Interpolation$ExpOut r7 = com.badlogic.gdx.math.Interpolation.exp10Out
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r5, r1, r2, r7)
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.sineOut
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r4, r2, r9)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r8 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r8, r9)
            float r5 = -r5
            float r1 = -r1
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r5, r1, r2, r7)
            float r4 = -r4
            com.badlogic.gdx.math.Interpolation r5 = com.badlogic.gdx.math.Interpolation.sineIn
            com.badlogic.gdx.scenes.scene2d.actions.RotateByAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateBy(r4, r2, r5)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r1, r2)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r8, r1)
            r6.addAction(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r10.mImagePlane
            java.lang.Object r1 = r1.getUserObject()
            boolean r2 = r1 instanceof com.badlogic.gdx.scenes.scene2d.actions.ColorAction
            if (r2 == 0) goto Lab
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r10.mImagePlane
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r1 = (com.badlogic.gdx.scenes.scene2d.actions.ColorAction) r1
            r2.removeAction(r1)
        Lab:
            float r0 = r3 - r0
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r10.mImagePlane
            r2.setColor(r3, r0, r0, r3)
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.WHITE
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.linear
            com.badlogic.gdx.scenes.scene2d.actions.ColorAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.color(r0, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r10.mImagePlane
            r1.addAction(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r10.mImagePlane
            r1.setUserObject(r0)
        Lcd:
            return
    }

    private void remove(com.badlogic.gdx.scenes.scene2d.Actor r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1.clear()
            r1.remove()
            return
    }

    private void showAd() {
            r3 = this;
            r3.clearLayout()
            boolean r0 = org.fortheloss.sticknodes.App.isParroted
            r1 = 1
            if (r0 == 0) goto L9
            goto L23
        L9:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L22
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r2)
            java.lang.String r2 = "count"
            int r0 = r0.getInteger(r2, r1)
            if (r0 <= r1) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L2b
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.displayInterstitialAd(r3)
            goto L2e
        L2b:
            r3.onAdClosed()
        L2e:
            return
    }

    private void shuffleArray(java.lang.String[] r6) {
            r5 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r6.length
            int r1 = r1 + (-1)
        L8:
            if (r1 <= 0) goto L1b
            int r2 = r1 + 1
            int r2 = r0.nextInt(r2)
            r3 = r6[r2]
            r4 = r6[r1]
            r6[r2] = r4
            r6[r1] = r3
            int r1 = r1 + (-1)
            goto L8
        L1b:
            return
    }

    @Override // org.fortheloss.framework.AppScreen, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r3.clearLayout()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r3.mShaderWhiteTint
            r1 = 0
            if (r0 == 0) goto Ld
            r0.dispose()
            r3.mShaderWhiteTint = r1
        Ld:
            r3.mShaderGlitchRef = r1
            r3.mCharActorRef = r1
            r3.mRandomizerWidgetRef = r1
            r3.mCharLabel = r1
            r3.mAllSplashCharacterDatas = r1
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r3.mParticles
            if (r0 == 0) goto L33
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L31
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r2 = r3.mParticles
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.splashscreen2023.Particle r2 = (org.fortheloss.sticknodes.splashscreen2023.Particle) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L21
        L31:
            r3.mParticles = r1
        L33:
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r3.mParticlesFront
            if (r0 == 0) goto L4f
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L3d:
            if (r0 < 0) goto L4d
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r2 = r3.mParticlesFront
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.splashscreen2023.Particle r2 = (org.fortheloss.sticknodes.splashscreen2023.Particle) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L3d
        L4d:
            r3.mParticlesFront = r1
        L4f:
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void draw() {
            r2 = this;
            int r0 = r2._screenState
            r1 = 1
            if (r0 != r1) goto L9
            r2.renderLoadingTexture()
            goto L10
        L9:
            if (r0 != 0) goto L10
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            r0.draw()
        L10:
            return
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
            r19 = this;
            r1 = r19
            java.lang.String r2 = "SOUND ERROR"
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r3 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Class<com.badlogic.gdx.graphics.Texture> r4 = com.badlogic.gdx.graphics.Texture.class
            super.loadAssets()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "last_status_event"
            java.lang.String r6 = "SplashScreenNew.loadAssets()"
            r0.setCrashlyticsKeyString(r5, r6)
            boolean r5 = org.fortheloss.sticknodes.App.verifyPathsExist()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar
            r6.<init>()
            r6.setTime(r0)
            r0 = 11
            int r0 = r6.get(r0)
            r7 = 12
            int r7 = r6.get(r7)
            r8 = 9
            int r6 = r6.get(r8)
            r8 = 1
            r9 = 0
            if (r6 != 0) goto L3d
            r6 = 1
            goto L3e
        L3d:
            r6 = 0
        L3e:
            r10 = 3
            r11 = 2
            r12 = 0
            if (r5 == 0) goto L9d
            if (r6 == 0) goto L9d
            if (r0 != r11) goto L4b
            r6 = 58
            if (r7 >= r6) goto L4f
        L4b:
            if (r0 != r10) goto L9d
            if (r7 > r11) goto L9d
        L4f:
            r1.mRickTriggered = r8
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r0 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData
            java.lang.String r6 = "Rick Astley"
            java.lang.String r7 = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
            r0.<init>(r12, r6, r7, r9)
            r1.mSelectedSplashCharacterData = r0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L90
            java.lang.String r6 = "config/x64.build"
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r6)     // Catch: java.lang.Exception -> L90
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L90
            java.lang.String r7 = org.fortheloss.sticknodes.App.tempPath     // Catch: java.lang.Exception -> L90
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90
            r13.<init>()     // Catch: java.lang.Exception -> L90
            r13.append(r7)     // Catch: java.lang.Exception -> L90
            java.lang.String r7 = "rr.mp3"
            r13.append(r7)     // Catch: java.lang.Exception -> L90
            java.lang.String r7 = r13.toString()     // Catch: java.lang.Exception -> L90
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r7)     // Catch: java.lang.Exception -> L90
            r0.copyTo(r6)     // Catch: java.lang.Exception -> L90
            boolean r0 = r6.exists()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L172
            com.badlogic.gdx.Audio r0 = com.badlogic.gdx.Gdx.audio     // Catch: java.lang.Exception -> L90
            com.badlogic.gdx.audio.Music r0 = r0.newMusic(r6)     // Catch: java.lang.Exception -> L90
            r1.mMusicRickRoll = r0     // Catch: java.lang.Exception -> L90
            goto L172
        L90:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            r6.logNonFatalException(r0)
            r1.mMusicRickRoll = r12
            goto L172
        L9d:
            r19.buildCharacterDatas()
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r6 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r6)
            java.lang.String r6 = "splash2025CharArray"
            java.lang.String r7 = r0.getString(r6, r12)
            java.lang.String r13 = "splash2025CharIndex"
            r14 = -1
            int r15 = r0.getInteger(r13, r14)
            r10 = 105(0x69, float:1.47E-43)
            if (r7 == 0) goto Lbd
            if (r15 == r14) goto Lbd
            if (r15 < r10) goto Lc2
        Lbd:
            java.lang.String r7 = r19.generateCharArray()
            r15 = 0
        Lc2:
            java.lang.String r14 = ","
            java.lang.String[] r14 = r7.split(r14)     // Catch: java.lang.Exception -> Lcf
            r18 = r14[r15]     // Catch: java.lang.Exception -> Lcf
            int r17 = java.lang.Integer.parseInt(r18)     // Catch: java.lang.Exception -> Lcf
            goto Ld2
        Lcf:
            r14 = r12
            r17 = -1
        Ld2:
            if (r14 == 0) goto Ldb
            int r14 = r14.length
            if (r14 == r10) goto Ld8
            goto Ldb
        Ld8:
            r10 = r17
            goto Le8
        Ldb:
            java.lang.String r7 = r19.generateCharArray()
            r10 = 104(0x68, float:1.46E-43)
            int r17 = com.badlogic.gdx.math.MathUtils.random(r10)
            r10 = r17
            r15 = 0
        Le8:
            r0.putString(r6, r7)
            int r15 = r15 + r8
            r0.putInteger(r13, r15)
            java.lang.String r6 = "splash2023CharArray"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto Lfa
            r0.remove(r6)
        Lfa:
            java.lang.String r6 = "splash2023CharIndex"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L105
            r0.remove(r6)
        L105:
            java.lang.String r6 = "splashCharArray4"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L110
            r0.remove(r6)
        L110:
            java.lang.String r6 = "splashCharArray3"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L11b
            r0.remove(r6)
        L11b:
            java.lang.String r6 = "splashCharArray2"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L126
            r0.remove(r6)
        L126:
            java.lang.String r6 = "splashCharArray"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L131
            r0.remove(r6)
        L131:
            java.lang.String r6 = "splashPosInCharArray4"
            boolean r7 = r0.contains(r6)
            if (r7 == 0) goto L13c
            r0.remove(r6)
        L13c:
            java.lang.String r6 = "splashPosInCharArray3"
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L149
            java.lang.String r6 = "splashPosInCharArray3"
            r0.remove(r6)
        L149:
            java.lang.String r6 = "splashPosInCharArray2"
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L156
            java.lang.String r6 = "splashPosInCharArray2"
            r0.remove(r6)
        L156:
            java.lang.String r6 = "splashPosInCharArray"
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L163
            java.lang.String r6 = "splashPosInCharArray"
            r0.remove(r6)
        L163:
            r0.flush()
            r1.mSelectedCharacterIndex = r10
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData> r0 = r1.mAllSplashCharacterDatas
            java.lang.Object r0 = r0.get(r10)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r0 = (org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023.SplashCharacterData) r0
            r1.mSelectedSplashCharacterData = r0
        L172:
            if (r5 == 0) goto L1fa
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L1a7
            java.lang.String r5 = "config/node.js"
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r5)     // Catch: java.lang.Exception -> L1a7
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L1a7
            java.lang.String r6 = org.fortheloss.sticknodes.App.tempPath     // Catch: java.lang.Exception -> L1a7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1a7
            r7.<init>()     // Catch: java.lang.Exception -> L1a7
            r7.append(r6)     // Catch: java.lang.Exception -> L1a7
            java.lang.String r6 = "boom.mp3"
            r7.append(r6)     // Catch: java.lang.Exception -> L1a7
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L1a7
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)     // Catch: java.lang.Exception -> L1a7
            r0.copyTo(r5)     // Catch: java.lang.Exception -> L1a7
            boolean r0 = r5.exists()     // Catch: java.lang.Exception -> L1a7
            if (r0 == 0) goto L1b7
            com.badlogic.gdx.Audio r0 = com.badlogic.gdx.Gdx.audio     // Catch: java.lang.Exception -> L1a7
            com.badlogic.gdx.audio.Sound r0 = r0.newSound(r5)     // Catch: java.lang.Exception -> L1a7
            r1.mSoundExplosion = r0     // Catch: java.lang.Exception -> L1a7
            goto L1b7
        L1a7:
            r0 = move-exception
            java.io.PrintStream r5 = java.lang.System.out
            r5.println(r2)
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            r5.logNonFatalException(r0)
            r1.mSoundExplosion = r12
        L1b7:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L1ea
            java.lang.String r5 = "config/nodes.js"
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r5)     // Catch: java.lang.Exception -> L1ea
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L1ea
            java.lang.String r6 = org.fortheloss.sticknodes.App.tempPath     // Catch: java.lang.Exception -> L1ea
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1ea
            r7.<init>()     // Catch: java.lang.Exception -> L1ea
            r7.append(r6)     // Catch: java.lang.Exception -> L1ea
            java.lang.String r6 = "laugh.mp3"
            r7.append(r6)     // Catch: java.lang.Exception -> L1ea
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L1ea
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)     // Catch: java.lang.Exception -> L1ea
            r0.copyTo(r5)     // Catch: java.lang.Exception -> L1ea
            boolean r0 = r5.exists()     // Catch: java.lang.Exception -> L1ea
            if (r0 == 0) goto L1fa
            com.badlogic.gdx.Audio r0 = com.badlogic.gdx.Gdx.audio     // Catch: java.lang.Exception -> L1ea
            com.badlogic.gdx.audio.Sound r0 = r0.newSound(r5)     // Catch: java.lang.Exception -> L1ea
            r1.mSoundLaugh = r0     // Catch: java.lang.Exception -> L1ea
            goto L1fa
        L1ea:
            r0 = move-exception
            java.io.PrintStream r5 = java.lang.System.out
            r5.println(r2)
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.logNonFatalException(r0)
            r1.mSoundLaugh = r12
        L1fa:
            com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter r0 = new com.badlogic.gdx.assets.loaders.BitmapFontLoader$BitmapFontParameter
            r0.<init>()
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.minFilter = r2
            r0.magFilter = r2
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r5.load(r6, r3, r0, r8)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r6 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            r5.load(r6, r3, r0, r8)
            com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter r0 = new com.badlogic.gdx.assets.loaders.TextureLoader$TextureParameter
            r0.<init>()
            r0.magFilter = r2
            r0.minFilter = r2
            r0.genMipMaps = r9
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            java.lang.String r3 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r2 = r2.getPreferences(r3)
            java.lang.String r3 = "count"
            int r2 = r2.getInteger(r3, r8)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            int r5 = r1.mSelectedCharacterIndex
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "splash_char_id_was"
            r3.setCrashlyticsKeyString(r6, r5)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "open_count"
            r3.setCrashlyticsKeyString(r5, r2)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r2 = r1.mSelectedSplashCharacterData
            java.lang.String r2 = r2.filename
            java.lang.String r3 = "config/"
            r5 = 5
            if (r2 != 0) goto L2ac
            java.lang.String r2 = "orientation_settings.config"
            java.lang.String r6 = "cpu.arch"
            java.lang.String r7 = "web.services"
            java.lang.String r10 = "appBuild.config"
            java.lang.String r13 = "modularity.config"
            java.lang.String[] r2 = new java.lang.String[]{r2, r6, r7, r10, r13}
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r1.mRickTextures = r6
            r6 = 0
        L273:
            if (r6 >= r5) goto L2c2
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            r10 = r2[r6]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            com.badlogic.gdx.files.FileHandle r7 = r7.internal(r10)
            java.lang.String r7 = r7.readString()
            byte[] r7 = com.badlogic.gdx.utils.Base64Coder.decode(r7)
            com.badlogic.gdx.graphics.Texture r10 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r13 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            com.badlogic.gdx.graphics.Pixmap r14 = new com.badlogic.gdx.graphics.Pixmap
            int r15 = r7.length
            r14.<init>(r7, r9, r15)
            r13.<init>(r14, r12, r9, r8)
            r10.<init>(r13)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r7 = r1.mRickTextures
            r7.add(r10)
            int r6 = r6 + 1
            goto L273
        L2ac:
            org.fortheloss.framework.Assets r6 = r1._assetsRef
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "splashscreen/characters2025/"
            r7.append(r10)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r6.load(r2, r4, r0, r9)
        L2c2:
            int r2 = org.fortheloss.sticknodes.App.language_id
            r6 = 6
            if (r2 != r8) goto L2ca
            java.lang.String r2 = "es"
            goto L2ed
        L2ca:
            if (r2 != r5) goto L2cf
            java.lang.String r2 = "fl"
            goto L2ed
        L2cf:
            if (r2 != r11) goto L2d4
            java.lang.String r2 = "fr"
            goto L2ed
        L2d4:
            if (r2 != r6) goto L2d9
            java.lang.String r2 = "jp"
            goto L2ed
        L2d9:
            r5 = 3
            if (r2 != r5) goto L2df
            java.lang.String r2 = "pt"
            goto L2ed
        L2df:
            r5 = 7
            if (r2 != r5) goto L2e5
            java.lang.String r2 = "ru"
            goto L2ed
        L2e5:
            r5 = 4
            if (r2 != r5) goto L2eb
            java.lang.String r2 = "tr"
            goto L2ed
        L2eb:
            java.lang.String r2 = "en"
        L2ed:
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/boat.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/bros.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/fallers1.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/fallers2.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/globe.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/logo.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/plane.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/icon_touch_pause.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/sky.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/sunbeams.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/button_twitter.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/button_website.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.String r7 = "splashscreen/button_youtube.png"
            r5.load(r7, r4, r0, r9)
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            boolean r5 = r5.isPro()
            if (r5 != 0) goto L387
            org.fortheloss.framework.Assets r5 = r1._assetsRef
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "splashscreen/button_pro_"
            r7.append(r10)
            r7.append(r2)
            java.lang.String r2 = ".png"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r5.load(r2, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/button_pro_shine_1.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/button_pro_shine_2.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/button_pro_shine_3.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/button_pro_shine_4.png"
            r2.load(r5, r4, r0, r9)
        L387:
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/square.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/config1.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/config2.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/config3.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/config4.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/randomizer1.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/keys.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/randomizer2.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/randomizer3.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "config/values.xml"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/badge_tt.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/badge_mm.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/badge_si.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/badge_mom.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/badge_youtried.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random1.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random2.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random3.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random4.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random5.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random6.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random7.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r2 = r1._assetsRef
            java.lang.String r5 = "splashscreen/random/random8.png"
            r2.load(r5, r4, r0, r9)
            org.fortheloss.framework.Assets r0 = r1._assetsRef
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.String r4 = "splashscreen/particlesAtlas.txt"
            r0.load(r4, r2, r9)
            org.fortheloss.framework.Assets r0 = r1._assetsRef
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            java.lang.String r4 = "splashscreen/glitch.vert"
            r0.load(r4, r2, r9)
            java.lang.String r13 = "quantum_thread.lok"
            java.lang.String r14 = "neural_map.dat"
            java.lang.String r15 = "crypt_stream.cuh"
            java.lang.String r16 = "vector_cache.idx"
            java.lang.String r17 = "kernel_bridge.zys"
            java.lang.String r18 = "flux_router.conf"
            java.lang.String[] r0 = new java.lang.String[]{r13, r14, r15, r16, r17, r18}
            com.badlogic.gdx.utils.Array r2 = new com.badlogic.gdx.utils.Array
            r2.<init>()
            r1.mDemonTextures = r2
            r2 = 0
        L452:
            if (r2 >= r6) goto L48b
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            r5 = r0[r2]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.badlogic.gdx.files.FileHandle r4 = r4.internal(r5)
            java.lang.String r4 = r4.readString()
            byte[] r4 = com.badlogic.gdx.utils.Base64Coder.decode(r4)
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r7 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            com.badlogic.gdx.graphics.Pixmap r10 = new com.badlogic.gdx.graphics.Pixmap
            int r11 = r4.length
            r10.<init>(r4, r9, r11)
            r7.<init>(r10, r12, r9, r8)
            r5.<init>(r7)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r4 = r1.mDemonTextures
            r4.add(r5)
            int r2 = r2 + 1
            goto L452
        L48b:
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadingComplete() {
            r4 = this;
            super.loadingComplete()
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "SplashScreenNew.loadingComplete()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.framework.Assets r0 = r4._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r2 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            r3 = 1
            java.lang.Object r0 = r0.get(r1, r2, r3)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r0.getData()
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setLineHeight(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L31
            r1 = 1070386381(0x3fcccccd, float:1.6)
            r0.setScale(r1)
            goto L37
        L31:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.setScale(r1)
        L37:
            r4.createLayout()
            return
    }

    @Override // org.fortheloss.framework.IAdListener
    public void onAdClosed() {
            r1 = this;
            r0 = 1
            r1.mFlagGoToAnimationScreen = r0
            return
    }

    @Override // org.fortheloss.sticknodes.splashscreen2023.IEmitter
    public void removeParticle(org.fortheloss.sticknodes.splashscreen2023.Particle r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r1.mParticles
            r0.remove(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r1.mParticlesFront
            r0.remove(r2)
            r2.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void unloadAssets() {
            r7 = this;
            super.unloadAssets()
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            r2 = 1
            r0.unload(r1, r2)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            r0.unload(r1, r2)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r0 = r7.mRickTextures
            r1 = 0
            if (r0 == 0) goto L2d
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r0.next()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r3.dispose()
            goto L1b
        L2b:
            r7.mRickTextures = r1
        L2d:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r0 = r7.mDemonTextures
            if (r0 == 0) goto L47
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L35:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r3.dispose()
            goto L35
        L45:
            r7.mDemonTextures = r1
        L47:
            com.badlogic.gdx.audio.Sound r0 = r7.mSoundExplosion
            if (r0 == 0) goto L55
            r0.stop()
            com.badlogic.gdx.audio.Sound r0 = r7.mSoundExplosion
            r0.dispose()
            r7.mSoundExplosion = r1
        L55:
            com.badlogic.gdx.audio.Sound r0 = r7.mSoundLaugh
            if (r0 == 0) goto L63
            r0.stop()
            com.badlogic.gdx.audio.Sound r0 = r7.mSoundLaugh
            r0.dispose()
            r7.mSoundLaugh = r1
        L63:
            com.badlogic.gdx.audio.Music r0 = r7.mMusicRickRoll
            if (r0 == 0) goto L71
            r0.stop()
            com.badlogic.gdx.audio.Music r0 = r7.mMusicRickRoll
            r0.dispose()
            r7.mMusicRickRoll = r1
        L71:
            int r0 = org.fortheloss.sticknodes.App.language_id
            if (r0 != r2) goto L78
            java.lang.String r0 = "es"
            goto L9e
        L78:
            r2 = 5
            if (r0 != r2) goto L7e
            java.lang.String r0 = "fl"
            goto L9e
        L7e:
            r2 = 2
            if (r0 != r2) goto L84
            java.lang.String r0 = "fr"
            goto L9e
        L84:
            r2 = 6
            if (r0 != r2) goto L8a
            java.lang.String r0 = "jp"
            goto L9e
        L8a:
            r2 = 3
            if (r0 != r2) goto L90
            java.lang.String r0 = "pt"
            goto L9e
        L90:
            r2 = 7
            if (r0 != r2) goto L96
            java.lang.String r0 = "ru"
            goto L9e
        L96:
            r2 = 4
            if (r0 != r2) goto L9c
            java.lang.String r0 = "tr"
            goto L9e
        L9c:
            java.lang.String r0 = "en"
        L9e:
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023$SplashCharacterData r2 = r7.mSelectedSplashCharacterData
            r3 = 0
            if (r2 == 0) goto Lbd
            java.lang.String r2 = r2.filename
            if (r2 == 0) goto Lbd
            org.fortheloss.framework.Assets r4 = r7._assetsRef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "splashscreen/characters2025/"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.unload(r2, r3)
        Lbd:
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/boat.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/bros.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/fallers1.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/fallers2.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/globe.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/logo.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/plane.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/icon_touch_pause.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/sky.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/sunbeams.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/button_twitter.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/button_website.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.String r4 = "splashscreen/button_youtube.png"
            r2.unload(r4, r3)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.isPro()
            if (r2 != 0) goto L157
            org.fortheloss.framework.Assets r2 = r7._assetsRef
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "splashscreen/button_pro_"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ".png"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.unload(r0, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/button_pro_shine_1.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/button_pro_shine_2.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/button_pro_shine_3.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/button_pro_shine_4.png"
            r0.unload(r2, r3)
        L157:
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/square.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/config1.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/config2.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/config3.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/config4.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/randomizer1.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/keys.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/randomizer2.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/randomizer3.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/values.xml"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/badge_tt.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/badge_mm.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/badge_si.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/badge_mom.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/badge_youtried.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random1.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random2.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random3.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random4.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random5.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random6.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random7.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/random/random8.png"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/particlesAtlas.txt"
            r0.unload(r2, r3)
            org.fortheloss.framework.Assets r0 = r7._assetsRef
            java.lang.String r2 = "splashscreen/glitch.vert"
            r0.unload(r2, r3)
            r7.mSelectedSplashCharacterData = r1
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void update(float r8) {
            r7 = this;
            super.update(r8)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r7._stageRef
            r0.act(r8)
            float r0 = r7.mSecondsPassed
            float r0 = r0 + r8
            r7.mSecondsPassed = r0
            int r0 = r7._screenState
            if (r0 != 0) goto L10e
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r7.mParticles
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L19:
            if (r0 < 0) goto L29
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r2 = r7.mParticles
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.splashscreen2023.Particle r2 = (org.fortheloss.sticknodes.splashscreen2023.Particle) r2
            r2.act(r8)
            int r0 = r0 + (-1)
            goto L19
        L29:
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r0 = r7.mParticlesFront
            int r0 = r0.size()
            int r0 = r0 - r1
        L30:
            if (r0 < 0) goto L40
            java.util.ArrayList<org.fortheloss.sticknodes.splashscreen2023.Particle> r2 = r7.mParticlesFront
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.splashscreen2023.Particle r2 = (org.fortheloss.sticknodes.splashscreen2023.Particle) r2
            r2.act(r8)
            int r0 = r0 + (-1)
            goto L30
        L40:
            float r0 = r7.mShakeTimer
            float r2 = r7.mShakeSeconds
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L7f
            float r0 = r0 + r8
            r7.mShakeTimer = r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L58
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7.mGroupEverything
            r0.setPosition(r4, r4)
            goto L7f
        L58:
            float r0 = r0 / r2
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r4, r3)
            float r2 = r7.mShakeIntensity
            float r0 = r0 * r2
            r2 = 359(0x167, float:5.03E-43)
            int r2 = com.badlogic.gdx.math.MathUtils.random(r2)
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.Group r5 = r7.mGroupEverything
            float r6 = com.badlogic.gdx.math.MathUtils.cosDeg(r2)
            float r6 = r6 * r0
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
            float r2 = r2 * r0
            r5.setPosition(r6, r2)
        L7f:
            r0 = 1071644672(0x3fe00000, float:1.75)
            float r2 = r7.mLeaveScreenTimer
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L90
            float r2 = r2 - r0
            float r0 = r3 - r2
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r4, r3)
            r7.mWhiteTintValue = r0
        L90:
            float r0 = r7.mLeaveScreenSeconds
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto Lac
            float r2 = r7.mLeaveScreenTimer
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L9f
            float r2 = r2 + r8
            r7.mLeaveScreenTimer = r2
        L9f:
            float r8 = r7.mLeaveScreenTimer
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto Lac
            boolean r8 = r7.mIsPaused
            if (r8 != 0) goto Lac
            r7.beginTransition()
        Lac:
            boolean r8 = r7.mFlagGoToAnimationScreen
            if (r8 == 0) goto Ld2
            org.fortheloss.sticknodes.data.ProjectData r8 = new org.fortheloss.sticknodes.data.ProjectData
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = new org.fortheloss.sticknodes.animationscreen.FontLoader
            boolean r2 = org.fortheloss.sticknodes.App.isInternationalUI()
            r0.<init>(r2)
            r8.<init>(r0)
            r8.newProject()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen
            org.fortheloss.sticknodes.App r2 = r7._appRef
            r0.<init>(r2, r8, r1)
            org.fortheloss.sticknodes.App r8 = r7._appRef
            r8.setScreen(r0)
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.onAnimationScreenStart()
        Ld2:
            com.badlogic.gdx.Application r8 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r8 = r8.getType()
            com.badlogic.gdx.Application$ApplicationType r0 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r8 != r0) goto Lfc
            com.badlogic.gdx.Input r8 = com.badlogic.gdx.Gdx.input
            r0 = 46
            boolean r8 = r8.isKeyJustPressed(r0)
            if (r8 == 0) goto Lf0
            org.fortheloss.sticknodes.App r8 = r7._appRef
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r0 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023
            r0.<init>(r8)
            r8.setScreen(r0)
        Lf0:
            com.badlogic.gdx.Input r8 = com.badlogic.gdx.Gdx.input
            r0 = 131(0x83, float:1.84E-43)
            boolean r8 = r8.isKeyJustPressed(r0)
            if (r8 == 0) goto Lfc
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r1
        Lfc:
            boolean r8 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r8 == 0) goto L10e
            r8 = 0
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r8
            boolean r8 = r7.mExitRequested
            if (r8 != 0) goto L10e
            r7.mExitRequested = r1
            com.badlogic.gdx.Application r8 = com.badlogic.gdx.Gdx.app
            r8.exit()
        L10e:
            return
    }
}
