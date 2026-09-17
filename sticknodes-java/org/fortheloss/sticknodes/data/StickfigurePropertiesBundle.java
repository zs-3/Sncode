package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class StickfigurePropertiesBundle implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.Color _color;
    private org.fortheloss.sticknodes.data.FigureFilterProperties _filterProperties;
    private boolean _isPersistentWhenTweening;
    private boolean _isTweeningColors;
    private int _joinsState;
    private org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] _nodeProperties;
    private boolean _pushJoinedStickfigures;
    private float _rotation;
    private float _scale;
    private boolean _scaleJoinedStickfigures;
    private boolean _setStateOfJoins;
    private int _stickfigureLayeringPosition;
    private int _stickfigureLibraryID;
    private java.lang.String _stickfigureName;
    private float _stickfigureX;
    private float _stickfigureY;
    private boolean _useJoinParentFilters;
    private float mJoinOffsetAngle;
    private byte mTweenMode;
    private boolean mVisibleInOnionSkin;

    public StickfigurePropertiesBundle(org.fortheloss.sticknodes.stickfigure.Stickfigure r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2._isPersistentWhenTweening = r0
            r2.mVisibleInOnionSkin = r0
            r1 = 0
            r2._isTweeningColors = r1
            r2.mTweenMode = r0
            r2._scaleJoinedStickfigures = r0
            r2._pushJoinedStickfigures = r0
            r2._setStateOfJoins = r1
            r2._joinsState = r1
            r2._useJoinParentFilters = r1
            r0 = 0
            r2.mJoinOffsetAngle = r0
            r1 = -1
            r2._stickfigureLayeringPosition = r1
            r2._stickfigureX = r0
            r2._stickfigureY = r0
            r2._scale = r0
            r2._rotation = r0
            r3.copyPropertiesBundle(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._stickfigureName = r0
            r3._color = r0
            org.fortheloss.sticknodes.data.FigureFilterProperties r1 = r3._filterProperties
            if (r1 == 0) goto Le
            r1.dispose()
            r3._filterProperties = r0
        Le:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1 = r3._nodeProperties
            if (r1 == 0) goto L23
            int r1 = r1.length
            int r1 = r1 + (-1)
        L15:
            if (r1 < 0) goto L21
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r2 = r3._nodeProperties
            r2 = r2[r1]
            r2.dispose()
            int r1 = r1 + (-1)
            goto L15
        L21:
            r3._nodeProperties = r0
        L23:
            return
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color
            return r0
    }

    public int getCopiedStickfigureLibraryID() {
            r1 = this;
            int r0 = r1._stickfigureLibraryID
            return r0
    }

    public java.lang.String getCopiedStickfigureName() {
            r1 = this;
            java.lang.String r0 = r1._stickfigureName
            return r0
    }

    public org.fortheloss.sticknodes.data.FigureFilterProperties getFilterProperties() {
            r1 = this;
            org.fortheloss.sticknodes.data.FigureFilterProperties r0 = r1._filterProperties
            return r0
    }

    public boolean getIsPersistentWhenTweening() {
            r1 = this;
            boolean r0 = r1._isPersistentWhenTweening
            return r0
    }

    public boolean getIsTweeningColors() {
            r1 = this;
            boolean r0 = r1._isTweeningColors
            return r0
    }

    public float getJoinOffsetAngle() {
            r1 = this;
            float r0 = r1.mJoinOffsetAngle
            return r0
    }

    public int getJoinsState() {
            r1 = this;
            int r0 = r1._joinsState
            return r0
    }

    public org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] getNodeProperties() {
            r1 = this;
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r0 = r1._nodeProperties
            return r0
    }

    public boolean getPushJoinedFigures() {
            r1 = this;
            boolean r0 = r1._pushJoinedStickfigures
            return r0
    }

    public float getRotation() {
            r1 = this;
            float r0 = r1._rotation
            return r0
    }

    public float getScale() {
            r1 = this;
            float r0 = r1._scale
            return r0
    }

    public boolean getScaleJoinedStickfigures() {
            r1 = this;
            boolean r0 = r1._scaleJoinedStickfigures
            return r0
    }

    public boolean getStateOfJoins() {
            r1 = this;
            boolean r0 = r1._setStateOfJoins
            return r0
    }

    public int getStickfigureLayeringPosition() {
            r1 = this;
            int r0 = r1._stickfigureLayeringPosition
            return r0
    }

    public byte getTweenMode() {
            r1 = this;
            byte r0 = r1.mTweenMode
            return r0
    }

    public boolean getUseJoinParentFilters() {
            r1 = this;
            boolean r0 = r1._useJoinParentFilters
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1._stickfigureX
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1._stickfigureY
            return r0
    }

    public boolean isVisibleInOnionSkin() {
            r1 = this;
            boolean r0 = r1.mVisibleInOnionSkin
            return r0
    }

    public void setColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._color
            if (r0 != 0) goto Lb
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r1._color = r0
        Lb:
            com.badlogic.gdx.graphics.Color r0 = r1._color
            r0.set(r2)
            return
    }

    public void setCopiedStickfigureLibraryID(int r1) {
            r0 = this;
            r0._stickfigureLibraryID = r1
            return
    }

    public void setCopiedStickfigureName(java.lang.String r1) {
            r0 = this;
            r0._stickfigureName = r1
            return
    }

    public void setFilterProperties(org.fortheloss.sticknodes.data.FigureFilterProperties r1) {
            r0 = this;
            r0._filterProperties = r1
            return
    }

    public void setIsPersistentWhenTweening(boolean r1) {
            r0 = this;
            r0._isPersistentWhenTweening = r1
            return
    }

    public void setIsTweeningColors(boolean r1) {
            r0 = this;
            r0._isTweeningColors = r1
            return
    }

    public void setIsVisibleInOnionSkin(boolean r1) {
            r0 = this;
            r0.mVisibleInOnionSkin = r1
            return
    }

    public void setJoinOffsetAngle(float r1) {
            r0 = this;
            r0.mJoinOffsetAngle = r1
            return
    }

    public void setJoinsState(int r1) {
            r0 = this;
            r0._joinsState = r1
            return
    }

    public void setNodeProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r1) {
            r0 = this;
            r0._nodeProperties = r1
            return
    }

    public void setPosition(float r1, float r2) {
            r0 = this;
            r0._stickfigureX = r1
            r0._stickfigureY = r2
            return
    }

    public void setPushJoinedFigures(boolean r1) {
            r0 = this;
            r0._pushJoinedStickfigures = r1
            return
    }

    public void setRotation(float r1) {
            r0 = this;
            r0._rotation = r1
            return
    }

    public void setScale(float r1) {
            r0 = this;
            r0._scale = r1
            return
    }

    public void setScaleJoinedStickfigures(boolean r1) {
            r0 = this;
            r0._scaleJoinedStickfigures = r1
            return
    }

    public void setStateOfJoins(boolean r1) {
            r0 = this;
            r0._setStateOfJoins = r1
            return
    }

    public void setStickfigureLayeringPosition(int r1) {
            r0 = this;
            r0._stickfigureLayeringPosition = r1
            return
    }

    public void setTweenMode(byte r1) {
            r0 = this;
            r0.mTweenMode = r1
            return
    }

    public void setUseJoinParentFilters(boolean r1) {
            r0 = this;
            r0._useJoinParentFilters = r1
            return
    }
}
