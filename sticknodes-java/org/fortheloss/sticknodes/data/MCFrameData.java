package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class MCFrameData implements com.badlogic.gdx.utils.Disposable, org.fortheloss.sticknodes.data.IFrameData {
    private static final com.badlogic.gdx.graphics.Color _backgroundColor = null;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _drawableFigures;
    private float _lastTimeTweenedAmount;
    private transient org.fortheloss.sticknodes.data.MCFrameData _nextFrameRef;
    private transient org.fortheloss.sticknodes.data.MCFrameData _previousFrameRef;
    private int _soundLibraryID;
    private float _soundPan;
    private float _soundPitch;
    private float _soundVolume;
    private transient java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _tweenedDrawableFigures;
    private short figureNodeCount;


    /* renamed from: -$$Nest$fget_drawableFigures, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m1301$$Nest$fget_drawableFigures(org.fortheloss.sticknodes.data.MCFrameData r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r0._drawableFigures
            return r0
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            org.fortheloss.sticknodes.data.MCFrameData._backgroundColor = r0
            return
    }

    public MCFrameData() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.figureNodeCount = r0
            r1 = -1
            r3._soundLibraryID = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3._soundVolume = r1
            r2 = 0
            r3._soundPan = r2
            r3._soundPitch = r1
            r3._lastTimeTweenedAmount = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3._drawableFigures = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3._tweenedDrawableFigures = r1
            r3.figureNodeCount = r0
            return
    }

    public MCFrameData(org.fortheloss.sticknodes.data.FrameData r18, boolean r19) {
            r17 = this;
            r0 = r17
            r17.<init>()
            r1 = 0
            r0.figureNodeCount = r1
            r2 = -1
            r0._soundLibraryID = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r3
            r4 = 0
            r0._soundPan = r4
            r0._soundPitch = r3
            r0._lastTimeTweenedAmount = r4
            java.util.ArrayList r5 = r18.getDrawableFigures()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0._drawableFigures = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0._tweenedDrawableFigures = r6
            int r6 = r5.size()
            r7 = 0
        L2d:
            r8 = 1
            if (r7 >= r6) goto L9b
            java.lang.Object r9 = r5.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r10 == 0) goto L3b
            goto L98
        L3b:
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r10 == 0) goto L57
            r10 = r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._drawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r12.<init>(r10)
            r11.add(r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r12.<init>(r10)
            r11.add(r12)
            goto L8e
        L57:
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r10 == 0) goto L73
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r11 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r12 = r9
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r12 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r12
            r11.<init>(r12)
            r10.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r11 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r11.<init>(r12)
            r10.add(r11)
            goto L8e
        L73:
            boolean r10 = r9 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r10 == 0) goto L8e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r12 = r9
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = (org.fortheloss.sticknodes.sprite.SpriteRef) r12
            r11.<init>(r12)
            r10.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r11.<init>(r12)
            r10.add(r11)
        L8e:
            short r10 = r0.figureNodeCount
            int r8 = r9.getNodeCount(r8)
            int r10 = r10 + r8
            short r8 = (short) r10
            r0.figureNodeCount = r8
        L98:
            int r7 = r7 + 1
            goto L2d
        L9b:
            r7 = 0
        L9c:
            if (r7 >= r6) goto L180
            java.lang.Object r9 = r5.get(r7)
            boolean r9 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r9 != 0) goto La8
            goto L173
        La8:
            java.lang.Object r9 = r5.get(r7)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r9
            boolean r10 = r9.hasJoinAnchorNode()
            if (r10 == 0) goto L173
            int r10 = r9.getID()
            java.util.ArrayList r9 = r9.getJoinAnchorNodes()
            int r11 = r9.size()
            r12 = 0
        Lc1:
            if (r12 >= r11) goto L173
            java.lang.Object r13 = r9.get(r12)
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = (org.fortheloss.sticknodes.stickfigure.StickNode) r13
            java.util.ArrayList r14 = r13.getJoinedFigures()
            int r15 = r14.size()
        Ld1:
            if (r1 >= r15) goto L168
            java.lang.Object r16 = r14.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r16 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r16
            int r4 = r16.getID()
            r16 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._drawableFigures
            int r3 = r3.size()
            int r3 = r3 - r8
        Le6:
            if (r3 < 0) goto Lfc
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._drawableFigures
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r8 = r2.getID()
            if (r8 != r4) goto Lf7
            goto Lfe
        Lf7:
            int r3 = r3 + (-1)
            r2 = -1
            r8 = 1
            goto Le6
        Lfc:
            r2 = r16
        Lfe:
            if (r2 != 0) goto L104
            r16 = r5
            r8 = 1
            goto L15e
        L104:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r0._drawableFigures
            int r4 = r4.size()
            r8 = 1
            int r4 = r4 - r8
        L10c:
            if (r4 < 0) goto L129
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            java.lang.Object r8 = r8.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            r16 = r5
            boolean r5 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 != 0) goto L11d
            goto L124
        L11d:
            int r5 = r8.getID()
            if (r5 != r10) goto L124
            goto L12b
        L124:
            int r4 = r4 + (-1)
            r5 = r16
            goto L10c
        L129:
            r16 = r5
        L12b:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r0._drawableFigures
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r8 = r13.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r5 = r5.getNodeAtDrawOrderIndex(r8)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r8 = 1
            r2.joinTo(r5, r8)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r0._tweenedDrawableFigures
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r4 = r13.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getNodeAtDrawOrderIndex(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r2.joinTo(r3)
        L15e:
            int r1 = r1 + 1
            r5 = r16
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            goto Ld1
        L168:
            r16 = r5
            int r12 = r12 + 1
            r1 = 0
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            goto Lc1
        L173:
            r16 = r5
            int r7 = r7 + 1
            r5 = r16
            r1 = 0
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            goto L9c
        L180:
            if (r19 == 0) goto L19b
            int r1 = r18.getSoundToPlayLibraryID()
            r0._soundLibraryID = r1
            float r1 = r18.getSoundVolume()
            r0._soundVolume = r1
            float r1 = r18.getSoundPan()
            r0._soundPan = r1
            float r1 = r18.getSoundPitch()
            r0._soundPitch = r1
            goto L1a7
        L19b:
            r1 = -1
            r0._soundLibraryID = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r1
            r2 = 0
            r0._soundPan = r2
            r0._soundPitch = r1
        L1a7:
            return
    }

    public MCFrameData(org.fortheloss.sticknodes.data.MCFrameData r18, boolean r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r17.<init>()
            r2 = 0
            r0.figureNodeCount = r2
            r3 = -1
            r0._soundLibraryID = r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r4
            r5 = 0
            r0._soundPan = r5
            r0._soundPitch = r4
            r0._lastTimeTweenedAmount = r5
            java.util.ArrayList r6 = r18.getDrawableFigures()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0._drawableFigures = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0._tweenedDrawableFigures = r7
            int r7 = r6.size()
            r8 = 0
        L2f:
            r9 = 1
            if (r8 >= r7) goto L98
            java.lang.Object r10 = r6.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r11 == 0) goto L54
            r11 = r10
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r11
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._drawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r13 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r13.<init>(r11)
            r12.add(r13)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r13 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r13.<init>(r11)
            r12.add(r13)
            goto L8b
        L54:
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r11 == 0) goto L8b
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r11 == 0) goto L74
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r12 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r13 = r10
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r13 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r13
            r12.<init>(r13)
            r11.add(r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r12 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r12.<init>(r13)
            r11.add(r12)
            goto L8b
        L74:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._drawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r13 = r10
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = (org.fortheloss.sticknodes.sprite.SpriteRef) r13
            r12.<init>(r13)
            r11.add(r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r12 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r12.<init>(r13)
            r11.add(r12)
        L8b:
            short r11 = r0.figureNodeCount
            int r9 = r10.getNodeCount(r9)
            int r11 = r11 + r9
            short r9 = (short) r11
            r0.figureNodeCount = r9
            int r8 = r8 + 1
            goto L2f
        L98:
            r8 = 0
        L99:
            if (r8 >= r7) goto L145
            java.lang.Object r10 = r6.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r11 != 0) goto La7
            goto L13c
        La7:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r10
            boolean r11 = r10.hasJoinAnchorNode()
            if (r11 == 0) goto L13c
            java.util.ArrayList r10 = r10.getJoinAnchorNodes()
            int r11 = r10.size()
            r12 = 0
        Lb8:
            if (r12 >= r11) goto L13c
            java.lang.Object r13 = r10.get(r12)
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = (org.fortheloss.sticknodes.stickfigure.StickNode) r13
            java.util.ArrayList r14 = r13.getJoinedFigures()
            int r15 = r14.size()
        Lc8:
            if (r2 >= r15) goto L133
            java.lang.Object r16 = r14.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r16 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r16
            int r5 = r16.getID()
            r16 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r0._drawableFigures
            int r4 = r4.size()
            int r4 = r4 - r9
        Ldd:
            if (r4 < 0) goto Lf3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._drawableFigures
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r9 = r3.getID()
            if (r9 != r5) goto Lee
            goto Lf5
        Lee:
            int r4 = r4 + (-1)
            r3 = -1
            r9 = 1
            goto Ldd
        Lf3:
            r3 = r16
        Lf5:
            if (r3 != 0) goto Lf9
            r9 = 1
            goto L12c
        Lf9:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r0._drawableFigures
            java.lang.Object r5 = r5.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r9 = r13.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r5 = r5.getNodeAtDrawOrderIndex(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r9 = 1
            r3.joinTo(r5, r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r0._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r0._tweenedDrawableFigures
            java.lang.Object r4 = r4.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r13.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r4 = r4.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.joinTo(r4)
        L12c:
            int r2 = r2 + 1
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto Lc8
        L133:
            int r12 = r12 + 1
            r2 = 0
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto Lb8
        L13c:
            int r8 = r8 + 1
            r2 = 0
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L99
        L145:
            if (r19 == 0) goto L158
            int r2 = r1._soundLibraryID
            r0._soundLibraryID = r2
            float r2 = r1._soundVolume
            r0._soundVolume = r2
            float r2 = r1._soundPan
            r0._soundPan = r2
            float r1 = r1._soundPitch
            r0._soundPitch = r1
            goto L164
        L158:
            r1 = -1
            r0._soundLibraryID = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._soundVolume = r1
            r2 = 0
            r0._soundPan = r2
            r0._soundPitch = r1
        L164:
            return
    }

    public static com.badlogic.gdx.graphics.Color getBackgroundColor() {
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.data.MCFrameData._backgroundColor
            return r0
    }

    public static void setBackgroundColor(com.badlogic.gdx.graphics.Color r1) {
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.data.MCFrameData._backgroundColor
            r0.set(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void addFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, int r3, org.fortheloss.sticknodes.animationscreen.FramesContainer r4) {
            r1 = this;
            r0 = -1
            r1.addFigureAt(r2, r3, r0, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void addFigureAt(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5, int r6, int r7, org.fortheloss.sticknodes.animationscreen.FramesContainer r8) {
            r4 = this;
            r0 = 1
            if (r6 < 0) goto L31
            r1 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._drawableFigures
            int r2 = r2.size()
            int r2 = r2 - r0
        Lb:
            if (r2 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            if (r3 != r6) goto L1d
            r1 = 1
            goto L20
        L1d:
            int r2 = r2 + (-1)
            goto Lb
        L20:
            if (r1 != 0) goto L26
            r5.setID(r6)
            goto L3b
        L26:
            int r6 = r8.getUniqueFigureID()
            r5.setID(r6)
            r8.incrementUniqueFigureID()
            goto L3b
        L31:
            int r6 = r8.getUniqueFigureID()
            r5.setID(r6)
            r8.incrementUniqueFigureID()
        L3b:
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r8 = -1
            if (r6 == 0) goto L69
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r1 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r1
            r6.<init>(r1)
            if (r7 == r8) goto L5e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            int r8 = r8.size()
            if (r7 <= r8) goto L53
            goto L5e
        L53:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            r8.add(r7, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._tweenedDrawableFigures
            r8.add(r7, r6)
            goto La2
        L5e:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._drawableFigures
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._tweenedDrawableFigures
            r7.add(r6)
            goto La2
        L69:
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r6 == 0) goto La2
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r6 == 0) goto L7a
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r6 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r1 = r5
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r1 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r1
            r6.<init>(r1)
            goto L82
        L7a:
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r1 = r5
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = (org.fortheloss.sticknodes.sprite.SpriteRef) r1
            r6.<init>(r1)
        L82:
            if (r7 == r8) goto L98
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            int r8 = r8.size()
            if (r7 <= r8) goto L8d
            goto L98
        L8d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._drawableFigures
            r8.add(r7, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r4._tweenedDrawableFigures
            r8.add(r7, r6)
            goto La2
        L98:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._drawableFigures
            r7.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r4._tweenedDrawableFigures
            r7.add(r6)
        La2:
            short r6 = r4.figureNodeCount
            int r5 = r5.getNodeCount(r0)
            int r6 = r6 + r5
            short r5 = (short) r6
            r4.figureNodeCount = r5
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void clear() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._drawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r2.deleteFigure(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void deleteFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._drawableFigures
            int r0 = r0.indexOf(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            r1.remove(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r0 = r1.remove(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            short r1 = r3.figureNodeCount
            r2 = 1
            int r4 = r4.getNodeCount(r2)
            int r1 = r1 - r4
            short r4 = (short) r1
            r3.figureNodeCount = r4
            boolean r4 = r0.isJoined()
            if (r4 == 0) goto L27
            r0.unjoin()
        L27:
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L37
            r4 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            boolean r1 = r4.hasJoinAnchorNode()
            if (r1 == 0) goto L37
            r4.removeAllJoinedFigures()
        L37:
            r0.dispose()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._previousFrameRef = r0
            r3._nextFrameRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._drawableFigures
            if (r1 == 0) goto L21
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Lf:
            if (r1 < 0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._drawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto Lf
        L1f:
            r3._drawableFigures = r0
        L21:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            if (r1 == 0) goto L3d
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L2b:
            if (r1 < 0) goto L3b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._tweenedDrawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L2b
        L3b:
            r3._tweenedDrawableFigures = r0
        L3d:
            return
    }

    public void getData(java.io.OutputStream r9, java.util.ArrayList<java.lang.Integer> r10, java.util.ArrayList<java.lang.Integer> r11, java.util.ArrayList<java.lang.Integer> r12) throws java.io.IOException {
            r8 = this;
            float r0 = r8._soundVolume
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r9)
            float r0 = r8._soundPan
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r9)
            float r0 = r8._soundPitch
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r9)
            int r0 = r8._soundLibraryID
            r1 = -1
            if (r0 >= 0) goto L18
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r9)
            goto L36
        L18:
            int r2 = r12.size()
            int r2 = r2 + (-1)
        L1e:
            if (r2 < 0) goto L30
            java.lang.Object r3 = r12.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r0) goto L2d
            goto L31
        L2d:
            int r2 = r2 + (-1)
            goto L1e
        L30:
            r2 = -1
        L31:
            if (r2 == r1) goto L124
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r9)
        L36:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r12 = r8._drawableFigures
            int r12 = r12.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r12, r9)
            r0 = 0
            r2 = 0
        L41:
            if (r2 >= r12) goto Ld0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r8._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r4 = r3.getLibraryID()
            boolean r5 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L6b
            int r6 = r10.size()
            int r6 = r6 + (-1)
        L59:
            if (r6 < 0) goto L83
            java.lang.Object r7 = r10.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r4) goto L68
            goto L84
        L68:
            int r6 = r6 + (-1)
            goto L59
        L6b:
            int r6 = r11.size()
            int r6 = r6 + (-1)
        L71:
            if (r6 < 0) goto L83
            java.lang.Object r7 = r11.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r4) goto L80
            goto L84
        L80:
            int r6 = r6 + (-1)
            goto L71
        L83:
            r6 = -1
        L84:
            if (r6 == r1) goto La6
            if (r5 == 0) goto L8c
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r9)
            goto L9d
        L8c:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r4 == 0) goto L95
            r4 = 3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r9)
            goto L9d
        L95:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L9d
            r4 = 2
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r9)
        L9d:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r6, r9)
            r3.getPositionalData(r9)
            int r2 = r2 + 1
            goto L41
        La6:
            java.io.IOException r9 = new java.io.IOException
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r8._drawableFigures
            int r10 = r10.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Failed to assign relative library ID to figure with current library ID of "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = " (num figures in frame: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = ")"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        Ld0:
            r10 = 0
            r11 = 0
        Ld2:
            if (r10 >= r12) goto Le7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r8._drawableFigures
            java.lang.Object r1 = r1.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r1 = r1.isJoined()
            if (r1 == 0) goto Le4
            int r11 = r11 + 1
        Le4:
            int r10 = r10 + 1
            goto Ld2
        Le7:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r9)
            if (r11 <= 0) goto L123
        Lec:
            if (r0 >= r12) goto L123
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r10 = r8._drawableFigures
            java.lang.Object r10 = r10.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            boolean r11 = r10.isJoined()
            if (r11 == 0) goto L120
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r10.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = r11.getStickfigure()
            int r11 = r11.getID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r9)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r10.getJoinedToNode()
            int r11 = r11.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r11, r9)
            float r10 = r10.getJoinOffsetAngle()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r10, r9)
        L120:
            int r0 = r0 + 1
            goto Lec
        L123:
            return
        L124:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed to assign relative sound ID to frame with sound ID of "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getDrawableFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._drawableFigures
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void getFigureOrder(java.util.ArrayList<java.lang.Integer> r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._drawableFigures
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._drawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r2 = r2.getID()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L7
        L1f:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getFigurePosition(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._drawableFigures
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getFrameTotalNodeCount() {
            r1 = this;
            short r0 = r1.figureNodeCount
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public boolean getIsUsingSlowMotionTweenedFrames() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void getLibraryData(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            float r0 = r5._soundVolume
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            float r0 = r5._soundPan
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            float r0 = r5._soundPitch
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r6)
            int r0 = r5._soundLibraryID
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._drawableFigures
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r6)
            r1 = 0
            r2 = 0
        L1f:
            if (r2 >= r0) goto L4f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._drawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L31
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r6)
            goto L42
        L31:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r4 == 0) goto L3a
            r4 = 3
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            goto L42
        L3a:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L42
            r4 = 2
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
        L42:
            int r4 = r3.getLibraryID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r6)
            r3.getPositionalData(r6)
            int r2 = r2 + 1
            goto L1f
        L4f:
            r2 = 0
            r3 = 0
        L51:
            if (r2 >= r0) goto L66
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r4 = r4.isJoined()
            if (r4 == 0) goto L63
            int r3 = r3 + 1
        L63:
            int r2 = r2 + 1
            goto L51
        L66:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            if (r3 <= 0) goto La2
        L6b:
            if (r1 >= r0) goto La2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._drawableFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            boolean r3 = r2.isJoined()
            if (r3 == 0) goto L9f
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            int r3 = r3.getID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r6)
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            int r3 = r3.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r6)
            float r2 = r2.getJoinOffsetAngle()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r2, r6)
        L9f:
            int r1 = r1 + 1
            goto L6b
        La2:
            return
    }

    public org.fortheloss.sticknodes.data.MCFrameData getNextFrame() {
            r1 = this;
            org.fortheloss.sticknodes.data.MCFrameData r0 = r1._nextFrameRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void getProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r2) {
            r1 = this;
            int r0 = r1._soundLibraryID
            r2.soundLibraryID = r0
            float r0 = r1._soundVolume
            r2.soundVolume = r0
            float r0 = r1._soundPan
            r2.soundPan = r0
            float r0 = r1._soundPitch
            r2.soundPitch = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getSlowMotionTweenedFrames() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundPan() {
            r1 = this;
            float r0 = r1._soundPan
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundPitch() {
            r1 = this;
            float r0 = r1._soundPitch
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public int getSoundToPlayLibraryID() {
            r1 = this;
            int r0 = r1._soundLibraryID
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public float getSoundVolume() {
            r1 = this;
            float r0 = r1._soundVolume
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getTweenedDrawableFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._tweenedDrawableFigures
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public boolean isTweened() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureFlippedX(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, boolean r5) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.flipX(r5)
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureFlippedY(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4, boolean r5) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.flipY(r5)
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureJoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7, org.fortheloss.sticknodes.stickfigure.StickNode r8) {
            r6 = this;
            int r7 = r7.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L50
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r7) goto L4d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r8.getStickfigure()
            int r2 = r2.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._tweenedDrawableFigures
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L2c:
            if (r3 < 0) goto L4d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._tweenedDrawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r4.getID()
            if (r5 != r2) goto L4a
            int r7 = r8.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r7 = r4.getNodeAtDrawOrderIndex(r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r1.joinTo(r7)
            goto L50
        L4a:
            int r3 = r3 + (-1)
            goto L2c
        L4d:
            int r0 = r0 + (-1)
            goto Lc
        L50:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onFigureUnjoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            int r4 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L20
            r1.unjoin()
            goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeColorModified(org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r6.getStickfigure()
            int r0 = r0.getID()
            int r1 = r6.getDrawOrderIndex()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._tweenedDrawableFigures
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L31
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._tweenedDrawableFigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r4 = r3.getID()
            if (r4 != r0) goto L2e
            org.fortheloss.sticknodes.stickfigure.INode r0 = r3.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r6.copyColorValuesTo(r0)
            goto L31
        L2e:
            int r2 = r2 + (-1)
            goto L14
        L31:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeFlippedX(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L23
            org.fortheloss.sticknodes.stickfigure.INode r4 = r1.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5 = 0
            r4.flipX(r5)
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void onStickNodeFlippedY(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r3._tweenedDrawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._tweenedDrawableFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            int r2 = r1.getID()
            if (r2 != r4) goto L23
            org.fortheloss.sticknodes.stickfigure.INode r4 = r1.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5 = 0
            r4.flipY(r5)
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            return
    }

    public void readData(int r19, int r20, org.fortheloss.sticknodes.data.ProjectData r21, java.io.DataInputStream r22, int[] r23, int[] r24, int[] r25) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            float r8 = r22.readFloat()
            r0._soundVolume = r8
            r8 = 310(0x136, float:4.34E-43)
            if (r1 < r8) goto L1f
            float r9 = r22.readFloat()
            goto L20
        L1f:
            r9 = 0
        L20:
            r0._soundPan = r9
            if (r1 < r8) goto L29
            float r8 = r22.readFloat()
            goto L2b
        L29:
            r8 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r0._soundPitch = r8
            int r8 = r22.readInt()
            java.lang.String r9 = " is greater than mapped values array of length "
            if (r8 >= 0) goto L39
            r7 = -1
            r0._soundLibraryID = r7
            goto L40
        L39:
            int r10 = r7.length
            if (r8 >= r10) goto L1fa
            r7 = r7[r8]
            r0._soundLibraryID = r7
        L40:
            int r7 = r22.readInt()
            r10 = 0
        L45:
            r11 = 53
            r12 = 1
            if (r10 >= r7) goto L17d
            r13 = 400(0x190, float:5.6E-43)
            if (r1 < r13) goto L53
            int r13 = r22.readInt()
            goto L54
        L53:
            r13 = 0
        L54:
            if (r13 != 0) goto Lcf
            int r13 = r22.readInt()
            int r14 = r5.length
            if (r13 >= r14) goto Lb1
            r13 = r5[r13]
            org.fortheloss.sticknodes.stickfigure.Stickfigure r14 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r13 = r3.getLibraryStickfigure(r13)
            r14.<init>(r13)
            r14.readPositionalData(r1, r2, r4)
            if (r2 > r11) goto L96
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r14.getMainNode()
            java.util.ArrayList r13 = r11.getChildrenNodes()
            int r13 = r13.size()
            int r13 = r13 - r12
        L7a:
            if (r13 < 0) goto L96
            java.util.ArrayList r15 = r11.getChildrenNodes()
            java.lang.Object r15 = r15.get(r13)
            org.fortheloss.sticknodes.stickfigure.StickNode r15 = (org.fortheloss.sticknodes.stickfigure.StickNode) r15
            float r16 = r15.getLocalAngle()
            float r17 = r11.getLocalAngle()
            float r8 = r16 - r17
            r15.setLocalAngle(r8)
            int r13 = r13 + (-1)
            goto L7a
        L96:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r14)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r11.<init>(r14)
            r8.add(r11)
            short r8 = r0.figureNodeCount
            int r11 = r14.getNodeCount(r12)
            int r8 = r8 + r11
            short r8 = (short) r8
            r0.figureNodeCount = r8
            goto L179
        Lb1:
            java.io.IOException r1 = new java.io.IOException
            int r2 = r5.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading stickfigure library id, relative library ID of "
            r3.append(r4)
            r3.append(r13)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        Lcf:
            r8 = 3
            if (r13 != r8) goto L124
            int r8 = r22.readInt()
            int r11 = r6.length
            if (r8 >= r11) goto L106
            r8 = r6[r8]
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r11 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r11.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r8 = r3.getLibrarySprite(r8)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r8 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r8
            r11.setSpriteGroupSource(r8)
            r11.readPositionalData(r1, r2, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r13 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r13.<init>(r11)
            r8.add(r13)
            short r8 = r0.figureNodeCount
            int r11 = r11.getNodeCount(r12)
            int r8 = r8 + r11
            short r8 = (short) r8
            r0.figureNodeCount = r8
            goto L179
        L106:
            java.io.IOException r1 = new java.io.IOException
            int r2 = r6.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading SpriteGroupRef library id, relative library ID of "
            r3.append(r4)
            r3.append(r8)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L124:
            r8 = 2
            if (r13 != r8) goto L179
            int r8 = r22.readInt()
            int r11 = r6.length
            if (r8 >= r11) goto L15b
            r8 = r6[r8]
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r11.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r8 = r3.getLibrarySprite(r8)
            org.fortheloss.sticknodes.sprite.SpriteSource r8 = (org.fortheloss.sticknodes.sprite.SpriteSource) r8
            r11.setSpriteSource(r8)
            r11.readPositionalData(r1, r2, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            r8.add(r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r13 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r13.<init>(r11)
            r8.add(r13)
            short r8 = r0.figureNodeCount
            int r11 = r11.getNodeCount(r12)
            int r8 = r8 + r11
            short r8 = (short) r8
            r0.figureNodeCount = r8
            goto L179
        L15b:
            java.io.IOException r1 = new java.io.IOException
            int r2 = r6.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading SpriteRef library id, relative library ID of "
            r3.append(r4)
            r3.append(r8)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L179:
            int r10 = r10 + 1
            goto L45
        L17d:
            int r1 = r22.readInt()
        L181:
            if (r1 <= 0) goto L1f9
            int r3 = r22.readInt()
            int r5 = r22.readInt()
            int r6 = r22.readInt()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r0._drawableFigures
            java.lang.Object r3 = r7.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r7 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r0._drawableFigures
            int r8 = r8.size()
            int r8 = r8 - r12
        L19f:
            if (r8 < 0) goto L1bc
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r9 = r0._drawableFigures
            java.lang.Object r9 = r9.get(r8)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r9 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r9
            int r9 = r9.getID()
            if (r5 != r9) goto L1b9
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r0._drawableFigures
            java.lang.Object r5 = r5.get(r8)
            r7 = r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            goto L1bc
        L1b9:
            int r8 = r8 + (-1)
            goto L19f
        L1bc:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r7.getMainNode()
            r5.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r7.getMainNode()
            r5.validatePosition()
            org.fortheloss.sticknodes.stickfigure.INode r5 = r7.getNodeAtDrawOrderIndex(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            float r6 = r3.getRotation()
            float r7 = r5.getAngle()
            float r6 = r6 - r7
            r7 = 1127481344(0x43340000, float:180.0)
            float r6 = r6 + r7
            r8 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r8
            float r6 = r6 - r7
            r7 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L1e7
            float r6 = r6 + r8
        L1e7:
            if (r2 < r11) goto L1ed
            float r6 = r22.readFloat()
        L1ed:
            r3.setJoinOffsetAngle(r6)
            r3.joinTo(r5, r12)
            r0.onFigureJoined(r3, r5)
            int r1 = r1 + (-1)
            goto L181
        L1f9:
            return
        L1fa:
            java.io.IOException r1 = new java.io.IOException
            int r2 = r7.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Reading frame data, relative sound ID of "
            r3.append(r4)
            r3.append(r8)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }

    public void readLibraryData(int r11, int r12, org.fortheloss.sticknodes.data.ProjectData r13, java.io.DataInputStream r14) throws java.io.IOException {
            r10 = this;
            float r0 = r14.readFloat()
            r10._soundVolume = r0
            r0 = 0
            r1 = 310(0x136, float:4.34E-43)
            if (r11 < r1) goto L10
            float r2 = r14.readFloat()
            goto L11
        L10:
            r2 = 0
        L11:
            r10._soundPan = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r11 < r1) goto L1c
            float r1 = r14.readFloat()
            goto L1e
        L1c:
            r1 = 1065353216(0x3f800000, float:1.0)
        L1e:
            r10._soundPitch = r1
            int r1 = r14.readInt()
            r10._soundLibraryID = r1
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 != 0) goto L37
            r1 = -1
            r10._soundLibraryID = r1
            r10._soundVolume = r2
            r10._soundPan = r0
            r10._soundPitch = r2
        L37:
            int r0 = r14.readInt()
            r1 = 0
            r2 = 0
        L3d:
            r3 = 53
            r4 = 1
            if (r2 >= r0) goto L109
            r5 = 400(0x190, float:5.6E-43)
            if (r11 < r5) goto L4b
            int r5 = r14.readInt()
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 != 0) goto La2
            int r5 = r14.readInt()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r13.getLibraryStickfigure(r5)
            r6.<init>(r5)
            r6.readPositionalData(r11, r12, r14)
            if (r12 > r3) goto L88
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r6.getMainNode()
            java.util.ArrayList r5 = r3.getChildrenNodes()
            int r5 = r5.size()
            int r5 = r5 - r4
        L6d:
            if (r5 < 0) goto L88
            java.util.ArrayList r7 = r3.getChildrenNodes()
            java.lang.Object r7 = r7.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            float r8 = r7.getLocalAngle()
            float r9 = r3.getLocalAngle()
            float r8 = r8 - r9
            r7.setLocalAngle(r8)
            int r5 = r5 + (-1)
            goto L6d
        L88:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._drawableFigures
            r3.add(r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._tweenedDrawableFigures
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r5.<init>(r6)
            r3.add(r5)
            short r3 = r10.figureNodeCount
            int r4 = r6.getNodeCount(r4)
            int r3 = r3 + r4
            short r3 = (short) r3
            r10.figureNodeCount = r3
            goto L105
        La2:
            r3 = 3
            if (r5 != r3) goto Ld4
            int r3 = r14.readInt()
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r5 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r5.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = r13.getLibrarySprite(r3)
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r3 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r3
            r5.setSpriteGroupSource(r3)
            r5.readPositionalData(r11, r12, r14)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._drawableFigures
            r3.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r6 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r6.<init>(r5)
            r3.add(r6)
            short r3 = r10.figureNodeCount
            int r4 = r5.getNodeCount(r4)
            int r3 = r3 + r4
            short r3 = (short) r3
            r10.figureNodeCount = r3
            goto L105
        Ld4:
            r3 = 2
            if (r5 != r3) goto L105
            int r3 = r14.readInt()
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r5.<init>()
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = r13.getLibrarySprite(r3)
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            r5.setSpriteSource(r3)
            r5.readPositionalData(r11, r12, r14)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._drawableFigures
            r3.add(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r10._tweenedDrawableFigures
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r6.<init>(r5)
            r3.add(r6)
            short r3 = r10.figureNodeCount
            int r4 = r5.getNodeCount(r4)
            int r3 = r3 + r4
            short r3 = (short) r3
            r10.figureNodeCount = r3
        L105:
            int r2 = r2 + 1
            goto L3d
        L109:
            int r11 = r14.readInt()
        L10d:
            if (r11 <= 0) goto L185
            int r13 = r14.readInt()
            int r0 = r14.readInt()
            int r1 = r14.readInt()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r10._drawableFigures
            java.lang.Object r13 = r2.get(r13)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r13 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r13
            r2 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r10._drawableFigures
            int r5 = r5.size()
            int r5 = r5 - r4
        L12b:
            if (r5 < 0) goto L148
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r10._drawableFigures
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            int r6 = r6.getID()
            if (r0 != r6) goto L145
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r10._drawableFigures
            java.lang.Object r0 = r0.get(r5)
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            goto L148
        L145:
            int r5 = r5 + (-1)
            goto L12b
        L148:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getMainNode()
            r0.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getMainNode()
            r0.validatePosition()
            org.fortheloss.sticknodes.stickfigure.INode r0 = r2.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            float r1 = r13.getRotation()
            float r2 = r0.getAngle()
            float r1 = r1 - r2
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 + r2
            r5 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r5
            float r1 = r1 - r2
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L173
            float r1 = r1 + r5
        L173:
            if (r12 < r3) goto L179
            float r1 = r14.readFloat()
        L179:
            r13.setJoinOffsetAngle(r1)
            r13.joinTo(r0, r4)
            r10.onFigureJoined(r13, r0)
            int r11 = r11 + (-1)
            goto L10d
        L185:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void restoreReferences(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.data.IFrameData r2) {
            r0 = this;
            org.fortheloss.sticknodes.data.MCFrameData r1 = (org.fortheloss.sticknodes.data.MCFrameData) r1
            r0._previousFrameRef = r1
            org.fortheloss.sticknodes.data.MCFrameData r2 = (org.fortheloss.sticknodes.data.MCFrameData) r2
            r0._nextFrameRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrder(java.util.ArrayList<java.lang.Integer> r6) {
            r5 = this;
            int r0 = r6.size()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._drawableFigures
            int r1 = r1.size()
            if (r0 != r1) goto L52
            int r0 = r6.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L51
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r1
        L1e:
            if (r3 >= r0) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            if (r4 != r2) goto L4b
            if (r3 == r1) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._drawableFigures
            java.lang.Object r2 = r2.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r5._drawableFigures
            r4.add(r1, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._tweenedDrawableFigures
            java.lang.Object r2 = r2.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._tweenedDrawableFigures
            r3.add(r1, r2)
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L1e
        L4e:
            int r1 = r1 + 1
            goto L11
        L51:
            return
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r6 = r6.size()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._drawableFigures
            int r1 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't set figure order, ids ("
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ") and figures ("
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = ") size not the same"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrder(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3, int r4) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r0 = r0.size()
            if (r4 < r0) goto L10
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r2._drawableFigures
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L10:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            int r3 = r0.indexOf(r3)
            if (r3 >= 0) goto L19
            return
        L19:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            java.lang.Object r1 = r0.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r0.add(r4, r1)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            java.lang.Object r3 = r0.remove(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r0.add(r4, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setFigureOrderUndoRedo(java.lang.Integer[] r7) {
            r6 = this;
            int r0 = r7.length
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._drawableFigures
            int r1 = r1.size()
            if (r0 == r1) goto La
            return
        La:
            r0 = 0
            int r1 = r7.length
        Lc:
            if (r0 >= r1) goto L35
            r2 = r7[r0]
            int r2 = r2.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._drawableFigures
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L1c:
            if (r3 < 0) goto L32
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._drawableFigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r4.getID()
            if (r5 != r2) goto L2f
            r6.setFigureOrder(r4, r0)
        L2f:
            int r3 = r3 + (-1)
            goto L1c
        L32:
            int r0 = r0 + 1
            goto Lc
        L35:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setIsFirstFrame(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setIsLastFrame(boolean r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setNextFrame(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            org.fortheloss.sticknodes.data.MCFrameData r1 = (org.fortheloss.sticknodes.data.MCFrameData) r1
            r0._nextFrameRef = r1
            if (r1 == 0) goto L8
            r1._previousFrameRef = r0
        L8:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setPreviousFrame(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            org.fortheloss.sticknodes.data.MCFrameData r1 = (org.fortheloss.sticknodes.data.MCFrameData) r1
            r0._previousFrameRef = r1
            if (r1 == 0) goto L8
            r1._nextFrameRef = r0
        L8:
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r2) {
            r1 = this;
            int r0 = r2.soundLibraryID
            r1._soundLibraryID = r0
            float r0 = r2.soundVolume
            r1._soundVolume = r0
            float r0 = r2.soundPan
            r1._soundPan = r0
            float r2 = r2.soundPitch
            r1._soundPitch = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundPan(float r3) {
            r2 = this;
            r2._soundPan = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundPan = r0
            goto L13
        Lb:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2._soundPan = r0
        L13:
            float r3 = r2._soundPan
            r0 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundPan = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundPitch(float r3) {
            r2 = this;
            r2._soundPitch = r3
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundPitch = r0
            goto L13
        Lb:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            r2._soundPitch = r0
        L13:
            float r3 = r2._soundPitch
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundPitch = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundToPlay(int r1) {
            r0 = this;
            r0._soundLibraryID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void setSoundVolume(float r3) {
            r2 = this;
            r2._soundVolume = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
            r2._soundVolume = r0
            goto L14
        Lb:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L14
            r2._soundVolume = r0
        L14:
            float r3 = r2._soundVolume
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._soundVolume = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void sortFiguresArrayByLayerOrder(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.MCFrameData$1 r0 = new org.fortheloss.sticknodes.data.MCFrameData$1
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void swapFigures(int r3, int r4) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._drawableFigures
            java.lang.Object r1 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            java.lang.Object r0 = r0.set(r3, r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._drawableFigures
            r1.set(r4, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            java.lang.Object r1 = r0.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            java.lang.Object r3 = r0.set(r3, r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._tweenedDrawableFigures
            r0.set(r4, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.IFrameData
    public void tweenEverything(org.fortheloss.sticknodes.data.IFrameData r9, org.fortheloss.sticknodes.data.IFrameData r10, float r11) {
            r8 = this;
            org.fortheloss.sticknodes.data.MCFrameData r10 = (org.fortheloss.sticknodes.data.MCFrameData) r10
            java.util.ArrayList r10 = r10.getDrawableFigures()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r8._drawableFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Le:
            r1 = 0
            if (r0 < 0) goto Lce
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r8._drawableFigures
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r3 = r10.size()
            int r3 = r3 + (-1)
        L1f:
            if (r3 < 0) goto L36
            java.lang.Object r4 = r10.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r5 = r4.getID()
            int r6 = r2.getID()
            if (r5 != r6) goto L33
            r1 = r4
            goto L36
        L33:
            int r3 = r3 + (-1)
            goto L1f
        L36:
            if (r1 != 0) goto L55
            r8.deleteFigure(r2)
            boolean r1 = r2.isJoined()
            if (r1 == 0) goto L44
            r2.unjoin()
        L44:
            boolean r1 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto Lca
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            boolean r1 = r2.hasJoinAnchorNode()
            if (r1 == 0) goto Lca
            r2.removeAllJoinedFigures()
            goto Lca
        L55:
            boolean r3 = r2.isJoined()
            if (r3 == 0) goto La1
            boolean r3 = r1.isJoined()
            if (r3 != 0) goto L68
            r2.unjoin()
            r8.onFigureUnjoined(r2)
            goto La1
        L68:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r3.getStickfigure()
            int r3 = r3.getID()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            int r4 = r4.getID()
            if (r3 == r4) goto L89
            r2.unjoin()
            r8.onFigureUnjoined(r2)
            goto La1
        L89:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getJoinedToNode()
            int r3 = r3.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r1.getJoinedToNode()
            int r4 = r4.getDrawOrderIndex()
            if (r3 == r4) goto La1
            r2.unjoin()
            r8.onFigureUnjoined(r2)
        La1:
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto Lc6
            r3 = r9
            org.fortheloss.sticknodes.data.MCFrameData r3 = (org.fortheloss.sticknodes.data.MCFrameData) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r3._drawableFigures
            int r4 = r2.getID()
            int r5 = r3.size()
            int r5 = r5 + (-1)
        Lb4:
            if (r5 < 0) goto Lc6
            java.lang.Object r6 = r3.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            int r7 = r6.getID()
            if (r7 != r4) goto Lc3
            goto Lc7
        Lc3:
            int r5 = r5 + (-1)
            goto Lb4
        Lc6:
            r6 = r2
        Lc7:
            r2.interpolateValues(r11, r6, r1)
        Lca:
            int r0 = r0 + (-1)
            goto Le
        Lce:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r9 = r8._drawableFigures
            int r9 = r9.size()
            int r9 = r9 + (-1)
        Ld6:
            if (r9 < 0) goto L126
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r11 = r8._drawableFigures
            java.lang.Object r11 = r11.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            int r0 = r10.size()
            int r0 = r0 + (-1)
        Le6:
            if (r0 < 0) goto Lfc
            java.lang.Object r2 = r10.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            int r3 = r2.getID()
            int r4 = r11.getID()
            if (r3 != r4) goto Lf9
            goto Lfd
        Lf9:
            int r0 = r0 + (-1)
            goto Le6
        Lfc:
            r2 = r1
        Lfd:
            boolean r0 = r11 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r0 == 0) goto L123
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r11
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11.getLockedStickNode()
            if (r0 == 0) goto L123
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getLockedStickNode()
            if (r2 == 0) goto L120
            int r2 = r2.getDrawOrderIndex()
            int r0 = r0.getDrawOrderIndex()
            if (r2 == r0) goto L11c
            goto L120
        L11c:
            r11.repositionBasedOnLockedStickNode()
            goto L123
        L120:
            r11.unlockStickNode()
        L123:
            int r9 = r9 + (-1)
            goto Ld6
        L126:
            return
    }

    public void tweenFigures(java.util.ArrayList<java.lang.Integer> r7, java.util.ArrayList<java.lang.Integer> r8, float r9, boolean r10) {
            r6 = this;
            if (r10 == 0) goto L9
            float r10 = r6._lastTimeTweenedAmount
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 != 0) goto L9
            return
        L9:
            r6._lastTimeTweenedAmount = r9
            if (r8 != 0) goto Le
            return
        Le:
            r10 = 0
            int r0 = r7.size()
        L13:
            if (r10 >= r0) goto L5e
            java.lang.Object r1 = r7.get(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r8.get(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._drawableFigures
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._tweenedDrawableFigures
            java.lang.Object r1 = r4.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r4 = 0
            if (r2 < 0) goto L48
            org.fortheloss.sticknodes.data.MCFrameData r4 = r6._nextFrameRef
            java.util.ArrayList r4 = r4.getDrawableFigures()
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
        L48:
            r5 = -1
            if (r2 != r5) goto L55
            boolean r2 = r3.isPersistent()
            if (r2 != 0) goto L55
            r1.doNotDraw()
            goto L5b
        L55:
            r1.interpolateValues(r9, r3, r4)
            r1.validateDirtyNodes()
        L5b:
            int r10 = r10 + 1
            goto L13
        L5e:
            return
    }
}
