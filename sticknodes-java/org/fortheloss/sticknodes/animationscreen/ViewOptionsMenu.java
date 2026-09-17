package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class ViewOptionsMenu extends com.badlogic.gdx.scenes.scene2d.ui.Window implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _activeFigureNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _activeFigureNodesLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _animationModeTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _animationModeTableCell;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _arrowsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _arrowsTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _creationModeTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _creationModeTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterQualityHighButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterQualityLowButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterQualityMediumButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterShowingAllButBlurButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterShowingAllButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _filterShowingNoneButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filtersTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _filtersTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _guidesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _highlightNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _idPopupButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _joinedNNLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _neighborNodesButton;
    private org.fortheloss.framework.RepeatingTextButton _nextMinusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _nextOnionSkinFramesLabel;
    private org.fortheloss.framework.RepeatingTextButton _nextPlusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _nnAffectedByJoinsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _onionSkinInBackButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _onionSkinInFrontButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _onionSkinTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _onionSkinTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _onlyMainNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _onlyMainNodesCreationButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _outlineButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _popupIdTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _popupIdTableCell;
    private org.fortheloss.framework.RepeatingTextButton _prevMinusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _prevOnionSkinFramesLabel;
    private org.fortheloss.framework.RepeatingTextButton _prevPlusButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qrtDockedButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qrtNoneButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qrtOriginalButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _quickMenuButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _showArrowsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showDrawOrderButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _showMagnifierButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showStaticNodesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showZoomButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _stageBoxButton;
    private com.badlogic.gdx.scenes.scene2d.InputListener _stageListener;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _table;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _viewIDsButton;






































    /* renamed from: -$$Nest$fget_animationScreenRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen m305$$Nest$fget_animationScreenRef(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0._animationScreenRef
            return r0
    }

    /* renamed from: -$$Nest$fget_onlyMainNodesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m306$$Nest$fget_onlyMainNodesButton(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._onlyMainNodesButton
            return r0
    }

    /* renamed from: -$$Nest$fget_onlyMainNodesCreationButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m307$$Nest$fget_onlyMainNodesCreationButton(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._onlyMainNodesCreationButton
            return r0
    }

    /* renamed from: -$$Nest$fget_showDrawOrderButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m308$$Nest$fget_showDrawOrderButton(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showDrawOrderButton
            return r0
    }

    /* renamed from: -$$Nest$fget_showStaticNodesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m309$$Nest$fget_showStaticNodesButton(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showStaticNodesButton
            return r0
    }

    /* renamed from: -$$Nest$monFilterQualitySelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m310$$Nest$monFilterQualitySelection(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0, int r1) {
            r0.onFilterQualitySelection(r1)
            return
    }

    /* renamed from: -$$Nest$monIncrementNumNextOnionSkinFrames, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m311$$Nest$monIncrementNumNextOnionSkinFrames(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0, int r1) {
            r0.onIncrementNumNextOnionSkinFrames(r1)
            return
    }

    /* renamed from: -$$Nest$monIncrementNumPrevOnionSkinFrames, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m312$$Nest$monIncrementNumPrevOnionSkinFrames(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0, int r1) {
            r0.onIncrementNumPrevOnionSkinFrames(r1)
            return
    }

    /* renamed from: -$$Nest$monNeighborNodesAffectedByJoinsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m313$$Nest$monNeighborNodesAffectedByJoinsClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onNeighborNodesAffectedByJoinsClick()
            return
    }

    /* renamed from: -$$Nest$monOnionSkinFrontOrBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m314$$Nest$monOnionSkinFrontOrBackClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onOnionSkinFrontOrBackClick()
            return
    }

    /* renamed from: -$$Nest$monOnlyMainNodesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m315$$Nest$monOnlyMainNodesClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0, boolean r1) {
            r0.onOnlyMainNodesClick(r1)
            return
    }

    /* renamed from: -$$Nest$monShowAllNodesOfActiveFigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m316$$Nest$monShowAllNodesOfActiveFigureClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowAllNodesOfActiveFigureClick()
            return
    }

    /* renamed from: -$$Nest$monShowArrowsButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m317$$Nest$monShowArrowsButtonClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowArrowsButtonClick()
            return
    }

    /* renamed from: -$$Nest$monShowFiltersSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m318$$Nest$monShowFiltersSelection(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0, int r1) {
            r0.onShowFiltersSelection(r1)
            return
    }

    /* renamed from: -$$Nest$monShowGuidesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m319$$Nest$monShowGuidesClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowGuidesClick()
            return
    }

    /* renamed from: -$$Nest$monShowIdPopupClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m320$$Nest$monShowIdPopupClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowIdPopupClick()
            return
    }

    /* renamed from: -$$Nest$monShowMagnifierButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m321$$Nest$monShowMagnifierButtonClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowMagnifierButtonClick()
            return
    }

    /* renamed from: -$$Nest$monShowNeighborNodesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m322$$Nest$monShowNeighborNodesClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowNeighborNodesClick()
            return
    }

    /* renamed from: -$$Nest$monShowOutlineClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m323$$Nest$monShowOutlineClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowOutlineClick()
            return
    }

    /* renamed from: -$$Nest$monShowQuickMenuClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m324$$Nest$monShowQuickMenuClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowQuickMenuClick()
            return
    }

    /* renamed from: -$$Nest$monShowQuickResizeToolClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m325$$Nest$monShowQuickResizeToolClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowQuickResizeToolClick()
            return
    }

    /* renamed from: -$$Nest$monShowStageBoxClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m326$$Nest$monShowStageBoxClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowStageBoxClick()
            return
    }

    /* renamed from: -$$Nest$monShowZoomButtonsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m327$$Nest$monShowZoomButtonsClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onShowZoomButtonsClick()
            return
    }

    /* renamed from: -$$Nest$monViewFigureIDsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m328$$Nest$monViewFigureIDsClick(org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu r0) {
            r0.onViewFigureIDsClick()
            return
    }

    public ViewOptionsMenu(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r3)
            r1._animationScreenRef = r2
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            r1._sessionDataRef = r2
            return
    }

    private void onFilterQualitySelection(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setFilterQuality(r2)
            return
    }

    private void onIncrementNumNextOnionSkinFrames(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._nextOnionSkinFramesLabel
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L11
        Lf:
            r0 = 0
            goto L23
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._nextOnionSkinFramesLabel     // Catch: java.lang.NumberFormatException -> Lf
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> Lf
        L23:
            int r0 = r0 + r3
            if (r0 > 0) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._nextOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
            goto L4f
        L38:
            r3 = 3
            if (r0 <= r3) goto L3d
            r1 = 3
            goto L3e
        L3d:
            r1 = r0
        L3e:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._nextOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
        L4f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.setNumNextOnionSkinFrames(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._nextOnionSkinFramesLabel
            r3.setText(r1)
            return
    }

    private void onIncrementNumPrevOnionSkinFrames(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._prevOnionSkinFramesLabel
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L11
        Lf:
            r0 = 0
            goto L23
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._prevOnionSkinFramesLabel     // Catch: java.lang.NumberFormatException -> Lf
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> Lf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> Lf
        L23:
            int r0 = r0 + r3
            if (r0 > 0) goto L38
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._prevOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
            goto L4f
        L38:
            r3 = 3
            if (r0 <= r3) goto L3d
            r1 = 3
            goto L3e
        L3d:
            r1 = r0
        L3e:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._prevOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.set(r0)
        L4f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.setNumPrevOnionSkinFrames(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._prevOnionSkinFramesLabel
            r3.setText(r1)
            return
    }

    private void onNeighborNodesAffectedByJoinsClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._nnAffectedByJoinsButton
            boolean r1 = r1.isChecked()
            r0.setNeighborNodesAffectedByJoins(r1)
            return
    }

    private void onOnionSkinFrontOrBackClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._onionSkinInFrontButton
            boolean r1 = r1.isChecked()
            r0.setOnionSkinInFront(r1)
            return
    }

    private void onOnlyMainNodesClick(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.setDrawOnlyMainNodes(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r3 = r3.getSessionData()
            boolean r3 = r3.getIsOnlyDrawingMainNodes()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L25
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._activeFigureNodesLabel
            r3.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._activeFigureNodesButton
            r3.setColor(r0, r0, r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._activeFigureNodesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r0)
            goto L38
        L25:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._activeFigureNodesLabel
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.setColor(r0, r0, r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._activeFigureNodesButton
            r3.setColor(r0, r0, r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._activeFigureNodesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r0)
        L38:
            return
    }

    private void onShowAllNodesOfActiveFigureClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._activeFigureNodesButton
            boolean r1 = r1.isChecked()
            r0.setDrawAllNodesOfSelectedFigure(r1)
            return
    }

    private void onShowArrowsButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showArrows()
            return
    }

    private void onShowFiltersSelection(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setShowFilters(r2)
            return
    }

    private void onShowGuidesClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._guidesButton
            boolean r1 = r1.isChecked()
            r0.setShowGuides(r1)
            return
    }

    private void onShowIdPopupClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._idPopupButton
            boolean r1 = r1.isChecked()
            r0.setShowIdPopup(r1)
            return
    }

    private void onShowMagnifierButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showMagnifier()
            return
    }

    private void onShowNeighborNodesClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r3._neighborNodesButton
            boolean r1 = r1.isChecked()
            r0.setShowNeighborNodes(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getIsShowingNeighborNodes()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L2b
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3._joinedNNLabel
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._nnAffectedByJoinsButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._nnAffectedByJoinsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            goto L3e
        L2b:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3._joinedNNLabel
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._nnAffectedByJoinsButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r3._nnAffectedByJoinsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
        L3e:
            return
    }

    private void onShowOutlineClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._outlineButton
            boolean r1 = r1.isChecked()
            r0.setShowOutline(r1)
            return
    }

    private void onShowQuickMenuClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._quickMenuButton
            boolean r1 = r1.isChecked()
            r0.setQuickMenuEnabled(r1)
            return
    }

    private void onShowQuickResizeToolClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._qrtOriginalButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto La
            r0 = 1
            goto L15
        La:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._qrtDockedButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L14
            r0 = 2
            goto L15
        L14:
            r0 = 0
        L15:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.setShowQuickResizeTool(r0)
            return
    }

    private void onShowStageBoxClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._stageBoxButton
            boolean r1 = r1.isChecked()
            r0.setShowStageBox(r1)
            return
    }

    private void onShowZoomButtonsClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._showZoomButton
            boolean r1 = r1.isChecked()
            r0.showZoomButtons(r1)
            return
    }

    private void onViewFigureIDsClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._viewIDsButton
            boolean r1 = r1.isChecked()
            r0.setShowFigureIDs(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r5 = this;
            r0 = 1
            r5.hide(r0)
            r1 = 0
            r5._stageListener = r1
            r5._animationScreenRef = r1
            r5._sessionDataRef = r1
            r5._table = r1
            r5._onlyMainNodesButton = r1
            r5._activeFigureNodesButton = r1
            r5._viewIDsButton = r1
            r5._onlyMainNodesCreationButton = r1
            r5._showStaticNodesButton = r1
            r5._showDrawOrderButton = r1
            r5._highlightNodesButton = r1
            r5._outlineButton = r1
            r5._neighborNodesButton = r1
            r5._quickMenuButton = r1
            r5._showZoomButton = r1
            r5._idPopupButton = r1
            r5._guidesButton = r1
            r5._joinedNNLabel = r1
            r5._activeFigureNodesLabel = r1
            r5._stageBoxButton = r1
            r5._nnAffectedByJoinsButton = r1
            r5._filterQualityLowButton = r1
            r5._filterQualityMediumButton = r1
            r5._filterQualityHighButton = r1
            r5._filterShowingNoneButton = r1
            r5._filterShowingAllButBlurButton = r1
            r5._filterShowingAllButton = r1
            r5._prevOnionSkinFramesLabel = r1
            r5._nextOnionSkinFramesLabel = r1
            r5._onionSkinInBackButton = r1
            r5._onionSkinInFrontButton = r1
            r5._qrtNoneButton = r1
            r5._qrtOriginalButton = r1
            r5._qrtDockedButton = r1
            r5._prevMinusButton = r1
            r5._prevPlusButton = r1
            r5._nextMinusButton = r1
            r5._nextPlusButton = r1
            r5._showMagnifierButton = r1
            r5._showArrowsButton = r1
            r5._arrowsTableCell = r1
            r5._onionSkinTableCell = r1
            r5._animationModeTableCell = r1
            r5._creationModeTableCell = r1
            r5._popupIdTableCell = r1
            r5._filtersTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._arrowsTable
            if (r2 == 0) goto L82
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        L6c:
            if (r3 < 0) goto L80
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 == 0) goto L7d
            r4.clear()
        L7d:
            int r3 = r3 + (-1)
            goto L6c
        L80:
            r5._arrowsTable = r1
        L82:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._onionSkinTable
            if (r2 == 0) goto La3
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        L8d:
            if (r3 < 0) goto La1
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 == 0) goto L9e
            r4.clear()
        L9e:
            int r3 = r3 + (-1)
            goto L8d
        La1:
            r5._onionSkinTable = r1
        La3:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._animationModeTable
            if (r2 == 0) goto Lc4
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        Lae:
            if (r3 < 0) goto Lc2
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 == 0) goto Lbf
            r4.clear()
        Lbf:
            int r3 = r3 + (-1)
            goto Lae
        Lc2:
            r5._animationModeTable = r1
        Lc4:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._creationModeTable
            if (r2 == 0) goto Le5
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        Lcf:
            if (r3 < 0) goto Le3
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 == 0) goto Le0
            r4.clear()
        Le0:
            int r3 = r3 + (-1)
            goto Lcf
        Le3:
            r5._creationModeTable = r1
        Le5:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._popupIdTable
            if (r2 == 0) goto L106
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        Lf0:
            if (r3 < 0) goto L104
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 == 0) goto L101
            r4.clear()
        L101:
            int r3 = r3 + (-1)
            goto Lf0
        L104:
            r5._popupIdTable = r1
        L106:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r5._filtersTable
            if (r2 == 0) goto L127
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        L111:
            if (r3 < 0) goto L125
            java.lang.Object r0 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 == 0) goto L122
            r0.clear()
        L122:
            int r3 = r3 + (-1)
            goto L111
        L125:
            r5._filtersTable = r1
        L127:
            r5._scrollPane = r1
            r5.clear()
            return
    }

    public void hide(boolean r4) {
            r3 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            boolean r1 = r1.getPreserveSelectionWhenChangingFrames()
            java.lang.String r2 = "preserveSelectionWhenChangingFrames"
            r0.putBoolean(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            short r1 = r1.getIsShowingQuickResizeTool()
            java.lang.String r2 = "quickResizeToolsMode"
            r0.putInteger(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            boolean r1 = r1.getNeighborNodesAffectedByJoins()
            java.lang.String r2 = "neighborNodesAffectedByJoins"
            r0.putBoolean(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            boolean r1 = r1.getQuickMenuIsEnabled()
            java.lang.String r2 = "quickMenuEnabled"
            r0.putBoolean(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            boolean r1 = r1.getIsShowingIdPopup()
            java.lang.String r2 = "idPopupEnabled"
            r0.putBoolean(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            boolean r1 = r1.getIsShowingZoomButtons()
            java.lang.String r2 = "showZoomButtons"
            r0.putBoolean(r2, r1)
            r0.flush()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.getStage()
            if (r0 == 0) goto L75
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.getStage()
            com.badlogic.gdx.scenes.scene2d.InputListener r1 = r3._stageListener
            r0.removeListener(r1)
            if (r4 != 0) goto L72
            r4 = 0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r4, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r0)
            r3.addAction(r4)
            goto L75
        L72:
            r3.remove()
        L75:
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r14, com.badlogic.gdx.scenes.scene2d.Stage r15) {
            r13 = this;
            r0 = 0
            r13.setKeepWithinStage(r0)
            r13.setModal(r0)
            r13.setMovable(r0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1139146752(0x43e60000, float:460.0)
            float r1 = r1 * r2
            float r15 = r15.getHeight()
            r13.setSize(r1, r15)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._table = r1
            r2 = 2
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            float r3 = r13.getWidth()
            r1.setWidth(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r15
            r1.pad(r4, r3, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r1.<init>(r5, r6)
            r13._scrollPane = r1
            r1.setFadeScrollBars(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r13._scrollPane
            r1.setScrollbarsOnTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r13._scrollPane
            r5 = 1
            r1.setScrollingDisabled(r5, r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r13._scrollPane
            float r6 = r13.getWidth()
            float r7 = r13.getHeight()
            r1.setSize(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r13._scrollPane
            r13.addActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._animationModeTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r13._animationModeTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showOnlyMainNodes"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r7, r8)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r7 = (float) r7
            r1.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._onlyMainNodesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$1 r7 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$1
            r7.<init>(r13)
            r1.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._onlyMainNodesButton
            r1.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "showAllNodesOfActiveFigure"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r7, r8)
            r13._activeFigureNodesLabel = r1
            r1.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r13._activeFigureNodesLabel
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r13._activeFigureNodesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r7 = (float) r7
            r1.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._activeFigureNodesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$2 r7 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$2
            r7.<init>(r13)
            r1.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._activeFigureNodesButton
            r1.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "showFigureIDs"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r7, r8)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r7 = (float) r7
            r1.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._viewIDsButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$3 r7 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$3
            r7.<init>(r13)
            r1.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._viewIDsButton
            r1.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r8 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r14.findRegion(r8)
            r7.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r7)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._animationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._creationModeTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r13._creationModeTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r7)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._onlyMainNodesCreationButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$4 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$4
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._onlyMainNodesCreationButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showStaticNodesNew"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r7)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._showStaticNodesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$5 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$5
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._showStaticNodesButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showDrawOrderNew"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r7)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._showDrawOrderButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$6 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$6
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._showDrawOrderButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            java.lang.String r6 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r6, r1)
            r13._highlightNodesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$7 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$7
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r13._highlightNodesButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r14.findRegion(r8)
            r6.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r6)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._creationModeTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r3)
            r6.expandX()
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r2)
            r6.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            r6.row()
            java.lang.String r6 = "quickToolsTitle"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r7 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r7)
            r6.fillX()
            r1.row()
            java.lang.String r6 = "quickTools1"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "quickTools2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "quickTools3"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._qrtNoneButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$8 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$8
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._qrtOriginalButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$9 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$9
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._qrtDockedButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$10 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$10
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r9 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r7]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._qrtNoneButton
            r9[r0] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._qrtOriginalButton
            r9[r5] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._qrtDockedButton
            r9[r2] = r10
            r6.<init>(r9)
            r6.setMaxCheckCount(r5)
            r6.setMinCheckCount(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._qrtNoneButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._qrtOriginalButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._qrtDockedButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            r1.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r14.findRegion(r8)
            r6.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r6)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "outlineSelection"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._outlineButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$11 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$11
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._outlineButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "neighborNodes"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._neighborNodesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$12 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$12
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._neighborNodesButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showJoinedNN"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r13._joinedNNLabel = r1
            r1.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r13._joinedNNLabel
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r13._joinedNNLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._nnAffectedByJoinsButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$13 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$13
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._nnAffectedByJoinsButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showQuickMenu"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._quickMenuButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$14 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$14
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._quickMenuButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showZoomButtons2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._showZoomButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$15 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$15
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._showZoomButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._popupIdTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._popupIdTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._popupIdTable
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._popupIdTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r13._popupIdTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showIdPopup"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._popupIdTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._idPopupButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$16 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$16
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._popupIdTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._idPopupButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._popupIdTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showGuides"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._guidesButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$17 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$17
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._guidesButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r6 = "showStageBox"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r6, r9)
            r1.setWrap(r5)
            r1.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r6 = (float) r6
            r1.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r13._stageBoxButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$18 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$18
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._stageBoxButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r14.findRegion(r8)
            r6.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r6)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._filtersTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r13._filtersTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            java.lang.String r1 = "showFilters"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            r6.row()
            java.lang.String r6 = "none"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "noBlur"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "all"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterShowingNoneButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$19 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$19
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterShowingAllButBlurButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$20 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$20
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterShowingAllButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$21 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$21
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r9 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r7]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._filterShowingNoneButton
            r9[r0] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._filterShowingAllButBlurButton
            r9[r5] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r13._filterShowingAllButton
            r9[r2] = r10
            r6.<init>(r9)
            r6.setMaxCheckCount(r5)
            r6.setMinCheckCount(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterShowingNoneButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterShowingAllButBlurButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterShowingAllButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            r1.align(r5)
            java.lang.String r1 = "filterQuality"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._filtersTable
            r6.row()
            java.lang.String r6 = "low"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "medium"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            java.lang.String r6 = "high"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterQualityLowButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$22 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$22
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterQualityMediumButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$23 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$23
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r6)
            r13._filterQualityHighButton = r6
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$24 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$24
            r9.<init>(r13)
            r6.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r7 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r7]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._filterQualityLowButton
            r7[r0] = r9
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._filterQualityMediumButton
            r7[r5] = r9
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r13._filterQualityHighButton
            r7[r2] = r9
            r6.<init>(r7)
            r6.setMaxCheckCount(r5)
            r6.setMinCheckCount(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterQualityLowButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterQualityMediumButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r1.add(r6)
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._filterQualityHighButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            r1.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r14.findRegion(r8)
            r6.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r6)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._filtersTable
            r1.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L8c9
            java.lang.String r1 = "magnifierInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
        L8c9:
            java.lang.String r1 = "showMagnifier"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeMagnifierButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r6)
            r13._showMagnifierButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$25 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$25
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r13._showMagnifierButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._arrowsTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r3)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            r1.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._arrowsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r13._arrowsTableCell = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._table
            r1.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L965
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r14.findRegion(r8)
            r6.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r6)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            r1.row()
        L965:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L989
            java.lang.String r1 = "arrowsInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r13._arrowsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            r1.row()
        L989:
            java.lang.String r1 = "showArrows"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeArrowsButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r6)
            r13._showArrowsButton = r1
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$26 r6 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$26
            r6.<init>(r13)
            r1.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._arrowsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r13._showArrowsButton
            r1.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r13._onionSkinTable = r1
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r1.spaceBottom(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.pad(r3)
            r15.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            r15.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._table
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.fillX()
            r13._onionSkinTableCell = r15
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r14 = r14.findRegion(r8)
            r1.<init>(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r2)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padTop(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.padBottom(r15)
            r14.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r14 = r14.getSessionData()
            boolean r14 = r14.getNerdModeEnabled()
            if (r14 != 0) goto La43
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "onionSkinLagWarning"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r15, r1)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r14)
            float r15 = r13.getWidth()
            float r15 = r15 - r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.width(r15)
            r14.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
        La43:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "numPrevOnionSkinFrames"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r15, r1)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r14)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            r14.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r15.<init>(r1)
            java.lang.String r1 = "1"
            r14.<init>(r1, r15)
            r13._prevOnionSkinFramesLabel = r14
            r14.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._prevOnionSkinFramesLabel
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = r13._prevOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r15)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            r14.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$27 r14 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$27
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r6 = "-"
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            r14.<init>(r13, r6, r15, r7)
            r13._prevMinusButton = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r14.getLabel()
            r14.setWrap(r5)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._prevMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = r14.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.getCell(r15)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1082130432(0x40800000, float:4.0)
            float r9 = r15 * r8
            float r15 = r15 * r8
            r14.pad(r3, r9, r3, r15)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._prevMinusButton
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$28 r15 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$28
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            org.fortheloss.framework.RepeatingTextButton r15 = r13._prevMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r15)
            r15 = 16
            r14.align(r15)
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$29 r14 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$29
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r10 = "+"
            r14.<init>(r13, r10, r9, r7)
            r13._prevPlusButton = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r14.getLabel()
            r14.setWrap(r5)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._prevPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r14.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.getCell(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r9 * r8
            float r9 = r9 * r8
            r14.pad(r3, r11, r3, r9)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._prevPlusButton
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$30 r9 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$30
            r9.<init>(r13)
            r14.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            org.fortheloss.framework.RepeatingTextButton r9 = r13._prevPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r9)
            r9 = 8
            r14.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "numNextOnionSkinFrames"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r11, r12)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r11.add(r14)
            int r11 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r11 = (float) r11
            r14.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r12)
            r14.<init>(r1, r11)
            r13._nextOnionSkinFramesLabel = r14
            r14.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._nextOnionSkinFramesLabel
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r13._nextOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            r14.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$31 r14 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$31
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r14.<init>(r13, r6, r1, r7)
            r13._nextMinusButton = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r14.getLabel()
            r14.setWrap(r5)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._nextMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r14.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r1 * r8
            float r1 = r1 * r8
            r14.pad(r3, r6, r3, r1)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._nextMinusButton
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$32 r1 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$32
            r1.<init>(r13)
            r14.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            org.fortheloss.framework.RepeatingTextButton r1 = r13._nextMinusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r1)
            r14.align(r15)
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$33 r14 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$33
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            r14.<init>(r13, r10, r15, r7)
            r13._nextPlusButton = r14
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r14.getLabel()
            r14.setWrap(r5)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._nextPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = r14.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.getCell(r15)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r15 * r8
            float r15 = r15 * r8
            r14.pad(r3, r1, r3, r15)
            org.fortheloss.framework.RepeatingTextButton r14 = r13._nextPlusButton
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$34 r15 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$34
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            org.fortheloss.framework.RepeatingTextButton r15 = r13._nextPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.add(r15)
            r14.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r14 = r14.getSessionData()
            boolean r14 = r14.getNerdModeEnabled()
            if (r14 != 0) goto Lc1c
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "txtOnionSkin"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r15, r1)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r14)
            float r15 = r13.getWidth()
            float r15 = r15 - r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.width(r15)
            r14.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
        Lc1c:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "showBack"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r15, r1)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r14)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            r14.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "showFront"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r14.<init>(r15, r1)
            r14.setWrap(r5)
            r14.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r15 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r15.add(r14)
            int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r15 = (float) r15
            r14.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            r14.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
            r13._onionSkinInBackButton = r14
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$35 r15 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$35
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = r13._onionSkinInBackButton
            r14.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
            r13._onionSkinInFrontButton = r14
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$36 r15 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$36
            r15.<init>(r13)
            r14.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13._onionSkinTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = r13._onionSkinInFrontButton
            r14.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r14 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r2]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r13._onionSkinInBackButton
            r15[r0] = r1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r13._onionSkinInFrontButton
            r15[r5] = r0
            r14.<init>(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = r13._onionSkinInFrontButton
            r14.setChecked(r5)
            return
    }

    public void show(com.badlogic.gdx.scenes.scene2d.Stage r4, float r5, float r6) {
            r3 = this;
            int r5 = (int) r5
            float r5 = (float) r5
            float r0 = r3.getHeight()
            float r6 = r6 - r0
            int r6 = (int) r6
            float r6 = (float) r6
            r3.setPosition(r5, r6)
            com.badlogic.gdx.scenes.scene2d.InputListener r5 = r3._stageListener
            if (r5 != 0) goto L17
            org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$37 r5 = new org.fortheloss.sticknodes.animationscreen.ViewOptionsMenu$37
            r5.<init>(r3)
            r3._stageListener = r5
        L17:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r3.setColor(r5, r5, r5, r6)
            r4.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r3._stageListener
            r4.addListener(r0)
            r4 = 1109393408(0x42200000, float:40.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r4
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r5, r0)
            r1 = -1038090240(0xffffffffc2200000, float:-40.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            com.badlogic.gdx.math.Interpolation$ExpOut r1 = com.badlogic.gdx.math.Interpolation.exp10Out
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r6 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r6, r2, r0, r1)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r5 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r5, r6)
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r5)
            r3.addAction(r4)
            r3.updateTexts()
            return
    }

    public void updateTexts() {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._onlyMainNodesButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsOnlyDrawingMainNodes()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._activeFigureNodesButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getAlwaysShowCurrentFigureNodes()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._viewIDsButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingFigureIDs()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._onlyMainNodesCreationButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsOnlyDrawingMainNodes()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._showStaticNodesButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingCreationStaticNodes()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._showDrawOrderButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingCreationDrawOrder()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._showZoomButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingZoomButtons()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._outlineButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingOutline()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._neighborNodesButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingNeighborNodes()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._nnAffectedByJoinsButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getNeighborNodesAffectedByJoins()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._qrtNoneButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            short r1 = r1.getIsShowingQuickResizeTool()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L7c
            r1 = 1
            goto L7d
        L7c:
            r1 = 0
        L7d:
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._qrtOriginalButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            short r1 = r1.getIsShowingQuickResizeTool()
            if (r1 != r3) goto L8c
            r1 = 1
            goto L8d
        L8c:
            r1 = 0
        L8d:
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._qrtDockedButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            short r1 = r1.getIsShowingQuickResizeTool()
            r4 = 2
            if (r1 != r4) goto L9c
            r2 = 1
        L9c:
            r0.setChecked(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._quickMenuButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getQuickMenuIsEnabled()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._idPopupButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingIdPopup()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._guidesButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingGuides()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._stageBoxButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsShowingStageBox()
            r0.setChecked(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsOnlyDrawingMainNodes()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Le9
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._activeFigureNodesLabel
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._activeFigureNodesButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._activeFigureNodesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r5)
            goto Lfa
        Le9:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._activeFigureNodesLabel
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._activeFigureNodesButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._activeFigureNodesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r5)
        Lfa:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsShowingNeighborNodes()
            if (r0 == 0) goto L114
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._joinedNNLabel
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._nnAffectedByJoinsButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._nnAffectedByJoinsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r5)
            goto L125
        L114:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._joinedNNLabel
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._nnAffectedByJoinsButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._nnAffectedByJoinsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r5)
        L125:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            short r0 = r0.getNodeHighlightMode()
            if (r0 != 0) goto L139
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._highlightNodesButton
            java.lang.String r5 = "nodeHighlight1"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r0.setText(r5)
            goto L160
        L139:
            if (r0 != r3) goto L147
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._highlightNodesButton
            java.lang.String r5 = "nodeHighlight2"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r0.setText(r5)
            goto L160
        L147:
            if (r0 != r4) goto L155
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._highlightNodesButton
            java.lang.String r5 = "nodeHighlight3"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r0.setText(r5)
            goto L160
        L155:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._highlightNodesButton
            java.lang.String r5 = "nodeHighlight4"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r0.setText(r5)
        L160:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsMagnifierVisible()
            if (r0 == 0) goto L175
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showMagnifierButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showMagnifierButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r5)
            goto L181
        L175:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showMagnifierButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showMagnifierButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r5)
        L181:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            boolean r0 = r0.getIsArrowsVisible()
            if (r0 == 0) goto L196
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showArrowsButton
            r0.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showArrowsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            goto L1a2
        L196:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showArrowsButton
            r0.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r6._showArrowsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
        L1a2:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getFiltersQuality()
            if (r0 != r3) goto L1b0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterQualityLowButton
            r0.setChecked(r3)
            goto L1c3
        L1b0:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getFiltersQuality()
            if (r0 != r4) goto L1be
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterQualityMediumButton
            r0.setChecked(r3)
            goto L1c3
        L1be:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterQualityHighButton
            r0.setChecked(r3)
        L1c3:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getFilterShowingState()
            if (r0 != 0) goto L1d1
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterShowingNoneButton
            r0.setChecked(r3)
            goto L1e4
        L1d1:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getFilterShowingState()
            if (r0 != r3) goto L1df
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterShowingAllButBlurButton
            r0.setChecked(r3)
            goto L1e4
        L1df:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._filterShowingAllButton
            r0.setChecked(r3)
        L1e4:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._prevOnionSkinFramesLabel
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getNumPrevOnionSkinFrames()
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._nextOnionSkinFramesLabel
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            int r1 = r1.getNumNextOnionSkinFrames()
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._onionSkinInBackButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsNormalOnionSkin()
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._onionSkinInFrontButton
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getIsNormalOnionSkin()
            r1 = r1 ^ r3
            r0.setChecked(r1)
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getNumPrevOnionSkinFrames()
            if (r0 != 0) goto L22b
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._prevOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
            goto L23c
        L22b:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._prevOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
        L23c:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getNumNextOnionSkinFrames()
            if (r0 != 0) goto L256
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._nextOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
            goto L267
        L256:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._nextOnionSkinFramesLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r0.set(r1)
        L267:
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != r3) goto L290
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._animationModeTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._creationModeTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._creationModeTable
            r0.setActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._arrowsTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._onionSkinTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._popupIdTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._filtersTableCell
            r0.clearActor()
            goto L2b8
        L290:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._animationModeTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._animationModeTable
            r0.setActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._creationModeTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._arrowsTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._arrowsTable
            r0.setActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._onionSkinTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._onionSkinTable
            r0.setActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._popupIdTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._popupIdTable
            r0.setActor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._filtersTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r6._filtersTable
            r0.setActor(r1)
        L2b8:
            return
    }
}
