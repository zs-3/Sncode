package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public class SpriteGroupSource implements org.fortheloss.sticknodes.sprite.ISpriteSource {
    private int[] mLibIdsOfLoadedStateSprites;
    private int mLibraryID;
    private java.lang.String mName;
    private java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> mStates;

    public SpriteGroupSource(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mName = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mStates = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mName = r0
            r1.mStates = r0
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public int getLibraryId() {
            r1 = this;
            int r0 = r1.mLibraryID
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public int getNumStates() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r1.mStates
            int r0 = r0.size()
            return r0
    }

    public org.fortheloss.sticknodes.sprite.SpriteSource getSpriteSource(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r1.mStates
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.sprite.SpriteSource r2 = (org.fortheloss.sticknodes.sprite.SpriteSource) r2
            return r2
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> getStates() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r1.mStates
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void readLibraryData(int r3, int r4, java.io.DataInputStream r5) throws java.io.IOException {
            r2 = this;
            int r3 = r5.readInt()
            int[] r4 = new int[r3]
            r2.mLibIdsOfLoadedStateSprites = r4
            r4 = 0
        L9:
            if (r4 >= r3) goto L16
            int[] r0 = r2.mLibIdsOfLoadedStateSprites
            int r1 = r5.readInt()
            r0[r4] = r1
            int r4 = r4 + 1
            goto L9
        L16:
            return
    }

    public void rebuildStates(java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r5) {
            r4 = this;
            int[] r0 = r4.mLibIdsOfLoadedStateSprites
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L18
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r2 = r4.mStates
            int[] r3 = r4.mLibIdsOfLoadedStateSprites
            r3 = r3[r1]
            java.lang.Object r3 = r5.get(r3)
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto L4
        L18:
            r5 = 0
            r4.mLibIdsOfLoadedStateSprites = r5
            return
    }

    public void rebuildStates(java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r5, java.util.Map<java.lang.Integer, java.lang.Integer> r6) {
            r4 = this;
            int[] r0 = r4.mLibIdsOfLoadedStateSprites
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L26
            int[] r2 = r4.mLibIdsOfLoadedStateSprites
            r2 = r2[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r6.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r3 = r4.mStates
            java.lang.Object r2 = r5.get(r2)
            org.fortheloss.sticknodes.sprite.SpriteSource r2 = (org.fortheloss.sticknodes.sprite.SpriteSource) r2
            r3.add(r2)
            int r1 = r1 + 1
            goto L4
        L26:
            r5 = 0
            r4.mLibIdsOfLoadedStateSprites = r5
            return
    }

    public void removeState(int r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r1.mStates
            r0.remove(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void setLibraryId(int r1) {
            r0 = this;
            r0.mLibraryID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void setName(java.lang.String r1) {
            r0 = this;
            r0.mName = r1
            return
    }

    public void setStates(java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r5) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r4.mStates
            r0.clear()
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r2 = r4.mStates
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void writeLibraryData(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r0 = r3.mStates
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            r1 = 0
        La:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.SpriteSource> r2 = r3.mStates
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.sprite.SpriteSource r2 = (org.fortheloss.sticknodes.sprite.SpriteSource) r2
            int r2 = r2.getLibraryId()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r4)
            int r1 = r1 + 1
            goto La
        L1e:
            return
    }
}
