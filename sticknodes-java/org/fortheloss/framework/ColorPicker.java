package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class ColorPicker extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    public static com.badlogic.gdx.graphics.Color recentColor1;
    public static com.badlogic.gdx.graphics.Color recentColor2;
    public static com.badlogic.gdx.graphics.Color recentColor3;
    public static com.badlogic.gdx.graphics.Color recentColor4;
    public static com.badlogic.gdx.graphics.Color recentColor5;
    public static com.badlogic.gdx.graphics.Color recentColor6;
    public static com.badlogic.gdx.graphics.Color recentColor7;
    private int _align;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _backgroundSquare;
    private com.badlogic.gdx.scenes.scene2d.Actor _bgClickCatcher;
    private float _brightness;
    private com.badlogic.gdx.scenes.scene2d.utils.ChangeListener _brightnessChangeListener;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _brightnessClickListener;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _brightnessSlider;
    private com.badlogic.gdx.scenes.scene2d.utils.Drawable _button;
    private float _buttonAlpha;
    private float _buttonFramePadding;
    private float _buttonHeight;
    private float _buttonWidth;
    private float _buttonX;
    private float _buttonY;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _buttonsTable;
    private com.badlogic.gdx.graphics.Color _color;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _colorMap;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _colorMapClickListener;
    private boolean _colorMapShown;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyColorButton;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _copyColorListener;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _cursor;
    private int _dialogScreenHeight;
    private int _dialogScreenWidth;
    private com.badlogic.gdx.scenes.scene2d.ui.Dialog _dialogToDrawRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _eyedropperButton;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _eyedropperListener;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _eyedropperRefreshListener;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _eyedropperRefresherButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _eyedropperRing;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _hexSetButton;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _hexSetListener;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _hexTextField;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _hexfieldClickListener;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _hideClickListener;
    private float _hue;
    private boolean _leftHandMode;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _oldCursor;
    private boolean _ownsScreenFbo;
    private int _popupAlign;
    private com.badlogic.gdx.scenes.scene2d.ui.Image[] _recentColors;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _recentColorsClickListener;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _recentColorsTable;
    private float _saturation;
    private com.badlogic.gdx.utils.Scaling _scaling;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _screenFBORef;
    private com.badlogic.gdx.graphics.Pixmap _screenPixmap;
    private com.badlogic.gdx.scenes.scene2d.Stage _stageRef;
    private float _stageToBackbufferRatioX;
    private float _stageToBackbufferRatioY;
    private com.badlogic.gdx.math.Vector2 _tmpVector2;












    /* renamed from: -$$Nest$fget_backgroundSquare, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m146$$Nest$fget_backgroundSquare(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._backgroundSquare
            return r0
    }

    /* renamed from: -$$Nest$fget_brightnessSlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m147$$Nest$fget_brightnessSlider(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._brightnessSlider
            return r0
    }

    /* renamed from: -$$Nest$fget_buttonsTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m148$$Nest$fget_buttonsTable(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0._buttonsTable
            return r0
    }

    /* renamed from: -$$Nest$fget_color, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Color m149$$Nest$fget_color(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.graphics.Color r0 = r0._color
            return r0
    }

    /* renamed from: -$$Nest$fget_colorMap, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m150$$Nest$fget_colorMap(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._colorMap
            return r0
    }

    /* renamed from: -$$Nest$fget_colorMapShown, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m151$$Nest$fget_colorMapShown(org.fortheloss.framework.ColorPicker r0) {
            boolean r0 = r0._colorMapShown
            return r0
    }

    /* renamed from: -$$Nest$fget_cursor, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m152$$Nest$fget_cursor(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._cursor
            return r0
    }

    /* renamed from: -$$Nest$fget_eyedropperRing, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m153$$Nest$fget_eyedropperRing(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._eyedropperRing
            return r0
    }

    /* renamed from: -$$Nest$fget_oldCursor, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Image m154$$Nest$fget_oldCursor(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r0._oldCursor
            return r0
    }

    /* renamed from: -$$Nest$fget_recentColorsTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m155$$Nest$fget_recentColorsTable(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0._recentColorsTable
            return r0
    }

    /* renamed from: -$$Nest$fget_stageRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Stage m156$$Nest$fget_stageRef(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0._stageRef
            return r0
    }

    /* renamed from: -$$Nest$fget_tmpVector2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m157$$Nest$fget_tmpVector2(org.fortheloss.framework.ColorPicker r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._tmpVector2
            return r0
    }

    /* renamed from: -$$Nest$fput_brightness, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m158$$Nest$fput_brightness(org.fortheloss.framework.ColorPicker r0, float r1) {
            r0._brightness = r1
            return
    }

    /* renamed from: -$$Nest$fput_hue, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m159$$Nest$fput_hue(org.fortheloss.framework.ColorPicker r0, float r1) {
            r0._hue = r1
            return
    }

    /* renamed from: -$$Nest$fput_saturation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m160$$Nest$fput_saturation(org.fortheloss.framework.ColorPicker r0, float r1) {
            r0._saturation = r1
            return
    }

    /* renamed from: -$$Nest$monApplyHexClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m161$$Nest$monApplyHexClick(org.fortheloss.framework.ColorPicker r0) {
            r0.onApplyHexClick()
            return
    }

    /* renamed from: -$$Nest$mupdateBrightness, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m162$$Nest$mupdateBrightness(org.fortheloss.framework.ColorPicker r0) {
            r0.updateBrightness()
            return
    }

    /* renamed from: -$$Nest$mupdateHEX, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m163$$Nest$mupdateHEX(org.fortheloss.framework.ColorPicker r0) {
            r0.updateHEX()
            return
    }

    /* renamed from: -$$Nest$mupdateRGB, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m164$$Nest$mupdateRGB(org.fortheloss.framework.ColorPicker r0) {
            r0.updateRGB()
            return
    }

    /* renamed from: -$$Nest$mupdateRecentColors, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m165$$Nest$mupdateRecentColors(org.fortheloss.framework.ColorPicker r0) {
            r0.updateRecentColors()
            return
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.RED
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor1 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.ORANGE
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor2 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.YELLOW
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor3 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GREEN
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor4 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BLUE
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor5 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2, r1, r1)
            org.fortheloss.framework.ColorPicker.recentColor6 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BLACK
            r0.<init>(r1)
            org.fortheloss.framework.ColorPicker.recentColor7 = r0
            return
    }

    public ColorPicker(com.badlogic.gdx.graphics.glutils.FrameBuffer r4, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r5, com.badlogic.gdx.graphics.g2d.TextureAtlas r6, float r7, boolean r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._hue = r0
            r3._saturation = r0
            r3._brightness = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3._buttonAlpha = r1
            r1 = 1
            r3._align = r1
            r2 = 16
            r3._popupAlign = r2
            r3._buttonX = r0
            r3._buttonY = r0
            r3._buttonWidth = r0
            r3._buttonHeight = r0
            r2 = 0
            r3._colorMapShown = r2
            r3._buttonFramePadding = r0
            r3._stageToBackbufferRatioX = r0
            r3._stageToBackbufferRatioY = r0
            r3._ownsScreenFbo = r2
            r3._leftHandMode = r1
            r3._screenFBORef = r4
            r3.init(r5, r6, r7, r8)
            return
    }

    public ColorPicker(com.badlogic.gdx.scenes.scene2d.ui.Dialog r4, int r5, int r6, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r7, com.badlogic.gdx.graphics.g2d.TextureAtlas r8, float r9, boolean r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._hue = r0
            r3._saturation = r0
            r3._brightness = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3._buttonAlpha = r1
            r1 = 1
            r3._align = r1
            r2 = 16
            r3._popupAlign = r2
            r3._buttonX = r0
            r3._buttonY = r0
            r3._buttonWidth = r0
            r3._buttonHeight = r0
            r2 = 0
            r3._colorMapShown = r2
            r3._buttonFramePadding = r0
            r3._stageToBackbufferRatioX = r0
            r3._stageToBackbufferRatioY = r0
            r3._ownsScreenFbo = r2
            r3._leftHandMode = r1
            r3._dialogToDrawRef = r4
            r3._dialogScreenWidth = r5
            r3._dialogScreenHeight = r6
            r3.init(r7, r8, r9, r10)
            return
    }

    private void disposeScreenFbo() {
            r1 = this;
            boolean r0 = r1._ownsScreenFbo
            if (r0 == 0) goto Le
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r1._screenFBORef
            if (r0 == 0) goto Lb
            r0.dispose()
        Lb:
            r0 = 0
            r1._screenFBORef = r0
        Le:
            return
    }

    private void init(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r19, com.badlogic.gdx.graphics.g2d.TextureAtlas r20, float r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r0._leftHandMode = r2
            r2 = r21
            r0._buttonFramePadding = r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r3 = "colorpicker_color_map"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r1.findRegion(r3)
            r2.<init>(r3)
            r0._colorMap = r2
            r3 = 4
            r2.setAlign(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._colorMap
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1140850688(0x44000000, float:512.0)
            float r6 = r4 * r5
            float r4 = r4 * r5
            r2.setSize(r6, r4)
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r4 = "square_for_colorpicker"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r4)
            r2.<init>(r5)
            r0._button = r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "color_map_cursor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r5)
            r2.<init>(r6)
            r0._cursor = r2
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r5)
            r0._oldCursor = r2
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._oldCursor
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = 1056964608(0x3f000000, float:0.5)
            r2.setColor(r5, r5, r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r5 = "colorpicker_eyedropper_ring"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r5)
            r0._eyedropperRing = r2
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r0._eyedropperRing
            r5 = 0
            r2.setVisible(r5)
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>()
            r0._color = r2
            com.badlogic.gdx.utils.Scaling r2 = com.badlogic.gdx.utils.Scaling.stretch
            r0._scaling = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r0._tmpVector2 = r2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = new com.badlogic.gdx.scenes.scene2d.Actor
            r2.<init>()
            r0._bgClickCatcher = r2
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r8 = "copyColor"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            r9 = r19
            r2.<init>(r8, r9)
            r0._copyColorButton = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getEyedropperButtonStyle()
            java.lang.String r9 = ""
            r2.<init>(r9, r8)
            r0._eyedropperButton = r2
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextField
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextFieldStyle()
            r2.<init>(r9, r8)
            r0._hexTextField = r2
            org.fortheloss.sticknodes.animationscreen.modules.Module$HexFilter r8 = new org.fortheloss.sticknodes.animationscreen.modules.Module$HexFilter
            r8.<init>()
            r2.setTextFieldFilter(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0._hexTextField
            r8 = 7
            r2.setMaxLength(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getApplyButtonStyle()
            r2.<init>(r9, r10)
            r0._hexSetButton = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRefreshButtonStyle()
            r2.<init>(r9, r10)
            r0._eyedropperRefresherButton = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._eyedropperButton
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r2.getImage()
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._eyedropperRefresherButton
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r2.getImage()
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._hexSetButton
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r2.getImage()
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r0._copyColorButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r2.getLabel()
            r2.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r0._buttonsTable = r2
            boolean r6 = r0._leftHandMode
            r9 = 1092616192(0x41200000, float:10.0)
            r10 = 8
            r11 = 0
            if (r6 == 0) goto L132
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r11)
            r6 = 18
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r11)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r6)
            r6 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r6)
            r2.uniform(r5, r5)
            goto L153
        L132:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r11)
            r6 = 10
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r11)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r10)
            r2.uniform(r5, r5)
        L153:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._copyColorButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r6)
            r6 = 2
            r2.colspan(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r0._hexTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r0._copyColorButton
            float r9 = r9.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r9 = (float) r9
            r2.height(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._hexSetButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._hexSetButton
            float r9 = r9.getWidth()
            float r9 = r9 * r7
            r2.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._eyedropperButton
            r2.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._eyedropperRefresherButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._eyedropperRefresherButton
            float r9 = r9.getWidth()
            float r9 = r9 * r7
            r2.width(r9)
            org.fortheloss.framework.ColorPicker$1 r2 = new org.fortheloss.framework.ColorPicker$1
            r2.<init>(r0)
            r0.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r13 = 0
            r14 = 1132462080(0x43800000, float:256.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r17 = org.fortheloss.sticknodes.animationscreen.modules.Module.getColorPickerSliderStyle()
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            r0._brightnessSlider = r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r0._colorMap
            float r7 = r7.getHeight()
            r2.setHeight(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r0._brightnessSlider
            r2.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r0._recentColorsTable = r2
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1096810496(0x41600000, float:14.0)
            float r7 = r7 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r2.pad(r7)
            r2.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r11)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r9
            r2.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWhiteBackground()
            r2.setBackground(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWhiteBackground()
            r2.<init>(r7)
            r0._backgroundSquare = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "copiedColors"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = ":"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r7, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            r2.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._recentColorsTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image[r8]
            r0._recentColors = r2
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r4 = r0._recentColors
            r4[r5] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1119879168(0x42c00000, float:96.0)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r2.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r4 = r0._recentColors
            r7 = 1
            r4[r7] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r2.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r4 = r0._recentColors
            r4[r6] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r2.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r4 = r0._recentColors
            r6 = 3
            r4[r6] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r2.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r4 = r0._recentColors
            r4[r3] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            r2.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r3 = r0._recentColors
            r4 = 5
            r3[r4] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r5
            r2.height(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r1 = r0._recentColors
            r3 = 6
            r1[r3] = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r5
            r1.height(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._recentColorsTable
            r1.pack()
            r18.updateRecentColors()
            return
    }

    private void onApplyHexClick() {
            r10 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 1132396544(0x437f0000, float:255.0)
            java.lang.String r5 = "%02X%02X%02X"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3f
            com.badlogic.gdx.graphics.Color r7 = r10._color     // Catch: java.lang.Exception -> L3f
            float r7 = r7.r     // Catch: java.lang.Exception -> L3f
            float r7 = r7 * r4
            int r7 = java.lang.Math.round(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3f
            r6[r3] = r7     // Catch: java.lang.Exception -> L3f
            com.badlogic.gdx.graphics.Color r7 = r10._color     // Catch: java.lang.Exception -> L3f
            float r7 = r7.g     // Catch: java.lang.Exception -> L3f
            float r7 = r7 * r4
            int r7 = java.lang.Math.round(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3f
            r6[r2] = r7     // Catch: java.lang.Exception -> L3f
            com.badlogic.gdx.graphics.Color r7 = r10._color     // Catch: java.lang.Exception -> L3f
            float r7 = r7.b     // Catch: java.lang.Exception -> L3f
            float r7 = r7 * r4
            int r7 = java.lang.Math.round(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3f
            r6[r1] = r7     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Exception -> L3f
            goto L41
        L3f:
            java.lang.String r5 = "FFFFFF"
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r10._hexTextField
            java.lang.String r6 = r6.getText()
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            java.lang.String r8 = "#"
            if (r6 == 0) goto L66
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._hexTextField
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
        L66:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r10._hexTextField
            java.lang.String r6 = r6.getText()
            java.lang.String r9 = "[^A-Fa-f0-9]"
            java.lang.String r6 = r6.replaceAll(r9, r7)
            int r7 = r6.length()
            r9 = 6
            if (r7 <= r9) goto L7d
            java.lang.String r6 = r6.substring(r3, r9)
        L7d:
            int r7 = r6.length()
            if (r7 != 0) goto L98
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._hexTextField
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
        L98:
            if (r7 != r2) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r6)
            r0.append(r6)
            r0.append(r6)
            r0.append(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L130
        Lb7:
            if (r7 != r1) goto Ldd
            char r0 = r6.charAt(r3)
            char r1 = r6.charAt(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r0)
            r2.append(r0)
            r2.append(r1)
            r2.append(r1)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            goto L130
        Ldd:
            if (r7 != r0) goto L107
            char r0 = r6.charAt(r3)
            char r2 = r6.charAt(r2)
            char r1 = r6.charAt(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r0)
            r3.append(r2)
            r3.append(r2)
            r3.append(r1)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
            goto L130
        L107:
            r0 = 4
            if (r7 != r0) goto L11c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "FF"
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            goto L130
        L11c:
            r0 = 5
            if (r7 != r0) goto L130
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "F"
            r0.append(r1)
            java.lang.String r6 = r0.toString()
        L130:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._hexTextField
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L179
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L179
            java.lang.String r1 = "0x"
            r0.append(r1)     // Catch: java.lang.NumberFormatException -> L179
            r0.append(r6)     // Catch: java.lang.NumberFormatException -> L179
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L179
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch: java.lang.NumberFormatException -> L179
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L179
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r0
            int r1 = r1 >> 16
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r0
            int r2 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r4
            float r2 = (float) r2
            float r2 = r2 / r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.setColor(r1, r2, r0, r3)
            r10.updateRGB()
            return
        L179:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r10._hexTextField
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }

    private void updateBrightness() {
            r10 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r10._brightnessSlider
            float r1 = r10._brightness
            float r2 = r0.getMaxValue()
            float r1 = r1 * r2
            r0.setValue(r1)
            float r0 = r10._saturation
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1132429312(0x437f8000, float:255.5)
            r4 = 1132396544(0x437f0000, float:255.0)
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L21
            int r1 = (int) r3
            r0 = r1
            r3 = r0
            goto L97
        L21:
            float r0 = r10._hue
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            float r0 = r0 - r5
            r5 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r5
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            float r5 = r0 - r5
            float r6 = r10._saturation
            float r7 = r2 - r6
            float r7 = r7 * r2
            float r8 = r6 * r5
            float r8 = r2 - r8
            float r8 = r8 * r2
            float r5 = r2 - r5
            float r6 = r6 * r5
            float r5 = r2 - r6
            float r5 = r5 * r2
            int r0 = (int) r0
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L8e
            r9 = 1
            if (r0 == r9) goto L88
            r9 = 2
            if (r0 == r9) goto L7e
            r9 = 3
            if (r0 == r9) goto L74
            r9 = 4
            if (r0 == r9) goto L6b
            r5 = 5
            if (r0 == r5) goto L61
            r0 = 0
            r3 = 0
            goto L97
        L61:
            int r1 = (int) r3
            float r7 = r7 * r4
            float r7 = r7 + r6
            int r0 = (int) r7
            float r8 = r8 * r4
            float r8 = r8 + r6
            int r3 = (int) r8
            goto L97
        L6b:
            float r5 = r5 * r4
            float r5 = r5 + r6
            int r1 = (int) r5
            float r7 = r7 * r4
            float r7 = r7 + r6
            int r0 = (int) r7
            goto L7c
        L74:
            float r7 = r7 * r4
            float r7 = r7 + r6
            int r1 = (int) r7
            float r8 = r8 * r4
            float r8 = r8 + r6
            int r0 = (int) r8
        L7c:
            int r3 = (int) r3
            goto L97
        L7e:
            float r7 = r7 * r4
            float r7 = r7 + r6
            int r1 = (int) r7
            int r0 = (int) r3
            float r5 = r5 * r4
            float r5 = r5 + r6
            int r3 = (int) r5
            goto L97
        L88:
            float r8 = r8 * r4
            float r8 = r8 + r6
            int r1 = (int) r8
            int r0 = (int) r3
            goto L93
        L8e:
            int r1 = (int) r3
            float r5 = r5 * r4
            float r5 = r5 + r6
            int r0 = (int) r5
        L93:
            float r7 = r7 * r4
            float r7 = r7 + r6
            int r3 = (int) r7
        L97:
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r10._brightnessSlider
            float r1 = (float) r1
            float r1 = r1 / r4
            float r0 = (float) r0
            float r0 = r0 / r4
            float r3 = (float) r3
            float r3 = r3 / r4
            r5.setColor(r1, r0, r3, r2)
            return
    }

    private void updateHEX() {
            r1 = this;
            r0 = 0
            r1.updateHEX(r0)
            return
    }

    private void updateHEX(com.badlogic.gdx.graphics.Color r6) {
            r5 = this;
            if (r6 != 0) goto L4
            com.badlogic.gdx.graphics.Color r6 = r5._color
        L4:
            java.lang.String r0 = "%02X%02X%02X"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3d
            r2 = 0
            float r3 = r6.r     // Catch: java.lang.Exception -> L3d
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3d
            r1[r2] = r3     // Catch: java.lang.Exception -> L3d
            r2 = 1
            float r3 = r6.g     // Catch: java.lang.Exception -> L3d
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3d
            r1[r2] = r3     // Catch: java.lang.Exception -> L3d
            r2 = 2
            float r6 = r6.b     // Catch: java.lang.Exception -> L3d
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)     // Catch: java.lang.Exception -> L3d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L3d
            r1[r2] = r6     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = java.lang.String.format(r0, r1)     // Catch: java.lang.Exception -> L3d
            goto L3f
        L3d:
            java.lang.String r6 = "FFFFFF"
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r5._hexTextField
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.setText(r6)
            return
    }

    private void updateHSB() {
            r10 = this;
            com.badlogic.gdx.graphics.Color r0 = r10._color
            float r0 = r0.r
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            com.badlogic.gdx.graphics.Color r2 = r10._color
            float r2 = r2.g
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            com.badlogic.gdx.graphics.Color r3 = r10._color
            float r3 = r3.b
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            if (r0 <= r2) goto L24
            r4 = r0
            goto L25
        L24:
            r4 = r2
        L25:
            if (r3 <= r4) goto L28
            r4 = r3
        L28:
            if (r0 >= r2) goto L2c
            r5 = r0
            goto L2d
        L2c:
            r5 = r2
        L2d:
            if (r3 >= r5) goto L30
            r5 = r3
        L30:
            float r6 = (float) r4
            float r1 = r6 / r1
            r7 = 0
            if (r4 == 0) goto L3b
            int r8 = r4 - r5
            float r8 = (float) r8
            float r8 = r8 / r6
            goto L3c
        L3b:
            r8 = 0
        L3c:
            int r6 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r6 != 0) goto L41
            goto L6e
        L41:
            int r6 = r4 - r0
            float r6 = (float) r6
            int r5 = r4 - r5
            float r5 = (float) r5
            float r6 = r6 / r5
            int r9 = r4 - r2
            float r9 = (float) r9
            float r9 = r9 / r5
            int r3 = r4 - r3
            float r3 = (float) r3
            float r3 = r3 / r5
            if (r0 != r4) goto L54
            float r3 = r3 - r9
            goto L61
        L54:
            if (r2 != r4) goto L5c
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 + r0
            float r3 = r6 - r3
            goto L61
        L5c:
            r0 = 1082130432(0x40800000, float:4.0)
            float r9 = r9 + r0
            float r3 = r9 - r6
        L61:
            r0 = 1086324736(0x40c00000, float:6.0)
            float r3 = r3 / r0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r3 + r0
            goto L6e
        L6d:
            r7 = r3
        L6e:
            r10._hue = r7
            r10._saturation = r8
            r10._brightness = r1
            return
    }

    private void updateRGB() {
            r10 = this;
            float r0 = r10._saturation
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1132396544(0x437f0000, float:255.0)
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L18
            float r0 = r10._brightness
            float r0 = r0 * r4
            float r0 = r0 + r3
            int r1 = (int) r0
            r0 = r1
            r3 = r0
            goto L9d
        L18:
            float r0 = r10._hue
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            float r0 = r0 - r5
            r5 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r5
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            float r5 = r0 - r5
            float r6 = r10._brightness
            float r7 = r10._saturation
            float r8 = r2 - r7
            float r8 = r8 * r6
            float r9 = r7 * r5
            float r9 = r2 - r9
            float r9 = r9 * r6
            float r5 = r2 - r5
            float r7 = r7 * r5
            float r5 = r2 - r7
            float r5 = r5 * r6
            int r0 = (int) r0
            if (r0 == 0) goto L91
            r7 = 1
            if (r0 == r7) goto L88
            r7 = 2
            if (r0 == r7) goto L7b
            r7 = 3
            if (r0 == r7) goto L6e
            r7 = 4
            if (r0 == r7) goto L65
            r5 = 5
            if (r0 == r5) goto L58
            r0 = 0
            r3 = 0
            goto L9d
        L58:
            float r6 = r6 * r4
            float r6 = r6 + r3
            int r1 = (int) r6
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r0 = (int) r8
            float r9 = r9 * r4
            float r9 = r9 + r3
            int r3 = (int) r9
            goto L9d
        L65:
            float r5 = r5 * r4
            float r5 = r5 + r3
            int r1 = (int) r5
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r0 = (int) r8
            goto L76
        L6e:
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r1 = (int) r8
            float r9 = r9 * r4
            float r9 = r9 + r3
            int r0 = (int) r9
        L76:
            float r6 = r6 * r4
            float r6 = r6 + r3
            int r3 = (int) r6
            goto L9d
        L7b:
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r1 = (int) r8
            float r6 = r6 * r4
            float r6 = r6 + r3
            int r0 = (int) r6
            float r5 = r5 * r4
            float r5 = r5 + r3
            int r3 = (int) r5
            goto L9d
        L88:
            float r9 = r9 * r4
            float r9 = r9 + r3
            int r1 = (int) r9
            float r6 = r6 * r4
            float r6 = r6 + r3
            int r0 = (int) r6
            goto L99
        L91:
            float r6 = r6 * r4
            float r6 = r6 + r3
            int r1 = (int) r6
            float r5 = r5 * r4
            float r5 = r5 + r3
            int r0 = (int) r5
        L99:
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r3 = (int) r8
        L9d:
            com.badlogic.gdx.graphics.Color r5 = r10._color
            float r1 = (float) r1
            float r1 = r1 / r4
            float r0 = (float) r0
            float r0 = r0 / r4
            float r3 = (float) r3
            float r3 = r3 / r4
            r5.set(r1, r0, r3, r2)
            return
    }

    private void updateRecentColors() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 0
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor1
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 1
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor2
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 2
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor3
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 3
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor4
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 4
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor5
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 5
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor6
            r0.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r0 = r2._recentColors
            r1 = 6
            r0 = r0[r1]
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.framework.ColorPicker.recentColor7
            r0.setColor(r1)
            return
    }

    public void alignPopup(int r1) {
            r0 = this;
            r0._popupAlign = r1
            return
    }

    public void disableWithAlpha(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            r1 = 1056964608(0x3f000000, float:0.5)
            r0._buttonAlpha = r1
            goto Lb
        L7:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._buttonAlpha = r1
        Lb:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r3.hideColorMap()
            r0 = 0
            r3._color = r0
            r3._colorMap = r0
            r3._brightnessSlider = r0
            r3._cursor = r0
            r3._oldCursor = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r3._copyColorButton
            if (r1 == 0) goto L17
            r1.clear()
            r3._copyColorButton = r0
        L17:
            r3._hexTextField = r0
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r3._hexSetButton
            if (r1 == 0) goto L22
            r1.clear()
            r3._hexSetButton = r0
        L22:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r3._eyedropperButton
            if (r1 == 0) goto L2b
            r1.clear()
            r3._eyedropperButton = r0
        L2b:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r3._eyedropperRefresherButton
            if (r1 == 0) goto L34
            r1.clear()
            r3._eyedropperRefresherButton = r0
        L34:
            r3._button = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r1 = r3._recentColors
            if (r1 == 0) goto L4b
            int r1 = r1.length
            int r1 = r1 + (-1)
        L3d:
            if (r1 < 0) goto L49
            com.badlogic.gdx.scenes.scene2d.ui.Image[] r2 = r3._recentColors
            r2 = r2[r1]
            r2.clear()
            int r1 = r1 + (-1)
            goto L3d
        L49:
            r3._recentColors = r0
        L4b:
            r3._recentColorsTable = r0
            r3._backgroundSquare = r0
            r3._scaling = r0
            r3._tmpVector2 = r0
            r3._recentColorsClickListener = r0
            r3._colorMapClickListener = r0
            r3._hideClickListener = r0
            r3._hexfieldClickListener = r0
            r3._brightnessChangeListener = r0
            r3._brightnessClickListener = r0
            r3._copyColorListener = r0
            r3._hexSetListener = r0
            r3._eyedropperListener = r0
            r3._eyedropperRefreshListener = r0
            r3._buttonsTable = r0
            r3._stageRef = r0
            com.badlogic.gdx.graphics.Pixmap r1 = r3._screenPixmap
            if (r1 == 0) goto L74
            r1.dispose()
            r3._screenPixmap = r0
        L74:
            r3.disposeScreenFbo()
            r3._dialogToDrawRef = r0
            r3.clear()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r11, float r12) {
            r10 = this;
            r10.validate()
            float r0 = r10.getX()
            float r1 = r10._buttonX
            float r6 = r0 + r1
            float r0 = r10.getY()
            float r1 = r10._buttonY
            float r7 = r0 + r1
            float r0 = r10._buttonWidth
            float r1 = r10.getScaleX()
            float r8 = r0 * r1
            float r0 = r10._buttonHeight
            float r1 = r10.getScaleY()
            float r9 = r0 * r1
            float r0 = r10._buttonAlpha
            float r0 = r0 * r12
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.setColor(r1, r1, r1, r0)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r10._button
            r1 = r11
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.draw(r1, r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r0 = r10._color
            float r1 = r0.r
            float r2 = r0.g
            float r0 = r0.b
            float r3 = r10._buttonAlpha
            float r3 = r3 * r12
            r11.setColor(r1, r2, r0, r3)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r10._button
            float r1 = r10._buttonFramePadding
            float r2 = r6 + r1
            float r3 = r7 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r1 * r4
            float r5 = r8 - r5
            float r1 = r1 * r4
            float r6 = r9 - r1
            r1 = r11
            r4 = r5
            r5 = r6
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Image getEyedropperRing() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1._eyedropperRing
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1._button
            float r0 = r0.getMinHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1._button
            float r0 = r0.getMinWidth()
            return r0
    }

    public float getTotalWidth() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r3._colorMap
            r0.validate()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r3._brightnessSlider
            r0.validate()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._copyColorButton
            r0.validate()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r3._colorMap
            float r0 = r0.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r1 = r3._brightnessSlider
            float r1 = r1.getWidth()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r3._copyColorButton
            float r1 = r1.getWidth()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r3._copyColorButton
            float r1 = r1.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    public void hideColorMap() {
            r2 = this;
            boolean r0 = r2._colorMapShown
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2._colorMapShown = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2._hexTextField
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._hexfieldClickListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2._stageRef
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._colorMapClickListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2._bgClickCatcher
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._hideClickListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._recentColorsClickListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r2._brightnessSlider
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener r1 = r2._brightnessChangeListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r2._brightnessSlider
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._brightnessClickListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2._copyColorButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._copyColorListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._hexSetButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._hexSetListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._eyedropperButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._eyedropperListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r2._eyedropperRefresherButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r1 = r2._eyedropperRefreshListener
            r0.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2._bgClickCatcher
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._backgroundSquare
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2._recentColorsTable
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._colorMap
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r2._brightnessSlider
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2._buttonsTable
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._oldCursor
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._cursor
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2._eyedropperRing
            r0.remove()
            com.badlogic.gdx.graphics.Pixmap r0 = r2._screenPixmap
            if (r0 == 0) goto L85
            r0.dispose()
            r0 = 0
            r2._screenPixmap = r0
        L85:
            r2.disposeScreenFbo()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r8 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8._button
            float r0 = r0.getMinWidth()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r8._button
            float r1 = r1.getMinHeight()
            float r2 = r8.getWidth()
            float r3 = r8.getHeight()
            com.badlogic.gdx.utils.Scaling r4 = r8._scaling
            com.badlogic.gdx.math.Vector2 r0 = r4.apply(r0, r1, r2, r3)
            float r1 = r0.x
            r8._buttonWidth = r1
            float r0 = r0.y
            r8._buttonHeight = r0
            int r4 = r8._align
            r5 = r4 & 8
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto L2e
            r8._buttonX = r6
            goto L41
        L2e:
            r5 = r4 & 16
            if (r5 == 0) goto L38
            float r2 = r2 - r1
            int r1 = (int) r2
            float r1 = (float) r1
            r8._buttonX = r1
            goto L41
        L38:
            float r2 = r2 * r7
            float r1 = r1 * r7
            float r2 = r2 - r1
            int r1 = (int) r2
            float r1 = (float) r1
            r8._buttonX = r1
        L41:
            r1 = r4 & 2
            if (r1 == 0) goto L4b
            float r3 = r3 - r0
            int r0 = (int) r3
            float r0 = (float) r0
            r8._buttonY = r0
            goto L5b
        L4b:
            r1 = r4 & 4
            if (r1 == 0) goto L52
            r8._buttonY = r6
            goto L5b
        L52:
            float r3 = r3 * r7
            float r0 = r0 * r7
            float r3 = r3 - r0
            int r0 = (int) r3
            float r0 = (float) r0
            r8._buttonY = r0
        L5b:
            return
    }

    public void onCopyColorClick() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void refreshScreenPixmap(com.badlogic.gdx.scenes.scene2d.Stage r13) {
            r12 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r12._screenFBORef
            r1 = 3333(0xd05, float:4.67E-42)
            r2 = 1
            if (r0 == 0) goto L6d
            com.badlogic.gdx.utils.viewport.Viewport r0 = r13.getViewport()
            int r4 = r0.getScreenX()
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            com.badlogic.gdx.utils.viewport.Viewport r3 = r13.getViewport()
            int r3 = r3.getScreenWidth()
            int r0 = r0 - r3
            int r0 = r0 - r4
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r12._screenFBORef
            int r3 = r3.getWidth()
            int r0 = r0 + r4
            int r6 = r3 - r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r12._screenFBORef
            int r7 = r0.getHeight()
            r0 = 0
            r12._ownsScreenFbo = r0
            com.badlogic.gdx.graphics.Pixmap r0 = r12._screenPixmap
            if (r0 != 0) goto L3e
            com.badlogic.gdx.graphics.Pixmap r0 = new com.badlogic.gdx.graphics.Pixmap
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r0.<init>(r6, r7, r3)
            r12._screenPixmap = r0
        L3e:
            float r0 = r13.getWidth()
            float r3 = (float) r6
            float r0 = r0 / r3
            r12._stageToBackbufferRatioX = r0
            float r13 = r13.getHeight()
            float r0 = (float) r7
            float r13 = r13 / r0
            r12._stageToBackbufferRatioY = r13
            com.badlogic.gdx.graphics.GL20 r13 = com.badlogic.gdx.Gdx.gl
            r13.glPixelStorei(r1, r2)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r13 = r12._screenFBORef
            r13.bind()
            com.badlogic.gdx.graphics.Pixmap r13 = r12._screenPixmap
            java.nio.ByteBuffer r10 = r13.getPixels()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 0
            r8 = 6408(0x1908, float:8.98E-42)
            r9 = 5121(0x1401, float:7.176E-42)
            r3.glReadPixels(r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            goto Lf0
        L6d:
            com.badlogic.gdx.utils.viewport.Viewport r0 = r13.getViewport()
            int r4 = r0.getScreenX()
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            com.badlogic.gdx.utils.viewport.Viewport r3 = r13.getViewport()
            int r3 = r3.getScreenWidth()
            int r0 = r0 - r3
            int r0 = r0 - r4
            com.badlogic.gdx.graphics.g2d.Batch r3 = r13.getBatch()
            com.badlogic.gdx.graphics.Pixmap$Format r11 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            int r6 = r12._dialogScreenWidth
            int r7 = r12._dialogScreenHeight
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r5, r6, r7, r8, r9, r10)
            r12._screenFBORef = r5
            r12._ownsScreenFbo = r2
            r5.bind()
            r3.begin()
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r6 = r12._dialogToDrawRef
            r6.draw(r3, r5)
            r3.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r12._screenFBORef
            int r3 = r3.getWidth()
            int r0 = r0 + r4
            int r6 = r3 - r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r12._screenFBORef
            int r7 = r0.getHeight()
            com.badlogic.gdx.graphics.Pixmap r0 = r12._screenPixmap
            if (r0 != 0) goto Lc8
            com.badlogic.gdx.graphics.Pixmap r0 = new com.badlogic.gdx.graphics.Pixmap
            r0.<init>(r6, r7, r11)
            r12._screenPixmap = r0
        Lc8:
            float r0 = r13.getWidth()
            float r3 = (float) r6
            float r0 = r0 / r3
            r12._stageToBackbufferRatioX = r0
            float r13 = r13.getHeight()
            float r0 = (float) r7
            float r13 = r13 / r0
            r12._stageToBackbufferRatioY = r13
            com.badlogic.gdx.graphics.GL20 r13 = com.badlogic.gdx.Gdx.gl
            r13.glPixelStorei(r1, r2)
            com.badlogic.gdx.graphics.Pixmap r13 = r12._screenPixmap
            java.nio.ByteBuffer r10 = r13.getPixels()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r5 = 0
            r8 = 6408(0x1908, float:8.98E-42)
            r9 = 5121(0x1401, float:7.176E-42)
            r3.glReadPixels(r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
        Lf0:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r5 = r1._color
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.set(r2, r3, r4, r0)
            r1.updateHSB()
            r1.updateBrightness()
            float r2 = r1._hue
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r1._colorMap
            float r3 = r3.getWidth()
            float r3 = r3 - r0
            float r2 = r2 * r3
            float r3 = r1._saturation
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r1._colorMap
            float r4 = r4.getHeight()
            float r4 = r4 - r0
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r1._cursor
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r1._colorMap
            float r5 = r5.getX()
            float r5 = r5 + r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r1._cursor
            float r2 = r2.getWidth()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r0
            float r5 = r5 - r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r1._colorMap
            float r2 = r2.getY()
            float r2 = r2 + r3
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r1._cursor
            float r3 = r3.getHeight()
            float r3 = r3 * r0
            float r2 = r2 - r3
            r4.setPosition(r5, r2)
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r2 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r2 = com.badlogic.gdx.utils.Pools.obtain(r2)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r2 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r2
            r1.fire(r2)
            com.badlogic.gdx.utils.Pools.free(r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            r0 = 1
            r1.setColor(r2, r0)
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r5, boolean r6) {
            r4 = this;
            com.badlogic.gdx.graphics.Color r0 = r4._color
            float r1 = r5.r
            float r2 = r5.g
            float r5 = r5.b
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.set(r1, r2, r5, r3)
            r4.updateHSB()
            r4.updateBrightness()
            float r5 = r4._hue
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r4._colorMap
            float r0 = r0.getWidth()
            float r0 = r0 - r3
            float r5 = r5 * r0
            float r0 = r4._saturation
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r4._colorMap
            float r1 = r1.getHeight()
            float r1 = r1 - r3
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r4._cursor
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r4._colorMap
            float r2 = r2.getX()
            float r2 = r2 + r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4._cursor
            float r5 = r5.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r3
            float r2 = r2 - r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r4._colorMap
            float r5 = r5.getY()
            float r5 = r5 + r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r4._cursor
            float r0 = r0.getHeight()
            float r0 = r0 * r3
            float r5 = r5 - r0
            r1.setPosition(r2, r5)
            if (r6 == 0) goto L60
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r5 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r5 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r5
            r4.fire(r5)
            com.badlogic.gdx.utils.Pools.free(r5)
        L60:
            return
    }

    public void showColorMap() {
            r5 = this;
            boolean r0 = r5._colorMapShown
            if (r0 == 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r5._stageRef
            if (r0 != 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r5.getStage()
            r5._stageRef = r0
        Lf:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r5._stageRef
            if (r0 != 0) goto L17
            r0 = 0
            r5._colorMapShown = r0
            return
        L17:
            boolean r0 = r5._leftHandMode
            if (r0 == 0) goto L2f
            float r0 = r5.getX()
            float r1 = r5._buttonX
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r5._colorMap
            float r1 = r1.getWidth()
            r2 = 1062836634(0x3f59999a, float:0.85)
            float r1 = r1 * r2
        L2d:
            float r0 = r0 - r1
            goto L53
        L2f:
            int r0 = r5._popupAlign
            r0 = r0 & 16
            r1 = 1048576000(0x3e800000, float:0.25)
            if (r0 == 0) goto L44
            float r0 = r5.getX()
            float r2 = r5._buttonX
            float r0 = r0 + r2
            float r2 = r5._buttonWidth
            float r2 = r2 * r1
            float r0 = r0 + r2
            goto L53
        L44:
            float r0 = r5.getX()
            float r2 = r5._buttonX
            float r0 = r0 + r2
            float r2 = r5._buttonWidth
            float r2 = r2 * r1
            float r0 = r0 + r2
            r1 = 1133903872(0x43960000, float:300.0)
            goto L2d
        L53:
            com.badlogic.gdx.math.Vector2 r1 = r5._tmpVector2
            float r2 = r5.getY()
            float r3 = r5._buttonY
            float r2 = r2 + r3
            float r3 = r5._buttonHeight
            float r2 = r2 + r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r3
            r1.set(r0, r2)
            com.badlogic.gdx.scenes.scene2d.Group r1 = r5.getParent()
            com.badlogic.gdx.math.Vector2 r2 = r5._tmpVector2
            r1.localToStageCoordinates(r2)
            com.badlogic.gdx.math.Vector2 r1 = r5._tmpVector2
            float r1 = r1.y
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r5._stageRef
            float r2 = r2.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r5._colorMap
            float r4 = r4.getHeight()
            float r2 = r2 - r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r5._recentColorsTable
            float r4 = r4.getHeight()
            float r2 = r2 - r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto La7
            com.badlogic.gdx.math.Vector2 r1 = r5._tmpVector2
            float r2 = r5.getY()
            float r4 = r5._buttonY
            float r2 = r2 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r5._colorMap
            float r4 = r4.getHeight()
            float r2 = r2 - r4
            float r2 = r2 - r3
            r1.set(r0, r2)
            com.badlogic.gdx.scenes.scene2d.Group r0 = r5.getParent()
            com.badlogic.gdx.math.Vector2 r1 = r5._tmpVector2
            r0.localToStageCoordinates(r1)
        La7:
            com.badlogic.gdx.math.Vector2 r0 = r5._tmpVector2
            float r1 = r0.x
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1114636288(0x42700000, float:60.0)
            float r4 = r2 * r3
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lb9
            float r2 = r2 * r3
            r0.x = r2
        Lb9:
            float r1 = r0.x
            float r0 = r0.y
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r5._stageRef
            r5.showColorMap(r1, r0, r2)
            return
    }

    public void showColorMap(float r7, float r8, com.badlogic.gdx.scenes.scene2d.Stage r9) {
            r6 = this;
            boolean r0 = r6._colorMapShown
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r6._colorMapShown = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stageRef
            if (r0 != 0) goto Le
            r6._stageRef = r9
        Le:
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            r0 = 0
            if (r9 != 0) goto L16
            r6._colorMapShown = r0
            return
        L16:
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._colorMap
            r9.setPosition(r7, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r9 = r6._brightnessSlider
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r6._colorMap
            float r1 = r1.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r6._colorMap
            float r2 = r2.getWidth()
            float r1 = r1 + r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6._colorMap
            float r3 = r3.getY()
            r9.setPosition(r1, r3)
            boolean r9 = r6._leftHandMode
            r1 = 1092616192(0x41200000, float:10.0)
            if (r9 == 0) goto L6f
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6._colorMap
            float r3 = r3.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r6._colorMap
            float r4 = r4.getWidth()
            float r3 = r3 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Slider r4 = r6._brightnessSlider
            float r4 = r4.getWidth()
            float r3 = r3 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r6._recentColorsTable
            float r4 = r4.getWidth()
            float r3 = r3 - r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r1
            float r3 = r3 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r6._colorMap
            float r4 = r4.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r6._colorMap
            float r5 = r5.getHeight()
            float r4 = r4 + r5
            r9.setPosition(r3, r4)
            goto L87
        L6f:
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6._colorMap
            float r3 = r3.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r6._colorMap
            float r4 = r4.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = r6._colorMap
            float r5 = r5.getHeight()
            float r4 = r4 + r5
            r9.setPosition(r3, r4)
        L87:
            boolean r9 = r6._leftHandMode
            if (r9 == 0) goto Lae
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6._colorMap
            float r3 = r3.getX()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r1
            float r3 = r3 - r4
            com.badlogic.gdx.scenes.scene2d.ui.Slider r4 = r6._brightnessSlider
            float r4 = r4.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r6._brightnessSlider
            float r5 = r5.getHeight()
            float r4 = r4 + r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r4 = r4 - r5
            r9.setPosition(r3, r4)
            goto Ld7
        Lae:
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6._buttonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r3 = r6._brightnessSlider
            float r3 = r3.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r4 = r6._brightnessSlider
            float r4 = r4.getWidth()
            float r3 = r3 + r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r1
            float r3 = r3 + r4
            com.badlogic.gdx.scenes.scene2d.ui.Slider r4 = r6._brightnessSlider
            float r4 = r4.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = r6._brightnessSlider
            float r5 = r5.getHeight()
            float r4 = r4 + r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r4 = r4 - r5
            r9.setPosition(r3, r4)
        Ld7:
            r6.updateHEX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._eyedropperRing
            r9.setVisible(r0)
            float r9 = r6._hue
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._colorMap
            float r0 = r0.getWidth()
            float r9 = r9 * r0
            float r0 = r6._saturation
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r6._colorMap
            float r1 = r1.getHeight()
            float r0 = r0 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r6._cursor
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r6._colorMap
            float r3 = r3.getX()
            float r3 = r3 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._cursor
            float r9 = r9.getWidth()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r4
            float r3 = r3 - r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._colorMap
            float r9 = r9.getY()
            float r9 = r9 + r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._cursor
            float r0 = r0.getHeight()
            float r0 = r0 * r4
            float r9 = r9 - r0
            r1.setPosition(r3, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._oldCursor
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._cursor
            float r0 = r0.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r6._cursor
            float r1 = r1.getY()
            r9.setPosition(r0, r1)
            r6.updateRecentColors()
            com.badlogic.gdx.scenes.scene2d.Actor r9 = r6._bgClickCatcher
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r6._stageRef
            float r0 = r0.getWidth()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r6._stageRef
            float r1 = r1.getHeight()
            r9.setSize(r0, r1)
            com.badlogic.gdx.scenes.scene2d.Actor r9 = r6._bgClickCatcher
            r0 = 0
            r9.setPosition(r0, r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r6._bgClickCatcher
            r9.addActor(r0)
            int r9 = r6._popupAlign
            r9 = r9 & 8
            if (r9 == 0) goto L159
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._backgroundSquare
            r9.addActor(r0)
        L159:
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6._recentColorsTable
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._colorMap
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r6._brightnessSlider
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r6._buttonsTable
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._oldCursor
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._cursor
            r9.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._eyedropperRing
            r9.addActor(r0)
            r9 = 1101004800(0x41a00000, float:20.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = r6._backgroundSquare
            float r7 = r7 - r0
            float r8 = r8 - r0
            r9.setPosition(r7, r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r6._backgroundSquare
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = r6._colorMap
            float r8 = r8.getWidth()
            float r8 = r8 + r2
            com.badlogic.gdx.scenes.scene2d.ui.Slider r9 = r6._brightnessSlider
            float r9 = r9.getWidth()
            float r8 = r8 + r9
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r6._copyColorButton
            float r9 = r9.getWidth()
            float r8 = r8 + r9
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r6._copyColorButton
            float r9 = r9.getWidth()
            float r9 = r9 * r4
            float r8 = r8 + r9
            r9 = 1077936128(0x40400000, float:3.0)
            float r9 = r9 * r0
            float r8 = r8 + r9
            r7.setWidth(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = r6._backgroundSquare
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = r6._colorMap
            float r8 = r8.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r6._recentColorsTable
            float r9 = r9.getHeight()
            float r8 = r8 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r9
            float r8 = r8 + r0
            r7.setHeight(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._hexfieldClickListener
            if (r7 != 0) goto L1e1
            org.fortheloss.framework.ColorPicker$2 r7 = new org.fortheloss.framework.ColorPicker$2
            r7.<init>(r6)
            r6._hexfieldClickListener = r7
        L1e1:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r6._hexTextField
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._hexfieldClickListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._hideClickListener
            if (r7 != 0) goto L1f3
            org.fortheloss.framework.ColorPicker$3 r7 = new org.fortheloss.framework.ColorPicker$3
            r7.<init>(r6)
            r6._hideClickListener = r7
        L1f3:
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._colorMapClickListener
            if (r7 != 0) goto L1fe
            org.fortheloss.framework.ColorPicker$4 r7 = new org.fortheloss.framework.ColorPicker$4
            r7.<init>(r6)
            r6._colorMapClickListener = r7
        L1fe:
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r6._stageRef
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._colorMapClickListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r6._bgClickCatcher
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._hideClickListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._recentColorsClickListener
            if (r7 != 0) goto L217
            org.fortheloss.framework.ColorPicker$5 r7 = new org.fortheloss.framework.ColorPicker$5
            r7.<init>(r6)
            r6._recentColorsClickListener = r7
        L217:
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r6._recentColorsTable
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._recentColorsClickListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener r7 = r6._brightnessChangeListener
            if (r7 != 0) goto L229
            org.fortheloss.framework.ColorPicker$6 r7 = new org.fortheloss.framework.ColorPicker$6
            r7.<init>(r6)
            r6._brightnessChangeListener = r7
        L229:
            com.badlogic.gdx.scenes.scene2d.ui.Slider r7 = r6._brightnessSlider
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener r8 = r6._brightnessChangeListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._brightnessClickListener
            if (r7 != 0) goto L23b
            org.fortheloss.framework.ColorPicker$7 r7 = new org.fortheloss.framework.ColorPicker$7
            r7.<init>(r6)
            r6._brightnessClickListener = r7
        L23b:
            com.badlogic.gdx.scenes.scene2d.ui.Slider r7 = r6._brightnessSlider
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._brightnessClickListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._copyColorListener
            if (r7 != 0) goto L24d
            org.fortheloss.framework.ColorPicker$8 r7 = new org.fortheloss.framework.ColorPicker$8
            r7.<init>(r6)
            r6._copyColorListener = r7
        L24d:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6._copyColorButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._copyColorListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._hexSetListener
            if (r7 != 0) goto L25f
            org.fortheloss.framework.ColorPicker$9 r7 = new org.fortheloss.framework.ColorPicker$9
            r7.<init>(r6)
            r6._hexSetListener = r7
        L25f:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._hexSetButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._hexSetListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._eyedropperListener
            if (r7 != 0) goto L271
            org.fortheloss.framework.ColorPicker$10 r7 = new org.fortheloss.framework.ColorPicker$10
            r7.<init>(r6)
            r6._eyedropperListener = r7
        L271:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._eyedropperButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._eyedropperListener
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r7 = r6._eyedropperRefreshListener
            if (r7 != 0) goto L283
            org.fortheloss.framework.ColorPicker$11 r7 = new org.fortheloss.framework.ColorPicker$11
            r7.<init>(r6)
            r6._eyedropperRefreshListener = r7
        L283:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r7 = r6._eyedropperRefresherButton
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r8 = r6._eyedropperRefreshListener
            r7.addListener(r8)
            return
    }

    public void updateColorRing(int r2, int r3, com.badlogic.gdx.scenes.scene2d.Stage r4) {
            r1 = this;
            r0 = 0
            r1.updateColorRing(r2, r3, r4, r0)
            return
    }

    public void updateColorRing(int r6, int r7, com.badlogic.gdx.scenes.scene2d.Stage r8, com.badlogic.gdx.graphics.Color r9) {
            r5 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r5._screenPixmap
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r7 = r7 + r0
            r0 = 0
            if (r6 >= 0) goto L11
            r6 = 0
        L11:
            float r2 = (float) r6
            float r3 = r8.getWidth()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L21
            float r6 = r8.getWidth()
            int r6 = (int) r6
            int r6 = r6 + (-1)
        L21:
            if (r7 >= 0) goto L24
            r7 = 0
        L24:
            float r0 = (float) r7
            float r2 = r8.getHeight()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L34
            float r7 = r8.getHeight()
            int r7 = (int) r7
            int r7 = r7 + (-1)
        L34:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L62
            float r9 = (float) r6
            float r0 = r5._stageToBackbufferRatioX
            float r9 = r9 / r0
            int r9 = (int) r9
            float r0 = (float) r7
            float r2 = r5._stageToBackbufferRatioY
            float r0 = r0 / r2
            int r0 = (int) r0
            com.badlogic.gdx.graphics.Pixmap r2 = r5._screenPixmap
            int r9 = r2.getPixel(r9, r0)
            int r0 = r9 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            int r2 = r9 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            int r9 = r9 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r5._eyedropperRing
            r4 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r4
            float r2 = r2 / r4
            float r9 = r9 / r4
            r3.setColor(r0, r2, r9, r8)
            goto L6d
        L62:
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r5._eyedropperRing
            float r2 = r9.r
            float r3 = r9.g
            float r9 = r9.b
            r0.setColor(r2, r3, r9, r8)
        L6d:
            com.badlogic.gdx.scenes.scene2d.ui.Image r8 = r5._eyedropperRing
            float r6 = (float) r6
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r9 * r1
            float r6 = r6 - r0
            float r7 = (float) r7
            float r9 = r9 * r1
            float r7 = r7 - r9
            r8.setPosition(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = r5._eyedropperRing
            com.badlogic.gdx.graphics.Color r6 = r6.getColor()
            r5.updateHEX(r6)
            return
    }
}
