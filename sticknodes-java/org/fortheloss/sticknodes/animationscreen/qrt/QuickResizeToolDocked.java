package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QuickResizeToolDocked extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule mAnimateToolsModuleRef;
    private java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle> mButtonStyles;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mCameraTable;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule mCanvasModuleRef;
    private org.fortheloss.framework.ColorPicker mColorPicker;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton mColorPickerOwnerRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen mContextRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule mCreateToolsModuleRef;
    private boolean mEnabled;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule mFramesModuleRef;
    private float mInitialValue1;
    private float mInitialValue2;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mMovieclipTable;
    private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule mMovieclipToolsModuleRef;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mNodeAnimationTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mNodeCreationTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mNodeCreationTableTestSS;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mNothingAnimationTable;
    private boolean mRememberedContextBasedCurveLengthWasNormal;
    private boolean mRememberedContextBasedDragLengthWasNormal;
    private java.lang.Object mRememberedObject;
    private float mRememberedObjectValue;
    private float mRememberedObjectValue2;
    private short mRememberedObjectValueType;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mSpriteTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mStickfigureAnimationTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mStickfigureCreationTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtTable mTextfieldTable;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle mcColorButtonPolyfillStyle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle mcColorButtonStyle;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> qrtTables;



    /* renamed from: -$$Nest$fgetmColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1262$$Nest$fgetmColorPicker(org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmColorPickerOwnerRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton m1263$$Nest$fgetmColorPickerOwnerRef(org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0) {
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r0 = r0.mColorPickerOwnerRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmContextRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen m1264$$Nest$fgetmContextRef(org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0) {
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.mContextRef
            return r0
    }

    public QuickResizeToolDocked(org.fortheloss.sticknodes.animationscreen.AnimationScreen r3, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r7, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r8) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mEnabled = r0
            r1 = 0
            r2.mInitialValue1 = r1
            r2.mInitialValue2 = r1
            r2.mRememberedContextBasedDragLengthWasNormal = r0
            r2.mRememberedContextBasedCurveLengthWasNormal = r0
            r2.mRememberedObjectValue = r1
            r2.mRememberedObjectValue2 = r1
            r2.mContextRef = r3
            r2.mCanvasModuleRef = r4
            r2.mFramesModuleRef = r5
            r2.mAnimateToolsModuleRef = r6
            r2.mMovieclipToolsModuleRef = r7
            r2.mCreateToolsModuleRef = r8
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r3.getStage()
            float r5 = r4.getWidth()
            float r6 = r4.getHeight()
            r2.setSize(r5, r6)
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r2.setTouchable(r7)
            r7 = 0
            r2.setTransform(r7)
            r4.addActor(r2)
            r2.createStyles()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.qrtTables = r4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNothingAnimation
            r4.<init>(r3, r2, r5, r6)
            r2.mNothingAnimationTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableCamera
            r4.<init>(r3, r2, r5, r6)
            r2.mCameraTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureCreation
            r4.<init>(r3, r2, r5, r6)
            r2.mStickfigureCreationTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreation
            r4.<init>(r3, r2, r5, r6)
            r2.mNodeCreationTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeCreationTestSS
            r4.<init>(r3, r2, r5, r6)
            r2.mNodeCreationTableTestSS = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableStickfigureAnimation
            r4.<init>(r3, r2, r5, r6)
            r2.mStickfigureAnimationTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableNodeAnimation
            r4.<init>(r3, r2, r5, r6)
            r2.mNodeAnimationTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableMovieclip r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableMovieclip
            r4.<init>(r3, r2, r5, r6)
            r2.mMovieclipTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableSprite
            r4.<init>(r3, r2, r5, r6)
            r2.mSpriteTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r7 = r2.qrtTables
            r7.add(r4)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtTableTextfield
            r4.<init>(r3, r2, r5, r6)
            r2.mTextfieldTable = r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r3 = r2.qrtTables
            r3.add(r4)
            return
    }

    private void createStyles() {
            r81 = this;
            r7 = r81
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r7.mContextRef
            org.fortheloss.framework.Assets r1 = r1.getAssets()
            java.lang.String r2 = org.fortheloss.sticknodes.App.qrtAtlas
            r8 = 1
            java.lang.Object r1 = r1.get(r2, r0, r8)
            r9 = r1
            com.badlogic.gdx.graphics.g2d.TextureAtlas r9 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r7.mContextRef
            org.fortheloss.framework.Assets r1 = r1.getAssets()
            java.lang.String r2 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r0 = r1.get(r2, r0, r8)
            r4 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7.mContextRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            java.lang.String r1 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedOutline
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r2 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.Object r0 = r0.get(r1, r2, r8)
            r18 = r0
            com.badlogic.gdx.graphics.g2d.BitmapFont r18 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r18
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked$1 r10 = new org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7.mContextRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            r6 = 0
            r0 = r10
            r1 = r81
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mColorPicker = r10
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.setColor(r0, r0, r0, r0)
            org.fortheloss.framework.ColorPicker r0 = r7.mColorPicker
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked$2 r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked$2
            r1.<init>(r7)
            r0.addListener(r1)
            java.lang.String r0 = "qrt_dot"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r9.findRegion(r0)
            java.lang.String r1 = "qrt_color_swab"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r9.findRegion(r1)
            java.lang.String r2 = "qrt_longpress_indicator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r9.findRegion(r2)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r3 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r4 = "qrt_color_bg"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r9.findRegion(r4)
            r3.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r4 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r5 = "qrt_toggle_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r9.findRegion(r5)
            r4.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r5 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r6 = "qrt_toggle_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r9.findRegion(r6)
            r5.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r6 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r10 = "qrt_toggle_polyfill_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r9.findRegion(r10)
            r6.<init>(r10)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r10 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r11 = "qrt_toggle_polyfill_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r10.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r15 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r11 = "qrt_button_diamond"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r15.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r14 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r11 = "qrt_button_diamond_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r14.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r13 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r11 = "qrt_button_round"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r13.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r11 = "qrt_button_round_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r8 = "qrt_button_toggle"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r9.findRegion(r8)
            r11.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r8 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r16 = r11
            java.lang.String r11 = "qrt_button_toggle_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r8.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r19 = r12
            java.lang.String r12 = "qrt_button_toggle_square_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r20 = r11
            java.lang.String r11 = "qrt_button_square_red"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r21 = r12
            java.lang.String r12 = "qrt_icon_flip_x"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r22 = r11
            java.lang.String r11 = "qrt_icon_flip_y"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r23 = r12
            java.lang.String r12 = "qrt_icon_copy"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r24 = r11
            java.lang.String r11 = "qrt_icon_copy_alt"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r25 = r12
            java.lang.String r12 = "qrt_icon_copy_one"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r26 = r11
            java.lang.String r11 = "qrt_icon_delete"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r27 = r12
            java.lang.String r12 = "qrt_icon_delete_one"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r28 = r11
            java.lang.String r11 = "qrt_icon_drag_lock"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r29 = r12
            java.lang.String r12 = "qrt_icon_lock_node"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r30 = r11
            java.lang.String r11 = "qrt_icon_paste"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r31 = r12
            java.lang.String r12 = "qrt_icon_paste_stickfigure"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r32 = r11
            java.lang.String r11 = "qrt_icon_paste_movieclip"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r33 = r12
            java.lang.String r12 = "qrt_icon_paste_sprite"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r34 = r11
            java.lang.String r11 = "qrt_icon_paste_text"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r35 = r12
            java.lang.String r12 = "qrt_icon_rotate"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r36 = r11
            java.lang.String r11 = "qrt_icon_scale_node"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r37 = r12
            java.lang.String r12 = "qrt_icon_static"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r38 = r11
            java.lang.String r11 = "qrt_icon_stretchy"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r39 = r12
            java.lang.String r12 = "qrt_icon_thickness"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r40 = r11
            java.lang.String r11 = "qrt_icon_reverse_gradient_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r41 = r12
            java.lang.String r12 = "qrt_icon_reverse_gradient_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r42 = r11
            java.lang.String r11 = "qrt_icon_gradient_vertical"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r43 = r12
            java.lang.String r12 = "qrt_icon_gradient_horizontal"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r44 = r11
            java.lang.String r11 = "qrt_icon_gradient_radial"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r45 = r12
            java.lang.String r12 = "qrt_icon_shape_segment_curve"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r46 = r11
            java.lang.String r11 = "qrt_icon_shape_trapezoid_start"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r47 = r12
            java.lang.String r12 = "qrt_icon_shape_trapezoid_end"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r48 = r11
            java.lang.String r11 = "qrt_icon_shape_triangle_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r49 = r12
            java.lang.String r12 = "qrt_icon_shape_triangle_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r50 = r11
            java.lang.String r11 = "qrt_icon_shape_triangle_c"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r51 = r12
            java.lang.String r12 = "qrt_icon_shape_triangle_upsidedown_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r52 = r11
            java.lang.String r11 = "qrt_icon_shape_triangle_upsidedown_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r53 = r12
            java.lang.String r12 = "qrt_icon_shape_circle_full"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r54 = r11
            java.lang.String r11 = "qrt_icon_shape_circle_half"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r55 = r12
            java.lang.String r12 = "qrt_icon_shape_circle_upsidedown_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r56 = r11
            java.lang.String r11 = "qrt_icon_shape_circle_upsidedown_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r57 = r12
            java.lang.String r12 = "qrt_icon_shape_polygon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r58 = r11
            java.lang.String r11 = "qrt_icon_scale_figure"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r59 = r12
            java.lang.String r12 = "qrt_icon_jump_to_main"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r60 = r11
            java.lang.String r11 = "qrt_icon_join"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r61 = r12
            java.lang.String r12 = "qrt_icon_unjoin"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r62 = r11
            java.lang.String r11 = "qrt_icon_push_back"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r63 = r12
            java.lang.String r12 = "qrt_icon_push_forward"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r64 = r11
            java.lang.String r11 = "qrt_icon_opacity"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r65 = r12
            java.lang.String r12 = "qrt_icon_sprite_scale_mode_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r66 = r11
            java.lang.String r11 = "qrt_icon_sprite_scale_mode_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r67 = r12
            java.lang.String r12 = "qrt_icon_sprite_scale_linked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r68 = r11
            java.lang.String r11 = "qrt_icon_sprite_scale_unlinked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r69 = r12
            java.lang.String r12 = "qrt_icon_text_align_left"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r70 = r11
            java.lang.String r11 = "qrt_icon_text_align_center"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r71 = r12
            java.lang.String r12 = "qrt_icon_text_align_right"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r72 = r11
            java.lang.String r11 = "qrt_icon_scale_camera"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r73 = r12
            java.lang.String r12 = "qrt_camera_autocam_origin"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r74 = r11
            java.lang.String r11 = "qrt_camera_mode_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r75 = r12
            java.lang.String r12 = "qrt_camera_mode_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r76 = r11
            java.lang.String r11 = "qrt_camera_mode_c"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r77 = r12
            java.lang.String r12 = "qrt_camera_mode_d"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r78 = r11
            java.lang.String r11 = "qrt_camera_mode_e"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r9.findRegion(r11)
            r12.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r11 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r79 = r12
            java.lang.String r12 = "qrt_camera_mode_f"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r9.findRegion(r12)
            r11.<init>(r12)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r12 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r80 = r11
            java.lang.String r11 = "qrt_camera_mode_g"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r9.findRegion(r11)
            r12.<init>(r9)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r9 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle
            r9.<init>(r3, r4, r5, r1)
            r7.mcColorButtonStyle = r9
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r4 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle
            r4.<init>(r3, r6, r10, r1)
            r7.mcColorButtonPolyfillStyle = r4
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r7.mButtonStyles = r1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r3 = r16
            r4 = r20
            r5 = r22
            r6 = r24
            r9 = r26
            r20 = r28
            r22 = r30
            r24 = r32
            r26 = r34
            r28 = r36
            r30 = r38
            r32 = r40
            r34 = r42
            r36 = r44
            r16 = r46
            r38 = r48
            r40 = r50
            r42 = r52
            r44 = r54
            r46 = r56
            r48 = r58
            r50 = r60
            r52 = r62
            r54 = r64
            r56 = r66
            r58 = r68
            r60 = r70
            r62 = r72
            r64 = r74
            r66 = r76
            r68 = r78
            r70 = r80
            r11 = r14
            r76 = r12
            r72 = r73
            r73 = r75
            r74 = r77
            r75 = r79
            r12 = r15
            r77 = r13
            r13 = r16
            r78 = r14
            r14 = r0
            r79 = r15
            r15 = r2
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 1
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r78
            r12 = r79
            r13 = r38
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 3
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r78
            r13 = r47
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 2
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r3
            r13 = r44
            r14 = r55
            r15 = r0
            r16 = r2
            r17 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 4
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r13 = r46
            r14 = r57
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 80
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r13 = r51
            r14 = r0
            r15 = r2
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 50
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r8
            r13 = r49
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 51
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r12 = r3
            r13 = r40
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 52
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r13 = r42
            r14 = r53
            r15 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 7
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r79
            r12 = r79
            r13 = r48
            r14 = r0
            r15 = r2
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 8
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r21
            r12 = r21
            r13 = r27
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 9
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r21
            r13 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 11
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r4
            r12 = r4
            r13 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r10 = r7.mButtonStyles
            r11 = 39
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            r10.put(r11, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r4
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r10 = 12
            java.lang.Short r10 = java.lang.Short.valueOf(r10)
            r6.put(r10, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 13
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r31
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 14
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r24
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 60
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r33
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 61
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r26
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 62
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r35
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r6 = r7.mButtonStyles
            r9 = 63
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r6.put(r9, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 15
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 16
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r3
            r13 = r41
            r14 = r34
            r15 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 17
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r12 = r8
            r13 = r43
            r14 = r0
            r15 = r2
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 70
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r12 = r3
            r13 = r36
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 71
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r45
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 72
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r78
            r12 = r79
            r13 = r39
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 19
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r79
            r13 = r32
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 21
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r78
            r13 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 22
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r77
            r12 = r77
            r13 = r28
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 23
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r19
            r13 = r29
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 24
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r3
            r13 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 25
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r30
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 26
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r79
            r12 = r79
            r13 = r59
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 27
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r4
            r12 = r4
            r13 = r50
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 28
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r8
            r13 = r61
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 29
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r12 = r3
            r13 = r52
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 30
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r4
            r12 = r4
            r13 = r63
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 31
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r54
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 32
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r79
            r12 = r79
            r13 = r65
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 33
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r3
            r13 = r67
            r14 = r56
            r15 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 34
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r69
            r14 = r58
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 35
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r13 = r60
            r14 = r0
            r15 = r2
            r16 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 36
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r71
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 37
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r62
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 38
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r79
            r12 = r79
            r13 = r72
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r5 = r7.mButtonStyles
            r6 = 40
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5.put(r6, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r4
            r12 = r4
            r13 = r64
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 41
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r8
            r12 = r8
            r13 = r73
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 42
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r11 = r3
            r12 = r3
            r13 = r66
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 43
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r74
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 44
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r68
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 45
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r75
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 46
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r70
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r4 = r7.mButtonStyles
            r5 = 47
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            r4.put(r5, r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r1 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle
            r10 = r1
            r13 = r76
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r0 = r7.mButtonStyles
            r2 = 48
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r0.put(r2, r1)
            return
    }

    private int getCurrentFramesContainerUID() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = -1
            return r0
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2.mFramesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r0.getFramesContainer()
            int r0 = r0.getUID()
            return r0
    }

    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure getCurrentlySelectedFigure() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0.getCurrentlySelectedStickfigure()
            if (r1 != 0) goto L10
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r0.getCurrentlySelectedMC()
        L10:
            if (r1 != 0) goto L16
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.getCurrentlySelectedSprite()
        L16:
            return r1
    }

    private org.fortheloss.sticknodes.data.IFrameData getCurrentlySelectedFrame() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 0
            return r0
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2.mFramesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            return r0
    }

    private org.fortheloss.sticknodes.animationscreen.FrameCamera getCurrentlySelectedFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            return r0
    }

    private org.fortheloss.sticknodes.TextfieldBox getCurrentlySelectedTextfieldBox() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            return r0
    }

    private float getNextAngleFrom(float r10) {
            r9 = this;
            int r0 = java.lang.Math.round(r10)
            float r0 = (float) r0
            r1 = 1134395392(0x439d8000, float:315.0)
            r2 = 1132920832(0x43870000, float:270.0)
            r3 = 1130430464(0x43610000, float:225.0)
            r4 = 1127481344(0x43340000, float:180.0)
            r5 = 1124532224(0x43070000, float:135.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = 1110704128(0x42340000, float:45.0)
            r8 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r0
            int r10 = java.lang.Math.round(r10)
            float r1 = (float) r10
            goto L93
        L23:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L2b
        L27:
            r1 = 1110704128(0x42340000, float:45.0)
            goto L93
        L2b:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L33
        L2f:
            r1 = 1119092736(0x42b40000, float:90.0)
            goto L93
        L33:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L3b
        L37:
            r1 = 1124532224(0x43070000, float:135.0)
            goto L93
        L3b:
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 != 0) goto L42
        L3f:
            r1 = 1127481344(0x43340000, float:180.0)
            goto L93
        L42:
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L49
        L46:
            r1 = 1130430464(0x43610000, float:225.0)
            goto L93
        L49:
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L50
        L4d:
            r1 = 1132920832(0x43870000, float:270.0)
            goto L93
        L50:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L55
            goto L93
        L55:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L5b
        L59:
            r1 = 0
            goto L93
        L5b:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L62
            goto L59
        L62:
            r0 = 1113325568(0x425c0000, float:55.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L69
            goto L27
        L69:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L70
            goto L2f
        L70:
            r0 = 1125187584(0x43110000, float:145.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L77
            goto L37
        L77:
            r0 = 1128136704(0x433e0000, float:190.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7e
            goto L3f
        L7e:
            r0 = 1131085824(0x436b0000, float:235.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L85
            goto L46
        L85:
            r0 = 1133248512(0x438c0000, float:280.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8c
            goto L4d
        L8c:
            r0 = 1134723072(0x43a28000, float:325.0)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L59
        L93:
            return r1
    }

    private void updateCurrentSelection() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3.getCurrentlySelectedFigure()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r3.getCurrentlySelectedFrameCamera()
            if (r1 != 0) goto L30
            org.fortheloss.sticknodes.TextfieldBox r1 = r0.getCurrentlySelectedTextfieldBox()
            if (r1 == 0) goto L1a
            r3.setSelection(r1)
            goto L49
        L1a:
            if (r2 == 0) goto L20
            r3.setSelection(r2)
            goto L49
        L20:
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto L2c
            r0 = 0
            r3.setSelection(r0)
            goto L49
        L2c:
            r3.hide()
            goto L49
        L30:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 != 0) goto L46
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L42
            org.fortheloss.sticknodes.stickfigure.INode r0 = r1.getMainNode()
            r3.setSelection(r0)
            goto L49
        L42:
            r3.setSelection(r0)
            goto L49
        L46:
            r3.setSelection(r1)
        L49:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            super.act(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L14
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = r1.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r2 == r0) goto L14
            r1.updateCurrentSelection()
        L14:
            return
    }

    public void autoCameraJumpToOrigin() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto L11
            boolean r1 = r0.isAutoCamera()
            if (r1 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2.mFramesModuleRef
            r1.goToAutoCamStartFrame(r0)
        L11:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void copyCamera() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            r1.copyCamera(r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void copyFigure() {
            r1 = this;
            r0 = 0
            r1.copyFigure(r0)
            return
    }

    public void copyFigure(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            org.fortheloss.sticknodes.data.IFrameData r1 = r4.getCurrentlySelectedFrame()
            int r2 = r4.getCurrentFramesContainerUID()
            if (r0 == 0) goto L3f
            if (r1 == 0) goto L3f
            r3 = -1
            if (r2 != r3) goto L14
            goto L3f
        L14:
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto L20
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r4.mContextRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r3.copyStickfigure(r0, r5, r1, r2)
            goto L39
        L20:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r5 == 0) goto L2e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4.mContextRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r5.copyMC(r0, r1)
            goto L39
        L2e:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L39
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4.mContextRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r5.copySprite(r0, r1)
        L39:
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L3f:
            return
    }

    public void copyNode(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L18
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2.mCreateToolsModuleRef
            r0.copySegment(r3)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L18:
            return
    }

    public void copyTextfield() {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            r1.copyTextfield(r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void deleteFigure() {
            r1 = this;
            r0 = 0
            r1.deleteFigure(r0)
            return
    }

    public void deleteFigure(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r1.deleteStickfigure(r0, r3)
            goto L2a
        L13:
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r3 == 0) goto L1f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2.mContextRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r3.deleteMC(r0)
            goto L2a
        L1f:
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto L2a
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2.mContextRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r3.deleteSpriteRef(r0)
        L2a:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void deleteNode(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L20
            if (r3 == 0) goto L15
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2.mCreateToolsModuleRef
            r3.deleteSegmentAndChildren()
            goto L1a
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r3 = r2.mCreateToolsModuleRef
            r3.deleteOneSegment()
        L1a:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L20:
            return
    }

    public void deleteTextfield() {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            r1.deleteTextfield(r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r3.remove()
            r3.clear()
            r0 = 0
            r3.mContextRef = r0
            r3.mCanvasModuleRef = r0
            r3.mFramesModuleRef = r0
            r3.mAnimateToolsModuleRef = r0
            r3.mMovieclipToolsModuleRef = r0
            r3.mCreateToolsModuleRef = r0
            r3.mColorPickerOwnerRef = r0
            r3.mcColorButtonStyle = r0
            r3.mcColorButtonPolyfillStyle = r0
            org.fortheloss.framework.ColorPicker r1 = r3.mColorPicker
            if (r1 == 0) goto L22
            r1.dispose()
            r3.mColorPicker = r0
        L22:
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r1 = r3.mButtonStyles
            if (r1 == 0) goto L2b
            r1.clear()
            r3.mButtonStyles = r0
        L2b:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r1 = r3.qrtTables
            if (r1 == 0) goto L47
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L35:
            if (r1 < 0) goto L45
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r2 = r3.qrtTables
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r2 = (org.fortheloss.sticknodes.animationscreen.qrt.QrtTable) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L35
        L45:
            r3.qrtTables = r0
        L47:
            r3.mNothingAnimationTable = r0
            r3.mCameraTable = r0
            r3.mStickfigureCreationTable = r0
            r3.mNodeCreationTable = r0
            r3.mNodeCreationTableTestSS = r0
            r3.mStickfigureAnimationTable = r0
            r3.mNodeAnimationTable = r0
            r3.mMovieclipTable = r0
            r3.mSpriteTable = r0
            r3.mTextfieldTable = r0
            return
    }

    public void flipFigure(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 == 0) goto L1a
            r1 = 0
            if (r3 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2.mCanvasModuleRef
            r3.flipFigureX(r0, r1)
            goto L14
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2.mCanvasModuleRef
            r3.flipFigureY(r0, r1)
        L14:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L1a:
            return
    }

    public void flipStickNode(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L1a
            r1 = 0
            if (r3 == 0) goto Lf
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2.mCanvasModuleRef
            r3.flipSegmentX(r0, r1)
            goto L14
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2.mCanvasModuleRef
            r3.flipSegmentY(r0, r1)
        L14:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L1a:
            return
    }

    public void flipTrapezoidThickness() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L20
            int r1 = r0.getLimbType()
            r2 = 6
            if (r1 != r2) goto L20
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            float r2 = r0.getTrapezoidThickness2()
            float r3 = r0.getTrapezoidThickness1()
            r1.setShapeTrapezoidThickness(r2, r3, r0)
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L20:
            return
    }

    public org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle getButtonStyle(short r2) {
            r1 = this;
            java.util.Map<java.lang.Short, org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle> r0 = r1.mButtonStyles
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtButton$QrtButtonStyle r2 = (org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle) r2
            return r2
    }

    public org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle getColorButtonPolyfillStyle() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r1.mcColorButtonPolyfillStyle
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle getColorButtonStyle() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r1.mcColorButtonStyle
            return r0
    }

    public org.fortheloss.framework.ColorPicker getColorPicker(org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r1) {
            r0 = this;
            r0.mColorPickerOwnerRef = r1
            org.fortheloss.framework.ColorPicker r1 = r0.mColorPicker
            return r1
    }

    public org.fortheloss.sticknodes.animationscreen.AnimationScreen getContext() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getCurrentlySelectedStickNode() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L11
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    public void hide() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r0)
            return
    }

    public boolean incrementConnectorValue(float r6, boolean r7) {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.getCurrentlySelectedStickNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            r2 = 0
            if (r1 == 0) goto L8d
            r1 = r0
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            if (r7 == 0) goto L14
            float r7 = r1.getNodeValue()
            r5.mInitialValue1 = r7
        L14:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r7.getStage()
            float r7 = r7.getWidth()
            float r6 = r6 / r7
            r7 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6 * r7
            float r7 = r0.getAngle()
            r0 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r0
            r3 = 0
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 >= 0) goto L30
            float r7 = r7 + r0
        L30:
            r0 = 1118437376(0x42aa0000, float:85.0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3e
            r0 = 1119748096(0x42be0000, float:95.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L4c
        L3e:
            r0 = 1132756992(0x43848000, float:265.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L53
            r0 = 1133084672(0x43898000, float:275.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L53
        L4c:
            boolean r7 = r5.mRememberedContextBasedDragLengthWasNormal
            if (r7 != 0) goto L67
            float r6 = r6 * r4
            goto L67
        L53:
            r0 = 1132920832(0x43870000, float:270.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L64
            r0 = 1119092736(0x42b40000, float:90.0)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L64
            float r6 = r6 * r4
            r5.mRememberedContextBasedDragLengthWasNormal = r2
            goto L67
        L64:
            r7 = 1
            r5.mRememberedContextBasedDragLengthWasNormal = r7
        L67:
            float r7 = r5.mInitialValue1
            float r7 = r7 + r6
            r6 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r6
            int r7 = java.lang.Math.round(r7)
            float r7 = (float) r7
            float r7 = r7 / r6
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5.mCanvasModuleRef
            r6.setConnectorNodeValue(r7, r1)
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
            float r6 = r1.getNodeValue()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L8d
            r1.getNodeValue()
            r1.getLength()
        L8d:
            return r2
    }

    public boolean incrementNodeLengthBy(float r5, boolean r6) {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getCurrentlySelectedStickNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto Ld
            boolean r5 = r4.incrementConnectorValue(r5, r6)
            return r5
        Ld:
            r1 = 0
            if (r0 == 0) goto L83
            if (r6 == 0) goto L18
            float r6 = r0.getLength()
            r4.mInitialValue1 = r6
        L18:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r4.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r6.getStage()
            float r6 = r6.getWidth()
            float r5 = r5 / r6
            r6 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 * r6
            float r6 = r0.getAngle()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r2
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L34
            float r6 = r6 + r2
        L34:
            r2 = 1118437376(0x42aa0000, float:85.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L42
            r2 = 1119748096(0x42be0000, float:95.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L50
        L42:
            r2 = 1132756992(0x43848000, float:265.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L57
            r2 = 1133084672(0x43898000, float:275.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L57
        L50:
            boolean r6 = r4.mRememberedContextBasedDragLengthWasNormal
            if (r6 != 0) goto L6b
            float r5 = r5 * r3
            goto L6b
        L57:
            r2 = 1132920832(0x43870000, float:270.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L68
            r2 = 1119092736(0x42b40000, float:90.0)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 < 0) goto L68
            float r5 = r5 * r3
            r4.mRememberedContextBasedDragLengthWasNormal = r1
            goto L6b
        L68:
            r6 = 1
            r4.mRememberedContextBasedDragLengthWasNormal = r6
        L6b:
            float r6 = r4.mInitialValue1
            float r6 = r6 + r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r5
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            float r6 = r6 / r5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4.mCanvasModuleRef
            r5.setSegmentLength(r6, r0)
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L83:
            return r1
    }

    public boolean incrementNodeSegmentCurveBy(float r6, boolean r7) {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.getCurrentlySelectedStickNode()
            r1 = 0
            if (r0 == 0) goto L83
            if (r7 == 0) goto L10
            int r7 = r0.getSegmentCurve()
            float r7 = (float) r7
            r5.mInitialValue1 = r7
        L10:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r7.getStage()
            float r7 = r7.getWidth()
            float r6 = r6 / r7
            r7 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6 * r7
            float r7 = r0.getAngle()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r2
            r3 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2c
            float r7 = r7 + r2
        L2c:
            r2 = 1118437376(0x42aa0000, float:85.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L3b
            r2 = 1119748096(0x42be0000, float:95.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L49
        L3b:
            r2 = 1132756992(0x43848000, float:265.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L50
            r2 = 1133084672(0x43898000, float:275.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L50
        L49:
            boolean r7 = r5.mRememberedContextBasedCurveLengthWasNormal
            if (r7 != 0) goto L63
            float r6 = r6 * r3
            goto L63
        L50:
            r2 = 1132920832(0x43870000, float:270.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L61
            r2 = 1119092736(0x42b40000, float:90.0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L61
            float r6 = r6 * r3
            r5.mRememberedContextBasedCurveLengthWasNormal = r1
            goto L63
        L61:
            r5.mRememberedContextBasedCurveLengthWasNormal = r4
        L63:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r5.mCanvasModuleRef
            float r2 = r5.mInitialValue1
            float r6 = r6 + r2
            int r6 = (int) r6
            int r2 = (int) r2
            r7.setShapeSegmentCurve(r6, r0, r2, r4)
            int r6 = r0.getSegmentCurve()
            r7 = -99999(0xfffffffffffe7961, float:NaN)
            if (r6 <= r7) goto L7d
            int r6 = r0.getSegmentCurve()
            r7 = 99999(0x1869f, float:1.40128E-40)
        L7d:
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
        L83:
            return r1
    }

    public boolean incrementNodeThicknessBy(float r7, boolean r8) {
            r6 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6.getCurrentlySelectedStickNode()
            r1 = 0
            if (r0 == 0) goto Lc0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r6.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            float r2 = r2.getWidth()
            float r7 = r7 / r2
            r2 = 1133903872(0x43960000, float:300.0)
            float r7 = r7 * r2
            int r2 = r0.getLimbType()
            r3 = 6
            if (r2 != r3) goto L9c
            if (r8 == 0) goto L2b
            float r8 = r0.getTrapezoidThickness1()
            r6.mInitialValue1 = r8
            float r8 = r0.getTrapezoidThickness2()
            r6.mInitialValue2 = r8
        L2b:
            float r8 = r6.mInitialValue1
            float r2 = r6.mInitialValue2
            r3 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L3d
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r6.mCanvasModuleRef
            float r8 = r8 + r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.setShapeTrapezoidThickness1(r8, r0, r7)
            goto L74
        L3d:
            float r8 = r0.getTrapezoidRatio()
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L5d
            float r8 = r6.mInitialValue1
            float r2 = r6.mInitialValue2
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L56
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r6.mCanvasModuleRef
            float r8 = r8 + r7
            r2.setShapeTrapezoidThickness1(r8, r0, r4)
            goto L74
        L56:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r6.mCanvasModuleRef
            float r2 = r2 + r7
            r8.setShapeTrapezoidThickness2(r2, r0, r4)
            goto L74
        L5d:
            float r8 = r6.mInitialValue1
            float r2 = r6.mInitialValue2
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6d
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r6.mCanvasModuleRef
            float r7 = r7 + r8
            float r8 = r8 / r2
            r4.setShapeTrapezoidThickness1(r7, r0, r8)
            goto L74
        L6d:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r6.mCanvasModuleRef
            float r7 = r7 + r2
            float r8 = r8 / r2
            r4.setShapeTrapezoidThickness2(r7, r0, r8)
        L74:
            float r7 = r0.getTrapezoidThickness1()
            r8 = 1176255488(0x461c3c00, float:9999.0)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto L8a
            float r7 = r0.getTrapezoidThickness1()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L88
            goto L8a
        L88:
            r7 = 0
            goto L8b
        L8a:
            r7 = 1
        L8b:
            if (r7 != 0) goto Lba
            float r7 = r0.getTrapezoidThickness2()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto Lba
            float r7 = r0.getTrapezoidThickness2()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            goto Lba
        L9c:
            if (r8 == 0) goto La5
            int r8 = r0.getThickness()
            float r8 = (float) r8
            r6.mInitialValue1 = r8
        La5:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r6.mCanvasModuleRef
            float r2 = r6.mInitialValue1
            float r2 = r2 + r7
            int r7 = (int) r2
            r8.setSegmentThickness(r7, r0)
            int r7 = r0.getThickness()
            if (r7 <= 0) goto Lba
            int r7 = r0.getThickness()
            r8 = 9999(0x270f, float:1.4012E-41)
        Lba:
            r6.updateCurrentSelection()
            r6.updateCurrentModule()
        Lc0:
            return r1
    }

    public boolean incrementNodeTrapezoidEndBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L3f
            if (r4 == 0) goto Le
            float r4 = r0.getTrapezoidThickness2()
            r2.mInitialValue1 = r4
        Le:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.setShapeTrapezoidThickness2(r1, r0, r3)
            float r3 = r0.getTrapezoidThickness2()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L39
            float r3 = r0.getTrapezoidThickness2()
            r4 = 1176255488(0x461c3c00, float:9999.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
        L39:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L3f:
            r3 = 0
            return r3
    }

    public boolean incrementNodeTrapezoidStartBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L3f
            if (r4 == 0) goto Le
            float r4 = r0.getTrapezoidThickness1()
            r2.mInitialValue1 = r4
        Le:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.setShapeTrapezoidThickness1(r1, r0, r3)
            float r3 = r0.getTrapezoidThickness1()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L39
            float r3 = r0.getTrapezoidThickness1()
            r4 = 1176255488(0x461c3c00, float:9999.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
        L39:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L3f:
            r3 = 0
            return r3
    }

    public boolean incrementPolygonNumVerts(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L3b
            if (r4 == 0) goto Lf
            short r4 = r0.getNumPolygonVertices()
            float r4 = (float) r4
            r2.mInitialValue1 = r4
        Lf:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1112014848(0x42480000, float:50.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            int r3 = (int) r1
            short r3 = (short) r3
            r4.setShapeNumPolygonVertices(r3, r0)
            short r3 = r0.getNumPolygonVertices()
            r4 = 4
            if (r3 <= r4) goto L35
            short r3 = r0.getNumPolygonVertices()
            r4 = 16
        L35:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L3b:
            r3 = 0
            return r3
    }

    public boolean incrementTextfieldOpacity(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L3c
            if (r4 == 0) goto Le
            float r4 = r0.getAlpha()
            r2.mInitialValue1 = r4
        Le:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r4.setTextfieldTransparencyTo(r1, r0)
            float r3 = r0.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L36
            float r3 = r0.getAlpha()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
        L36:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L3c:
            r3 = 0
            return r3
    }

    public void jumpToMainNode() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L2e
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2.getCurrentlySelectedStickNode()
            if (r1 == 0) goto L4d
            boolean r1 = r1.isMainNode()
            if (r1 == 0) goto L24
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L4d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            r1.setSessionSelectionToNode(r0)
            goto L4d
        L24:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getMainNode()
            r1.setSessionSelectionToNode(r0)
            goto L4d
        L2e:
            if (r0 == 0) goto L4d
            boolean r1 = r0.isJoined()
            if (r1 == 0) goto L40
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            r1.setSessionSelectionToNode(r0)
            goto L4d
        L40:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L4d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getMainNode()
            r1.setSessionSelectionToNode(r0)
        L4d:
            r2.updateCurrentSelection()
            return
    }

    public void pasteCamera() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2.mContextRef
            r1.pasteCamera(r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void pasteMovieclip() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            r0.pasteMC()
            r1.updateCurrentSelection()
            r1.updateCurrentModule()
            return
    }

    public void pasteNode() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3.mContextRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            if (r0 == 0) goto L24
            int r1 = r1.getScreen()
            r2 = 1
            if (r1 != r2) goto L24
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r3.mCreateToolsModuleRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            boolean r0 = r1.isPreserveVisualAngleChecked(r0)
            r1.pasteSegment(r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L24:
            return
    }

    public void pasteSprite() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            r0.pasteSprite()
            r1.updateCurrentSelection()
            r1.updateCurrentModule()
            return
    }

    public void pasteStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            r0.pasteStickfigure()
            r1.updateCurrentSelection()
            r1.updateCurrentModule()
            return
    }

    public void pasteTextfield() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1.mContextRef
            r0.pasteTextfield()
            r1.updateCurrentSelection()
            r1.updateCurrentModule()
            return
    }

    public void promptToJoinFigure() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r0.getScreen()
            if (r1 != 0) goto L12
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2.mAnimateToolsModuleRef
            r0.joinFigure()
            goto L1e
        L12:
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2.mMovieclipToolsModuleRef
            r0.joinFigure()
        L1e:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void pushFigureBackward() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r0.getScreen()
            if (r1 != 0) goto L12
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2.mAnimateToolsModuleRef
            r0.pushFigureBackward()
            goto L1e
        L12:
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2.mMovieclipToolsModuleRef
            r0.pushFigureBackward()
        L1e:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void pushFigureForward() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r0.getScreen()
            if (r1 != 0) goto L12
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2.mAnimateToolsModuleRef
            r0.pushFigureForward()
            goto L1e
        L12:
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2.mMovieclipToolsModuleRef
            r0.pushFigureForward()
        L1e:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void resetNodeLength() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L42
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 != 0) goto L42
            float r1 = r0.getLength()
            float r2 = r0.getLengthDefault()
            r3 = 3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L29
            java.lang.Object r1 = r4.mRememberedObject
            if (r1 != r0) goto L3c
            short r1 = r4.mRememberedObjectValueType
            if (r1 != r3) goto L3c
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            float r2 = r4.mRememberedObjectValue
            int r2 = (int) r2
            float r2 = (float) r2
            r1.setSegmentLength(r2, r0)
            goto L3c
        L29:
            r4.mRememberedObject = r0
            float r1 = r0.getLength()
            r4.mRememberedObjectValue = r1
            r4.mRememberedObjectValueType = r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            float r2 = r0.getLengthDefault()
            r1.setSegmentLength(r2, r0)
        L3c:
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L42:
            return
    }

    public void resetNodeThickness() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L43
            int r1 = r0.getLimbType()
            r2 = 6
            if (r1 == r2) goto L43
            int r1 = r0.getThickness()
            int r2 = r0.getThicknessDefault()
            if (r1 != r2) goto L28
            java.lang.Object r1 = r3.mRememberedObject
            if (r1 != r0) goto L3d
            short r1 = r3.mRememberedObjectValueType
            if (r1 != 0) goto L3d
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            float r2 = r3.mRememberedObjectValue
            int r2 = (int) r2
            r1.setSegmentThickness(r2, r0)
            goto L3d
        L28:
            r3.mRememberedObject = r0
            int r1 = r0.getThickness()
            float r1 = (float) r1
            r3.mRememberedObjectValue = r1
            r1 = 0
            r3.mRememberedObjectValueType = r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            int r2 = r0.getThicknessDefault()
            r1.setSegmentThickness(r2, r0)
        L3d:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L43:
            return
    }

    public void rotateCameraBy(float r4, boolean r5) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto L23
            boolean r1 = r0.isAutoCamera()
            if (r1 != 0) goto L23
            if (r5 == 0) goto L14
            float r5 = r0.getCameraRotationDeg()
            r3.mInitialValue1 = r5
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r3.mCanvasModuleRef
            float r1 = r3.mInitialValue1
            float r4 = r4 + r1
            r2 = 1
            r5.rotateCameraTo(r4, r0, r1, r2)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L23:
            return
    }

    public void rotateFigureBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L1b
            if (r4 == 0) goto L10
            float r4 = r0.getRotation()
            r2.mInitialValue1 = r4
        L10:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r4.rotateStickfigureTo(r1, r0)
            goto L48
        L1b:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L32
            if (r4 == 0) goto L27
            float r4 = r0.getRotation()
            r2.mInitialValue1 = r4
        L27:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r4.rotateMCTo(r1, r0)
            goto L48
        L32:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L48
            if (r4 == 0) goto L3e
            float r4 = r0.getRotation()
            r2.mInitialValue1 = r4
        L3e:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r4.rotateSpriteTo(r1, r0)
        L48:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void rotateNodeBy(float r4, boolean r5) {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L1d
            if (r5 == 0) goto Le
            float r5 = r0.getAngle()
            r3.mInitialValue1 = r5
        Le:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r3.mCanvasModuleRef
            float r1 = r3.mInitialValue1
            float r4 = r4 + r1
            r2 = 1
            r5.rotateSegmentTo(r4, r0, r1, r2)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L1d:
            return
    }

    public void rotateNodeDragLock(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0.getIsDragLocked()
            if (r1 != 0) goto L11
            r1 = 1
            r0.setIsDragLocked(r1)
        L11:
            if (r4 == 0) goto L19
            float r4 = r0.getDragLockAngle()
            r2.mInitialValue1 = r4
        L19:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r4.setSegmentDragLockAngle(r1, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void rotateTextfieldBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L1c
            if (r4 == 0) goto Le
            float r4 = r0.getRotation()
            r2.mInitialValue1 = r4
        Le:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r4.rotateTextfieldTo(r1, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L1c:
            return
    }

    public void roundNodeDragLock() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L20
            boolean r1 = r0.getIsDragLocked()
            if (r1 == 0) goto L20
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            float r2 = r0.getDragLockAngle()
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r1.setSegmentDragLockAngle(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L20:
            return
    }

    public void roundNodeLength() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L2f
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            org.fortheloss.sticknodes.stickfigure.Connector r0 = (org.fortheloss.sticknodes.stickfigure.Connector) r0
            float r2 = r0.getNodeValue()
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r1.setConnectorNodeValue(r2, r0)
            goto L29
        L1b:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            float r2 = r0.getLength()
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r1.setSegmentLength(r2, r0)
        L29:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L2f:
            return
    }

    public boolean scaleCameraBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto L45
            boolean r1 = r0.isAutoCamera()
            if (r1 != 0) goto L45
            if (r4 == 0) goto L14
            float r4 = r0.getCameraScale()
            r2.mInitialValue1 = r4
        L14:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r4 = r2.mAnimateToolsModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r3 = 1
            r4.zoomCameraTo(r1, r3)
            float r3 = r0.getCameraScale()
            r4 = 1017370378(0x3ca3d70a, float:0.02)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3f
            float r3 = r0.getCameraScale()
            r4 = 1084227584(0x40a00000, float:5.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
        L3f:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L45:
            r3 = 0
            return r3
    }

    public boolean scaleFigureBy(float r8, boolean r9) {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r7.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1
            if (r1 != 0) goto L87
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L12
            goto L87
        L12:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto Lb6
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            if (r9 == 0) goto L20
            float r9 = r0.getScaleX()
            r7.mInitialValue1 = r9
        L20:
            float r9 = r0.getWidth()
            r1 = 1092616192(0x41200000, float:10.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r6 > 0) goto L2d
            goto L3d
        L2d:
            r6 = 1120403456(0x42c80000, float:100.0)
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 < 0) goto L36
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L36:
            float r9 = r9 - r5
            r5 = 1035489772(0x3db851ec, float:0.09)
            float r9 = r9 * r5
            float r1 = r1 - r9
        L3d:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r7.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r9.getStage()
            float r9 = r9.getWidth()
            float r8 = r8 / r9
            float r8 = r8 * r3
            float r8 = r8 * r1
            boolean r9 = r0.getScaleLinked()
            r0.setScaleLinked(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r7.mCanvasModuleRef
            float r3 = r7.mInitialValue1
            float r3 = r3 + r8
            r1.setSpriteScaleX(r3, r0)
            r0.setScaleLinked(r9)
            float r8 = r0.getScaleX()
            r9 = 1176255488(0x461c3c00, float:9999.0)
            r1 = -971228160(0xffffffffc61c3c00, float:-9999.0)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L76
            float r8 = r0.getScaleX()
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L75
            goto L76
        L75:
            r4 = 0
        L76:
            if (r4 != 0) goto Lb6
            float r8 = r0.getScaleY()
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto Lb6
            float r8 = r0.getScaleY()
        L84:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            goto Lb6
        L87:
            if (r9 == 0) goto L8f
            float r9 = r0.getScale()
            r7.mInitialValue1 = r9
        L8f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r7.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r9.getStage()
            float r9 = r9.getWidth()
            float r8 = r8 / r9
            float r8 = r8 * r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r7.mCanvasModuleRef
            float r1 = r7.mInitialValue1
            float r8 = r8 + r1
            r9.scaleFigureTo(r8, r0, r1, r4)
            float r8 = r0.getScale()
            r9 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto Lb6
            float r8 = r0.getScale()
            r9 = 1101004800(0x41a00000, float:20.0)
            goto L84
        Lb6:
            r7.updateCurrentSelection()
            r7.updateCurrentModule()
            return r2
    }

    public boolean scaleNodeBy(float r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L48
            if (r4 == 0) goto Le
            float r4 = r0.getScale()
            r2.mInitialValue1 = r4
        Le:
            boolean r4 = r0.isUsingSegmentScale()
            if (r4 != 0) goto L18
            r4 = 1
            r0.useSegmentScale(r4)
        L18:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r2.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            float r4 = r4.getWidth()
            float r3 = r3 / r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r2.mCanvasModuleRef
            float r1 = r2.mInitialValue1
            float r1 = r1 + r3
            r4.scaleSegmentTo(r1, r0)
            float r3 = r0.getScale()
            r4 = 953267991(0x38d1b717, float:1.0E-4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L42
            float r3 = r0.getScale()
            r4 = 1092616192(0x41200000, float:10.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
        L42:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L48:
            r3 = 0
            return r3
    }

    public boolean scaleTextfieldBy(float r4, boolean r5) {
            r3 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r3.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L3f
            if (r5 == 0) goto Le
            float r5 = r0.getScale()
            r3.mInitialValue1 = r5
        Le:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3.mContextRef
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r5.getStage()
            float r5 = r5.getWidth()
            float r4 = r4 / r5
            r5 = 1086324736(0x40c00000, float:6.0)
            float r4 = r4 * r5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r3.mCanvasModuleRef
            float r1 = r3.mInitialValue1
            float r4 = r4 + r1
            r2 = 1
            r5.setTextfieldScale(r4, r0, r1, r2)
            float r4 = r0.getScale()
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L39
            float r4 = r0.getScale()
            r5 = 1092616192(0x41200000, float:10.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
        L39:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L3f:
            r4 = 0
            return r4
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            r1.mEnabled = r2
            if (r2 != 0) goto L9
            r2 = 0
            r1.setVisible(r2)
            goto L15
        L9:
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = r1.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r2 == r0) goto L15
            r2 = 1
            r1.setVisible(r2)
        L15:
            return
    }

    public void setNodeColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setSegmentColor(r3, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L11:
            return
    }

    public void setNodeGradientColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setSegmentGradient(r3, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L11:
            return
    }

    public void setNodeTriangleRightTriangleDirection(short r4) {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L2a
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L10
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3.mCanvasModuleRef
            r4.setShapeIsRightTriangle(r2, r0)
            goto L24
        L10:
            if (r4 != 0) goto L1c
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3.mCanvasModuleRef
            r4.setShapeIsRightTriangle(r2, r0)
            r4 = 1
            r0.setRightTriangleDirection(r4)
            goto L24
        L1c:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3.mCanvasModuleRef
            r4.setShapeIsRightTriangle(r2, r0)
            r0.setRightTriangleDirection(r1)
        L24:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L2a:
            return
    }

    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            boolean r1 = r0.isPolyfillAnchor()
            if (r1 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setPolyfillColor(r3, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L17:
            return
    }

    public void setSelection(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.mEnabled
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            r1 = 1
            r3.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r3.setTouchable(r2)
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r2 == 0) goto Lb5
            r2 = r4
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r0 = r0.getScreen()
            if (r0 != r1) goto L81
            boolean r0 = r2.isMainNode()
            if (r0 == 0) goto L4b
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3.mCreateToolsModuleRef
            boolean r0 = r0.userIsTestingSmartStretch()
            if (r0 == 0) goto L34
            r3.clearChildren()
            goto L14c
        L34:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureCreationTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L44
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureCreationTable
            r3.addActor(r0)
        L44:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureCreationTable
            r0.update(r4)
            goto L14c
        L4b:
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3.mCreateToolsModuleRef
            boolean r0 = r0.userIsTestingSmartStretch()
            if (r0 == 0) goto L6a
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTableTestSS
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L63
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTableTestSS
            r3.addActor(r0)
        L63:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTableTestSS
            r0.update(r4)
            goto L14c
        L6a:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L7a
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTable
            r3.addActor(r0)
        L7a:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeCreationTable
            r0.update(r4)
            goto L14c
        L81:
            boolean r0 = r2.isMainNode()
            if (r0 == 0) goto L9e
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureAnimationTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L97
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureAnimationTable
            r3.addActor(r0)
        L97:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mStickfigureAnimationTable
            r0.update(r4)
            goto L14c
        L9e:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeAnimationTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto Lae
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeAnimationTable
            r3.addActor(r0)
        Lae:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNodeAnimationTable
            r0.update(r4)
            goto L14c
        Lb5:
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCNode
            if (r2 == 0) goto Ld0
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mMovieclipTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto Lc9
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mMovieclipTable
            r3.addActor(r0)
        Lc9:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mMovieclipTable
            r0.update(r4)
            goto L14c
        Ld0:
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteNode
            if (r2 != 0) goto L137
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto Ld9
            goto L137
        Ld9:
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.TextfieldBox
            if (r2 == 0) goto Lf3
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mTextfieldTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto Led
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mTextfieldTable
            r3.addActor(r0)
        Led:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mTextfieldTable
            r0.update(r4)
            goto L14c
        Lf3:
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.animationscreen.FrameCamera
            if (r2 == 0) goto L10d
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mCameraTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L107
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mCameraTable
            r3.addActor(r0)
        L107:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mCameraTable
            r0.update(r4)
            goto L14c
        L10d:
            int r2 = r0.getScreen()
            if (r2 != r1) goto L117
            r3.clearChildren()
            goto L14c
        L117:
            int r0 = r0.getMode()
            if (r0 != 0) goto L133
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNothingAnimationTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L12d
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNothingAnimationTable
            r3.addActor(r0)
        L12d:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mNothingAnimationTable
            r0.update(r4)
            goto L14c
        L133:
            r3.clearChildren()
            goto L14c
        L137:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mSpriteTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto L147
            r3.clearChildren()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mSpriteTable
            r3.addActor(r0)
        L147:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r0 = r3.mSpriteTable
            r0.update(r4)
        L14c:
            return
    }

    public void setStickfigureColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L15
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r1.setStickfigureColor(r3, r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L15:
            return
    }

    public void setTextfieldAlign(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setTextfieldAlign(r3, r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void setTextfieldColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setTextfieldColor(r3, r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void setTextfieldShadowColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r2.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2.mCanvasModuleRef
            r1.setTextfieldShadowColor(r3, r0)
        Lb:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void snapCameraRotation() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r5.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto L34
            boolean r1 = r0.isAutoCamera()
            if (r1 == 0) goto Ld
            goto L34
        Ld:
            float r1 = r0.getCameraRotationDeg()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r1 = r1 / r3
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L24
            float r1 = r1 + r2
        L24:
            float r2 = r5.getNextAngleFrom(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r5.mCanvasModuleRef
            r4 = 1
            r3.rotateCameraTo(r2, r0, r1, r4)
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
        L34:
            return
    }

    public void snapFigureRotation() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r5.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            float r1 = r0.getRotation()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r1 = r1 / r3
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1e
            float r1 = r1 + r2
        L1e:
            float r3 = r5.getNextAngleFrom(r1)
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L42
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            boolean r4 = r0.isJoined()
            if (r4 == 0) goto L3c
            float r3 = r3 - r1
            float r3 = r3 % r2
            r1 = 1141309440(0x44070000, float:540.0)
            float r3 = r3 + r1
            float r3 = r3 % r2
            r1 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 - r1
            float r1 = r0.getJoinOffsetAngle()
            float r3 = r3 + r1
        L3c:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            r1.rotateStickfigureTo(r3, r0)
            goto L59
        L42:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L4e
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r1.rotateMCTo(r3, r0)
            goto L59
        L4e:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L59
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r1.rotateSpriteTo(r3, r0)
        L59:
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
            return
    }

    public void snapNodeRotation() {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.getCurrentlySelectedStickNode()
            if (r0 != 0) goto L7
            return
        L7:
            float r1 = r0.getAngle()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r1 = r1 / r3
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1e
            float r1 = r1 + r2
        L1e:
            float r2 = r5.getNextAngleFrom(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r5.mCanvasModuleRef
            r4 = 1
            r3.rotateSegmentTo(r2, r0, r1, r4)
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
            return
    }

    public void snapTextfieldRotation() {
            r4 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r4.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L7
            return
        L7:
            float r1 = r0.getRotation()
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r1 = r1 / r3
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1e
            float r1 = r1 + r2
        L1e:
            float r1 = r4.getNextAngleFrom(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r4.mCanvasModuleRef
            r2.rotateTextfieldTo(r1, r0)
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
            return
    }

    public void toggleCameraMode() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getMode()
            r1 = 2
            if (r0 == r1) goto L10
            return
        L10:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2.mFramesModuleRef
            r0.toggleCameraMode()
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2.mCanvasModuleRef
            r0.setNeedsToBeDrawn()
            return
    }

    public void toggleCameraScaleDefault() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r4.getCurrentlySelectedFrameCamera()
            if (r0 == 0) goto L3c
            boolean r1 = r0.isAutoCamera()
            if (r1 != 0) goto L3c
            float r1 = r0.getCameraScale()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L27
            java.lang.Object r1 = r4.mRememberedObject
            if (r1 != r0) goto L36
            short r0 = r4.mRememberedObjectValueType
            if (r0 != r3) goto L36
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r4.mAnimateToolsModuleRef
            float r1 = r4.mRememberedObjectValue
            r0.zoomCameraTo(r1, r3)
            goto L36
        L27:
            r4.mRememberedObject = r0
            float r0 = r0.getCameraScale()
            r4.mRememberedObjectValue = r0
            r4.mRememberedObjectValueType = r3
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r4.mAnimateToolsModuleRef
            r0.zoomCameraTo(r2, r3)
        L36:
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L3c:
            return
    }

    public void toggleFigureScaleDefault() {
            r8 = this;
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r0 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r8.getCurrentlySelectedFigure()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L89
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L13
            goto L89
        L13:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto Lb0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r8.mContextRef
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            r5 = r1
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = (org.fortheloss.sticknodes.sprite.SpriteRef) r5
            float r6 = r5.getScaleX()
            r7 = 0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L5b
            float r6 = r5.getScaleY()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L5b
            java.lang.Object r4 = r8.mRememberedObject
            if (r4 != r1) goto Lb0
            short r1 = r8.mRememberedObjectValueType
            if (r1 != r3) goto Lb0
            boolean r1 = r5.getScaleLinked()
            r5.setScaleLinked(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r8.mCanvasModuleRef
            float r4 = r8.mRememberedObjectValue
            r3.setSpriteScaleX(r4, r5)
            java.lang.Object r0 = r2.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            r2.addUserAction(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r8.mCanvasModuleRef
            float r2 = r8.mRememberedObjectValue2
            r0.setSpriteScaleY(r2, r5)
            r5.setScaleLinked(r1)
            goto Lb0
        L5b:
            r8.mRememberedObject = r5
            float r1 = r5.getScaleX()
            r8.mRememberedObjectValue = r1
            float r1 = r5.getScaleY()
            r8.mRememberedObjectValue2 = r1
            r8.mRememberedObjectValueType = r3
            boolean r1 = r5.getScaleLinked()
            r5.setScaleLinked(r7)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r8.mCanvasModuleRef
            r3.setSpriteScaleX(r4, r5)
            java.lang.Object r0 = r2.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.UserAction r0 = (org.fortheloss.sticknodes.data.useractions.UserAction) r0
            r2.addUserAction(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r8.mCanvasModuleRef
            r0.setSpriteScaleY(r4, r5)
            r5.setScaleLinked(r1)
            goto Lb0
        L89:
            float r0 = r1.getScale()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto La1
            java.lang.Object r0 = r8.mRememberedObject
            if (r0 != r1) goto Lb0
            short r0 = r8.mRememberedObjectValueType
            if (r0 != r3) goto Lb0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r8.mCanvasModuleRef
            float r2 = r8.mRememberedObjectValue
            r0.scaleFigureTo(r2, r1, r4, r3)
            goto Lb0
        La1:
            r8.mRememberedObject = r1
            float r0 = r1.getScale()
            r8.mRememberedObjectValue = r0
            r8.mRememberedObjectValueType = r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r8.mCanvasModuleRef
            r2.scaleFigureTo(r4, r1, r0, r3)
        Lb0:
            r8.updateCurrentSelection()
            r8.updateCurrentModule()
            return
    }

    public void toggleNodeCircleIsHalfArc() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1 = r2.mCreateToolsModuleRef
            boolean r0 = r0.isHalfArc()
            r0 = r0 ^ 1
            r1.setShapeIsHalfArc(r0)
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeDragLock() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getCurrentlySelectedStickNode()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0.getIsDragLocked()
            r2 = 0
            if (r1 != 0) goto L18
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            r3 = 1
            r1.setSegmentIsDragLocked(r3, r0)
            r0.setDragLockAngle(r2)
            goto L3f
        L18:
            float r1 = r0.getDragLockAngle()
            r3 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 % r3
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L24
            float r1 = r1 + r3
        L24:
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L38
            r2 = 1126825984(0x432a0000, float:170.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L31
            goto L38
        L31:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            r2 = 0
            r1.setSegmentIsDragLocked(r2, r0)
            goto L3f
        L38:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            r2 = 1119092736(0x42b40000, float:90.0)
            r1.setSegmentDragLockAngle(r2, r0)
        L3f:
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
            return
    }

    public void toggleNodeGradient() {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L3c
            short r1 = r0.getGradientMode()
            r2 = 1
            if (r1 != r2) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            r2 = 0
            r1.setGradientMode(r2, r0)
            goto L36
        L14:
            if (r1 != 0) goto L31
            int r1 = r0.getLimbType()
            r3 = 2
            if (r1 == r3) goto L2b
            int r1 = r0.getLimbType()
            r4 = 5
            if (r1 != r4) goto L25
            goto L2b
        L25:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            r1.setGradientMode(r2, r0)
            goto L36
        L2b:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            r1.setGradientMode(r3, r0)
            goto L36
        L31:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            r1.setGradientMode(r2, r0)
        L36:
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
        L3c:
            return
    }

    public void toggleNodeLock() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r0.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getLockedStickNode()
            if (r2 != r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.lockNode(r0, r2)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L1e:
            return
    }

    public void toggleNodeReverseGradient() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isReversedGradient()
            r2 = r2 ^ 1
            r1.reverseSegmentGradient(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeScale() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isUsingSegmentScale()
            r2 = r2 ^ 1
            r1.useSegmentScale(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeSegmentCurveCirculization() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.getSegmentCurveCirculization()
            r2 = r2 ^ 1
            r1.setShapeSegmentCirculization(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeStatic() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isStatic()
            r2 = r2 ^ 1
            r1.setStaticSegment(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeStretchy() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isStretchy()
            r2 = r2 ^ 1
            r1.setSegmentIsStretchy(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeThicknessZero() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L3b
            int r1 = r0.getLimbType()
            r2 = 6
            if (r1 == r2) goto L3b
            int r1 = r0.getThickness()
            if (r1 != 0) goto L24
            java.lang.Object r1 = r3.mRememberedObject
            if (r1 != r0) goto L35
            short r1 = r3.mRememberedObjectValueType
            if (r1 != 0) goto L35
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            float r2 = r3.mRememberedObjectValue
            int r2 = (int) r2
            r1.setSegmentThickness(r2, r0)
            goto L35
        L24:
            r3.mRememberedObject = r0
            int r1 = r0.getThickness()
            float r1 = (float) r1
            r3.mRememberedObjectValue = r1
            r1 = 0
            r3.mRememberedObjectValueType = r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r3.mCanvasModuleRef
            r2.setSegmentThickness(r1, r0)
        L35:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L3b:
            return
    }

    public void toggleNodeTrapezoidRoundedEnd() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.getTrapezoidIsRounded2()
            r2 = r2 ^ 1
            r1.setShapeTrapezoidIsRounded2(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeTrapezoidRoundedStart() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.getTrapezoidIsRounded1()
            r2 = r2 ^ 1
            r1.setShapeTrapezoidIsRounded1(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeTriangleIsUpsideDown() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.getTriangleUpsideDown()
            r2 = r2 ^ 1
            r1.setShapeIsUpsideDownTriangle(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeUseColor() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isUsingSegmentColor()
            r2 = r2 ^ 1
            r1.useSegmentColor(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeUseGradient() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isUsingGradient()
            r2 = r2 ^ 1
            r1.useSegmentGradient(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleNodeUsePolyfillColor() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isUsingPolyfillColor()
            r2 = r2 ^ 1
            r1.usePolyfillColor(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L17:
            return
    }

    public void toggleSpriteScaleMode() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L1b
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.isDragOriginBased()
            r2 = r2 ^ 1
            r1.setSpriteScaleMode(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L1b:
            return
    }

    public void toggleSpriteScaleRatio() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L1b
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.getScaleLinked()
            r2 = r2 ^ 1
            r1.setSpriteScaleLinked(r2, r0)
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
        L1b:
            return
    }

    public void toggleTextfieldOpacityDefault() {
            r4 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r4.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L36
            float r1 = r0.getAlpha()
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L21
            java.lang.Object r1 = r4.mRememberedObject
            if (r1 != r0) goto L30
            short r1 = r4.mRememberedObjectValueType
            if (r1 != r2) goto L30
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            float r2 = r4.mRememberedObjectValue
            r1.setTextfieldTransparencyTo(r2, r0)
            goto L30
        L21:
            r4.mRememberedObject = r0
            float r1 = r0.getAlpha()
            r4.mRememberedObjectValue = r1
            r4.mRememberedObjectValueType = r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            r1.setTextfieldTransparencyTo(r3, r0)
        L30:
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L36:
            return
    }

    public void toggleTextfieldScaleDefault() {
            r5 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r5.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L36
            float r1 = r0.getScale()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L21
            java.lang.Object r1 = r5.mRememberedObject
            if (r1 != r0) goto L30
            short r1 = r5.mRememberedObjectValueType
            if (r1 != r3) goto L30
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r5.mCanvasModuleRef
            float r4 = r5.mRememberedObjectValue
            r1.setTextfieldScale(r4, r0, r2, r3)
            goto L30
        L21:
            r5.mRememberedObject = r0
            float r1 = r0.getScale()
            r5.mRememberedObjectValue = r1
            r5.mRememberedObjectValueType = r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r5.mCanvasModuleRef
            r4.setTextfieldScale(r2, r0, r1, r3)
        L30:
            r5.updateCurrentSelection()
            r5.updateCurrentModule()
        L36:
            return
    }

    public void toggleTextfieldShadowColor() {
            r3 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r3.getCurrentlySelectedTextfieldBox()
            if (r0 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3.mCanvasModuleRef
            boolean r2 = r0.hasShadow()
            r2 = r2 ^ 1
            r1.setTextfieldHasShadow(r2, r0)
        L11:
            r3.updateCurrentSelection()
            r3.updateCurrentModule()
            return
    }

    public void toggleTrapezoidScaleRatio() {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4.getCurrentlySelectedStickNode()
            if (r0 == 0) goto L35
            float r1 = r0.getTrapezoidRatio()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L16
            goto L2a
        L16:
            float r1 = r0.getTrapezoidThickness1()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            float r3 = r0.getTrapezoidThickness2()
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = r1 / r2
        L2a:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4.mCanvasModuleRef
            r1.setShapeTrapezoidRatio(r2, r0)
            r4.updateCurrentSelection()
            r4.updateCurrentModule()
        L35:
            return
    }

    public void unjoinFigure() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2.mContextRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r0.getScreen()
            if (r1 != 0) goto L12
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2.mAnimateToolsModuleRef
            r0.unjoinFigure()
            goto L1e
        L12:
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2.mMovieclipToolsModuleRef
            r0.unjoinFigure()
        L1e:
            r2.updateCurrentSelection()
            r2.updateCurrentModule()
            return
    }

    public void updateCurrentModule() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r1 = r0.getScreen()
            if (r1 != 0) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r3.mAnimateToolsModuleRef
            r0.updateCurrentToolTables()
            goto L2d
        L14:
            int r1 = r0.getScreen()
            r2 = 2
            if (r1 != r2) goto L21
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r3.mMovieclipToolsModuleRef
            r0.updateCurrentToolTables()
            goto L2d
        L21:
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L2d
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r3.mCreateToolsModuleRef
            r0.updateCurrentToolTables()
        L2d:
            return
    }

    public void updateMagnifierPadding() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r0 = r2.qrtTables
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.qrt.QrtTable> r1 = r2.qrtTables
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtTable r1 = (org.fortheloss.sticknodes.animationscreen.qrt.QrtTable) r1
            r1.updateZoomButtonsPadding()
            int r0 = r0 + (-1)
            goto La
        L1a:
            return
    }
}
