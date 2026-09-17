package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigurePolyfillData implements com.badlogic.gdx.utils.Disposable {
    private int[] _savedAnchorIDs;
    private int[][] _savedAnchorPolynodeIDs;

    public StickfigurePolyfillData(org.fortheloss.sticknodes.stickfigure.Stickfigure r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r9 = r9.getPolyfillAnchorNodes()
            int r0 = r9.size()
            int[] r1 = new int[r0]
            r8._savedAnchorIDs = r1
            r1 = 0
            r2 = 0
        L11:
            if (r2 >= r0) goto L24
            int[] r3 = r8._savedAnchorIDs
            java.lang.Object r4 = r9.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            int r4 = r4.getDrawOrderIndex()
            r3[r2] = r4
            int r2 = r2 + 1
            goto L11
        L24:
            int[][] r2 = new int[r0][]
            r8._savedAnchorPolynodeIDs = r2
            r2 = 0
        L29:
            if (r2 >= r0) goto L58
            java.lang.Object r3 = r9.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            java.util.ArrayList r3 = r3.getPolynodeChildren()
            int r4 = r3.size()
            int[][] r5 = r8._savedAnchorPolynodeIDs
            int[] r6 = new int[r4]
            r5[r2] = r6
            r5 = 0
        L40:
            if (r5 >= r4) goto L55
            int[][] r6 = r8._savedAnchorPolynodeIDs
            r6 = r6[r2]
            java.lang.Object r7 = r3.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            int r7 = r7.getDrawOrderIndex()
            r6[r5] = r7
            int r5 = r5 + 1
            goto L40
        L55:
            int r2 = r2 + 1
            goto L29
        L58:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._savedAnchorIDs = r0
            r1._savedAnchorPolynodeIDs = r0
            return
    }

    public int[] getPolyfillAnchorIDs() {
            r1 = this;
            int[] r0 = r1._savedAnchorIDs
            return r0
    }

    public int[][] getPolyfillAnchorPolynodeIDs() {
            r1 = this;
            int[][] r0 = r1._savedAnchorPolynodeIDs
            return r0
    }
}
