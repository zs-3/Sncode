package org.fortheloss.sticknodes.animationscreen.spritemenus;

/* loaded from: classes2.dex */
public class SpriteSelectorWidget extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup implements com.badlogic.gdx.utils.Disposable {
    protected static final com.badlogic.gdx.graphics.Color COLOR_WHITE_1 = null;
    protected static final com.badlogic.gdx.graphics.Color COLOR_WHITE_2 = null;
    protected static float max_height;
    protected static float min_height;
    protected static final com.badlogic.gdx.math.Rectangle tmpRect = null;
    protected static final com.badlogic.gdx.math.Vector2 tmpVec2 = null;
    protected static final com.badlogic.gdx.math.Vector3 tmpVec3 = null;
    protected static float touch_padding;
    private com.badlogic.gdx.math.Rectangle mArea;
    private com.badlogic.gdx.graphics.Color mBackgroundColor;
    private float mDefaultLineWidth;
    private int mDragState;
    private int mEditingSelectionIndex;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> mExistingSelectionsRef;
    private boolean mImageContainsTransparentPixels;
    private boolean mImageLoaded;
    private com.badlogic.gdx.math.Vector2 mInternalScale;
    private boolean mIsTransparent;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mLoadingLabel;
    private boolean mLockH;
    private boolean mLockW;
    private boolean mLockX;
    private boolean mLockY;
    private org.fortheloss.framework.LogZoomer mLogZoomer;
    private int mMaskState;
    private int mMode;
    private com.badlogic.gdx.math.Matrix4 mNewMatrix;
    private com.badlogic.gdx.graphics.g2d.TextureRegion mOpaqueTextureRef;
    private boolean mOutlinesEnabled;
    private com.badlogic.gdx.math.Vector2 mPanInitial;
    private com.badlogic.gdx.math.Vector2 mPanOffset;
    private com.badlogic.gdx.graphics.Pixmap mPixmap;
    private com.badlogic.gdx.math.Matrix4 mRememberedMatrix;
    private float mScaledTextureHeight;
    private float mScaledTextureWidth;
    private com.badlogic.gdx.math.Rectangle mScissors;
    private com.badlogic.gdx.math.Rectangle mSelection;
    private com.badlogic.gdx.math.Rectangle mSelectionInitial;
    private org.fortheloss.sticknodes.SNShapeRenderer mShapeRendererRef;
    private com.badlogic.gdx.graphics.Texture mSpriteMaskTextureRef;
    private com.badlogic.gdx.math.Vector2 mSpriteOrigin;
    private com.badlogic.gdx.math.Vector2 mSpriteOriginInitial;
    private com.badlogic.gdx.graphics.Texture mTexture;
    private float mTextureScale;
    private long mTouchDownTime;
    private float mTouchInitialX;
    private float mTouchInitialY;
    private com.badlogic.gdx.graphics.g2d.TextureRegion mTransparencyTextureRef;
    private float mZoomScale;



    /* renamed from: -$$Nest$fgetmDragState, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1270$$Nest$fgetmDragState(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            int r0 = r0.mDragState
            return r0
    }

    /* renamed from: -$$Nest$fgetmEditingSelectionIndex, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1271$$Nest$fgetmEditingSelectionIndex(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            int r0 = r0.mEditingSelectionIndex
            return r0
    }

    /* renamed from: -$$Nest$fgetmExistingSelectionsRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1272$$Nest$fgetmExistingSelectionsRef(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r0.mExistingSelectionsRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmImageLoaded, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1273$$Nest$fgetmImageLoaded(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            boolean r0 = r0.mImageLoaded
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockH, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1274$$Nest$fgetmLockH(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            boolean r0 = r0.mLockH
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockW, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1275$$Nest$fgetmLockW(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            boolean r0 = r0.mLockW
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockX, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1276$$Nest$fgetmLockX(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            boolean r0 = r0.mLockX
            return r0
    }

    /* renamed from: -$$Nest$fgetmLockY, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1277$$Nest$fgetmLockY(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            boolean r0 = r0.mLockY
            return r0
    }

    /* renamed from: -$$Nest$fgetmMode, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1278$$Nest$fgetmMode(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            int r0 = r0.mMode
            return r0
    }

    /* renamed from: -$$Nest$fgetmNewMatrix, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Matrix4 m1279$$Nest$fgetmNewMatrix(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Matrix4 r0 = r0.mNewMatrix
            return r0
    }

    /* renamed from: -$$Nest$fgetmPanInitial, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m1280$$Nest$fgetmPanInitial(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0.mPanInitial
            return r0
    }

    /* renamed from: -$$Nest$fgetmPanOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m1281$$Nest$fgetmPanOffset(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0.mPanOffset
            return r0
    }

    /* renamed from: -$$Nest$fgetmRememberedMatrix, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Matrix4 m1282$$Nest$fgetmRememberedMatrix(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Matrix4 r0 = r0.mRememberedMatrix
            return r0
    }

    /* renamed from: -$$Nest$fgetmSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Rectangle m1283$$Nest$fgetmSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Rectangle r0 = r0.mSelection
            return r0
    }

    /* renamed from: -$$Nest$fgetmSelectionInitial, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Rectangle m1284$$Nest$fgetmSelectionInitial(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Rectangle r0 = r0.mSelectionInitial
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpriteOrigin, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m1285$$Nest$fgetmSpriteOrigin(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0.mSpriteOrigin
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpriteOriginInitial, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m1286$$Nest$fgetmSpriteOriginInitial(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0.mSpriteOriginInitial
            return r0
    }

    /* renamed from: -$$Nest$fgetmTouchDownTime, reason: not valid java name */
    static /* bridge */ /* synthetic */ long m1287$$Nest$fgetmTouchDownTime(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r2) {
            long r0 = r2.mTouchDownTime
            return r0
    }

