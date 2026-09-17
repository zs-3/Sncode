package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class App implements com.badlogic.gdx.ApplicationListener, org.fortheloss.framework.IAndroidStorageRequester {
    public static boolean BACK_KEY_PRESSED;
    public static final com.badlogic.gdx.graphics.Color COLOR_CAM_ONIONSKIN_GRAY = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_CAM_ONIONSKIN_RED = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_DARK_GRAY = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_DARK_RED = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_GREEN = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_LIGHT_BLUE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_LIGHT_GRAY = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_NODE_ACTIVE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_NODE_INACTIVE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_NODE_MAIN_ORANGE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_NODE_SELECTED = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_OFF_WHITE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_POLYFILL_DEFAULT = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_PURPLE = null;
    public static final com.badlogic.gdx.graphics.Color COLOR_RED = null;
    public static boolean STORAGE_LIMITED;
    private static int _maxNodesPerFrame;
    public static java.lang.String addTweenedFrameInstructionsTexture;
    public static java.lang.String androidFilesOpenWithTexture;
    public static java.lang.String animationMenuAtlas;
    public static java.lang.String animationMenuAtlas2;
    public static java.lang.String animationMenuAtlas3;
    public static java.lang.String animationMenuPNG;
    public static java.lang.String animationMenuPNG2;
    public static java.lang.String animationMenuPNG3;
    public static float assetScaling;
    public static byte[] b2;
    public static byte[] b4;
    private static com.badlogic.gdx.utils.I18NBundle bundle;
    public static java.lang.String colorPickerAtlas;
    public static java.lang.String colorPickerPNG;
    public static java.lang.String darkSkinFolder;
    public static java.lang.String drawToolsAtlas;
    public static java.lang.String easterEggAtlas;
    public static java.lang.String editButtonHideStickfiguresTexture;
    public static java.lang.String exportingAnimationAtlas;
    public static java.lang.String exportingAnimationPNG;
    public static java.lang.String exportsPath;
    public static java.lang.String fntDejavuSansCondensed;
    public static java.lang.String fntDejavuSansCondensedBig;
    public static java.lang.String fntDejavuSansCondensedInput;
    public static java.lang.String fntDejavuSansCondensedOutline;
    public static java.lang.String fntMeiryoInternational;
    public static java.lang.String fntTextfieldBoxAndyBoldDF;
    public static java.lang.String fntTextfieldBoxAsianDF;
    public static java.lang.String fntTextfieldBoxBeKindToTheEarthDF;
    public static java.lang.String fntTextfieldBoxCaptureItDF;
    public static java.lang.String fntTextfieldBoxComicSansDF;
    public static java.lang.String fntTextfieldBoxCoolveticaDF;
    public static java.lang.String fntTextfieldBoxDefaultDF;
    public static java.lang.String fntTextfieldBoxDeterminationDF;
    public static java.lang.String fntTextfieldBoxDigitalPlayDF;
    public static java.lang.String fntTextfieldBoxEnchantedLandDF;
    public static java.lang.String fntTextfieldBoxImpactDF;
    public static java.lang.String fntTextfieldBoxInternationalDF;
    public static java.lang.String fntTextfieldBoxMoonRunesDF;
    public static java.lang.String fntTextfieldBoxParametricGlitchDF;
    public static java.lang.String fntTextfieldBoxPusabDF;
    public static java.lang.String fntTextfieldBoxSugarAndVinegarDF;
    public static java.lang.String fntTextfieldBoxTypoRoundDF;
    public static java.lang.String fntTextfieldBoxVCROSDMonoDF;
    public static java.lang.String fntTextfieldBoxYolksEmoticonsDF;
    public static java.lang.String fntWatermarkDejavuSansCondensed;
    public static com.badlogic.gdx.InputMultiplexer inputMultiplexer;
    public static java.lang.String iosMailTexture;
    public static java.lang.String iosSoundInstructionsTexture;
    public static boolean isParroted;
    public static boolean isUsingCustomSkin;
    public static java.lang.String languageScreenAtlas;
    public static int language_id;
    public static java.lang.String loadingTexture;
    private static volatile long mainThreadId;
    public static java.lang.String mansionOfMayhemTexture;
    public static java.lang.String minigameAtlas1;
    public static java.lang.String minigameAtlas2;
    public static java.lang.String minigameAtlas3;
    public static java.lang.String minigameAtlas4;
    public static java.lang.String minigameAtlas5;
    public static java.lang.String minigameInstructionsTexture;
    public static java.lang.String minigameMusicDirectory;
    public static java.lang.String minigameSoundsDirectory;
    public static java.lang.String minigameTitleLogoTexture;
    public static java.lang.String minigameTitleRalphTexture;
    public static java.lang.String minigameTitleSeanTexture;
    public static java.lang.String movieclipsPath;
    public static org.fortheloss.framework.IPlatform platform;
    public static java.lang.String pleaseRateTexture;
    public static java.lang.String preferencesString;
    public static java.lang.String proAdMP4Texture;
    public static java.lang.String proAdSoundsTexture;
    public static java.lang.String proFiltersAtlas;
    public static java.lang.String proStoreAmazonTexture;
    public static java.lang.String proStoreAppStoreTexture;
    public static java.lang.String proStoreGooglePlayTexture;
    public static java.lang.String projectsPath;
    public static java.lang.String qrtAtlas;
    private static java.lang.String scratchPath;
    public static java.lang.String shaderAllColor;
    public static java.lang.String shaderArgb;
    public static java.lang.String shaderArgbAndUnpremultiply;
    public static java.lang.String shaderDropShadowHBlur;
    public static java.lang.String shaderDropShadowNoBlur;
    public static java.lang.String shaderDropShadowVBlur;
    public static java.lang.String shaderGaussianBlur;
    public static java.lang.String shaderHBlur;
    public static java.lang.String shaderHBlurAll;
    public static java.lang.String shaderHBlurInvert;
    public static java.lang.String shaderHGlow;
    public static java.lang.String shaderInvertColor;
    public static java.lang.String shaderMotionBlur;
    public static java.lang.String shaderMotionBlurAll;
    public static java.lang.String shaderMotionBlurInvert;
    public static java.lang.String shaderMotionBlurOneDirection;
    public static java.lang.String shaderMotionBlurOneDirectionAll;
    public static java.lang.String shaderMotionBlurOneDirectionInvert;
    public static java.lang.String shaderOutline;
    public static java.lang.String shaderPixelate;
    public static java.lang.String shaderRemoveColor;
    public static java.lang.String shaderVBlur;
    public static java.lang.String shaderVBlurAll;
    public static java.lang.String shaderVBlurInvert;
    public static java.lang.String shaderVGlow;
    public static java.lang.String skinPath;
    public static java.lang.String smartStretchInstructionsTexture;
    public static java.lang.String soundsPath;
    public static java.lang.String spriteMask1024Texture;
    public static java.lang.String spriteMask128Texture;
    public static java.lang.String spriteMask256Texture;
    public static java.lang.String spriteMask512Texture;
    public static java.lang.String spriteMask64Texture;
    public static java.lang.String spritesPath;
    public static java.lang.String stickfigureBackupsPath;
    public static java.lang.String stickfiguresPath;
    public static java.lang.String submitExampleMovieclipTexture;
    public static java.lang.String submitExamplePackTexture;
    public static java.lang.String submitRulesPic1Texture;
    public static java.lang.String submitRulesPic2Texture;
    public static java.lang.String submitThumbnailInstructionsTexture;
    public static java.lang.String tempPath;
    public static java.lang.String textfieldBoxDistanceFieldShader;
    public static java.lang.String tweenLoopProtectionTexture;
    public static java.lang.String uuid;
    private static boolean vibrationAllButtonsEnabled;
    public static int vibrationIntensity;
    private static boolean vibrationLongPressEnabled;
    private static boolean vibrationProcessCompleteEnabled;
    private static boolean vibrationQrtButtonsEnabled;
    private boolean _appBegan;
    private boolean _appPaused;
    private org.fortheloss.framework.Assets _assets;
    private com.badlogic.gdx.graphics.g2d.SpriteBatch _batch;
    private org.fortheloss.framework.AppScreen _currentScreen;
    private int _flagOutsideOpenRequest;
    private org.fortheloss.framework.IMP3FromURLDownloader _mp3FromURLDownloaderRef;
    private java.lang.String _outsideOpenRequestFilename;
    private com.badlogic.gdx.scenes.scene2d.Stage _stage;
    private boolean mInitialResizeOccurred;








    /* renamed from: -$$Nest$mpopulateWithDefaults, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m182$$Nest$mpopulateWithDefaults(org.fortheloss.sticknodes.App r0) {
            r0.populateWithDefaults()
            return
    }

    /* renamed from: -$$Nest$mpreBeginApp1, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m183$$Nest$mpreBeginApp1(org.fortheloss.sticknodes.App r0) {
            r0.preBeginApp1()
            return
    }

    /* renamed from: -$$Nest$mpreBeginApp2, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m184$$Nest$mpreBeginApp2(org.fortheloss.sticknodes.App r0) {
            r0.preBeginApp2()
            return
    }

    /* renamed from: -$$Nest$sfgetmainThreadId, reason: not valid java name */
    static /* bridge */ /* synthetic */ long m185$$Nest$sfgetmainThreadId() {
            long r0 = org.fortheloss.sticknodes.App.mainThreadId
            return r0
    }

    /* renamed from: -$$Nest$sfputmainThreadId, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m186$$Nest$sfputmainThreadId(long r0) {
            org.fortheloss.sticknodes.App.mainThreadId = r0
            return
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 1042536202(0x3e23d70a, float:0.16)
            r0.<init>(r1, r2, r3, r1)
            org.fortheloss.sticknodes.App.COLOR_RED = r0
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color
            r4 = 1059481190(0x3f266666, float:0.65)
            r5 = 1063675494(0x3f666666, float:0.9)
            r3.<init>(r4, r2, r5, r1)
            org.fortheloss.sticknodes.App.COLOR_PURPLE = r3
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color
            r3.<init>(r0)
            org.fortheloss.sticknodes.App.COLOR_NODE_SELECTED = r3
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            r6 = 1028443341(0x3d4ccccd, float:0.05)
            r0.<init>(r3, r4, r6, r1)
            org.fortheloss.sticknodes.App.COLOR_GREEN = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1061158912(0x3f400000, float:0.75)
            r4 = 1039516303(0x3df5c28f, float:0.12)
            r0.<init>(r3, r2, r4, r1)
            org.fortheloss.sticknodes.App.COLOR_DARK_RED = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1052938076(0x3ec28f5c, float:0.38)
            r0.<init>(r2, r3, r1, r1)
            org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1058474557(0x3f170a3d, float:0.59)
            r0.<init>(r2, r3, r1, r1)
            org.fortheloss.sticknodes.App.COLOR_LIGHT_BLUE = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1040187392(0x3e000000, float:0.125)
            r0.<init>(r3, r3, r3, r1)
            org.fortheloss.sticknodes.App.COLOR_DARK_GRAY = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1052770304(0x3ec00000, float:0.375)
            r0.<init>(r3, r3, r3, r1)
            org.fortheloss.sticknodes.App.COLOR_LIGHT_GRAY = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r5, r5, r5, r1)
            org.fortheloss.sticknodes.App.COLOR_OFF_WHITE = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.<init>(r4, r4, r4, r1)
            org.fortheloss.sticknodes.App.COLOR_NODE_INACTIVE = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r5 = 1055286886(0x3ee66666, float:0.45)
            r0.<init>(r1, r5, r2, r1)
            org.fortheloss.sticknodes.App.COLOR_NODE_MAIN_ORANGE = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r1, r2, r2, r4)
            org.fortheloss.sticknodes.App.COLOR_CAM_ONIONSKIN_RED = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r3, r3, r3, r4)
            org.fortheloss.sticknodes.App.COLOR_CAM_ONIONSKIN_GRAY = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r3 = 1051260355(0x3ea8f5c3, float:0.33)
            r4 = 1060823368(0x3f3ae148, float:0.73)
            r0.<init>(r3, r4, r1, r1)
            org.fortheloss.sticknodes.App.COLOR_POLYFILL_DEFAULT = r0
            r0 = 12800(0x3200, float:1.7937E-41)
            org.fortheloss.sticknodes.App._maxNodesPerFrame = r0
            r0 = -1
            org.fortheloss.sticknodes.App.language_id = r0
            java.lang.String r0 = "000000000000"
            org.fortheloss.sticknodes.App.uuid = r0
            r0 = 0
            org.fortheloss.sticknodes.App.isParroted = r0
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r0
            org.fortheloss.sticknodes.App.assetScaling = r2
            java.lang.String r1 = "animationMenuAtlas.png"
            org.fortheloss.sticknodes.App.animationMenuPNG = r1
            java.lang.String r1 = "animationMenuAtlas2.png"
            org.fortheloss.sticknodes.App.animationMenuPNG2 = r1
            java.lang.String r1 = "animationMenuAtlas3.png"
            org.fortheloss.sticknodes.App.animationMenuPNG3 = r1
            java.lang.String r1 = "colorPickerAtlas.png"
            org.fortheloss.sticknodes.App.colorPickerPNG = r1
            java.lang.String r1 = "exportingAnimationAtlas.png"
            org.fortheloss.sticknodes.App.exportingAnimationPNG = r1
            org.fortheloss.sticknodes.App.isUsingCustomSkin = r0
            java.lang.String r1 = "darkskin2/"
            org.fortheloss.sticknodes.App.darkSkinFolder = r1
            java.lang.String r1 = "atlases/minigameAtlas1.txt"
            org.fortheloss.sticknodes.App.minigameAtlas1 = r1
            java.lang.String r1 = "atlases/minigameAtlas2.txt"
            org.fortheloss.sticknodes.App.minigameAtlas2 = r1
            java.lang.String r1 = "atlases/minigameAtlas3.txt"
            org.fortheloss.sticknodes.App.minigameAtlas3 = r1
            java.lang.String r1 = "atlases/minigameAtlas4.txt"
            org.fortheloss.sticknodes.App.minigameAtlas4 = r1
            java.lang.String r1 = "atlases/minigameAtlas5.txt"
            org.fortheloss.sticknodes.App.minigameAtlas5 = r1
            java.lang.String r1 = "atlases/easterEggAtlas.txt"
            org.fortheloss.sticknodes.App.easterEggAtlas = r1
            java.lang.String r1 = "atlases/animationMenuAtlas.txt"
            org.fortheloss.sticknodes.App.animationMenuAtlas = r1
            java.lang.String r1 = "atlases/animationMenuAtlas2.txt"
            org.fortheloss.sticknodes.App.animationMenuAtlas2 = r1
            java.lang.String r1 = "atlases/animationMenuAtlas3.txt"
            org.fortheloss.sticknodes.App.animationMenuAtlas3 = r1
            java.lang.String r1 = "atlases/qrtAtlas.txt"
            org.fortheloss.sticknodes.App.qrtAtlas = r1
            java.lang.String r1 = "atlases/drawToolsAtlas.txt"
            org.fortheloss.sticknodes.App.drawToolsAtlas = r1
            java.lang.String r1 = "atlases/colorPickerAtlas.txt"
            org.fortheloss.sticknodes.App.colorPickerAtlas = r1
            java.lang.String r1 = "atlases/exportingAnimationAtlas.txt"
            org.fortheloss.sticknodes.App.exportingAnimationAtlas = r1
            java.lang.String r1 = "atlases/proFiltersAtlas.txt"
            org.fortheloss.sticknodes.App.proFiltersAtlas = r1
            java.lang.String r1 = "textures/pro/image-mp4.png"
            org.fortheloss.sticknodes.App.proAdMP4Texture = r1
            java.lang.String r1 = "textures/pro/image-sounds.png"
            org.fortheloss.sticknodes.App.proAdSoundsTexture = r1
            java.lang.String r1 = "textures/pro/store-amazon.png"
            org.fortheloss.sticknodes.App.proStoreAmazonTexture = r1
            java.lang.String r1 = "textures/pro/store-appstore.png"
            org.fortheloss.sticknodes.App.proStoreAppStoreTexture = r1
            java.lang.String r1 = "textures/pro/store-googleplay.png"
            org.fortheloss.sticknodes.App.proStoreGooglePlayTexture = r1
            java.lang.String r1 = "atlases/languageScreenAtlas.txt"
            org.fortheloss.sticknodes.App.languageScreenAtlas = r1
            java.lang.String r1 = "textures/iosSoundInstructions.png"
            org.fortheloss.sticknodes.App.iosSoundInstructionsTexture = r1
            java.lang.String r1 = "textures/tweenedFrameInstructions.png"
            org.fortheloss.sticknodes.App.addTweenedFrameInstructionsTexture = r1
            java.lang.String r1 = "textures/editButtonHideStickfigures.png"
            org.fortheloss.sticknodes.App.editButtonHideStickfiguresTexture = r1
            java.lang.String r1 = "textures/smartStretchInstructions.png"
            org.fortheloss.sticknodes.App.smartStretchInstructionsTexture = r1
            java.lang.String r1 = "textures/androidFilesOpenWithInstructions.png"
            org.fortheloss.sticknodes.App.androidFilesOpenWithTexture = r1
            java.lang.String r1 = "textures/minigame/minigameInstructions.png"
            org.fortheloss.sticknodes.App.minigameInstructionsTexture = r1
            java.lang.String r1 = "textures/minigame/title_logo.png"
            org.fortheloss.sticknodes.App.minigameTitleLogoTexture = r1
            java.lang.String r1 = "textures/minigame/title_ralph.png"
            org.fortheloss.sticknodes.App.minigameTitleRalphTexture = r1
            java.lang.String r1 = "textures/minigame/title_sean.png"
            org.fortheloss.sticknodes.App.minigameTitleSeanTexture = r1
            java.lang.String r1 = "textures/tweenLoopProtection.png"
            org.fortheloss.sticknodes.App.tweenLoopProtectionTexture = r1
            java.lang.String r1 = "textures/submitRulesPic1.png"
            org.fortheloss.sticknodes.App.submitRulesPic1Texture = r1
            java.lang.String r1 = "textures/submitRulesPic2.png"
            org.fortheloss.sticknodes.App.submitRulesPic2Texture = r1
            java.lang.String r1 = "textures/iosMailApp.png"
            org.fortheloss.sticknodes.App.iosMailTexture = r1
            java.lang.String r1 = "textures/submitThumbnailInstructionsTexture.png"
            org.fortheloss.sticknodes.App.submitThumbnailInstructionsTexture = r1
            java.lang.String r1 = "textures/submitExampleMovieclipTexture.png"
            org.fortheloss.sticknodes.App.submitExampleMovieclipTexture = r1
            java.lang.String r1 = "textures/submitExamplePackTexture.png"
            org.fortheloss.sticknodes.App.submitExamplePackTexture = r1
            java.lang.String r1 = "textures/fiveStarsPls.png"
            org.fortheloss.sticknodes.App.pleaseRateTexture = r1
            java.lang.String r1 = "textures/momPromo.png"
            org.fortheloss.sticknodes.App.mansionOfMayhemTexture = r1
            java.lang.String r1 = "textures/loading.png"
            org.fortheloss.sticknodes.App.loadingTexture = r1
            java.lang.String r1 = "fonts/dejavuSansCondensed.fnt"
            org.fortheloss.sticknodes.App.fntDejavuSansCondensed = r1
            java.lang.String r2 = "fonts/dejavuSansCondensedBig.fnt"
            org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig = r2
            java.lang.String r2 = "fonts/dejavuSansCondensedInput.fnt"
            org.fortheloss.sticknodes.App.fntDejavuSansCondensedInput = r2
            org.fortheloss.sticknodes.App.fntWatermarkDejavuSansCondensed = r1
            java.lang.String r1 = "fonts/dejavuSansCondensedOutline.fnt"
            org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline = r1
            java.lang.String r1 = "fonts/fntMeiryoInternational.fnt"
            org.fortheloss.sticknodes.App.fntMeiryoInternational = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxDefaultDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxDefaultDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxBeKindToTheEarthDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxBeKindToTheEarthDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxCaptureItDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxCaptureItDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxCoolveticaDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxCoolveticaDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxEnchantedLandDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxEnchantedLandDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxAsianDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxAsianDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxMoonRunesDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxMoonRunesDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxVCROSDMonoDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxVCROSDMonoDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxYolksEmoticonsDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxYolksEmoticonsDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxAndyBoldDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxAndyBoldDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxDigitalPlayDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxDigitalPlayDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxParametricGlitchDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxParametricGlitchDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxPusabDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxPusabDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxSugarAndVinegarDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxSugarAndVinegarDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxTypoRoundDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxTypoRoundDF = r1
            java.lang.String r1 = "fonts/textfieldBox/international/textfieldBoxInternationalDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxInternationalDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxDeterminationDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxDeterminationDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxComicSansDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxComicSansDF = r1
            java.lang.String r1 = "fonts/textfieldBox/textfieldBoxImpactDF.fnt"
            org.fortheloss.sticknodes.App.fntTextfieldBoxImpactDF = r1
            java.lang.String r1 = "minigame_sounds/"
            org.fortheloss.sticknodes.App.minigameSoundsDirectory = r1
            java.lang.String r1 = "minigame_music/"
            org.fortheloss.sticknodes.App.minigameMusicDirectory = r1
            java.lang.String r1 = "shaders/textfieldBoxDistanceField.frag"
            org.fortheloss.sticknodes.App.textfieldBoxDistanceFieldShader = r1
            java.lang.String r1 = "shaders/allColor.frag"
            org.fortheloss.sticknodes.App.shaderAllColor = r1
            java.lang.String r1 = "dropShadowHBlur"
            org.fortheloss.sticknodes.App.shaderDropShadowHBlur = r1
            java.lang.String r1 = "dropShadowVBlur"
            org.fortheloss.sticknodes.App.shaderDropShadowVBlur = r1
            java.lang.String r1 = "shaders/dropShadowNoBlur.frag"
            org.fortheloss.sticknodes.App.shaderDropShadowNoBlur = r1
            java.lang.String r1 = "shaders/invertColor.frag"
            org.fortheloss.sticknodes.App.shaderInvertColor = r1
            java.lang.String r1 = "shaders/outline.frag"
            org.fortheloss.sticknodes.App.shaderOutline = r1
            java.lang.String r1 = "shaders/hBlur.vert"
            org.fortheloss.sticknodes.App.shaderHBlur = r1
            java.lang.String r1 = "hBlurInvert"
            org.fortheloss.sticknodes.App.shaderHBlurInvert = r1
            java.lang.String r1 = "hBlurAll"
            org.fortheloss.sticknodes.App.shaderHBlurAll = r1
            java.lang.String r1 = "shaders/vBlur.vert"
            org.fortheloss.sticknodes.App.shaderVBlur = r1
            java.lang.String r1 = "vBlurInvert"
            org.fortheloss.sticknodes.App.shaderVBlurInvert = r1
            java.lang.String r1 = "vBlurAll"
            org.fortheloss.sticknodes.App.shaderVBlurAll = r1
            java.lang.String r1 = "shaders/motionBlur.vert"
            org.fortheloss.sticknodes.App.shaderMotionBlur = r1
            java.lang.String r1 = "motionBlurInvert"
            org.fortheloss.sticknodes.App.shaderMotionBlurInvert = r1
            java.lang.String r1 = "motionBlurAll"
            org.fortheloss.sticknodes.App.shaderMotionBlurAll = r1
            java.lang.String r1 = "shaders/motionBlurOneDirection.vert"
            org.fortheloss.sticknodes.App.shaderMotionBlurOneDirection = r1
            java.lang.String r1 = "motionBlurOneDirectionInvert"
            org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionInvert = r1
            java.lang.String r1 = "motionBlurOneDirectionAll"
            org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionAll = r1
            java.lang.String r1 = "shaders/pixelate.frag"
            org.fortheloss.sticknodes.App.shaderPixelate = r1
            java.lang.String r1 = "shaders/removeColor.frag"
            org.fortheloss.sticknodes.App.shaderRemoveColor = r1
            java.lang.String r1 = "shaders/hGlow.vert"
            org.fortheloss.sticknodes.App.shaderHGlow = r1
            java.lang.String r1 = "shaders/vGlow.vert"
            org.fortheloss.sticknodes.App.shaderVGlow = r1
            java.lang.String r1 = "shaders/blur_gaussian.frag"
            org.fortheloss.sticknodes.App.shaderGaussianBlur = r1
            java.lang.String r1 = "shaders/argbAndUnpremulitply.frag"
            org.fortheloss.sticknodes.App.shaderArgbAndUnpremultiply = r1
            java.lang.String r1 = "shaders/argb.frag"
            org.fortheloss.sticknodes.App.shaderArgb = r1
            java.lang.String r1 = "textures/spritemask1024.png"
            org.fortheloss.sticknodes.App.spriteMask1024Texture = r1
            java.lang.String r1 = "textures/spritemask512.png"
            org.fortheloss.sticknodes.App.spriteMask512Texture = r1
            java.lang.String r1 = "textures/spritemask256.png"
            org.fortheloss.sticknodes.App.spriteMask256Texture = r1
            java.lang.String r1 = "textures/spritemask128.png"
            org.fortheloss.sticknodes.App.spriteMask128Texture = r1
            java.lang.String r1 = "textures/spritemask64.png"
            org.fortheloss.sticknodes.App.spriteMask64Texture = r1
            org.fortheloss.sticknodes.App.vibrationAllButtonsEnabled = r0
            org.fortheloss.sticknodes.App.vibrationQrtButtonsEnabled = r0
            org.fortheloss.sticknodes.App.vibrationLongPressEnabled = r0
            org.fortheloss.sticknodes.App.vibrationProcessCompleteEnabled = r0
            org.fortheloss.sticknodes.App.vibrationIntensity = r0
            r0 = -1
            org.fortheloss.sticknodes.App.mainThreadId = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            org.fortheloss.sticknodes.App.b4 = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            org.fortheloss.sticknodes.App.b2 = r0
            return
    }

    public App(org.fortheloss.framework.IPlatform r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._flagOutsideOpenRequest = r0
            r0 = 0
            r1.mInitialResizeOccurred = r0
            r1._appBegan = r0
            r1._appPaused = r0
            org.fortheloss.sticknodes.App.platform = r2
            return
    }

    private void beginApp(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L13
            boolean r3 = verifyPathsExist()
            if (r3 == 0) goto L10
            org.fortheloss.sticknodes.App$5 r3 = new org.fortheloss.sticknodes.App$5
            r3.<init>(r2)
            r3.start()
        L10:
            deleteScratchFiles()
        L13:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r0 = org.fortheloss.sticknodes.App.isParroted
            if (r0 == 0) goto L1c
            java.lang.String r0 = "true"
            goto L1e
        L1c:
            java.lang.String r0 = "false"
        L1e:
            java.lang.String r1 = "parroted"
            r3.setCrashlyticsKeyString(r1, r0)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "app_version"
            r3.setCrashlyticsKeyString(r1, r0)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r0 = 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "app_build"
            r3.setCrashlyticsKeyString(r1, r0)
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            java.lang.String r0 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r3 = r3.getPreferences(r0)
            java.lang.String r0 = "language"
            r1 = -1
            int r3 = r3.getInteger(r0, r1)
            if (r3 != r1) goto L57
            org.fortheloss.sticknodes.LanguageSelectScreen r3 = new org.fortheloss.sticknodes.LanguageSelectScreen
            r3.<init>(r2)
            r2.setScreen(r3)
            goto L62
        L57:
            setLanguage(r3)
            org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023 r3 = new org.fortheloss.sticknodes.splashscreen2023.SplashScreen2023
            r3.<init>(r2)
            r2.setScreen(r3)
        L62:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 != 0) goto L6f
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r3.loadInterstitialAd()
        L6f:
            r3 = 1
            r2._appBegan = r3
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r0 = "App started!"
            r3.println(r0)
            return
    }

    public static boolean checkIfContainsNonsenseData(com.badlogic.gdx.files.FileHandle r6) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = r6.path()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Checking for leading nonsense data in "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.println(r1)
            r0 = 9
            byte[] r1 = new byte[r0]
            r2 = 0
            r6.readBytes(r1, r2, r0)
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.String r3 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  First 9 bytes are: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r6.println(r3)
            r6 = r1[r2]
            r3 = 1
            if (r6 != r3) goto L6a
            r6 = r1[r3]
            r4 = 2
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 3
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 4
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 5
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 6
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 7
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            r4 = 8
            if (r6 != r4) goto L6a
            r6 = r1[r4]
            if (r6 != r0) goto L6a
            r2 = 1
        L6a:
            if (r2 == 0) goto L74
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.String r0 = "  Contains nonsense data."
            r6.println(r0)
            goto L7b
        L74:
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.String r0 = "  Does NOT contain nonsense data."
            r6.println(r0)
        L7b:
            return r2
    }

    private static void createScratchFolder() {
            java.lang.String r0 = java.io.File.separator
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = r1.getExternalPath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "scratch_files"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L2b
            r1.mkdirs()
        L2b:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r2 != r3) goto L49
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L49
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.isChromebook()
            if (r2 == 0) goto L49
            r1.deleteDirectory()
            r1.mkdirs()
        L49:
            org.fortheloss.sticknodes.App.scratchPath = r0
            return
    }

    public static void deleteScratchFiles() {
            com.badlogic.gdx.files.FileHandle r0 = getScratchFolder()
            if (r0 == 0) goto L13
            boolean r1 = r0.exists()
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            r0.deleteDirectory()
            r0 = 0
            org.fortheloss.sticknodes.App.scratchPath = r0
        L13:
            return
    }

    public static java.lang.String formatBytes(long r3) {
            r0 = 1024(0x400, double:5.06E-321)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L12
            long r3 = r3 / r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            long r3 = r3 / r0
            java.lang.String r0 = "MB"
            goto L13
        Lf:
            java.lang.String r0 = "KB"
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.Long.toString(r3)
            r1.<init>(r3)
            int r3 = r1.length()
            int r3 = r3 + (-3)
        L22:
            if (r3 <= 0) goto L2c
            r4 = 44
            r1.insert(r3, r4)
            int r3 = r3 + (-3)
            goto L22
        L2c:
            if (r0 == 0) goto L31
            r1.append(r0)
        L31:
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static java.lang.String getFileExtension(java.lang.String r1) {
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 <= 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            return r1
    }

    public static long getMainThreadId() {
            long r0 = org.fortheloss.sticknodes.App.mainThreadId
            return r0
    }

    public static int getMaxNodesPerFrame() {
            int r0 = org.fortheloss.sticknodes.App._maxNodesPerFrame
            return r0
    }

    public static byte[] getPixmapBytesFromFile(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L2b
            java.lang.String r1 = org.fortheloss.sticknodes.App.scratchPath
            if (r1 != 0) goto L8
            goto L2b
        L8:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            com.badlogic.gdx.files.FileHandle r4 = r2.absolute(r4)
            if (r4 == 0) goto L2b
            boolean r1 = r4.exists()
            if (r1 != 0) goto L26
            goto L2b
        L26:
            byte[] r4 = r4.readBytes()
            return r4
        L2b:
            return r0
    }

    private static java.lang.String getRandomString(int r3) {
            r0 = 1
            r1 = 32
            int r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "_"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r1 = "-"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            r1 = 0
            java.lang.String r3 = r0.substring(r1, r3)
            java.lang.String r3 = r3.toUpperCase()
            return r3
    }

    private static com.badlogic.gdx.files.FileHandle getScratchFolder() {
            java.lang.String r0 = org.fortheloss.sticknodes.App.scratchPath
            if (r0 != 0) goto L7
            createScratchFolder()
        L7:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.scratchPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L23
            org.fortheloss.sticknodes.App.scratchPath = r2
            createScratchFolder()
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.scratchPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
        L23:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2a
            return r2
        L2a:
            return r0
    }

    public static byte[] inflate(byte[] r4) throws java.io.IOException, java.util.zip.DataFormatException {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r0.setInput(r4)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r4 = r4.length
            r1.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]
        L12:
            boolean r2 = r0.finished()
            if (r2 != 0) goto L21
            int r2 = r0.inflate(r4)
            r3 = 0
            r1.write(r4, r3, r2)
            goto L12
        L21:
            r1.close()
            byte[] r4 = r1.toByteArray()
            r0.end()
            return r4
    }

    public static boolean isInternationalUI() {
            com.badlogic.gdx.utils.I18NBundle r0 = org.fortheloss.sticknodes.App.bundle
            java.util.Locale r0 = r0.getLocale()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "jp"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "ru"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            return r0
    }

    public static boolean isMainThread() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r2 = org.fortheloss.sticknodes.App.mainThreadId
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static synchronized java.lang.String localize(java.lang.String r3) {
            java.lang.Class<org.fortheloss.sticknodes.App> r0 = org.fortheloss.sticknodes.App.class
            monitor-enter(r0)
            com.badlogic.gdx.utils.I18NBundle r1 = org.fortheloss.sticknodes.App.bundle     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto Lb
            java.lang.String r3 = ""
            monitor-exit(r0)
            return r3
        Lb:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r1.format(r3, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static synchronized java.lang.String localize(java.lang.String r2, java.lang.Object... r3) {
            java.lang.Class<org.fortheloss.sticknodes.App> r0 = org.fortheloss.sticknodes.App.class
            monitor-enter(r0)
            com.badlogic.gdx.utils.I18NBundle r1 = org.fortheloss.sticknodes.App.bundle     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lb
            java.lang.String r2 = ""
            monitor-exit(r0)
            return r2
        Lb:
            java.lang.String r2 = r1.format(r2, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static java.lang.String pixmapBytesToFile(byte[] r7) {
            com.badlogic.gdx.files.FileHandle r0 = getScratchFolder()
            r1 = 0
            if (r0 == 0) goto L58
            boolean r0 = r0.exists()
            if (r0 != 0) goto Le
            goto L58
        Le:
            r0 = 0
            r3 = r1
            r4 = r3
            r2 = 0
        L12:
            r5 = 5
            if (r2 >= r5) goto L4d
            r3 = 16
            java.lang.String r3 = getRandomString(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".pixmap"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.scratchPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r5)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L4a
            goto L4d
        L4a:
            int r2 = r2 + 1
            goto L12
        L4d:
            boolean r2 = r4.exists()
            if (r2 == 0) goto L54
            return r1
        L54:
            r4.writeBytes(r7, r0)
            return r3
        L58:
            return r1
    }

    private void populateWithDefaults() {
            r13 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6d
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.soundsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r3)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = "sounds"
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L6d
            boolean r4 = r3.exists()
            if (r4 == 0) goto L6d
            com.badlogic.gdx.files.FileHandle[] r4 = r0.list()
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            int r5 = r3.length
            r6 = 0
        L30:
            if (r6 >= r5) goto L6d
            r7 = r3[r6]
            java.lang.String r8 = r7.name()
            int r9 = r4.length
            r10 = 0
        L3a:
            if (r10 >= r9) goto L5a
            r11 = r4[r10]
            java.lang.String r11 = r11.name()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L58
            java.lang.String r11 = r7.extension()
            java.lang.String r12 = "mp3"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L55
            goto L58
        L55:
            int r10 = r10 + 1
            goto L3a
        L58:
            r8 = 1
            goto L5b
        L5a:
            r8 = 0
        L5b:
            if (r8 != 0) goto L6a
            r7.copyTo(r0)     // Catch: java.lang.Exception -> L61
            goto L6a
        L61:
            r7 = move-exception
            r7.printStackTrace()
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
        L6a:
            int r6 = r6 + 1
            goto L30
        L6d:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r3 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r3)
            if (r0 == 0) goto L81
            java.lang.String r3 = "persistentFiguresEnabled"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L81
            r0 = 1
            goto L82
        L81:
            r0 = 0
        L82:
            if (r0 == 0) goto L1c2
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.stickfiguresPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r3)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = "stickfigures"
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto Le7
            boolean r4 = r3.exists()
            if (r4 == 0) goto Le7
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            com.badlogic.gdx.files.FileHandle[] r4 = r0.list()
            int r5 = r3.length
            r6 = 0
        Laa:
            if (r6 >= r5) goto Le7
            r7 = r3[r6]
            java.lang.String r8 = r7.name()
            int r9 = r4.length
            r10 = 0
        Lb4:
            if (r10 >= r9) goto Ld4
            r11 = r4[r10]
            java.lang.String r11 = r11.name()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto Ld2
            java.lang.String r11 = r7.extension()
            java.lang.String r12 = "nodes"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto Lcf
            goto Ld2
        Lcf:
            int r10 = r10 + 1
            goto Lb4
        Ld2:
            r8 = 1
            goto Ld5
        Ld4:
            r8 = 0
        Ld5:
            if (r8 != 0) goto Le4
            r7.copyTo(r0)     // Catch: java.lang.Exception -> Ldb
            goto Le4
        Ldb:
            r7 = move-exception
            r7.printStackTrace()
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
        Le4:
            int r6 = r6 + 1
            goto Laa
        Le7:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r3)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = "movieclips"
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L14a
            boolean r4 = r3.exists()
            if (r4 == 0) goto L14a
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            com.badlogic.gdx.files.FileHandle[] r4 = r0.list()
            int r5 = r3.length
            r6 = 0
        L10d:
            if (r6 >= r5) goto L14a
            r7 = r3[r6]
            java.lang.String r8 = r7.name()
            int r9 = r4.length
            r10 = 0
        L117:
            if (r10 >= r9) goto L137
            r11 = r4[r10]
            java.lang.String r11 = r11.name()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L135
            java.lang.String r11 = r7.extension()
            java.lang.String r12 = "nodemc"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L132
            goto L135
        L132:
            int r10 = r10 + 1
            goto L117
        L135:
            r8 = 1
            goto L138
        L137:
            r8 = 0
        L138:
            if (r8 != 0) goto L147
            r7.copyTo(r0)     // Catch: java.lang.Exception -> L13e
            goto L147
        L13e:
            r7 = move-exception
            r7.printStackTrace()
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
        L147:
            int r6 = r6 + 1
            goto L10d
        L14a:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.spritesPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r3)
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = "sprites"
            com.badlogic.gdx.files.FileHandle r3 = r3.internal(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L1c2
            boolean r4 = r3.exists()
            if (r4 == 0) goto L1c2
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            com.badlogic.gdx.files.FileHandle[] r4 = r0.list()
            int r5 = r3.length
            r6 = 0
        L170:
            if (r6 >= r5) goto L1c2
            r7 = r3[r6]
            java.lang.String r8 = r7.name()
            int r9 = r4.length
            r10 = 0
        L17a:
            if (r10 >= r9) goto L18d
            r11 = r4[r10]
            java.lang.String r11 = r11.name()
            boolean r11 = r11.equalsIgnoreCase(r8)
            if (r11 == 0) goto L18a
            r9 = 1
            goto L18e
        L18a:
            int r10 = r10 + 1
            goto L17a
        L18d:
            r9 = 0
        L18e:
            if (r9 != 0) goto L1bf
            r7.copyTo(r0)     // Catch: java.lang.Exception -> L1b6
            org.fortheloss.framework.IPlatform r9 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> L1b6
            java.lang.String r10 = r0.path()     // Catch: java.lang.Exception -> L1b6
            java.lang.String r11 = java.io.File.separator     // Catch: java.lang.Exception -> L1b6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b6
            r12.<init>()     // Catch: java.lang.Exception -> L1b6
            r12.append(r10)     // Catch: java.lang.Exception -> L1b6
            r12.append(r11)     // Catch: java.lang.Exception -> L1b6
            r12.append(r8)     // Catch: java.lang.Exception -> L1b6
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Exception -> L1b6
            org.fortheloss.sticknodes.App$6 r10 = new org.fortheloss.sticknodes.App$6     // Catch: java.lang.Exception -> L1b6
            r10.<init>(r13, r7, r0)     // Catch: java.lang.Exception -> L1b6
            r9.saveImageToGallery(r8, r10)     // Catch: java.lang.Exception -> L1b6
            goto L1bf
        L1b6:
            r7 = move-exception
            r7.printStackTrace()
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
        L1bf:
            int r6 = r6 + 1
            goto L170
        L1c2:
            return
    }

    private void preBeginApp1() {
            r5 = this;
            long r0 = org.fortheloss.sticknodes.App.mainThreadId
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L18
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Main thread ID has NOT been grabbed yet, waiting 1 second to begin app..."
            r0.println(r1)
            org.fortheloss.sticknodes.App$4 r0 = new org.fortheloss.sticknodes.App$4
            r0.<init>(r5)
            r0.start()
            goto L38
        L18:
            java.io.PrintStream r0 = java.lang.System.out
            long r1 = org.fortheloss.sticknodes.App.mainThreadId
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Main thread ID has been grabbed already ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "), beginning app..."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.println(r1)
            r5.preBeginApp2()
        L38:
            return
    }

    private void preBeginApp2() {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Beginning app..."
            r0.println(r1)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto L14
            r0 = 1
            r2.beginApp(r0)
            goto L19
        L14:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            r0.androidRequestStoragePermission(r2)
        L19:
            return
    }

    public static void rotate(float[] r6, int r7) {
            int r0 = r6.length
            if (r0 != 0) goto L4
            return
        L4:
            float[] r1 = new float[r0]
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r0) goto L14
            int r4 = r3 + r7
            int r4 = r4 % r0
            r5 = r6[r3]
            r1[r4] = r5
            int r3 = r3 + 1
            goto L8
        L14:
            if (r2 >= r0) goto L1d
            r7 = r1[r2]
            r6[r2] = r7
            int r2 = r2 + 1
            goto L14
        L1d:
            return
    }

    public static void setLanguage(int r4) {
            if (r4 != 0) goto Lc
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "US"
            r0.<init>(r1, r2)
            goto L6f
        Lc:
            r0 = 1
            if (r4 != r0) goto L19
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "es"
            java.lang.String r2 = "ES"
            r0.<init>(r1, r2)
            goto L6f
        L19:
            r1 = 5
            if (r4 != r1) goto L26
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "fl"
            java.lang.String r2 = "FL"
            r0.<init>(r1, r2)
            goto L6f
        L26:
            r1 = 2
            if (r4 != r1) goto L33
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "fr"
            java.lang.String r2 = "FR"
            r0.<init>(r1, r2)
            goto L6f
        L33:
            r1 = 6
            if (r4 != r1) goto L43
            com.badlogic.gdx.utils.I18NBundle.setSimpleFormatter(r0)
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "jp"
            java.lang.String r2 = "JP"
            r0.<init>(r1, r2)
            goto L6f
        L43:
            r1 = 3
            if (r4 != r1) goto L50
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "pt"
            java.lang.String r2 = "PT"
            r0.<init>(r1, r2)
            goto L6f
        L50:
            r1 = 7
            if (r4 != r1) goto L61
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "ru"
            java.lang.String r3 = "RU"
            r1.<init>(r2, r3)
            com.badlogic.gdx.utils.I18NBundle.setSimpleFormatter(r0)
            r0 = r1
            goto L6f
        L61:
            r0 = 4
            if (r4 != r0) goto L6e
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "tr"
            java.lang.String r2 = "TR"
            r0.<init>(r1, r2)
            goto L6f
        L6e:
            r0 = 0
        L6f:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r1 = r1.getPreferences(r2)
            java.lang.String r2 = "language"
            r1.putInteger(r2, r4)
            r1.flush()
            org.fortheloss.sticknodes.App.language_id = r4
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Getting bundle that most closely matches the locale of "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = "i18n/SNBundle"
            com.badlogic.gdx.files.FileHandle r4 = r4.internal(r1)
            com.badlogic.gdx.utils.I18NBundle r4 = com.badlogic.gdx.utils.I18NBundle.createBundle(r4, r0)
            org.fortheloss.sticknodes.App.bundle = r4
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "current_language"
            r4.setCrashlyticsKeyString(r1, r0)
            return
    }

    public static void setUnlimitedNodesPerFrame(boolean r0) {
            if (r0 == 0) goto L8
            r0 = 999999(0xf423f, float:1.401297E-39)
            org.fortheloss.sticknodes.App._maxNodesPerFrame = r0
            goto Lc
        L8:
            r0 = 12800(0x3200, float:1.7937E-41)
            org.fortheloss.sticknodes.App._maxNodesPerFrame = r0
        Lc:
            return
    }

    public static void setVibrationEnabled(boolean r0, boolean r1, boolean r2, boolean r3, int r4) {
            org.fortheloss.sticknodes.App.vibrationAllButtonsEnabled = r0
            org.fortheloss.sticknodes.App.vibrationQrtButtonsEnabled = r1
            org.fortheloss.sticknodes.App.vibrationLongPressEnabled = r2
            org.fortheloss.sticknodes.App.vibrationProcessCompleteEnabled = r3
            org.fortheloss.sticknodes.App.vibrationIntensity = r4
            return
    }

    public static boolean verifyPathsExist() {
            r0 = 0
            boolean r0 = verifyPathsExist(r0)
            return r0
    }

    public static boolean verifyPathsExist(boolean r6) {
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            boolean r0 = r0.isExternalStorageAvailable()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = java.io.File.separator
            if (r6 == 0) goto L21
            r6 = 0
            org.fortheloss.sticknodes.App.skinPath = r6
            org.fortheloss.sticknodes.App.tempPath = r6
            org.fortheloss.sticknodes.App.exportsPath = r6
            org.fortheloss.sticknodes.App.stickfiguresPath = r6
            org.fortheloss.sticknodes.App.stickfigureBackupsPath = r6
            org.fortheloss.sticknodes.App.projectsPath = r6
            org.fortheloss.sticknodes.App.movieclipsPath = r6
            org.fortheloss.sticknodes.App.spritesPath = r6
            org.fortheloss.sticknodes.App.soundsPath = r6
        L21:
            java.lang.String r6 = org.fortheloss.sticknodes.App.skinPath
            if (r6 != 0) goto L41
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "skin"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            org.fortheloss.sticknodes.App.skinPath = r6
        L41:
            java.lang.String r6 = org.fortheloss.sticknodes.App.tempPath
            if (r6 != 0) goto L70
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "temp"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L6e
            r2.mkdirs()
        L6e:
            org.fortheloss.sticknodes.App.tempPath = r6
        L70:
            java.lang.String r6 = org.fortheloss.sticknodes.App.exportsPath
            if (r6 != 0) goto La9
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r3) goto L98
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "exports"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L98:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto La7
            r2.mkdirs()
        La7:
            org.fortheloss.sticknodes.App.exportsPath = r6
        La9:
            java.lang.String r6 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.String r2 = "stickfigures"
            if (r6 != 0) goto Le2
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r3 == r4) goto Ld1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
        Ld1:
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r6)
            boolean r4 = r3.exists()
            if (r4 != 0) goto Le0
            r3.mkdirs()
        Le0:
            org.fortheloss.sticknodes.App.stickfiguresPath = r6
        Le2:
            java.lang.String r6 = org.fortheloss.sticknodes.App.stickfigureBackupsPath
            if (r6 != 0) goto L134
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.iOS
            java.lang.String r5 = "backup"
            if (r3 == r4) goto L111
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r0)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            goto L123
        L111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L123:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L132
            r2.mkdirs()
        L132:
            org.fortheloss.sticknodes.App.stickfigureBackupsPath = r6
        L134:
            java.lang.String r6 = org.fortheloss.sticknodes.App.projectsPath
            if (r6 != 0) goto L18b
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r3) goto L15c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "projects"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L15c:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L16b
            r2.mkdirs()
        L16b:
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r3 != r4) goto L189
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L189
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isChromebook()
            if (r3 == 0) goto L189
            r2.deleteDirectory()
            r2.mkdirs()
        L189:
            org.fortheloss.sticknodes.App.projectsPath = r6
        L18b:
            java.lang.String r6 = org.fortheloss.sticknodes.App.movieclipsPath
            if (r6 != 0) goto L1e2
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r3) goto L1b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "movieclips"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L1b3:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L1c2
            r2.mkdirs()
        L1c2:
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r3 != r4) goto L1e0
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L1e0
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isChromebook()
            if (r3 == 0) goto L1e0
            r2.deleteDirectory()
            r2.mkdirs()
        L1e0:
            org.fortheloss.sticknodes.App.movieclipsPath = r6
        L1e2:
            java.lang.String r6 = org.fortheloss.sticknodes.App.spritesPath
            if (r6 != 0) goto L239
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r3) goto L20a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "sprites"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L20a:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r6)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L219
            r2.mkdirs()
        L219:
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r3 = r3.getType()
            com.badlogic.gdx.Application$ApplicationType r4 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r3 != r4) goto L237
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L237
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isChromebook()
            if (r3 == 0) goto L237
            r2.deleteDirectory()
            r2.mkdirs()
        L237:
            org.fortheloss.sticknodes.App.spritesPath = r6
        L239:
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            boolean r6 = r6.isPro()
            if (r6 == 0) goto L2a6
            java.lang.String r6 = org.fortheloss.sticknodes.App.soundsPath
            if (r6 != 0) goto L2a6
            org.fortheloss.framework.IPlatform r6 = org.fortheloss.sticknodes.App.platform
            java.lang.String r6 = r6.getExternalPath()
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r2 = r2.getType()
            com.badlogic.gdx.Application$ApplicationType r3 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r2 == r3) goto L269
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = "sounds"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
        L269:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r6)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L278
            r0.mkdirs()
        L278:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r2 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r0 != r2) goto L2a4
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Exception -> L2a4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a4
            r2.<init>()     // Catch: java.lang.Exception -> L2a4
            r2.append(r6)     // Catch: java.lang.Exception -> L2a4
            java.lang.String r3 = ".nomedia"
            r2.append(r3)     // Catch: java.lang.Exception -> L2a4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2a4
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r2)     // Catch: java.lang.Exception -> L2a4
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L2a4
            if (r2 != 0) goto L2a4
            java.lang.String r2 = " "
            r0.writeString(r2, r1)     // Catch: java.lang.Exception -> L2a4
        L2a4:
            org.fortheloss.sticknodes.App.soundsPath = r6
        L2a6:
            r6 = 1
            return r6
    }

    public static void vibrate(int r7) {
            int r0 = org.fortheloss.sticknodes.App.vibrationIntensity
            r1 = 1082130432(0x40800000, float:4.0)
            r2 = 1069547520(0x3fc00000, float:1.5)
            r3 = 1
            if (r0 != 0) goto Le
            r0 = 1069547520(0x3fc00000, float:1.5)
            r1 = 1069547520(0x3fc00000, float:1.5)
            goto L19
        Le:
            if (r0 != r3) goto L13
            r0 = 1075838976(0x40200000, float:2.5)
            goto L19
        L13:
            r0 = 1092616192(0x41200000, float:10.0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1 = 1092616192(0x41200000, float:10.0)
        L19:
            r2 = 1086324736(0x40c00000, float:6.0)
            r4 = 1077936128(0x40400000, float:3.0)
            r5 = 0
            if (r7 == r3) goto L69
            if (r7 != 0) goto L23
            goto L69
        L23:
            r3 = 2
            r6 = 3
            if (r7 == r3) goto L51
            if (r7 != r6) goto L2a
            goto L51
        L2a:
            r2 = 4
            if (r7 != r2) goto L3a
            boolean r7 = org.fortheloss.sticknodes.App.vibrationLongPressEnabled
            if (r7 == 0) goto L80
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            float r1 = r1 * r4
            int r0 = (int) r1
            r7.vibrate(r0, r5)
            goto L80
        L3a:
            boolean r7 = org.fortheloss.sticknodes.App.vibrationProcessCompleteEnabled
            if (r7 == 0) goto L80
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            r1 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r7.vibrate(r1, r5)
            org.fortheloss.sticknodes.App$7 r7 = new org.fortheloss.sticknodes.App$7
            r7.<init>(r0)
            r7.start()
            goto L80
        L51:
            boolean r0 = org.fortheloss.sticknodes.App.vibrationQrtButtonsEnabled
            if (r0 == 0) goto L80
            if (r7 != r6) goto L60
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            float r1 = r1 * r4
            int r0 = (int) r1
            r7.vibrate(r0, r5)
            goto L80
        L60:
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            float r1 = r1 * r2
            int r0 = (int) r1
            r7.vibrate(r0, r5)
            goto L80
        L69:
            boolean r0 = org.fortheloss.sticknodes.App.vibrationAllButtonsEnabled
            if (r0 == 0) goto L80
            if (r7 != r3) goto L78
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            float r1 = r1 * r4
            int r0 = (int) r1
            r7.vibrate(r0, r5)
            goto L80
        L78:
            com.badlogic.gdx.Input r7 = com.badlogic.gdx.Gdx.input
            float r1 = r1 * r2
            int r0 = (int) r1
            r7.vibrate(r0, r5)
        L80:
            return
    }

    public static boolean vibrationEnabledFor(int r1) {
            if (r1 == 0) goto L19
            r0 = 1
            if (r1 != r0) goto L6
            goto L19
        L6:
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 != r0) goto Ld
            goto L16
        Ld:
            r0 = 4
            if (r1 != r0) goto L13
            boolean r1 = org.fortheloss.sticknodes.App.vibrationLongPressEnabled
            return r1
        L13:
            boolean r1 = org.fortheloss.sticknodes.App.vibrationProcessCompleteEnabled
            return r1
        L16:
            boolean r1 = org.fortheloss.sticknodes.App.vibrationQrtButtonsEnabled
            return r1
        L19:
            boolean r1 = org.fortheloss.sticknodes.App.vibrationAllButtonsEnabled
            return r1
    }

    public static void writeFloatToOutputStream(float r0, java.io.OutputStream r1) throws java.io.IOException {
            int r0 = java.lang.Float.floatToIntBits(r0)
            writeIntToOutputStream(r0, r1)
            return
    }

    public static void writeIntToOutputStream(int r4, java.io.OutputStream r5) throws java.io.IOException {
            byte[] r0 = org.fortheloss.sticknodes.App.b4
            int r1 = r4 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            int r1 = r4 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3 = 1
            r0[r3] = r1
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3 = 2
            r0[r3] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1 = 3
            r0[r1] = r4
            r4 = 4
            r5.write(r0, r2, r4)
            return
    }

    public static void writeNonsenseData(java.io.OutputStream r3) throws java.io.IOException {
            r0 = 9
            byte[] r1 = new byte[r0]
            r1 = {x000c: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9} // fill-array
            r2 = 0
            r3.write(r1, r2, r0)
            return
    }

    public static void writeShortToOutputStream(short r3, java.io.OutputStream r4) throws java.io.IOException {
            byte[] r0 = org.fortheloss.sticknodes.App.b2
            int r1 = r3 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 1
            r0[r1] = r3
            r3 = 2
            r4.write(r0, r2, r3)
            return
    }

    public static java.io.File zipFiles(java.lang.String r9, java.lang.String[] r10, java.lang.String[] r11) throws java.io.IOException {
            int r0 = r10.length
            if (r0 > 0) goto L5
            r9 = 0
            return r9
        L5:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = org.fortheloss.sticknodes.App.tempPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r1.<init>(r9)
            java.util.zip.ZipOutputStream r9 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            r9.<init>(r2)
            r2 = 0
            r3 = 0
        L27:
            if (r3 >= r0) goto L8b
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            r5 = r10[r3]
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r5)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L38
            goto L88
        L38:
            if (r11 != 0) goto L3f
            java.lang.String r5 = r4.name()
            goto L41
        L3f:
            r5 = r11[r3]
        L41:
            java.lang.String r6 = getFileExtension(r5)
            r7 = 46
            int r7 = r5.lastIndexOf(r7)
            java.lang.String r5 = r5.substring(r2, r7)
            int r7 = r5.length()
            r8 = 1
            if (r7 <= r8) goto L62
            java.lang.String r5 = r5.trim()
            java.lang.String r7 = " +"
            java.lang.String r8 = " "
            java.lang.String r5 = r5.replaceAll(r7, r8)
        L62:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "."
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry
            r6.<init>(r5)
            r9.putNextEntry(r6)
            byte[] r4 = r4.readBytes()
            r9.write(r4)
            r9.closeEntry()
        L88:
            int r3 = r3 + 1
            goto L27
        L8b:
            r9.close()
            return r1
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void create() {
            r16 = this;
            r0 = r16
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.App$1 r2 = new org.fortheloss.sticknodes.App$1
            r2.<init>(r0)
            r1.postRunnable(r2)
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 1
            r5 = 1150681088(0x44960000, float:1200.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L21
            org.fortheloss.sticknodes.App.assetScaling = r2
            r1 = 1
            goto L26
        L21:
            r1 = 1056964608(0x3f000000, float:0.5)
            org.fortheloss.sticknodes.App.assetScaling = r1
            r1 = 0
        L26:
            com.badlogic.gdx.graphics.g2d.SpriteBatch r5 = new com.badlogic.gdx.graphics.g2d.SpriteBatch
            r6 = 500(0x1f4, float:7.0E-43)
            r5.<init>(r6)
            r0._batch = r5
            com.badlogic.gdx.scenes.scene2d.Stage r5 = new com.badlogic.gdx.scenes.scene2d.Stage
            com.badlogic.gdx.utils.viewport.ExtendViewport r7 = new com.badlogic.gdx.utils.viewport.ExtendViewport
            r8 = 1159069696(0x45160000, float:2400.0)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r9
            r10 = 1152647168(0x44b40000, float:1440.0)
            float r9 = r9 * r10
            r7.<init>(r8, r9)
            com.badlogic.gdx.graphics.g2d.SpriteBatch r8 = r0._batch
            r5.<init>(r7, r8)
            r0._stage = r5
            com.badlogic.gdx.graphics.Camera r5 = r5.getCamera()
            r5.update()
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r0._stage
            com.badlogic.gdx.graphics.g2d.Batch r5 = r5.getBatch()
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r0._stage
            com.badlogic.gdx.graphics.Camera r7 = r7.getCamera()
            com.badlogic.gdx.math.Matrix4 r7 = r7.combined
            r5.setProjectionMatrix(r7)
            com.badlogic.gdx.InputMultiplexer r5 = new com.badlogic.gdx.InputMultiplexer
            r5.<init>()
            org.fortheloss.sticknodes.App.inputMultiplexer = r5
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r0._stage
            r5.addProcessor(r7)
            com.badlogic.gdx.Input r5 = com.badlogic.gdx.Gdx.input
            com.badlogic.gdx.InputMultiplexer r7 = org.fortheloss.sticknodes.App.inputMultiplexer
            r5.setInputProcessor(r7)
            com.badlogic.gdx.Input r5 = com.badlogic.gdx.Gdx.input
            r7 = 4
            r5.setCatchKey(r7, r4)
            com.badlogic.gdx.InputMultiplexer r5 = org.fortheloss.sticknodes.App.inputMultiplexer
            org.fortheloss.sticknodes.App$2 r8 = new org.fortheloss.sticknodes.App$2
            r8.<init>(r0)
            r5.addProcessor(r3, r8)
            org.fortheloss.framework.Assets r5 = new org.fortheloss.framework.Assets
            r5.<init>(r1)
            r0._assets = r5
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r5 = 0
            r1.glClearColor(r5, r5, r5, r2)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L9a
            java.lang.String r1 = "org.fortheloss.sticknodespro"
            goto L9c
        L9a:
            java.lang.String r1 = "org.fortheloss.sticknodes"
        L9c:
            org.fortheloss.sticknodes.App.preferencesString = r1
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Preferences r1 = r2.getPreferences(r1)
            java.lang.String r2 = "count"
            int r5 = r1.getInteger(r2, r3)
            int r5 = r5 + r4
            r1.putInteger(r2, r5)
            java.lang.String r2 = "version"
            java.lang.String r8 = "4.2.5"
            r1.putString(r2, r8)
            int r2 = r5 + 5
            java.lang.String r8 = "validationNum"
            int r2 = r1.getInteger(r8, r2)
            r1.putInteger(r8, r2)
            r1.flush()
            r2 = 10
            if (r5 <= r2) goto Ld6
            java.lang.String r8 = "on310InstallCount"
            r9 = -1
            int r10 = r1.getInteger(r8, r9)
            if (r10 != r9) goto Ld6
            r1.putInteger(r8, r5)
            r1.flush()
        Ld6:
            r8 = 0
            java.lang.String r9 = "uidForCrashes"
            java.lang.String r8 = r1.getString(r9, r8)
            if (r8 != 0) goto L10c
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 16
            r10.<init>(r11)
            r11 = 0
        Lec:
            r12 = 12
            if (r11 >= r12) goto L102
            r12 = 45
            int r12 = r8.nextInt(r12)
            java.lang.String r13 = "0123456789ABCDEFGHIJKLMNPQRSTUVWXYZ0123456789"
            char r12 = r13.charAt(r12)
            r10.append(r12)
            int r11 = r11 + 1
            goto Lec
        L102:
            java.lang.String r8 = r10.toString()
            r1.putString(r9, r8)
            r1.flush()
        L10c:
            org.fortheloss.sticknodes.App.uuid = r8
            org.fortheloss.framework.IPlatform r9 = org.fortheloss.sticknodes.App.platform
            r9.analyticsSetUserID(r8)
            java.lang.String r8 = "hasCheckedOpenCount"
            boolean r9 = r1.getBoolean(r8, r3)
            java.lang.String r10 = "app_open_5000"
            java.lang.String r11 = "app_open_0003"
            java.lang.String r13 = "app_open_0002"
            r14 = 3
            java.lang.String r15 = "app_open_0001"
            r3 = 2
            r12 = 5
            java.lang.String r6 = "number_times_app_opened"
            if (r9 != 0) goto L1f8
            r1.putBoolean(r8, r4)
            r1.flush()
            if (r5 < r4) goto L135
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            r4.analyticsSendEvent(r15, r6)
        L135:
            if (r5 < r3) goto L13c
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r3.analyticsSendEvent(r13, r6)
        L13c:
            if (r5 < r14) goto L143
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r3.analyticsSendEvent(r11, r6)
        L143:
            if (r5 < r7) goto L14c
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r4 = "app_open_0004"
            r3.analyticsSendEvent(r4, r6)
        L14c:
            if (r5 < r12) goto L155
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.String r4 = "app_open_0005"
            r3.analyticsSendEvent(r4, r6)
        L155:
            if (r5 < r2) goto L15e
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0010"
            r2.analyticsSendEvent(r3, r6)
        L15e:
            r2 = 25
            if (r5 < r2) goto L169
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0025"
            r2.analyticsSendEvent(r3, r6)
        L169:
            r2 = 50
            if (r5 < r2) goto L174
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0050"
            r2.analyticsSendEvent(r3, r6)
        L174:
            r2 = 100
            if (r5 < r2) goto L17f
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0100"
            r2.analyticsSendEvent(r3, r6)
        L17f:
            r2 = 250(0xfa, float:3.5E-43)
            if (r5 < r2) goto L18a
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0250"
            r2.analyticsSendEvent(r3, r6)
        L18a:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r5 < r2) goto L195
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0500"
            r2.analyticsSendEvent(r3, r6)
        L195:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r2) goto L1a0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_1000"
            r2.analyticsSendEvent(r3, r6)
        L1a0:
            r2 = 1500(0x5dc, float:2.102E-42)
            if (r5 < r2) goto L1ab
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_1500"
            r2.analyticsSendEvent(r3, r6)
        L1ab:
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r5 < r2) goto L1b6
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_2000"
            r2.analyticsSendEvent(r3, r6)
        L1b6:
            r2 = 2500(0x9c4, float:3.503E-42)
            if (r5 < r2) goto L1c1
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_2500"
            r2.analyticsSendEvent(r3, r6)
        L1c1:
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r5 < r2) goto L1cc
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_3000"
            r2.analyticsSendEvent(r3, r6)
        L1cc:
            r2 = 3500(0xdac, float:4.905E-42)
            if (r5 < r2) goto L1d7
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_3500"
            r2.analyticsSendEvent(r3, r6)
        L1d7:
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r5 < r2) goto L1e2
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_4000"
            r2.analyticsSendEvent(r3, r6)
        L1e2:
            r2 = 4500(0x1194, float:6.306E-42)
            if (r5 < r2) goto L1ed
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_4500"
            r2.analyticsSendEvent(r3, r6)
        L1ed:
            r2 = 5000(0x1388, float:7.006E-42)
            if (r5 < r2) goto L2db
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.analyticsSendEvent(r10, r6)
            goto L2db
        L1f8:
            if (r5 != r4) goto L203
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.analyticsSendEvent(r15, r6)
        L1ff:
            r2 = 5000(0x1388, float:7.006E-42)
            goto L2d4
        L203:
            if (r5 != r3) goto L20b
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.analyticsSendEvent(r13, r6)
            goto L1ff
        L20b:
            if (r5 != r14) goto L213
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.analyticsSendEvent(r11, r6)
            goto L1ff
        L213:
            if (r5 != r7) goto L21d
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0004"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L21d:
            if (r5 != r12) goto L227
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0005"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L227:
            if (r5 != r2) goto L231
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0010"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L231:
            r2 = 25
            if (r5 != r2) goto L23d
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0025"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L23d:
            r2 = 50
            if (r5 != r2) goto L249
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0050"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L249:
            r2 = 100
            if (r5 != r2) goto L255
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0100"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L255:
            r2 = 250(0xfa, float:3.5E-43)
            if (r5 != r2) goto L261
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0250"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L261:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r5 != r2) goto L26d
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_0500"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L26d:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r2) goto L279
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_1000"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L279:
            r2 = 1500(0x5dc, float:2.102E-42)
            if (r5 != r2) goto L286
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_1500"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L286:
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r5 != r2) goto L293
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_2000"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L293:
            r2 = 2500(0x9c4, float:3.503E-42)
            if (r5 != r2) goto L2a0
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_2500"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L2a0:
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r5 != r2) goto L2ad
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_3000"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L2ad:
            r2 = 3500(0xdac, float:4.905E-42)
            if (r5 != r2) goto L2ba
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_3500"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L2ba:
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r5 != r2) goto L2c7
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_4000"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L2c7:
            r2 = 4500(0x1194, float:6.306E-42)
            if (r5 != r2) goto L1ff
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "app_open_4500"
            r2.analyticsSendEvent(r3, r6)
            goto L1ff
        L2d4:
            if (r5 != r2) goto L2db
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            r2.analyticsSendEvent(r10, r6)
        L2db:
            r0.getMiscStatAnalytics(r1)
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            r1.setupKeyboard()
            r1 = 0
            r0._appBegan = r1
            boolean r1 = r0.mInitialResizeOccurred
            if (r1 != 0) goto L2fa
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Resize has NOT occurred yet, waiting 1 second to begin app..."
            r1.println(r2)
            org.fortheloss.sticknodes.App$3 r1 = new org.fortheloss.sticknodes.App$3
            r1.<init>(r0)
            r1.start()
            goto L304
        L2fa:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Resize has occurred already, beginning app..."
            r1.println(r2)
            r16.preBeginApp1()
        L304:
            return
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void dispose() {
            r2 = this;
            deleteScratchFiles()
            org.fortheloss.framework.AppScreen r0 = r2._currentScreen
            r1 = 0
            if (r0 == 0) goto Ld
            r0.dispose()
            r2._currentScreen = r1
        Ld:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stage
            if (r0 == 0) goto L16
            r0.dispose()
            r2._stage = r1
        L16:
            com.badlogic.gdx.graphics.g2d.SpriteBatch r0 = r2._batch
            if (r0 == 0) goto L1f
            r0.dispose()
            r2._batch = r1
        L1f:
            org.fortheloss.framework.Assets r0 = r2._assets
            if (r0 == 0) goto L28
            r0.dispose()
            r2._assets = r1
        L28:
            r2._outsideOpenRequestFilename = r1
            return
    }

    public void errorFromPlatform(java.lang.String r2) {
            r1 = this;
            r0 = 7
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public org.fortheloss.framework.Assets getAssets() {
            r1 = this;
            org.fortheloss.framework.Assets r0 = r1._assets
            return r0
    }

    public org.fortheloss.framework.IMP3FromURLDownloader getMP3FromURLDownlaoder() {
            r1 = this;
            org.fortheloss.framework.IMP3FromURLDownloader r0 = r1._mp3FromURLDownloaderRef
            return r0
    }

    public void getMiscStatAnalytics(com.badlogic.gdx.Preferences r8) {
            r7 = this;
            java.lang.String r0 = "count"
            r1 = 0
            int r0 = r8.getInteger(r0, r1)
            java.lang.String r2 = "statsSendCount"
            r3 = -1
            int r4 = r8.getInteger(r2, r3)
            if (r4 != r3) goto L1a
            int r0 = r0 + 20
            r8.putInteger(r2, r0)
            r8.flush()
            goto L171
        L1a:
            r2 = 1
            if (r4 <= r2) goto L171
            if (r0 != r4) goto L171
            java.lang.String r0 = "precisionIsApproximate"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r3 = "precision"
            if (r0 == 0) goto L31
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r4 = "v3_settings_stats_precision_approx"
            r0.analyticsSendEvent(r4, r3)
            goto L38
        L31:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r4 = "v3_settings_stats_precision_stylus"
            r0.analyticsSendEvent(r4, r3)
        L38:
            java.lang.String r0 = "language"
            int r3 = r8.getInteger(r0, r1)
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "v3_settings_stats_language_"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.analyticsSendEvent(r3, r0)
            java.lang.String r0 = "lineWidth"
            int r0 = r8.getInteger(r0, r2)
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "v3_settings_stats_line_width_"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "line_width"
            r3.analyticsSendEvent(r0, r4)
            java.lang.String r0 = "customSkinSetting"
            int r0 = r8.getInteger(r0, r2)
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "v3_settings_stats_skin_setting_"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "skin_setting"
            r2.analyticsSendEvent(r0, r3)
            java.lang.String r0 = "leftHandModeEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "left_hand_mode"
            if (r0 == 0) goto La2
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_left_hand_mode_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto La9
        La2:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_left_hand_mode_disabled"
            r0.analyticsSendEvent(r3, r2)
        La9:
            java.lang.String r0 = "axisLockingEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "axis_locking"
            if (r0 == 0) goto Lbb
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_axis_locking_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto Lc2
        Lbb:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_axis_locking_disabled"
            r0.analyticsSendEvent(r3, r2)
        Lc2:
            java.lang.String r0 = "doubleTouchEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "double_touch"
            if (r0 == 0) goto Ld4
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_double_touch_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto Ldb
        Ld4:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_double_touch_disabled"
            r0.analyticsSendEvent(r3, r2)
        Ldb:
            java.lang.String r0 = "showZoomButtons"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "zoom_buttons"
            if (r0 == 0) goto Led
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_zoom_buttons_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto Lf4
        Led:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_zoom_buttons_disabled"
            r0.analyticsSendEvent(r3, r2)
        Lf4:
            java.lang.String r0 = "quickMenuEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "quick_menu"
            if (r0 == 0) goto L106
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_quick_menu_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto L10d
        L106:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_quick_menu_disabled"
            r0.analyticsSendEvent(r3, r2)
        L10d:
            java.lang.String r0 = "lagCullingEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "lag_culling"
            if (r0 == 0) goto L11f
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_culling_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto L126
        L11f:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_culling_disabled"
            r0.analyticsSendEvent(r3, r2)
        L126:
            java.lang.String r0 = "lagFiltersEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "lag_filters_drag"
            if (r0 == 0) goto L138
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_filters_drag_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto L13f
        L138:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_filters_drag_disabled"
            r0.analyticsSendEvent(r3, r2)
        L13f:
            java.lang.String r0 = "lagOnionSkinEnabled"
            boolean r0 = r8.getBoolean(r0, r1)
            java.lang.String r2 = "lag_onion_drag"
            if (r0 == 0) goto L151
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_onion_drag_enabled"
            r0.analyticsSendEvent(r3, r2)
            goto L158
        L151:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "v3_settings_stats_lag_onion_drag_disabled"
            r0.analyticsSendEvent(r3, r2)
        L158:
            java.lang.String r0 = "lagThirdThumbnailEnabled"
            boolean r8 = r8.getBoolean(r0, r1)
            java.lang.String r0 = "lag_third_frame"
            if (r8 == 0) goto L16a
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "v3_settings_stats_lag_3rd_frame_enabled"
            r8.analyticsSendEvent(r1, r0)
            goto L171
        L16a:
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "v3_settings_stats_lag_3rd_frame_disabled"
            r8.analyticsSendEvent(r1, r0)
        L171:
            return
    }

    public int getOutsideOpenRequest() {
            r1 = this;
            int r0 = r1._flagOutsideOpenRequest
            return r0
    }

    public java.lang.String getOutsideOpenRequestFilename() {
            r1 = this;
            java.lang.String r0 = r1._outsideOpenRequestFilename
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.Stage getStage() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r1._stage
            return r0
    }

    @Override // org.fortheloss.framework.IAndroidStorageRequester
    public void onStoragePermissionResult(boolean r1) {
            r0 = this;
            r0.beginApp(r1)
            return
    }

    public void outsideRequestConsumed() {
            r1 = this;
            r0 = -1
            r1._flagOutsideOpenRequest = r0
            r0 = 0
            r1._outsideOpenRequestFilename = r0
            return
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void pause() {
            r2 = this;
            org.fortheloss.framework.AppScreen r0 = r2._currentScreen
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            r0 = 1
            r2._appPaused = r0
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            r1 = 0
            r0.setContinuousRendering(r1)
            return
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void render() {
            r5 = this;
            boolean r0 = r5._appBegan
            if (r0 == 0) goto L45
            boolean r0 = r5._appPaused
            if (r0 == 0) goto L9
            goto L45
        L9:
            org.fortheloss.framework.AppScreen r0 = r5._currentScreen
            if (r0 == 0) goto L45
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            float r0 = r0.getDeltaTime()
            r1 = 0
        L14:
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L32
            int r1 = r1 + 1
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L28
            org.fortheloss.framework.AppScreen r1 = r5._currentScreen
            r1.update(r0)
            goto L32
        L28:
            float r0 = r0 - r3
            org.fortheloss.framework.AppScreen r4 = r5._currentScreen
            r4.update(r3)
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L14
        L32:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.glClearColor(r2, r2, r2, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            org.fortheloss.framework.AppScreen r0 = r5._currentScreen
            r0.draw()
        L45:
            return
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void resize(int r7, int r8) {
            r6 = this;
            org.fortheloss.framework.AppScreen r0 = r6._currentScreen
            if (r0 == 0) goto L7
            r0.resize()
        L7:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "----------"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            com.badlogic.gdx.Graphics r2 = com.badlogic.gdx.Gdx.graphics
            float r2 = r2.getPpiX()
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            float r3 = r3.getPpiY()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PPI x,y: \t"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " x "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.println(r3)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Resized: \t"
            r3.append(r4)
            r3.append(r7)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r7 = r3.toString()
            r0.println(r7)
            java.io.PrintStream r7 = java.lang.System.out
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r6._stage
            com.badlogic.gdx.utils.viewport.Viewport r8 = r8.getViewport()
            float r8 = r8.getWorldWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stage
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            float r0 = r0.getWorldHeight()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Stage size: \t"
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            r7.println(r8)
            java.io.PrintStream r7 = java.lang.System.out
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r6._stage
            com.badlogic.gdx.utils.viewport.Viewport r8 = r8.getViewport()
            int r8 = r8.getScreenWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stage
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            int r0 = r0.getScreenHeight()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Viewport size: \t"
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            r7.println(r8)
            java.io.PrintStream r7 = java.lang.System.out
            org.fortheloss.framework.Assets r8 = r6._assets
            int r8 = r8.getResolution()
            if (r8 != 0) goto Lc1
            java.lang.String r8 = "SD"
            goto Lc3
        Lc1:
            java.lang.String r8 = "HD"
        Lc3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Assets: \t"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.println(r8)
            java.io.PrintStream r7 = java.lang.System.out
            r7.println(r1)
            r7 = 1
            r6.mInitialResizeOccurred = r7
            return
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void resume() {
            r2 = this;
            org.fortheloss.framework.AppScreen r0 = r2._currentScreen
            if (r0 == 0) goto L7
            r0.resume()
        L7:
            r0 = 0
            r2._appPaused = r0
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            r1 = 1
            r0.setContinuousRendering(r1)
            return
    }

    public void setScreen(org.fortheloss.framework.AppScreen r2) {
            r1 = this;
            org.fortheloss.framework.AppScreen r0 = r1._currentScreen
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            r1._currentScreen = r2
            r2.initialize()
            return
    }

    public void userImportingMP3(java.lang.String r2) {
            r1 = this;
            r0 = 4
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public void userImportingMovieclip(java.lang.String r2) {
            r1 = this;
            r0 = 6
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public void userImportingPivotStickfigure(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public void userImportingStickfigure(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public void userImportingZIP(java.lang.String r2) {
            r1 = this;
            r0 = 3
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }

    public void userOpeningProject(java.lang.String r2) {
            r1 = this;
            r0 = 2
            r1._flagOutsideOpenRequest = r0
            r1._outsideOpenRequestFilename = r2
            org.fortheloss.framework.AppScreen r2 = r1._currentScreen
            if (r2 == 0) goto Lc
            r2.checkOutsideOpenRequests()
        Lc:
            return
    }
}
