package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillRecreationAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _anchorsRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private java.util.ArrayList<java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode>> _childrenRef;

    public PolyfillRecreationAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._anchorsRef = r0
            r1._childrenRef = r0
            r1._animationScreenRef = r0
            return
    }

    public void initialize(java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8, java.util.ArrayList<java.lang.Integer> r9, java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> r10) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._anchorsRef = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._childrenRef = r0
            int r0 = r9.size()
            r1 = 0
            r2 = 0
        L14:
            if (r2 >= r0) goto L2e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r7._anchorsRef
            java.lang.Object r4 = r9.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r8.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.add(r4)
            int r2 = r2 + 1
            goto L14
        L2e:
            int r9 = r10.size()
            r0 = 0
        L33:
            if (r0 >= r9) goto L65
            java.lang.Object r2 = r10.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode>> r4 = r7._childrenRef
            r4.add(r3)
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r6 = r8.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r3.add(r6)
            int r5 = r5 + 1
            goto L4a
        L62:
            int r0 = r0 + 1
            goto L33
        L65:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r8 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r8._anchorsRef
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L33
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r8._anchorsRef
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r3.convertToPolyAnchor()
            java.util.ArrayList<java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode>> r4 = r8._childrenRef
            java.lang.Object r4 = r4.get(r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            r6 = 0
        L22:
            if (r6 >= r5) goto L30
            java.lang.Object r7 = r4.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r3.addPolynodeChild(r7)
            int r6 = r6 + 1
            goto L22
        L30:
            int r2 = r2 + 1
            goto L8
        L33:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._anchorsRef = r0
            r1._childrenRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r0 = this;
            return
    }
}
