package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public abstract class Module extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private static com.badlogic.gdx.scenes.scene2d.ui.Skin _skin;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle addButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle addFrameButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle appSettingsButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle applyButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle autoCameraButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle cameraStickfigureLockButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle cancelButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle cancelLargeButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle checkBoxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle colorPickerSliderStyle;
    private static com.badlogic.gdx.scenes.scene2d.utils.Drawable contextMenuBackgroundDrawable;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle copyButtonStyle;
    private static com.badlogic.gdx.graphics.Color defaultStageBGColor;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle deleteFrameButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle dialogListStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle dialogScrollPaneNoKnobStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle dialogScrollPaneStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle editButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle eyedropperButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle filterClearButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle frameContextMenuWindowStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle framesScrollPaneStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageAngleSnapStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalCopyChildrenStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalCopyOneSegmentStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalCopyStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalDeleteChildrenStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalDeleteOneSegmentStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalDeleteStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFigurePushBackwardStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFigurePushForwardStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFlipFigureX;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFlipFigureY;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFlipSegmentX;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalFlipSegmentY;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalMenuLeftStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalMenuRightStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalPasteStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalPushBackwardStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalPushForwardStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalRedoStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalSendToBackStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalSendToFrontStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalShortDrawOrderOffStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalShortDrawOrderOnStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalShortShowNodesAllStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalShortShowNodesDynamicStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalShortShowNodesNoneStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle imageButtonNormalUndoStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonFinishedStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeAddStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeApplyStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeConnectorAddStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeCopyChildrenStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeCopyOneSegmentStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeCopyStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeDeleteChildrenStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeDeleteOneSegmentStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeFinishedStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeJoin;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargePolyfillAddStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeShareFilesStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeShortViewOptionsStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeTestSmartStretchStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeUndoStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeUnjoin;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonLargeViewOptionsStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonNormalConnectorAddStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle imageTextButtonNormalPolyfillAddStyle;
    private static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle imageTextLongPressButtonLargePasteStyle;
    private static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle imageTextLongPressButtonLargeSplitStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle incrementButtonSmallStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle incrementButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeArrowsButtonStyle;
    private static org.fortheloss.sticknodes.TextButtonLongPress.TextButtonLongPressStyle largeButtonLongPressStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle largeButtonStyle;
    private static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle largeDeleteButtonLongPressStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeDeleteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeMagnifierButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeMovieclipButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeSpriteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeSpriteDragNotOriginBasedStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeSpriteDragOriginBasedStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeStickfigureButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeUrlProButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeUrlRateButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeUrlWebsiteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeViewNodesAllButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeViewNodesNoneButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle largeViewNodesStaticButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle linkCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle mcModeLeaveAddCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle mcModeLeaveEditCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle modeCameraCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle modeNormalCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle modePanningCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle modifyBranchButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle normalArrowDownButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle normalArrowLeftButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle normalArrowRightButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle normalArrowUpButtonStyle;
    private static org.fortheloss.sticknodes.TextButtonLongPress.TextButtonLongPressStyle normalButtonLongPressStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle normalButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle normalDeleteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle pasteButtonStyle;
    private static org.fortheloss.sticknodes.ImageButtonLongPress.ImageButtonLongPressStyle playButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle quickMenuTextButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle radioCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle refreshButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle roundLockButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle saveButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle saveLargeButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle selectBoxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle shortDeleteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle shortJumpArrowDownButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle shortJumpArrowUpButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle shortLargeButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle shortPlaySoundButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle showHideCheckBoxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle simpleShowHideCheckboxStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle smallDeleteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle smallEditButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle smallPreviewButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle smallSpeakerButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle smallUnjoinImageButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle soundPreviewImageButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle spriteDeleteButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle spriteExpandButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle spriteLockButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle spriteRemoveBackgroundButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle spriteZoomInButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle spriteZoomOutButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle stopButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle textAreaAllLocalesStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle textAreaStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle textFieldStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle toolsLabelStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle toolsSliderStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle toolsTitleLabelStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle toolsTouchpadStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle windowLabelStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle windowStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle zoomMinusButtonStyle;
    private static com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle zoomPlusButtonStyle;
    protected org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    protected com.badlogic.gdx.graphics.glutils.FrameBuffer _fboRef;
    protected boolean _needsToBeDrawn;
    protected boolean _priorityNeedsToBeDrawn;
    private com.badlogic.gdx.math.Vector2 mCoordsForLastClickedWidget;
    private com.badlogic.gdx.math.Vector2 mCoordsForLastClickedWidgetNewPos;
    private int mLastClickedWidgetId;



    public static class FileNameFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public FileNameFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r3, char r4) {
                r2 = this;
                java.lang.String r3 = r3.getText()
                int r3 = r3.length()
                r0 = 0
                r1 = 128(0x80, float:1.794E-43)
                if (r3 < r1) goto Le
                return r0
            Le:
                boolean r3 = java.lang.Character.isLetterOrDigit(r4)
                r1 = 1
                if (r3 == 0) goto L16
                return r1
            L16:
                r3 = 32
                if (r4 == r3) goto L2c
                r3 = 95
                if (r4 == r3) goto L2c
                r3 = 45
                if (r4 == r3) goto L2c
                r3 = 40
                if (r4 == r3) goto L2c
                r3 = 41
                if (r4 != r3) goto L2b
                goto L2c
            L2b:
                return r0
            L2c:
                return r1
        }
    }

    public static class HashtagFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public HashtagFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r4, char r5) {
                r3 = this;
                java.lang.String r0 = r4.getText()
                int r0 = r0.length()
                r1 = 0
                r2 = 20
                if (r0 < r2) goto Le
                return r1
            Le:
                boolean r0 = java.lang.Character.isLetterOrDigit(r5)
                r2 = 1
                if (r0 == 0) goto L16
                return r2
            L16:
                r0 = 35
                if (r5 != r0) goto L25
                java.lang.String r4 = r4.getText()
                int r4 = r4.length()
                if (r4 != 0) goto L25
                return r2
            L25:
                return r1
        }
    }

    public static class HexFilter implements com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter {
        public HexFilter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter
        public boolean acceptChar(com.badlogic.gdx.scenes.scene2d.ui.TextField r2, char r3) {
                r1 = this;
                boolean r2 = java.lang.Character.isDigit(r3)
                r0 = 1
                if (r2 == 0) goto L8
                return r0
            L8:
                char r2 = java.lang.Character.toUpperCase(r3)
                r3 = 35
                if (r2 == r3) goto L2a
                r3 = 65
                if (r2 == r3) goto L2a
                r3 = 66
                if (r2 == r3) goto L2a
                r3 = 67
                if (r2 == r3) goto L2a
                r3 = 68
                if (r2 == r3) goto L2a
                r3 = 69
                if (r2 == r3) goto L2a
                r3 = 70
                if (r2 != r3) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
        }
    }

    public static class WidgetIdentifier {
        public int id;

        public WidgetIdentifier(int r1) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                return
        }
    }

    public Module(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, com.badlogic.gdx.graphics.glutils.FrameBuffer r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._priorityNeedsToBeDrawn = r0
            r0 = -1
            r1.mLastClickedWidgetId = r0
            r1._animationScreenRef = r2
            r1._fboRef = r3
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1.mCoordsForLastClickedWidget = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r2.<init>()
            r1.mCoordsForLastClickedWidgetNewPos = r2
            org.fortheloss.sticknodes.animationscreen.modules.Module$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.Module$2
            r2.<init>(r1)
            r1.addListener(r2)
            return
    }

    public static void createStyles(org.fortheloss.framework.Assets r31) {
            r1 = r31
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Class<com.badlogic.gdx.graphics.g2d.BitmapFont> r2 = com.badlogic.gdx.graphics.g2d.BitmapFont.class
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r4 = 1
            java.lang.Object r3 = r1.get(r3, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas2
            java.lang.Object r5 = r1.get(r5, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r5
            java.lang.String r6 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r6 = r1.get(r6, r0, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r6 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r6
            java.lang.String r7 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r0 = r1.get(r7, r0, r4)
            r7 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r7 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r7
            com.badlogic.gdx.graphics.Color r8 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_RED
            r8.<init>(r0)
            com.badlogic.gdx.graphics.Color r9 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            r9.<init>(r0)
            com.badlogic.gdx.graphics.Color r10 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_DARK_GRAY
            r10.<init>(r0)
            com.badlogic.gdx.graphics.Color r11 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_LIGHT_GRAY
            r11.<init>(r0)
            com.badlogic.gdx.graphics.Color r12 = new com.badlogic.gdx.graphics.Color
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r0, r0, r0, r13)
            com.badlogic.gdx.graphics.Color r13 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.WHITE
            r13.<init>(r0)
            java.lang.String r0 = "FFEBEDFF"
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor = r0
            java.lang.String r0 = "FFFFFF"
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r14 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r14)
            java.lang.String r14 = "customSkinSetting"
            int r0 = r0.getInteger(r14, r4)
            java.lang.String r15 = "FF"
            r4 = 3
            if (r0 != r4) goto L1ce
            boolean r4 = org.fortheloss.sticknodes.App.isUsingCustomSkin
            if (r4 == 0) goto L1ce
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.skinPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r4)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L33a
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.skinPath
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            java.lang.String r4 = "textColors.txt"
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L33a
            com.badlogic.gdx.utils.JsonReader r4 = new com.badlogic.gdx.utils.JsonReader
            r4.<init>()
            com.badlogic.gdx.utils.JsonValue r4 = r4.parse(r0)
            java.lang.String r0 = "textRed"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> Lcf
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcf
            r14.<init>()     // Catch: java.lang.Exception -> Lcf
            r14.append(r0)     // Catch: java.lang.Exception -> Lcf
            r14.append(r15)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> Lcf
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> Lcf
            r8.set(r0)     // Catch: java.lang.Exception -> Lcf
            goto Ld3
        Lcf:
            r0 = move-exception
            r0.printStackTrace()
        Ld3:
            java.lang.String r0 = "textBlue"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> Lf0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf0
            r14.<init>()     // Catch: java.lang.Exception -> Lf0
            r14.append(r0)     // Catch: java.lang.Exception -> Lf0
            r14.append(r15)     // Catch: java.lang.Exception -> Lf0
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> Lf0
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> Lf0
            r9.set(r0)     // Catch: java.lang.Exception -> Lf0
            goto Lf4
        Lf0:
            r0 = move-exception
            r0.printStackTrace()
        Lf4:
            java.lang.String r0 = "textGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L111
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L111
            r14.<init>()     // Catch: java.lang.Exception -> L111
            r14.append(r0)     // Catch: java.lang.Exception -> L111
            r14.append(r15)     // Catch: java.lang.Exception -> L111
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L111
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L111
            r10.set(r0)     // Catch: java.lang.Exception -> L111
            goto L115
        L111:
            r0 = move-exception
            r0.printStackTrace()
        L115:
            java.lang.String r0 = "inputGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L132
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L132
            r14.<init>()     // Catch: java.lang.Exception -> L132
            r14.append(r0)     // Catch: java.lang.Exception -> L132
            r14.append(r15)     // Catch: java.lang.Exception -> L132
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L132
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L132
            r11.set(r0)     // Catch: java.lang.Exception -> L132
            goto L136
        L132:
            r0 = move-exception
            r0.printStackTrace()
        L136:
            java.lang.String r0 = "inputLightGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L153
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L153
            r14.<init>()     // Catch: java.lang.Exception -> L153
            r14.append(r0)     // Catch: java.lang.Exception -> L153
            r14.append(r15)     // Catch: java.lang.Exception -> L153
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L153
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L153
            r12.set(r0)     // Catch: java.lang.Exception -> L153
            goto L157
        L153:
            r0 = move-exception
            r0.printStackTrace()
        L157:
            java.lang.String r0 = "selection"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L174
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L174
            r14.<init>()     // Catch: java.lang.Exception -> L174
            r14.append(r0)     // Catch: java.lang.Exception -> L174
            r14.append(r15)     // Catch: java.lang.Exception -> L174
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L174
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L174
            r13.set(r0)     // Catch: java.lang.Exception -> L174
            goto L178
        L174:
            r0 = move-exception
            r0.printStackTrace()
        L178:
            java.lang.String r0 = "toolsBGHighlightColor"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L18e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L18e
            r14.<init>()     // Catch: java.lang.Exception -> L18e
            r14.append(r0)     // Catch: java.lang.Exception -> L18e
            r14.append(r15)     // Catch: java.lang.Exception -> L18e
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L18e
            goto L193
        L18e:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L193:
            if (r0 != 0) goto L199
            r14 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor = r14
            goto L19f
        L199:
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor = r0
        L19f:
            java.lang.String r0 = "defaultStageBG"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L1b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b5
            r4.<init>()     // Catch: java.lang.Exception -> L1b5
            r4.append(r0)     // Catch: java.lang.Exception -> L1b5
            r4.append(r15)     // Catch: java.lang.Exception -> L1b5
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L1b5
            goto L1ba
        L1b5:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L1ba:
            if (r0 != 0) goto L1c6
            java.lang.String r0 = "FFFFFF"
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
            goto L33a
        L1c6:
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
            goto L33a
        L1ce:
            r4 = 2
            if (r0 != r4) goto L33a
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.darkSkinFolder
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            java.lang.String r4 = "textColors.txt"
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.internal(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L33a
            com.badlogic.gdx.utils.JsonReader r4 = new com.badlogic.gdx.utils.JsonReader
            r4.<init>()
            com.badlogic.gdx.utils.JsonValue r4 = r4.parse(r0)
            java.lang.String r0 = "textRed"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L216
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L216
            r14.<init>()     // Catch: java.lang.Exception -> L216
            r14.append(r0)     // Catch: java.lang.Exception -> L216
            r14.append(r15)     // Catch: java.lang.Exception -> L216
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L216
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L216
            r8.set(r0)     // Catch: java.lang.Exception -> L216
            goto L21f
        L216:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L21f:
            java.lang.String r0 = "textBlue"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L23c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23c
            r14.<init>()     // Catch: java.lang.Exception -> L23c
            r14.append(r0)     // Catch: java.lang.Exception -> L23c
            r14.append(r15)     // Catch: java.lang.Exception -> L23c
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L23c
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L23c
            r9.set(r0)     // Catch: java.lang.Exception -> L23c
            goto L245
        L23c:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L245:
            java.lang.String r0 = "textGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L262
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L262
            r14.<init>()     // Catch: java.lang.Exception -> L262
            r14.append(r0)     // Catch: java.lang.Exception -> L262
            r14.append(r15)     // Catch: java.lang.Exception -> L262
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L262
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L262
            r10.set(r0)     // Catch: java.lang.Exception -> L262
            goto L26b
        L262:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L26b:
            java.lang.String r0 = "inputGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L288
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L288
            r14.<init>()     // Catch: java.lang.Exception -> L288
            r14.append(r0)     // Catch: java.lang.Exception -> L288
            r14.append(r15)     // Catch: java.lang.Exception -> L288
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L288
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L288
            r11.set(r0)     // Catch: java.lang.Exception -> L288
            goto L291
        L288:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L291:
            java.lang.String r0 = "inputLightGray"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L2ae
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2ae
            r14.<init>()     // Catch: java.lang.Exception -> L2ae
            r14.append(r0)     // Catch: java.lang.Exception -> L2ae
            r14.append(r15)     // Catch: java.lang.Exception -> L2ae
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L2ae
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L2ae
            r12.set(r0)     // Catch: java.lang.Exception -> L2ae
            goto L2b7
        L2ae:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L2b7:
            java.lang.String r0 = "selection"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L2d4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d4
            r14.<init>()     // Catch: java.lang.Exception -> L2d4
            r14.append(r0)     // Catch: java.lang.Exception -> L2d4
            r14.append(r15)     // Catch: java.lang.Exception -> L2d4
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L2d4
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)     // Catch: java.lang.Exception -> L2d4
            r13.set(r0)     // Catch: java.lang.Exception -> L2d4
            goto L2dd
        L2d4:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
        L2dd:
            java.lang.String r0 = "toolsBGHighlightColor"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L2f3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f3
            r14.<init>()     // Catch: java.lang.Exception -> L2f3
            r14.append(r0)     // Catch: java.lang.Exception -> L2f3
            r14.append(r15)     // Catch: java.lang.Exception -> L2f3
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Exception -> L2f3
            goto L2fd
        L2f3:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r14 = org.fortheloss.sticknodes.App.platform
            r14.logNonFatalException(r0)
            r0 = 0
        L2fd:
            if (r0 != 0) goto L303
            r14 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor = r14
            goto L309
        L303:
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable.tableColor = r0
        L309:
            java.lang.String r0 = "defaultStageBG"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L31f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31f
            r4.<init>()     // Catch: java.lang.Exception -> L31f
            r4.append(r0)     // Catch: java.lang.Exception -> L31f
            r4.append(r15)     // Catch: java.lang.Exception -> L31f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L31f
            goto L329
        L31f:
            r0 = move-exception
            r0.printStackTrace()
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            r4.logNonFatalException(r0)
            r0 = 0
        L329:
            if (r0 != 0) goto L334
            java.lang.String r0 = "FFFFFF"
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
            goto L33a
        L334:
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.valueOf(r0)
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
        L33a:
            boolean r0 = org.fortheloss.sticknodes.App.isInternationalUI()
            if (r0 != 0) goto L35a
            java.lang.String r0 = org.fortheloss.sticknodes.App.fntDejavuSansCondensed
            r4 = 1
            java.lang.Object r0 = r1.get(r0, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            java.lang.String r14 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedBig
            java.lang.Object r14 = r1.get(r14, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r14 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r14
            java.lang.String r15 = org.fortheloss.sticknodes.App.fntDejavuSansCondensedInput
            java.lang.Object r15 = r1.get(r15, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r15 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r15
            goto L373
        L35a:
            r4 = 1
            java.lang.String r0 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r0 = r1.get(r0, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r0
            java.lang.String r14 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r14 = r1.get(r14, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r14 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r14
            java.lang.String r15 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r15 = r1.get(r15, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r15 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r15
        L373:
            r16 = r14
            java.lang.String r14 = org.fortheloss.sticknodes.App.fntMeiryoInternational
            java.lang.Object r1 = r1.get(r14, r2, r4)
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = (com.badlogic.gdx.graphics.g2d.BitmapFont) r1
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = new com.badlogic.gdx.scenes.scene2d.ui.Skin
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module._skin = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_small_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "smallButtonUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_small_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "smallButtonDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_short_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "shortButtonUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_short_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "shortButtonDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_short_large_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "shortButtonLargeUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_short_large_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "shortButtonLargeDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_normal_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "normalButtonUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_normal_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "normalButtonDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_large_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "largeButtonUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_large_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "largeButtonDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_z_increment_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "incrementButtonUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_z_increment_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "incrementButtonDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_z_increment_small_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "incrementButtonSmallUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "button_z_increment_small_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "incrementButtonSmallDown"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r14 = "input_ninepatch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r17 = 1092616192(0x41200000, float:10.0)
            r23 = r13
            float r13 = r14 * r17
            int r13 = (int) r13
            r31 = r1
            float r1 = r14 * r17
            int r1 = (int) r1
            r24 = r12
            float r12 = r14 * r17
            int r12 = (int) r12
            float r14 = r14 * r17
            int r14 = (int) r14
            r17 = r4
            r19 = r13
            r20 = r1
            r21 = r12
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r1 = "textFieldNinepatch"
            r2.add(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r12 = "input_cursor"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r3.findRegion(r12)
            r4.<init>(r12)
            java.lang.String r12 = "textFieldCursor"
            r2.add(r12, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "input_selection"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "textFieldSelection"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "checkbox_checked_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "checkboxCheckedUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "checkbox_unchecked_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "checkboxUncheckedUp"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "radio_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "radioOn"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "radio_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "radioOff"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r14 = "selectbox_ninepatch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r17 = 1106247680(0x41f00000, float:30.0)
            r25 = r11
            float r11 = r14 * r17
            int r11 = (int) r11
            r26 = r15
            float r15 = r14 * r17
            int r15 = (int) r15
            r27 = r13
            float r13 = r14 * r17
            int r13 = (int) r13
            float r14 = r14 * r17
            int r14 = (int) r14
            r17 = r4
            r19 = r11
            r20 = r15
            r21 = r13
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "selectBoxBackground"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "input_selection"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "selectBoxListSelection"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r11 = "input_ninepatch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1092616192(0x41200000, float:10.0)
            float r13 = r13 * r11
            int r13 = (int) r13
            r14 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 * r11
            int r14 = (int) r14
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r11
            int r15 = (int) r15
            r17 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 * r17
            int r11 = (int) r11
            r17 = r4
            r19 = r13
            r20 = r14
            r21 = r15
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "selectBoxScrollPaneBackground"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r13 = "selectbox_knob"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r14 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 * r13
            int r14 = (int) r14
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r13
            int r15 = (int) r15
            r17 = 1092616192(0x41200000, float:10.0)
            r28 = r11
            float r11 = r13 * r17
            int r11 = (int) r11
            float r13 = r13 * r17
            int r13 = (int) r13
            r17 = r4
            r19 = r14
            r20 = r15
            r21 = r11
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "selectBoxScrollPaneKnob"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r11 = "window_ninepatch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1114636288(0x42700000, float:60.0)
            float r13 = r13 * r11
            int r13 = (int) r13
            r14 = 1114636288(0x42700000, float:60.0)
            float r14 = r14 * r11
            int r14 = (int) r14
            r15 = 1114636288(0x42700000, float:60.0)
            float r15 = r15 * r11
            int r15 = (int) r15
            r17 = 1114636288(0x42700000, float:60.0)
            float r11 = r11 * r17
            int r11 = (int) r11
            r17 = r4
            r19 = r13
            r20 = r14
            r21 = r15
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "windowBackground"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r11 = "frames_scrollpane_hscroll"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1092616192(0x41200000, float:10.0)
            float r13 = r13 * r11
            int r13 = (int) r13
            r14 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 * r11
            int r14 = (int) r14
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r11
            int r15 = (int) r15
            r17 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 * r17
            int r11 = (int) r11
            r17 = r4
            r19 = r13
            r20 = r14
            r21 = r15
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "framesScrollPaneHScroll"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r11 = "frames_scrollpane_hscroll_knob"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r11)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1092616192(0x41200000, float:10.0)
            float r13 = r13 * r11
            int r13 = (int) r13
            r14 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 * r11
            int r14 = (int) r14
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r11
            int r15 = (int) r15
            r17 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 * r17
            int r11 = (int) r11
            r17 = r4
            r19 = r13
            r20 = r14
            r21 = r15
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r11 = "framesScrollPaneHScrollKnob"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "horizontal_slider_knob"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "toolsSliderKnob"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "horizontal_slider_bar"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "toolsSliderBackground"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "touchpad_knob"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "touchpadKnob"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "touchpad_background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "touchpadBackground"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "settings"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "appSettingsIcon"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "check"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "checkIcon"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "x"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "xIcon"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r11 = "arrow-up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r11)
            r4.<init>(r11)
            java.lang.String r11 = "arrowUp"
            r2.add(r11, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "arrow-right"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "arrowRight"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "arrow-down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "arrowDown"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "arrow-left"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "arrowLeft"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "zoom_button_plus"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "zoomButtonPlus"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "zoom_button_minus"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "zoomButtonMinus"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r13 = "icon_delete"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r13 = r3.findRegion(r13)
            r4.<init>(r13)
            java.lang.String r13 = "deleteIcon"
            r2.add(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_magnifier"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "magnifierIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_arrows"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "arrowsIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_viewnodes_all"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "viewNodesAllIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_viewnodes_static"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "viewNodesStaticIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_viewnodes_none"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "viewNodesNoneIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "small_icon_preview"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "smallIconPreview"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "small_icon_speaker"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "smallIconSpeaker"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "h_icon_modify_branch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r6.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "modifyBranchIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "h_icon_autocam"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r6.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "autoCameraIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "h_icon_cam_lock_figure"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r6.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "cameraStickfigureLockIcon"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "square"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "table_gray_background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r4.<init>(r14)
            java.lang.String r14 = "tableGrayBackground"
            r2.add(r14, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.NinePatch r4 = new com.badlogic.gdx.graphics.g2d.NinePatch
            java.lang.String r14 = "context-menu-bg-ninepatch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r18 = r3.findRegion(r14)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r14
            int r15 = (int) r15
            r17 = 1092616192(0x41200000, float:10.0)
            r29 = r12
            float r12 = r14 * r17
            int r12 = (int) r12
            r30 = r1
            float r1 = r14 * r17
            int r1 = (int) r1
            float r14 = r14 * r17
            int r14 = (int) r14
            r17 = r4
            r19 = r15
            r20 = r12
            r21 = r1
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.String r1 = "frameContextMenuBackground"
            r2.add(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "colorpicker_brightness_bg"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r7.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "sliderBackground"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "colorpicker_brightness_knob"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r7.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "sliderKnob"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "icon_add_frame"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r3.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "addFrameIcon"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "icon_delete_frame"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r3.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "deleteFrameIcon"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "icon_play_new"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r3.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "playIcon"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "icon_stop_new"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r3.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "stopIcon"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r4 = "icon_copy"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r3.findRegion(r4)
            r2.<init>(r4)
            java.lang.String r4 = "copyIcon"
            r1.add(r4, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r12 = "icon_paste"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r3.findRegion(r12)
            r2.<init>(r12)
            java.lang.String r12 = "pasteIcon"
            r1.add(r12, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "icon_dropdown"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r3.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "dropdownIcon"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "mode_button_up_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "modeBgLeftUp"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "mode_button_down_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "modeBgLeftDown"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "mode_button_up_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "modeBgCenterUp"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "mode_button_down_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "modeBgCenterDown"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r14 = "mode_button_up_c"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r5.findRegion(r14)
            r2.<init>(r14)
            java.lang.String r14 = "modeBgRightUp"
            r1.add(r14, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "mode_button_down_c"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r5.findRegion(r15)
            r2.<init>(r5)
            java.lang.String r5 = "modeBgRightDown"
            r1.add(r5, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_normal_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconNormalUp"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_normal_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconNormalDown"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_panning_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconPanningUp"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_panning_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconPanningDown"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_camera_up"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconCameraUp"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_mode_icon_camera_down"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconCameraDown"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_add"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconAddUp"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_add"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconAddDown"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_apply"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconFinishedUp"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_apply"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "modeIconFinishedDown"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "icon_eyedropper"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r7.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "eyedropperIcon"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "icon_refresh"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r7.findRegion(r15)
            r2.<init>(r7)
            java.lang.String r7 = "refreshIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_library_import_stickfigure_icon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "stickfigureIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_library_import_movieclip_icon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "movieclipIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_library_import_sprite_icon"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "icon_unjoin"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r3.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "unjoinIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "icon_edit"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r3.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "editIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "icon_visible_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r3.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "visibleIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "icon_visible_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r3.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "hiddenIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "long_press_indicator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r3.findRegion(r7)
            r2.<init>(r3)
            java.lang.String r3 = "longPressIndicator"
            r1.add(r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r3 = "g_button_indicator_context_menu"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r6.findRegion(r3)
            r2.<init>(r3)
            java.lang.String r3 = "longPressIndicatorNew"
            r1.add(r3, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "d_round_button_locked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "roundLockButtonLocked"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "d_round_button_unlocked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "roundLockButtonUnlocked"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_clear_input"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "filterClearIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "f_icon_sprite_remove_background"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteRemoveBackgroundIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_delete"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteDeleteIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_locked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteLocked"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_unlocked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteUnlocked"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_zoom_in"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteZoomInIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_zoom_out"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteZoomOutIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_sprite_expand"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "spriteExpandIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_linked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "linkIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_unlinked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "unlinkIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_scale_mode_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "scaleModeAIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_scale_mode_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "scaleModeBIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_url_rate"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "urlRateIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_url_pro"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "urlProIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "e_icon_url_website"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "urlWebsiteIcon"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_copy_children"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconCopyChildren"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_delete_children"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconDeleteChildren"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_draw_order_off"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconDrawOrderOff"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_draw_order_on"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconDrawOrderOn"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_undo"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconUndo"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_redo"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconRedo"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_show_nodes_none"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconShowNodesNone"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_show_nodes_dyanmic"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconShowNodesDynamic"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_show_nodes_all"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconShowNodesAll"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_split_segment"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconSplitSegment"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_view_options"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconViewOptions"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_share"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconShareFiles"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r7 = "g_icon_apply"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r6.findRegion(r7)
            r2.<init>(r7)
            java.lang.String r7 = "iconApplyNew"
            r1.add(r7, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_cancel"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconCancelNew"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_add"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconAddNew"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "g_icon_angle_snap"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconAngleSnap"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_connector_add"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconConnectorAdd"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_polyfill_add"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconPolyfillAdd"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_test_ss"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconTestSmartStretch"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_flip_segment_x"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFlipSegmentX"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_flip_segment_y"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFlipSegmentY"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_flip_figure_x"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFlipFigureX"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_flip_figure_y"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFlipFigureY"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_join1"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "figureJoinIconNew"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_join2"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "figureUnjoinIconNew"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_copy_one"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "copyOneSegmentIcon"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "h_icon_delete_one"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "deleteOneSegmentIcon"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_save"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconSave"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_front_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconPushForward"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_back_a"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconPushBackward"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_front_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconSendToFront"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_back_b"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconSendToBack"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_push_forward"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFigurePushForward"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_push_backward"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconFigurePushBackward"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_menu_left"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r15 = r6.findRegion(r15)
            r2.<init>(r15)
            java.lang.String r15 = "iconMenuLeft"
            r1.add(r15, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            java.lang.String r15 = "i_icon_menu_right"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r6.findRegion(r15)
            r2.<init>(r6)
            java.lang.String r6 = "iconMenuRight"
            r1.add(r6, r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r1.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "smallButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r1.up = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "smallButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r1.down = r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r2 = r2 * r6
            r1.pressedOffsetY = r2
            r1.font = r0
            r1.fontColor = r9
            r1.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "shortButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r2.up = r6
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "shortButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r2.down = r6
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r15 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r15
            r2.pressedOffsetY = r6
            r2.font = r0
            r2.fontColor = r9
            r2.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r6.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle = r6
            com.badlogic.gdx.scenes.scene2d.ui.Skin r15 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r17 = r5
            java.lang.String r5 = "shortButtonLargeUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r15.getDrawable(r5)
            r6.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "shortButtonLargeDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.down = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r15 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r15
            r5.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle
            r5.font = r0
            r5.fontColor = r9
            r5.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r5.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "normalButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.up = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "normalButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.down = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r15 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r15
            r5.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r5.font = r0
            r5.fontColor = r9
            r5.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r5.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "largeButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.up = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "largeButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.down = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r15 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r15
            r5.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.font = r0
            r5.fontColor = r9
            r5.downFontColor = r8
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r5 = new org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r15 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r15 = r15.getDrawable(r3)
            r5.<init>(r6, r15)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonLongPressStyle = r5
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r5 = new org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r15 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r15 = r15.getDrawable(r3)
            r5.<init>(r6, r15)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonLongPressStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalDeleteButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r13)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r13)
            r5.imageUp = r6
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r5 = new org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r15 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r15 = r15.getDrawable(r3)
            r5.<init>(r6, r15)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonLongPressStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeStickfigureButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "stickfigureIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeMovieclipButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "movieclipIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "spriteIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeMagnifierButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "magnifierIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeArrowsButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "arrowsIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesAllButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "iconShowNodesAll"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesStaticButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "viewNodesStaticIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesNoneButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "iconShowNodesNone"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            r5.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowUpButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r11)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            r5.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowDownButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "arrowDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r5.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortPlaySoundButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r15 = "smallIconSpeaker"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r5.imageUp = r6
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r5.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortDeleteButtonStyle = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r13)
            r5.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.roundLockButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "roundLockButtonLocked"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.roundLockButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "roundLockButtonUnlocked"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.roundLockButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.roundLockButtonStyle
            r2.font = r0
            r2.fontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowUpButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r11)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowRightButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "arrowRight"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowDownButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "arrowDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowLeftButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "arrowLeft"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "incrementButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "incrementButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle
            r2.font = r0
            r2.fontColor = r9
            r2.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "incrementButtonSmallUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "incrementButtonSmallDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle
            r2.font = r0
            r2.fontColor = r9
            r2.downFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.appSettingsButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "appSettingsIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.applyButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.cancelButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "iconCancelNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.cancelLargeButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "iconCancelNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.addButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "iconAddNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageAngleSnapStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "iconAngleSnap"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r6 = r30
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r9 = r29
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r9)
            r2.cursor = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r15 = r27
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r15)
            r2.selection = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle
            r5 = r26
            r2.font = r5
            r18 = r7
            r7 = r25
            r2.fontColor = r7
            r19 = r13
            r13 = r24
            r2.messageFontColor = r13
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle = r2
            r20 = r14
            com.badlogic.gdx.scenes.scene2d.ui.Skin r14 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r14 = r14.getDrawable(r6)
            r2.background = r14
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r14 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r14 = r14.getDrawable(r9)
            r2.cursor = r14
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r14 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r14 = r14.getDrawable(r15)
            r2.selection = r14
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle
            r14 = r31
            r2.font = r14
            r2.fontColor = r7
            r2.messageFontColor = r13
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r14 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r14.getDrawable(r6)
            r2.background = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.cursor = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r15)
            r2.selection = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle
            r2.font = r5
            r2.fontColor = r7
            r2.messageFontColor = r13
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "checkboxCheckedUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.checkboxOn = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "checkboxUncheckedUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.checkboxOff = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r9
            r2.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle
            r2.font = r0
            r2.fontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "radioOn"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.checkboxOn = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "radioOff"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.checkboxOff = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r9
            r2.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle
            r2.font = r0
            r2.fontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "selectBoxBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.background = r6
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle
            r2.font = r5
            r2.fontColor = r7
            com.badlogic.gdx.graphics.Color r6 = new com.badlogic.gdx.graphics.Color
            float r9 = r7.r
            float r13 = r7.g
            float r14 = r7.b
            r15 = 1056964608(0x3f000000, float:0.5)
            r6.<init>(r9, r13, r14, r15)
            r2.disabledFontColor = r6
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "selectBoxListSelection"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r9)
            r2.selection = r6
            r2.font = r5
            r2.fontColorUnselected = r7
            r6 = r23
            r2.fontColorSelected = r6
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle
            r9.listStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r13 = r28
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r13)
            r2.background = r9
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r14 = "selectBoxScrollPaneKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r14)
            r2.vScrollKnob = r9
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle
            r9.scrollStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r13)
            r2.background = r9
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r14 = "framesScrollPaneHScrollKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r14)
            r2.vScrollKnob = r9
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r14 = "framesScrollPaneHScroll"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r14)
            r2.vScroll = r9
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle
            r2.<init>(r9)
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneNoKnobStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r9 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r9.getDrawable(r13)
            r2.background = r9
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneNoKnobStyle
            r9 = 0
            r2.vScrollKnob = r9
            r2.vScroll = r9
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogListStyle = r2
            r2.font = r5
            r2.fontColorUnselected = r7
            r2.fontColorSelected = r6
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "selectBoxListSelection"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.selection = r5
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.windowStyle = r2
            r14 = r16
            r2.titleFont = r14
            r2.titleFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "windowBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.windowLabelStyle = r2
            r2.font = r0
            r2.fontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.framesScrollPaneStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "framesScrollPaneHScroll"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.hScroll = r5
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.framesScrollPaneStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "framesScrollPaneHScrollKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.hScrollKnob = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsLabelStyle = r2
            r2.font = r0
            r2.fontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTitleLabelStyle = r2
            r2.font = r14
            r2.fontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsSliderStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "toolsSliderKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.knob = r5
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.toolsSliderStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "toolsSliderBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTouchpadStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "touchpadKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.knob = r5
            com.badlogic.gdx.scenes.scene2d.ui.Touchpad$TouchpadStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTouchpadStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "touchpadBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.frameContextMenuWindowStyle = r2
            r2.titleFont = r14
            r2.titleFontColor = r8
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "frameContextMenuBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r5 = "frameContextMenuBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.contextMenuBackgroundDrawable = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.soundPreviewImageButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "normalButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.soundPreviewImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r11)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.zoomPlusButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "zoomButtonPlus"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.zoomMinusButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "zoomButtonMinus"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r2.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallSpeakerButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "smallIconSpeaker"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r2.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallPreviewButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "smallIconPreview"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.modifyBranchButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modifyBranchIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.autoCameraButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "autoCameraIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.cameraStickfigureLockButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "cameraStickfigureLockIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.colorPickerSliderStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "sliderBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.background = r5
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.colorPickerSliderStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "sliderKnob"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.knob = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.addFrameButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "addFrameIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.addFrameButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.deleteFrameButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "deleteFrameIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.deleteFrameButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle r2 = new org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r6 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.getDrawable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            com.badlogic.gdx.graphics.Color r7 = r7.fontColor
            r2.<init>(r5, r6, r7)
            org.fortheloss.sticknodes.animationscreen.modules.Module.playButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "playIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.playButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = getNormalButtonStyle()
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.stopButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "stopIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.stopButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.copyButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r4)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.copyButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = getNormalButtonStyle()
            r2.<init>(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module.pasteButtonStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r12)
            r2.imageUp = r5
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.pasteButtonStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            r2.pressedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            r2.font = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconNormalUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconNormalDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgLeftUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgLeftDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgLeftDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checked = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r5
            r2.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.checkedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            r2.font = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconPanningUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconPanningDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgCenterUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgCenterDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeBgCenterDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checked = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r5
            r2.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.checkedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            r2.font = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconCameraUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "modeIconCameraDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r6 = r20
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r7 = r17
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.checked = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r9 = r9 * r5
            r2.pressedOffsetY = r9
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r9
            r2.checkedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            r2.font = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "modeIconAddUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r9)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "modeIconAddDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r9)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.checked = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r9 = r9 * r5
            r2.pressedOffsetY = r9
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            r9 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r9
            r2.checkedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r5 = r5.font
            r2.font = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "modeIconFinishedUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r9)
            r2.checkboxOff = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r9 = "modeIconFinishedDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r9)
            r2.checkboxOn = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r6)
            r2.up = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.down = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r5 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r5.getDrawable(r7)
            r2.checked = r5
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r5
            r2.pressedOffsetY = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r6
            r2.checkedOffsetY = r5
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle
            r2.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.quickMenuTextButtonStyle = r2
            r2.font = r0
            r2.fontColor = r8
            r2.downFontColor = r10
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.eyedropperButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r5 = "eyedropperIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.refreshButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r5 = "refreshIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallUnjoinImageButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r5 = "figureUnjoinIconNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.editButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r5 = "editIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallDeleteButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r5 = r19
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r5)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallEditButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "editIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.filterClearButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "filterClearIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteDeleteButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "spriteDeleteIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteRemoveBackgroundButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "spriteRemoveBackgroundIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomInButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "spriteZoomInIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomOutButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r6 = "spriteZoomOutIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r6)
            r0.imageUp = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteExpandButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "spriteExpandIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            r0.font = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle
            r1 = 0
            r0.pressedOffsetY = r1
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "spriteUnlocked"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOff = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "spriteLocked"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOn = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "spriteLocked"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOver = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "smallButtonUp"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.up = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "smallButtonDown"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.down = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            r0.font = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r1 = r1 * r2
            r0.pressedOffsetY = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "hiddenIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOff = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "visibleIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOn = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.simpleShowHideCheckboxStyle = r0
            r1 = 0
            r0.up = r1
            r0.down = r1
            r2 = 0
            r0.pressedOffsetY = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.Module.linkCheckboxStyle = r0
            r0.up = r1
            r0.down = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = getToolsLabelStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r1.font
            r0.font = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.linkCheckboxStyle
            r1 = 0
            r0.pressedOffsetY = r1
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "linkIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOn = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.linkCheckboxStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "unlinkIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.checkboxOff = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragOriginBasedStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "scaleModeBIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragNotOriginBasedStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "scaleModeAIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlWebsiteButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "urlWebsiteIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlRateButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "urlRateIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlProButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "urlProIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconSplitSegment"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r1 = new org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r3)
            r1.<init>(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargeSplitStyle = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShortViewOptionsStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconViewOptions"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeViewOptionsStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconViewOptions"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r4)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyChildrenStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconCopyChildren"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r12)
            r0.imageUp = r1
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r1 = new org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.getDrawable(r3)
            r1.<init>(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargePasteStyle = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalUndoStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconUndo"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalRedoStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconRedo"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesNoneStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconShowNodesNone"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesDynamicStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconShowNodesDynamic"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesAllStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconShowNodesAll"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOnStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconDrawOrderOn"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOffStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconDrawOrderOff"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShareFilesStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconShareFiles"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteChildrenStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconDeleteChildren"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r5)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteChildrenStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconDeleteChildren"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r4)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPasteStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r12)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyChildrenStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconCopyChildren"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeUndoStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconUndo"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeApplyStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            r2 = r18
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeConnectorAddStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconConnectorAdd"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargePolyfillAddStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconPolyfillAdd"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalConnectorAddStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconConnectorAdd"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalPolyfillAddStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconPolyfillAdd"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeTestSmartStretchStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconTestSmartStretch"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentX = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconFlipSegmentX"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentY = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconFlipSegmentY"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureX = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconFlipFigureX"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureY = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconFlipFigureY"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeJoin = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "figureJoinIconNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeUnjoin = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "figureUnjoinIconNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyOneSegmentStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "copyOneSegmentIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonLongPressStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyOneSegmentStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "copyOneSegmentIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteOneSegmentStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "deleteOneSegmentIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonLongPressStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteOneSegmentStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "deleteOneSegmentIcon"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeAddStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r3 = "iconAddNew"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r3)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeFinishedStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonFinishedStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.saveButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconSave"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.saveLargeButtonStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconSave"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushForwardStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconPushForward"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushBackwardStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconPushBackward"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToFrontStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconSendToFront"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToBackStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconSendToBack"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushForwardStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconFigurePushForward"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushBackwardStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconFigurePushBackward"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuLeftStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconMenuLeft"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuRightStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r1 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r2 = "iconMenuRight"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.getDrawable(r2)
            r0.imageUp = r1
            return
    }

    public static void disposeStyles() {
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonLongPressStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonLongPressStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalDeleteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonLongPressStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeStickfigureButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeMovieclipButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeMagnifierButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeArrowsButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesAllButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesStaticButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesNoneButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowUpButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowDownButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortPlaySoundButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.shortDeleteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowUpButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowRightButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowDownButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowLeftButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.appSettingsButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.applyButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.cancelButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.cancelLargeButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.addButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageAngleSnapStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogListStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneNoKnobStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.windowStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.windowLabelStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.framesScrollPaneStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsLabelStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTitleLabelStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsSliderStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTouchpadStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.frameContextMenuWindowStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.contextMenuBackgroundDrawable = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.soundPreviewImageButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.zoomPlusButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.zoomMinusButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallPreviewButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallSpeakerButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.modifyBranchButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.autoCameraButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.cameraStickfigureLockButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.colorPickerSliderStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.addFrameButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.deleteFrameButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.playButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.stopButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.copyButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.pasteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.quickMenuTextButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.eyedropperButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.refreshButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallUnjoinImageButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.editButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallDeleteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.smallEditButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.filterClearButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteDeleteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteRemoveBackgroundButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomInButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomOutButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.spriteExpandButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.simpleShowHideCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.linkCheckboxStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragOriginBasedStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragNotOriginBasedStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlWebsiteButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlRateButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlProButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargeSplitStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShortViewOptionsStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeViewOptionsStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteChildrenStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyChildrenStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargePasteStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalUndoStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalRedoStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesNoneStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesDynamicStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesAllStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOnStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOffStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShareFilesStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteChildrenStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyChildrenStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPasteStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeApplyStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeUndoStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeConnectorAddStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargePolyfillAddStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalConnectorAddStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalPolyfillAddStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeTestSmartStretchStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentX = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentY = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureX = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureY = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyOneSegmentStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyOneSegmentStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteOneSegmentStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteOneSegmentStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeAddStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeFinishedStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonFinishedStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.saveButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.saveLargeButtonStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushForwardStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushBackwardStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToFrontStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToBackStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuLeftStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuRightStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushForwardStyle = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushBackwardStyle = r0
            com.badlogic.gdx.scenes.scene2d.ui.Skin r0 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            if (r0 == 0) goto L122
            r0.dispose()
        L122:
            return
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getAddButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.addButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getAddFrameButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.addFrameButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getAppSettingsButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.appSettingsButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getApplyButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.applyButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getAutoCameraButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.autoCameraButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getCameraStickfigureLockButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.cameraStickfigureLockButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getCancelButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.cancelButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getCancelLargeButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.cancelLargeButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getCheckBoxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.checkBoxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle getColorPickerSliderStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.colorPickerSliderStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.utils.Drawable getContextMenuBackgroundDrawable() {
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.contextMenuBackgroundDrawable
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getCopyButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.copyButtonStyle
            return r0
    }

    public static com.badlogic.gdx.graphics.Color getDefaultStageBGColor() {
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.defaultStageBGColor
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getDeleteFrameButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.deleteFrameButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle getDialogListStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogListStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle getDialogScrollPaneNoKnobStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneNoKnobStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle getDialogScrollPaneStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.dialogScrollPaneStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getEditButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.editButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getEyedropperButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.eyedropperButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getFilterClearButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.filterClearButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle getFrameContextMenuWindowStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.frameContextMenuWindowStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle getFramesScrollPaneStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.framesScrollPaneStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageAngleSnapStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageAngleSnapStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalCopyChildrenStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyChildrenStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalCopyOneSegmentStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyOneSegmentStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalCopyStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalCopyStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalDeleteChildrenStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteChildrenStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalDeleteOneSegmentStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteOneSegmentStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalDeleteStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalDeleteStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFigurePushBackwardStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushBackwardStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFigurePushForwardStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFigurePushForwardStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFlipFigureX() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureX
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFlipFigureY() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipFigureY
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFlipSegmentX() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentX
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalFlipSegmentY() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalFlipSegmentY
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalMenuLeftStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuLeftStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalMenuRightStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalMenuRightStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalPasteStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPasteStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalPushBackwardStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushBackwardStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalPushForwardStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalPushForwardStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalSendToBackStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToBackStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalSendToFrontStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalSendToFrontStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalShortDrawOrderOffStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOffStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalShortDrawOrderOnStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortDrawOrderOnStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalShortShowNodesAllStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesAllStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalShortShowNodesDynamicStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesDynamicStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageButtonNormalShortShowNodesNoneStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalShortShowNodesNoneStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonFinishedStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonFinishedStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeAddStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeAddStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeApplyStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeApplyStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeConnectorAddStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeConnectorAddStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeCopyChildrenStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyChildrenStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeCopyOneSegmentStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeCopyOneSegmentStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeDeleteChildrenStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteChildrenStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeDeleteOneSegmentStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeDeleteOneSegmentStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeFinishedStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeFinishedStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeJoin() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeJoin
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargePolyfillAddStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargePolyfillAddStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeShareFilesStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShareFilesStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeShortViewOptionsStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeShortViewOptionsStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeTestSmartStretchStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeTestSmartStretchStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeUndoStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeUndoStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeUnjoin() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeUnjoin
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonLargeViewOptionsStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonLargeViewOptionsStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonNormalConnectorAddStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalConnectorAddStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getImageTextButtonNormalPolyfillAddStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextButtonNormalPolyfillAddStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageTextButtonNormalRedoStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalRedoStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getImageTextButtonNormalUndoStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageButtonNormalUndoStyle
            return r0
    }

    public static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle getImageTextLongPressButtonLargePasteStyle() {
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargePasteStyle
            return r0
    }

    public static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle getImageTextLongPressButtonLargeSplitStyle() {
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.imageTextLongPressButtonLargeSplitStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getIncrementButtonSmallStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonSmallStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getIncrementButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.incrementButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeArrowsButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeArrowsButtonStyle
            return r0
    }

    public static org.fortheloss.sticknodes.TextButtonLongPress.TextButtonLongPressStyle getLargeButtonLongPressStyle() {
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonLongPressStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getLargeButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeButtonStyle
            return r0
    }

    public static org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle getLargeDeleteButtonLongPressStyle() {
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonLongPressStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeDeleteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeDeleteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeMagnifierButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeMagnifierButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeMovieclipButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeMovieclipButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeSpriteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeSpriteDragNotOriginBasedStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragNotOriginBasedStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeSpriteDragOriginBasedStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeSpriteDragOriginBasedStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeStickfigureButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeStickfigureButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeUrlProButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlProButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeUrlRateButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlRateButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeUrlWebsiteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeUrlWebsiteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeViewNodesAllButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesAllButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getLargeViewNodesNoneButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.largeViewNodesNoneButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getLinkCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.linkCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getMCModeLeaveAddCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveAddCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getMCModeLeaveEditCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.mcModeLeaveEditCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getModeCameraCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeCameraCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getModeNormalCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.modeNormalCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getModePanningCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.modePanningCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getModifyBranchButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.modifyBranchButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getNormalArrowDownButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowDownButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getNormalArrowLeftButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowLeftButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getNormalArrowRightButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowRightButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getNormalArrowUpButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalArrowUpButtonStyle
            return r0
    }

    public static org.fortheloss.sticknodes.TextButtonLongPress.TextButtonLongPressStyle getNormalButtonLongPressStyle() {
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonLongPressStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getNormalButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.normalButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getPasteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.pasteButtonStyle
            return r0
    }

    public static org.fortheloss.sticknodes.ImageButtonLongPress.ImageButtonLongPressStyle getPlayButtonLongPressStyle() {
            org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.playButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getQuickMenuTextButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.quickMenuTextButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getRadioCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.radioCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getRefreshButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.refreshButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getRoundLockButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.roundLockButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getSaveButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.saveButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getSaveLargeButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.saveLargeButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle getSelectBoxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.selectBoxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getShortDeleteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortDeleteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getShortJumpArrowDownButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowDownButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getShortJumpArrowUpButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortJumpArrowUpButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getShortLargeButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortLargeButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getShortPlaySoundButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.shortPlaySoundButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getSimpleShowHideCheckboxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.simpleShowHideCheckboxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSmallDeleteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.smallDeleteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSmallEditButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.smallEditButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSmallPreviewImageButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.smallPreviewButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getSmallShowHideCheckBoxStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.showHideCheckBoxStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSmallSpeakerImageButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.smallSpeakerButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSmallUnjoinImageButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.smallUnjoinImageButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSpriteDeleteButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteDeleteButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSpriteExpandButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteExpandButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle getSpriteLockButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteLockButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSpriteRemoveBackgroundButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteRemoveBackgroundButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSpriteZoomInButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomInButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getSpriteZoomOutButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.spriteZoomOutButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getStopButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.stopButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.utils.Drawable getTableGrayBackground() {
            com.badlogic.gdx.scenes.scene2d.ui.Skin r0 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r1 = "tableGrayBackground"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle getTextAreaAllLocalesStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaAllLocalesStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle getTextAreaStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.textAreaStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle getTextFieldStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.textFieldStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getToolsLabelStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.toolsLabelStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle getToolsSliderStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.toolsSliderStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getToolsTitleLabelStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.toolsTitleLabelStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.utils.Drawable getWhiteBackground() {
            com.badlogic.gdx.scenes.scene2d.ui.Skin r0 = org.fortheloss.sticknodes.animationscreen.modules.Module._skin
            java.lang.String r1 = "square"
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle getWindowLabelStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.windowLabelStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle getWindowStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.windowStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle getZoomMinusButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.zoomMinusButtonStyle
            return r0
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle getZoomPlusButtonStyle() {
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.zoomPlusButtonStyle
            return r0
    }

    protected void addWidgetClickListener() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.Module$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.Module$1
            r0.<init>(r1)
            r1.addCaptureListener(r0)
            return
    }

    protected void clearLastClickedWidget() {
            r1 = this;
            r0 = -1
            r1.mLastClickedWidgetId = r0
            return
    }

    public void dispose() {
            r1 = this;
            r0 = 0
            r1._fboRef = r0
            r1._animationScreenRef = r0
            r1.mCoordsForLastClickedWidget = r0
            r1.mCoordsForLastClickedWidgetNewPos = r0
            r1.clear()
            r1.remove()
            return
    }

    public void forceNextDraw() {
            r1 = this;
            r0 = 1
            r1._priorityNeedsToBeDrawn = r0
            return
    }

    public org.fortheloss.sticknodes.animationscreen.AnimationScreen getContext() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            return r0
    }

    protected float getWidgetPositionDifferenceY(com.badlogic.gdx.scenes.scene2d.Actor r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r4.getStage()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.badlogic.gdx.math.Vector2 r0 = r3.mCoordsForLastClickedWidgetNewPos
            float r2 = r4.getHeight()
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r0 = r3.mCoordsForLastClickedWidgetNewPos
            r4.localToStageCoordinates(r0)
            com.badlogic.gdx.math.Vector2 r4 = r3.mCoordsForLastClickedWidgetNewPos
            float r4 = r4.y
            com.badlogic.gdx.math.Vector2 r0 = r3.mCoordsForLastClickedWidget
            float r0 = r0.y
            float r4 = r4 - r0
            return r4
    }

    public void initialize(org.fortheloss.framework.Assets r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
            r1 = 0
            r0.setTransform(r1)
            return
    }

    protected void setLastClickedWidgetId(int r3, com.badlogic.gdx.scenes.scene2d.Actor r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r4.getStage()
            if (r0 != 0) goto L7
            return
        L7:
            r2.mLastClickedWidgetId = r3
            com.badlogic.gdx.math.Vector2 r3 = r2.mCoordsForLastClickedWidget
            r0 = 0
            float r1 = r4.getHeight()
            r3.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r2.mCoordsForLastClickedWidget
            r4.localToStageCoordinates(r3)
            return
    }

    public void setNeedsToBeDrawn() {
            r1 = this;
            r0 = 1
            r1._needsToBeDrawn = r0
            return
    }

    protected void snapScrollPaneToLastClickedWidget(org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3) {
            r2 = this;
            int r0 = r2.mLastClickedWidgetId
            r1 = -1
            if (r0 <= r1) goto L1a
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3.getWidgetWithId(r0)
            if (r0 == 0) goto L1a
            float r0 = r2.getWidgetPositionDifferenceY(r0)
            float r1 = r3.getScrollY()
            float r1 = r1 - r0
            r3.setScrollY(r1)
            r3.updateVisualScroll()
        L1a:
            return
    }
}