    /* renamed from: -$$Nest$fgetmTouchInitialX, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1288$$Nest$fgetmTouchInitialX(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            float r0 = r0.mTouchInitialX
            return r0
    }

    /* renamed from: -$$Nest$fgetmTouchInitialY, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1289$$Nest$fgetmTouchInitialY(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            float r0 = r0.mTouchInitialY
            return r0
    }

    /* renamed from: -$$Nest$fgetmZoomScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1290$$Nest$fgetmZoomScale(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            float r0 = r0.mZoomScale
            return r0
    }

    /* renamed from: -$$Nest$fputmDragState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1291$$Nest$fputmDragState(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0, int r1) {
            r0.mDragState = r1
            return
    }

    /* renamed from: -$$Nest$fputmTouchDownTime, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1292$$Nest$fputmTouchDownTime(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0, long r1) {
            r0.mTouchDownTime = r1
            return
    }

    /* renamed from: -$$Nest$fputmTouchInitialX, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1293$$Nest$fputmTouchInitialX(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0, float r1) {
            r0.mTouchInitialX = r1
            return
    }

    /* renamed from: -$$Nest$fputmTouchInitialY, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1294$$Nest$fputmTouchInitialY(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0, float r1) {
            r0.mTouchInitialY = r1
            return
    }

    /* renamed from: -$$Nest$fputmZoomScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1295$$Nest$fputmZoomScale(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0, float r1) {
            r0.mZoomScale = r1
            return
    }

    /* renamed from: -$$Nest$mclampSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1296$$Nest$mclampSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            r0.clampSelection()
            return
    }

    /* renamed from: -$$Nest$mgetScaledTextureHeight, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1297$$Nest$mgetScaledTextureHeight(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            float r0 = r0.getScaledTextureHeight()
            return r0
    }

    /* renamed from: -$$Nest$mgetScaledTextureWidth, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1298$$Nest$mgetScaledTextureWidth(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            float r0 = r0.getScaledTextureWidth()
            return r0
    }

    /* renamed from: -$$Nest$mvalidateSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1299$$Nest$mvalidateSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget r0) {
            r0.validateSelection()
            return
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpVec2 = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpVec3 = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpRect = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1063675494(0x3f666666, float:0.9)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_1 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1060320051(0x3f333333, float:0.7)
            r0.<init>(r1, r1, r1, r2)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_2 = r0
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.min_height = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.max_height = r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.touch_padding = r0
            return
    }

    public SpriteSelectorWidget(com.badlogic.gdx.graphics.g2d.TextureRegion r6, com.badlogic.gdx.graphics.g2d.TextureRegion r7, com.badlogic.gdx.graphics.Texture r8, org.fortheloss.sticknodes.SNShapeRenderer r9, float r10) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.mTouchDownTime = r0
            r0 = 0
            r5.mTouchInitialX = r0
            r5.mTouchInitialY = r0
            r1 = 0
            r5.mImageLoaded = r1
            r2 = 1
            r5.mIsTransparent = r2
            r5.mImageContainsTransparentPixels = r1
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.mZoomScale = r3
            r5.mMaskState = r1
            r5.mDragState = r1
            r5.mLockX = r1
            r5.mLockY = r1
            r5.mLockW = r1
            r5.mLockH = r1
            r5.mOutlinesEnabled = r2
            r4 = -1
            r5.mEditingSelectionIndex = r4
            r5.mDefaultLineWidth = r0
            r5.mMode = r1
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1116471296(0x428c0000, float:70.0)
            float r4 = r4 * r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.touch_padding = r4
            r4 = 1140850688(0x44000000, float:512.0)
            float r4 = r4 * r0
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.min_height = r4
            r4 = 1157627904(0x45000000, float:2048.0)
            float r0 = r0 * r4
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.max_height = r0
            r5.mShapeRendererRef = r9
            r5.mDefaultLineWidth = r10
            com.badlogic.gdx.math.Rectangle r9 = new com.badlogic.gdx.math.Rectangle
            r10 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r9.<init>(r10, r10, r0, r0)
            r5.mSelection = r9
            com.badlogic.gdx.math.Vector2 r9 = new com.badlogic.gdx.math.Vector2
            r10 = 1048576000(0x3e800000, float:0.25)
            r0 = 1061158912(0x3f400000, float:0.75)
            r9.<init>(r10, r0)
            r5.mSpriteOrigin = r9
            com.badlogic.gdx.math.Vector2 r9 = new com.badlogic.gdx.math.Vector2
            r9.<init>(r3, r3)
            r5.mInternalScale = r9
            com.badlogic.gdx.math.Vector2 r9 = new com.badlogic.gdx.math.Vector2
            r9.<init>()
            r5.mSpriteOriginInitial = r9
            com.badlogic.gdx.math.Rectangle r9 = new com.badlogic.gdx.math.Rectangle
            r9.<init>()
            r5.mSelectionInitial = r9
            com.badlogic.gdx.math.Vector2 r9 = new com.badlogic.gdx.math.Vector2
            r9.<init>()
            r5.mPanInitial = r9
            com.badlogic.gdx.math.Vector2 r9 = new com.badlogic.gdx.math.Vector2
            r9.<init>()
            r5.mPanOffset = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r5.mExistingSelectionsRef = r9
            r5.mTransparencyTextureRef = r6
            r5.mOpaqueTextureRef = r7
            r5.mSpriteMaskTextureRef = r8
            com.badlogic.gdx.math.Rectangle r6 = new com.badlogic.gdx.math.Rectangle
            r6.<init>()
            r5.mArea = r6
            com.badlogic.gdx.math.Rectangle r6 = new com.badlogic.gdx.math.Rectangle
            r6.<init>()
            r5.mScissors = r6
            com.badlogic.gdx.math.Matrix4 r6 = new com.badlogic.gdx.math.Matrix4
            r6.<init>()
            r5.mRememberedMatrix = r6
            com.badlogic.gdx.math.Matrix4 r6 = new com.badlogic.gdx.math.Matrix4
            r6.<init>()
            r5.mNewMatrix = r6
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            r7 = 1063675494(0x3f666666, float:0.9)
            r6.<init>(r7, r7, r7, r3)
            r5.mBackgroundColor = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            java.lang.String r8 = "Loading image..."
            r6.<init>(r8, r7)
            r5.mLoadingLabel = r6
            r6.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mLoadingLabel
            r6.setWrap(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5.mLoadingLabel
            r5.addActor(r6)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget$1 r6 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget$1
            r6.<init>(r5)
            r5.addListener(r6)
            return
    }

    private void clampSelection() {
            r5 = this;
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.x
            float r2 = r5.getTextureWidth()
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r2 = r5.getTextureWidth()
            float r1 = r1 / r2
            r0.x = r1
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.y
            float r2 = r5.getTextureHeight()
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r2 = r5.getTextureHeight()
            float r1 = r1 / r2
            r0.y = r1
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.x
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L3a
            r0.x = r3
            goto L45
        L3a:
            float r4 = r0.width
            float r1 = r1 + r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L45
            float r1 = r2 - r4
            r0.x = r1
        L45:
            float r1 = r0.y
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L4e
            r0.y = r3
            goto L58
        L4e:
            float r3 = r0.height
            float r1 = r1 + r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L58
            float r2 = r2 - r3
            r0.y = r2
        L58:
            return
    }

    private void drawMask(com.badlogic.gdx.graphics.g2d.Batch r18, int r19, float r20, float r21, float r22, float r23) {
            r17 = this;
            r0 = r17
            r1 = r19
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r2.setFilter(r3, r3)
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            int r2 = r2.getWidth()
            float r2 = (float) r2
            com.badlogic.gdx.graphics.Texture r3 = r0.mSpriteMaskTextureRef
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r5 = (r23 > r22 ? 1 : (r23 == r22 ? 0 : -1))
            if (r5 <= 0) goto L26
            float r5 = r2 / r22
            float r6 = r3 / r23
            goto L2a
        L26:
            float r5 = r2 / r23
            float r6 = r3 / r22
        L2a:
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 <= 0) goto L36
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 <= 0) goto L36
            float r2 = r2 / r5
            float r3 = r3 / r5
            goto L3c
        L36:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 <= 0) goto L3c
            float r2 = r2 / r6
            float r3 = r3 / r6
        L3c:
            float r2 = r2 * r4
            r4 = 4
            r15 = 1
            r14 = 5
            if (r1 == r15) goto L4a
            if (r1 == r4) goto L4a
            if (r1 != r14) goto L48
            goto L4a
        L48:
            r4 = 5
            goto L6d
        L4a:
            com.badlogic.gdx.graphics.Texture r6 = r0.mSpriteMaskTextureRef
            float r5 = r17.getX()
            float r7 = r5 + r20
            float r5 = r17.getY()
            float r5 = r5 + r21
            float r5 = r5 + r23
            float r8 = r5 - r3
            r11 = 0
            r12 = 1056964608(0x3f000000, float:0.5)
            r13 = 1056964608(0x3f000000, float:0.5)
            r16 = 0
            r5 = r18
            r9 = r2
            r10 = r3
            r4 = 5
            r14 = r16
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L6d:
            r14 = 2
            if (r1 == r15) goto L74
            if (r1 == r14) goto L74
            if (r1 != r4) goto L99
        L74:
            com.badlogic.gdx.graphics.Texture r6 = r0.mSpriteMaskTextureRef
            float r5 = r17.getX()
            float r5 = r5 + r20
            float r5 = r5 + r22
            float r7 = r5 - r2
            float r5 = r17.getY()
            float r5 = r5 + r21
            float r5 = r5 + r23
            float r8 = r5 - r3
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1056964608(0x3f000000, float:0.5)
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r5 = r18
            r9 = r2
            r10 = r3
            r14 = r15
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L99:
            r15 = 3
            if (r1 == r15) goto La1
            r5 = 4
            if (r1 == r5) goto La1
            if (r1 != r4) goto Lbd
        La1:
            com.badlogic.gdx.graphics.Texture r6 = r0.mSpriteMaskTextureRef
            float r5 = r17.getX()
            float r7 = r5 + r20
            float r5 = r17.getY()
            float r8 = r5 + r21
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1056964608(0x3f000000, float:0.5)
            r14 = 1056964608(0x3f000000, float:0.5)
            r5 = r18
            r9 = r2
            r10 = r3
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lbd:
            if (r1 == r15) goto Lc4
            r5 = 2
            if (r1 == r5) goto Lc4
            if (r1 != r4) goto Le5
        Lc4:
            com.badlogic.gdx.graphics.Texture r6 = r0.mSpriteMaskTextureRef
            float r1 = r17.getX()
            float r1 = r1 + r20
            float r1 = r1 + r22
            float r7 = r1 - r2
            float r1 = r17.getY()
            float r8 = r1 + r21
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1056964608(0x3f000000, float:0.5)
            r5 = r18
            r9 = r2
            r10 = r3
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Le5:
            return
    }

    private float getScaledTextureHeight() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto L7
            float r0 = r1.mScaledTextureHeight
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private float getScaledTextureWidth() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto L7
            float r0 = r1.mScaledTextureWidth
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private void validateSelection() {
            r5 = this;
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.x
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r3)
            r0.x = r1
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.y
            float r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r3)
            r0.y = r1
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.width
            com.badlogic.gdx.graphics.Texture r4 = r5.mTexture
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r1 = r1 * r4
            float r1 = java.lang.Math.max(r1, r3)
            com.badlogic.gdx.graphics.Texture r4 = r5.mTexture
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            float r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r3)
            r0.width = r1
            com.badlogic.gdx.math.Rectangle r0 = r5.mSelection
            float r1 = r0.height
            com.badlogic.gdx.graphics.Texture r4 = r5.mTexture
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            float r1 = java.lang.Math.max(r1, r3)
            com.badlogic.gdx.graphics.Texture r4 = r5.mTexture
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r1 = r1 / r4
            float r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r2, r3)
            r0.height = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            super.act(r2)
            org.fortheloss.framework.LogZoomer r0 = r1.mLogZoomer
            if (r0 == 0) goto La
            r0.update(r2)
        La:
            return
    }

    public void addExistingSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r1.mExistingSelectionsRef
            r0.add(r2)
            r1.onExistingSelectionAdded(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r2.mPixmap
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2.mPixmap = r1
        La:
            com.badlogic.gdx.graphics.Texture r0 = r2.mTexture
            if (r0 == 0) goto L13
            r0.dispose()
            r2.mTexture = r1
        L13:
            r2.mSelection = r1
            r2.mInternalScale = r1
            r2.mSpriteOrigin = r1
            r2.mSpriteOriginInitial = r1
            r2.mShapeRendererRef = r1
            r2.mTransparencyTextureRef = r1
            r2.mOpaqueTextureRef = r1
            r2.mSpriteMaskTextureRef = r1
            r2.mArea = r1
            r2.mScissors = r1
            r2.mLoadingLabel = r1
            r2.mSelectionInitial = r1
            r2.mBackgroundColor = r1
            r2.mPanInitial = r1
            r2.mPanOffset = r1
            r2.mExistingSelectionsRef = r1
            r2.mRememberedMatrix = r1
            r2.mNewMatrix = r1
            org.fortheloss.framework.LogZoomer r0 = r2.mLogZoomer
            if (r0 == 0) goto L40
            r0.dispose()
            r2.mLogZoomer = r1
        L40:
            r2.clear()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r34, float r35) {
            r33 = this;
            r7 = r33
            r8 = r34
            super.draw(r34, r35)
            boolean r0 = r7.mImageLoaded
            if (r0 != 0) goto Lc
            return
        Lc:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.glLineWidth(r9)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r33.getStage()
            com.badlogic.gdx.graphics.Camera r18 = r0.getCamera()
            com.badlogic.gdx.graphics.Color r15 = r33.getColor()
            float r19 = r33.getTextureWidth()
            float r20 = r33.getTextureHeight()
            float r24 = r33.getScaledTextureWidth()
            float r25 = r33.getScaledTextureHeight()
            float r21 = r33.getTextureScale()
            r34.flush()
            boolean r0 = r33.clipBegin()
            if (r0 != 0) goto L3d
            return
        L3d:
            boolean r0 = r7.mIsTransparent
            r10 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L71
            float r0 = r15.r
            float r0 = r0 * r10
            float r1 = r15.g
            float r1 = r1 * r10
            float r2 = r15.b
            float r2 = r2 * r10
            float r3 = r15.a
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r7.mTransparencyTextureRef
            float r3 = r33.getX()
            float r4 = r33.getY()
            float r5 = r33.getWidth()
            float r6 = r33.getHeight()
            r0 = r18
            r1 = r34
            org.fortheloss.framework.RenderUtils.tile(r0, r1, r2, r3, r4, r5, r6)
            goto La9
        L71:
            float r0 = r15.r
            com.badlogic.gdx.graphics.Color r1 = r7.mBackgroundColor
            float r2 = r1.r
            float r0 = r0 * r2
            float r0 = r0 * r10
            float r2 = r15.g
            float r3 = r1.g
            float r2 = r2 * r3
            float r2 = r2 * r10
            float r3 = r15.b
            float r1 = r1.b
            float r3 = r3 * r1
            float r3 = r3 * r10
            float r1 = r15.a
            float r1 = r1 * r35
            r8.setColor(r0, r2, r3, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r7.mOpaqueTextureRef
            float r2 = r33.getX()
            float r3 = r33.getY()
            float r4 = r33.getWidth()
            float r5 = r33.getHeight()
            r0 = r34
            r0.draw(r1, r2, r3, r4, r5)
        La9:
            r34.flush()
            com.badlogic.gdx.math.Matrix4 r0 = r7.mRememberedMatrix
            com.badlogic.gdx.math.Matrix4 r1 = r34.getTransformMatrix()
            r0.set(r1)
            com.badlogic.gdx.math.Vector2 r0 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpVec2
            float r1 = r33.getWidth()
            r30 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r30
            float r2 = r33.getHeight()
            float r2 = r2 * r30
            com.badlogic.gdx.math.Vector2 r1 = r0.set(r1, r2)
            r7.localToStageCoordinates(r1)
            com.badlogic.gdx.math.Matrix4 r1 = r7.mNewMatrix
            r1.idt()
            com.badlogic.gdx.math.Matrix4 r1 = r7.mNewMatrix
            float r2 = r0.x
            float r3 = r0.y
            r6 = 0
            com.badlogic.gdx.math.Matrix4 r1 = r1.translate(r2, r3, r6)
            float r2 = r7.mZoomScale
            com.badlogic.gdx.math.Matrix4 r1 = r1.scale(r2, r2, r9)
            float r2 = r0.x
            float r2 = -r2
            float r0 = r0.y
            float r0 = -r0
            com.badlogic.gdx.math.Matrix4 r0 = r1.translate(r2, r0, r6)
            com.badlogic.gdx.math.Vector2 r1 = r7.mPanOffset
            float r2 = r1.x
            float r2 = -r2
            float r1 = r1.y
            r0.translate(r2, r1, r6)
            com.badlogic.gdx.math.Matrix4 r0 = r7.mNewMatrix
            com.badlogic.gdx.math.Matrix4 r1 = r7.mRememberedMatrix
            r0.mul(r1)
            com.badlogic.gdx.math.Matrix4 r0 = r7.mNewMatrix
            r8.setTransformMatrix(r0)
            float r0 = r15.r
            float r0 = r0 * r10
            float r1 = r15.g
            float r1 = r1 * r10
            float r2 = r15.b
            float r2 = r2 * r10
            float r3 = r15.a
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
            com.badlogic.gdx.graphics.Texture r1 = r7.mTexture
            float r2 = r33.getX()
            float r3 = r33.getY()
            r0 = r34
            r4 = r24
            r5 = r25
            r0.draw(r1, r2, r3, r4, r5)
            float r0 = r15.r
            float r1 = r15.g
            float r2 = r15.b
            float r3 = r15.a
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
            com.badlogic.gdx.math.Rectangle r0 = r33.getRoundedClampedSelectionXY()
            float r1 = r0.x
            float r31 = r1 * r21
            float r1 = r0.y
            float r32 = r1 * r21
            float r1 = r0.width
            float r5 = r1 * r21
            float r0 = r0.height
            float r4 = r0 * r21
            r34.flush()
            com.badlogic.gdx.math.Rectangle r0 = r7.mArea
            float r1 = r33.getX()
            float r1 = r1 + r31
            float r2 = r33.getY()
            float r2 = r2 + r32
            r0.set(r1, r2, r5, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r33.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r0 = r0.getViewport()
            int r1 = r0.getScreenX()
            float r11 = (float) r1
            int r1 = r0.getScreenY()
            float r12 = (float) r1
            int r1 = r0.getScreenWidth()
            float r13 = (float) r1
            int r0 = r0.getScreenHeight()
            float r14 = (float) r0
            com.badlogic.gdx.math.Matrix4 r0 = r34.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r1 = r7.mArea
            com.badlogic.gdx.math.Rectangle r2 = r7.mScissors
            r10 = r18
            r3 = r15
            r15 = r0
            r16 = r1
            r17 = r2
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r10, r11, r12, r13, r14, r15, r16, r17)
            com.badlogic.gdx.math.Rectangle r0 = r7.mScissors
            boolean r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r0)
            if (r0 == 0) goto L227
            r34.flush()
            com.badlogic.gdx.math.Matrix4 r0 = r7.mRememberedMatrix
            r8.setTransformMatrix(r0)
            boolean r0 = r7.mIsTransparent
            if (r0 == 0) goto L1c2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r7.mTransparencyTextureRef
            float r10 = r33.getX()
            float r11 = r33.getY()
            float r12 = r33.getWidth()
            float r13 = r33.getHeight()
            r0 = r18
            r1 = r34
            r14 = r3
            r3 = r10
            r10 = r4
            r4 = r11
            r11 = r5
            r5 = r12
            r12 = 0
            r6 = r13
            org.fortheloss.framework.RenderUtils.tile(r0, r1, r2, r3, r4, r5, r6)
            goto L205
        L1c2:
            r14 = r3
            r10 = r4
            r11 = r5
            r12 = 0
            float r0 = r14.r
            com.badlogic.gdx.graphics.Color r1 = r7.mBackgroundColor
            float r2 = r1.r
            float r0 = r0 * r2
            float r2 = r14.g
            float r3 = r1.g
            float r2 = r2 * r3
            float r3 = r14.b
            float r1 = r1.b
            float r3 = r3 * r1
            float r1 = r14.a
            float r1 = r1 * r35
            r8.setColor(r0, r2, r3, r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r7.mOpaqueTextureRef
            float r2 = r33.getX()
            float r3 = r33.getY()
            float r4 = r33.getWidth()
            float r5 = r33.getHeight()
            r0 = r34
            r0.draw(r1, r2, r3, r4, r5)
            float r0 = r14.r
            float r1 = r14.g
            float r2 = r14.b
            float r3 = r14.a
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
        L205:
            r34.flush()
            com.badlogic.gdx.math.Matrix4 r0 = r7.mNewMatrix
            r8.setTransformMatrix(r0)
            com.badlogic.gdx.graphics.Texture r1 = r7.mTexture
            float r2 = r33.getX()
            float r3 = r33.getY()
            r0 = r34
            r4 = r24
            r5 = r25
            r0.draw(r1, r2, r3, r4, r5)
            r34.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            goto L22b
        L227:
            r14 = r3
            r10 = r4
            r11 = r5
            r12 = 0
        L22b:
            float r13 = r19 * r21
            float r15 = r20 * r21
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r7.mExistingSelectionsRef
            int r0 = r0.size()
            r16 = 0
            if (r0 <= 0) goto L298
            float r0 = r14.r
            float r1 = r14.g
            float r2 = r14.b
            float r3 = r14.a
            float r3 = r3 * r30
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r7.mExistingSelectionsRef
            int r6 = r0.size()
            r5 = 0
        L24f:
            if (r5 >= r6) goto L298
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r7.mExistingSelectionsRef
            java.lang.Object r0 = r0.get(r5)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r0 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r0
            int r1 = r0.maskState
            if (r1 != 0) goto L262
            r19 = r5
            r17 = r6
            goto L293
        L262:
            float r1 = r0.u1
            float r1 = r1 * r13
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r1, r12, r13)
            float r1 = r0.v1
            float r1 = r1 * r15
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r1, r12, r15)
            float r1 = r0.u2
            float r1 = r1 * r13
            float r17 = com.badlogic.gdx.math.MathUtils.clamp(r1, r9, r13)
            float r1 = r0.v2
            float r1 = r1 * r15
            float r18 = com.badlogic.gdx.math.MathUtils.clamp(r1, r9, r15)
            int r2 = r0.maskState
            r0 = r33
            r1 = r34
            r19 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r0.drawMask(r1, r2, r3, r4, r5, r6)
        L293:
            int r5 = r19 + 1
            r6 = r17
            goto L24f
        L298:
            int r0 = r7.mMaskState
            if (r0 == 0) goto L2b8
            float r0 = r14.r
            float r1 = r14.g
            float r2 = r14.b
            float r3 = r14.a
            float r3 = r3 * r35
            r8.setColor(r0, r1, r2, r3)
            int r2 = r7.mMaskState
            r0 = r33
            r1 = r34
            r3 = r31
            r4 = r32
            r5 = r11
            r6 = r10
            r0.drawMask(r1, r2, r3, r4, r5, r6)
        L2b8:
            r34.flush()
            com.badlogic.gdx.math.Matrix4 r0 = r7.mRememberedMatrix
            r8.setTransformMatrix(r0)
            boolean r0 = r7.mOutlinesEnabled
            if (r0 == 0) goto L3f4
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = r7.mNewMatrix
            r0.setTransformMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r0.begin(r1)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            float r22 = r33.getX()
            float r23 = r33.getY()
            com.badlogic.gdx.graphics.Color r28 = com.badlogic.gdx.graphics.Color.BLACK
            com.badlogic.gdx.graphics.Color r29 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r21 = r0
            r26 = r28
            r27 = r29
            r21.rect(r22, r23, r24, r25, r26, r27, r28, r29)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            r0.end()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r7.mExistingSelectionsRef
            int r0 = r0.size()
            if (r0 <= 0) goto L36d
            int r0 = r7.mMode
            if (r0 != 0) goto L36d
            r34.end()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            r0.begin(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r7.mExistingSelectionsRef
            int r0 = r0.size()
            r1 = 0
        L309:
            if (r1 >= r0) goto L365
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r2 = r7.mExistingSelectionsRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r2 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r2
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_1
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_2
            int r5 = r7.mEditingSelectionIndex
            r6 = -1
            if (r5 == r6) goto L325
            if (r1 != r5) goto L325
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            r22 = r3
            r23 = r22
            goto L329
        L325:
            r22 = r3
            r23 = r4
        L329:
            float r3 = r2.u1
            float r3 = r3 * r13
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r12, r13)
            float r4 = r2.v1
            float r4 = r4 * r15
            float r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r12, r15)
            float r5 = r2.u2
            float r5 = r5 * r13
            float r19 = com.badlogic.gdx.math.MathUtils.clamp(r5, r9, r13)
            float r2 = r2.v2
            float r2 = r2 * r15
            float r20 = com.badlogic.gdx.math.MathUtils.clamp(r2, r9, r15)
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r7.mShapeRendererRef
            float r5 = r33.getX()
            float r17 = r5 + r3
            float r3 = r33.getY()
            float r18 = r3 + r4
            r3 = 1092616192(0x41200000, float:10.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r21 = r4 * r3
            r16 = r2
            r16.rectDashed(r17, r18, r19, r20, r21, r22, r23)
            int r1 = r1 + 1
            goto L309
        L365:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            r0.end()
            r34.begin()
        L36d:
            r34.end()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Line
            r0.begin(r1)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r0
            org.fortheloss.sticknodes.SNShapeRenderer r12 = r7.mShapeRendererRef
            float r0 = r33.getX()
            float r0 = r0 + r31
            float r13 = r0 - r2
            float r0 = r33.getY()
            float r0 = r0 + r32
            float r14 = r0 - r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r0
            float r15 = r11 + r2
            float r16 = r10 + r2
            com.badlogic.gdx.graphics.Color r19 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_1
            com.badlogic.gdx.graphics.Color r20 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.COLOR_WHITE_2
            r17 = r19
            r18 = r20
            r12.rect(r13, r14, r15, r16, r17, r18, r19, r20)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            r0.end()
            r34.begin()
            r0 = 1099956224(0x41900000, float:18.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r0
            float r0 = r7.mZoomScale
            float r2 = r2 / r0
            float r0 = r33.getX()
            float r0 = r0 + r31
            com.badlogic.gdx.math.Vector2 r3 = r7.mSpriteOrigin
            float r3 = r3.x
            float r3 = r3 * r11
            float r0 = r0 + r3
            float r2 = r2 * r30
            float r0 = r0 - r2
            float r3 = r33.getY()
            float r3 = r3 + r32
            com.badlogic.gdx.math.Vector2 r4 = r7.mSpriteOrigin
            float r4 = r4.y
            float r4 = r4 * r10
            float r3 = r3 + r4
            float r3 = r3 - r2
            r34.end()
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r7.mShapeRendererRef
            r2.begin(r1)
            org.fortheloss.sticknodes.SNShapeRenderer r1 = r7.mShapeRendererRef
            r2 = 1
            r1.nodeMain(r0, r3, r2)
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            r0.end()
            r34.begin()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = r7.mShapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = r0.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r1 = r1.idt()
            r0.setTransformMatrix(r1)
        L3f4:
            r33.clipEnd()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            float r1 = r7.mDefaultLineWidth
            r0.glLineWidth(r1)
            return
    }

    public com.badlogic.gdx.graphics.Color getBackgroundColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mBackgroundColor
            return r0
    }

    public com.badlogic.gdx.math.Vector2 getInternalScale() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mInternalScale
            return r0
    }

    public boolean getIsTransparent() {
            r1 = this;
            boolean r0 = r1.mIsTransparent
            return r0
    }

    public int getMaskState() {
            r1 = this;
            int r0 = r1.mMaskState
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.badlogic.gdx.graphics.Pixmap getPixmap() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto L7
            com.badlogic.gdx.graphics.Pixmap r0 = r1.mPixmap
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1.getWidth()
            return r0
    }

    public com.badlogic.gdx.math.Vector2 getRelativeSpriteOrigin() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mSpriteOrigin
            return r0
    }

    public com.badlogic.gdx.math.Rectangle getRoundedClampedSelectionUV() {
            r7 = this;
            float r0 = r7.getTextureWidth()
            float r1 = r7.getTextureHeight()
            com.badlogic.gdx.math.Rectangle r2 = r7.mSelection
            float r2 = r2.x
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r2 = r2 / r0
            com.badlogic.gdx.math.Rectangle r3 = r7.mSelection
            float r3 = r3.y
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r1
            com.badlogic.gdx.math.Rectangle r4 = r7.mSelection
            float r4 = r4.getWidth()
            com.badlogic.gdx.math.Rectangle r5 = r7.mSelection
            float r5 = r5.x
            float r5 = r2 - r5
            float r4 = r4 - r5
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            r5 = 1
            int r4 = java.lang.Math.max(r4, r5)
            float r4 = (float) r4
            float r4 = r4 / r0
            com.badlogic.gdx.math.Rectangle r0 = r7.mSelection
            float r0 = r0.getHeight()
            com.badlogic.gdx.math.Rectangle r6 = r7.mSelection
            float r6 = r6.y
            float r6 = r3 - r6
            float r0 = r0 - r6
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r5)
            float r0 = (float) r0
            float r0 = r0 / r1
            com.badlogic.gdx.math.Rectangle r1 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpRect
            r1.set(r2, r3, r4, r0)
            return r1
    }

    public com.badlogic.gdx.math.Rectangle getRoundedClampedSelectionXY() {
            r8 = this;
            float r0 = r8.getTextureWidth()
            float r1 = r8.getTextureHeight()
            com.badlogic.gdx.math.Rectangle r2 = r8.mSelection
            float r2 = r2.x
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            com.badlogic.gdx.math.Rectangle r3 = r8.mSelection
            float r3 = r3.y
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            com.badlogic.gdx.math.Rectangle r4 = r8.mSelection
            float r4 = r4.getWidth()
            float r2 = (float) r2
            float r5 = r2 / r0
            com.badlogic.gdx.math.Rectangle r6 = r8.mSelection
            float r6 = r6.x
            float r5 = r5 - r6
            float r4 = r4 - r5
            float r4 = r4 * r0
            int r0 = java.lang.Math.round(r4)
            r4 = 1
            int r0 = java.lang.Math.max(r0, r4)
            com.badlogic.gdx.math.Rectangle r5 = r8.mSelection
            float r5 = r5.getHeight()
            float r3 = (float) r3
            float r6 = r3 / r1
            com.badlogic.gdx.math.Rectangle r7 = r8.mSelection
            float r7 = r7.y
            float r6 = r6 - r7
            float r5 = r5 - r6
            float r5 = r5 * r1
            int r1 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.max(r1, r4)
            com.badlogic.gdx.math.Rectangle r4 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.tmpRect
            float r0 = (float) r0
            float r1 = (float) r1
            r4.set(r2, r3, r0, r1)
            return r4
    }

    public com.badlogic.gdx.math.Rectangle getSelection() {
            r1 = this;
            com.badlogic.gdx.math.Rectangle r0 = r1.mSelection
            return r0
    }

    public com.badlogic.gdx.graphics.Texture getTexture() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto L7
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getTextureHeight() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto Lc
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture
            int r0 = r0.getHeight()
            float r0 = (float) r0
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public float getTextureScale() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto L7
            float r0 = r1.mTextureScale
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getTextureWidth() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            if (r0 == 0) goto Lc
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture
            int r0 = r0.getWidth()
            float r0 = (float) r0
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean imageContainTransparentPixels() {
            r1 = this;
            boolean r0 = r1.mImageContainsTransparentPixels
            return r0
    }

    public void incrementH(int r5) {
            r4 = this;
            boolean r0 = r4.mLockH
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Rectangle r0 = r4.mSelection
            float r1 = r0.height
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.graphics.Texture r3 = r4.mTexture
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r5 = (float) r5
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.height = r1
            r4.clampSelection()
            r4.validateSelection()
            r4.onSelectionChanged()
            return
    }

    public void incrementW(int r5) {
            r4 = this;
            boolean r0 = r4.mLockW
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Rectangle r0 = r4.mSelection
            float r1 = r0.width
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.graphics.Texture r3 = r4.mTexture
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r5 = (float) r5
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.width = r1
            r4.clampSelection()
            r4.validateSelection()
            r4.onSelectionChanged()
            return
    }

    public void incrementX(int r5) {
            r4 = this;
            boolean r0 = r4.mLockX
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Rectangle r0 = r4.mSelection
            float r1 = r0.x
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.graphics.Texture r3 = r4.mTexture
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r5 = (float) r5
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.x = r1
            r4.clampSelection()
            r4.validateSelection()
            r4.onSelectionChanged()
            return
    }

    public void incrementY(int r5) {
            r4 = this;
            boolean r0 = r4.mLockY
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Rectangle r0 = r4.mSelection
            float r1 = r0.y
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.graphics.Texture r3 = r4.mTexture
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r5 = (float) r5
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.y = r1
            r4.clampSelection()
            r4.validateSelection()
            r4.onSelectionChanged()
            return
    }

    public boolean isEditing() {
            r1 = this;
            int r0 = r1.mEditingSelectionIndex
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isLoaded() {
            r1 = this;
            boolean r0 = r1.mImageLoaded
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void layout() {
            r5 = this;
            super.layout()
            boolean r0 = r5.mImageLoaded
            if (r0 != 0) goto L32
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            r5.setHeight(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5.mLoadingLabel
            float r1 = r5.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r5.mLoadingLabel
            float r2 = r2.getPrefWidth()
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r3 = r5.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r5.mLoadingLabel
            float r4 = r4.getPrefHeight()
            float r3 = r3 - r4
            float r3 = r3 * r2
            r0.setPosition(r1, r3)
            return
        L32:
            float r0 = r5.getScaledTextureHeight()
            r1 = 1137180672(0x43c80000, float:400.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r0 = r0 + r2
            float r1 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.min_height
            float r2 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.max_height
            float r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
            r5.setHeight(r0)
            return
    }

    protected void onExistingSelectionAdded(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onExistingSelectionRemoved(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onExistingSelectionTouched(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onLoaded() {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onMaskStateChanged(int r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onSelectionChanged() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void removeExistingSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r2.mExistingSelectionsRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r2.mExistingSelectionsRef
            java.lang.Object r1 = r1.get(r0)
            if (r1 != r3) goto L1b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r2.mExistingSelectionsRef
            r1.remove(r0)
            r2.onExistingSelectionRemoved(r3)
            goto L1e
        L1b:
            int r0 = r0 + (-1)
            goto L8
        L1e:
            return
    }

    public void removeExistingSelections() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r0 = r2.mExistingSelectionsRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData> r1 = r2.mExistingSelectionsRef
            java.lang.Object r1 = r1.remove(r0)
            org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r1 = (org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData) r1
            r2.onExistingSelectionRemoved(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    public void replacePixmap(com.badlogic.gdx.graphics.Pixmap r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r2.mPixmap
            if (r0 != 0) goto L5
            return
        L5:
            r0.dispose()
            com.badlogic.gdx.graphics.Texture r0 = r2.mTexture
            r0.dispose()
            r2.mPixmap = r3
            com.badlogic.gdx.graphics.Texture r3 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.Pixmap r0 = r2.mPixmap
            r1 = 0
            r3.<init>(r0, r1)
            r2.mTexture = r3
            return
    }

    public void resetSelection() {
            r1 = this;
            r0 = 0
            r1.resetSelection(r0)
            return
    }

    public void resetSelection(boolean r7) {
            r6 = this;
            boolean r0 = r6.mImageLoaded
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getWidth()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.Pixmap r1 = r6.mPixmap
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 1133903872(0x43960000, float:300.0)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L46
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getWidth()
            goto L43
        L30:
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L46
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getHeight()
        L43:
            float r0 = (float) r0
            float r3 = r2 / r0
        L46:
            com.badlogic.gdx.graphics.Pixmap r0 = r6.mPixmap
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r3, r0)
            com.badlogic.gdx.graphics.Pixmap r2 = r6.mPixmap
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            com.badlogic.gdx.graphics.Pixmap r2 = r6.mPixmap
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r1
            com.badlogic.gdx.graphics.Pixmap r3 = r6.mPixmap
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            com.badlogic.gdx.math.Rectangle r3 = r6.mSelection
            r4 = 0
            float r5 = r0 - r2
            r3.set(r4, r5, r1, r2)
            r6.clampSelection()
            r6.validateSelection()
            r6.onSelectionChanged()
            if (r7 == 0) goto L82
            return
        L82:
            r7 = 0
            r6.setMaskState(r7)
            com.badlogic.gdx.math.Vector2 r7 = r6.mSpriteOrigin
            r1 = 1056964608(0x3f000000, float:0.5)
            r7.set(r1, r1)
            com.badlogic.gdx.math.Vector2 r7 = r6.mInternalScale
            r7.set(r0, r0)
            return
    }

    public void setBackgroundColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mBackgroundColor
            r0.set(r2)
            return
    }

    public void setEditingSelectionIndex(int r1) {
            r0 = this;
            r0.mEditingSelectionIndex = r1
            return
    }

    public void setInternalScaleX(float r5, boolean r6) {
            r4 = this;
            com.badlogic.gdx.math.Vector2 r0 = r4.mInternalScale
            float r1 = r0.y
            float r2 = r0.x
            float r1 = r1 / r2
            r2 = 1008981770(0x3c23d70a, float:0.01)
            r3 = 1120402145(0x42c7fae1, float:99.99)
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r5, r2, r3)
            r0.x = r5
            if (r6 == 0) goto L1f
            com.badlogic.gdx.math.Vector2 r5 = r4.mInternalScale
            float r5 = r5.x
            float r5 = r5 * r1
            r6 = 0
            r4.setInternalScaleY(r5, r6)
        L1f:
            return
    }

    public void setInternalScaleY(float r5, boolean r6) {
            r4 = this;
            com.badlogic.gdx.math.Vector2 r0 = r4.mInternalScale
            float r1 = r0.x
            float r2 = r0.y
            float r1 = r1 / r2
            r2 = 1008981770(0x3c23d70a, float:0.01)
            r3 = 1120402145(0x42c7fae1, float:99.99)
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r5, r2, r3)
            r0.y = r5
            if (r6 == 0) goto L1f
            com.badlogic.gdx.math.Vector2 r5 = r4.mInternalScale
            float r5 = r5.y
            float r5 = r5 * r1
            r6 = 0
            r4.setInternalScaleX(r5, r6)
        L1f:
            return
    }

    public void setIsTransparent(boolean r1) {
            r0 = this;
            r0.mIsTransparent = r1
            return
    }

    public void setLockH(boolean r1) {
            r0 = this;
            r0.mLockH = r1
            return
    }

    public void setLockW(boolean r1) {
            r0 = this;
            r0.mLockW = r1
            return
    }

    public void setLockX(boolean r1) {
            r0 = this;
            r0.mLockX = r1
            return
    }

    public void setLockY(boolean r1) {
            r0 = this;
            r0.mLockY = r1
            return
    }

    public void setMaskState(int r1) {
            r0 = this;
            r0.mMaskState = r1
            r0.onMaskStateChanged(r1)
            return
    }

    public void setMode(int r1) {
            r0 = this;
            r0.mMode = r1
            return
    }

    public void setOutlinesEnabled(boolean r1) {
            r0 = this;
            r0.mOutlinesEnabled = r1
            return
    }

    public void setPixmap(com.badlogic.gdx.graphics.Pixmap r13) {
            r12 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r12.mPixmap
            if (r0 == 0) goto L5
            return
        L5:
            int r5 = r13.getWidth()
            int r6 = r13.getHeight()
            r0 = 1080(0x438, float:1.513E-42)
            r1 = 1920(0x780, float:2.69E-42)
            if (r6 <= r5) goto L14
            goto L18
        L14:
            r0 = 1920(0x780, float:2.69E-42)
            r1 = 1080(0x438, float:1.513E-42)
        L18:
            r11 = 0
            if (r5 > r0) goto L2b
            if (r6 <= r1) goto L1e
            goto L2b
        L1e:
            com.badlogic.gdx.graphics.Pixmap r0 = new com.badlogic.gdx.graphics.Pixmap
            com.badlogic.gdx.graphics.Pixmap$Format r1 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r0.<init>(r5, r6, r1)
            r12.mPixmap = r0
            r0.drawPixmap(r13, r11, r11)
            goto L52
        L2b:
            com.badlogic.gdx.utils.Scaling r2 = com.badlogic.gdx.utils.Scaling.fit
            float r3 = (float) r5
            float r4 = (float) r6
            float r0 = (float) r0
            float r1 = (float) r1
            com.badlogic.gdx.math.Vector2 r0 = r2.apply(r3, r4, r0, r1)
            com.badlogic.gdx.graphics.Pixmap r1 = new com.badlogic.gdx.graphics.Pixmap
            float r2 = r0.x
            int r2 = (int) r2
            float r3 = r0.y
            int r3 = (int) r3
            com.badlogic.gdx.graphics.Pixmap$Format r4 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r1.<init>(r2, r3, r4)
            r12.mPixmap = r1
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            float r2 = r0.x
            int r9 = (int) r2
            float r0 = r0.y
            int r10 = (int) r0
            r2 = r13
            r1.drawPixmap(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L52:
            r13.dispose()
            r12.mImageContainsTransparentPixels = r11
            com.badlogic.gdx.graphics.Pixmap r13 = r12.mPixmap
            java.nio.ByteBuffer r13 = r13.getPixels()
            r13.rewind()
            int r0 = r13.remaining()
            byte[] r1 = new byte[r0]
            r13.get(r1)
            r13.rewind()
            r13 = 3
        L6d:
            r2 = 1
            if (r13 >= r0) goto L7e
            r3 = r1[r13]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 250(0xfa, float:3.5E-43)
            if (r3 >= r4) goto L7b
            r12.mImageContainsTransparentPixels = r2
            goto L7e
        L7b:
            int r13 = r13 + 4
            goto L6d
        L7e:
            com.badlogic.gdx.graphics.Texture r13 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.Pixmap r0 = r12.mPixmap
            r13.<init>(r0, r11)
            r12.mTexture = r13
            r12.mImageLoaded = r2
            r12.resetSelection()
            r12.validateSelection()
            r12.clampSelection()
            r12.invalidateHierarchy()
            r12.pack()
            r12.validate()
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getHeight()
            float r13 = (float) r13
            float r0 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.max_height
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto Lbf
            r12.mScaledTextureHeight = r0
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getWidth()
            float r13 = (float) r13
            com.badlogic.gdx.graphics.Texture r1 = r12.mTexture
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r13 = r13 / r1
            float r0 = r0 * r13
            r12.mScaledTextureWidth = r0
            goto L14a
        Lbf:
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getWidth()
            float r13 = (float) r13
            float r0 = r12.getWidth()
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto Lec
            float r13 = r12.getWidth()
            r12.mScaledTextureWidth = r13
            float r13 = r12.getWidth()
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getHeight()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.Texture r1 = r12.mTexture
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r13 = r13 * r0
            r12.mScaledTextureHeight = r13
            goto L14a
        Lec:
            float r13 = r12.getWidth()
            r0 = 1048576000(0x3e800000, float:0.25)
            float r13 = r13 * r0
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget.min_height
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L117
            r12.mScaledTextureHeight = r1
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getWidth()
            float r13 = (float) r13
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r13 = r13 / r0
            float r1 = r1 * r13
            r12.mScaledTextureWidth = r1
            goto L14a
        L117:
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L138
            r12.mScaledTextureWidth = r13
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getHeight()
            float r0 = (float) r0
            com.badlogic.gdx.graphics.Texture r1 = r12.mTexture
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r13 = r13 * r0
            r12.mScaledTextureHeight = r13
            goto L14a
        L138:
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getWidth()
            float r13 = (float) r13
            r12.mScaledTextureWidth = r13
            com.badlogic.gdx.graphics.Texture r13 = r12.mTexture
            int r13 = r13.getHeight()
            float r13 = (float) r13
            r12.mScaledTextureHeight = r13
        L14a:
            float r13 = r12.mScaledTextureWidth
            com.badlogic.gdx.graphics.Texture r0 = r12.mTexture
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r13 = r13 / r0
            r12.mTextureScale = r13
            r12.invalidate()
            r12.layout()
            r12.onLoaded()
            r12.onSelectionChanged()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12.mLoadingLabel
            com.badlogic.gdx.scenes.scene2d.Stage r13 = r13.getStage()
            if (r13 == 0) goto L16f
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12.mLoadingLabel
            r13.remove()
        L16f:
            r13 = 1065353216(0x3f800000, float:1.0)
            float r0 = r12.mScaledTextureWidth
            float r1 = r12.getWidth()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18a
            com.badlogic.gdx.math.Vector2 r0 = r12.mPanOffset
            float r1 = r12.getWidth()
            float r2 = r12.mScaledTextureWidth
            float r1 = r1 - r2
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            float r1 = r1 * r2
            r0.x = r1
        L18a:
            float r0 = r12.mScaledTextureHeight
            float r1 = r12.getHeight()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a3
            com.badlogic.gdx.math.Vector2 r0 = r12.mPanOffset
            float r1 = r12.getHeight()
            float r2 = r12.mScaledTextureHeight
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r0.y = r1
        L1a3:
            float r0 = r12.mScaledTextureWidth
            float r1 = r12.getWidth()
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e4
            float r0 = r12.mScaledTextureHeight
            float r1 = r12.getHeight()
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e4
            float r13 = r12.mScaledTextureWidth
            float r0 = r12.getWidth()
            float r13 = r13 / r0
            float r0 = r12.mScaledTextureHeight
            float r1 = r12.getHeight()
            float r0 = r0 / r1
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto L1d9
            float r13 = r12.getWidth()
            float r13 = r13 * r2
            float r0 = r12.mScaledTextureWidth
            goto L1e1
        L1d9:
            float r13 = r12.getHeight()
            float r13 = r13 * r2
            float r0 = r12.mScaledTextureHeight
        L1e1:
            float r13 = r13 / r0
            r7 = r13
            goto L1e6
        L1e4:
            r7 = 1065353216(0x3f800000, float:1.0)
        L1e6:
            r12.mZoomScale = r7
            org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget$2 r13 = new org.fortheloss.sticknodes.animationscreen.spritemenus.SpriteSelectorWidget$2
            com.badlogic.gdx.InputMultiplexer r3 = org.fortheloss.sticknodes.App.inputMultiplexer
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1101004800(0x41a00000, float:20.0)
            r6 = 20
            r0 = r13
            r1 = r12
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.mLogZoomer = r13
            return
    }

    public void setRelativeSpriteOrigin(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1.mSpriteOrigin
            r0.set(r2, r3)
            return
    }

    public void setSelection(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.math.Rectangle r0 = r1.mSelection
            r0.set(r2, r3, r4, r5)
            r1.clampSelection()
            r1.validateSelection()
            r1.onSelectionChanged()
            return
    }

    public void setSelection(org.fortheloss.sticknodes.animationscreen.spritemenus.SelectionData r5) {
            r4 = this;
            com.badlogic.gdx.math.Rectangle r0 = r4.mSelection
            float r1 = r5.u1
            float r2 = r5.v1
            float r3 = r5.u2
            float r5 = r5.v2
            r0.set(r1, r2, r3, r5)
            r4.clampSelection()
            r4.validateSelection()
            r4.onSelectionChanged()
            return
    }

    public void toggleMaskState() {
            r3 = this;
            int r0 = r3.mMaskState
            r1 = 1
            if (r0 != 0) goto L9
            r3.setMaskState(r1)
            goto L29
        L9:
            r2 = 2
            if (r0 != r1) goto L10
            r3.setMaskState(r2)
            goto L29
        L10:
            r1 = 3
            if (r0 != r2) goto L17
            r3.setMaskState(r1)
            goto L29
        L17:
            r2 = 4
            if (r0 != r1) goto L1e
            r3.setMaskState(r2)
            goto L29
        L1e:
            if (r0 != r2) goto L25
            r0 = 5
            r3.setMaskState(r0)
            goto L29
        L25:
            r0 = 0
            r3.setMaskState(r0)
        L29:
            return
    }

    public void zoomIn() {
            r2 = this;
            boolean r0 = r2.mImageLoaded
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.framework.LogZoomer r0 = r2.mLogZoomer
            r1 = 1
            r0.incrementZoom(r1)
            return
    }

    public void zoomOut() {
            r2 = this;
            boolean r0 = r2.mImageLoaded
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.framework.LogZoomer r0 = r2.mLogZoomer
            r1 = -1
            r0.incrementZoom(r1)
            return
    }
}
