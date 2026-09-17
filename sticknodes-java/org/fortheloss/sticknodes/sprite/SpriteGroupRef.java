package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public class SpriteGroupRef extends org.fortheloss.sticknodes.sprite.SpriteRef implements org.fortheloss.sticknodes.sprite.IStatefigure {
    private org.fortheloss.sticknodes.sprite.SpriteGroupSource mSpriteGroupSourceRef;
    private int mStateIndex;
    private boolean mStateIsControlled;

    public SpriteGroupRef() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStateIndex = r0
            r1.mStateIsControlled = r0
            return
    }

    public SpriteGroupRef(org.fortheloss.sticknodes.sprite.SpriteGroupRef r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mStateIndex = r0
            r1.mStateIsControlled = r0
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r2.mSpriteGroupSourceRef
            r1.mSpriteGroupSourceRef = r0
            int r0 = r2.mStateIndex
            r1.mStateIndex = r0
            boolean r2 = r2.mStateIsControlled
            r1.mStateIsControlled = r2
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mSpriteGroupSourceRef = r0
            super.dispose()
            return
    }

    public boolean getIsStateControlled() {
            r1 = this;
            boolean r0 = r1.mStateIsControlled
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public int getLibraryID() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            int r0 = r0.getLibraryId()
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public java.lang.String getName() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getNumStates() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            int r0 = r0.getNumStates()
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef
    public byte[] getPixels() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void getPositionalData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            super.getPositionalData(r2)
            int r0 = r1.mStateIndex
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef
    public void getProperties(org.fortheloss.sticknodes.data.useractions.SpriteProperties r2) {
            r1 = this;
            super.getProperties(r2)
            boolean r0 = r1.mStateIsControlled
            r2.stateIsControlled = r0
            int r0 = r1.mStateIndex
            r2.stateIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef
    protected org.fortheloss.sticknodes.sprite.SpriteSource getSpriteSource() {
            r2 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r2.mSpriteGroupSourceRef
            int r1 = r2.mStateIndex
            org.fortheloss.sticknodes.sprite.SpriteSource r0 = r0.getSpriteSource(r1)
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteSource getSpriteSourceAtState(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            org.fortheloss.sticknodes.sprite.SpriteSource r2 = r0.getSpriteSource(r2)
            return r2
    }

    public int getStateIndex() {
            r1 = this;
            int r0 = r1.mStateIndex
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> getStates() {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            java.util.ArrayList r0 = r0.getStates()
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void interpolateValues(float r1, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r0 = this;
            super.interpolateValues(r1, r2, r3)
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r2 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r2
            int r1 = r2.mStateIndex
            r0.mStateIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public boolean isStateable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef
    public void readPositionalData(int r1, int r2, java.io.DataInputStream r3) throws java.io.IOException {
            r0 = this;
            super.readPositionalData(r1, r2, r3)
            int r1 = r3.readInt()
            r0.mStateIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void setLibraryID(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r1.mSpriteGroupSourceRef
            r0.setLibraryId(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef
    public void setProperties(org.fortheloss.sticknodes.data.useractions.SpriteProperties r2) {
            r1 = this;
            super.setProperties(r2)
            boolean r0 = r2.stateIsControlled
            r1.mStateIsControlled = r0
            int r2 = r2.stateIndex
            r1.mStateIndex = r2
            return
    }

    public void setSpriteGroupSource(org.fortheloss.sticknodes.sprite.SpriteGroupSource r4) {
            r3 = this;
            r3.mSpriteGroupSourceRef = r4
            com.badlogic.gdx.math.Vector2 r0 = r3.mOrigin
            int r1 = r3.mStateIndex
            org.fortheloss.sticknodes.sprite.SpriteSource r1 = r4.getSpriteSource(r1)
            float r1 = r1.getOriginX()
            int r2 = r3.mStateIndex
            org.fortheloss.sticknodes.sprite.SpriteSource r4 = r4.getSpriteSource(r2)
            float r4 = r4.getOriginY()
            r0.set(r1, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public void setStateIndex(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r0 = r2.mSpriteGroupSourceRef
            int r0 = r0.getNumStates()
            int r0 = r0 + (-1)
            r1 = 0
            int r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r1, r0)
            r2.mStateIndex = r3
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.IStatefigure
    public void setStateIsControlled(boolean r1) {
            r0 = this;
            r0.mStateIsControlled = r1
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.SpriteRef, org.fortheloss.sticknodes.animationscreen.IDrawableFigure
    public void unjoin() {
            r1 = this;
            super.unjoin()
            r0 = 0
            r1.mStateIsControlled = r0
            return
    }
}
