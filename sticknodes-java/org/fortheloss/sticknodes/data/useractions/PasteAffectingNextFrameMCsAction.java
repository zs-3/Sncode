package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PasteAffectingNextFrameMCsAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private java.util.ArrayList<java.lang.Integer> _nextFrameOldOriginStartFrames;
    private org.fortheloss.sticknodes.data.IFrameData _nextFrameRef;

    public PasteAffectingNextFrameMCsAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._nextFrameRef = r0
            r1._nextFrameOldOriginStartFrames = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4._nextFrameOldOriginStartFrames = r0
            r4._nextFrameRef = r5
            if (r5 != 0) goto Lc
            return
        Lc:
            java.util.ArrayList r5 = r5.getDrawableFigures()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L44
            java.lang.Object r1 = r5.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L41
            org.fortheloss.sticknodes.movieclip.MCReference r1 = (org.fortheloss.sticknodes.movieclip.MCReference) r1
            boolean r2 = r1.isOriginMCRef()
            if (r2 != 0) goto L2b
            goto L41
        L2b:
            java.util.ArrayList<java.lang.Integer> r2 = r4._nextFrameOldOriginStartFrames
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.add(r3)
            java.util.ArrayList<java.lang.Integer> r2 = r4._nextFrameOldOriginStartFrames
            int r1 = r1.getStartFrameIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L41:
            int r0 = r0 + (-1)
            goto L16
        L44:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._nextFrameRef = r0
            r1._nextFrameOldOriginStartFrames = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r8 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r8._nextFrameRef
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r0.getDrawableFigures()
            r1 = 0
            java.util.ArrayList<java.lang.Integer> r2 = r8._nextFrameOldOriginStartFrames
            int r2 = r2.size()
        L10:
            if (r1 >= r2) goto L56
            java.util.ArrayList<java.lang.Integer> r3 = r8._nextFrameOldOriginStartFrames
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r8._nextFrameOldOriginStartFrames
            int r5 = r1 + 1
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r5 = r0.get(r3)
            org.fortheloss.sticknodes.movieclip.MCReference r5 = (org.fortheloss.sticknodes.movieclip.MCReference) r5
            r5.setStartFrameIndex(r4)
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "set next frame at index "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " back to start frame of "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r5.println(r3)
            int r1 = r1 + 2
            goto L10
        L56:
            return
    }
}
