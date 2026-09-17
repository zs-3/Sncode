package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public abstract class StickNode implements org.fortheloss.sticknodes.stickfigure.INode, org.fortheloss.sticknodes.stickfigure.IPolyNode {
    public static float CULLING_CENTER_X;
    public static float CULLING_CENTER_Y;
    public static float CULLING_DISTANCE_SQUARED;
    public static int LAST_USER_SET_CONNECTOR_SHAPE;
    public static boolean LAST_USER_SET_HALF_ARC;
    public static short LAST_USER_SET_NUM_POLYGON_VERTICES;
    public static short LAST_USER_SET_RIGHT_TRIANGLE_DIRECTION;
    public static boolean LAST_USER_SET_RIGHT_TRIANGLE_UPSIDE_DOWN;
    public static boolean LAST_USER_SET_TRAPEZOID_ROUNDED_1;
    public static boolean LAST_USER_SET_TRAPEZOID_ROUNDED_2;
    public static final int NODE_CLICK_SIZE_SQUARED = 0;
    public static final int NODE_CLICK_SIZE_SQUARED_MOBILE = 0;
    private static final com.badlogic.gdx.math.EarClippingTriangulator _earClippingTriangulator = null;
    private static final com.badlogic.gdx.utils.FloatArray _pointsForEarClipping = null;
    private static final com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.stickfigure.CurveNode> _poolCurveNodes = null;
    private static final com.badlogic.gdx.graphics.Color _staticColorRef1 = null;
    private static final com.badlogic.gdx.graphics.Color _staticColorRef2 = null;
    private static final java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> _sticknodeArrayListTemp = null;
    protected float _angle;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _childrenNodes;
    private com.badlogic.gdx.graphics.Color _colorRef1;
    private com.badlogic.gdx.graphics.Color _colorRef2;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _completePolynodeChildrenRefs;
    protected float _cosAngle;
    protected int _curveRadius;
    protected float _defaultAngle;
    protected int _defaultCurveRadius;
    protected float _defaultLocalAngle;
    private boolean _filledCircleIntoCircleFlag;
    protected boolean _flipFlag;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _joinedFigureRefs;
    protected float _localAngle;
    protected float _localX;
    protected float _localY;
    private org.fortheloss.sticknodes.stickfigure.StickNode _parentNodeRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _polyAnchorParentRefs;
    private com.badlogic.gdx.graphics.Color _polyfillColorRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _polynodeChildrenRefs;
    protected boolean _positionIsDirty;
    protected short _rightTriangleDirection;
    protected float _sinAngle;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureRef;
    private short[] _triangulatedPolynodeChildrenDrawOrder;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> _triangulatedPolynodeChildrenRefs;
    protected float _x;
    protected float _y;
    protected float mAngleLockOffset;
    private org.fortheloss.sticknodes.stickfigure.StickNode mAngleLockRelativeRememberedParentNodeRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> mConnectorAttachments;
    private org.fortheloss.sticknodes.stickfigure.Connector mConnectorChildRef;
    protected float mDragLockAngle;
    protected boolean mGradientReversed;
    private boolean mIsDragLocked;



    static {
            r0 = 1139361711(0x43e947af, float:466.56003)
            int r0 = java.lang.Math.round(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode.NODE_CLICK_SIZE_SQUARED = r0
            r0 = 1168244736(0x45a20000, float:5184.0)
            int r0 = java.lang.Math.round(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode.NODE_CLICK_SIZE_SQUARED_MOBILE = r0
            r0 = 0
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED = r0
            r0 = 0
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_HALF_ARC = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_DIRECTION = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_UPSIDE_DOWN = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_1 = r0
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_2 = r0
            r1 = 5
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_NUM_POLYGON_VERTICES = r1
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_CONNECTOR_SHAPE = r0
            com.badlogic.gdx.math.EarClippingTriangulator r1 = new com.badlogic.gdx.math.EarClippingTriangulator
            r1.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode._earClippingTriangulator = r1
            com.badlogic.gdx.utils.FloatArray r1 = new com.badlogic.gdx.utils.FloatArray
            r2 = 1600(0x640, float:2.242E-42)
            r1.<init>(r0, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1 = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp = r1
            org.fortheloss.sticknodes.stickfigure.StickNode$1 r1 = new org.fortheloss.sticknodes.stickfigure.StickNode$1
            r2 = 50
            r1.<init>(r0, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode._poolCurveNodes = r1
            return
    }

    public StickNode(org.fortheloss.sticknodes.stickfigure.Stickfigure r3, org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._x = r0
            r2._y = r0
            r2._localX = r0
            r2._localY = r0
            r1 = 0
            r2._curveRadius = r1
            r2._defaultCurveRadius = r1
            r2._localAngle = r0
            r2._angle = r0
            r2._defaultAngle = r0
            r2._defaultLocalAngle = r0
            r2._cosAngle = r0
            r2._sinAngle = r0
            r2.mAngleLockOffset = r0
            r2.mDragLockAngle = r0
            r2._rightTriangleDirection = r1
            r2.mIsDragLocked = r1
            r2.mGradientReversed = r1
            r2._positionIsDirty = r1
            r2._flipFlag = r1
            r2._filledCircleIntoCircleFlag = r1
            r2._stickfigureRef = r3
            r2._parentNodeRef = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2._childrenNodes = r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2._stickfigureRef
            com.badlogic.gdx.graphics.Color r3 = r3.getColor()
            r2._colorRef1 = r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2._stickfigureRef
            com.badlogic.gdx.graphics.Color r3 = r3.getColor()
            r2._colorRef2 = r3
            com.badlogic.gdx.graphics.Color r3 = r2.getValColorPolyfill()
            r2._polyfillColorRef = r3
            return
    }

    public StickNode(org.fortheloss.sticknodes.stickfigure.Stickfigure r3, org.fortheloss.sticknodes.stickfigure.StickNode r4, float r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._x = r0
            r2._y = r0
            r2._localX = r0
            r2._localY = r0
            r1 = 0
            r2._curveRadius = r1
            r2._defaultCurveRadius = r1
            r2._localAngle = r0
            r2._angle = r0
            r2._defaultAngle = r0
            r2._defaultLocalAngle = r0
            r2._cosAngle = r0
            r2._sinAngle = r0
            r2.mAngleLockOffset = r0
            r2.mDragLockAngle = r0
            r2._rightTriangleDirection = r1
            r2.mIsDragLocked = r1
            r2.mGradientReversed = r1
            r2._positionIsDirty = r1
            r2._flipFlag = r1
            r2._filledCircleIntoCircleFlag = r1
            r2._stickfigureRef = r3
            r2._parentNodeRef = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2._childrenNodes = r3
            r2._defaultLocalAngle = r5
            r2._localAngle = r5
            r3 = 2
            if (r6 == r3) goto L5e
            r3 = 5
            if (r6 != r3) goto L43
            goto L5e
        L43:
            r3 = 3
            if (r6 != r3) goto L50
            short r3 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_DIRECTION
            r2._rightTriangleDirection = r3
            boolean r3 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_UPSIDE_DOWN
            r2.setValTriangleUpsideDown(r3)
            goto L63
        L50:
            r3 = 6
            if (r6 != r3) goto L63
            boolean r3 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_1
            r2.setValTrapezoidIsRounded1(r3)
            boolean r3 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_2
            r2.setValTrapezoidIsRounded2(r3)
            goto L63
        L5e:
            boolean r3 = org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_HALF_ARC
            r2.setValHalfArc(r3)
        L63:
            return
    }

    public StickNode(org.fortheloss.sticknodes.stickfigure.Stickfigure r11, org.fortheloss.sticknodes.stickfigure.StickNode r12, org.fortheloss.sticknodes.stickfigure.StickNode r13, boolean r14, boolean r15) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10._x = r0
            r10._y = r0
            r10._localX = r0
            r10._localY = r0
            r1 = 0
            r10._curveRadius = r1
            r10._defaultCurveRadius = r1
            r10._localAngle = r0
            r10._angle = r0
            r10._defaultAngle = r0
            r10._defaultLocalAngle = r0
            r10._cosAngle = r0
            r10._sinAngle = r0
            r10.mAngleLockOffset = r0
            r10.mDragLockAngle = r0
            r10._rightTriangleDirection = r1
            r10.mIsDragLocked = r1
            r10.mGradientReversed = r1
            r10._flipFlag = r1
            r10._filledCircleIntoCircleFlag = r1
            r10._parentNodeRef = r12
            r10._stickfigureRef = r11
            r10._positionIsDirty = r1
            boolean r11 = r13.mGradientReversed
            r10.mGradientReversed = r11
            boolean r11 = r13.mIsDragLocked
            r10.mIsDragLocked = r11
            float r11 = r13.mAngleLockOffset
            r10.mAngleLockOffset = r11
            float r11 = r13.mDragLockAngle
            r10.mDragLockAngle = r11
            float r11 = r13._x
            r10._x = r11
            float r11 = r13._y
            r10._y = r11
            float r11 = r13._localX
            r10._localX = r11
            float r11 = r13._localY
            r10._localY = r11
            int r11 = r13._curveRadius
            r10._curveRadius = r11
            int r11 = r13._defaultCurveRadius
            r10._defaultCurveRadius = r11
            short r11 = r13._rightTriangleDirection
            r10._rightTriangleDirection = r11
            float r11 = r13._defaultLocalAngle
            r10._defaultLocalAngle = r11
            float r11 = r13._localAngle
            r10._localAngle = r11
            float r11 = r13._defaultAngle
            r10._defaultAngle = r11
            float r11 = r13._angle
            r10._angle = r11
            float r11 = r13._cosAngle
            r10._cosAngle = r11
            float r11 = r13._sinAngle
            r10._sinAngle = r11
            boolean r11 = r13._filledCircleIntoCircleFlag
            r10._filledCircleIntoCircleFlag = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r12 = r13._childrenNodes
            int r12 = r12.size()
            r11.<init>(r12)
            r10._childrenNodes = r11
            r11 = 0
            r10._triangulatedPolynodeChildrenRefs = r11
            r10._completePolynodeChildrenRefs = r11
            r10._polynodeChildrenRefs = r11
            r10._polyAnchorParentRefs = r11
            r10._triangulatedPolynodeChildrenDrawOrder = r11
            r10._joinedFigureRefs = r11
            if (r14 == 0) goto L15c
            java.lang.Class<java.util.LinkedList> r11 = java.util.LinkedList.class
            java.lang.Object r11 = com.badlogic.gdx.utils.Pools.obtain(r11)
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            r11.add(r13)
            r11.add(r10)
        La3:
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L156
            java.lang.Object r12 = r11.remove()
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = (org.fortheloss.sticknodes.stickfigure.StickNode) r12
            java.lang.Object r13 = r11.remove()
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = (org.fortheloss.sticknodes.stickfigure.StickNode) r13
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r14 = r12._childrenNodes
            int r14 = r14.size()
            r0 = 0
        Lbc:
            if (r0 >= r14) goto La3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r12._childrenNodes
            java.lang.Object r2 = r2.get(r0)
            r8 = r2
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            if (r15 != 0) goto L127
            boolean r2 = r8.isStatic()
            if (r2 != 0) goto Ld0
            goto L127
        Ld0:
            boolean r2 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r2 == 0) goto Le1
            org.fortheloss.sticknodes.stickfigure.ConnectorStatic r2 = new org.fortheloss.sticknodes.stickfigure.ConnectorStatic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r10._stickfigureRef
            r2.<init>(r3, r13, r8, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.addChildNode(r2, r1)
            goto L14c
        Le1:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r8.getParentNode()
        Le5:
            r3 = 1
            if (r2 == 0) goto L10c
            boolean r4 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 == 0) goto Lfa
            boolean r4 = r2.isSmartStretch()
            if (r4 == 0) goto Lf3
            goto L10d
        Lf3:
            boolean r3 = r2.getDoNotApplySmartStretch()
            if (r3 == 0) goto L107
            goto L10c
        Lfa:
            boolean r4 = r2.isStatic()
            if (r4 != 0) goto L107
            boolean r2 = r2.isSmartStretch()
            if (r2 == 0) goto L10c
            goto L10d
        L107:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getParentNode()
            goto Le5
        L10c:
            r3 = 0
        L10d:
            if (r3 == 0) goto L11b
            org.fortheloss.sticknodes.stickfigure.StickNodeStaticSS r2 = new org.fortheloss.sticknodes.stickfigure.StickNodeStaticSS
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r10._stickfigureRef
            r2.<init>(r3, r13, r8, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.addChildNode(r2, r1)
            goto L14c
        L11b:
            org.fortheloss.sticknodes.stickfigure.StickNodeStatic r2 = new org.fortheloss.sticknodes.stickfigure.StickNodeStatic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r10._stickfigureRef
            r2.<init>(r3, r13, r8, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.addChildNode(r2, r1)
            goto L14c
        L127:
            boolean r2 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r2 == 0) goto L13c
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r9 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r10._stickfigureRef
            r6 = 0
            r2 = r9
            r4 = r13
            r5 = r8
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.addChildNode(r9, r1)
            goto L14c
        L13c:
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r9 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r10._stickfigureRef
            r6 = 0
            r2 = r9
            r4 = r13
            r5 = r8
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r13.addChildNode(r9, r1)
        L14c:
            r11.add(r8)
            r11.add(r2)
            int r0 = r0 + 1
            goto Lbc
        L156:
            r11.clear()
            com.badlogic.gdx.utils.Pools.free(r11)
        L15c:
            return
    }

    private void actuallyApply252SmartStretchFix(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            java.lang.Class<java.util.Stack> r5 = java.util.Stack.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            java.util.Stack r5 = (java.util.Stack) r5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r4._childrenNodes
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L10:
            if (r0 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._childrenNodes
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r5.push(r2)
            int r0 = r0 + (-1)
            goto L10
        L20:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L4c
            java.lang.Object r0 = r5.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r2 = r0.getValIsStretchy()
            if (r2 != 0) goto L35
            r0.setValSmartStretchDoNotApply(r1)
        L35:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r0._childrenNodes
            int r2 = r2.size()
            int r2 = r2 - r1
        L3c:
            if (r2 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r5.push(r3)
            int r2 = r2 + (-1)
            goto L3c
        L4c:
            r5.clear()
            com.badlogic.gdx.utils.Pools.free(r5)
            return
    }

    private void actuallyFlip(boolean r8) {
            r7 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            r0.push(r7)
        L13:
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L7a
            java.lang.Object r2 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r2._flipFlag = r3
            boolean r4 = r2.getIsAngleLocked()
            if (r4 == 0) goto L40
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r2.mAngleLockRelativeRememberedParentNodeRef
            if (r4 == 0) goto L40
            boolean r4 = r4._flipFlag
            if (r4 == 0) goto L40
            float r4 = r2.mAngleLockOffset
            float r4 = -r4
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r5
            r2.mAngleLockOffset = r4
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L40
            float r4 = r4 + r5
            r2.mAngleLockOffset = r4
        L40:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r2._childrenNodes
            int r4 = r4.size()
            int r4 = r4 - r3
        L47:
            if (r4 < 0) goto L59
            java.util.ArrayList r5 = r2.getChildrenNodes()
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r0.push(r5)
            int r4 = r4 + (-1)
            goto L47
        L59:
            boolean r4 = r2.isJoinAnchor()
            if (r4 == 0) goto L13
            java.util.ArrayList r4 = r2.getJoinedFigures()
            int r4 = r4.size()
            int r4 = r4 - r3
        L68:
            if (r4 < 0) goto L13
            java.util.ArrayList r3 = r2.getJoinedFigures()
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r1.push(r3)
            int r4 = r4 + (-1)
            goto L68
        L7a:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
        L80:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lcc
            java.lang.Object r0 = r1.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L9a
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getMainNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.actuallyFlip(r8)
            goto L80
        L9a:
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto Lbe
            if (r8 == 0) goto Laf
            r2 = r0
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            float r0 = r0.getAngle()
            r2.flipX(r0, r3)
            goto L80
        Laf:
            r2 = r0
            org.fortheloss.sticknodes.movieclip.MCReference r2 = (org.fortheloss.sticknodes.movieclip.MCReference) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            float r0 = r0.getAngle()
            r2.flipY(r0, r3)
            goto L80
        Lbe:
            if (r8 == 0) goto Lc6
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r0.flipX(r3, r3)
            goto L80
        Lc6:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            r0.flipY(r3, r3)
            goto L80
        Lcc:
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            return
    }

    private void appendAllToDrawOrderArray(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r3)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L36
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r3._stickfigureRef
            r2.addNodeToDrawOrderAfter(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r1._childrenNodes
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L24:
            if (r4 < 0) goto L34
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            java.lang.Object r2 = r2.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.push(r2)
            int r4 = r4 + (-1)
            goto L24
        L34:
            r4 = r1
            goto Lb
        L36:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    private void drawPolyfill(org.fortheloss.sticknodes.SNShapeRenderer r17, float r18, float r19, float r20) {
            r16 = this;
            r0 = r16
            short[] r1 = r0._triangulatedPolynodeChildrenDrawOrder
            if (r1 == 0) goto Le
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._polynodeChildrenRefs
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L11
        Le:
            r16.recalculatePolyfillTriangles()
        L11:
            short[] r1 = r0._triangulatedPolynodeChildrenDrawOrder
            if (r1 != 0) goto L16
            return
        L16:
            int r1 = r1.length
            int r1 = r1 / 3
            r2 = 0
        L1a:
            if (r2 >= r1) goto L81
            short[] r3 = r0._triangulatedPolynodeChildrenDrawOrder
            int r4 = r2 * 3
            short r3 = r3[r4]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r5 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r3 = r5.get(r3)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r3 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r3
            short[] r5 = r0._triangulatedPolynodeChildrenDrawOrder
            int r6 = r4 + 1
            short r5 = r5[r6]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r6 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r5 = r6.get(r5)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r5 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r5
            short[] r6 = r0._triangulatedPolynodeChildrenDrawOrder
            int r4 = r4 + 2
            short r4 = r6[r4]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r6 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r4 = r6.get(r4)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r4 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r4
            float r6 = r3.getX()
            float r6 = r6 * r20
            float r8 = r18 + r6
            float r3 = r3.getY()
            float r3 = r3 * r20
            float r9 = r19 + r3
            float r3 = r5.getX()
            float r3 = r3 * r20
            float r10 = r18 + r3
            float r3 = r5.getY()
            float r3 = r3 * r20
            float r11 = r19 + r3
            float r3 = r4.getX()
            float r3 = r3 * r20
            float r12 = r18 + r3
            float r3 = r4.getY()
            float r3 = r3 * r20
            float r13 = r19 + r3
            com.badlogic.gdx.graphics.Color r15 = r0._polyfillColorRef
            r7 = r17
            r14 = r15
            r7.triangle(r8, r9, r10, r11, r12, r13, r14, r15)
            int r2 = r2 + 1
            goto L1a
        L81:
            return
    }

    private void drawPolyfillAA(org.fortheloss.sticknodes.SNShapeRenderer r26, float r27, float r28, float r29) {
            r25 = this;
            r0 = r25
            short[] r1 = r0._triangulatedPolynodeChildrenDrawOrder
            if (r1 != 0) goto L9
            r25.recalculatePolyfillTriangles()
        L9:
            short[] r1 = r0._triangulatedPolynodeChildrenDrawOrder
            if (r1 != 0) goto Le
            return
        Le:
            int r1 = r1.length
            int r1 = r1 / 3
            r2 = 0
        L12:
            if (r2 >= r1) goto Lff
            short[] r3 = r0._triangulatedPolynodeChildrenDrawOrder
            int r4 = r2 * 3
            short r3 = r3[r4]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r5 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r3 = r5.get(r3)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r3 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r3
            short[] r5 = r0._triangulatedPolynodeChildrenDrawOrder
            int r6 = r4 + 1
            short r5 = r5[r6]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r6 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r5 = r6.get(r5)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r5 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r5
            short[] r6 = r0._triangulatedPolynodeChildrenDrawOrder
            int r4 = r4 + 2
            short r4 = r6[r4]
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r6 = r0._triangulatedPolynodeChildrenRefs
            java.lang.Object r4 = r6.get(r4)
            org.fortheloss.sticknodes.stickfigure.IPolyNode r4 = (org.fortheloss.sticknodes.stickfigure.IPolyNode) r4
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            r7 = 1
            r8 = 1
        L43:
            r9 = 5
            if (r8 > r9) goto Lbf
            r9 = -1
            r10 = -1
        L48:
            if (r10 > r7) goto Lb9
            r11 = -1
        L4b:
            if (r11 > r7) goto Lb3
            if (r10 != 0) goto L52
            if (r11 != 0) goto L52
            goto Lad
        L52:
            float r12 = (float) r10
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r13
            float r12 = r12 * r6
            float r14 = (float) r8
            float r12 = r12 * r14
            float r15 = (float) r11
            float r15 = r15 * r13
            float r15 = r15 * r6
            float r15 = r15 * r14
            r13 = 1036831949(0x3dcccccd, float:0.1)
            com.badlogic.gdx.graphics.Color r14 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r6 = r0._polyfillColorRef
            r14.set(r6)
            r14.mul(r13)
            float r6 = r27 + r12
            float r12 = r3.getX()
            float r12 = r12 * r29
            float r17 = r6 + r12
            float r12 = r28 + r15
            float r13 = r3.getY()
            float r13 = r13 * r29
            float r18 = r12 + r13
            float r13 = r5.getX()
            float r13 = r13 * r29
            float r19 = r6 + r13
            float r13 = r5.getY()
            float r13 = r13 * r29
            float r20 = r12 + r13
            float r13 = r4.getX()
            float r13 = r13 * r29
            float r21 = r6 + r13
            float r6 = r4.getY()
            float r6 = r6 * r29
            float r22 = r12 + r6
            r16 = r26
            r23 = r14
            r24 = r14
            r16.triangle(r17, r18, r19, r20, r21, r22, r23, r24)
        Lad:
            int r11 = r11 + 1
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            goto L4b
        Lb3:
            int r10 = r10 + 1
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            goto L48
        Lb9:
            int r8 = r8 + 1
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            goto L43
        Lbf:
            com.badlogic.gdx.graphics.Color r6 = r0._polyfillColorRef
            r14 = r26
            r14.setColor(r6)
            float r6 = r3.getX()
            float r6 = r6 * r29
            float r8 = r27 + r6
            float r3 = r3.getY()
            float r3 = r3 * r29
            float r9 = r28 + r3
            float r3 = r5.getX()
            float r3 = r3 * r29
            float r10 = r27 + r3
            float r3 = r5.getY()
            float r3 = r3 * r29
            float r11 = r28 + r3
            float r3 = r4.getX()
            float r3 = r3 * r29
            float r12 = r27 + r3
            float r3 = r4.getY()
            float r3 = r3 * r29
            float r13 = r28 + r3
            r7 = r26
            r7.triangle(r8, r9, r10, r11, r12, r13)
            int r2 = r2 + 1
            goto L12
        Lff:
            return
    }

    private void getCurveNodes(java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r8, com.badlogic.gdx.utils.FloatArray r9, org.fortheloss.sticknodes.stickfigure.StickNode r10, boolean r11, float r12) {
            r7 = this;
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.getCurveNodes(r1, r2, r3, r4, r5, r6)
            return
    }

    private void getCurveNodes(java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r24, com.badlogic.gdx.utils.FloatArray r25, org.fortheloss.sticknodes.stickfigure.StickNode r26, boolean r27, float r28, int r29) {
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r26.getParentNode()
            float r4 = r3.getGlobalX()
            float r5 = r3.getGlobalY()
            boolean r6 = r26.getValUseSegmentScale()
            if (r6 == 0) goto L25
            float r6 = r26.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r2._stickfigureRef
            float r7 = r7.getScale()
            float r6 = r6 * r7
            goto L2b
        L25:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r2._stickfigureRef
            float r6 = r6.getScale()
        L2b:
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r7
            float r7 = r26.getLength()
            float r7 = r7 * r6
            int r8 = r2._curveRadius
            float r8 = (float) r8
            float r8 = r8 * r6
            boolean r6 = r26.getValSegmentCurveCirculization()
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1
            if (r29 <= 0) goto L46
            r11 = r29
            goto L63
        L46:
            r11 = 1098907648(0x41800000, float:16.0)
            float r12 = r7 * r9
            float r13 = java.lang.Math.abs(r8)
            float r13 = r13 * r9
            float r12 = java.lang.Math.max(r12, r13)
            double r12 = (double) r12
            double r12 = java.lang.Math.cbrt(r12)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r12 = r12 * r9
            int r11 = (int) r12
            int r11 = java.lang.Math.max(r10, r11)
        L63:
            float r12 = r26.getAngle()
            float r13 = org.fortheloss.framework.CustomMathUtils.cosDeg(r12)
            float r14 = org.fortheloss.framework.CustomMathUtils.sinDeg(r12)
            r15 = 0
            int r15 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r15 >= 0) goto L90
            float r8 = java.lang.Math.abs(r8)
            float r3 = r13 * r7
            float r4 = r4 + r3
            float r3 = r14 * r7
            float r5 = r5 + r3
            float r13 = -r13
            float r14 = -r14
            r3 = 1127481344(0x43340000, float:180.0)
            float r12 = r12 - r3
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L8d
            org.fortheloss.sticknodes.stickfigure.Connector r2 = (org.fortheloss.sticknodes.stickfigure.Connector) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getEndNode()
        L8d:
            r3 = r27 ^ 1
            goto L93
        L90:
            r2 = r3
            r3 = r27
        L93:
            float r9 = r9 * r7
            float r15 = r13 * r9
            float r15 = r15 + r4
            r17 = r11
            double r10 = (double) r15
            float r15 = r14 * r9
            float r15 = r15 + r5
            r26 = r10
            double r10 = (double) r15
            r15 = 1113927392(0x42652ee0, float:57.295776)
            r18 = 1073741824(0x40000000, float:2.0)
            if (r6 != 0) goto L148
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 >= 0) goto Lae
            goto L148
        Lae:
            r6 = r17
            float r10 = (float) r6
            float r7 = r7 / r10
            int r11 = r6 + (-1)
            if (r29 <= 0) goto Lb8
            r1 = 1
            goto Lcf
        Lb8:
            float r10 = (float) r11
            float r11 = r10 * r28
            float r11 = r10 / r11
            int r11 = java.lang.Math.round(r11)
            float r10 = r10 / r18
            double r0 = (double) r10
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = 1
            int r0 = com.badlogic.gdx.math.MathUtils.clamp(r11, r1, r0)
            r1 = r0
        Lcf:
            r10 = 1
        Ld0:
            if (r10 >= r6) goto L220
            if (r3 != 0) goto Ldb
            int r0 = r10 - r6
            int r0 = java.lang.Math.abs(r0)
            goto Ldc
        Ldb:
            r0 = r10
        Ldc:
            float r0 = (float) r0
            float r0 = r0 * r7
            float r0 = r0 / r9
            r11 = 1070141403(0x3fc90fdb, float:1.5707964)
            float r0 = r0 * r11
            float r0 = org.fortheloss.framework.CustomMathUtils.cos(r0)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r0 = r11 - r0
            float r0 = r0 * r9
            float r0 = r0 - r9
            float r12 = r0 / r9
            float r12 = r12 * r12
            float r11 = r11 - r12
            double r11 = (double) r11
            double r11 = java.lang.Math.sqrt(r11)
            float r11 = (float) r11
            float r11 = r11 * r8
            float r0 = r0 + r9
            float r12 = r0 * r13
            float r12 = r12 + r4
            float r16 = r11 * r14
            float r12 = r12 - r16
            float r0 = r0 * r14
            float r0 = r0 + r5
            float r11 = r11 * r13
            float r0 = r0 + r11
            float r11 = r12 - r4
            r26 = r7
            float r7 = r0 - r5
            float r16 = com.badlogic.gdx.math.MathUtils.atan2(r7, r11)
            r17 = r3
            float r3 = r16 * r15
            float r11 = r11 * r11
            float r7 = r7 * r7
            float r11 = r11 + r7
            r19 = r6
            double r6 = (double) r11
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.stickfigure.CurveNode> r7 = org.fortheloss.sticknodes.stickfigure.StickNode._poolCurveNodes
            java.lang.Object r7 = r7.obtain()
            org.fortheloss.sticknodes.stickfigure.CurveNode r7 = (org.fortheloss.sticknodes.stickfigure.CurveNode) r7
            r7.set(r2, r3, r6)
            r3 = r24
            if (r3 == 0) goto L138
            r3.add(r7)
        L138:
            r6 = r25
            r6.add(r12)
            r6.add(r0)
            int r10 = r10 + r1
            r7 = r26
            r3 = r17
            r6 = r19
            goto Ld0
        L148:
            r6 = r1
            r19 = r17
            r17 = r3
            r3 = r0
            float r0 = com.badlogic.gdx.math.MathUtils.atan2(r8, r9)
            float r0 = r0 * r18
            float r0 = r0 * r15
            double r0 = (double) r0
            r7 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r7 = r7 - r0
            r20 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r7 = r7 * r20
            double r7 = java.lang.Math.tan(r7)
            r20 = r2
            double r2 = (double) r9
            double r7 = r7 * r2
            double r2 = (double) r14
            double r2 = r2 * r7
            r21 = r26
            double r2 = r21 + r2
            double r13 = (double) r13
            double r13 = r13 * r7
            double r10 = r10 - r13
            double r7 = (double) r4
            double r7 = r2 - r7
            double r13 = (double) r5
            double r13 = r10 - r13
            double r7 = r7 * r7
            double r13 = r13 * r13
            double r7 = r7 + r13
            double r7 = java.lang.Math.sqrt(r7)
            r9 = 1119092736(0x42b40000, float:90.0)
            float r12 = r12 + r9
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r13
            r9 = r19
            double r13 = (double) r9
            double r0 = r0 / r13
            float r0 = (float) r0
            int r1 = r9 / 2
            int r13 = r9 + (-1)
            if (r29 <= 0) goto L19d
            r27 = r13
            r13 = 1
            goto L1b5
        L19d:
            float r14 = (float) r13
            float r19 = r14 * r28
            float r19 = r14 / r19
            int r15 = java.lang.Math.round(r19)
            float r14 = r14 / r18
            r27 = r13
            double r13 = (double) r14
            double r13 = java.lang.Math.ceil(r13)
            int r13 = (int) r13
            r14 = 1
            int r13 = com.badlogic.gdx.math.MathUtils.clamp(r15, r14, r13)
        L1b5:
            r14 = r27
        L1b7:
            if (r14 <= 0) goto L220
            if (r17 != 0) goto L1c2
            int r15 = r14 - r9
            int r15 = java.lang.Math.abs(r15)
            goto L1c3
        L1c2:
            r15 = r14
        L1c3:
            int r15 = r15 - r1
            float r15 = (float) r15
            float r15 = r15 * r0
            float r15 = r15 + r12
            r16 = r0
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r15)
            float r15 = org.fortheloss.framework.CustomMathUtils.sinDeg(r15)
            r27 = r1
            double r0 = (double) r0
            double r0 = r0 * r7
            double r0 = r0 + r2
            float r0 = (float) r0
            r18 = r2
            double r1 = (double) r15
            double r1 = r1 * r7
            double r1 = r1 + r10
            float r1 = (float) r1
            float r2 = r0 - r4
            float r3 = r1 - r5
            float r15 = com.badlogic.gdx.math.MathUtils.atan2(r3, r2)
            r21 = 1113927392(0x42652ee0, float:57.295776)
            float r15 = r15 * r21
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            com.badlogic.gdx.utils.Pool<org.fortheloss.sticknodes.stickfigure.CurveNode> r3 = org.fortheloss.sticknodes.stickfigure.StickNode._poolCurveNodes
            java.lang.Object r3 = r3.obtain()
            org.fortheloss.sticknodes.stickfigure.CurveNode r3 = (org.fortheloss.sticknodes.stickfigure.CurveNode) r3
            r26 = r4
            r4 = r20
            r3.set(r4, r15, r2)
            r2 = r24
            if (r2 == 0) goto L20e
            r2.add(r3)
        L20e:
            r6.add(r0)
            r6.add(r1)
            int r14 = r14 - r13
            r1 = r27
            r20 = r4
            r0 = r16
            r2 = r18
            r4 = r26
            goto L1b7
        L220:
            return
    }

    private void modify(int r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = -1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            r3 = 1
            switch(r7) {
                case 0: goto L1c3;
                case 1: goto L1bd;
                case 2: goto L1b7;
                case 3: goto L1ad;
                case 4: goto L1a3;
                case 5: goto L199;
                case 6: goto L18f;
                case 7: goto L185;
                case 8: goto L17b;
                case 9: goto L170;
                case 10: goto L15a;
                case 11: goto Le2;
                case 12: goto Ld1;
                case 13: goto Lc6;
                case 14: goto Lbb;
                case 15: goto Lf;
                case 16: goto Lf;
                case 17: goto Lb0;
                case 18: goto La5;
                case 19: goto L99;
                case 20: goto L84;
                case 21: goto Lf;
                case 22: goto L79;
                case 23: goto L6e;
                case 24: goto L62;
                case 25: goto L57;
                case 26: goto L4a;
                case 27: goto L3f;
                case 28: goto L33;
                case 29: goto L27;
                case 30: goto L1c;
                case 31: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L1ef
        L11:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setTrapezoidIsRounded2(r7)
            goto L1ef
        L1c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setTrapezoidIsRounded1(r7)
            goto L1ef
        L27:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            float r7 = (float) r7
            r6.setTrapezoidThickness2(r7, r1, r2)
            goto L1ef
        L33:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            float r7 = (float) r7
            r6.setTrapezoidThickness1(r7, r1, r2)
            goto L1ef
        L3f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setSegmentCurveCirculization(r7)
            goto L1ef
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r7 = r7 ^ r3
            short r7 = (short) r7
            r6.setGradientMode(r7)
            goto L1ef
        L57:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r6.setSegmentCurve(r7)
            goto L1ef
        L62:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            float r7 = (float) r7
            r6.setLength(r7)
            goto L1ef
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setTriangleUpsideDown(r7)
            goto L1ef
        L79:
            java.lang.Short r8 = (java.lang.Short) r8
            short r7 = r8.shortValue()
            r6.setNumPolygonVertices(r7)
            goto L1ef
        L84:
            short r7 = r6._rightTriangleDirection
            if (r7 != 0) goto L8a
            goto L1ef
        L8a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L93
            r0 = 1
        L93:
            short r7 = (short) r0
            r6.setRightTriangleDirection(r7)
            goto L1ef
        L99:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            short r7 = (short) r7
            r6.setRightTriangleDirection(r7)
            goto L1ef
        La5:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setHalfArc(r7)
            goto L1ef
        Lb0:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r6.setLimbType(r7)
            goto L1ef
        Lbb:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r6.setThickness(r7)
            goto L1ef
        Lc6:
            java.lang.Float r8 = (java.lang.Float) r8
            float r7 = r8.floatValue()
            r6.setScale(r7)
            goto L1ef
        Ld1:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            float r8 = r6.getLength()
            float r7 = (float) r7
            float r8 = r8 + r7
            r6.setLength(r8)
            goto L1ef
        Le2:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            int r8 = r6.getValLimbType()
            int r1 = r6.getValThickness()
            if (r1 != 0) goto Lf4
            r1 = 1
            goto Lf5
        Lf4:
            r1 = 0
        Lf5:
            r4 = 6
            if (r8 != r4) goto L10b
            float r1 = r6.getValTrapezoidThickness1()
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L10a
            float r1 = r6.getValTrapezoidThickness2()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L10a
            r2 = 1
        L10a:
            r1 = r2
        L10b:
            int r2 = java.lang.Math.abs(r7)
            r5 = 2
            if (r2 != r5) goto L122
            if (r1 == 0) goto L122
            if (r8 == 0) goto L1ef
            if (r8 == r3) goto L1ef
            r1 = 3
            if (r8 == r1) goto L1ef
            r1 = 5
            if (r8 == r1) goto L1ef
            if (r8 != r4) goto L122
            goto L1ef
        L122:
            if (r7 >= 0) goto L125
            goto L126
        L125:
            r0 = 1
        L126:
            if (r8 != r4) goto L14d
            float r7 = r6.getValTrapezoidThickness1()
            float r8 = r6.getValTrapezoidThickness2()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.max(r7, r1)
            float r1 = java.lang.Math.max(r8, r1)
            float r2 = r2 / r1
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 >= 0) goto L146
            float r7 = (float) r0
            float r8 = r8 + r7
            r6.setTrapezoidThickness2(r8, r2, r3)
            goto L1ef
        L146:
            float r8 = (float) r0
            float r7 = r7 + r8
            r6.setTrapezoidThickness1(r7, r2, r3)
            goto L1ef
        L14d:
            int r7 = r6.getThickness()
            int r7 = r7 + r0
            r6.setThickness(r7)
            r6.setDefaultThickness(r7)
            goto L1ef
        L15a:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            float r8 = r6.getScale()
            r0 = 1008981770(0x3c23d70a, float:0.01)
            float r7 = (float) r7
            float r7 = r7 * r0
            float r8 = r8 + r7
            r6.setScale(r8)
            goto L1ef
        L170:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setReverseGradient(r7)
            goto L1ef
        L17b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.useGradient(r7)
            goto L1ef
        L185:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.useSegmentColor(r7)
            goto L1ef
        L18f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.useSegmentScale(r7)
            goto L1ef
        L199:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setDoNotApplySmartStretch(r7)
            goto L1ef
        L1a3:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setStretchy(r7)
            goto L1ef
        L1ad:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            r6.setStatic(r7)
            goto L1ef
        L1b7:
            com.badlogic.gdx.graphics.Color r8 = (com.badlogic.gdx.graphics.Color) r8
            r6.setGradientColor(r8)
            goto L1ef
        L1bd:
            com.badlogic.gdx.graphics.Color r8 = (com.badlogic.gdx.graphics.Color) r8
            r6.setColor(r8)
            goto L1ef
        L1c3:
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog$TwoColors r8 = (org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog.TwoColors) r8
            com.badlogic.gdx.graphics.Color r7 = r8.getColorOne()
            com.badlogic.gdx.graphics.Color r8 = r8.getColorTwo()
            com.badlogic.gdx.graphics.Color r0 = r6.getValColorSegment()
            int r0 = r0.toIntBits()
            int r1 = r7.toIntBits()
            if (r0 != r1) goto L1de
            r6.setColor(r8)
        L1de:
            com.badlogic.gdx.graphics.Color r0 = r6.getValColorGradient()
            int r0 = r0.toIntBits()
            int r7 = r7.toIntBits()
            if (r0 != r7) goto L1ef
            r6.setGradientColor(r8)
        L1ef:
            return
    }

    public static java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> orderNodesByRelativeDrawOrder(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            r1.add(r4)
        L10:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L35
            java.lang.Object r4 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.add(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r4._childrenNodes
            int r2 = r4.size()
            int r2 = r2 + (-1)
        L27:
            if (r2 < 0) goto L10
            java.lang.Object r3 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r1.add(r3)
            int r2 = r2 + (-1)
            goto L27
        L35:
            org.fortheloss.sticknodes.stickfigure.StickNode$2 r4 = new org.fortheloss.sticknodes.stickfigure.StickNode$2
            r4.<init>()
            java.util.Collections.sort(r0, r4)
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r0
    }

    private void polyfillAnchorPolynodeIsDirty(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            boolean r2 = r1.isPolyfillAnchor()
            if (r2 == 0) goto La
            r2 = 0
            r1._triangulatedPolynodeChildrenDrawOrder = r2
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't mark polyfill as dirty from a node which isn't a polyfill anchor."
            r2.<init>(r0)
            throw r2
    }

    private void polyfillAnchorRemoveDeletedPolynode(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            boolean r0 = r1.isPolyfillAnchor()
            if (r0 == 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            r0.remove(r2)
            r2.removePolyAnchorParent(r1)
            r1.analyzePolyfillForCompleteChildren()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._polynodeChildrenRefs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            r1.deletePolyAnchor()
        L1c:
            return
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove deleted polynode from a node that isn't a polyfill anchor."
            r2.<init>(r0)
            throw r2
    }

    private void polyfillOnCurveChange(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            boolean r0 = r1.isPolyfillAnchor()
            if (r0 == 0) goto L12
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._completePolynodeChildrenRefs
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L11
            r2 = 0
            r1._triangulatedPolynodeChildrenDrawOrder = r2
        L11:
            return
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't do polyfill check from a node which isn't a polyfill anchor."
            r2.<init>(r0)
            throw r2
    }

    private void recalculatePolyfillTriangles() {
            r12 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r0 = r12._triangulatedPolynodeChildrenRefs
            r0.clear()
            com.badlogic.gdx.utils.FloatArray r0 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            r0.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r12._polynodeChildrenRefs
            int r0 = r0.size()
            if (r0 != 0) goto L13
            return
        L13:
            short r1 = r12.getValSegmentCurvePolyfillPrecision()
            float r1 = (float) r1
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 / r2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r12._polynodeChildrenRefs
            int r3 = r0 + (-1)
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r3 = -1
            r3 = r12
            r9 = -1
        L28:
            if (r9 >= r0) goto Lef
            if (r9 < 0) goto L37
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r12._polynodeChildrenRefs
            java.lang.Object r2 = r2.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r10 = r2
            r2 = r3
            goto L38
        L37:
            r10 = r3
        L38:
            int r3 = r10.getSegmentCurve()
            float r3 = (float) r3
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto Ld5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r12._completePolynodeChildrenRefs
            boolean r3 = r3.contains(r10)
            if (r3 == 0) goto Ld5
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r10.getParentNode()
            if (r2 != r3) goto L53
            r3 = 1
            r11 = 1
            goto L55
        L53:
            r3 = 0
            r11 = 0
        L55:
            if (r11 != 0) goto L8d
            boolean r3 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L78
            r3 = r10
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getEndNode()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r5 = r12._triangulatedPolynodeChildrenRefs
            r5.add(r3)
            com.badlogic.gdx.utils.FloatArray r5 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            float r6 = r3.getGlobalX()
            r5.add(r6)
            float r3 = r3.getGlobalY()
            r5.add(r3)
            goto L8d
        L78:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r3 = r12._triangulatedPolynodeChildrenRefs
            r3.add(r10)
            com.badlogic.gdx.utils.FloatArray r3 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            float r5 = r10.getGlobalX()
            r3.add(r5)
            float r5 = r10.getGlobalY()
            r3.add(r5)
        L8d:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L9c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r4 = r12._triangulatedPolynodeChildrenRefs
            com.badlogic.gdx.utils.FloatArray r5 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            r3 = r12
            r6 = r10
            r7 = r11
            r8 = r1
            r3.getCurveNodes(r4, r5, r6, r7, r8)
        L9c:
            if (r11 == 0) goto Lea
            boolean r3 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto Lbf
            r3 = r10
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getEndNode()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r4 = r12._triangulatedPolynodeChildrenRefs
            r4.add(r3)
            com.badlogic.gdx.utils.FloatArray r4 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            float r5 = r3.getGlobalX()
            r4.add(r5)
            float r3 = r3.getGlobalY()
            r4.add(r3)
            goto Lea
        Lbf:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r3 = r12._triangulatedPolynodeChildrenRefs
            r3.add(r10)
            com.badlogic.gdx.utils.FloatArray r3 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            float r4 = r10.getGlobalX()
            r3.add(r4)
            float r4 = r10.getGlobalY()
            r3.add(r4)
            goto Lea
        Ld5:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.IPolyNode> r3 = r12._triangulatedPolynodeChildrenRefs
            r3.add(r10)
            com.badlogic.gdx.utils.FloatArray r3 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            float r4 = r10.getGlobalX()
            r3.add(r4)
            float r4 = r10.getGlobalY()
            r3.add(r4)
        Lea:
            int r9 = r9 + 1
            r3 = r10
            goto L28
        Lef:
            com.badlogic.gdx.math.EarClippingTriangulator r0 = org.fortheloss.sticknodes.stickfigure.StickNode._earClippingTriangulator
            com.badlogic.gdx.utils.FloatArray r1 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            com.badlogic.gdx.utils.ShortArray r0 = r0.computeTriangles(r1)
            short[] r0 = r0.toArray()
            r12._triangulatedPolynodeChildrenDrawOrder = r0
            return
    }

    protected void actuallyApplySmartStretchToChildren(float r7) {
            r6 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r6._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L18:
            if (r2 < 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r6._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 == 0) goto L30
            boolean r4 = r3.getDoNotApplySmartStretch()
            if (r4 != 0) goto L3e
            r0.push(r3)
            goto L3e
        L30:
            boolean r4 = r3.isStatic()
            if (r4 == 0) goto L3e
            r0.push(r3)
            float r4 = r3._defaultLocalAngle
            r3.setLocalAngle(r4)
        L3e:
            int r2 = r2 + (-1)
            goto L18
        L41:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L9e
            java.lang.Object r2 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L58
            r3 = r2
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            r3.setSmartStretchAncestralValue(r7)
            goto L68
        L58:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getParentNode()
            boolean r3 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L65
            float r3 = r2._defaultLocalAngle
            r2.setLocalAngle(r3)
        L65:
            r2.applySmartStretch(r7, r6)
        L68:
            boolean r3 = r2.getSmartStretchResetImpulse()
            if (r3 == 0) goto L72
            r1.add(r2)
            goto L41
        L72:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r2._childrenNodes
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L7a:
            if (r3 < 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r2._childrenNodes
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r5 == 0) goto L92
            boolean r5 = r4.getDoNotApplySmartStretch()
            if (r5 != 0) goto L9b
            r0.push(r4)
            goto L9b
        L92:
            boolean r5 = r4.isStatic()
            if (r5 == 0) goto L9b
            r0.push(r4)
        L9b:
            int r3 = r3 + (-1)
            goto L7a
        L9e:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
        La4:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb4
            java.lang.Object r0 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.actuallyApplySmartStretchToChildren(r7)
            goto La4
        Lb4:
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            return
    }

    protected void actuallyDispose() {
            r1 = this;
            r0 = 0
            r1._parentNodeRef = r0
            r1._stickfigureRef = r0
            r1._colorRef1 = r0
            r1._colorRef2 = r0
            r1._polyfillColorRef = r0
            r1._joinedFigureRefs = r0
            r1.mConnectorAttachments = r0
            r1.mConnectorChildRef = r0
            r1._triangulatedPolynodeChildrenRefs = r0
            r1._completePolynodeChildrenRefs = r0
            r1._polynodeChildrenRefs = r0
            r1._polyAnchorParentRefs = r0
            r1._triangulatedPolynodeChildrenDrawOrder = r0
            r1._childrenNodes = r0
            r1.mAngleLockRelativeRememberedParentNodeRef = r0
            return
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode addChildNode(float r9, float r10, float r11, int r12) {
            r8 = this;
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r7 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r8._stickfigureRef
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = 6
            r10 = 1
            if (r12 != r9) goto L39
            int r0 = r8.getValLimbType()
            if (r0 != r9) goto L39
            float r9 = r8.getValTrapezoidRatio()
            r7.setTrapezoidRatio(r9)
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L36
            float r9 = r8.getValTrapezoidThickness1()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.max(r0, r9)
            float r1 = r8.getValTrapezoidThickness2()
            float r0 = java.lang.Math.max(r0, r1)
            float r9 = r9 / r0
        L36:
            r7.setTrapezoidThickness1(r11, r9, r10)
        L39:
            r9 = 5
            r11 = 2
            r0 = 0
            if (r12 == r11) goto L43
            if (r12 != r9) goto L41
            goto L43
        L41:
            r12 = 0
            goto L44
        L43:
            r12 = 1
        L44:
            int r1 = r8.getValLimbType()
            if (r1 == r11) goto L52
            int r1 = r8.getValLimbType()
            if (r1 != r9) goto L51
            goto L52
        L51:
            r10 = 0
        L52:
            if (r12 == 0) goto L5b
            if (r10 == 0) goto L57
            goto L5b
        L57:
            r7.setValGradientMode(r11)
            goto L62
        L5b:
            short r9 = r8.getValGradientMode()
            r7.setValGradientMode(r9)
        L62:
            boolean r9 = r8.getValUseCircleOutline()
            r7.setUseCircleOutline(r9)
            boolean r9 = r8.getValCircleIsHollow()
            r7.setValCircleIsHollow(r9)
            boolean r9 = r8.getValUseSegmentColor()
            r7.useSegmentColor(r9)
            com.badlogic.gdx.graphics.Color r9 = r8.getValColorSegment()
            r7.setValColorSegment(r9)
            boolean r9 = r8.getValUseGradient()
            r7.useGradient(r9)
            boolean r9 = r8.mGradientReversed
            r7.setReverseGradient(r9)
            com.badlogic.gdx.graphics.Color r9 = r8.getValColorCircleOutline()
            r7.setValColorCircleOutline(r9)
            com.badlogic.gdx.graphics.Color r9 = r8.getValColorGradient()
            r7.setValColorGradient(r9)
            r7.updateColorReferences()
            boolean r9 = r8.getValUseSegmentScale()
            r7.setValUseSegmentScale(r9)
            float r9 = r8.getValSegmentScale()
            r7.setValSegmentScale(r9)
            boolean r9 = r8.getValIsStretchy()
            r7.setValIsStretchy(r9)
            boolean r9 = r8.getValIsFloaty()
            r7.setValIsFloaty(r9)
            r7.setSmartStretch(r0)
            r7.setValSmartStretchDoNotApply(r0)
            boolean r9 = r8.getValIsStatic()
            r7.setValIsStatic(r9)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r8._childrenNodes
            r9.add(r7)
            boolean r9 = r8.isMainNode()
            if (r9 == 0) goto Ld5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r8._stickfigureRef
            r9.addNodeToDrawOrder(r7)
            goto Lda
        Ld5:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r8._stickfigureRef
            r9.addNodeToDrawOrderAfter(r7, r8)
        Lda:
            return r7
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode addChildNode(org.fortheloss.sticknodes.stickfigure.StickNode r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L16
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r1.mConnectorChildRef
            if (r0 != 0) goto Le
            r0 = r2
            org.fortheloss.sticknodes.stickfigure.Connector r0 = (org.fortheloss.sticknodes.stickfigure.Connector) r0
            r1.mConnectorChildRef = r0
            goto L16
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot add a Connector to this node, it already has a Connector."
            r2.<init>(r3)
            throw r2
        L16:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._childrenNodes
            r0.add(r2)
            if (r3 == 0) goto L20
            r2.appendAllToDrawOrderArray(r1)
        L20:
            return r2
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode addChildNodeAt(org.fortheloss.sticknodes.stickfigure.StickNode r2, int r3, boolean r4) {
            r1 = this;
            boolean r0 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L16
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r1.mConnectorChildRef
            if (r0 != 0) goto Le
            r0 = r2
            org.fortheloss.sticknodes.stickfigure.Connector r0 = (org.fortheloss.sticknodes.stickfigure.Connector) r0
            r1.mConnectorChildRef = r0
            goto L16
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot add a Connector to this node, it already has a Connector."
            r2.<init>(r3)
            throw r2
        L16:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._childrenNodes
            r0.add(r3, r2)
            if (r4 == 0) goto L20
            r2.appendAllToDrawOrderArray(r1)
        L20:
            return r2
    }

    public void addChildrenToStack(java.util.Stack<org.fortheloss.sticknodes.stickfigure.StickNode> r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._childrenNodes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._childrenNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r3.add(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    public org.fortheloss.sticknodes.stickfigure.Connector addConnectorTo(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r4.mConnectorChildRef
            if (r0 != 0) goto La6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r4._stickfigureRef
            r1 = 1
            int r0 = r0.getNodeCount(r1)
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L11
            r5 = 0
            return r5
        L11:
            int r0 = r4.getValLimbType()
            r2 = 6
            if (r0 != r2) goto L1e
            float r0 = r4.getValTrapezoidThickness2()
            int r0 = (int) r0
            goto L22
        L1e:
            int r0 = r4.getValThickness()
        L22:
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r2 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r4._stickfigureRef
            r2.<init>(r3, r4, r5, r0)
            r4.mConnectorChildRef = r2
            boolean r5 = r4.getValUseCircleOutline()
            r2.setValUseCircleOutline(r5)
            boolean r5 = r4.getValCircleIsHollow()
            r2.setValCircleIsHollow(r5)
            boolean r5 = r4.getValUseSegmentColor()
            r2.setValUseSegmentColor(r5)
            com.badlogic.gdx.graphics.Color r5 = r4.getValColorSegment()
            r2.setValColorSegment(r5)
            boolean r5 = r4.getValUseGradient()
            r2.setValUseGradient(r5)
            boolean r5 = r4.mGradientReversed
            r2.setReverseGradient(r5)
            short r5 = r4.getValGradientMode()
            r2.setValGradientMode(r5)
            com.badlogic.gdx.graphics.Color r5 = r4.getValColorCircleOutline()
            r2.setValColorCircleOutline(r5)
            com.badlogic.gdx.graphics.Color r5 = r4.getValColorGradient()
            r2.setValColorGradient(r5)
            r2.updateColorReferences()
            r5 = 0
            r2.setValUseSegmentScale(r5)
            float r0 = r4.getValSegmentScale()
            r2.setValSegmentScale(r0)
            r2.setValIsStretchy(r5)
            r2.setValIsFloaty(r5)
            r2.setValIsSmartStretch(r5)
            r2.setValSmartStretchResetImpulse(r5)
            r2.setValSmartStretchDoNotApply(r1)
            boolean r5 = r4.getValIsStatic()
            r2.setValIsStatic(r5)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r4._childrenNodes
            r5.add(r2)
            boolean r5 = r4.isMainNode()
            if (r5 == 0) goto L9d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r4._stickfigureRef
            r5.addNodeToDrawOrder(r2)
            goto La2
        L9d:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r4._stickfigureRef
            r5.addNodeToDrawOrderAfter(r2, r4)
        La2:
            r2.flagPositionAsDirty()
            return r2
        La6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot add a Connector to this node, it already has a Connector."
            r5.<init>(r0)
            throw r5
    }

    public void addDescendantsToArray(org.fortheloss.sticknodes.stickfigure.StickNode[] r6) {
            r5 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r5)
            r1 = 0
        Lc:
            boolean r2 = r0.empty()
            if (r2 != 0) goto L36
            java.lang.Object r2 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r3 = r1 + 1
            r6[r1] = r2
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._childrenNodes
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L24:
            if (r1 < 0) goto L34
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r2._childrenNodes
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r1 = r1 + (-1)
            goto L24
        L34:
            r1 = r3
            goto Lc
        L36:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void addJoinedFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1._joinedFigureRefs = r0
        Ld:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            r0.add(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r1._stickfigureRef
            int r0 = r1.getValDrawOrderIndex()
            r2.addJoinAnchor(r0)
            return
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't add a null figure to joined array."
            r2.<init>(r0)
            throw r2
    }

    public void addPolyAnchorParent(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyAnchorParentRefs
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2._polyAnchorParentRefs = r0
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyAnchorParentRefs
            r0.add(r3)
            return
    }

    public boolean addPolynodeChild(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            int r0 = r0.size()
            boolean r2 = r1.addPolynodeChild(r2, r0)
            return r2
    }

    public boolean addPolynodeChild(org.fortheloss.sticknodes.stickfigure.StickNode r2, int r3) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            r0.add(r3, r2)
            r2.addPolyAnchorParent(r1)
            r1.analyzePolyfillForCompleteChildren()
            r2 = 1
            return r2
    }

    public void analyzePolyfillForCompleteChildren() {
            r7 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._completePolynodeChildrenRefs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._completePolynodeChildrenRefs
            r0.clear()
        Ld:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._polynodeChildrenRefs
            r0.add(r7)
            r0 = 0
            r1 = -1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r7._polynodeChildrenRefs
            int r2 = r2.size()
            r3 = r7
        L1b:
            r4 = 1
            if (r1 >= r2) goto L76
            if (r1 < 0) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r7._polynodeChildrenRefs
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
        L28:
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r3._parentNodeRef
            r6 = 6
            if (r0 != r5) goto L44
            int r0 = r3.getLimbType()
            if (r0 == r4) goto L3f
            int r0 = r3.getLimbType()
            if (r0 == 0) goto L3f
            int r0 = r3.getLimbType()
            if (r0 != r6) goto L44
        L3f:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._completePolynodeChildrenRefs
            r0.add(r3)
        L44:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._polynodeChildrenRefs
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r1 >= r0) goto L72
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._polynodeChildrenRefs
            int r5 = r1 + 1
            java.lang.Object r0 = r0.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r3._parentNodeRef
            if (r0 != r5) goto L72
            int r0 = r3.getLimbType()
            if (r0 == r4) goto L6d
            int r0 = r3.getLimbType()
            if (r0 == 0) goto L6d
            int r0 = r3.getLimbType()
            if (r0 != r6) goto L72
        L6d:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._completePolynodeChildrenRefs
            r0.add(r3)
        L72:
            int r1 = r1 + 1
            r0 = r3
            goto L1b
        L76:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._polynodeChildrenRefs
            int r1 = r0.size()
            int r1 = r1 - r4
            r0.remove(r1)
            return
    }

    public void apply252SmartStretchFix() {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r4._childrenNodes
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L10:
            if (r1 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._childrenNodes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.push(r2)
            int r1 = r1 + (-1)
            goto L10
        L20:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L4d
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r2 = r1.getValIsSmartStretch()
            if (r2 == 0) goto L35
            r4.actuallyApply252SmartStretchFix(r1)
        L35:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3d:
            if (r2 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L3d
        L4d:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void applyBranchModification(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L38
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r2 = r1.isMainNode()
            if (r2 != 0) goto L20
            r1.modify(r5, r6)
        L20:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L28:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L28
        L38:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    protected void applySmartStretch(float r13, org.fortheloss.sticknodes.stickfigure.StickNode r14) {
            r12 = this;
            r12.flagPositionAsDirty()
            r12.getValLength()
            float r0 = r12.getValDefaultLength()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 - r1
            float r2 = r12.getValSmartStretchMultiplier()
            float r13 = r13 * r2
            float r13 = r13 + r1
            r1 = 0
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 != 0) goto L1c
            r13 = 1008981770(0x3c23d70a, float:0.01)
        L1c:
            r2 = 1
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 >= 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            float r13 = java.lang.Math.abs(r13)
            boolean r4 = r12.getValSmartStretchResetImpulse()
            if (r4 == 0) goto L30
            r4 = 0
            goto L35
        L30:
            float r4 = r12._defaultAngle
            float r14 = r14._defaultAngle
            goto L3b
        L35:
            r14 = 1135869952(0x43b40000, float:360.0)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 < 0) goto L3d
        L3b:
            float r4 = r4 - r14
            goto L35
        L3d:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L43
            float r4 = r4 + r14
            goto L3d
        L43:
            r5 = 1132920832(0x43870000, float:270.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = -1
            r8 = 1127481344(0x43340000, float:180.0)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L52
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L56
        L52:
            int r10 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r10 <= 0) goto L58
        L56:
            r10 = -1
            goto L59
        L58:
            r10 = 1
        L59:
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L60
            float r4 = r14 - r4
            goto L6a
        L60:
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 <= 0) goto L66
            float r4 = r4 - r8
            goto L6a
        L66:
            if (r9 <= 0) goto L6a
            float r4 = r8 - r4
        L6a:
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = java.lang.Math.max(r5, r0)
            r9 = 1016003125(0x3c8efa35, float:0.017453292)
            float r9 = r9 * r4
            float r11 = org.fortheloss.framework.CustomMathUtils.sin(r9)
            float r11 = r11 * r0
            float r9 = org.fortheloss.framework.CustomMathUtils.cos(r9)
            float r9 = r9 * r0
            float r9 = r9 * r13
            boolean r13 = r12.getValSmartStretchDoNotApply()
            if (r13 != 0) goto Lcc
            float r9 = r9 * r9
            float r13 = r11 * r11
            float r9 = r9 + r13
            double r0 = (double) r9
            double r0 = java.lang.Math.sqrt(r0)
            float r13 = (float) r0
            float r13 = r12.setValLength(r13)
            float r13 = java.lang.Math.max(r5, r13)
            float r11 = r11 / r13
            double r0 = (double) r11
            double r0 = java.lang.Math.asin(r0)
            float r13 = (float) r0
            r0 = 1113927392(0x42652ee0, float:57.295776)
            float r13 = r13 * r0
            float r13 = r13 - r4
            float r13 = r13 + r8
            float r13 = r13 % r14
            float r13 = r13 - r8
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lb4
            float r13 = r13 + r14
        Lb4:
            float r14 = (float) r10
            float r13 = r13 * r14
            if (r3 == 0) goto Lc6
            float r4 = r4 % r6
            if (r10 != r7) goto Lc2
            float r13 = r4 - r13
            float r4 = r4 + r13
            float r4 = r4 - r8
            r1 = r4
            goto Lc7
        Lc2:
            float r13 = r13 + r4
            float r4 = r4 + r13
            float r13 = -r4
            float r13 = r13 - r8
        Lc6:
            r1 = r13
        Lc7:
            float r13 = r12._localAngle
            float r13 = r13 + r1
            r12._localAngle = r13
        Lcc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r13 = r12._childrenNodes
            int r13 = r13.size()
            int r13 = r13 - r2
        Ld3:
            if (r13 < 0) goto Lec
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r14 = r12._childrenNodes
            java.lang.Object r14 = r14.get(r13)
            org.fortheloss.sticknodes.stickfigure.StickNode r14 = (org.fortheloss.sticknodes.stickfigure.StickNode) r14
            boolean r0 = r14.isStatic()
            if (r0 == 0) goto Le9
            float r0 = r14._defaultLocalAngle
            float r0 = r0 - r1
            r14.setLocalAngle(r0)
        Le9:
            int r13 = r13 + (-1)
            goto Ld3
        Lec:
            return
    }

    public void applySmartStretchToChildren() {
            r3 = this;
            float r0 = r3.getValDefaultLength()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            return
        La:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r3.getValLength()
            float r1 = java.lang.Math.max(r1, r2)
            float r1 = r1 / r0
            r3.actuallyApplySmartStretchToChildren(r1)
            return
    }

    public void applySmartStretchToJoinedSprites() {
            r3 = this;
            java.util.ArrayList r0 = r3.getJoinedFigures()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Ld:
            if (r1 < 0) goto L23
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto L20
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = (org.fortheloss.sticknodes.sprite.SpriteRef) r2
            r2.applySmartStretch()
        L20:
            int r1 = r1 + (-1)
            goto Ld
        L23:
            return
    }

    public void attachConnector(org.fortheloss.sticknodes.stickfigure.Connector r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorAttachments
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.mConnectorAttachments = r0
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorAttachments
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r2.mConnectorAttachments
            r0.add(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            r0.addConnector(r3)
            return
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This connector already is attached to this node."
            r3.<init>(r0)
            throw r3
    }

    public void beginReadingData(int r5, int r6, java.io.DataInputStream r7) throws java.io.IOException {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L32
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.readData(r5, r6, r7)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L22:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L22
        L32:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void beginReadingDataOld(int r5, java.nio.ByteBuffer r6) {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L32
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.readDataOld(r5, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L22:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L22
        L32:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void beginReadingPositionalData(int r5, int r6, java.io.DataInputStream r7) throws java.io.IOException {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L32
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.readPositionalData(r5, r6, r7)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L22:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L22
        L32:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void beginReadingPositionalDataOld(int r5, java.nio.ByteBuffer r6) {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L32
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.readPositionalDataOld(r5, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L22:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L22
        L32:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void beginWritingData(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r5)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L31
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.writeData(r6)
            r2 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            int r3 = r3.size()
        L21:
            if (r2 >= r3) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r1._childrenNodes
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r2 = r2 + 1
            goto L21
        L31:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void beginWritingPositionalData(java.io.OutputStream r6) throws java.io.IOException {
            r5 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r5)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L31
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.writePositionalData(r6)
            r2 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            int r3 = r3.size()
        L21:
            if (r2 >= r3) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r1._childrenNodes
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r2 = r2 + 1
            goto L21
        L31:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void changeParentNode(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._parentNodeRef
            if (r0 == 0) goto L9
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r0._childrenNodes
            r0.remove(r1)
        L9:
            r0 = 0
            r2.addChildNode(r1, r0)
            r1._parentNodeRef = r2
            return
    }

    public void convertToPolyAnchor() {
            r2 = this;
            boolean r0 = r2.isPolyfillAnchor()
            if (r0 != 0) goto L22
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            r0.addPolyfillAnchorNode(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2._polynodeChildrenRefs = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2._completePolynodeChildrenRefs = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2._triangulatedPolynodeChildrenRefs = r0
            return
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't convert to a polyAnchor, is already one supposedly."
            r0.<init>(r1)
            throw r0
    }

    public void copyColorValuesTo(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            boolean r0 = r1.getValUseSegmentColor()
            r2.setValUseSegmentColor(r0)
            boolean r0 = r1.getValUseGradient()
            r2.setValUseGradient(r0)
            boolean r0 = r1.mGradientReversed
            r2.setReverseGradient(r0)
            short r0 = r1.getValGradientMode()
            r2.setValGradientMode(r0)
            boolean r0 = r1.getValUsePolyfillColor()
            r2.setValUsePolyfillColor(r0)
            boolean r0 = r1.getValUseCircleOutline()
            r2.setValUseCircleOutline(r0)
            boolean r0 = r1.getValCircleIsHollow()
            r2.setValCircleIsHollow(r0)
            r2.updateColorReferences()
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorCircleOutline()
            r2.setValColorCircleOutline(r0)
            return
    }

    public void delete(boolean r12) {
            r11 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._parentNodeRef
            if (r0 != 0) goto L5
            return
        L5:
            if (r12 != 0) goto L16b
            java.lang.Class<java.util.ArrayList> r12 = java.util.ArrayList.class
            java.lang.Object r12 = com.badlogic.gdx.utils.Pools.obtain(r12)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r11._childrenNodes
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        L1f:
            if (r1 < 0) goto L2f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r11._childrenNodes
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.add(r3)
            int r1 = r1 + (-1)
            goto L1f
        L2f:
            boolean r1 = r0.isEmpty()
            r3 = 0
            if (r1 != 0) goto L69
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 != 0) goto L52
            boolean r4 = r1.getIsAngleLocked()
            if (r4 == 0) goto L52
            boolean r4 = r1.getAngleLockIsMainNode()
            if (r4 != 0) goto L52
            r12.add(r1)
            r1.setIsAngleLocked(r3)
        L52:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            int r3 = r3.size()
            int r3 = r3 - r2
        L59:
            if (r3 < 0) goto L2f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r1._childrenNodes
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.add(r4)
            int r3 = r3 + (-1)
            goto L59
        L69:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r11._childrenNodes
            int r0 = r0.size()
            int r0 = r0 - r2
        L76:
            if (r0 < 0) goto L120
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r11._childrenNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 != 0) goto L118
            boolean r4 = r1.isUsingSegmentScale()
            if (r4 == 0) goto L8f
            float r4 = r1.getScale()
            goto L91
        L8f:
            r4 = 1065353216(0x3f800000, float:1.0)
        L91:
            r5 = 0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto Lc1
            float r5 = r1.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r11._parentNodeRef
            float r6 = r6.getGlobalX()
            float r5 = r5 - r6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r11._stickfigureRef
            float r6 = r6.getScale()
            float r5 = r5 / r6
            float r5 = r5 / r4
            float r6 = r1.getGlobalY()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r11._parentNodeRef
            float r7 = r7.getGlobalY()
            float r6 = r6 - r7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r11._stickfigureRef
            float r7 = r7.getScale()
            float r6 = r6 / r7
            float r4 = r6 / r4
            r10 = r5
            r5 = r4
            r4 = r10
            goto Lc2
        Lc1:
            r4 = 0
        Lc2:
            double r6 = (double) r5
            double r8 = (double) r4
            double r6 = java.lang.Math.atan2(r6, r8)
            float r6 = (float) r6
            r7 = 1113927392(0x42652ee0, float:57.295776)
            float r6 = r6 * r7
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r11._parentNodeRef
            float r7 = r7.getAngle()
            float r6 = r6 - r7
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 / r5
            float r5 = r1.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r11._parentNodeRef
            r1.changeParentNode(r7)
            r1.setLength(r4)
            r1.setDefaultLength(r4)
            r1.setLocalAngle(r6)
            float r4 = r1.getAngle()
            float r4 = r4 - r5
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r1._childrenNodes
            int r5 = r1.size()
            int r5 = r5 - r2
        L101:
            if (r5 < 0) goto L114
            java.lang.Object r6 = r1.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            float r7 = r6.getLocalAngle()
            float r7 = r7 - r4
            r6.setLocalAngle(r7)
            int r5 = r5 + (-1)
            goto L101
        L114:
            int r0 = r0 + (-1)
            goto L76
        L118:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "There should never be a Connector child present when this function is called!"
            r12.<init>(r0)
            throw r12
        L120:
            boolean r0 = r11.hasConnectorAttachments()
            if (r0 == 0) goto L13f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r11.mConnectorAttachments
            int r0 = r0.size()
            int r0 = r0 - r2
        L12d:
            if (r0 < 0) goto L13f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r1 = r11.mConnectorAttachments
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r11._parentNodeRef
            r1.changeEndNode(r4)
            int r0 = r0 + (-1)
            goto L12d
        L13f:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._parentNodeRef
            r0.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._parentNodeRef
            r0.validatePosition()
            int r0 = r12.size()
            int r0 = r0 - r2
        L14e:
            if (r0 < 0) goto L165
            java.lang.Object r1 = r12.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.setIsAngleLocked(r2)
            java.lang.Object r1 = r12.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.setAngleLockIsMainNode(r3)
            int r0 = r0 + (-1)
            goto L14e
        L165:
            r12.clear()
            com.badlogic.gdx.utils.Pools.free(r12)
        L16b:
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = r11._parentNodeRef
            r12.deleteChild(r11)
            return
    }

    protected void deleteChild(org.fortheloss.sticknodes.stickfigure.StickNode r17) {
            r16 = this;
            r0 = r17
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            java.lang.Class<java.util.Stack> r2 = java.util.Stack.class
            java.lang.Object r2 = com.badlogic.gdx.utils.Pools.obtain(r2)
            java.util.Stack r2 = (java.util.Stack) r2
            java.lang.Class<java.util.Stack> r3 = java.util.Stack.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            java.util.Stack r3 = (java.util.Stack) r3
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            java.lang.Object r4 = com.badlogic.gdx.utils.Pools.obtain(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r1.add(r0)
        L2d:
            boolean r6 = r1.isEmpty()
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L11a
            java.lang.Object r6 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            boolean r9 = r5.contains(r6)
            if (r9 != 0) goto L44
            r4.add(r6)
        L44:
            r2.add(r6)
        L47:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L2d
            java.lang.Object r6 = r2.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            boolean r9 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r9 == 0) goto L5d
            r9 = r6
            org.fortheloss.sticknodes.stickfigure.Connector r9 = (org.fortheloss.sticknodes.stickfigure.Connector) r9
            r5.add(r9)
        L5d:
            java.util.ArrayList r9 = r6.getConnectorAttachments()
            if (r9 == 0) goto Lff
            int r10 = r9.size()
            int r10 = r10 - r8
        L68:
            if (r10 < 0) goto Lff
            java.lang.Object r11 = r9.get(r10)
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = (org.fortheloss.sticknodes.stickfigure.StickNode) r11
            boolean r12 = r5.contains(r11)
            if (r12 != 0) goto L93
            r13 = r11
        L77:
            int r14 = r1.size()
            int r14 = r14 - r8
        L7c:
            if (r14 < 0) goto L89
            java.lang.Object r15 = r1.get(r14)
            if (r15 != r13) goto L86
            r12 = 1
            goto L89
        L86:
            int r14 = r14 + (-1)
            goto L7c
        L89:
            if (r12 == 0) goto L8d
            r13 = r7
            goto L91
        L8d:
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = r13.getParentNode()
        L91:
            if (r13 != 0) goto L77
        L93:
            if (r12 != 0) goto La0
            r13 = r11
        L96:
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = r13.getParentNode()
            if (r13 != r0) goto L9e
            r13 = r7
            r12 = 1
        L9e:
            if (r13 != 0) goto L96
        La0:
            if (r12 != 0) goto Lfb
            java.util.ArrayList r12 = r11.getChildrenNodes()
            int r12 = r12.size()
            int r12 = r12 - r8
        Lab:
            if (r12 < 0) goto Lbd
            java.util.ArrayList r13 = r11.getChildrenNodes()
            java.lang.Object r13 = r13.get(r12)
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = (org.fortheloss.sticknodes.stickfigure.StickNode) r13
            r3.add(r13)
            int r12 = r12 + (-1)
            goto Lab
        Lbd:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto Lf8
            java.lang.Object r12 = r3.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r12 = (org.fortheloss.sticknodes.stickfigure.StickNode) r12
            int r13 = r1.size()
            int r13 = r13 - r8
        Lce:
            if (r13 < 0) goto Ldd
            java.lang.Object r14 = r1.get(r13)
            if (r14 != r12) goto Lda
            r1.remove(r13)
            goto Ldd
        Lda:
            int r13 = r13 + (-1)
            goto Lce
        Ldd:
            java.util.ArrayList r13 = r12.getChildrenNodes()
            int r13 = r13.size()
            int r13 = r13 - r8
        Le6:
            if (r13 < 0) goto Lbd
            java.util.ArrayList r14 = r12.getChildrenNodes()
            java.lang.Object r14 = r14.get(r13)
            org.fortheloss.sticknodes.stickfigure.StickNode r14 = (org.fortheloss.sticknodes.stickfigure.StickNode) r14
            r3.add(r14)
            int r13 = r13 + (-1)
            goto Le6
        Lf8:
            r1.add(r11)
        Lfb:
            int r10 = r10 + (-1)
            goto L68
        Lff:
            java.util.ArrayList r9 = r6.getChildrenNodes()
            int r9 = r9.size()
            int r9 = r9 - r8
        L108:
            if (r9 < 0) goto L47
            java.util.ArrayList r10 = r6.getChildrenNodes()
            java.lang.Object r10 = r10.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            r2.add(r10)
            int r9 = r9 + (-1)
            goto L108
        L11a:
            int r0 = r4.size()
            int r0 = r0 - r8
        L11f:
            if (r0 < 0) goto L159
            java.lang.Object r6 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            boolean r9 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r9 != 0) goto L12c
            goto L156
        L12c:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r6.getParentNode()
        L130:
            if (r6 == 0) goto L156
            boolean r9 = r6.isMainNode()
            if (r9 != 0) goto L156
            int r9 = r4.size()
            int r9 = r9 - r8
        L13d:
            if (r9 < 0) goto L151
            if (r9 != r0) goto L142
            goto L14e
        L142:
            java.lang.Object r10 = r4.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            if (r6 != r10) goto L14e
            r4.remove(r0)
            goto L156
        L14e:
            int r9 = r9 + (-1)
            goto L13d
        L151:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r6.getParentNode()
            goto L130
        L156:
            int r0 = r0 + (-1)
            goto L11f
        L159:
            r1.clear()
            r2.clear()
            r3.clear()
            r5.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            com.badlogic.gdx.utils.Pools.free(r2)
            com.badlogic.gdx.utils.Pools.free(r3)
            com.badlogic.gdx.utils.Pools.free(r5)
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            int r1 = r4.size()
            int r1 = r1 - r8
        L17e:
            if (r1 < 0) goto L1f9
            java.lang.Object r2 = r4.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.getParentNode()
            r0.push(r2)
        L18d:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L1e9
            java.lang.Object r5 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            r6 = r16
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r6._stickfigureRef
            if (r9 == 0) goto L1a2
            r9.removeNodeFromDrawOrder(r5)
        L1a2:
            boolean r9 = r5.isPolynodeInPolyfill()
            if (r9 == 0) goto L1bf
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r5._polyAnchorParentRefs
            int r9 = r9.size()
            int r9 = r9 - r8
        L1af:
            if (r9 < 0) goto L1bf
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r5._polyAnchorParentRefs
            java.lang.Object r10 = r10.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            r10.polyfillAnchorRemoveDeletedPolynode(r5)
            int r9 = r9 + (-1)
            goto L1af
        L1bf:
            boolean r9 = r5.isPolyfillAnchor()
            if (r9 == 0) goto L1c8
            r5.deletePolyAnchor()
        L1c8:
            boolean r9 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r9 == 0) goto L1d2
            r9 = r5
            org.fortheloss.sticknodes.stickfigure.Connector r9 = (org.fortheloss.sticknodes.stickfigure.Connector) r9
            r9.detach()
        L1d2:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r9 = r5._childrenNodes
            int r9 = r9.size()
            int r9 = r9 - r8
        L1d9:
            if (r9 < 0) goto L18d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r10 = r5._childrenNodes
            java.lang.Object r10 = r10.get(r9)
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = (org.fortheloss.sticknodes.stickfigure.StickNode) r10
            r0.push(r10)
            int r9 = r9 + (-1)
            goto L1d9
        L1e9:
            r6 = r16
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r3._childrenNodes
            r5.remove(r2)
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r2 == 0) goto L1f6
            r3.mConnectorChildRef = r7
        L1f6:
            int r1 = r1 + (-1)
            goto L17e
        L1f9:
            r6 = r16
            r4.clear()
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r4)
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void deletePolyAnchor() {
            r2 = this;
            boolean r0 = r2.isPolyfillAnchor()
            if (r0 == 0) goto L21
        L6:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r2.removeLastPolynodeChild()
            goto L6
        L12:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            r0.removePolyfillAnchorNode(r2)
            r0 = 0
            r2._polynodeChildrenRefs = r0
            r2._completePolynodeChildrenRefs = r0
            r2._triangulatedPolynodeChildrenRefs = r0
            r2._triangulatedPolynodeChildrenDrawOrder = r0
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't delete polyAnchor, it's already not an anchor supposedly."
            r0.<init>(r1)
            throw r0
    }

    public void detachConnector(org.fortheloss.sticknodes.stickfigure.Connector r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorAttachments
            if (r0 == 0) goto L2b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorAttachments
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L23
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            r0.removeConnector(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r2 = r1.mConnectorAttachments
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            r2 = 0
            r1.mConnectorAttachments = r2
        L22:
            return
        L23:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot detach connector, this one is not attached to this node."
            r2.<init>(r0)
            throw r2
        L2b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot detach connector, there are none attached to this node."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L33
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L1f:
            if (r2 < 0) goto L2f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L1f
        L2f:
            r1.actuallyDispose()
            goto Lb
        L33:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public com.badlogic.gdx.math.Vector2 dragTo(float r7, float r8) {
            r6 = this;
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            com.badlogic.gdx.math.Vector2 r7 = r0.dragTo(r1, r2, r3, r4, r5)
            return r7
    }

    public com.badlogic.gdx.math.Vector2 dragTo(float r4, float r5, float r6, float r7, float r8) {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r3.getStickfigure()
            boolean r8 = r8.smartStretchIsEnabled()
            r8 = r8 ^ 1
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._parentNodeRef
            if (r0 != 0) goto L36
            boolean r0 = r3.mIsDragLocked
            if (r0 == 0) goto L2f
            float r0 = r3.mDragLockAngle
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r1 = r3.mDragLockAngle
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r4 = r4 - r6
            float r5 = r5 - r7
            float r4 = r4 * r0
            float r5 = r5 * r1
            float r4 = r4 + r5
            float r0 = r0 * r4
            float r5 = r6 + r0
            float r4 = r4 * r1
            float r4 = r4 + r7
            r2 = r5
            r5 = r4
            r4 = r2
        L2f:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r3._stickfigureRef
            r6.setPosition(r4, r5)
            goto Ld9
        L36:
            boolean r0 = r3.getValIsStretchy()
            if (r0 == 0) goto Lab
            boolean r0 = r3.getValIsAngleLocked()
            if (r0 != 0) goto L6a
            boolean r0 = r3.mIsDragLocked
            if (r0 == 0) goto L6a
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getParentNode()
            float r0 = r0.getAngle()
            float r1 = r3.mDragLockAngle
            float r0 = r0 + r1
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            float r4 = r4 - r6
            float r5 = r5 - r7
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r4 = r4 + r5
            float r1 = r1 * r4
            float r5 = r6 + r1
            float r4 = r4 * r0
            float r4 = r4 + r7
            r2 = r5
            r5 = r4
            r4 = r2
        L6a:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r3._parentNodeRef
            float r6 = r6.getGlobalX()
            float r6 = r4 - r6
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r3._parentNodeRef
            float r7 = r7.getGlobalY()
            float r7 = r5 - r7
            boolean r0 = r3.getValUseSegmentScale()
            if (r0 == 0) goto L8d
            float r0 = r3.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._stickfigureRef
            float r1 = r1.getScale()
            float r0 = r0 * r1
            goto L93
        L8d:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._stickfigureRef
            float r0 = r0.getScale()
        L93:
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb6
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r6 = r6 + r7
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 / r7
            float r6 = r6 / r0
            r3.setValLength(r6)
            goto Lb6
        Lab:
            boolean r6 = r3.getValIsAngleLocked()
            if (r6 != 0) goto Lf1
            boolean r6 = r3.mIsDragLocked
            if (r6 == 0) goto Lb6
            goto Lf1
        Lb6:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r3._parentNodeRef
            float r6 = r6.getGlobalY()
            float r5 = r5 - r6
            double r5 = (double) r5
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r3._parentNodeRef
            float r7 = r7.getGlobalX()
            float r4 = r4 - r7
            double r0 = (double) r4
            double r4 = java.lang.Math.atan2(r5, r0)
            float r4 = (float) r4
            r5 = 1113927392(0x42652ee0, float:57.295776)
            float r4 = r4 * r5
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r3._parentNodeRef
            float r5 = r5.getAngle()
            float r4 = r4 - r5
            r3._localAngle = r4
        Ld9:
            r3.flagPositionAsDirty()
            boolean r4 = r3.getValIsSmartStretch()
            if (r4 == 0) goto Le7
            if (r8 != 0) goto Le7
            r3.applySmartStretchToChildren()
        Le7:
            r3.applySmartStretchToJoinedSprites()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r3._stickfigureRef
            com.badlogic.gdx.math.Vector2 r4 = r4.repositionBasedOnLockedStickNode(r3)
            return r4
        Lf1:
            r4 = 0
            return r4
    }

    public void drawAt(int r2) {
            r1 = this;
            int r0 = r1.getValDrawOrderIndex()
            if (r2 != r0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            r0.drawNodeAt(r1, r2)
            return
    }

    protected void drawHighlightLineToNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r9, org.fortheloss.sticknodes.stickfigure.StickNode r10, float r11, float r12, float r13, boolean r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.drawHighlightLineToNode(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    protected void drawHighlightLineToNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r15, org.fortheloss.sticknodes.stickfigure.StickNode r16, float r17, float r18, float r19, boolean r20, boolean r21) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            if (r2 != 0) goto L7
            return
        L7:
            r3 = 1
            r4 = 0
            if (r21 == 0) goto L7f
            float r5 = r14.getX()
            float r5 = r5 * r19
            float r5 = r17 + r5
            float r6 = r14.getY()
            float r6 = r6 * r19
            float r6 = r18 + r6
            float r7 = r16.getX()
            float r7 = r7 * r19
            float r7 = r17 + r7
            float r8 = r16.getY()
            float r8 = r8 * r19
            float r8 = r18 + r8
            float r5 = r7 - r5
            float r6 = r8 - r6
            float r9 = r5 * r5
            float r10 = r6 * r6
            float r9 = r9 + r10
            double r9 = (double) r9
            double r9 = java.lang.Math.sqrt(r9)
            float r9 = (float) r9
            r10 = 1114636288(0x42700000, float:60.0)
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r10
            int r10 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r10 >= 0) goto L5e
            r3 = 0
            float r5 = r16.getAngle()
            r6 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 - r6
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = r5 * r9
            float r5 = r7 - r5
            float r10 = r16.getAngle()
            float r10 = r10 - r6
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            goto L7a
        L5e:
            float r4 = com.badlogic.gdx.math.MathUtils.atan2(r6, r5)
            r5 = 1113927392(0x42652ee0, float:57.295776)
            float r4 = r4 * r5
            r5 = 1101004800(0x41a00000, float:20.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            float r9 = r9 - r6
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r4)
            float r5 = r5 * r9
            float r5 = r7 - r5
            float r6 = org.fortheloss.framework.CustomMathUtils.sinDeg(r4)
        L7a:
            float r6 = r6 * r9
            float r6 = r8 - r6
            goto L9f
        L7f:
            float r5 = r14.getX()
            float r5 = r5 * r19
            float r5 = r17 + r5
            float r6 = r14.getY()
            float r6 = r6 * r19
            float r6 = r18 + r6
            float r7 = r16.getX()
            float r7 = r7 * r19
            float r7 = r17 + r7
            float r8 = r16.getY()
            float r8 = r8 * r19
            float r8 = r18 + r8
        L9f:
            r11 = r5
            r12 = r6
            r9 = r7
            r10 = r8
            r13 = 23
            if (r20 == 0) goto Ld8
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r0._parentNodeRef
            r6 = 27
            if (r2 != r5) goto Lbb
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r5 = r15.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r15.getBatch()
            r7 = r11
            r8 = r12
            r5.drawDashedLineThicker(r6, r7, r8, r9, r10)
            goto Lc8
        Lbb:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r5 = r15.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r15.getBatch()
            r7 = r11
            r8 = r12
            r5.drawDashedLine(r6, r7, r8, r9, r10)
        Lc8:
            if (r3 == 0) goto L109
            if (r21 == 0) goto L109
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r15.getNode(r13)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r15.getBatch()
            r2.drawArrow(r1, r11, r12, r4)
            goto L109
        Ld8:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r0._parentNodeRef
            if (r2 != r3) goto Lf3
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r15.getNode(r13)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r15.getBatch()
            r15 = r2
            r16 = r1
            r17 = r11
            r18 = r12
            r19 = r9
            r20 = r10
            r15.drawLineThicker(r16, r17, r18, r19, r20)
            goto L109
        Lf3:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r15.getNode(r13)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r15.getBatch()
            r15 = r2
            r16 = r1
            r17 = r11
            r18 = r12
            r19 = r9
            r20 = r10
            r15.drawLine(r16, r17, r18, r19, r20)
        L109:
            return
    }

    public void drawLimb(org.fortheloss.sticknodes.SNShapeRenderer r56, float r57, float r58, float r59, boolean r60) {
            r55 = this;
            r0 = r55
            boolean r1 = r55.isPolyfillAnchor()
            if (r1 == 0) goto Lb
            r55.drawPolyfill(r56, r57, r58, r59)
        Lb:
            int r1 = r55.getValLimbType()
            r2 = -1
            if (r1 == r2) goto L993
            boolean r3 = r55.getValUseSegmentScale()
            if (r3 == 0) goto L25
            float r3 = r55.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r0._stickfigureRef
            float r4 = r4.getScale()
            float r3 = r3 * r4
            goto L2b
        L25:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            float r3 = r3.getScale()
        L2b:
            float r3 = r3 * r59
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0._parentNodeRef
            float r4 = r4.getX()
            float r4 = r4 * r59
            float r4 = r57 + r4
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r0._parentNodeRef
            float r5 = r5.getY()
            float r5 = r5 * r59
            float r22 = r58 + r5
            float r5 = r0._localX
            float r5 = r5 * r3
            float r16 = r4 + r5
            float r5 = r0._localY
            float r5 = r5 * r3
            float r17 = r22 + r5
            int r5 = r55.getValThickness()
            float r5 = (float) r5
            float r6 = r55.getValLength()
            r7 = 0
            r20 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r15 = 1
            if (r1 != r15) goto L149
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L63
            return
        L63:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r2 = r5 * r3
            float r5 = r6 * r3
            float r10 = r5 * r1
            int r5 = r0._curveRadius
            float r5 = (float) r5
            float r5 = r5 * r1
            float r12 = r5 * r3
            int r1 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r10, r12)
            if (r1 <= r15) goto L7c
            r3 = 1
            goto L7d
        L7c:
            r3 = 0
        L7d:
            if (r3 == 0) goto Lef
            if (r60 == 0) goto Lc1
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r8
            float r5 = r0._cosAngle
            float r5 = r5 * r3
            float r6 = r0._sinAngle
            float r6 = r6 * r3
            float r26 = r4 - r5
            float r27 = r22 - r6
            float r3 = r3 * r8
            float r28 = r10 + r3
            r24 = 0
            boolean r25 = r55.getValSegmentCurveCirculization()
            float r29 = r2 + r3
            float r3 = r0._angle
            float r5 = r0._cosAngle
            float r6 = r0._sinAngle
            short r7 = r55.getValGradientMode()
            if (r7 != r15) goto Lac
            r35 = 1
            goto Lae
        Lac:
            r35 = 0
        Lae:
            com.badlogic.gdx.graphics.Color r37 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r30 = r12
            r31 = r3
            r32 = r5
            r33 = r6
            r34 = r1
            r36 = r37
            r23.mySegmentCurved(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        Lc1:
            r6 = 0
            boolean r7 = r55.getValSegmentCurveCirculization()
            float r13 = r0._angle
            float r14 = r0._cosAngle
            float r3 = r0._sinAngle
            short r5 = r55.getValGradientMode()
            if (r5 != r15) goto Ld5
            r17 = 1
            goto Ld7
        Ld5:
            r17 = 0
        Ld7:
            com.badlogic.gdx.graphics.Color r15 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            r5 = r56
            r8 = r4
            r9 = r22
            r4 = r11
            r11 = r2
            r2 = r15
            r15 = r3
            r16 = r1
            r18 = r2
            r19 = r4
            r5.mySegmentCurved(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L993
        Lef:
            if (r60 == 0) goto L129
            int r1 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r1 <= 0) goto L129
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r3 = r0._cosAngle
            float r5 = r3 * r1
            float r24 = r16 + r5
            float r5 = r0._sinAngle
            float r6 = r5 * r1
            float r25 = r17 + r6
            float r6 = r3 * r1
            float r26 = r4 - r6
            float r6 = r5 * r1
            float r27 = r22 - r6
            float r1 = r1 * r8
            float r28 = r2 + r1
            short r1 = r55.getValGradientMode()
            if (r1 != r15) goto L11a
            r31 = 1
            goto L11c
        L11a:
            r31 = 0
        L11c:
            com.badlogic.gdx.graphics.Color r33 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r29 = r3
            r30 = r5
            r32 = r33
            r23.mySegment(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L129:
            float r11 = r0._cosAngle
            float r12 = r0._sinAngle
            short r1 = r55.getValGradientMode()
            if (r1 != r15) goto L135
            r13 = 1
            goto L136
        L135:
            r13 = 0
        L136:
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r15 = r0._colorRef2
            r5 = r56
            r6 = r16
            r7 = r17
            r8 = r4
            r9 = r22
            r10 = r2
            r5.mySegment(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L993
        L149:
            if (r1 != 0) goto L225
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L150
            return
        L150:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r2 = r5 * r3
            float r6 = r6 * r3
            float r14 = r6 * r1
            int r5 = r0._curveRadius
            float r5 = (float) r5
            float r5 = r5 * r1
            float r1 = r5 * r3
            int r3 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r14, r1)
            if (r3 <= r15) goto L169
            r5 = 1
            goto L16a
        L169:
            r5 = 0
        L16a:
            if (r5 == 0) goto L1da
            if (r60 == 0) goto L1a7
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r8
            r6 = 1
            boolean r7 = r55.getValSegmentCurveCirculization()
            float r5 = r5 * r8
            float r11 = r2 + r5
            float r13 = r0._angle
            float r12 = r0._cosAngle
            float r10 = r0._sinAngle
            short r5 = r55.getValGradientMode()
            if (r5 != r15) goto L18a
            r17 = 1
            goto L18c
        L18a:
            r17 = 0
        L18c:
            com.badlogic.gdx.graphics.Color r19 = com.badlogic.gdx.graphics.Color.RED
            r5 = r56
            r8 = r4
            r9 = r22
            r16 = r10
            r10 = r14
            r18 = r12
            r12 = r1
            r21 = r14
            r14 = r18
            r15 = r16
            r16 = r3
            r18 = r19
            r5.mySegmentCurved(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L1a9
        L1a7:
            r21 = r14
        L1a9:
            r6 = 1
            boolean r7 = r55.getValSegmentCurveCirculization()
            float r13 = r0._angle
            float r14 = r0._cosAngle
            float r15 = r0._sinAngle
            short r5 = r55.getValGradientMode()
            r12 = 1
            if (r5 != r12) goto L1be
            r17 = 1
            goto L1c0
        L1be:
            r17 = 0
        L1c0:
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            r5 = r56
            r8 = r4
            r9 = r22
            r10 = r21
            r4 = r11
            r11 = r2
            r2 = r12
            r12 = r1
            r16 = r3
            r18 = r2
            r19 = r4
            r5.mySegmentCurved(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L993
        L1da:
            r12 = 1
            if (r60 == 0) goto L204
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r1 = r1 * r8
            float r10 = r2 + r1
            float r11 = r0._cosAngle
            float r1 = r0._sinAngle
            short r3 = r55.getValGradientMode()
            if (r3 != r12) goto L1f1
            r13 = 1
            goto L1f2
        L1f1:
            r13 = 0
        L1f2:
            com.badlogic.gdx.graphics.Color r15 = com.badlogic.gdx.graphics.Color.RED
            r5 = r56
            r6 = r16
            r7 = r17
            r8 = r4
            r9 = r22
            r3 = 1
            r12 = r1
            r14 = r15
            r5.myRoundedSegment(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L205
        L204:
            r3 = 1
        L205:
            float r11 = r0._cosAngle
            float r12 = r0._sinAngle
            short r1 = r55.getValGradientMode()
            if (r1 != r3) goto L211
            r13 = 1
            goto L212
        L211:
            r13 = 0
        L212:
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r15 = r0._colorRef2
            r5 = r56
            r6 = r16
            r7 = r17
            r8 = r4
            r9 = r22
            r10 = r2
            r5.myRoundedSegment(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L993
        L225:
            r9 = 1
            r10 = 2
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1119092736(0x42b40000, float:90.0)
            if (r1 != r10) goto L46b
            float r1 = r5 * r3
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r7
            float r1 = r1 * r11
            float r13 = r6 + r5
            float r13 = r13 * r3
            float r13 = r13 * r7
            float r7 = r13 * r11
            boolean r13 = r55.getValUseCircleOutline()
            boolean r14 = r55.getValCircleIsHollow()
            boolean r15 = r55.getValUseGradient()
            if (r15 == 0) goto L250
            short r15 = r55.getValGradientMode()
            goto L251
        L250:
            r15 = 2
        L251:
            boolean r18 = r55.getValHalfArc()
            if (r18 != 0) goto L3c8
            int r2 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r7)
            if (r14 == 0) goto L2bb
            if (r13 != 0) goto L260
            goto L2bb
        L260:
            if (r60 == 0) goto L296
            r4 = 1090519040(0x41000000, float:8.0)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r12
            float r4 = r4 / r3
            float r4 = r4 + r5
            float r18 = r4 * r3
            float r18 = r18 * r12
            float r18 = r18 * r11
            float r4 = r4 + r6
            float r4 = r4 * r3
            float r4 = r4 * r12
            float r27 = r4 * r11
            float r4 = r0._cosAngle
            float r12 = r4 * r18
            float r12 = r16 + r12
            float r4 = r4 * r27
            float r24 = r12 - r4
            float r4 = r0._sinAngle
            float r12 = r4 * r18
            float r12 = r17 + r12
            float r4 = r4 * r27
            float r25 = r12 - r4
            float r26 = r18 * r8
            com.badlogic.gdx.graphics.Color r29 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r28 = r2
            r23.circleOutline(r24, r25, r26, r27, r28, r29)
        L296:
            float r4 = r0._cosAngle
            float r12 = r4 * r1
            float r12 = r16 + r12
            float r4 = r4 * r7
            float r24 = r12 - r4
            float r4 = r0._sinAngle
            float r12 = r4 * r1
            float r12 = r17 + r12
            float r4 = r4 * r7
            float r25 = r12 - r4
            float r26 = r1 * r8
            com.badlogic.gdx.graphics.Color r29 = r55.getValColorCircleOutline()
            r23 = r56
            r27 = r7
            r28 = r2
            r23.circleOutline(r24, r25, r26, r27, r28, r29)
            goto L360
        L2bb:
            if (r60 == 0) goto L2e2
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r8
            float r8 = r0._cosAngle
            float r12 = r8 * r1
            float r12 = r16 + r12
            float r8 = r8 * r7
            float r24 = r12 - r8
            float r8 = r0._sinAngle
            float r12 = r8 * r1
            float r12 = r17 + r12
            float r8 = r8 * r7
            float r25 = r12 - r8
            float r26 = r7 + r4
            com.badlogic.gdx.graphics.Color r29 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r27 = r2
            r28 = r29
            r23.circle(r24, r25, r26, r27, r28, r29)
        L2e2:
            if (r13 != 0) goto L33d
            if (r15 != r10) goto L30c
            float r4 = r0._cosAngle
            float r8 = r4 * r1
            float r8 = r16 + r8
            float r4 = r4 * r7
            float r24 = r8 - r4
            float r4 = r0._sinAngle
            float r8 = r4 * r1
            float r8 = r17 + r8
            float r4 = r4 * r7
            float r25 = r8 - r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r8 = r0._colorRef2
            r23 = r56
            r26 = r7
            r27 = r2
            r28 = r4
            r29 = r8
            r23.circle(r24, r25, r26, r27, r28, r29)
            goto L360
        L30c:
            float r4 = r0._cosAngle
            float r8 = r4 * r1
            float r8 = r16 + r8
            float r4 = r4 * r7
            float r24 = r8 - r4
            float r4 = r0._sinAngle
            float r8 = r4 * r1
            float r8 = r17 + r8
            float r4 = r4 * r7
            float r25 = r8 - r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r8 = r0._colorRef2
            float r12 = r0._angle
            if (r15 != 0) goto L32b
            r31 = 1
            goto L32d
        L32b:
            r31 = 0
        L32d:
            r23 = r56
            r26 = r7
            r27 = r2
            r28 = r4
            r29 = r8
            r30 = r12
            r23.circle(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L360
        L33d:
            com.badlogic.gdx.graphics.Color r29 = r55.getValColorCircleOutline()
            float r4 = r0._cosAngle
            float r8 = r4 * r1
            float r8 = r16 + r8
            float r4 = r4 * r7
            float r24 = r8 - r4
            float r4 = r0._sinAngle
            float r8 = r4 * r1
            float r8 = r17 + r8
            float r4 = r4 * r7
            float r25 = r8 - r4
            r23 = r56
            r26 = r7
            r27 = r2
            r28 = r29
            r23.circle(r24, r25, r26, r27, r28, r29)
        L360:
            if (r14 != 0) goto L993
            if (r13 == 0) goto L993
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 >= 0) goto L993
            float r6 = r6 - r5
            float r6 = r6 * r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r3
            float r26 = r6 * r11
            if (r15 != r10) goto L398
            float r3 = r0._cosAngle
            float r4 = r3 * r1
            float r16 = r16 - r4
            float r3 = r3 * r26
            float r24 = r16 - r3
            float r3 = r0._sinAngle
            float r1 = r1 * r3
            float r17 = r17 - r1
            float r3 = r3 * r26
            float r25 = r17 - r3
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r23 = r56
            r27 = r2
            r28 = r1
            r29 = r3
            r23.circle(r24, r25, r26, r27, r28, r29)
            goto L993
        L398:
            float r3 = r0._cosAngle
            float r4 = r3 * r1
            float r16 = r16 - r4
            float r3 = r3 * r26
            float r24 = r16 - r3
            float r3 = r0._sinAngle
            float r1 = r1 * r3
            float r17 = r17 - r1
            float r3 = r3 * r26
            float r25 = r17 - r3
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            float r4 = r0._angle
            if (r15 != 0) goto L3b7
            r31 = 1
            goto L3b9
        L3b7:
            r31 = 0
        L3b9:
            r23 = r56
            r27 = r2
            r28 = r1
            r29 = r3
            r30 = r4
            r23.circle(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L993
        L3c8:
            r3 = 1084227584(0x40a00000, float:5.0)
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r7)
            float r5 = (float) r5
            float r5 = r5 * r11
            float r3 = java.lang.Math.max(r3, r5)
            int r3 = (int) r3
            float r5 = r7 * r8
            boolean r6 = r55.getValTriangleUpsideDown()
            if (r6 == 0) goto L3ee
            float r4 = r0._cosAngle
            float r4 = r4 * r1
            float r16 = r16 + r4
            float r4 = r0._sinAngle
            float r4 = r4 * r1
            float r17 = r17 + r4
            float r1 = r0._angle
            float r1 = r1 + r12
            goto L400
        L3ee:
            float r6 = r0._cosAngle
            float r6 = r6 * r1
            float r4 = r4 - r6
            float r6 = r0._sinAngle
            float r6 = r6 * r1
            float r22 = r22 - r6
            float r1 = r0._angle
            float r1 = r1 - r12
            r16 = r4
            r17 = r22
        L400:
            if (r60 == 0) goto L430
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r8
            r6 = -1
        L407:
            if (r6 > r9) goto L430
            r7 = -1
        L40a:
            if (r7 > r9) goto L42d
            if (r6 != 0) goto L411
            if (r7 != 0) goto L411
            goto L42a
        L411:
            float r8 = (float) r6
            float r8 = r8 * r4
            float r11 = (float) r7
            float r11 = r11 * r4
            float r24 = r8 + r16
            float r25 = r11 + r17
            com.badlogic.gdx.graphics.Color r30 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r26 = r5
            r27 = r3
            r28 = r1
            r29 = r30
            r23.halfCircle(r24, r25, r26, r27, r28, r29, r30)
        L42a:
            int r7 = r7 + 1
            goto L40a
        L42d:
            int r6 = r6 + 1
            goto L407
        L430:
            if (r15 != r10) goto L44b
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r23 = r56
            r24 = r16
            r25 = r17
            r26 = r5
            r27 = r3
            r28 = r1
            r29 = r2
            r30 = r4
            r23.halfCircle(r24, r25, r26, r27, r28, r29, r30)
            goto L993
        L44b:
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            if (r15 != 0) goto L454
            r31 = 1
            goto L456
        L454:
            r31 = 0
        L456:
            r23 = r56
            r24 = r16
            r25 = r17
            r26 = r5
            r27 = r3
            r28 = r1
            r29 = r2
            r30 = r4
            r23.halfCircle(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L993
        L46b:
            r13 = 5
            if (r1 != r13) goto L5d9
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L473
            return
        L473:
            float r5 = r5 * r3
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r6 = r6 * r3
            float r1 = r1 * r6
            float r3 = r0._angle
            float r3 = r3 - r12
            float r6 = r5 * r11
            float r12 = r1 * r11
            float r14 = java.lang.Math.max(r6, r12)
            int r14 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r14)
            int r15 = r14 / 2
            int r13 = java.lang.Math.max(r13, r15)
            boolean r15 = r55.getValUseGradient()
            if (r15 == 0) goto L49d
            short r15 = r55.getValGradientMode()
            goto L49e
        L49d:
            r15 = 2
        L49e:
            boolean r18 = r55.getValHalfArc()
            if (r18 == 0) goto L4ba
            boolean r7 = r55.getValTriangleUpsideDown()
            if (r7 == 0) goto L4b3
            float r7 = r16 - r6
            float r16 = r17 - r1
            r17 = 1127481344(0x43340000, float:180.0)
            float r17 = r3 - r17
            goto L4be
        L4b3:
            float r7 = r4 - r6
            float r16 = r22 - r1
            r17 = r3
            goto L4be
        L4ba:
            r16 = 0
            r17 = 0
        L4be:
            if (r60 == 0) goto L529
            float r18 = org.fortheloss.sticknodes.App.assetScaling
            float r18 = r18 * r8
        L4c4:
            if (r2 > r9) goto L529
            r10 = -1
        L4c7:
            if (r10 > r9) goto L522
            if (r2 != 0) goto L4ce
            if (r10 != 0) goto L4ce
            goto L51c
        L4ce:
            float r9 = (float) r2
            float r9 = r9 * r18
            float r8 = (float) r10
            float r8 = r8 * r18
            boolean r21 = r55.getValHalfArc()
            if (r21 != 0) goto L505
            float r9 = r9 + r4
            float r9 = r9 - r6
            float r21 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r21 = r21 * r1
            float r21 = r21 * r11
            float r24 = r9 - r21
            float r8 = r8 + r22
            float r8 = r8 - r12
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r9 = r9 * r1
            float r9 = r9 * r11
            float r25 = r8 + r9
            com.badlogic.gdx.graphics.Color r31 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r26 = r5
            r27 = r1
            r28 = r3
            r29 = r14
            r30 = r31
            r23.ellipse(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L51c
        L505:
            float r24 = r9 + r7
            float r25 = r8 + r16
            r8 = 1073741824(0x40000000, float:2.0)
            float r27 = r1 * r8
            com.badlogic.gdx.graphics.Color r31 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r26 = r5
            r28 = r17
            r29 = r13
            r30 = r31
            r23.halfEllipse(r24, r25, r26, r27, r28, r29, r30, r31)
        L51c:
            int r10 = r10 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            goto L4c7
        L522:
            int r2 = r2 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 2
            goto L4c4
        L529:
            boolean r2 = r55.getValHalfArc()
            if (r2 != 0) goto L595
            r2 = 2
            if (r15 != r2) goto L560
            float r4 = r4 - r6
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r2 = r2 * r1
            float r2 = r2 * r11
            float r24 = r4 - r2
            float r22 = r22 - r12
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r2 = r2 * r1
            float r2 = r2 * r11
            float r25 = r22 + r2
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r23 = r56
            r26 = r5
            r27 = r1
            r28 = r3
            r29 = r14
            r30 = r2
            r31 = r4
            r23.ellipse(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L993
        L560:
            float r4 = r4 - r6
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r2 = r2 * r1
            float r2 = r2 * r11
            float r24 = r4 - r2
            float r22 = r22 - r12
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r2 = r2 * r1
            float r2 = r2 * r11
            float r25 = r22 + r2
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            if (r15 != 0) goto L580
            r32 = 1
            goto L582
        L580:
            r32 = 0
        L582:
            r23 = r56
            r26 = r5
            r27 = r1
            r28 = r3
            r29 = r14
            r30 = r2
            r31 = r4
            r23.ellipse(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L993
        L595:
            r2 = 2
            if (r15 != r2) goto L5b5
            r2 = 1073741824(0x40000000, float:2.0)
            float r27 = r1 * r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r23 = r56
            r24 = r7
            r25 = r16
            r26 = r5
            r28 = r17
            r29 = r13
            r30 = r1
            r31 = r2
            r23.halfEllipse(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L993
        L5b5:
            r2 = 1073741824(0x40000000, float:2.0)
            float r27 = r1 * r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            if (r15 != 0) goto L5c2
            r32 = 1
            goto L5c4
        L5c2:
            r32 = 0
        L5c4:
            r23 = r56
            r24 = r7
            r25 = r16
            r26 = r5
            r28 = r17
            r29 = r13
            r30 = r1
            r31 = r2
            r23.halfEllipse(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L993
        L5d9:
            r2 = 6
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r2) goto L7aa
            float r1 = r55.getValTrapezoidThickness1()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r11 = r1 * r3
            float r1 = r55.getValTrapezoidThickness2()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r10 = r1 * r3
            boolean r1 = r55.getValTrapezoidIsRounded1()
            boolean r2 = r55.getValTrapezoidIsRounded2()
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 > 0) goto L603
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 > 0) goto L603
            return
        L603:
            float r6 = r6 * r3
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r6 * r5
            boolean r5 = r55.isUsingGradient()
            if (r5 == 0) goto L61a
            short r5 = r55.getValGradientMode()
            r6 = 1
            if (r5 != r6) goto L617
            goto L61a
        L617:
            r18 = 0
            goto L61c
        L61a:
            r18 = 1
        L61c:
            int r5 = r0._curveRadius
            float r5 = (float) r5
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            float r3 = r3 * r5
            float r5 = java.lang.Math.max(r11, r10)
            int r9 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForTrapezoidCurve(r13, r3, r5)
            r5 = 1
            if (r9 <= r5) goto L632
            r20 = 1
        L632:
            if (r20 == 0) goto L6b5
            if (r60 == 0) goto L68c
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            float r7 = r0._cosAngle
            float r7 = r7 * r5
            float r8 = r0._sinAngle
            float r8 = r8 * r5
            float r7 = r4 - r7
            float r8 = r22 - r8
            float r6 = r6 * r5
            float r12 = r13 + r6
            boolean r14 = r55.getValTrapezoidIsRounded1()
            if (r14 == 0) goto L65f
            float r5 = r5 + r13
            r40 = r4
            if (r2 == 0) goto L65a
            r44 = r13
            goto L65c
        L65a:
            r44 = r5
        L65c:
            r41 = r22
            goto L665
        L65f:
            r40 = r7
            r41 = r8
            r44 = r12
        L665:
            boolean r39 = r55.getValSegmentCurveCirculization()
            float r42 = r10 + r6
            float r43 = r11 + r6
            float r5 = r0._angle
            r45 = r5
            float r5 = r0._cosAngle
            r47 = r5
            float r5 = r0._sinAngle
            r48 = r5
            com.badlogic.gdx.graphics.Color r53 = com.badlogic.gdx.graphics.Color.RED
            r54 = r53
            r38 = r56
            r46 = r3
            r49 = r9
            r50 = r18
            r51 = r2
            r52 = r1
            r38.myTrapezoidCurved(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
        L68c:
            boolean r6 = r55.getValSegmentCurveCirculization()
            float r12 = r0._angle
            float r14 = r0._cosAngle
            float r15 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef1
            r20 = r5
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r21 = r5
            r5 = r56
            r7 = r4
            r8 = r22
            r4 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r3
            r16 = r4
            r17 = r18
            r18 = r2
            r19 = r1
            r5.myTrapezoidCurved(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L993
        L6b5:
            if (r1 != 0) goto L707
            if (r2 == 0) goto L6ba
            goto L707
        L6ba:
            if (r60 == 0) goto L6e9
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r3 = r0._cosAngle
            float r5 = r1 * r3
            float r6 = r0._sinAngle
            float r7 = r1 * r6
            float r24 = r16 + r5
            float r25 = r17 + r7
            float r26 = r4 - r5
            float r27 = r22 - r7
            float r1 = r1 * r2
            float r28 = r10 + r1
            float r29 = r11 + r1
            float r30 = r13 + r1
            com.badlogic.gdx.graphics.Color r35 = com.badlogic.gdx.graphics.Color.RED
            r23 = r56
            r31 = r3
            r32 = r6
            r33 = r18
            r34 = r35
            r23.myTrapezoid(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L6e9:
            float r1 = r0._cosAngle
            float r14 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r5 = r56
            r6 = r16
            r7 = r17
            r8 = r4
            r9 = r22
            r12 = r13
            r13 = r1
            r15 = r18
            r16 = r2
            r17 = r3
            r5.myTrapezoid(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L993
        L707:
            if (r60 == 0) goto L785
            float r3 = r16 + r8
            float r5 = r17 + r8
            float r6 = r4 + r8
            float r7 = r22 + r8
            float r9 = r0._angle
            float r12 = r0._cosAngle
            float r14 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r15 = com.badlogic.gdx.graphics.Color.RED
            r38 = r56
            r39 = r3
            r40 = r5
            r41 = r6
            r42 = r7
            r43 = r10
            r44 = r11
            r45 = r13
            r46 = r9
            r47 = r12
            r48 = r14
            r49 = r18
            r50 = r2
            r51 = r1
            r52 = r15
            r53 = r15
            r38.myRoundedTrapezoid(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            float r9 = r17 - r8
            float r12 = r22 - r8
            float r14 = r0._angle
            float r8 = r0._cosAngle
            r58 = r7
            float r7 = r0._sinAngle
            r40 = r9
            r42 = r12
            r46 = r14
            r47 = r8
            r48 = r7
            r38.myRoundedTrapezoid(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r16 - r3
            float r3 = r4 - r3
            float r7 = r0._angle
            float r8 = r0._cosAngle
            float r14 = r0._sinAngle
            r39 = r6
            r40 = r5
            r41 = r3
            r42 = r58
            r46 = r7
            r47 = r8
            r48 = r14
            r38.myRoundedTrapezoid(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            float r5 = r0._angle
            float r7 = r0._cosAngle
            float r8 = r0._sinAngle
            r40 = r9
            r42 = r12
            r46 = r5
            r47 = r7
            r48 = r8
            r38.myRoundedTrapezoid(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
        L785:
            float r3 = r0._angle
            float r14 = r0._cosAngle
            float r15 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r9 = r0._colorRef2
            r5 = r56
            r6 = r16
            r7 = r17
            r8 = r4
            r4 = r9
            r9 = r22
            r19 = r12
            r12 = r13
            r13 = r3
            r16 = r18
            r17 = r2
            r18 = r1
            r20 = r4
            r5.myRoundedTrapezoid(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L993
        L7aa:
            r2 = 3
            if (r1 != r2) goto L92b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L7b2
            return
        L7b2:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r1
            float r5 = r5 * r3
            float r5 = r5 * r11
            boolean r1 = r55.getValTriangleUpsideDown()
            if (r1 == 0) goto L7c9
            r25 = r4
            r4 = r16
            r26 = r22
            r22 = r17
            goto L7cd
        L7c9:
            r25 = r16
            r26 = r17
        L7cd:
            if (r60 == 0) goto L88e
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            r2 = r56
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setColor(r3, r7, r7, r3)
            r3 = -1
            r6 = 1
        L7de:
            if (r3 > r6) goto L890
            r7 = -1
        L7e1:
            if (r7 > r6) goto L88a
            if (r3 != 0) goto L7e9
            if (r7 != 0) goto L7e9
            goto L886
        L7e9:
            float r8 = (float) r3
            float r8 = r8 * r1
            float r9 = (float) r7
            float r9 = r9 * r1
            short r10 = r0._rightTriangleDirection
            if (r10 != 0) goto L82d
            float r10 = r8 + r4
            float r11 = r0._angle
            float r11 = r11 - r12
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r11 = r11 * r5
            float r28 = r10 + r11
            float r11 = r9 + r22
            float r13 = r0._angle
            float r13 = r13 - r12
            float r13 = org.fortheloss.framework.CustomMathUtils.sinDeg(r13)
            float r13 = r13 * r5
            float r29 = r11 + r13
            float r13 = r0._angle
            float r13 = r13 + r12
            float r13 = org.fortheloss.framework.CustomMathUtils.cosDeg(r13)
            float r13 = r13 * r5
            float r30 = r10 + r13
            float r10 = r0._angle
            float r10 = r10 + r12
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r10 = r10 * r5
            float r31 = r11 + r10
            float r32 = r8 + r25
            float r33 = r9 + r26
            r27 = r56
            r27.triangle(r28, r29, r30, r31, r32, r33)
            goto L886
        L82d:
            float r10 = r8 + r4
            float r11 = r0._angle
            float r11 = r11 - r12
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r11 = r11 * r5
            float r28 = r10 + r11
            float r11 = r9 + r22
            float r13 = r0._angle
            float r13 = r13 - r12
            float r13 = org.fortheloss.framework.CustomMathUtils.sinDeg(r13)
            float r13 = r13 * r5
            float r29 = r11 + r13
            float r13 = r0._angle
            float r13 = r13 + r12
            float r13 = org.fortheloss.framework.CustomMathUtils.cosDeg(r13)
            float r13 = r13 * r5
            float r30 = r10 + r13
            float r10 = r0._angle
            float r10 = r10 + r12
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r10 = r10 * r5
            float r31 = r11 + r10
            float r8 = r8 + r25
            float r10 = r0._angle
            short r11 = r0._rightTriangleDirection
            int r11 = r11 * 90
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r10)
            float r10 = r10 * r5
            float r32 = r8 + r10
            float r9 = r9 + r26
            float r8 = r0._angle
            short r10 = r0._rightTriangleDirection
            int r10 = r10 * 90
            float r10 = (float) r10
            float r8 = r8 - r10
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r8)
            float r8 = r8 * r5
            float r33 = r9 + r8
            r27 = r56
            r27.triangle(r28, r29, r30, r31, r32, r33)
        L886:
            int r7 = r7 + 1
            goto L7e1
        L88a:
            int r3 = r3 + 1
            goto L7de
        L88e:
            r2 = r56
        L890:
            short r1 = r0._rightTriangleDirection
            if (r1 != 0) goto L8d1
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r5
            float r21 = r4 + r1
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r5
            float r1 = r22 + r1
            float r3 = r0._angle
            float r3 = r3 + r12
            float r3 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r3 = r3 * r5
            float r23 = r4 + r3
            float r3 = r0._angle
            float r3 = r3 + r12
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r3 = r3 * r5
            float r24 = r22 + r3
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            r20 = r56
            r22 = r1
            r27 = r3
            r28 = r4
            r20.triangle(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L993
        L8d1:
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r5
            float r28 = r4 + r1
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r5
            float r29 = r22 + r1
            float r1 = r0._angle
            float r1 = r1 + r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r5
            float r30 = r4 + r1
            float r1 = r0._angle
            float r1 = r1 + r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r5
            float r31 = r22 + r1
            float r1 = r0._angle
            short r3 = r0._rightTriangleDirection
            int r3 = r3 * 90
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r5
            float r32 = r25 + r1
            float r1 = r0._angle
            short r3 = r0._rightTriangleDirection
            int r3 = r3 * 90
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r5
            float r33 = r26 + r1
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef1
            r27 = r56
            r34 = r1
            r35 = r3
            r27.triangle(r28, r29, r30, r31, r32, r33, r34, r35)
            goto L993
        L92b:
            r2 = r56
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r5 * r1
            float r7 = r7 * r3
            float r7 = r7 * r11
            float r6 = r6 + r5
            float r6 = r6 * r3
            float r6 = r6 * r1
            float r3 = r6 * r11
            if (r60 == 0) goto L969
            r5 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r5
            float r5 = r0._cosAngle
            float r6 = r5 * r7
            float r6 = r4 - r6
            float r5 = r5 * r3
            float r28 = r6 + r5
            float r5 = r0._sinAngle
            float r6 = r5 * r7
            float r6 = r22 - r6
            float r5 = r5 * r3
            float r29 = r6 + r5
            float r30 = r3 + r1
            short r31 = r55.getValNumPolygonVertices()
            float r1 = r0._angle
            com.badlogic.gdx.graphics.Color r34 = com.badlogic.gdx.graphics.Color.RED
            r27 = r56
            r32 = r1
            r33 = r34
            r27.polygon(r28, r29, r30, r31, r32, r33, r34)
        L969:
            float r1 = r0._cosAngle
            float r5 = r1 * r7
            float r4 = r4 - r5
            float r1 = r1 * r3
            float r28 = r4 + r1
            float r1 = r0._sinAngle
            float r7 = r7 * r1
            float r22 = r22 - r7
            float r1 = r1 * r3
            float r29 = r22 + r1
            short r31 = r55.getValNumPolygonVertices()
            float r1 = r0._angle
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r27 = r56
            r30 = r3
            r32 = r1
            r33 = r4
            r34 = r5
            r27.polygon(r28, r29, r30, r31, r32, r33, r34)
        L993:
            return
    }

    public void drawLimbAA(org.fortheloss.sticknodes.SNShapeRenderer r54, float r55, float r56, float r57) {
            r53 = this;
            r0 = r53
            boolean r1 = r53.isPolyfillAnchor()
            if (r1 == 0) goto Lb
            r53.drawPolyfillAA(r54, r55, r56, r57)
        Lb:
            int r1 = r53.getValLimbType()
            float r2 = r53.getValLength()
            int r3 = r53.getValThickness()
            float r3 = (float) r3
            r4 = -1
            if (r1 == r4) goto Lb94
            boolean r5 = r53.getValUseSegmentScale()
            if (r5 == 0) goto L2e
            float r5 = r53.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r0._stickfigureRef
            float r6 = r6.getScale()
            float r5 = r5 * r6
            goto L34
        L2e:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0._stickfigureRef
            float r5 = r5.getScale()
        L34:
            float r5 = r5 * r57
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r0._parentNodeRef
            float r6 = r6.getX()
            float r6 = r6 * r57
            float r6 = r55 + r6
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r0._parentNodeRef
            float r7 = r7.getY()
            float r7 = r7 * r57
            float r24 = r56 + r7
            float r7 = r0._localX
            float r7 = r7 * r5
            float r18 = r6 + r7
            float r7 = r0._localY
            float r7 = r7 * r5
            float r19 = r24 + r7
            r7 = 1086324736(0x40c00000, float:6.0)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            r10 = 1117782016(0x42a00000, float:80.0)
            r11 = 0
            r12 = 2
            r13 = 1056964608(0x3f000000, float:0.5)
            r22 = 0
            r15 = 1
            if (r1 != r15) goto L187
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 > 0) goto L6b
            return
        L6b:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r3 = r3 * r5
            float r2 = r2 * r5
            float r4 = r2 * r1
            int r14 = r0._curveRadius
            float r14 = (float) r14
            float r14 = r14 * r1
            float r1 = r14 * r5
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r4, r1)
            if (r5 <= r15) goto L84
            r14 = 1
            goto L85
        L84:
            r14 = 0
        L85:
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r16
            float r2 = java.lang.Math.max(r3, r2)
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 >= 0) goto L94
            float r9 = r2 / r10
            goto L96
        L94:
            r9 = 1065353216(0x3f800000, float:1.0)
        L96:
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r10 = r0._colorRef1
            r2.set(r10)
            com.badlogic.gdx.graphics.Color r10 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            r10.set(r11)
            r2.mul(r8)
            r10.mul(r8)
            float r9 = r9 * r7
            int r2 = (int) r9
            int r2 = java.lang.Math.max(r12, r2)
            r23 = 1044325772(0x3e3f258c, float:0.18666667)
            if (r14 == 0) goto L129
            r11 = 0
            r14 = 0
        Lb8:
            if (r14 > r2) goto Lf4
            float r25 = r11 + r23
            r8 = 0
            boolean r9 = r53.getValSegmentCurveCirculization()
            float r13 = r3 + r25
            float r12 = r0._angle
            float r11 = r0._cosAngle
            float r10 = r0._sinAngle
            short r7 = r53.getValGradientMode()
            if (r7 != r15) goto Ld2
            r19 = 1
            goto Ld4
        Ld2:
            r19 = 0
        Ld4:
            com.badlogic.gdx.graphics.Color r20 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r21 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r7 = r54
            r17 = r10
            r10 = r6
            r16 = r11
            r11 = r24
            r18 = r12
            r12 = r4
            r26 = r14
            r14 = r1
            r15 = r18
            r18 = r5
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r14 = r26 + 1
            r11 = r25
            r15 = 1
            goto Lb8
        Lf4:
            r8 = 0
            boolean r9 = r53.getValSegmentCurveCirculization()
            float r15 = r0._angle
            float r2 = r0._cosAngle
            float r14 = r0._sinAngle
            short r7 = r53.getValGradientMode()
            r11 = 1
            if (r7 != r11) goto L109
            r19 = 1
            goto L10b
        L109:
            r19 = 0
        L10b:
            com.badlogic.gdx.graphics.Color r13 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef2
            r7 = r54
            r10 = r6
            r11 = r24
            r6 = r12
            r12 = r4
            r4 = r13
            r13 = r3
            r3 = r14
            r14 = r1
            r16 = r2
            r17 = r3
            r18 = r5
            r20 = r4
            r21 = r6
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lb94
        L129:
            r11 = 1
            r1 = 0
            r4 = 0
        L12c:
            if (r4 > r2) goto L163
            float r1 = r1 + r23
            float r5 = r1 * r13
            float r7 = r0._cosAngle
            float r8 = r7 * r5
            float r26 = r18 + r8
            float r8 = r0._sinAngle
            float r9 = r8 * r5
            float r27 = r19 + r9
            float r9 = r7 * r5
            float r28 = r6 - r9
            float r5 = r5 * r8
            float r29 = r24 - r5
            float r30 = r3 + r1
            short r5 = r53.getValGradientMode()
            if (r5 != r11) goto L151
            r33 = 1
            goto L153
        L151:
            r33 = 0
        L153:
            com.badlogic.gdx.graphics.Color r34 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r35 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r25 = r54
            r31 = r7
            r32 = r8
            r25.mySegment(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            int r4 = r4 + 1
            goto L12c
        L163:
            float r13 = r0._cosAngle
            float r14 = r0._sinAngle
            short r1 = r53.getValGradientMode()
            if (r1 != r11) goto L16f
            r15 = 1
            goto L170
        L16f:
            r15 = 0
        L170:
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r7 = r54
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r12 = r3
            r16 = r1
            r17 = r2
            r7.mySegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lb94
        L187:
            r11 = 1
            if (r1 != 0) goto L2b5
            r14 = 0
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 > 0) goto L190
            return
        L190:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r3 = r3 * r5
            float r2 = r2 * r5
            float r4 = r2 * r1
            int r13 = r0._curveRadius
            float r13 = (float) r13
            float r13 = r13 * r1
            float r1 = r13 * r5
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r4, r1)
            if (r5 <= r11) goto L1a9
            r15 = 1
            goto L1aa
        L1a9:
            r15 = 0
        L1aa:
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r13
            float r2 = java.lang.Math.max(r3, r2)
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 >= 0) goto L1b9
            float r9 = r2 / r10
            goto L1bb
        L1b9:
            r9 = 1065353216(0x3f800000, float:1.0)
        L1bb:
            r2 = 1041194025(0x3e0f5c29, float:0.14)
            com.badlogic.gdx.graphics.Color r10 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r13 = r0._colorRef1
            r10.set(r13)
            com.badlogic.gdx.graphics.Color r13 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef2
            r13.set(r14)
            r10.mul(r8)
            r13.mul(r8)
            float r9 = r9 * r7
            int r7 = (int) r9
            int r14 = java.lang.Math.max(r12, r7)
            if (r15 == 0) goto L256
            r7 = 0
            r15 = 0
        L1dd:
            if (r15 > r14) goto L221
            float r23 = r7 + r2
            r8 = 1
            boolean r9 = r53.getValSegmentCurveCirculization()
            float r13 = r3 + r23
            float r12 = r0._angle
            float r10 = r0._cosAngle
            float r7 = r0._sinAngle
            short r2 = r53.getValGradientMode()
            if (r2 != r11) goto L1f7
            r19 = 1
            goto L1f9
        L1f7:
            r19 = 0
        L1f9:
            com.badlogic.gdx.graphics.Color r20 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r21 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r2 = r7
            r7 = r54
            r16 = r10
            r10 = r6
            r11 = r24
            r17 = r12
            r12 = r4
            r36 = r14
            r14 = r1
            r25 = r15
            r15 = r17
            r17 = r2
            r18 = r5
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r15 = r25 + 1
            r7 = r23
            r14 = r36
            r2 = 1041194025(0x3e0f5c29, float:0.14)
            r11 = 1
            goto L1dd
        L221:
            r8 = 1
            boolean r9 = r53.getValSegmentCurveCirculization()
            float r15 = r0._angle
            float r2 = r0._cosAngle
            float r14 = r0._sinAngle
            short r7 = r53.getValGradientMode()
            r13 = 1
            if (r7 != r13) goto L236
            r19 = 1
            goto L238
        L236:
            r19 = 0
        L238:
            com.badlogic.gdx.graphics.Color r13 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef2
            r7 = r54
            r10 = r6
            r11 = r24
            r6 = r12
            r12 = r4
            r4 = r13
            r13 = r3
            r3 = r14
            r14 = r1
            r16 = r2
            r17 = r3
            r18 = r5
            r20 = r4
            r21 = r6
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lb94
        L256:
            r13 = 1
            r1 = r14
            r2 = 0
            r11 = 0
        L25a:
            if (r2 > r1) goto L290
            r4 = 1041194025(0x3e0f5c29, float:0.14)
            float r5 = r11 + r4
            float r12 = r3 + r5
            float r14 = r0._cosAngle
            float r15 = r0._sinAngle
            short r7 = r53.getValGradientMode()
            if (r7 != r13) goto L270
            r16 = 1
            goto L272
        L270:
            r16 = 0
        L272:
            com.badlogic.gdx.graphics.Color r17 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r20 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r7 = r54
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r4 = 1
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r20
            r7.myRoundedSegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            int r2 = r2 + 1
            r11 = r5
            r13 = 1
            goto L25a
        L290:
            r4 = 1
            float r13 = r0._cosAngle
            float r14 = r0._sinAngle
            short r1 = r53.getValGradientMode()
            if (r1 != r4) goto L29d
            r15 = 1
            goto L29e
        L29d:
            r15 = 0
        L29e:
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r7 = r54
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r12 = r3
            r16 = r1
            r17 = r2
            r7.myRoundedSegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lb94
        L2b5:
            r4 = 1
            r11 = -1
            r14 = 1036831949(0x3dcccccd, float:0.1)
            r15 = 5
            r16 = 1073741824(0x40000000, float:2.0)
            r17 = 1119092736(0x42b40000, float:90.0)
            if (r1 != r12) goto L57a
            float r1 = r3 * r5
            float r20 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r20
            float r1 = r1 * r13
            float r21 = r2 + r3
            float r21 = r21 * r5
            float r21 = r21 * r20
            float r20 = r21 * r13
            boolean r21 = r53.getValUseCircleOutline()
            boolean r23 = r53.getValCircleIsHollow()
            boolean r25 = r53.getValUseGradient()
            if (r25 == 0) goto L2e6
            short r25 = r53.getValGradientMode()
            r9 = r25
            goto L2e7
        L2e6:
            r9 = 2
        L2e7:
            boolean r25 = r53.getValHalfArc()
            if (r25 != 0) goto L484
            int r6 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r20)
            if (r21 != 0) goto L2f8
            com.badlogic.gdx.graphics.Color r10 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            goto L300
        L2f8:
            com.badlogic.gdx.graphics.Color r10 = r53.getValColorCircleOutline()
            com.badlogic.gdx.graphics.Color r11 = r53.getValColorCircleOutline()
        L300:
            r14 = 1035937164(0x3dbf258c, float:0.093333334)
            r15 = 1109393408(0x42200000, float:40.0)
            if (r23 == 0) goto L36a
            if (r21 != 0) goto L30a
            goto L36a
        L30a:
            float r2 = r0._cosAngle
            float r3 = r2 * r1
            float r18 = r18 + r3
            float r2 = r2 * r20
            float r2 = r18 - r2
            float r3 = r0._sinAngle
            float r4 = r3 * r1
            float r19 = r19 + r4
            float r3 = r3 * r20
            float r3 = r19 - r3
            int r4 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r4 >= 0) goto L325
            float r9 = r20 / r15
            goto L327
        L325:
            r9 = 1065353216(0x3f800000, float:1.0)
        L327:
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r5 = r53.getValColorCircleOutline()
            r4.set(r5)
            r4.mul(r8)
            float r9 = r9 * r7
            int r4 = (int) r9
            int r4 = java.lang.Math.max(r12, r4)
            r5 = 0
            r11 = 0
        L33c:
            if (r5 > r4) goto L355
            float r11 = r11 + r14
            float r7 = r1 * r16
            float r29 = r7 + r11
            float r30 = r20 + r11
            com.badlogic.gdx.graphics.Color r32 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            r26 = r54
            r27 = r2
            r28 = r3
            r31 = r6
            r26.circleOutline(r27, r28, r29, r30, r31, r32)
            int r5 = r5 + 1
            goto L33c
        L355:
            float r28 = r1 * r16
            com.badlogic.gdx.graphics.Color r31 = r53.getValColorCircleOutline()
            r25 = r54
            r26 = r2
            r27 = r3
            r29 = r20
            r30 = r6
            r25.circleOutline(r26, r27, r28, r29, r30, r31)
            goto Lb94
        L36a:
            float r4 = r0._cosAngle
            float r16 = r4 * r1
            float r16 = r18 + r16
            float r4 = r4 * r20
            float r4 = r16 - r4
            float r13 = r0._sinAngle
            float r16 = r13 * r1
            float r16 = r19 + r16
            float r13 = r13 * r20
            float r13 = r16 - r13
            int r16 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r16 >= 0) goto L385
            float r15 = r20 / r15
            goto L387
        L385:
            r15 = 1065353216(0x3f800000, float:1.0)
        L387:
            com.badlogic.gdx.graphics.Color r14 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            if (r21 == 0) goto L398
            r16 = 0
            int r23 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r23 <= 0) goto L398
            com.badlogic.gdx.graphics.Color r16 = r53.getValColorCircleOutline()
            r12 = r16
            goto L39a
        L398:
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef2
        L39a:
            r14.set(r12)
            r14.mul(r8)
            float r15 = r15 * r7
            int r7 = (int) r15
            r8 = 2
            int r7 = java.lang.Math.max(r8, r7)
            r12 = 0
            r14 = 0
        L3aa:
            if (r14 > r7) goto L3e7
            r15 = 1035937164(0x3dbf258c, float:0.093333334)
            float r12 = r12 + r15
            if (r21 != 0) goto L3d2
            if (r9 != r8) goto L3b5
            goto L3d2
        L3b5:
            float r29 = r20 + r12
            com.badlogic.gdx.graphics.Color r32 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            float r8 = r0._angle
            if (r9 != 0) goto L3c0
            r34 = 1
            goto L3c2
        L3c0:
            r34 = 0
        L3c2:
            r26 = r54
            r27 = r4
            r28 = r13
            r30 = r6
            r31 = r32
            r33 = r8
            r26.circle(r27, r28, r29, r30, r31, r32, r33, r34)
            goto L3e3
        L3d2:
            float r29 = r20 + r12
            com.badlogic.gdx.graphics.Color r32 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            r26 = r54
            r27 = r4
            r28 = r13
            r30 = r6
            r31 = r32
            r26.circle(r27, r28, r29, r30, r31, r32)
        L3e3:
            int r14 = r14 + 1
            r8 = 2
            goto L3aa
        L3e7:
            if (r21 != 0) goto L40a
            r7 = 2
            if (r9 != r7) goto L3ed
            goto L40a
        L3ed:
            float r7 = r0._angle
            if (r9 != 0) goto L3f4
            r33 = 1
            goto L3f6
        L3f4:
            r33 = 0
        L3f6:
            r25 = r54
            r26 = r4
            r27 = r13
            r28 = r20
            r29 = r6
            r30 = r10
            r31 = r11
            r32 = r7
            r25.circle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L41b
        L40a:
            r25 = r54
            r26 = r4
            r27 = r13
            r28 = r20
            r29 = r6
            r30 = r10
            r31 = r11
            r25.circle(r26, r27, r28, r29, r30, r31)
        L41b:
            if (r21 == 0) goto Lb94
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb94
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r29 = r2 * r3
            r2 = 2
            if (r9 != r2) goto L454
            float r2 = r0._cosAngle
            float r3 = r2 * r1
            float r18 = r18 - r3
            float r2 = r2 * r29
            float r27 = r18 - r2
            float r2 = r0._sinAngle
            float r1 = r1 * r2
            float r19 = r19 - r1
            float r2 = r2 * r29
            float r28 = r19 - r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r26 = r54
            r30 = r6
            r31 = r1
            r32 = r2
            r26.circle(r27, r28, r29, r30, r31, r32)
            goto Lb94
        L454:
            float r2 = r0._cosAngle
            float r3 = r2 * r1
            float r18 = r18 - r3
            float r2 = r2 * r29
            float r27 = r18 - r2
            float r2 = r0._sinAngle
            float r1 = r1 * r2
            float r19 = r19 - r1
            float r2 = r2 * r29
            float r28 = r19 - r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            float r3 = r0._angle
            if (r9 != 0) goto L473
            r34 = 1
            goto L475
        L473:
            r34 = 0
        L475:
            r26 = r54
            r30 = r6
            r31 = r1
            r32 = r2
            r33 = r3
            r26.circle(r27, r28, r29, r30, r31, r32, r33, r34)
            goto Lb94
        L484:
            r2 = 1084227584(0x40a00000, float:5.0)
            int r3 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r20)
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r2 = java.lang.Math.max(r2, r3)
            int r2 = (int) r2
            float r3 = r20 * r16
            boolean r4 = r53.getValTriangleUpsideDown()
            if (r4 == 0) goto L4ad
            float r4 = r0._cosAngle
            float r4 = r4 * r1
            float r18 = r18 + r4
            float r4 = r0._sinAngle
            float r4 = r4 * r1
            float r19 = r19 + r4
            float r1 = r0._angle
            float r1 = r1 + r17
            goto L4c0
        L4ad:
            float r4 = r0._cosAngle
            float r4 = r4 * r1
            float r6 = r6 - r4
            float r4 = r0._sinAngle
            float r4 = r4 * r1
            float r24 = r24 - r4
            float r1 = r0._angle
            float r1 = r1 - r17
            r18 = r6
            r19 = r24
        L4c0:
            r4 = 1057971241(0x3f0f5c29, float:0.56)
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 >= 0) goto L4cb
            float r5 = r3 / r10
            float r4 = r4 * r5
        L4cb:
            r5 = 1
        L4cc:
            if (r5 > r15) goto L53e
            r6 = -1
            r7 = 1
        L4d0:
            if (r6 > r7) goto L53a
            r8 = -1
        L4d3:
            if (r8 > r7) goto L535
            if (r6 != 0) goto L4da
            if (r8 != 0) goto L4da
            goto L530
        L4da:
            float r7 = (float) r6
            r10 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r10
            float r7 = r7 * r4
            float r12 = (float) r5
            float r7 = r7 * r12
            float r13 = (float) r8
            float r13 = r13 * r10
            float r13 = r13 * r4
            float r13 = r13 * r12
            com.badlogic.gdx.graphics.Color r10 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef1
            r10.set(r12)
            com.badlogic.gdx.graphics.Color r12 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            r12.set(r11)
            r10.mul(r14)
            r12.mul(r14)
            r11 = 2
            if (r9 != r11) goto L516
            float r26 = r7 + r18
            float r27 = r13 + r19
            r25 = r54
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r10
            r32 = r12
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32)
            goto L530
        L516:
            float r26 = r7 + r18
            float r27 = r13 + r19
            if (r9 != 0) goto L51f
            r33 = 1
            goto L521
        L51f:
            r33 = 0
        L521:
            r25 = r54
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r10
            r32 = r12
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32, r33)
        L530:
            int r8 = r8 + 1
            r7 = 1
            r11 = -1
            goto L4d3
        L535:
            int r6 = r6 + 1
            r7 = 1
            r11 = -1
            goto L4d0
        L53a:
            int r5 = r5 + 1
            r11 = -1
            goto L4cc
        L53e:
            r5 = 2
            if (r9 != r5) goto L55a
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r25 = r54
            r26 = r18
            r27 = r19
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r4
            r32 = r5
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32)
            goto Lb94
        L55a:
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            if (r9 != 0) goto L563
            r33 = 1
            goto L565
        L563:
            r33 = 0
        L565:
            r25 = r54
            r26 = r18
            r27 = r19
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r4
            r32 = r5
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto Lb94
        L57a:
            r4 = 1054280254(0x3ed70a3e, float:0.42000002)
            if (r1 != r15) goto L7a4
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 > 0) goto L585
            return
        L585:
            float r3 = r3 * r5
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r2 = r2 * r5
            float r1 = r1 * r2
            float r2 = r0._angle
            float r2 = r2 - r17
            r5 = 1056964608(0x3f000000, float:0.5)
            float r13 = r3 * r5
            float r7 = r1 * r5
            float r5 = java.lang.Math.max(r13, r7)
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r5)
            int r8 = r5 / 2
            int r8 = java.lang.Math.max(r15, r8)
            boolean r9 = r53.getValUseGradient()
            if (r9 == 0) goto L5b2
            short r9 = r53.getValGradientMode()
            goto L5b3
        L5b2:
            r9 = 2
        L5b3:
            boolean r10 = r53.getValHalfArc()
            if (r10 == 0) goto L5ce
            boolean r10 = r53.getValTriangleUpsideDown()
            if (r10 == 0) goto L5c8
            float r11 = r18 - r13
            float r10 = r19 - r1
            r12 = 1127481344(0x43340000, float:180.0)
            float r12 = r2 - r12
            goto L5d1
        L5c8:
            float r11 = r6 - r13
            float r10 = r24 - r1
            r12 = r2
            goto L5d1
        L5ce:
            r10 = 0
            r11 = 0
            r12 = 0
        L5d1:
            float r17 = java.lang.Math.max(r3, r1)
            r18 = 1124073472(0x43000000, float:128.0)
            int r19 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r19 >= 0) goto L5df
            float r17 = r17 / r18
            float r4 = r4 * r17
        L5df:
            r14 = 1
        L5e0:
            if (r14 > r15) goto L6f0
            r56 = r8
            r8 = 1
            r15 = -1
        L5e6:
            if (r15 > r8) goto L6e3
            r55 = r12
            r12 = -1
        L5eb:
            if (r12 > r8) goto L6d6
            if (r15 != 0) goto L5fb
            if (r12 != 0) goto L5fb
            r17 = r4
            r36 = r12
            r19 = r14
            r18 = r15
            goto L6cb
        L5fb:
            float r8 = (float) r15
            r17 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r17
            float r8 = r8 * r4
            r18 = r15
            float r15 = (float) r14
            float r8 = r8 * r15
            r19 = r14
            float r14 = (float) r12
            float r14 = r14 * r17
            float r14 = r14 * r4
            float r14 = r14 * r15
            com.badlogic.gdx.graphics.Color r15 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            r17 = r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            r15.set(r4)
            com.badlogic.gdx.graphics.Color r4 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r36 = r12
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef2
            r4.set(r12)
            r12 = 1036831949(0x3dcccccd, float:0.1)
            r15.mul(r12)
            r4.mul(r12)
            boolean r12 = r53.getValHalfArc()
            if (r12 != 0) goto L696
            r12 = 2
            if (r9 != r12) goto L662
            float r8 = r8 + r6
            float r8 = r8 - r13
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r12 = r12 * r1
            r25 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r25
            float r26 = r8 - r12
            float r14 = r14 + r24
            float r14 = r14 - r7
            float r8 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r8 = r8 * r1
            float r8 = r8 * r25
            float r27 = r14 + r8
            r25 = r54
            r28 = r3
            r29 = r1
            r30 = r2
            r31 = r5
            r32 = r15
            r33 = r4
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L6cb
        L662:
            float r8 = r8 + r6
            float r8 = r8 - r13
            float r12 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r12 = r12 * r1
            r25 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r25
            float r26 = r8 - r12
            float r14 = r14 + r24
            float r14 = r14 - r7
            float r8 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r8 = r8 * r1
            float r8 = r8 * r25
            float r27 = r14 + r8
            if (r9 != 0) goto L682
            r34 = 1
            goto L684
        L682:
            r34 = 0
        L684:
            r25 = r54
            r28 = r3
            r29 = r1
            r30 = r2
            r31 = r5
            r32 = r15
            r33 = r4
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L6cb
        L696:
            r12 = 2
            if (r9 != r12) goto L6af
            float r26 = r8 + r11
            float r27 = r14 + r10
            float r29 = r1 * r16
            r25 = r54
            r28 = r3
            r30 = r55
            r31 = r56
            r32 = r15
            r33 = r4
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L6cb
        L6af:
            float r26 = r8 + r11
            float r27 = r14 + r10
            float r29 = r1 * r16
            if (r9 != 0) goto L6ba
            r34 = 1
            goto L6bc
        L6ba:
            r34 = 0
        L6bc:
            r25 = r54
            r28 = r3
            r30 = r55
            r31 = r56
            r32 = r15
            r33 = r4
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L6cb:
            int r12 = r36 + 1
            r4 = r17
            r15 = r18
            r14 = r19
            r8 = 1
            goto L5eb
        L6d6:
            r17 = r4
            r19 = r14
            r18 = r15
            int r15 = r18 + 1
            r12 = r55
            r8 = 1
            goto L5e6
        L6e3:
            r17 = r4
            r55 = r12
            r19 = r14
            int r14 = r19 + 1
            r8 = r56
            r15 = 5
            goto L5e0
        L6f0:
            r56 = r8
            r55 = r12
            boolean r4 = r53.getValHalfArc()
            if (r4 != 0) goto L764
            r4 = 2
            if (r9 != r4) goto L72d
            float r6 = r6 - r13
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r4 = r4 * r1
            r8 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r8
            float r26 = r6 - r4
            float r24 = r24 - r7
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r4 = r4 * r1
            float r4 = r4 * r8
            float r27 = r24 + r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r6 = r0._colorRef2
            r25 = r54
            r28 = r3
            r29 = r1
            r30 = r2
            r31 = r5
            r32 = r4
            r33 = r6
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto Lb94
        L72d:
            float r6 = r6 - r13
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r4 = r4 * r1
            r8 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r8
            float r26 = r6 - r4
            float r24 = r24 - r7
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r4 = r4 * r1
            float r4 = r4 * r8
            float r27 = r24 + r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r6 = r0._colorRef2
            if (r9 != 0) goto L74f
            r34 = 1
            goto L751
        L74f:
            r34 = 0
        L751:
            r25 = r54
            r28 = r3
            r29 = r1
            r30 = r2
            r31 = r5
            r32 = r4
            r33 = r6
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto Lb94
        L764:
            r2 = 2
            if (r9 != r2) goto L782
            float r29 = r1 * r16
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r25 = r54
            r26 = r11
            r27 = r10
            r28 = r3
            r30 = r55
            r31 = r56
            r32 = r1
            r33 = r2
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto Lb94
        L782:
            float r29 = r1 * r16
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            if (r9 != 0) goto L78d
            r34 = 1
            goto L78f
        L78d:
            r34 = 0
        L78f:
            r25 = r54
            r26 = r11
            r27 = r10
            r28 = r3
            r30 = r55
            r31 = r56
            r32 = r1
            r33 = r2
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto Lb94
        L7a4:
            r9 = 6
            if (r1 != r9) goto L95e
            float r1 = r53.getValTrapezoidThickness1()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            float r13 = r1 * r5
            float r1 = r53.getValTrapezoidThickness2()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r3
            float r12 = r1 * r5
            boolean r1 = r53.getValTrapezoidIsRounded1()
            boolean r3 = r53.getValTrapezoidIsRounded2()
            r7 = 0
            int r8 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r8 > 0) goto L7cd
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 > 0) goto L7cd
            return
        L7cd:
            float r2 = r2 * r5
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r7
            boolean r7 = r53.isUsingGradient()
            if (r7 == 0) goto L7e4
            short r7 = r53.getValGradientMode()
            r8 = 1
            if (r7 != r8) goto L7e1
            goto L7e4
        L7e1:
            r25 = 0
            goto L7e6
        L7e4:
            r25 = 1
        L7e6:
            int r7 = r0._curveRadius
            float r7 = (float) r7
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r8
            float r15 = r7 * r5
            float r5 = java.lang.Math.max(r13, r12)
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForTrapezoidCurve(r2, r15, r5)
            r7 = 1
            if (r5 <= r7) goto L7fc
            r22 = 1
        L7fc:
            float r7 = java.lang.Math.max(r13, r12)
            float r7 = java.lang.Math.max(r2, r7)
            int r8 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r8 >= 0) goto L80b
            float r7 = r7 / r10
            float r4 = r4 * r7
        L80b:
            r7 = 1
        L80c:
            r8 = 5
            if (r7 > r8) goto L8e5
            r8 = -1
        L810:
            r9 = 1
            if (r8 > r9) goto L8dd
            r10 = -1
        L814:
            if (r10 > r9) goto L8d5
            if (r8 != 0) goto L820
            if (r10 != 0) goto L820
            r55 = r4
            r16 = r7
            goto L8cc
        L820:
            float r9 = (float) r8
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r11
            float r9 = r9 * r4
            float r14 = (float) r7
            float r9 = r9 * r14
            r16 = r7
            float r7 = (float) r10
            float r7 = r7 * r11
            float r7 = r7 * r4
            float r7 = r7 * r14
            com.badlogic.gdx.graphics.Color r11 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef1
            r11.set(r14)
            com.badlogic.gdx.graphics.Color r14 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            r55 = r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r14.set(r4)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r11.mul(r4)
            r14.mul(r4)
            if (r22 == 0) goto L87c
            boolean r37 = r53.getValSegmentCurveCirculization()
            float r38 = r9 + r6
            float r39 = r7 + r24
            float r4 = r0._angle
            r43 = r4
            float r4 = r0._cosAngle
            r45 = r4
            float r4 = r0._sinAngle
            r46 = r4
            r36 = r54
            r40 = r12
            r41 = r13
            r42 = r2
            r44 = r15
            r47 = r5
            r48 = r25
            r49 = r3
            r50 = r1
            r51 = r11
            r52 = r14
            r36.myTrapezoidCurved(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            goto L8cc
        L87c:
            if (r1 != 0) goto L8a3
            if (r3 == 0) goto L881
            goto L8a3
        L881:
            float r37 = r9 + r18
            float r38 = r7 + r19
            float r39 = r9 + r6
            float r40 = r7 + r24
            float r4 = r0._cosAngle
            float r7 = r0._sinAngle
            r36 = r54
            r41 = r12
            r42 = r13
            r43 = r2
            r44 = r4
            r45 = r7
            r46 = r25
            r47 = r11
            r48 = r14
            r36.myTrapezoid(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L8cc
        L8a3:
            float r37 = r9 + r18
            float r38 = r7 + r19
            float r39 = r9 + r6
            float r40 = r7 + r24
            float r4 = r0._angle
            float r7 = r0._cosAngle
            float r9 = r0._sinAngle
            r36 = r54
            r41 = r12
            r42 = r13
            r43 = r2
            r44 = r4
            r45 = r7
            r46 = r9
            r47 = r25
            r48 = r3
            r49 = r1
            r50 = r11
            r51 = r14
            r36.myRoundedTrapezoid(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
        L8cc:
            int r10 = r10 + 1
            r4 = r55
            r7 = r16
            r9 = 1
            goto L814
        L8d5:
            r55 = r4
            r16 = r7
            int r8 = r8 + 1
            goto L810
        L8dd:
            r55 = r4
            r16 = r7
            int r7 = r16 + 1
            goto L80c
        L8e5:
            if (r22 == 0) goto L912
            boolean r8 = r53.getValSegmentCurveCirculization()
            float r14 = r0._angle
            float r4 = r0._cosAngle
            r16 = r4
            float r4 = r0._sinAngle
            r17 = r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            r22 = r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r23 = r4
            r7 = r54
            r9 = r6
            r10 = r24
            r11 = r12
            r12 = r13
            r13 = r2
            r18 = r5
            r19 = r25
            r20 = r3
            r21 = r1
            r7.myTrapezoidCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto Lb94
        L912:
            if (r1 != 0) goto L936
            if (r3 == 0) goto L917
            goto L936
        L917:
            float r15 = r0._cosAngle
            float r1 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r7 = r54
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r14 = r2
            r16 = r1
            r17 = r25
            r18 = r3
            r19 = r4
            r7.myTrapezoid(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto Lb94
        L936:
            float r15 = r0._angle
            float r4 = r0._cosAngle
            float r5 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef2
            r7 = r54
            r8 = r18
            r9 = r19
            r10 = r6
            r6 = r11
            r11 = r24
            r21 = r14
            r14 = r2
            r16 = r4
            r17 = r5
            r18 = r25
            r19 = r3
            r20 = r1
            r22 = r6
            r7.myRoundedTrapezoid(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto Lb94
        L95e:
            r4 = 3
            if (r1 != r4) goto Lb1b
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L967
            return
        L967:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r3 = r3 * r5
            r1 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r1
            boolean r1 = r53.getValTriangleUpsideDown()
            if (r1 == 0) goto L97f
            r12 = r6
            r6 = r18
            r13 = r24
            r24 = r19
            goto L983
        L97f:
            r12 = r18
            r13 = r19
        L983:
            r1 = 1049582633(0x3e8f5c29, float:0.28)
            r2 = 1094713344(0x41400000, float:12.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L990
            float r2 = r3 / r2
            float r1 = r1 * r2
        L990:
            r15 = 1
        L991:
            r2 = 5
            if (r15 > r2) goto La7d
            r4 = -1
        L995:
            r5 = 1
            if (r4 > r5) goto La79
            r7 = -1
        L999:
            if (r7 > r5) goto La74
            if (r4 != 0) goto L9a1
            if (r7 != 0) goto L9a1
            goto La6e
        L9a1:
            float r8 = (float) r4
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            float r8 = r8 * r1
            float r10 = (float) r15
            float r8 = r8 * r10
            float r11 = (float) r7
            float r11 = r11 * r9
            float r11 = r11 * r1
            float r11 = r11 * r10
            com.badlogic.gdx.graphics.Color r9 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r10 = r0._colorRef1
            r9.set(r10)
            com.badlogic.gdx.graphics.Color r10 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef2
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef2
            r10.set(r14)
            r14 = 1036831949(0x3dcccccd, float:0.1)
            r9.mul(r14)
            r10.mul(r14)
            short r2 = r0._rightTriangleDirection
            if (r2 != 0) goto La0f
            float r2 = r8 + r6
            float r5 = r0._angle
            float r5 = r5 - r17
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = r5 * r3
            float r26 = r2 + r5
            float r5 = r11 + r24
            float r14 = r0._angle
            float r14 = r14 - r17
            float r14 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r14 = r14 * r3
            float r27 = r5 + r14
            float r14 = r0._angle
            float r14 = r14 + r17
            float r14 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r14 = r14 * r3
            float r28 = r2 + r14
            float r2 = r0._angle
            float r2 = r2 + r17
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r2 = r2 * r3
            float r29 = r5 + r2
            float r30 = r8 + r12
            float r31 = r11 + r13
            r25 = r54
            r32 = r10
            r33 = r9
            r25.triangle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto La6e
        La0f:
            float r2 = r8 + r6
            float r5 = r0._angle
            float r5 = r5 - r17
            float r5 = org.fortheloss.framework.CustomMathUtils.cosDeg(r5)
            float r5 = r5 * r3
            float r26 = r2 + r5
            float r5 = r11 + r24
            float r14 = r0._angle
            float r14 = r14 - r17
            float r14 = org.fortheloss.framework.CustomMathUtils.sinDeg(r14)
            float r14 = r14 * r3
            float r27 = r5 + r14
            float r14 = r0._angle
            float r14 = r14 + r17
            float r14 = org.fortheloss.framework.CustomMathUtils.cosDeg(r14)
            float r14 = r14 * r3
            float r28 = r2 + r14
            float r2 = r0._angle
            float r2 = r2 + r17
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r2 = r2 * r3
            float r29 = r5 + r2
            float r8 = r8 + r12
            float r2 = r0._angle
            short r5 = r0._rightTriangleDirection
            int r5 = r5 * 90
            float r5 = (float) r5
            float r2 = r2 - r5
            float r2 = org.fortheloss.framework.CustomMathUtils.cosDeg(r2)
            float r2 = r2 * r3
            float r30 = r8 + r2
            float r11 = r11 + r13
            float r2 = r0._angle
            short r5 = r0._rightTriangleDirection
            int r5 = r5 * 90
            float r5 = (float) r5
            float r2 = r2 - r5
            float r2 = org.fortheloss.framework.CustomMathUtils.sinDeg(r2)
            float r2 = r2 * r3
            float r31 = r11 + r2
            r25 = r54
            r32 = r10
            r33 = r9
            r25.triangle(r26, r27, r28, r29, r30, r31, r32, r33)
        La6e:
            int r7 = r7 + 1
            r2 = 5
            r5 = 1
            goto L999
        La74:
            int r4 = r4 + 1
            r2 = 5
            goto L995
        La79:
            int r15 = r15 + 1
            goto L991
        La7d:
            short r1 = r0._rightTriangleDirection
            if (r1 != 0) goto Labc
            float r1 = r0._angle
            float r1 = r1 - r17
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r3
            float r8 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 - r17
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r9 = r24 + r1
            float r1 = r0._angle
            float r1 = r1 + r17
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r3
            float r10 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 + r17
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r11 = r24 + r1
            com.badlogic.gdx.graphics.Color r14 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r15 = r0._colorRef1
            r7 = r54
            r7.triangle(r8, r9, r10, r11, r12, r13, r14, r15)
            goto Lb94
        Labc:
            float r1 = r0._angle
            float r1 = r1 - r17
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r3
            float r26 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 - r17
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r27 = r24 + r1
            float r1 = r0._angle
            float r1 = r1 + r17
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r3
            float r28 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 + r17
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r29 = r24 + r1
            float r1 = r0._angle
            short r2 = r0._rightTriangleDirection
            int r2 = r2 * 90
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r3
            float r30 = r12 + r1
            float r1 = r0._angle
            short r2 = r0._rightTriangleDirection
            int r2 = r2 * 90
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r3
            float r31 = r13 + r1
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            r25 = r54
            r32 = r1
            r33 = r2
            r25.triangle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto Lb94
        Lb1b:
            r1 = 0
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r3 * r4
            float r9 = r9 * r5
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            float r2 = r2 + r3
            float r2 = r2 * r5
            float r2 = r2 * r4
            float r14 = r2 * r10
            float r2 = r0._cosAngle
            float r3 = r2 * r9
            float r6 = r6 - r3
            float r2 = r2 * r14
            float r12 = r6 + r2
            float r2 = r0._sinAngle
            float r9 = r9 * r2
            float r24 = r24 - r9
            float r2 = r2 * r14
            float r13 = r24 + r2
            r2 = 1107296256(0x42000000, float:32.0)
            int r3 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lb49
            float r9 = r14 / r2
            goto Lb4b
        Lb49:
            r9 = 1065353216(0x3f800000, float:1.0)
        Lb4b:
            r2 = 1047457519(0x3e6eeeef, float:0.23333333)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef2
            r3.set(r4)
            r3.mul(r8)
            float r9 = r9 * r7
            int r3 = (int) r9
            r4 = 2
            int r3 = java.lang.Math.max(r4, r3)
            r1 = 0
            r11 = 0
        Lb62:
            if (r1 > r3) goto Lb7f
            float r11 = r11 + r2
            float r28 = r14 + r11
            short r29 = r53.getValNumPolygonVertices()
            float r4 = r0._angle
            com.badlogic.gdx.graphics.Color r32 = org.fortheloss.sticknodes.stickfigure.StickNode._staticColorRef1
            r25 = r54
            r26 = r12
            r27 = r13
            r30 = r4
            r31 = r32
            r25.polygon(r26, r27, r28, r29, r30, r31, r32)
            int r1 = r1 + 1
            goto Lb62
        Lb7f:
            short r15 = r53.getValNumPolygonVertices()
            float r1 = r0._angle
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r11 = r54
            r16 = r1
            r17 = r2
            r18 = r3
            r11.polygon(r12, r13, r14, r15, r16, r17, r18)
        Lb94:
            return
    }

    public void drawLimbCulled(org.fortheloss.sticknodes.SNShapeRenderer r58, float r59, float r60, float r61, boolean r62) {
            r57 = this;
            r0 = r57
            boolean r1 = r57.isPolyfillAnchor()
            if (r1 == 0) goto Lb
            r57.drawPolyfill(r58, r59, r60, r61)
        Lb:
            int r1 = r57.getValLimbType()
            int r2 = r57.getValThickness()
            float r2 = (float) r2
            float r3 = r57.getValLength()
            r4 = -1
            if (r1 == r4) goto L98a
            boolean r5 = r57.getValUseSegmentScale()
            if (r5 == 0) goto L2e
            float r5 = r57.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r0._stickfigureRef
            float r6 = r6.getScale()
            float r5 = r5 * r6
            goto L34
        L2e:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0._stickfigureRef
            float r5 = r5.getScale()
        L34:
            float r5 = r5 * r61
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r0._parentNodeRef
            float r6 = r6.getX()
            float r6 = r6 * r61
            float r6 = r59 + r6
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r0._parentNodeRef
            float r7 = r7.getY()
            float r7 = r7 * r61
            float r24 = r60 + r7
            float r7 = r0._localX
            float r7 = r7 * r5
            float r18 = r6 + r7
            float r7 = r0._localY
            float r7 = r7 * r5
            float r19 = r24 + r7
            float r7 = org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X
            float r8 = r18 - r7
            float r9 = org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y
            float r10 = r19 - r9
            float r8 = r8 * r8
            float r10 = r10 * r10
            float r8 = r8 + r10
            float r10 = org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L77
            float r7 = r6 - r7
            float r8 = r24 - r9
            float r7 = r7 * r7
            float r8 = r8 * r8
            float r7 = r7 + r8
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L77
            return
        L77:
            r7 = 0
            r22 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r15 = 1
            if (r1 != r15) goto L16d
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L84
            return
        L84:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r2 = r2 * r5
            float r3 = r3 * r5
            float r12 = r3 * r1
            int r3 = r0._curveRadius
            float r3 = (float) r3
            float r3 = r3 * r1
            float r14 = r3 * r5
            int r1 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r12, r14)
            if (r1 <= r15) goto L9d
            r3 = 1
            goto L9e
        L9d:
            r3 = 0
        L9e:
            if (r3 == 0) goto L114
            if (r62 == 0) goto Le2
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r8
            float r4 = r0._cosAngle
            float r4 = r4 * r3
            float r5 = r0._sinAngle
            float r5 = r5 * r3
            float r28 = r6 - r4
            float r29 = r24 - r5
            float r3 = r3 * r8
            float r30 = r12 + r3
            r26 = 0
            boolean r27 = r57.getValSegmentCurveCirculization()
            float r31 = r2 + r3
            float r3 = r0._angle
            float r4 = r0._cosAngle
            float r5 = r0._sinAngle
            short r7 = r57.getValGradientMode()
            if (r7 != r15) goto Lcd
            r37 = 1
            goto Lcf
        Lcd:
            r37 = 0
        Lcf:
            com.badlogic.gdx.graphics.Color r39 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r32 = r14
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r1
            r38 = r39
            r25.mySegmentCurved(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        Le2:
            r8 = 0
            boolean r9 = r57.getValSegmentCurveCirculization()
            float r3 = r0._angle
            float r4 = r0._cosAngle
            float r5 = r0._sinAngle
            short r7 = r57.getValGradientMode()
            if (r7 != r15) goto Lf6
            r19 = 1
            goto Lf8
        Lf6:
            r19 = 0
        Lf8:
            com.badlogic.gdx.graphics.Color r15 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r13 = r0._colorRef2
            r7 = r58
            r10 = r6
            r11 = r24
            r6 = r13
            r13 = r2
            r2 = r15
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r1
            r20 = r2
            r21 = r6
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L98a
        L114:
            if (r62 == 0) goto L14a
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r3 = r0._cosAngle
            float r4 = r3 * r1
            float r26 = r18 + r4
            float r4 = r0._sinAngle
            float r5 = r4 * r1
            float r27 = r19 + r5
            float r5 = r3 * r1
            float r28 = r6 - r5
            float r5 = r4 * r1
            float r29 = r24 - r5
            float r1 = r1 * r8
            float r30 = r2 + r1
            short r1 = r57.getValGradientMode()
            if (r1 != r15) goto L13b
            r33 = 1
            goto L13d
        L13b:
            r33 = 0
        L13d:
            com.badlogic.gdx.graphics.Color r35 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r31 = r3
            r32 = r4
            r34 = r35
            r25.mySegment(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L14a:
            float r13 = r0._cosAngle
            float r14 = r0._sinAngle
            short r1 = r57.getValGradientMode()
            if (r1 != r15) goto L155
            goto L156
        L155:
            r15 = 0
        L156:
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r7 = r58
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r12 = r2
            r16 = r1
            r17 = r3
            r7.mySegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L98a
        L16d:
            if (r1 != 0) goto L24c
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L174
            return
        L174:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r2 = r2 * r5
            float r3 = r3 * r5
            float r3 = r3 * r1
            int r4 = r0._curveRadius
            float r4 = (float) r4
            float r4 = r4 * r1
            float r1 = r4 * r5
            int r4 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCurve(r3, r1)
            if (r4 <= r15) goto L18d
            r5 = 1
            goto L18e
        L18d:
            r5 = 0
        L18e:
            if (r5 == 0) goto L1fc
            if (r62 == 0) goto L1c7
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r8
            r9 = 1
            boolean r10 = r57.getValSegmentCurveCirculization()
            float r5 = r5 * r8
            float r13 = r2 + r5
            float r5 = r0._angle
            float r14 = r0._cosAngle
            float r12 = r0._sinAngle
            short r7 = r57.getValGradientMode()
            if (r7 != r15) goto L1ae
            r19 = 1
            goto L1b0
        L1ae:
            r19 = 0
        L1b0:
            com.badlogic.gdx.graphics.Color r21 = com.badlogic.gdx.graphics.Color.RED
            r7 = r58
            r8 = r9
            r9 = r10
            r10 = r6
            r11 = r24
            r17 = r12
            r12 = r3
            r16 = r14
            r14 = r1
            r15 = r5
            r18 = r4
            r20 = r21
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L1c7:
            r8 = 1
            boolean r9 = r57.getValSegmentCurveCirculization()
            float r15 = r0._angle
            float r5 = r0._cosAngle
            float r14 = r0._sinAngle
            short r7 = r57.getValGradientMode()
            r13 = 1
            if (r7 != r13) goto L1dc
            r19 = 1
            goto L1de
        L1dc:
            r19 = 0
        L1de:
            com.badlogic.gdx.graphics.Color r13 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r12 = r0._colorRef2
            r7 = r58
            r10 = r6
            r11 = r24
            r6 = r12
            r12 = r3
            r3 = r13
            r13 = r2
            r2 = r14
            r14 = r1
            r16 = r5
            r17 = r2
            r18 = r4
            r20 = r3
            r21 = r6
            r7.mySegmentCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L98a
        L1fc:
            r13 = 1
            if (r62 == 0) goto L227
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r1 = r1 * r8
            float r12 = r2 + r1
            float r1 = r0._cosAngle
            float r14 = r0._sinAngle
            short r3 = r57.getValGradientMode()
            if (r3 != r13) goto L213
            r15 = 1
            goto L214
        L213:
            r15 = 0
        L214:
            com.badlogic.gdx.graphics.Color r17 = com.badlogic.gdx.graphics.Color.RED
            r7 = r58
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r3 = 1
            r13 = r1
            r16 = r17
            r7.myRoundedSegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L228
        L227:
            r3 = 1
        L228:
            float r13 = r0._cosAngle
            float r14 = r0._sinAngle
            short r1 = r57.getValGradientMode()
            if (r1 != r3) goto L234
            r15 = 1
            goto L235
        L234:
            r15 = 0
        L235:
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r7 = r58
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r12 = r2
            r16 = r1
            r17 = r3
            r7.myRoundedSegment(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L98a
        L24c:
            r9 = 1
            r10 = 2
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1119092736(0x42b40000, float:90.0)
            if (r1 != r10) goto L492
            float r1 = r2 * r5
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r7
            float r1 = r1 * r11
            float r13 = r3 + r2
            float r13 = r13 * r5
            float r13 = r13 * r7
            float r7 = r13 * r11
            boolean r13 = r57.getValUseCircleOutline()
            boolean r14 = r57.getValCircleIsHollow()
            boolean r15 = r57.getValUseGradient()
            if (r15 == 0) goto L277
            short r15 = r57.getValGradientMode()
            goto L278
        L277:
            r15 = 2
        L278:
            boolean r16 = r57.getValHalfArc()
            if (r16 != 0) goto L3ef
            int r4 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r7)
            if (r14 == 0) goto L2e2
            if (r13 != 0) goto L287
            goto L2e2
        L287:
            if (r62 == 0) goto L2bd
            r6 = 1090519040(0x41000000, float:8.0)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r12
            float r6 = r6 / r5
            float r6 = r6 + r2
            float r16 = r6 * r5
            float r16 = r16 * r12
            float r16 = r16 * r11
            float r6 = r6 + r3
            float r6 = r6 * r5
            float r6 = r6 * r12
            float r29 = r6 * r11
            float r6 = r0._cosAngle
            float r12 = r6 * r16
            float r12 = r18 + r12
            float r6 = r6 * r29
            float r26 = r12 - r6
            float r6 = r0._sinAngle
            float r12 = r6 * r16
            float r12 = r19 + r12
            float r6 = r6 * r29
            float r27 = r12 - r6
            float r28 = r16 * r8
            com.badlogic.gdx.graphics.Color r31 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r30 = r4
            r25.circleOutline(r26, r27, r28, r29, r30, r31)
        L2bd:
            float r6 = r0._cosAngle
            float r12 = r6 * r1
            float r12 = r18 + r12
            float r6 = r6 * r7
            float r26 = r12 - r6
            float r6 = r0._sinAngle
            float r12 = r6 * r1
            float r12 = r19 + r12
            float r6 = r6 * r7
            float r27 = r12 - r6
            float r28 = r1 * r8
            com.badlogic.gdx.graphics.Color r31 = r57.getValColorCircleOutline()
            r25 = r58
            r29 = r7
            r30 = r4
            r25.circleOutline(r26, r27, r28, r29, r30, r31)
            goto L387
        L2e2:
            if (r62 == 0) goto L309
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r8
            float r8 = r0._cosAngle
            float r12 = r8 * r1
            float r12 = r18 + r12
            float r8 = r8 * r7
            float r26 = r12 - r8
            float r8 = r0._sinAngle
            float r12 = r8 * r1
            float r12 = r19 + r12
            float r8 = r8 * r7
            float r27 = r12 - r8
            float r28 = r7 + r6
            com.badlogic.gdx.graphics.Color r31 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r29 = r4
            r30 = r31
            r25.circle(r26, r27, r28, r29, r30, r31)
        L309:
            if (r13 != 0) goto L364
            if (r15 != r10) goto L333
            float r6 = r0._cosAngle
            float r8 = r6 * r1
            float r8 = r18 + r8
            float r6 = r6 * r7
            float r26 = r8 - r6
            float r6 = r0._sinAngle
            float r8 = r6 * r1
            float r8 = r19 + r8
            float r6 = r6 * r7
            float r27 = r8 - r6
            com.badlogic.gdx.graphics.Color r6 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r8 = r0._colorRef2
            r25 = r58
            r28 = r7
            r29 = r4
            r30 = r6
            r31 = r8
            r25.circle(r26, r27, r28, r29, r30, r31)
            goto L387
        L333:
            float r6 = r0._cosAngle
            float r8 = r6 * r1
            float r8 = r18 + r8
            float r6 = r6 * r7
            float r26 = r8 - r6
            float r6 = r0._sinAngle
            float r8 = r6 * r1
            float r8 = r19 + r8
            float r6 = r6 * r7
            float r27 = r8 - r6
            com.badlogic.gdx.graphics.Color r6 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r8 = r0._colorRef2
            float r12 = r0._angle
            if (r15 != 0) goto L352
            r33 = 1
            goto L354
        L352:
            r33 = 0
        L354:
            r25 = r58
            r28 = r7
            r29 = r4
            r30 = r6
            r31 = r8
            r32 = r12
            r25.circle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L387
        L364:
            com.badlogic.gdx.graphics.Color r31 = r57.getValColorCircleOutline()
            float r6 = r0._cosAngle
            float r8 = r6 * r1
            float r8 = r18 + r8
            float r6 = r6 * r7
            float r26 = r8 - r6
            float r6 = r0._sinAngle
            float r8 = r6 * r1
            float r8 = r19 + r8
            float r6 = r6 * r7
            float r27 = r8 - r6
            r25 = r58
            r28 = r7
            r29 = r4
            r30 = r31
            r25.circle(r26, r27, r28, r29, r30, r31)
        L387:
            if (r14 != 0) goto L98a
            if (r13 == 0) goto L98a
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 >= 0) goto L98a
            float r3 = r3 - r2
            float r3 = r3 * r5
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            float r28 = r3 * r11
            if (r15 != r10) goto L3bf
            float r2 = r0._cosAngle
            float r3 = r2 * r1
            float r18 = r18 - r3
            float r2 = r2 * r28
            float r26 = r18 - r2
            float r2 = r0._sinAngle
            float r1 = r1 * r2
            float r19 = r19 - r1
            float r2 = r2 * r28
            float r27 = r19 - r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            r25 = r58
            r29 = r4
            r30 = r1
            r31 = r2
            r25.circle(r26, r27, r28, r29, r30, r31)
            goto L98a
        L3bf:
            float r2 = r0._cosAngle
            float r3 = r2 * r1
            float r18 = r18 - r3
            float r2 = r2 * r28
            float r26 = r18 - r2
            float r2 = r0._sinAngle
            float r1 = r1 * r2
            float r19 = r19 - r1
            float r2 = r2 * r28
            float r27 = r19 - r2
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            float r3 = r0._angle
            if (r15 != 0) goto L3de
            r33 = 1
            goto L3e0
        L3de:
            r33 = 0
        L3e0:
            r25 = r58
            r29 = r4
            r30 = r1
            r31 = r2
            r32 = r3
            r25.circle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L98a
        L3ef:
            r2 = 1084227584(0x40a00000, float:5.0)
            int r3 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r7)
            float r3 = (float) r3
            float r3 = r3 * r11
            float r2 = java.lang.Math.max(r2, r3)
            int r2 = (int) r2
            float r3 = r7 * r8
            boolean r5 = r57.getValTriangleUpsideDown()
            if (r5 == 0) goto L415
            float r5 = r0._cosAngle
            float r5 = r5 * r1
            float r18 = r18 + r5
            float r5 = r0._sinAngle
            float r5 = r5 * r1
            float r19 = r19 + r5
            float r1 = r0._angle
            float r1 = r1 + r12
            goto L427
        L415:
            float r5 = r0._cosAngle
            float r5 = r5 * r1
            float r6 = r6 - r5
            float r5 = r0._sinAngle
            float r5 = r5 * r1
            float r24 = r24 - r5
            float r1 = r0._angle
            float r1 = r1 - r12
            r18 = r6
            r19 = r24
        L427:
            if (r62 == 0) goto L457
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r8
            r6 = -1
        L42e:
            if (r6 > r9) goto L457
            r7 = -1
        L431:
            if (r7 > r9) goto L454
            if (r6 != 0) goto L438
            if (r7 != 0) goto L438
            goto L451
        L438:
            float r8 = (float) r6
            float r8 = r8 * r5
            float r11 = (float) r7
            float r11 = r11 * r5
            float r26 = r8 + r18
            float r27 = r11 + r19
            com.badlogic.gdx.graphics.Color r32 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r32
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32)
        L451:
            int r7 = r7 + 1
            goto L431
        L454:
            int r6 = r6 + 1
            goto L42e
        L457:
            if (r15 != r10) goto L472
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r25 = r58
            r26 = r18
            r27 = r19
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r4
            r32 = r5
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32)
            goto L98a
        L472:
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            if (r15 != 0) goto L47b
            r33 = 1
            goto L47d
        L47b:
            r33 = 0
        L47d:
            r25 = r58
            r26 = r18
            r27 = r19
            r28 = r3
            r29 = r2
            r30 = r1
            r31 = r4
            r32 = r5
            r25.halfCircle(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L98a
        L492:
            r13 = 5
            if (r1 != r13) goto L600
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L49a
            return
        L49a:
            float r2 = r2 * r5
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r3 = r3 * r5
            float r1 = r1 * r3
            float r3 = r0._angle
            float r3 = r3 - r12
            float r5 = r2 * r11
            float r12 = r1 * r11
            float r14 = java.lang.Math.max(r5, r12)
            int r14 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForCircle(r14)
            int r15 = r14 / 2
            int r13 = java.lang.Math.max(r13, r15)
            boolean r15 = r57.getValUseGradient()
            if (r15 == 0) goto L4c4
            short r15 = r57.getValGradientMode()
            goto L4c5
        L4c4:
            r15 = 2
        L4c5:
            boolean r16 = r57.getValHalfArc()
            if (r16 == 0) goto L4e1
            boolean r7 = r57.getValTriangleUpsideDown()
            if (r7 == 0) goto L4da
            float r7 = r18 - r5
            float r16 = r19 - r1
            r17 = 1127481344(0x43340000, float:180.0)
            float r17 = r3 - r17
            goto L4e5
        L4da:
            float r7 = r6 - r5
            float r16 = r24 - r1
            r17 = r3
            goto L4e5
        L4e1:
            r16 = 0
            r17 = 0
        L4e5:
            if (r62 == 0) goto L550
            float r18 = org.fortheloss.sticknodes.App.assetScaling
            float r18 = r18 * r8
        L4eb:
            if (r4 > r9) goto L550
            r10 = -1
        L4ee:
            if (r10 > r9) goto L549
            if (r4 != 0) goto L4f5
            if (r10 != 0) goto L4f5
            goto L543
        L4f5:
            float r9 = (float) r4
            float r9 = r9 * r18
            float r8 = (float) r10
            float r8 = r8 * r18
            boolean r19 = r57.getValHalfArc()
            if (r19 != 0) goto L52c
            float r9 = r9 + r6
            float r9 = r9 - r5
            float r19 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r19 = r19 * r1
            float r19 = r19 * r11
            float r26 = r9 - r19
            float r8 = r8 + r24
            float r8 = r8 - r12
            float r9 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r9 = r9 * r1
            float r9 = r9 * r11
            float r27 = r8 + r9
            com.badlogic.gdx.graphics.Color r33 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r28 = r2
            r29 = r1
            r30 = r3
            r31 = r14
            r32 = r33
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L543
        L52c:
            float r26 = r9 + r7
            float r27 = r8 + r16
            r8 = 1073741824(0x40000000, float:2.0)
            float r29 = r1 * r8
            com.badlogic.gdx.graphics.Color r33 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r28 = r2
            r30 = r17
            r31 = r13
            r32 = r33
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33)
        L543:
            int r10 = r10 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            goto L4ee
        L549:
            int r4 = r4 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 2
            goto L4eb
        L550:
            boolean r4 = r57.getValHalfArc()
            if (r4 != 0) goto L5bc
            r4 = 2
            if (r15 != r4) goto L587
            float r6 = r6 - r5
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r4 = r4 * r1
            float r4 = r4 * r11
            float r26 = r6 - r4
            float r24 = r24 - r12
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r4 = r4 * r1
            float r4 = r4 * r11
            float r27 = r24 + r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r25 = r58
            r28 = r2
            r29 = r1
            r30 = r3
            r31 = r14
            r32 = r4
            r33 = r5
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L98a
        L587:
            float r6 = r6 - r5
            float r4 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r4 = r4 * r1
            float r4 = r4 * r11
            float r26 = r6 - r4
            float r24 = r24 - r12
            float r4 = org.fortheloss.framework.CustomMathUtils.cosDeg(r3)
            float r4 = r4 * r1
            float r4 = r4 * r11
            float r27 = r24 + r4
            com.badlogic.gdx.graphics.Color r4 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            if (r15 != 0) goto L5a7
            r34 = 1
            goto L5a9
        L5a7:
            r34 = 0
        L5a9:
            r25 = r58
            r28 = r2
            r29 = r1
            r30 = r3
            r31 = r14
            r32 = r4
            r33 = r5
            r25.ellipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L98a
        L5bc:
            r3 = 2
            if (r15 != r3) goto L5dc
            r3 = 1073741824(0x40000000, float:2.0)
            float r29 = r1 * r3
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            r25 = r58
            r26 = r7
            r27 = r16
            r28 = r2
            r30 = r17
            r31 = r13
            r32 = r1
            r33 = r3
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L98a
        L5dc:
            r3 = 1073741824(0x40000000, float:2.0)
            float r29 = r1 * r3
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef2
            if (r15 != 0) goto L5e9
            r34 = 1
            goto L5eb
        L5e9:
            r34 = 0
        L5eb:
            r25 = r58
            r26 = r7
            r27 = r16
            r28 = r2
            r30 = r17
            r31 = r13
            r32 = r1
            r33 = r3
            r25.halfEllipse(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L98a
        L600:
            r4 = 6
            if (r1 != r4) goto L7a2
            float r1 = r57.getValTrapezoidThickness1()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r13 = r1 * r5
            float r1 = r57.getValTrapezoidThickness2()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r12 = r1 * r5
            boolean r1 = r57.getValTrapezoidIsRounded1()
            boolean r2 = r57.getValTrapezoidIsRounded2()
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 > 0) goto L628
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L628
            return
        L628:
            float r3 = r3 * r5
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            boolean r4 = r57.isUsingGradient()
            if (r4 == 0) goto L63e
            short r4 = r57.getValGradientMode()
            r7 = 1
            if (r4 != r7) goto L63c
            goto L63e
        L63c:
            r4 = 0
            goto L63f
        L63e:
            r4 = 1
        L63f:
            int r7 = r0._curveRadius
            float r7 = (float) r7
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r8
            float r15 = r7 * r5
            float r5 = java.lang.Math.max(r13, r12)
            int r5 = org.fortheloss.sticknodes.SNShapeRenderer.getSegmentsForTrapezoidCurve(r3, r15, r5)
            r7 = 1
            if (r5 <= r7) goto L655
            r22 = 1
        L655:
            if (r22 == 0) goto L6d8
            if (r62 == 0) goto L6ad
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r9 = r0._cosAngle
            float r9 = r9 * r7
            float r10 = r0._sinAngle
            float r10 = r10 * r7
            float r9 = r6 - r9
            float r10 = r24 - r10
            float r8 = r8 * r7
            float r11 = r3 + r8
            if (r1 == 0) goto L680
            float r7 = r7 + r3
            if (r2 == 0) goto L679
            r46 = r3
            r42 = r6
            goto L67d
        L679:
            r42 = r6
            r46 = r7
        L67d:
            r43 = r24
            goto L686
        L680:
            r42 = r9
            r43 = r10
            r46 = r11
        L686:
            boolean r41 = r57.getValSegmentCurveCirculization()
            float r44 = r12 + r8
            float r45 = r13 + r8
            float r7 = r0._angle
            r47 = r7
            float r7 = r0._cosAngle
            r49 = r7
            float r7 = r0._sinAngle
            r50 = r7
            com.badlogic.gdx.graphics.Color r55 = com.badlogic.gdx.graphics.Color.RED
            r56 = r55
            r40 = r58
            r48 = r15
            r51 = r5
            r52 = r4
            r53 = r2
            r54 = r1
            r40.myTrapezoidCurved(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L6ad:
            boolean r8 = r57.getValSegmentCurveCirculization()
            float r14 = r0._angle
            float r7 = r0._cosAngle
            r16 = r7
            float r7 = r0._sinAngle
            r17 = r7
            com.badlogic.gdx.graphics.Color r7 = r0._colorRef1
            r22 = r7
            com.badlogic.gdx.graphics.Color r7 = r0._colorRef2
            r23 = r7
            r7 = r58
            r9 = r6
            r10 = r24
            r11 = r12
            r12 = r13
            r13 = r3
            r18 = r5
            r19 = r4
            r20 = r2
            r21 = r1
            r7.myTrapezoidCurved(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L98a
        L6d8:
            if (r1 != 0) goto L72b
            if (r2 == 0) goto L6dd
            goto L72b
        L6dd:
            if (r62 == 0) goto L70c
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r5 = r0._cosAngle
            float r7 = r1 * r5
            float r8 = r0._sinAngle
            float r9 = r1 * r8
            float r26 = r18 + r7
            float r27 = r19 + r9
            float r28 = r6 - r7
            float r29 = r24 - r9
            float r1 = r1 * r2
            float r30 = r12 + r1
            float r31 = r13 + r1
            float r32 = r3 + r1
            com.badlogic.gdx.graphics.Color r37 = com.badlogic.gdx.graphics.Color.RED
            r25 = r58
            r33 = r5
            r34 = r8
            r35 = r4
            r36 = r37
            r25.myTrapezoid(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L70c:
            float r15 = r0._cosAngle
            float r1 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r7 = r58
            r8 = r18
            r9 = r19
            r10 = r6
            r11 = r24
            r14 = r3
            r16 = r1
            r17 = r4
            r18 = r2
            r19 = r5
            r7.myTrapezoid(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L98a
        L72b:
            if (r62 == 0) goto L77a
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r7
            float r7 = r0._cosAngle
            float r8 = r5 * r7
            float r9 = r0._sinAngle
            float r10 = r5 * r9
            float r11 = r18 + r8
            float r14 = r19 + r10
            float r8 = r6 - r8
            float r10 = r24 - r10
            if (r2 == 0) goto L74a
            r41 = r18
            r42 = r19
            goto L74e
        L74a:
            r41 = r11
            r42 = r14
        L74e:
            if (r1 == 0) goto L755
            r43 = r6
            r44 = r24
            goto L759
        L755:
            r43 = r8
            r44 = r10
        L759:
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            float r45 = r12 + r5
            float r46 = r13 + r5
            float r47 = r3 + r5
            float r5 = r0._angle
            com.badlogic.gdx.graphics.Color r55 = com.badlogic.gdx.graphics.Color.RED
            r40 = r58
            r48 = r5
            r49 = r7
            r50 = r9
            r51 = r4
            r52 = r2
            r53 = r1
            r54 = r55
            r40.myRoundedTrapezoid(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L77a:
            float r15 = r0._angle
            float r5 = r0._cosAngle
            float r14 = r0._sinAngle
            com.badlogic.gdx.graphics.Color r11 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r10 = r0._colorRef2
            r7 = r58
            r8 = r18
            r9 = r19
            r22 = r10
            r10 = r6
            r6 = r11
            r11 = r24
            r17 = r14
            r14 = r3
            r16 = r5
            r18 = r4
            r19 = r2
            r20 = r1
            r21 = r6
            r7.myRoundedTrapezoid(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L98a
        L7a2:
            r4 = 3
            if (r1 != r4) goto L922
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L7aa
            return
        L7aa:
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r2 = r2 * r5
            float r2 = r2 * r11
            boolean r1 = r57.getValTriangleUpsideDown()
            if (r1 == 0) goto L7c1
            r26 = r6
            r6 = r18
            r27 = r24
            r24 = r19
            goto L7c5
        L7c1:
            r26 = r18
            r27 = r19
        L7c5:
            if (r62 == 0) goto L886
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = r58
            r4.setColor(r3, r7, r7, r3)
            r3 = -1
            r5 = 1
        L7d6:
            if (r3 > r5) goto L888
            r7 = -1
        L7d9:
            if (r7 > r5) goto L882
            if (r3 != 0) goto L7e1
            if (r7 != 0) goto L7e1
            goto L87e
        L7e1:
            float r8 = (float) r3
            float r8 = r8 * r1
            float r9 = (float) r7
            float r9 = r9 * r1
            short r10 = r0._rightTriangleDirection
            if (r10 != 0) goto L825
            float r10 = r8 + r6
            float r11 = r0._angle
            float r11 = r11 - r12
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r11 = r11 * r2
            float r14 = r10 + r11
            float r11 = r9 + r24
            float r13 = r0._angle
            float r13 = r13 - r12
            float r13 = org.fortheloss.framework.CustomMathUtils.sinDeg(r13)
            float r13 = r13 * r2
            float r15 = r11 + r13
            float r13 = r0._angle
            float r13 = r13 + r12
            float r13 = org.fortheloss.framework.CustomMathUtils.cosDeg(r13)
            float r13 = r13 * r2
            float r16 = r10 + r13
            float r10 = r0._angle
            float r10 = r10 + r12
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r10 = r10 * r2
            float r17 = r11 + r10
            float r18 = r8 + r26
            float r19 = r9 + r27
            r13 = r58
            r13.triangle(r14, r15, r16, r17, r18, r19)
            goto L87e
        L825:
            float r10 = r8 + r6
            float r11 = r0._angle
            float r11 = r11 - r12
            float r11 = org.fortheloss.framework.CustomMathUtils.cosDeg(r11)
            float r11 = r11 * r2
            float r14 = r10 + r11
            float r11 = r9 + r24
            float r13 = r0._angle
            float r13 = r13 - r12
            float r13 = org.fortheloss.framework.CustomMathUtils.sinDeg(r13)
            float r13 = r13 * r2
            float r15 = r11 + r13
            float r13 = r0._angle
            float r13 = r13 + r12
            float r13 = org.fortheloss.framework.CustomMathUtils.cosDeg(r13)
            float r13 = r13 * r2
            float r16 = r10 + r13
            float r10 = r0._angle
            float r10 = r10 + r12
            float r10 = org.fortheloss.framework.CustomMathUtils.sinDeg(r10)
            float r10 = r10 * r2
            float r17 = r11 + r10
            float r8 = r8 + r26
            float r10 = r0._angle
            short r11 = r0._rightTriangleDirection
            int r11 = r11 * 90
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = org.fortheloss.framework.CustomMathUtils.cosDeg(r10)
            float r10 = r10 * r2
            float r18 = r8 + r10
            float r9 = r9 + r27
            float r8 = r0._angle
            short r10 = r0._rightTriangleDirection
            int r10 = r10 * 90
            float r10 = (float) r10
            float r8 = r8 - r10
            float r8 = org.fortheloss.framework.CustomMathUtils.sinDeg(r8)
            float r8 = r8 * r2
            float r19 = r9 + r8
            r13 = r58
            r13.triangle(r14, r15, r16, r17, r18, r19)
        L87e:
            int r7 = r7 + 1
            goto L7d9
        L882:
            int r3 = r3 + 1
            goto L7d6
        L886:
            r4 = r58
        L888:
            short r1 = r0._rightTriangleDirection
            if (r1 != 0) goto L8c8
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r2
            float r22 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r2
            float r23 = r24 + r1
            float r1 = r0._angle
            float r1 = r1 + r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r2
            float r1 = r1 + r6
            float r3 = r0._angle
            float r3 = r3 + r12
            float r3 = org.fortheloss.framework.CustomMathUtils.sinDeg(r3)
            float r3 = r3 * r2
            float r25 = r24 + r3
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef1
            r21 = r58
            r24 = r1
            r28 = r2
            r29 = r3
            r21.triangle(r22, r23, r24, r25, r26, r27, r28, r29)
            goto L98a
        L8c8:
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r2
            float r29 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 - r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r2
            float r30 = r24 + r1
            float r1 = r0._angle
            float r1 = r1 + r12
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r2
            float r31 = r6 + r1
            float r1 = r0._angle
            float r1 = r1 + r12
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r2
            float r32 = r24 + r1
            float r1 = r0._angle
            short r3 = r0._rightTriangleDirection
            int r3 = r3 * 90
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = org.fortheloss.framework.CustomMathUtils.cosDeg(r1)
            float r1 = r1 * r2
            float r33 = r26 + r1
            float r1 = r0._angle
            short r3 = r0._rightTriangleDirection
            int r3 = r3 * 90
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = org.fortheloss.framework.CustomMathUtils.sinDeg(r1)
            float r1 = r1 * r2
            float r34 = r27 + r1
            com.badlogic.gdx.graphics.Color r1 = r0._colorRef2
            com.badlogic.gdx.graphics.Color r2 = r0._colorRef1
            r28 = r58
            r35 = r1
            r36 = r2
            r28.triangle(r29, r30, r31, r32, r33, r34, r35, r36)
            goto L98a
        L922:
            r4 = r58
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r2 * r1
            float r7 = r7 * r5
            float r7 = r7 * r11
            float r3 = r3 + r2
            float r3 = r3 * r5
            float r3 = r3 * r1
            float r2 = r3 * r11
            if (r62 == 0) goto L960
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r3 = r0._cosAngle
            float r5 = r3 * r7
            float r5 = r6 - r5
            float r3 = r3 * r2
            float r29 = r5 + r3
            float r3 = r0._sinAngle
            float r5 = r3 * r7
            float r5 = r24 - r5
            float r3 = r3 * r2
            float r30 = r5 + r3
            float r31 = r2 + r1
            short r32 = r57.getValNumPolygonVertices()
            float r1 = r0._angle
            com.badlogic.gdx.graphics.Color r35 = com.badlogic.gdx.graphics.Color.RED
            r28 = r58
            r33 = r1
            r34 = r35
            r28.polygon(r29, r30, r31, r32, r33, r34, r35)
        L960:
            float r1 = r0._cosAngle
            float r3 = r1 * r7
            float r6 = r6 - r3
            float r1 = r1 * r2
            float r29 = r6 + r1
            float r1 = r0._sinAngle
            float r7 = r7 * r1
            float r24 = r24 - r7
            float r1 = r1 * r2
            float r30 = r24 + r1
            short r32 = r57.getValNumPolygonVertices()
            float r1 = r0._angle
            com.badlogic.gdx.graphics.Color r3 = r0._colorRef1
            com.badlogic.gdx.graphics.Color r5 = r0._colorRef2
            r28 = r58
            r31 = r2
            r33 = r1
            r34 = r3
            r35 = r5
            r28.polygon(r29, r30, r31, r32, r33, r34, r35)
        L98a:
            return
    }

    public void drawLockedNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r6, float r7, float r8, float r9, boolean r10, boolean r11) {
            r5 = this;
            boolean r0 = r5.getValIsStatic()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r6.getBatch()
            if (r0 == 0) goto Le
            r2 = 1059816735(0x3f2b851f, float:0.67)
            goto L10
        Le:
            r2 = 1065353216(0x3f800000, float:1.0)
        L10:
            boolean r3 = r5.getValUseSegmentScale()
            if (r3 == 0) goto L23
            float r3 = r5.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r5._stickfigureRef
            float r4 = r4.getScale()
            float r3 = r3 * r4
            goto L29
        L23:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r5._stickfigureRef
            float r3 = r3.getScale()
        L29:
            float r3 = r3 * r9
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r5._parentNodeRef
            if (r4 == 0) goto L3f
            float r4 = r4.getX()
            float r4 = r4 * r9
            float r7 = r7 + r4
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r5._parentNodeRef
            float r4 = r4.getY()
            float r4 = r4 * r9
            float r8 = r8 + r4
        L3f:
            float r4 = r5._localX
            float r4 = r4 * r3
            float r7 = r7 + r4
            float r4 = r5._localY
            float r4 = r4 * r3
            float r8 = r8 + r4
            boolean r3 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r3 == 0) goto L5e
            r3 = r5
            org.fortheloss.sticknodes.stickfigure.Connector r3 = (org.fortheloss.sticknodes.stickfigure.Connector) r3
            float r4 = r3.getLocalNodeXUnsafe()
            float r4 = r4 * r9
            float r7 = r7 - r4
            float r3 = r3.getLocalNodeYUnsafe()
            float r3 = r3 * r9
            float r8 = r8 - r3
        L5e:
            r9 = 8
            if (r10 == 0) goto L82
            if (r11 == 0) goto L6e
            r9 = 10
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r6.getNode(r9)
            r6.drawNode(r1, r7, r8, r2)
            goto L89
        L6e:
            if (r0 == 0) goto L78
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r6.getNode(r9)
            r6.drawNode(r1, r7, r8, r2)
            goto L89
        L78:
            r9 = 9
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r6.getNode(r9)
            r6.drawNode(r1, r7, r8, r2)
            goto L89
        L82:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r6.getNode(r9)
            r6.drawNode(r1, r7, r8, r2)
        L89:
            return
    }

    public void drawNode(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r21, float r22, float r23, float r24, boolean r25, boolean r26, boolean r27, boolean r28) {
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r20.getValIsStatic()
            if (r2 == 0) goto L11
            if (r25 != 0) goto Ld
            return
        Ld:
            r3 = 1059816735(0x3f2b851f, float:0.67)
            goto L13
        L11:
            r3 = 1065353216(0x3f800000, float:1.0)
        L13:
            com.badlogic.gdx.graphics.g2d.Batch r4 = r21.getBatch()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0._stickfigureRef
            boolean r5 = r5.isLocked()
            if (r5 != 0) goto L2a
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0._stickfigureRef
            byte r5 = r5.isLockedToCamera()
            if (r5 == 0) goto L28
            goto L2a
        L28:
            r5 = 0
            goto L2b
        L2a:
            r5 = 1
        L2b:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r0._stickfigureRef
            boolean r8 = r8.isJoined()
            boolean r9 = r20.getValUseSegmentScale()
            if (r9 == 0) goto L44
            float r9 = r20.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r0._stickfigureRef
            float r10 = r10.getScale()
            float r9 = r9 * r10
            goto L4a
        L44:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r0._stickfigureRef
            float r9 = r9.getScale()
        L4a:
            float r9 = r9 * r24
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r0._parentNodeRef
            if (r10 == 0) goto L63
            float r10 = r10.getX()
            float r10 = r10 * r24
            float r10 = r22 + r10
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r0._parentNodeRef
            float r11 = r11.getY()
            float r11 = r11 * r24
            float r11 = r23 + r11
            goto L67
        L63:
            r10 = r22
            r11 = r23
        L67:
            float r12 = r0._localX
            float r12 = r12 * r9
            float r10 = r10 + r12
            float r12 = r0._localY
            float r12 = r12 * r9
            float r11 = r11 + r12
            boolean r9 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r9 == 0) goto L86
            r12 = r0
            org.fortheloss.sticknodes.stickfigure.Connector r12 = (org.fortheloss.sticknodes.stickfigure.Connector) r12
            float r13 = r12.getLocalNodeXUnsafe()
            float r13 = r13 * r24
            float r10 = r10 - r13
            float r12 = r12.getLocalNodeYUnsafe()
            float r12 = r12 * r24
            float r11 = r11 - r12
        L86:
            boolean r12 = r20.isSmartStretch()
            boolean r13 = r20.isPolyfillAnchor()
            boolean r14 = r20.isConnectorParent()
            boolean r15 = r20.isJoinAnchor()
            r16 = 31
            r17 = -1
            if (r15 == 0) goto Lae
            if (r28 == 0) goto La1
            r15 = 31
            goto Laf
        La1:
            if (r26 == 0) goto Lab
            if (r27 == 0) goto La8
            r15 = 30
            goto Laf
        La8:
            r15 = 29
            goto Laf
        Lab:
            r15 = 28
            goto Laf
        Lae:
            r15 = -1
        Laf:
            boolean r18 = r20.isMainNode()
            r19 = 11
            r7 = 39
            r6 = 3
            if (r18 == 0) goto L274
            r2 = 60
            r12 = 40
            r18 = 1069547520(0x3fc00000, float:1.5)
            if (r8 == 0) goto L13e
            if (r28 == 0) goto Lf4
            if (r13 == 0) goto Lcd
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r7)
            r2.drawNode(r4, r10, r11, r3)
        Lcd:
            if (r14 == 0) goto Le8
            r2 = 59
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r7 = r0.mConnectorChildRef
            float r7 = r7._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r7
            r22.drawNode(r23, r24, r25, r26, r27)
        Le8:
            if (r5 == 0) goto Lef
            float r3 = r3 * r18
            r8 = 11
            goto Lf0
        Lef:
            r8 = 3
        Lf0:
            r15 = 31
            goto L3f0
        Lf4:
            if (r26 == 0) goto L119
            if (r13 == 0) goto Lff
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r5 = r1.getNode(r12)
            r5.drawNode(r4, r10, r11, r3)
        Lff:
            if (r14 == 0) goto L13b
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
            goto L13b
        L119:
            if (r13 == 0) goto L122
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r5 = r1.getNode(r12)
            r5.drawNode(r4, r10, r11, r3)
        L122:
            if (r14 == 0) goto L13b
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L13b:
            r8 = -1
            goto L3f0
        L13e:
            r6 = 1106247680(0x41f00000, float:30.0)
            if (r28 == 0) goto L1a6
            float r2 = r0._localAngle
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r2)
            float r7 = r0._localAngle
            float r7 = com.badlogic.gdx.math.MathUtils.sinDeg(r7)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r6
            r6 = 23
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r1.getNode(r6)
            float r2 = r2 * r8
            float r12 = r10 - r2
            float r7 = r7 * r8
            float r8 = r11 - r7
            float r2 = r2 + r10
            float r7 = r7 + r11
            r22 = r6
            r23 = r4
            r24 = r12
            r25 = r8
            r26 = r2
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            if (r13 == 0) goto L17c
            r2 = 43
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            r2.drawNode(r4, r10, r11, r3)
        L17c:
            if (r14 == 0) goto L197
            r2 = 63
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r6 = r0.mConnectorChildRef
            float r6 = r6._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r6
            r22.drawNode(r23, r24, r25, r26, r27)
        L197:
            if (r5 == 0) goto L1a1
            r2 = 15
            float r3 = r3 * r18
            r17 = 15
            goto L2d1
        L1a1:
            r2 = 7
            r17 = 7
            goto L2d1
        L1a6:
            if (r26 == 0) goto L243
            if (r27 == 0) goto L20e
            float r2 = r0._localAngle
            float r2 = com.badlogic.gdx.math.MathUtils.cosDeg(r2)
            float r7 = r0._localAngle
            float r7 = com.badlogic.gdx.math.MathUtils.sinDeg(r7)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r6
            r6 = 22
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r1.getNode(r6)
            float r2 = r2 * r8
            float r12 = r10 - r2
            float r7 = r7 * r8
            float r8 = r11 - r7
            float r2 = r2 + r10
            float r7 = r7 + r11
            r22 = r6
            r23 = r4
            r24 = r12
            r25 = r8
            r26 = r2
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            if (r13 == 0) goto L1e4
            r2 = 42
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            r2.drawNode(r4, r10, r11, r3)
        L1e4:
            if (r14 == 0) goto L1ff
            r2 = 62
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r6 = r0.mConnectorChildRef
            float r6 = r6._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r6
            r22.drawNode(r23, r24, r25, r26, r27)
        L1ff:
            if (r5 == 0) goto L209
            r2 = 14
            float r3 = r3 * r18
            r17 = 14
            goto L2d1
        L209:
            r2 = 6
            r17 = 6
            goto L2d1
        L20e:
            if (r13 == 0) goto L219
            r2 = 41
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            r2.drawNode(r4, r10, r11, r3)
        L219:
            if (r14 == 0) goto L234
            r2 = 61
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r6 = r0.mConnectorChildRef
            float r6 = r6._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r6
            r22.drawNode(r23, r24, r25, r26, r27)
        L234:
            if (r5 == 0) goto L23e
            r17 = 13
            float r3 = r3 * r18
            r8 = 13
            goto L3f0
        L23e:
            r17 = 5
            r8 = 5
            goto L3f0
        L243:
            if (r13 == 0) goto L24c
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r6 = r1.getNode(r12)
            r6.drawNode(r4, r10, r11, r3)
        L24c:
            if (r14 == 0) goto L265
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r6 = r0.mConnectorChildRef
            float r6 = r6._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r6
            r22.drawNode(r23, r24, r25, r26, r27)
        L265:
            if (r5 == 0) goto L26f
            r17 = 12
            float r3 = r3 * r18
            r8 = 12
            goto L3f0
        L26f:
            r17 = 4
            r8 = 4
            goto L3f0
        L274:
            if (r28 == 0) goto L2d5
            if (r9 == 0) goto L27d
            r2 = 55
            r17 = 55
            goto L27f
        L27d:
            r17 = 3
        L27f:
            if (r12 == 0) goto L298
            r2 = 35
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            float r5 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L298:
            if (r13 == 0) goto L2a1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r7)
            r2.drawNode(r4, r10, r11, r3)
        L2a1:
            if (r14 == 0) goto L2bc
            r2 = 59
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L2bc:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r0._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getLockedStickNode()
            if (r2 != r0) goto L2d1
            if (r9 != 0) goto L2d1
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r6)
            r2.drawNode(r4, r10, r11, r3)
            r8 = 11
            goto L3f0
        L2d1:
            r8 = r17
            goto L3f0
        L2d5:
            r5 = 56
            r6 = 36
            r7 = 32
            r8 = 52
            if (r26 == 0) goto L3b3
            if (r27 == 0) goto L32b
            if (r9 == 0) goto L2e8
            r2 = 54
            r17 = 54
            goto L2eb
        L2e8:
            r2 = 2
            r17 = 2
        L2eb:
            if (r12 == 0) goto L304
            r2 = 34
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            float r5 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L304:
            if (r13 == 0) goto L30f
            r2 = 38
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            r2.drawNode(r4, r10, r11, r3)
        L30f:
            if (r14 == 0) goto L2d1
            r2 = 58
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
            goto L2d1
        L32b:
            if (r2 == 0) goto L36c
            if (r9 == 0) goto L330
            goto L331
        L330:
            r8 = 0
        L331:
            if (r12 == 0) goto L348
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r7)
            float r7 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r7
            r22.drawNode(r23, r24, r25, r26, r27)
        L348:
            if (r13 == 0) goto L351
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r6)
            r2.drawNode(r4, r10, r11, r3)
        L351:
            if (r14 == 0) goto L3f0
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r5)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
            goto L3f0
        L36c:
            if (r9 == 0) goto L371
            r6 = 53
            goto L372
        L371:
            r6 = 1
        L372:
            if (r12 == 0) goto L38b
            r2 = 33
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            float r5 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L38b:
            if (r13 == 0) goto L396
            r2 = 37
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            r2.drawNode(r4, r10, r11, r3)
        L396:
            if (r14 == 0) goto L3b1
            r2 = 57
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r2)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L3b1:
            r8 = r6
            goto L3f0
        L3b3:
            if (r9 == 0) goto L3b6
            goto L3b7
        L3b6:
            r8 = 0
        L3b7:
            if (r12 == 0) goto L3ce
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r7)
            float r7 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r7
            r22.drawNode(r23, r24, r25, r26, r27)
        L3ce:
            if (r13 == 0) goto L3d7
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r6)
            r2.drawNode(r4, r10, r11, r3)
        L3d7:
            if (r14 == 0) goto L3f0
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r5)
            org.fortheloss.sticknodes.stickfigure.Connector r5 = r0.mConnectorChildRef
            float r5 = r5._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
        L3f0:
            if (r8 < 0) goto L411
            if (r9 == 0) goto L40a
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r8)
            float r5 = r0._angle
            r22 = r2
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r3
            r27 = r5
            r22.drawNode(r23, r24, r25, r26, r27)
            goto L411
        L40a:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r2 = r1.getNode(r8)
            r2.drawNode(r4, r10, r11, r3)
        L411:
            if (r15 < 0) goto L41a
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r1 = r1.getNode(r15)
            r1.drawNode(r4, r10, r11, r3)
        L41a:
            return
    }

    public void flagPolyfillAsDirty() {
            r1 = this;
            r0 = 0
            r1._triangulatedPolynodeChildrenDrawOrder = r0
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public void flagPositionAsDirty() {
            r1 = this;
            r0 = 1
            r1._positionIsDirty = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            r0.addDirtyNode(r1)
            return
    }

    public void flipX(boolean r10) {
            r9 = this;
            r9.validatePosition()
            boolean r0 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r9._childrenNodes
            int r0 = r0.size()
            int r0 = r0 - r3
        L11:
            if (r0 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r9._childrenNodes
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.flipX(r10)
            int r0 = r0 + (-1)
            goto L11
        L21:
            boolean r0 = r9.isJoinAnchor()
            if (r0 == 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r9._joinedFigureRefs
            int r0 = r0.size()
            int r0 = r0 - r3
        L2e:
            if (r0 < 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r9._joinedFigureRefs
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            r4.flipX(r10)
            int r0 = r0 + (-1)
            goto L2e
        L3e:
            r10 = r2
            goto L15b
        L41:
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Class<java.util.Stack> r4 = java.util.Stack.class
            java.lang.Object r4 = com.badlogic.gdx.utils.Pools.obtain(r4)
            java.util.Stack r4 = (java.util.Stack) r4
            r4.add(r9)
        L5d:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Lc7
            java.lang.Object r5 = r4.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            boolean r6 = r5.getIsAngleLocked()
            if (r6 == 0) goto L89
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r6 != 0) goto L89
            boolean r6 = r5.isMainNode()
            if (r6 != 0) goto L89
            boolean r6 = r5.getAngleLockIsMainNode()
            if (r6 == 0) goto L83
            r2.add(r5)
            goto L86
        L83:
            r0.add(r5)
        L86:
            r5.setIsAngleLocked(r1)
        L89:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r5._childrenNodes
            int r6 = r6.size()
            int r6 = r6 - r3
        L90:
            if (r6 < 0) goto La0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7 = r5._childrenNodes
            java.lang.Object r7 = r7.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = (org.fortheloss.sticknodes.stickfigure.StickNode) r7
            r4.add(r7)
            int r6 = r6 + (-1)
            goto L90
        La0:
            boolean r6 = r5.isJoinAnchor()
            if (r6 == 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r5._joinedFigureRefs
            int r6 = r6.size()
            int r6 = r6 - r3
        Lad:
            if (r6 < 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r5._joinedFigureRefs
            java.lang.Object r7 = r7.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r7 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r7
            boolean r8 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r8 == 0) goto Lc4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r7.getMainNode()
            r4.add(r7)
        Lc4:
            int r6 = r6 + (-1)
            goto Lad
        Lc7:
            r4.clear()
            com.badlogic.gdx.utils.Pools.free(r4)
            r9.actuallyFlip(r3)
            boolean r4 = r9.isMainNode()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            r7 = 1127481344(0x43340000, float:180.0)
            r8 = 1135869952(0x43b40000, float:360.0)
            if (r4 == 0) goto L116
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r9._stickfigureRef
            boolean r4 = r4.isJoined()
            if (r4 == 0) goto L110
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r9._stickfigureRef
            float r4 = r4.getJoinOffsetAngle()
            float r4 = r4 % r8
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lf1
            float r4 = r4 + r8
        Lf1:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r9._stickfigureRef
            float r4 = r4 - r7
            r6.setJoinOffsetAngle(r4)
            if (r10 != 0) goto L159
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r10.getJoinedToNode()
            float r10 = r10.getAngle()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r9._stickfigureRef
            float r6 = r4.getJoinOffsetAngle()
            float r10 = r10 * r5
            float r6 = r6 + r10
            r4.setJoinOffsetAngle(r6)
            goto L159
        L110:
            float r10 = r9._localAngle
            float r10 = -r10
            r9._localAngle = r10
            goto L159
        L116:
            if (r10 == 0) goto L13f
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r9.getParentNode()
            boolean r10 = r10.isMainNode()
            if (r10 == 0) goto L13f
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            boolean r10 = r10.isJoined()
            if (r10 == 0) goto L13f
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            float r10 = r10.getJoinOffsetAngle()
            float r10 = r10 % r8
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 >= 0) goto L136
            float r10 = r10 + r8
        L136:
            float r4 = r9._localAngle
            float r4 = r4 - r7
            float r10 = r10 * r5
            float r4 = r4 + r10
            r9._localAngle = r4
            goto L159
        L13f:
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r9.getParentNode()
            boolean r10 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r10 == 0) goto L14d
            float r10 = r9._localAngle
            float r10 = r10 - r7
            r9._localAngle = r10
            goto L159
        L14d:
            org.fortheloss.sticknodes.stickfigure.StickNode r10 = r9._parentNodeRef
            float r10 = r10._angle
            float r4 = r9.getAngle()
            float r7 = r7 - r4
            float r10 = r10 - r7
            r9._localAngle = r10
        L159:
            r10 = r2
            r2 = r0
        L15b:
            r9.flagPositionAsDirty()
            r9.validatePosition()
            if (r2 == 0) goto L1a7
            int r0 = r2.size()
            int r0 = r0 - r3
        L168:
            if (r0 < 0) goto L1a1
            java.lang.Object r4 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getMainNode()
            r4.flagPositionAsDirty()
            java.lang.Object r4 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getMainNode()
            r4.validatePosition()
            java.lang.Object r4 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.setIsAngleLocked(r3)
            java.lang.Object r4 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.setAngleLockIsMainNode(r1)
            int r0 = r0 + (-1)
            goto L168
        L1a1:
            r2.clear()
            com.badlogic.gdx.utils.Pools.free(r2)
        L1a7:
            if (r10 == 0) goto L1e4
            int r0 = r10.size()
            int r0 = r0 - r3
        L1ae:
            if (r0 < 0) goto L1de
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.flagPositionAsDirty()
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.validatePosition()
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.setIsAngleLocked(r3)
            int r0 = r0 + (-1)
            goto L1ae
        L1de:
            r10.clear()
            com.badlogic.gdx.utils.Pools.free(r10)
        L1e4:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            r10.repositionBasedOnLockedStickNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            r10.recalculatePolyfills()
            return
    }

    public void flipY(boolean r10) {
            r9 = this;
            r9.validatePosition()
            boolean r0 = r9 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r9._childrenNodes
            int r0 = r0.size()
            int r0 = r0 - r3
        L11:
            if (r0 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r9._childrenNodes
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.flipY(r10)
            int r0 = r0 + (-1)
            goto L11
        L21:
            boolean r0 = r9.isJoinAnchor()
            if (r0 == 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r9._joinedFigureRefs
            int r0 = r0.size()
            int r0 = r0 - r3
        L2e:
            if (r0 < 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r9._joinedFigureRefs
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            r4.flipY(r10)
            int r0 = r0 + (-1)
            goto L2e
        L3e:
            r10 = r1
            goto L129
        L41:
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            java.lang.Object r10 = com.badlogic.gdx.utils.Pools.obtain(r10)
            r1 = r10
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            java.lang.Object r10 = com.badlogic.gdx.utils.Pools.obtain(r10)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.add(r9)
        L5d:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Lc7
            java.lang.Object r4 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            boolean r5 = r4.getIsAngleLocked()
            if (r5 == 0) goto L89
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r5 != 0) goto L89
            boolean r5 = r4.isMainNode()
            if (r5 != 0) goto L89
            boolean r5 = r4.getAngleLockIsMainNode()
            if (r5 == 0) goto L83
            r1.add(r4)
            goto L86
        L83:
            r10.add(r4)
        L86:
            r4.setIsAngleLocked(r2)
        L89:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r4._childrenNodes
            int r5 = r5.size()
            int r5 = r5 - r3
        L90:
            if (r5 < 0) goto La0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r6 = r4._childrenNodes
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            r0.add(r6)
            int r5 = r5 + (-1)
            goto L90
        La0:
            boolean r5 = r4.isJoinAnchor()
            if (r5 == 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r5 = r4._joinedFigureRefs
            int r5 = r5.size()
            int r5 = r5 - r3
        Lad:
            if (r5 < 0) goto L5d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r4._joinedFigureRefs
            java.lang.Object r6 = r6.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto Lc4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r6
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r6.getMainNode()
            r0.add(r6)
        Lc4:
            int r5 = r5 + (-1)
            goto Lad
        Lc7:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            r9.actuallyFlip(r2)
            boolean r0 = r9.isMainNode()
            if (r0 == 0) goto Le6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9._stickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 != 0) goto L126
            r0 = 1127481344(0x43340000, float:180.0)
            float r4 = r9._localAngle
            float r0 = r0 - r4
            r9._localAngle = r0
            goto L126
        Le6:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r9.getParentNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L111
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9._stickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L111
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r9._stickfigureRef
            float r0 = r0.getJoinOffsetAngle()
            r4 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r4
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L107
            float r0 = r0 + r4
        L107:
            float r4 = r9._localAngle
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r4 = r4 + r0
            r9._localAngle = r4
            goto L126
        L111:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r9.getParentNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L11a
            goto L126
        L11a:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r9._parentNodeRef
            float r0 = r0._angle
            float r4 = r9.getAngle()
            float r4 = -r4
            float r0 = r0 - r4
            r9._localAngle = r0
        L126:
            r8 = r1
            r1 = r10
            r10 = r8
        L129:
            r9.flagPositionAsDirty()
            r9.validatePosition()
            if (r1 == 0) goto L175
            int r0 = r1.size()
            int r0 = r0 - r3
        L136:
            if (r0 < 0) goto L16f
            java.lang.Object r4 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getMainNode()
            r4.flagPositionAsDirty()
            java.lang.Object r4 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r4.getMainNode()
            r4.validatePosition()
            java.lang.Object r4 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.setIsAngleLocked(r3)
            java.lang.Object r4 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r4.setAngleLockIsMainNode(r2)
            int r0 = r0 + (-1)
            goto L136
        L16f:
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
        L175:
            if (r10 == 0) goto L1b2
            int r0 = r10.size()
            int r0 = r0 - r3
        L17c:
            if (r0 < 0) goto L1ac
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.flagPositionAsDirty()
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r1.validatePosition()
            java.lang.Object r1 = r10.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.setIsAngleLocked(r3)
            int r0 = r0 + (-1)
            goto L17c
        L1ac:
            r10.clear()
            com.badlogic.gdx.utils.Pools.free(r10)
        L1b2:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            r10.repositionBasedOnLockedStickNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r10 = r9._stickfigureRef
            r10.recalculatePolyfills()
            return
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getAngle() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._angle
            return r0
    }

    public boolean getAngleLockIsMainNode() {
            r1 = this;
            boolean r0 = r1.getValAngleLockIsMainNode()
            return r0
    }

    public org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] getBranchProperties() {
            r6 = this;
            int r0 = r6.getDescendantCount()
            int r0 = r0 + 1
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r0 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties[r0]
            java.lang.Class<java.util.Stack> r1 = java.util.Stack.class
            java.lang.Object r1 = com.badlogic.gdx.utils.Pools.obtain(r1)
            java.util.Stack r1 = (java.util.Stack) r1
            r1.push(r6)
            r2 = 0
        L14:
            boolean r3 = r1.empty()
            if (r3 != 0) goto L50
            java.lang.Object r3 = r1.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r4 == 0) goto L2d
            org.fortheloss.sticknodes.data.useractions.ConnectorProperties r4 = new org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            r5 = r3
            org.fortheloss.sticknodes.stickfigure.Connector r5 = (org.fortheloss.sticknodes.stickfigure.Connector) r5
            r4.<init>(r5)
            goto L32
        L2d:
            org.fortheloss.sticknodes.data.useractions.StickNodeProperties r4 = new org.fortheloss.sticknodes.data.useractions.StickNodeProperties
            r4.<init>(r3)
        L32:
            int r5 = r2 + 1
            r0[r2] = r4
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3e:
            if (r2 < 0) goto L4e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r3._childrenNodes
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r1.push(r4)
            int r2 = r2 + (-1)
            goto L3e
        L4e:
            r2 = r5
            goto L14
        L50:
            r1.clear()
            com.badlogic.gdx.utils.Pools.free(r1)
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> getChildrenNodes() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._childrenNodes
            return r0
    }

    public boolean getCircleIsHollow() {
            r1 = this;
            boolean r0 = r1.getValCircleIsHollow()
            return r0
    }

    public com.badlogic.gdx.graphics.Color getCircleOutlineColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorCircleOutline()
            return r0
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorSegment()
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> getConnectorAttachments() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorAttachments
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Connector getConnectorChild() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r1.mConnectorChildRef
            return r0
    }

    public int getDescendantCount() {
            r5 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r5._childrenNodes
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L10:
            if (r1 < 0) goto L20
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r5._childrenNodes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.push(r2)
            int r1 = r1 + (-1)
            goto L10
        L20:
            r1 = 0
        L21:
            boolean r2 = r0.empty()
            if (r2 != 0) goto L47
            java.lang.Object r2 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r1 = r1 + 1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r2._childrenNodes
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L37:
            if (r3 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r2._childrenNodes
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r3 = r3 + (-1)
            goto L37
        L47:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return r1
    }

    public boolean getDoNotApplySmartStretch() {
            r1 = this;
            boolean r0 = r1.getValSmartStretchDoNotApply()
            return r0
    }

    public float getDragLockAngle() {
            r1 = this;
            float r0 = r1.mDragLockAngle
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public int getDrawOrderIndex() {
            r1 = this;
            int r0 = r1.getValDrawOrderIndex()
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getDrawableFigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalX() {
            r2 = this;
            float r0 = r2.getX()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            float r1 = r1.getX()
            float r0 = r0 + r1
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getGlobalY() {
            r2 = this;
            float r0 = r2.getY()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            float r1 = r1.getY()
            float r0 = r0 + r1
            return r0
    }

    public com.badlogic.gdx.graphics.Color getGradientColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorGradient()
            return r0
    }

    public short getGradientMode() {
            r1 = this;
            short r0 = r1.getValGradientMode()
            return r0
    }

    public boolean getIsAngleLocked() {
            r1 = this;
            boolean r0 = r1.getValIsAngleLocked()
            return r0
    }

    public boolean getIsDragLocked() {
            r1 = this;
            boolean r0 = r1.mIsDragLocked
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getJoinedFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getLastPolynodeInPolyfill() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            return r0
        L1a:
            return r2
    }

    public float getLength() {
            r1 = this;
            float r0 = r1.getValLength()
            return r0
    }

    public float getLengthDefault() {
            r1 = this;
            float r0 = r1.getValDefaultLength()
            return r0
    }

    protected abstract org.fortheloss.sticknodes.stickfigure.IDynamicNode getLibraryNodeReference();

    public int getLimbType() {
            r1 = this;
            int r0 = r1.getValLimbType()
            return r0
    }

    public float getLocalAngle() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._localAngle
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> getNeighborNodes(boolean r6) {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r0 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            r0.clear()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5._parentNodeRef
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._childrenNodes
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L14:
            if (r0 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r2 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r5._childrenNodes
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.stickfigure.INode r3 = (org.fortheloss.sticknodes.stickfigure.INode) r3
            r2.add(r3)
            int r0 = r0 + (-1)
            goto L14
        L26:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r5.mConnectorAttachments
            if (r0 == 0) goto L41
            int r0 = r0.size()
            int r0 = r0 - r1
        L2f:
            if (r0 < 0) goto L41
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r2 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r3 = r5.mConnectorAttachments
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r2.add(r3)
            int r0 = r0 + (-1)
            goto L2f
        L41:
            if (r6 == 0) goto L8d
            boolean r6 = r5.isJoinAnchor()
            if (r6 == 0) goto L8d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r6 = r5._joinedFigureRefs
            int r6 = r6.size()
            int r6 = r6 - r1
        L50:
            if (r6 < 0) goto L8d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._joinedFigureRefs
            java.lang.Object r0 = r0.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L7d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getMainNode()
            java.util.ArrayList r0 = r0.getChildrenNodes()
            int r2 = r0.size()
            int r2 = r2 - r1
        L6d:
            if (r2 < 0) goto L8a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r3 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            java.lang.Object r4 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.INode r4 = (org.fortheloss.sticknodes.stickfigure.INode) r4
            r3.add(r4)
            int r2 = r2 + (-1)
            goto L6d
        L7d:
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L8a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r2 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getNodeAtDrawOrderIndex(r1)
            r2.add(r0)
        L8a:
            int r6 = r6 + (-1)
            goto L50
        L8d:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.INode> r6 = org.fortheloss.sticknodes.stickfigure.StickNode._sticknodeArrayListTemp
            return r6
    }

    public short getNumPolygonVertices() {
            r1 = this;
            short r0 = r1.getValNumPolygonVertices()
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getParentNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._parentNodeRef
            return r0
    }

    public com.badlogic.gdx.utils.FloatArray getPointsForSplittingCurve(int r9) {
            r8 = this;
            com.badlogic.gdx.utils.FloatArray r7 = org.fortheloss.sticknodes.stickfigure.StickNode._pointsForEarClipping
            r7.clear()
            int r6 = r9 + 1
            r1 = 0
            r4 = 1
            r5 = 0
            r0 = r8
            r2 = r7
            r3 = r8
            r0.getCurveNodes(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public com.badlogic.gdx.graphics.Color getPolyfillColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorPolyfill()
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> getPolynodeChildren() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            return r0
    }

    public int getPolynodeChildrenCount() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.size()
        La:
            return r0
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties r3) {
            r2 = this;
            r2.validatePosition()
            float r0 = r2._x
            r3.x = r0
            float r0 = r2._y
            r3.y = r0
            float r0 = r2._localX
            r3.localX = r0
            float r0 = r2._localY
            r3.localY = r0
            float r0 = r2.getValDefaultLength()
            r3.defaultLength = r0
            float r0 = r2.getValLength()
            r3.length = r0
            int r0 = r2.getValDefaultThickness()
            r3.defaultThickness = r0
            int r0 = r2.getValThickness()
            r3.thickness = r0
            int r0 = r2._curveRadius
            r3.segmentCurveRadius = r0
            boolean r0 = r2.getValSegmentCurveCirculization()
            r3.segmentCurveCirculization = r0
            short r0 = r2.getValSegmentCurvePolyfillPrecision()
            r3.segmentCurvePrecision = r0
            boolean r0 = r2.getValHalfArc()
            r3.halfArc = r0
            short r0 = r2._rightTriangleDirection
            r3.rightTriangleDirection = r0
            boolean r0 = r2.getValTriangleUpsideDown()
            r3.triangleUpsideDown = r0
            float r0 = r2.getValTrapezoidThickness1()
            r3.trapezoidThickness1 = r0
            boolean r0 = r2.getValTrapezoidIsRounded1()
            r3.trapezoidIsRounded1 = r0
            float r0 = r2.getValTrapezoidThickness2()
            r3.trapezoidThickness2 = r0
            boolean r0 = r2.getValTrapezoidIsRounded2()
            r3.trapezoidIsRounded2 = r0
            float r0 = r2.getValTrapezoidRatio()
            r3.trapezoidRatio = r0
            short r0 = r2.getValNumPolygonVertices()
            r3.numPolygonVertices = r0
            float r0 = r2._defaultLocalAngle
            r3.defaultLocalAngle = r0
            float r0 = r2._localAngle
            r3.localAngle = r0
            float r0 = r2._defaultAngle
            r3.defaultAngle = r0
            float r0 = r2._angle
            r3.angle = r0
            boolean r0 = r2.getValUseSegmentColor()
            r3.useSegmentColor = r0
            com.badlogic.gdx.graphics.Color r0 = r3.color
            com.badlogic.gdx.graphics.Color r1 = r2.getValColorSegment()
            r0.set(r1)
            boolean r0 = r2.getValUseCircleOutline()
            r3.useCircleOutline = r0
            boolean r0 = r2.getValCircleIsHollow()
            r3.circleIsHollow = r0
            com.badlogic.gdx.graphics.Color r0 = r3.circleOutlineColor
            com.badlogic.gdx.graphics.Color r1 = r2.getValColorCircleOutline()
            r0.set(r1)
            boolean r0 = r2.getValUseGradient()
            r3.useGradient = r0
            boolean r0 = r2.mGradientReversed
            r3.reverseGradient = r0
            short r0 = r2.getValGradientMode()
            r3.gradientMode = r0
            com.badlogic.gdx.graphics.Color r0 = r3.gradientColor
            com.badlogic.gdx.graphics.Color r1 = r2.getValColorGradient()
            r0.set(r1)
            boolean r0 = r2.getValUseSegmentScale()
            r3.useSegmentScale = r0
            float r0 = r2.getValSegmentScale()
            r3.scale = r0
            boolean r0 = r2.getValIsStretchy()
            r3.isStretchy = r0
            boolean r0 = r2.getValIsFloaty()
            r3.mIsFloaty = r0
            boolean r0 = r2.getValIsSmartStretch()
            r3.isSmartStretch = r0
            boolean r0 = r2.getValSmartStretchDoNotApply()
            r3.doNotApplySmartStretch = r0
            boolean r0 = r2.getValSmartStretchResetImpulse()
            r3.mSmartStretchResetImpulse = r0
            boolean r0 = r2.getValIsStatic()
            r3.isStatic = r0
            int r0 = r2.getValLimbType()
            r3.limbType = r0
            boolean r0 = r2.getValUsePolyfillColor()
            r3.usePolyfillColor = r0
            com.badlogic.gdx.graphics.Color r0 = r3.polyfillColor
            com.badlogic.gdx.graphics.Color r1 = r2.getValColorPolyfill()
            r0.set(r1)
            boolean r0 = r2.getValIsAngleLocked()
            r3.mIsAngleLocked = r0
            boolean r0 = r2.getValAngleLockIsMainNode()
            r3.mAngleLockIsMainNode = r0
            float r0 = r2.mAngleLockOffset
            r3.mAngleLockOffset = r0
            float r0 = r2.getValAngleLockRelativeStart()
            r3.mAngleLockRelativeStart = r0
            float r0 = r2.getValAngleLockStickfigureStart()
            r3.mAngleLockStickfigureStart = r0
            byte r0 = r2.getValAngleLockRelativeMultiplier()
            r3.mAngleLockRelativeMultiplier = r0
            boolean r0 = r2.mIsDragLocked
            r3.mIsDragLocked = r0
            float r0 = r2.mDragLockAngle
            r3.mDragLockAngle = r0
            float r0 = r2.getValSmartStretchMultiplier()
            r3.mSmartStretchMultiplier = r0
            return
    }

    public short getRightTriangleDirection() {
            r1 = this;
            short r0 = r1._rightTriangleDirection
            return r0
    }

    public float getScale() {
            r1 = this;
            float r0 = r1.getValSegmentScale()
            return r0
    }

    public int getSegmentCurve() {
            r1 = this;
            int r0 = r1._curveRadius
            return r0
    }

    public boolean getSegmentCurveCirculization() {
            r1 = this;
            boolean r0 = r1.getValSegmentCurveCirculization()
            return r0
    }

    public int getSegmentCurvePrecision() {
            r1 = this;
            short r0 = r1.getValSegmentCurvePolyfillPrecision()
            return r0
    }

    public byte getSegmentRelativeAngleLockMultiplier() {
            r1 = this;
            byte r0 = r1.getValAngleLockRelativeMultiplier()
            return r0
    }

    public float getSmartStretchMultiplier() {
            r1 = this;
            float r0 = r1.getValSmartStretchMultiplier()
            return r0
    }

    public boolean getSmartStretchResetImpulse() {
            r1 = this;
            boolean r0 = r1.getValSmartStretchResetImpulse()
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            return r0
    }

    public int getThickness() {
            r1 = this;
            int r0 = r1.getValThickness()
            return r0
    }

    public int getThicknessDefault() {
            r1 = this;
            int r0 = r1.getValDefaultThickness()
            return r0
    }

    public boolean getTrapezoidIsRounded1() {
            r1 = this;
            boolean r0 = r1.getValTrapezoidIsRounded1()
            return r0
    }

    public boolean getTrapezoidIsRounded2() {
            r1 = this;
            boolean r0 = r1.getValTrapezoidIsRounded2()
            return r0
    }

    public float getTrapezoidRatio() {
            r1 = this;
            float r0 = r1.getValTrapezoidRatio()
            return r0
    }

    public float getTrapezoidThickness1() {
            r1 = this;
            float r0 = r1.getValTrapezoidThickness1()
            return r0
    }

    public float getTrapezoidThickness2() {
            r1 = this;
            float r0 = r1.getValTrapezoidThickness2()
            return r0
    }

    public boolean getTriangleUpsideDown() {
            r1 = this;
            boolean r0 = r1.getValTriangleUpsideDown()
            return r0
    }

    protected abstract boolean getValAngleLockIsMainNode();

    protected abstract byte getValAngleLockRelativeMultiplier();

    protected abstract float getValAngleLockRelativeStart();

    protected abstract float getValAngleLockStickfigureStart();

    protected abstract boolean getValCircleIsHollow();

    protected abstract com.badlogic.gdx.graphics.Color getValColorCircleOutline();

    protected abstract com.badlogic.gdx.graphics.Color getValColorGradient();

    protected abstract com.badlogic.gdx.graphics.Color getValColorPolyfill();

    protected abstract com.badlogic.gdx.graphics.Color getValColorSegment();

    protected abstract float getValDefaultLength();

    protected abstract int getValDefaultThickness();

    protected abstract int getValDrawOrderIndex();

    protected abstract short getValGradientMode();

    protected abstract boolean getValHalfArc();

    protected abstract boolean getValIsAngleLocked();

    protected abstract boolean getValIsFloaty();

    protected abstract boolean getValIsSmartStretch();

    protected abstract boolean getValIsStatic();

    protected abstract boolean getValIsStretchy();

    protected abstract float getValLength();

    protected abstract int getValLimbType();

    protected abstract short getValNumPolygonVertices();

    protected abstract boolean getValSegmentCurveCirculization();

    protected abstract short getValSegmentCurvePolyfillPrecision();

    protected abstract float getValSegmentScale();

    protected abstract boolean getValSmartStretchDoNotApply();

    protected abstract float getValSmartStretchMultiplier();

    protected abstract boolean getValSmartStretchResetImpulse();

    protected abstract int getValThickness();

    protected abstract boolean getValTrapezoidIsRounded1();

    protected abstract boolean getValTrapezoidIsRounded2();

    protected abstract float getValTrapezoidRatio();

    protected abstract float getValTrapezoidThickness1();

    protected abstract float getValTrapezoidThickness2();

    protected abstract boolean getValTriangleUpsideDown();

    protected abstract boolean getValUseCircleOutline();

    protected abstract boolean getValUseGradient();

    protected abstract boolean getValUsePolyfillColor();

    protected abstract boolean getValUseSegmentColor();

    protected abstract boolean getValUseSegmentScale();

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getX() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._x
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public float getY() {
            r1 = this;
            r1.validatePosition()
            float r0 = r1._y
            return r0
    }

    public boolean hasConnectorAttachments() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r1.mConnectorAttachments
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void highlightChildrenAndParentNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r19, float r20, float r21, float r22, boolean r23) {
            r18 = this;
            r8 = r18
            boolean r6 = r8 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r8._parentNodeRef
            if (r0 == 0) goto L33
            if (r23 != 0) goto L10
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L33
        L10:
            org.fortheloss.sticknodes.stickfigure.StickNode r9 = r8._parentNodeRef
            r15 = 1
            r16 = 1
            r17 = 1
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9.drawNode(r10, r11, r12, r13, r14, r15, r16, r17)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r8._parentNodeRef
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r0.drawHighlightLineToNode(r1, r2, r3, r4, r5, r6)
        L33:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r8._childrenNodes
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r7 = r0
        L3c:
            if (r7 < 0) goto L74
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r8._childrenNodes
            java.lang.Object r0 = r0.get(r7)
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            if (r23 != 0) goto L4f
            boolean r0 = r2.isStatic()
            if (r0 != 0) goto L71
        L4f:
            r15 = 1
            r16 = 1
            r17 = 1
            r9 = r2
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9.drawNode(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r6 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r0.drawHighlightLineToNode(r1, r2, r3, r4, r5, r6)
        L71:
            int r7 = r7 + (-1)
            goto L3c
        L74:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r8.mConnectorAttachments
            if (r0 == 0) goto Lbc
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r7 = r0
        L7f:
            if (r7 < 0) goto Lbc
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r0 = r8.mConnectorAttachments
            java.lang.Object r0 = r0.get(r7)
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            if (r23 != 0) goto L95
            boolean r0 = r2.isStatic()
            if (r0 != 0) goto L93
            goto L95
        L93:
            r10 = r7
            goto Lb9
        L95:
            r15 = 1
            r16 = 1
            r17 = 1
            r9 = r2
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9.drawNode(r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = 1
            r9 = 1
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r10 = r7
            r7 = r9
            r0.drawHighlightLineToNode(r1, r2, r3, r4, r5, r6, r7)
        Lb9:
            int r7 = r10 + (-1)
            goto L7f
        Lbc:
            return
    }

    public void interpolate(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            int r0 = r3._curveRadius
            boolean r1 = r4.mIsDragLocked
            r3.mIsDragLocked = r1
            float r1 = r4.mDragLockAngle
            r3.mDragLockAngle = r1
            float r1 = r4.mAngleLockOffset
            r3.mAngleLockOffset = r1
            boolean r1 = r4.getValUseSegmentScale()
            r3.setValUseSegmentScale(r1)
            boolean r1 = r4.getValSegmentCurveCirculization()
            r3.setValSegmentCurveCirculization(r1)
            float r1 = r4.getValTrapezoidRatio()
            r3.setValTrapezoidRatio(r1)
            boolean r1 = r4.getValTrapezoidIsRounded1()
            r3.setValTrapezoidIsRounded1(r1)
            boolean r1 = r4.getValTrapezoidIsRounded2()
            r3.setValTrapezoidIsRounded2(r1)
            short r1 = r4.getValGradientMode()
            r3.setValGradientMode(r1)
            short r1 = r4.getValSegmentCurvePolyfillPrecision()
            r3.setValSegmentCurvePolyfillPrecision(r1)
            float r1 = r3._localAngle
            float r2 = r4._localAngle
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L65
            float r1 = r3.getValLength()
            float r2 = r4.getValLength()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L65
            float r1 = r3.getValSegmentScale()
            float r2 = r4.getValSegmentScale()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L65
            boolean r1 = r3.isJoinAnchor()
            if (r1 == 0) goto L68
        L65:
            r3.flagPositionAsDirty()
        L68:
            com.badlogic.gdx.graphics.Color r1 = r4.getValColorSegment()
            r3.setValColorSegment(r1)
            com.badlogic.gdx.graphics.Color r1 = r4.getValColorGradient()
            r3.setValColorGradient(r1)
            com.badlogic.gdx.graphics.Color r1 = r4.getValColorPolyfill()
            r3.setValColorPolyfill(r1)
            com.badlogic.gdx.graphics.Color r1 = r4.getValColorCircleOutline()
            r3.setValColorCircleOutline(r1)
            float r1 = r4.getValSegmentScale()
            r3.setValSegmentScale(r1)
            float r1 = r4.getValLength()
            r3.setValLength(r1)
            int r1 = r4.getValThickness()
            r3.setValThickness(r1)
            float r1 = r4._localAngle
            r3._localAngle = r1
            int r1 = r4._curveRadius
            r3._curveRadius = r1
            float r1 = r4.getValTrapezoidThickness1()
            r3.setValTrapezoidThickness1(r1)
            float r1 = r4.getValTrapezoidThickness2()
            r3.setValTrapezoidThickness2(r1)
            boolean r4 = r4.getValIsSmartStretch()
            if (r4 == 0) goto Lb8
            r3.applySmartStretchToChildren()
        Lb8:
            r3.applySmartStretchToJoinedSprites()
            int r4 = r3._curveRadius
            if (r0 == r4) goto Le3
            boolean r4 = r3.isPolyfillAnchor()
            if (r4 == 0) goto Lc8
            r3.polyfillOnCurveChange(r3)
        Lc8:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r3._polyAnchorParentRefs
            if (r4 == 0) goto Le3
            r4 = 0
        Lcd:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._polyAnchorParentRefs
            int r0 = r0.size()
            if (r4 >= r0) goto Le3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._polyAnchorParentRefs
            java.lang.Object r0 = r0.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.polyfillOnCurveChange(r3)
            int r4 = r4 + 1
            goto Lcd
        Le3:
            return
    }

    public void interpolate(org.fortheloss.sticknodes.stickfigure.StickNode r19, org.fortheloss.sticknodes.stickfigure.StickNode r20, float r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r0._curveRadius
            boolean r5 = r1.mIsDragLocked
            if (r5 != 0) goto L15
            boolean r5 = r2.mIsDragLocked
            if (r5 == 0) goto L13
            goto L15
        L13:
            r5 = 0
            goto L16
        L15:
            r5 = 1
        L16:
            r0.mIsDragLocked = r5
            float r5 = r1.mAngleLockOffset
            float r8 = r2.mAngleLockOffset
            float r8 = r8 - r5
            r9 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r9
            r10 = 1141309440(0x44070000, float:540.0)
            float r8 = r8 + r10
            float r8 = r8 % r9
            r11 = 1127481344(0x43340000, float:180.0)
            float r8 = r8 - r11
            float r8 = r8 * r3
            float r5 = r5 + r8
            r0.mAngleLockOffset = r5
            float r5 = r1.mDragLockAngle
            float r8 = r2.mDragLockAngle
            float r8 = r8 - r5
            float r8 = r8 % r9
            float r8 = r8 + r10
            float r8 = r8 % r9
            float r8 = r8 - r11
            float r8 = r8 * r3
            float r5 = r5 + r8
            r0.mDragLockAngle = r5
            boolean r5 = r19.getValUseSegmentScale()
            if (r5 != 0) goto L49
            boolean r5 = r20.getValUseSegmentScale()
            if (r5 == 0) goto L47
            goto L49
        L47:
            r5 = 0
            goto L4a
        L49:
            r5 = 1
        L4a:
            r0.setValUseSegmentScale(r5)
            boolean r5 = r19.getValSegmentCurveCirculization()
            if (r5 != 0) goto L5c
            boolean r5 = r20.getValSegmentCurveCirculization()
            if (r5 == 0) goto L5a
            goto L5c
        L5a:
            r5 = 0
            goto L5d
        L5c:
            r5 = 1
        L5d:
            r0.setValSegmentCurveCirculization(r5)
            float r5 = r19.getValTrapezoidRatio()
            r0.setValTrapezoidRatio(r5)
            boolean r5 = r19.getValTrapezoidIsRounded1()
            if (r5 != 0) goto L76
            boolean r5 = r20.getValTrapezoidIsRounded1()
            if (r5 == 0) goto L74
            goto L76
        L74:
            r5 = 0
            goto L77
        L76:
            r5 = 1
        L77:
            r0.setValTrapezoidIsRounded1(r5)
            boolean r5 = r19.getValTrapezoidIsRounded2()
            if (r5 != 0) goto L89
            boolean r5 = r20.getValTrapezoidIsRounded2()
            if (r5 == 0) goto L87
            goto L89
        L87:
            r5 = 0
            goto L8a
        L89:
            r5 = 1
        L8a:
            r0.setValTrapezoidIsRounded2(r5)
            short r5 = r19.getValGradientMode()
            r0.setValGradientMode(r5)
            short r5 = r19.getValSegmentCurvePolyfillPrecision()
            r0.setValSegmentCurvePolyfillPrecision(r5)
            if (r22 != 0) goto Lba
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorSegment()
            r0.setValColorSegment(r5)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorGradient()
            r0.setValColorGradient(r5)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorPolyfill()
            r0.setValColorPolyfill(r5)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorCircleOutline()
            r0.setValColorCircleOutline(r5)
            goto Lf6
        Lba:
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorSegment()
            com.badlogic.gdx.graphics.Color r5 = r0.setValColorSegment(r5)
            com.badlogic.gdx.graphics.Color r8 = r20.getValColorSegment()
            r5.lerp(r8, r3)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorGradient()
            com.badlogic.gdx.graphics.Color r5 = r0.setValColorGradient(r5)
            com.badlogic.gdx.graphics.Color r8 = r20.getValColorGradient()
            r5.lerp(r8, r3)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorPolyfill()
            com.badlogic.gdx.graphics.Color r5 = r0.setValColorPolyfill(r5)
            com.badlogic.gdx.graphics.Color r8 = r20.getValColorPolyfill()
            r5.lerp(r8, r3)
            com.badlogic.gdx.graphics.Color r5 = r19.getValColorCircleOutline()
            com.badlogic.gdx.graphics.Color r5 = r0.setValColorCircleOutline(r5)
            com.badlogic.gdx.graphics.Color r8 = r20.getValColorCircleOutline()
            r5.lerp(r8, r3)
        Lf6:
            float r5 = r18.getValSegmentScale()
            float r8 = r18.getValLength()
            float r12 = r0._localAngle
            float r13 = r19.getValSegmentScale()
            float r14 = r20.getValSegmentScale()
            float r15 = r19.getValSegmentScale()
            float r14 = r14 - r15
            float r14 = r14 * r3
            float r13 = r13 + r14
            r0.setValSegmentScale(r13)
            int r13 = r19.getValThickness()
            float r13 = (float) r13
            int r14 = r20.getValThickness()
            int r15 = r19.getValThickness()
            int r14 = r14 - r15
            float r14 = (float) r14
            float r14 = r14 * r3
            float r13 = r13 + r14
            int r13 = java.lang.Math.round(r13)
            r0.setValThickness(r13)
            boolean r13 = r19.getValIsFloaty()
            if (r13 != 0) goto L13a
            boolean r13 = r1.mIsDragLocked
            if (r13 == 0) goto L1e7
            boolean r13 = r2.mIsDragLocked
            if (r13 == 0) goto L1e7
        L13a:
            boolean r13 = r19.getValIsAngleLocked()
            if (r13 != 0) goto L1e7
            boolean r13 = r19.getValIsStretchy()
            if (r13 == 0) goto L1e7
            org.fortheloss.sticknodes.stickfigure.Stickfigure r13 = r0._stickfigureRef
            float r13 = r13.getScale()
            boolean r14 = r18.getValUseSegmentScale()
            if (r14 == 0) goto L157
            float r14 = r18.getValSegmentScale()
            goto L159
        L157:
            r14 = 1065353216(0x3f800000, float:1.0)
        L159:
            float r13 = r13 * r14
            float r14 = r19.getX()
            float r15 = r20.getX()
            float r16 = r19.getX()
            float r15 = r15 - r16
            float r15 = r15 * r3
            float r14 = r14 + r15
            float r15 = r19.getY()
            float r16 = r20.getY()
            float r17 = r19.getY()
            float r16 = r16 - r17
            float r16 = r16 * r3
            float r15 = r15 + r16
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r1._parentNodeRef
            float r6 = r6.getX()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r2._parentNodeRef
            float r7 = r7.getX()
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r1._parentNodeRef
            float r11 = r11.getX()
            float r7 = r7 - r11
            float r7 = r7 * r3
            float r6 = r6 + r7
            float r14 = r14 - r6
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r1._parentNodeRef
            float r6 = r6.getY()
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r2._parentNodeRef
            float r7 = r7.getY()
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r1._parentNodeRef
            float r11 = r11.getY()
            float r7 = r7 - r11
            float r7 = r7 * r3
            float r6 = r6 + r7
            float r15 = r15 - r6
            float r6 = r14 * r14
            float r7 = r15 * r15
            float r6 = r6 + r7
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            float r6 = r6 / r13
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 / r7
            r0.setValLength(r6)
            float r6 = com.badlogic.gdx.math.MathUtils.atan2(r15, r14)
            r7 = 1113927392(0x42652ee0, float:57.295776)
            float r6 = r6 * r7
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r1._parentNodeRef
            float r7 = r7.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = r2._parentNodeRef
            float r11 = r11.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r13 = r1._parentNodeRef
            float r13 = r13.getAngle()
            float r11 = r11 - r13
            float r11 = r11 % r9
            float r11 = r11 + r10
            float r11 = r11 % r9
            r9 = 1127481344(0x43340000, float:180.0)
            float r11 = r11 - r9
            float r11 = r11 * r3
            float r7 = r7 + r11
            float r6 = r6 - r7
            r0._localAngle = r6
            goto L20a
        L1e7:
            float r6 = r19.getValLength()
            float r7 = r20.getValLength()
            float r11 = r19.getValLength()
            float r7 = r7 - r11
            float r7 = r7 * r3
            float r6 = r6 + r7
            r0.setValLength(r6)
            float r6 = r1._localAngle
            float r7 = r2._localAngle
            float r7 = r7 - r6
            float r7 = r7 % r9
            float r7 = r7 + r10
            float r7 = r7 % r9
            r9 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 - r9
            float r7 = r7 * r3
            float r6 = r6 + r7
            r0._localAngle = r6
        L20a:
            int r6 = r1._curveRadius
            float r7 = (float) r6
            int r9 = r2._curveRadius
            int r9 = r9 - r6
            float r9 = (float) r9
            float r9 = r9 * r3
            float r7 = r7 + r9
            int r7 = java.lang.Math.round(r7)
            r0._curveRadius = r7
            if (r7 != 0) goto L22c
            int r7 = r18.getLimbType()
            r9 = 6
            if (r7 != r9) goto L22c
            if (r6 == 0) goto L22c
            int r6 = r2._curveRadius
            if (r6 == 0) goto L22c
            r6 = 1
            r0._curveRadius = r6
        L22c:
            float r6 = r19.getValTrapezoidThickness1()
            float r7 = r20.getValTrapezoidThickness1()
            float r9 = r19.getValTrapezoidThickness1()
            float r7 = r7 - r9
            float r7 = r7 * r3
            float r6 = r6 + r7
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            r0.setValTrapezoidThickness1(r6)
            float r6 = r19.getValTrapezoidThickness2()
            float r2 = r20.getValTrapezoidThickness2()
            float r7 = r19.getValTrapezoidThickness2()
            float r2 = r2 - r7
            float r2 = r2 * r3
            float r6 = r6 + r2
            int r2 = java.lang.Math.round(r6)
            float r2 = (float) r2
            r0.setValTrapezoidThickness2(r2)
            float r2 = r0._localAngle
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L278
            float r2 = r18.getValLength()
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L278
            float r2 = r18.getValSegmentScale()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L278
            boolean r2 = r18.isJoinAnchor()
            if (r2 == 0) goto L27b
        L278:
            r18.flagPositionAsDirty()
        L27b:
            boolean r1 = r19.getValIsSmartStretch()
            if (r1 == 0) goto L284
            r18.applySmartStretchToChildren()
        L284:
            r18.applySmartStretchToJoinedSprites()
            int r1 = r0._curveRadius
            if (r4 == r1) goto L2af
            boolean r1 = r18.isPolyfillAnchor()
            if (r1 == 0) goto L294
            r0.polyfillOnCurveChange(r0)
        L294:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._polyAnchorParentRefs
            if (r1 == 0) goto L2af
            r6 = 0
        L299:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._polyAnchorParentRefs
            int r1 = r1.size()
            if (r6 >= r1) goto L2af
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r0._polyAnchorParentRefs
            java.lang.Object r1 = r1.get(r6)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.polyfillOnCurveChange(r0)
            int r6 = r6 + 1
            goto L299
        L2af:
            return
    }

    public boolean isConnectorParent() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Connector r0 = r1.mConnectorChildRef
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isFloaty() {
            r1 = this;
            boolean r0 = r1.getValIsFloaty()
            return r0
    }

    public boolean isHalfArc() {
            r1 = this;
            boolean r0 = r1.getValHalfArc()
            return r0
    }

    public boolean isJoinAnchor() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // org.fortheloss.sticknodes.stickfigure.INode
    public boolean isMainNode() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._parentNodeRef
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isPolyfillAnchor() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polynodeChildrenRefs
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isPolynodeInPolyfill() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyAnchorParentRefs
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isReversedGradient() {
            r1 = this;
            boolean r0 = r1.mGradientReversed
            return r0
    }

    public boolean isSmartStretch() {
            r1 = this;
            boolean r0 = r1.getValIsSmartStretch()
            return r0
    }

    public boolean isStatic() {
            r1 = this;
            boolean r0 = r1.getValIsStatic()
            return r0
    }

    public boolean isStretchy() {
            r1 = this;
            boolean r0 = r1.getValIsStretchy()
            return r0
    }

    public boolean isUsingCircleOutline() {
            r1 = this;
            boolean r0 = r1.getValUseCircleOutline()
            return r0
    }

    public boolean isUsingGradient() {
            r1 = this;
            boolean r0 = r1.getValUseGradient()
            return r0
    }

    public boolean isUsingPolyfillColor() {
            r1 = this;
            boolean r0 = r1.getValUsePolyfillColor()
            return r0
    }

    public boolean isUsingSegmentColor() {
            r1 = this;
            boolean r0 = r1.getValUseSegmentColor()
            return r0
    }

    public boolean isUsingSegmentScale() {
            r1 = this;
            boolean r0 = r1.getValUseSegmentScale()
            return r0
    }

    public void polyfillAnchorInsertBetween(org.fortheloss.sticknodes.stickfigure.StickNode r6, org.fortheloss.sticknodes.stickfigure.StickNode r7, org.fortheloss.sticknodes.stickfigure.StickNode r8) {
            r5 = this;
            boolean r0 = r5.isPolyfillAnchor()
            if (r0 == 0) goto L5f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._polynodeChildrenRefs
            int r0 = r0.size()
            r1 = r0
        Ld:
            if (r1 < 0) goto L5e
            if (r1 != r0) goto L13
            r2 = r5
            goto L1b
        L13:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r5._polynodeChildrenRefs
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
        L1b:
            if (r1 <= 0) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r5._polynodeChildrenRefs
            int r4 = r1 + (-1)
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            goto L29
        L28:
            r3 = r5
        L29:
            if (r2 == r6) goto L2d
            if (r2 != r7) goto L32
        L2d:
            if (r3 == r6) goto L35
            if (r3 != r7) goto L32
            goto L35
        L32:
            int r1 = r1 + (-1)
            goto Ld
        L35:
            if (r8 == r6) goto L58
            if (r8 == r7) goto L58
            if (r2 != r6) goto L44
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._polynodeChildrenRefs
            int r3 = r1 + 1
            r0.add(r1, r8)
            r1 = r3
            goto L49
        L44:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._polynodeChildrenRefs
            r0.add(r1, r8)
        L49:
            r8.addPolyAnchorParent(r5)
            java.util.ArrayList r8 = r8.getChildrenNodes()
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = (org.fortheloss.sticknodes.stickfigure.StickNode) r8
            goto L35
        L58:
            r5.analyzePolyfillForCompleteChildren()
            r6 = 0
            r5._triangulatedPolynodeChildrenDrawOrder = r6
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't insert polynode from a node that isn't a polyfill anchor."
            r6.<init>(r7)
            throw r6
    }

    public void polyfillAnchorPushPolynodeOrder(org.fortheloss.sticknodes.stickfigure.StickNode r4, int r5) {
            r3 = this;
            boolean r0 = r3.isPolyfillAnchor()
            if (r0 == 0) goto L3d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._polynodeChildrenRefs
            int r0 = r0.size()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3._polynodeChildrenRefs
            int r1 = r1.indexOf(r4)
            if (r1 < 0) goto L3c
            r2 = 1
            if (r5 != r2) goto L26
            int r0 = r0 - r2
            if (r1 >= r0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r3._polynodeChildrenRefs
            r5.remove(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r3._polynodeChildrenRefs
            int r1 = r1 + r2
            r5.add(r1, r4)
            goto L36
        L26:
            r0 = -1
            if (r5 != r0) goto L36
            if (r1 <= 0) goto L36
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r3._polynodeChildrenRefs
            r5.remove(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r3._polynodeChildrenRefs
            int r1 = r1 - r2
            r5.add(r1, r4)
        L36:
            r3.analyzePolyfillForCompleteChildren()
            r4 = 0
            r3._triangulatedPolynodeChildrenDrawOrder = r4
        L3c:
            return
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Can't adjust polynodes of a node that isn't a polyfill anchor."
            r4.<init>(r5)
            throw r4
    }

    public void polyfillSetPolynodesOrder(java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r7) {
            r6 = this;
            boolean r0 = r6.isPolyfillAnchor()
            if (r0 == 0) goto L4f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6._polynodeChildrenRefs
            int r0 = r0.size()
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L4e
            int r1 = r7.size()
            if (r0 == r1) goto L19
            goto L4e
        L19:
            r1 = 0
            r2 = 0
        L1b:
            if (r2 >= r0) goto L48
            java.lang.Object r3 = r7.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r4 = 0
        L24:
            if (r4 >= r0) goto L45
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r6._polynodeChildrenRefs
            java.lang.Object r5 = r5.get(r4)
            if (r5 != r3) goto L42
            if (r4 == r2) goto L45
            if (r4 >= r2) goto L35
            int r3 = r2 + (-1)
            goto L36
        L35:
            r3 = r2
        L36:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r6._polynodeChildrenRefs
            java.lang.Object r4 = r5.remove(r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r5.add(r3, r4)
            goto L45
        L42:
            int r4 = r4 + 1
            goto L24
        L45:
            int r2 = r2 + 1
            goto L1b
        L48:
            r6.analyzePolyfillForCompleteChildren()
            r7 = 0
            r6._triangulatedPolynodeChildrenDrawOrder = r7
        L4e:
            return
        L4f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't adjust polynodes of a node that isn't a polyfill anchor."
            r7.<init>(r0)
            throw r7
    }

    public void polynodeOnSegmentTypeChange() {
            r2 = this;
            boolean r0 = r2.isPolynodeInPolyfill()
            if (r0 == 0) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyAnchorParentRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Le:
            if (r0 < 0) goto L1e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._polyAnchorParentRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.analyzePolyfillForCompleteChildren()
            int r0 = r0 + (-1)
            goto Le
        L1e:
            boolean r0 = r2.isPolyfillAnchor()
            if (r0 == 0) goto L27
            r2.analyzePolyfillForCompleteChildren()
        L27:
            return
    }

    public void putAllIntoDrawOrderArray(java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5) {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        Lb:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L3b
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            int r2 = r1.getDrawOrderIndex()
            r5.add(r2, r1)
            int r2 = r2 + 1
            r5.remove(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L2b:
            if (r2 < 0) goto Lb
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L2b
        L3b:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    protected void readData(int r17, int r18, java.io.DataInputStream r19) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            byte r3 = r19.readByte()
            int r3 = r0.setValLimbType(r3)
            int r4 = r19.readInt()
            r0.setValDrawOrderIndex(r4)
            int r4 = r19.read()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            r0.setValIsStatic(r4)
            int r4 = r19.read()
            if (r4 == 0) goto L2b
            r4 = 1
            goto L2c
        L2b:
            r4 = 0
        L2c:
            r0.setValIsStretchy(r4)
            r4 = 48
            if (r2 < r4) goto L3b
            int r4 = r19.read()
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            r0.setValIsFloaty(r4)
            r4 = 248(0xf8, float:3.48E-43)
            if (r1 < r4) goto L4b
            int r7 = r19.read()
            if (r7 == 0) goto L4b
            r7 = 1
            goto L4c
        L4b:
            r7 = 0
        L4c:
            r0.setValIsSmartStretch(r7)
            r7 = 252(0xfc, float:3.53E-43)
            if (r1 < r7) goto L5b
            int r7 = r19.read()
            if (r7 == 0) goto L5b
            r7 = 1
            goto L5c
        L5b:
            r7 = 0
        L5c:
            r0.setValSmartStretchDoNotApply(r7)
            r7 = 50
            if (r2 < r7) goto L6b
            int r8 = r19.read()
            if (r8 == 0) goto L6b
            r8 = 1
            goto L6c
        L6b:
            r8 = 0
        L6c:
            r0.setValSmartStretchResetImpulse(r8)
            int r8 = r19.read()
            if (r8 == 0) goto L77
            r8 = 1
            goto L78
        L77:
            r8 = 0
        L78:
            r0.setValUseSegmentColor(r8)
            r8 = 256(0x100, float:3.59E-43)
            if (r1 < r8) goto L87
            int r9 = r19.read()
            if (r9 == 0) goto L87
            r9 = 1
            goto L88
        L87:
            r9 = 0
        L88:
            r0.setValUseCircleOutline(r9)
            r9 = 21
            if (r2 < r9) goto L97
            int r10 = r19.read()
            if (r10 == 0) goto L97
            r10 = 1
            goto L98
        L97:
            r10 = 0
        L98:
            r0.setValCircleIsHollow(r10)
            r10 = 176(0xb0, float:2.47E-43)
            if (r1 < r10) goto La7
            int r11 = r19.read()
            if (r11 == 0) goto La7
            r11 = 1
            goto La8
        La7:
            r11 = 0
        La8:
            r0.setValUseGradient(r11)
            if (r1 < r10) goto Lb5
            int r11 = r19.read()
            if (r11 == 0) goto Lb5
            r11 = 1
            goto Lb6
        Lb5:
            r11 = 0
        Lb6:
            r0.mGradientReversed = r11
            r11 = 82
            r12 = 5
            r13 = 20
            r14 = 2
            if (r2 < r11) goto Lc8
            short r3 = r19.readShort()
            r0.setValGradientMode(r3)
            goto Ld8
        Lc8:
            if (r2 < r13) goto Lcf
            short r11 = r19.readShort()
            goto Ld0
        Lcf:
            r11 = 1
        Ld0:
            if (r3 == r14) goto Ld4
            if (r3 != r12) goto Ld5
        Ld4:
            r11 = 2
        Ld5:
            r0.setValGradientMode(r11)
        Ld8:
            int r3 = r19.read()
            if (r3 == 0) goto Le0
            r3 = 1
            goto Le1
        Le0:
            r3 = 0
        Le1:
            r0.setValUseSegmentScale(r3)
            float r3 = r19.readFloat()
            r0._localX = r3
            float r3 = r19.readFloat()
            r0._localY = r3
            float r3 = r19.readFloat()
            r0.setValSegmentScale(r3)
            float r3 = r19.readFloat()
            r0.setValDefaultLength(r3)
            float r3 = r19.readFloat()
            r0.setValLength(r3)
            int r3 = r19.readInt()
            r0.setValDefaultThickness(r3)
            int r3 = r19.readInt()
            r0.setValThickness(r3)
            r3 = 320(0x140, float:4.48E-43)
            if (r1 < r3) goto L11c
            int r3 = r19.readInt()
            goto L11d
        L11c:
            r3 = 0
        L11d:
            r0._curveRadius = r3
            r0._defaultCurveRadius = r3
            r3 = 420(0x1a4, float:5.89E-43)
            if (r1 >= r3) goto L135
            int r3 = r16.getValLimbType()
            if (r3 == r5) goto L135
            int r3 = r16.getValLimbType()
            if (r3 == 0) goto L135
            r0._curveRadius = r6
            r0._defaultCurveRadius = r6
        L135:
            if (r2 < r13) goto L13f
            int r3 = r19.read()
            if (r3 == 0) goto L13f
            r3 = 1
            goto L140
        L13f:
            r3 = 0
        L140:
            r0.setValSegmentCurveCirculization(r3)
            if (r2 < r9) goto L14a
            short r3 = r19.readShort()
            goto L14b
        L14a:
            r3 = 1
        L14b:
            r0.setValSegmentCurvePolyfillPrecision(r3)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 36
            if (r1 < r8) goto L210
            int r12 = r19.read()
            if (r12 == 0) goto L15c
            r12 = 1
            goto L15d
        L15c:
            r12 = 0
        L15d:
            r0.setValHalfArc(r12)
            short r12 = r19.readShort()
            r0._rightTriangleDirection = r12
            r12 = 300(0x12c, float:4.2E-43)
            if (r1 < r12) goto L172
            int r12 = r19.read()
            if (r12 == 0) goto L172
            r12 = 1
            goto L173
        L172:
            r12 = 0
        L173:
            r0.setValTriangleUpsideDown(r12)
            if (r2 < r11) goto L1ea
            r12 = 64
            if (r2 >= r12) goto L182
            int r13 = r19.readInt()
            float r13 = (float) r13
            goto L186
        L182:
            float r13 = r19.readFloat()
        L186:
            r0.setValTrapezoidThickness1(r13)
            if (r2 >= r12) goto L191
            int r12 = r19.readInt()
            float r12 = (float) r12
            goto L195
        L191:
            float r12 = r19.readFloat()
        L195:
            r0.setValTrapezoidThickness2(r12)
            if (r2 != r11) goto L1ca
            r19.readInt()
            r19.readInt()
            int r12 = r19.read()
            if (r12 == 0) goto L1a8
            r12 = 1
            goto L1a9
        L1a8:
            r12 = 0
        L1a9:
            int r13 = r19.read()
            if (r13 == 0) goto L1b1
            r13 = 1
            goto L1b2
        L1b1:
            r13 = 0
        L1b2:
            if (r12 != 0) goto L1bc
            int r12 = r16.getValThickness()
            float r12 = (float) r12
            r0.setValTrapezoidThickness1(r12)
        L1bc:
            if (r13 != 0) goto L1c6
            int r12 = r16.getValThickness()
            float r12 = (float) r12
            r0.setValTrapezoidThickness2(r12)
        L1c6:
            r0.setValTrapezoidRatio(r3)
            goto L1d1
        L1ca:
            float r3 = r19.readFloat()
            r0.setValTrapezoidRatio(r3)
        L1d1:
            int r3 = r19.read()
            if (r3 == 0) goto L1d9
            r3 = 1
            goto L1da
        L1d9:
            r3 = 0
        L1da:
            r0.setValTrapezoidIsRounded1(r3)
            int r3 = r19.read()
            if (r3 == 0) goto L1e5
            r3 = 1
            goto L1e6
        L1e5:
            r3 = 0
        L1e6:
            r0.setValTrapezoidIsRounded2(r3)
            goto L208
        L1ea:
            float r3 = r19.readFloat()
            int r12 = r16.getValThickness()
            float r12 = (float) r12
            r0.setValTrapezoidThickness1(r12)
            int r12 = r16.getValThickness()
            float r12 = (float) r12
            float r12 = r12 * r3
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            r0.setValTrapezoidThickness2(r12)
            r0.setValTrapezoidRatio(r3)
        L208:
            short r3 = r19.readShort()
            r0.setValNumPolygonVertices(r3)
            goto L22e
        L210:
            r0.setValHalfArc(r6)
            r0._rightTriangleDirection = r6
            r0.setValTriangleUpsideDown(r6)
            r13 = 1107296256(0x42000000, float:32.0)
            r0.setValTrapezoidThickness1(r13)
            r13 = 1098907648(0x41800000, float:16.0)
            r0.setValTrapezoidThickness2(r13)
            r0.setValTrapezoidRatio(r3)
            r0.setValTrapezoidIsRounded1(r6)
            r0.setValTrapezoidIsRounded2(r6)
            r0.setValNumPolygonVertices(r12)
        L22e:
            if (r1 < r4) goto L235
            float r12 = r19.readFloat()
            goto L236
        L235:
            r12 = 0
        L236:
            r0._defaultLocalAngle = r12
            float r12 = r19.readFloat()
            r0._localAngle = r12
            if (r1 < r4) goto L245
            float r4 = r19.readFloat()
            goto L246
        L245:
            r4 = 0
        L246:
            r0._defaultAngle = r4
            int r4 = r19.readInt()
            r12 = r4 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 / r13
            int r15 = r4 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r13
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r13
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.setValColorSegment(r12, r15, r4, r7)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r1 < r10) goto L27f
            int r10 = r19.readInt()
            r12 = r10 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r15 = r10 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r13
            int r10 = r10 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r13
            r0.setValColorGradient(r12, r15, r10, r7)
            goto L282
        L27f:
            r0.setValColorGradient(r4, r4, r4, r7)
        L282:
            boolean r10 = r16.getValUseSegmentColor()
            boolean r12 = r16.getValUseGradient()
            if (r2 >= r9) goto L2c3
            int r9 = r16.getValLimbType()
            r15 = 6
            if (r9 != r15) goto L2c3
            if (r12 == 0) goto L2c3
            boolean r9 = r0.mGradientReversed
            if (r9 == 0) goto L29c
            r0.mGradientReversed = r6
            goto L2c3
        L29c:
            if (r10 != 0) goto L2a1
            r0.mGradientReversed = r5
            goto L2c3
        L2a1:
            com.badlogic.gdx.graphics.Color r9 = r16.getValColorSegment()
            int r9 = r9.toIntBits()
            com.badlogic.gdx.graphics.Color r15 = r16.getValColorGradient()
            r0.setValColorSegment(r15)
            r15 = r9 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r13
            int r3 = r9 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r13
            int r9 = r9 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r13
            r0.setValColorGradient(r15, r3, r9, r7)
        L2c3:
            if (r2 >= r11) goto L2fc
            int r3 = r16.getValLimbType()
            r9 = 3
            if (r3 != r9) goto L2fc
            if (r12 == 0) goto L2fc
            boolean r3 = r0.mGradientReversed
            if (r3 == 0) goto L2d5
            r0.mGradientReversed = r6
            goto L2fc
        L2d5:
            if (r10 != 0) goto L2da
            r0.mGradientReversed = r5
            goto L2fc
        L2da:
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorSegment()
            int r3 = r3.toIntBits()
            com.badlogic.gdx.graphics.Color r9 = r16.getValColorGradient()
            r0.setValColorSegment(r9)
            r9 = r3 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r13
            int r11 = r3 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            float r11 = (float) r11
            float r11 = r11 / r13
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r13
            r0.setValColorGradient(r9, r11, r3, r7)
        L2fc:
            if (r1 < r8) goto L316
            int r1 = r19.readInt()
            r3 = r1 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r13
            int r4 = r1 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r13
            int r1 = r1 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r13
            r0.setValColorCircleOutline(r3, r4, r1, r7)
            goto L356
        L316:
            int r1 = r16.getValLimbType()
            if (r1 != r14) goto L353
            if (r12 == 0) goto L353
            r0.setValUseCircleOutline(r5)
            boolean r1 = r0.mGradientReversed
            if (r1 != 0) goto L345
            if (r10 == 0) goto L32f
            com.badlogic.gdx.graphics.Color r1 = r16.getValColorSegment()
            r0.setValColorCircleOutline(r1)
            goto L338
        L32f:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigureRef
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setValColorCircleOutline(r1)
        L338:
            boolean r1 = r0.setValUseSegmentColor(r5)
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorGradient()
            r0.setValColorSegment(r3)
            r10 = r1
            goto L34c
        L345:
            com.badlogic.gdx.graphics.Color r1 = r16.getValColorGradient()
            r0.setValColorCircleOutline(r1)
        L34c:
            r0.setValUseGradient(r6)
            r0.setValColorGradient(r4, r4, r4, r7)
            goto L356
        L353:
            r0.setValColorCircleOutline(r4, r4, r4, r7)
        L356:
            int r1 = r16.getValLimbType()
            r3 = 4
            if (r1 != r3) goto L381
            r0.setValLimbType(r14)
            if (r10 == 0) goto L36a
            com.badlogic.gdx.graphics.Color r1 = r16.getValColorSegment()
            r0.setValColorCircleOutline(r1)
            goto L373
        L36a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigureRef
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setValColorCircleOutline(r1)
        L373:
            r0.setValUseCircleOutline(r5)
            r0.setValUseGradient(r6)
            r0.setValUseSegmentColor(r5)
            r0.setValColorSegment(r7, r7, r7, r7)
            r0._filledCircleIntoCircleFlag = r5
        L381:
            r16.updateColorReferences()
            r1 = 39
            if (r2 != r1) goto L3aa
            int r1 = r19.read()
            if (r1 == 0) goto L390
            r1 = 1
            goto L391
        L390:
            r1 = 0
        L391:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r1 = 0
            r0.mAngleLockOffset = r1
            r0.setValIsAngleLocked(r6)
            short r1 = r19.readShort()
            if (r1 == 0) goto L3a5
            r3 = 1
            goto L3a6
        L3a5:
            r3 = 0
        L3a6:
            r0.mIsDragLocked = r3
            goto L4e1
        L3aa:
            r1 = 40
            if (r2 != r1) goto L3d0
            int r1 = r19.read()
            if (r1 == 0) goto L3b6
            r1 = 1
            goto L3b7
        L3b6:
            r1 = 0
        L3b7:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r1 = 0
            r0.mAngleLockOffset = r1
            r0.setValIsAngleLocked(r6)
            short r1 = r19.readShort()
            if (r1 == 0) goto L3cb
            r3 = 1
            goto L3cc
        L3cb:
            r3 = 0
        L3cc:
            r0.mIsDragLocked = r3
            goto L4e1
        L3d0:
            r1 = 41
            if (r2 < r1) goto L406
            r1 = 45
            if (r2 > r1) goto L406
            int r1 = r19.read()
            if (r1 == 0) goto L3e0
            r1 = 1
            goto L3e1
        L3e0:
            r1 = 0
        L3e1:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r1 = 0
            r0.mAngleLockOffset = r1
            r0.setValIsAngleLocked(r6)
            int r1 = r19.read()
            if (r1 == 0) goto L3f4
            goto L3f5
        L3f4:
            r5 = 0
        L3f5:
            r0.mIsDragLocked = r5
            r19.readShort()
            float r1 = r19.readFloat()
            r0.setValSmartStretchMultiplier(r1)
            r19.read()
            goto L4e1
        L406:
            r1 = 46
            if (r2 < r1) goto L43c
            r1 = 50
            if (r2 > r1) goto L43c
            int r1 = r19.read()
            if (r1 == 0) goto L416
            r1 = 1
            goto L417
        L416:
            r1 = 0
        L417:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r1 = 0
            r0.mAngleLockOffset = r1
            r0.setValIsAngleLocked(r6)
            int r1 = r19.read()
            if (r1 == 0) goto L42a
            goto L42b
        L42a:
            r5 = 0
        L42b:
            r0.mIsDragLocked = r5
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            float r1 = r19.readFloat()
            r0.setValSmartStretchMultiplier(r1)
            goto L4e1
        L43c:
            r1 = 51
            r3 = 56
            if (r2 < r1) goto L484
            if (r2 > r3) goto L484
            int r1 = r19.read()
            if (r1 == 0) goto L44c
            r1 = 1
            goto L44d
        L44c:
            r1 = 0
        L44d:
            r0.setValIsAngleLocked(r1)
            int r1 = r19.read()
            if (r2 >= r3) goto L459
            if (r1 != 0) goto L45d
            goto L45b
        L459:
            if (r1 == 0) goto L45d
        L45b:
            r1 = 1
            goto L45e
        L45d:
            r1 = 0
        L45e:
            r0.setValAngleLockIsMainNode(r1)
            float r1 = r19.readFloat()
            float r3 = r19.readFloat()
            float r1 = r1 - r3
            r0.mAngleLockOffset = r1
            int r1 = r19.read()
            if (r1 == 0) goto L473
            goto L474
        L473:
            r5 = 0
        L474:
            r0.mIsDragLocked = r5
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            float r1 = r19.readFloat()
            r0.setValSmartStretchMultiplier(r1)
            goto L4e1
        L484:
            r1 = 57
            if (r2 < r1) goto L4e1
            int r1 = r19.read()
            if (r1 == 0) goto L490
            r1 = 1
            goto L491
        L490:
            r1 = 0
        L491:
            r0.setValIsAngleLocked(r1)
            int r1 = r19.read()
            if (r2 >= r3) goto L49d
            if (r1 != 0) goto L4a1
            goto L49f
        L49d:
            if (r1 == 0) goto L4a1
        L49f:
            r1 = 1
            goto L4a2
        L4a1:
            r1 = 0
        L4a2:
            r0.setValAngleLockIsMainNode(r1)
            float r1 = r19.readFloat()
            r0.mAngleLockOffset = r1
            r1 = 63
            if (r2 < r1) goto L4b6
            float r3 = r19.readFloat()
            r0.setValAngleLockRelativeStart(r3)
        L4b6:
            r3 = 67
            if (r2 < r3) goto L4c1
            float r3 = r19.readFloat()
            r0.setValAngleLockStickfigureStart(r3)
        L4c1:
            if (r2 < r1) goto L4ca
            byte r1 = r19.readByte()
            r0.setValAngleLockRelativeMultiplier(r1)
        L4ca:
            int r1 = r19.read()
            if (r1 == 0) goto L4d1
            goto L4d2
        L4d1:
            r5 = 0
        L4d2:
            r0.mIsDragLocked = r5
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            float r1 = r19.readFloat()
            r0.setValSmartStretchMultiplier(r1)
        L4e1:
            int r1 = r19.readInt()
            r3 = 38
            if (r2 < r3) goto L50a
        L4e9:
            if (r6 >= r1) goto L51b
            int r2 = r19.readInt()
            if (r2 != 0) goto L4f9
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r2 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            r2.<init>(r3, r0)
            goto L502
        L4f9:
            org.fortheloss.sticknodes.stickfigure.ConnectorDynamic r2 = new org.fortheloss.sticknodes.stickfigure.ConnectorDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            r2.<init>(r3, r0)
            r0.mConnectorChildRef = r2
        L502:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._childrenNodes
            r3.add(r2)
            int r6 = r6 + 1
            goto L4e9
        L50a:
            if (r6 >= r1) goto L51b
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r2 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            r2.<init>(r3, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r0._childrenNodes
            r3.add(r2)
            int r6 = r6 + 1
            goto L50a
        L51b:
            return
    }

    protected void readDataOld(int r9, java.nio.ByteBuffer r10) {
            r8 = this;
            byte r9 = r10.get()
            int r9 = r8.setValLimbType(r9)
            int r0 = r10.getInt()
            r8.setValDrawOrderIndex(r0)
            byte r0 = r10.get()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r8.setValIsStatic(r0)
            byte r0 = r10.get()
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r8.setValIsStretchy(r0)
            r8.setValIsSmartStretch(r2)
            r8.setValSmartStretchDoNotApply(r2)
            byte r0 = r10.get()
            if (r0 == 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r8.setValUseSegmentColor(r0)
            r8.setValUseCircleOutline(r2)
            r8.setValCircleIsHollow(r2)
            r8.setValUseGradient(r2)
            r8.mGradientReversed = r2
            r0 = 5
            r3 = 2
            if (r9 == r3) goto L4f
            if (r9 != r0) goto L4d
            goto L4f
        L4d:
            r9 = 1
            goto L50
        L4f:
            r9 = 2
        L50:
            r8.setValGradientMode(r9)
            byte r9 = r10.get()
            if (r9 == 0) goto L5b
            r9 = 1
            goto L5c
        L5b:
            r9 = 0
        L5c:
            r8.setValUseSegmentScale(r9)
            float r9 = r10.getFloat()
            r8._localX = r9
            float r9 = r10.getFloat()
            r8._localY = r9
            float r9 = r10.getFloat()
            r8.setValSegmentScale(r9)
            float r9 = r10.getFloat()
            r8.setValDefaultLength(r9)
            float r9 = r10.getFloat()
            r8.setValLength(r9)
            int r9 = r10.getInt()
            r8.setValDefaultThickness(r9)
            int r9 = r10.getInt()
            r8.setValThickness(r9)
            r8._curveRadius = r2
            r8._defaultCurveRadius = r2
            r8.setValSegmentCurveCirculization(r2)
            r8.setValSegmentCurvePolyfillPrecision(r1)
            r8.setValHalfArc(r2)
            r8._rightTriangleDirection = r2
            r8.setValTriangleUpsideDown(r2)
            r9 = 1107296256(0x42000000, float:32.0)
            r8.setValTrapezoidThickness1(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r8.setValTrapezoidThickness2(r9)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.setValTrapezoidRatio(r9)
            r8.setValTrapezoidIsRounded1(r2)
            r8.setValTrapezoidIsRounded2(r2)
            r8.setValNumPolygonVertices(r0)
            r9 = 0
            r8._defaultLocalAngle = r9
            float r0 = r10.getFloat()
            r8._localAngle = r0
            r8._defaultAngle = r9
            int r9 = r10.getInt()
            r0 = r9 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r4 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r4
            int r5 = r9 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r4
            int r9 = r9 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r4
            r6 = 1065353216(0x3f800000, float:1.0)
            r8.setValColorSegment(r0, r5, r9, r6)
            r9 = 1056964608(0x3f000000, float:0.5)
            r8.setValColorGradient(r9, r9, r9, r6)
            r8.setValColorCircleOutline(r9, r9, r9, r6)
            boolean r9 = r8.getValUseSegmentColor()
            boolean r0 = r8.getValUseGradient()
            int r5 = r8.getValLimbType()
            r7 = 6
            if (r5 != r7) goto L125
            if (r0 == 0) goto L125
            boolean r0 = r8.mGradientReversed
            if (r0 == 0) goto Lfe
            r8.mGradientReversed = r2
            goto L125
        Lfe:
            if (r9 != 0) goto L103
            r8.mGradientReversed = r1
            goto L125
        L103:
            com.badlogic.gdx.graphics.Color r0 = r8.getValColorSegment()
            int r0 = r0.toIntBits()
            com.badlogic.gdx.graphics.Color r5 = r8.getValColorGradient()
            r8.setValColorSegment(r5)
            r5 = r0 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r4
            int r7 = r0 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r4
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r4
            r8.setValColorGradient(r5, r7, r0, r6)
        L125:
            int r0 = r8.getValLimbType()
            r4 = 4
            if (r0 != r4) goto L150
            r8.setValLimbType(r3)
            if (r9 == 0) goto L139
            com.badlogic.gdx.graphics.Color r9 = r8.getValColorSegment()
            r8.setValColorCircleOutline(r9)
            goto L142
        L139:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r8._stickfigureRef
            com.badlogic.gdx.graphics.Color r9 = r9.getColor()
            r8.setValColorCircleOutline(r9)
        L142:
            r8.setValUseCircleOutline(r1)
            r8.setValUseGradient(r2)
            r8.setValUseSegmentColor(r1)
            r8.setValColorSegment(r6, r6, r6, r6)
            r8._filledCircleIntoCircleFlag = r1
        L150:
            r8.updateColorReferences()
            int r9 = r10.getInt()
        L157:
            if (r2 >= r9) goto L168
            org.fortheloss.sticknodes.stickfigure.StickNodeDynamic r10 = new org.fortheloss.sticknodes.stickfigure.StickNodeDynamic
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r8._stickfigureRef
            r10.<init>(r0, r8)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r8._childrenNodes
            r0.add(r10)
            int r2 = r2 + 1
            goto L157
        L168:
            return
    }

    public void readPolyfillAnchorData(int r4, java.io.DataInputStream r5) throws java.io.IOException {
            r3 = this;
            r3.convertToPolyAnchor()
            int r4 = r5.readInt()
            r0 = r4 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            int r2 = r4 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setValColorPolyfill(r0, r2, r4, r1)
            int r4 = r5.read()
            r0 = 0
            if (r4 == 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            r3.setValUsePolyfillColor(r4)
            int r4 = r5.readInt()
        L2f:
            if (r0 >= r4) goto L43
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._stickfigureRef
            int r2 = r5.readInt()
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getNodeAtDrawOrderIndex(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r3.addPolynodeChild(r1)
            int r0 = r0 + 1
            goto L2f
        L43:
            r3.updateColorReferences()
            return
    }

    protected void readPositionalData(int r17, int r18, java.io.DataInputStream r19) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r16.flagPositionAsDirty()
            int r3 = r19.read()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            r0.setValIsStretchy(r3)
            r3 = 48
            if (r2 < r3) goto L23
            int r3 = r19.read()
            if (r3 == 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            r0.setValIsFloaty(r3)
            r3 = 248(0xf8, float:3.48E-43)
            if (r1 < r3) goto L3b
            r3 = 22
            if (r2 >= r3) goto L3b
            int r3 = r19.read()
            if (r3 == 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            r0.setValIsSmartStretch(r3)
        L3b:
            int r3 = r19.read()
            if (r3 == 0) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            r0.setValUseSegmentColor(r3)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 < r3) goto L53
            int r6 = r19.read()
            if (r6 == 0) goto L53
            r6 = 1
            goto L54
        L53:
            r6 = 0
        L54:
            r0.setValUseCircleOutline(r6)
            r6 = 21
            if (r2 < r6) goto L63
            int r7 = r19.read()
            if (r7 == 0) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            r0.setValCircleIsHollow(r7)
            r7 = 176(0xb0, float:2.47E-43)
            if (r1 < r7) goto L73
            int r8 = r19.read()
            if (r8 == 0) goto L73
            r8 = 1
            goto L74
        L73:
            r8 = 0
        L74:
            r0.setValUseGradient(r8)
            if (r1 < r7) goto L81
            int r8 = r19.read()
            if (r8 == 0) goto L81
            r8 = 1
            goto L82
        L81:
            r8 = 0
        L82:
            r0.mGradientReversed = r8
            r8 = 82
            r9 = 20
            r10 = 2
            if (r2 < r8) goto L93
            short r8 = r19.readShort()
            r0.setValGradientMode(r8)
            goto La8
        L93:
            if (r2 < r9) goto L9a
            short r8 = r19.readShort()
            goto L9b
        L9a:
            r8 = 1
        L9b:
            int r11 = r16.getValLimbType()
            if (r11 == r10) goto La4
            r12 = 5
            if (r11 != r12) goto La5
        La4:
            r8 = 2
        La5:
            r0.setValGradientMode(r8)
        La8:
            int r8 = r19.read()
            if (r8 == 0) goto Lb0
            r8 = 1
            goto Lb1
        Lb0:
            r8 = 0
        Lb1:
            r0.setValUseSegmentScale(r8)
            float r8 = r19.readFloat()
            r0.setValSegmentScale(r8)
            float r8 = r19.readFloat()
            r0.setValLength(r8)
            int r8 = r19.readInt()
            r0.setValThickness(r8)
            float r8 = r19.readFloat()
            r0._localAngle = r8
            r8 = 259(0x103, float:3.63E-43)
            if (r1 < r8) goto Ldf
            float r11 = r19.readFloat()
            r0._defaultLocalAngle = r11
            float r11 = r19.readFloat()
            r0._defaultAngle = r11
        Ldf:
            int r11 = r19.readInt()
            r12 = r11 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 / r13
            int r14 = r11 >> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r13
            int r11 = r11 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            float r11 = (float) r11
            float r11 = r11 / r13
            r15 = 1065353216(0x3f800000, float:1.0)
            r0.setValColorSegment(r12, r14, r11, r15)
            if (r1 < r7) goto L113
            int r7 = r19.readInt()
            r11 = r7 & 255(0xff, float:3.57E-43)
            float r11 = (float) r11
            float r11 = r11 / r13
            int r12 = r7 >> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            int r7 = r7 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r13
            r0.setValColorGradient(r11, r12, r7, r15)
        L113:
            boolean r7 = r16.getValUseSegmentColor()
            boolean r11 = r16.getValUseGradient()
            if (r2 >= r6) goto L154
            int r12 = r16.getValLimbType()
            r14 = 6
            if (r12 != r14) goto L154
            if (r11 == 0) goto L154
            boolean r12 = r0.mGradientReversed
            if (r12 == 0) goto L12d
            r0.mGradientReversed = r5
            goto L154
        L12d:
            if (r7 != 0) goto L132
            r0.mGradientReversed = r4
            goto L154
        L132:
            com.badlogic.gdx.graphics.Color r12 = r16.getValColorSegment()
            int r12 = r12.toIntBits()
            com.badlogic.gdx.graphics.Color r14 = r16.getValColorGradient()
            r0.setValColorSegment(r14)
            r14 = r12 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r13
            int r6 = r12 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r13
            int r12 = r12 >> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            r0.setValColorGradient(r14, r6, r12, r15)
        L154:
            r6 = 36
            if (r2 >= r6) goto L18f
            int r12 = r16.getValLimbType()
            r14 = 3
            if (r12 != r14) goto L18f
            if (r11 == 0) goto L18f
            boolean r12 = r0.mGradientReversed
            if (r12 == 0) goto L168
            r0.mGradientReversed = r5
            goto L18f
        L168:
            if (r7 != 0) goto L16d
            r0.mGradientReversed = r4
            goto L18f
        L16d:
            com.badlogic.gdx.graphics.Color r12 = r16.getValColorSegment()
            int r12 = r12.toIntBits()
            com.badlogic.gdx.graphics.Color r14 = r16.getValColorGradient()
            r0.setValColorSegment(r14)
            r14 = r12 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r13
            int r6 = r12 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r13
            int r12 = r12 >> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            float r12 = (float) r12
            float r12 = r12 / r13
            r0.setValColorGradient(r14, r6, r12, r15)
        L18f:
            if (r1 < r3) goto L1a9
            int r3 = r19.readInt()
            r6 = r3 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r13
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r13
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r13
            r0.setValColorCircleOutline(r6, r7, r3, r15)
            goto L211
        L1a9:
            int r3 = r16.getValLimbType()
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r10) goto L1ea
            if (r11 == 0) goto L1ea
            boolean r3 = r0._filledCircleIntoCircleFlag
            if (r3 != 0) goto L1ea
            r0.setValUseCircleOutline(r4)
            boolean r3 = r0.mGradientReversed
            if (r3 != 0) goto L1dc
            if (r7 == 0) goto L1c8
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorSegment()
            r0.setValColorCircleOutline(r3)
            goto L1d1
        L1c8:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            com.badlogic.gdx.graphics.Color r3 = r3.getColor()
            r0.setValColorCircleOutline(r3)
        L1d1:
            r0.setValUseSegmentColor(r4)
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorGradient()
            r0.setValColorSegment(r3)
            goto L1e3
        L1dc:
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorGradient()
            r0.setValColorCircleOutline(r3)
        L1e3:
            r0.setValUseGradient(r5)
            r0.setValColorGradient(r6, r6, r6, r15)
            goto L211
        L1ea:
            boolean r3 = r0._filledCircleIntoCircleFlag
            if (r3 == 0) goto L20e
            r0.setValUseCircleOutline(r4)
            if (r7 == 0) goto L1fb
            com.badlogic.gdx.graphics.Color r3 = r16.getValColorSegment()
            r0.setValColorCircleOutline(r3)
            goto L204
        L1fb:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r0._stickfigureRef
            com.badlogic.gdx.graphics.Color r3 = r3.getColor()
            r0.setValColorCircleOutline(r3)
        L204:
            r0.setValUseGradient(r5)
            r0.setValUseSegmentColor(r4)
            r0.setValColorSegment(r15, r15, r15, r15)
            goto L211
        L20e:
            r0.setValColorCircleOutline(r6, r6, r6, r15)
        L211:
            r3 = 230(0xe6, float:3.22E-43)
            if (r1 < r3) goto L239
            int r3 = r19.read()
            if (r3 == 0) goto L21d
            r3 = 1
            goto L21e
        L21d:
            r3 = 0
        L21e:
            r0.setValUsePolyfillColor(r3)
            int r3 = r19.readInt()
            r6 = r3 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r13
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r13
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r13
            r0.setValColorPolyfill(r6, r7, r3, r15)
            goto L241
        L239:
            r0.setValUsePolyfillColor(r4)
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.App.COLOR_POLYFILL_DEFAULT
            r0.setValColorPolyfill(r3)
        L241:
            if (r1 < r8) goto L249
            short r3 = r19.readShort()
            r0._rightTriangleDirection = r3
        L249:
            r3 = 320(0x140, float:4.48E-43)
            if (r1 < r3) goto L253
            int r6 = r19.readInt()
            r0._curveRadius = r6
        L253:
            r6 = 420(0x1a4, float:5.89E-43)
            if (r1 >= r6) goto L267
            int r6 = r16.getValLimbType()
            if (r6 == r4) goto L267
            int r6 = r16.getValLimbType()
            if (r6 == 0) goto L267
            r0._curveRadius = r5
            r0._defaultCurveRadius = r5
        L267:
            if (r2 < r9) goto L275
            int r6 = r19.read()
            if (r6 == 0) goto L271
            r6 = 1
            goto L272
        L271:
            r6 = 0
        L272:
            r0.setValSegmentCurveCirculization(r6)
        L275:
            r6 = 21
            if (r2 < r6) goto L280
            short r6 = r19.readShort()
            r0.setValSegmentCurvePolyfillPrecision(r6)
        L280:
            if (r1 < r3) goto L314
            r1 = 36
            if (r2 < r1) goto L2f6
            r1 = 64
            if (r2 >= r1) goto L290
            int r3 = r19.readInt()
            float r3 = (float) r3
            goto L294
        L290:
            float r3 = r19.readFloat()
        L294:
            r0.setValTrapezoidThickness1(r3)
            if (r2 >= r1) goto L29f
            int r1 = r19.readInt()
            float r1 = (float) r1
            goto L2a3
        L29f:
            float r1 = r19.readFloat()
        L2a3:
            r0.setValTrapezoidThickness2(r1)
            r1 = 36
            if (r2 != r1) goto L2d6
            int r1 = r19.read()
            if (r1 == 0) goto L2b2
            r1 = 1
            goto L2b3
        L2b2:
            r1 = 0
        L2b3:
            int r3 = r19.read()
            if (r3 == 0) goto L2bb
            r3 = 1
            goto L2bc
        L2bb:
            r3 = 0
        L2bc:
            if (r1 != 0) goto L2c6
            int r1 = r16.getValThickness()
            float r1 = (float) r1
            r0.setValTrapezoidThickness1(r1)
        L2c6:
            if (r3 != 0) goto L2d0
            int r1 = r16.getValThickness()
            float r1 = (float) r1
            r0.setValTrapezoidThickness2(r1)
        L2d0:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setValTrapezoidRatio(r1)
            goto L314
        L2d6:
            int r1 = r19.read()
            if (r1 == 0) goto L2de
            r1 = 1
            goto L2df
        L2de:
            r1 = 0
        L2df:
            r0.setValTrapezoidIsRounded1(r1)
            int r1 = r19.read()
            if (r1 == 0) goto L2ea
            r1 = 1
            goto L2eb
        L2ea:
            r1 = 0
        L2eb:
            r0.setValTrapezoidIsRounded2(r1)
            float r1 = r19.readFloat()
            r0.setValTrapezoidRatio(r1)
            goto L314
        L2f6:
            float r1 = r19.readFloat()
            int r3 = r16.getValThickness()
            float r3 = (float) r3
            r0.setValTrapezoidThickness1(r3)
            int r3 = r16.getValThickness()
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            r0.setValTrapezoidThickness2(r3)
            r0.setValTrapezoidRatio(r1)
        L314:
            r1 = 41
            r3 = 0
            if (r2 < r1) goto L340
            r1 = 45
            if (r2 > r1) goto L340
            int r1 = r19.read()
            if (r1 == 0) goto L325
            r1 = 1
            goto L326
        L325:
            r1 = 0
        L326:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r0.mAngleLockOffset = r3
            r0.setValIsAngleLocked(r5)
            int r1 = r19.read()
            if (r1 == 0) goto L338
            goto L339
        L338:
            r4 = 0
        L339:
            r0.mIsDragLocked = r4
            r19.readShort()
            goto L3fe
        L340:
            r1 = 46
            if (r2 < r1) goto L36e
            r1 = 50
            if (r2 > r1) goto L36e
            int r1 = r19.read()
            if (r1 == 0) goto L350
            r1 = 1
            goto L351
        L350:
            r1 = 0
        L351:
            r0.setValIsAngleLocked(r1)
            r19.readFloat()
            r0.mAngleLockOffset = r3
            r0.setValIsAngleLocked(r5)
            int r1 = r19.read()
            if (r1 == 0) goto L363
            goto L364
        L363:
            r4 = 0
        L364:
            r0.mIsDragLocked = r4
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            goto L3fe
        L36e:
            r1 = 51
            if (r2 < r1) goto L3b3
            r1 = 56
            if (r2 > r1) goto L3b3
            int r3 = r19.read()
            if (r3 == 0) goto L37e
            r3 = 1
            goto L37f
        L37e:
            r3 = 0
        L37f:
            r0.setValIsAngleLocked(r3)
            if (r2 >= r1) goto L38b
            int r1 = r19.read()
            if (r1 != 0) goto L393
            goto L391
        L38b:
            int r1 = r19.read()
            if (r1 == 0) goto L393
        L391:
            r1 = 1
            goto L394
        L393:
            r1 = 0
        L394:
            r0.setValAngleLockIsMainNode(r1)
            float r1 = r19.readFloat()
            float r2 = r19.readFloat()
            float r1 = r1 - r2
            r0.mAngleLockOffset = r1
            int r1 = r19.read()
            if (r1 == 0) goto L3a9
            goto L3aa
        L3a9:
            r4 = 0
        L3aa:
            r0.mIsDragLocked = r4
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            goto L3fe
        L3b3:
            r1 = 57
            if (r2 < r1) goto L3e4
            r1 = 66
            if (r2 > r1) goto L3e4
            r19.read()
            r19.read()
            float r1 = r19.readFloat()
            r0.mAngleLockOffset = r1
            r1 = 63
            if (r2 < r1) goto L3ce
            r19.readFloat()
        L3ce:
            if (r2 < r1) goto L3d3
            r19.readByte()
        L3d3:
            int r1 = r19.read()
            if (r1 == 0) goto L3da
            goto L3db
        L3da:
            r4 = 0
        L3db:
            r0.mIsDragLocked = r4
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
            goto L3fe
        L3e4:
            r1 = 67
            if (r2 < r1) goto L3fe
            float r1 = r19.readFloat()
            r0.mAngleLockOffset = r1
            int r1 = r19.read()
            if (r1 == 0) goto L3f5
            goto L3f6
        L3f5:
            r4 = 0
        L3f6:
            r0.mIsDragLocked = r4
            float r1 = r19.readFloat()
            r0.mDragLockAngle = r1
        L3fe:
            r16.updateColorReferences()
            return
    }

    protected void readPositionalDataOld(int r8, java.nio.ByteBuffer r9) {
            r7 = this;
            r7.flagPositionAsDirty()
            byte r8 = r9.get()
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Ld
            r8 = 1
            goto Le
        Ld:
            r8 = 0
        Le:
            r7.setValIsStretchy(r8)
            byte r8 = r9.get()
            if (r8 == 0) goto L19
            r8 = 1
            goto L1a
        L19:
            r8 = 0
        L1a:
            r7.setValUseSegmentColor(r8)
            r7.setValUseGradient(r1)
            r7.mGradientReversed = r1
            r7.setValGradientMode(r0)
            byte r8 = r9.get()
            if (r8 == 0) goto L2d
            r8 = 1
            goto L2e
        L2d:
            r8 = 0
        L2e:
            r7.setValUseSegmentScale(r8)
            float r8 = r9.getFloat()
            r7.setValSegmentScale(r8)
            float r8 = r9.getFloat()
            r7.setValLength(r8)
            int r8 = r9.getInt()
            r7.setValThickness(r8)
            float r8 = r9.getFloat()
            r7._localAngle = r8
            int r8 = r9.getInt()
            r9 = r8 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r2
            int r3 = r8 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r2
            int r8 = r8 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r2
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.setValColorSegment(r9, r3, r8, r4)
            r8 = 1056964608(0x3f000000, float:0.5)
            r7.setValColorGradient(r8, r8, r8, r4)
            boolean r9 = r7.getValUseSegmentColor()
            boolean r3 = r7.getValUseGradient()
            int r5 = r7.getValLimbType()
            r6 = 6
            if (r5 != r6) goto Lab
            if (r3 == 0) goto Lab
            boolean r3 = r7.mGradientReversed
            if (r3 == 0) goto L84
            r7.mGradientReversed = r1
            goto Lab
        L84:
            if (r9 != 0) goto L89
            r7.mGradientReversed = r0
            goto Lab
        L89:
            com.badlogic.gdx.graphics.Color r9 = r7.getValColorSegment()
            int r9 = r9.toIntBits()
            com.badlogic.gdx.graphics.Color r0 = r7.getValColorGradient()
            r7.setValColorSegment(r0)
            r0 = r9 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r2
            int r1 = r9 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r2
            int r9 = r9 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r2
            r7.setValColorGradient(r0, r1, r9, r4)
        Lab:
            boolean r9 = r7._filledCircleIntoCircleFlag
            if (r9 != 0) goto Lb2
            r7.setValColorCircleOutline(r8, r8, r8, r4)
        Lb2:
            r7.updateColorReferences()
            return
    }

    public void recreatePolyfillAfterClone(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            r4.convertToPolyAnchor()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r5 = r5._polynodeChildrenRefs
            int r0 = r5.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L24
            java.lang.Object r2 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r2 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r4._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r3.getNodeAtDrawOrderIndex(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r4.addPolynodeChild(r2)
            int r1 = r1 + 1
            goto La
        L24:
            return
    }

    public void removeAllJoinedFigures() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._joinedFigureRefs
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._joinedFigureRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r2._joinedFigureRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r1.unjoin()
            int r0 = r0 + (-1)
            goto L13
        L23:
            return
    }

    public void removeJoinedFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._joinedFigureRefs
            r0.remove(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r1._joinedFigureRefs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L23
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r1._stickfigureRef
            int r0 = r1.getValDrawOrderIndex()
            r2.removeJoinAnchor(r0)
            r2 = 0
            r1._joinedFigureRefs = r2
        L23:
            return
        L24:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove joined figure, this node has none."
            r2.<init>(r0)
            throw r2
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode removeLastPolynodeChild() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.removePolyAnchorParent(r2)
            r2.analyzePolyfillForCompleteChildren()
            return r0
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't remove polynode, there aren't any more children polynodes."
            r0.<init>(r1)
            throw r0
    }

    public void removePolyAnchorParent(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyAnchorParentRefs
            r0.remove(r2)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._polyAnchorParentRefs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L10
            r2 = 0
            r1._polyAnchorParentRefs = r2
        L10:
            return
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode removePolynodeChild(org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polynodeChildrenRefs
            int r0 = r0.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto L13
            r3 = 0
            return r3
        L13:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._polynodeChildrenRefs
            r1.remove(r0)
            r3.removePolyAnchorParent(r2)
            r2.analyzePolyfillForCompleteChildren()
            return r3
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove polynode, there aren't any more children polynodes."
            r3.<init>(r0)
            throw r3
    }

    public void resetLength() {
            r1 = this;
            float r0 = r1.getValDefaultLength()
            r1.setValLength(r0)
            r1.flagPositionAsDirty()
            boolean r0 = r1.getValIsSmartStretch()
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1.getStickfigure()
            boolean r0 = r0.smartStretchIsEnabled()
            if (r0 == 0) goto L1d
            r1.applySmartStretchToChildren()
        L1d:
            r1.applySmartStretchToJoinedSprites()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1.getStickfigure()
            r0.repositionBasedOnLockedStickNode(r1)
            return
    }

    public void resetThickness() {
            r1 = this;
            int r0 = r1.getValDefaultThickness()
            r1.setValThickness(r0)
            return
    }

    public void setAngle(float r3) {
            r2 = this;
            r2.validatePosition()
            boolean r0 = r2.isMainNode()
            if (r0 == 0) goto Lc
            r2._localAngle = r3
            goto L14
        Lc:
            float r0 = r2._localAngle
            float r1 = r2._angle
            float r0 = r0 - r1
            float r3 = r3 + r0
            r2._localAngle = r3
        L14:
            r2.flagPositionAsDirty()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2._stickfigureRef
            r3.repositionBasedOnLockedStickNode()
            return
    }

    public void setAngleLockIsMainNode(boolean r1) {
            r0 = this;
            r0.setValAngleLockIsMainNode(r1)
            r1 = 0
            r0.updateAngleLock(r1)
            return
    }

    public void setBranchProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties[] r6) {
            r5 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r5)
            r1 = 0
        Lc:
            boolean r2 = r0.empty()
            if (r2 != 0) goto L44
            java.lang.Object r2 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r3 = r1 + 1
            r1 = r6[r1]
            boolean r4 = r1 instanceof org.fortheloss.sticknodes.data.useractions.ConnectorProperties
            if (r4 == 0) goto L27
            r4 = r2
            org.fortheloss.sticknodes.stickfigure.Connector r4 = (org.fortheloss.sticknodes.stickfigure.Connector) r4
            r4.setProperties(r1)
            goto L2a
        L27:
            r2.setProperties(r1)
        L2a:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._childrenNodes
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L32:
            if (r1 < 0) goto L42
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r4 = r2._childrenNodes
            java.lang.Object r4 = r4.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r0.push(r4)
            int r1 = r1 + (-1)
            goto L32
        L42:
            r1 = r3
            goto Lc
        L44:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void setCircleIsHollow(boolean r1) {
            r0 = this;
            r0.setValCircleIsHollow(r1)
            return
    }

    public void setCircleOutlineColor(float r2, float r3, float r4) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setValColorCircleOutline(r2, r3, r4, r0)
            r1.updateColorReferences()
            return
    }

    public void setCircleOutlineColor(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            float r0 = r4.r
            float r1 = r4.g
            float r4 = r4.b
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setValColorCircleOutline(r0, r1, r4, r2)
            r3.updateColorReferences()
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            float r0 = r4.r
            float r1 = r4.g
            float r4 = r4.b
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setValColorSegment(r0, r1, r4, r2)
            return
    }

    public void setCurrentValuesAsDefault() {
            r1 = this;
            float r0 = r1._angle
            r1._defaultAngle = r0
            float r0 = r1._localAngle
            r1._defaultLocalAngle = r0
            int r0 = r1._curveRadius
            r1._defaultCurveRadius = r0
            float r0 = r1.getValLength()
            r1.setValDefaultLength(r0)
            int r0 = r1.getValThickness()
            r1.setValDefaultThickness(r0)
            return
    }

    public void setDefaultLength(float r1) {
            r0 = this;
            r0.setValDefaultLength(r1)
            return
    }

    public void setDefaultThickness(int r2) {
            r1 = this;
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r2 <= r0) goto L7
            r2 = 9999(0x270f, float:1.4012E-41)
            goto La
        L7:
            if (r2 >= 0) goto La
            r2 = 0
        La:
            r1.setValDefaultThickness(r2)
            return
    }

    public void setDefaults() {
            r4 = this;
            r4.flagPositionAsDirty()
            r4.validatePosition()
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r4._childrenNodes
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L16:
            if (r1 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._childrenNodes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r0.add(r2)
            int r1 = r1 + (-1)
            goto L16
        L26:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4d
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.setCurrentValuesAsDefault()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3d:
            if (r2 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L3d
        L4d:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    public void setDoNotApplySmartStretch(boolean r2) {
            r1 = this;
            boolean r0 = r1.getValIsSmartStretch()
            if (r0 == 0) goto Lb
            r2 = 0
            r1.setValSmartStretchDoNotApply(r2)
            goto Le
        Lb:
            r1.setValSmartStretchDoNotApply(r2)
        Le:
            return
    }

    public void setDragLockAngle(float r3) {
            r2 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r2.mDragLockAngle = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto Ld
            float r3 = r3 + r0
            r2.mDragLockAngle = r3
        Ld:
            return
    }

    public void setDrawOrderIndex(int r1) {
            r0 = this;
            r0.setValDrawOrderIndex(r1)
            return
    }

    public void setFloaty(boolean r1) {
            r0 = this;
            r0.setValIsFloaty(r1)
            return
    }

    public void setGradientColor(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            float r0 = r4.r
            float r1 = r4.g
            float r4 = r4.b
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setValColorGradient(r0, r1, r4, r2)
            return
    }

    public void setGradientMode(short r1) {
            r0 = this;
            r0.setValGradientMode(r1)
            return
    }

    public void setHalfArc(boolean r1) {
            r0 = this;
            r0.setValHalfArc(r1)
            return
    }

    public void setIsAngleLocked(boolean r2) {
            r1 = this;
            boolean r0 = r1.getValIsAngleLocked()
            if (r0 != r2) goto L7
            return
        L7:
            r1.setValIsAngleLocked(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r1.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getMainNode()
            r1.mAngleLockRelativeRememberedParentNodeRef = r2
            r2 = 1
            r1.setValAngleLockIsMainNode(r2)
            float r2 = r1.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1.mAngleLockRelativeRememberedParentNodeRef
            float r0 = r0.getAngle()
            float r2 = r2 - r0
            r1.mAngleLockOffset = r2
            r2 = 0
            r1.setValAngleLockRelativeStart(r2)
            r1.setValAngleLockStickfigureStart(r2)
            return
    }

    public void setIsDragLocked(boolean r1) {
            r0 = this;
            r0.mIsDragLocked = r1
            return
    }

    public void setLength(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r2.setValLength(r3)
            r2.flagPositionAsDirty()
            boolean r3 = r2.getValIsSmartStretch()
            if (r3 == 0) goto L1f
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2.getStickfigure()
            boolean r3 = r3.smartStretchIsEnabled()
            if (r3 == 0) goto L1f
            r2.applySmartStretchToChildren()
        L1f:
            r2.applySmartStretchToJoinedSprites()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2.getStickfigure()
            r3.repositionBasedOnLockedStickNode(r2)
            return
    }

    public void setLimbType(int r3) {
            r2 = this;
            r0 = 2
            if (r3 == r0) goto L10
            r1 = 5
            if (r3 == r1) goto L10
            short r1 = r2.getGradientMode()
            if (r1 != r0) goto L10
            r0 = 0
            r2.setValGradientMode(r0)
        L10:
            r2.setValLimbType(r3)
            return
    }

    public void setLocalAngle(float r2) {
            r1 = this;
            boolean r0 = r1.isMainNode()
            if (r0 == 0) goto La
            r1.setAngle(r2)
            goto Lc
        La:
            r1._localAngle = r2
        Lc:
            r1.flagPositionAsDirty()
            return
    }

    public void setNumPolygonVertices(short r3) {
            r2 = this;
            r0 = 4
            r1 = 16
            if (r3 <= r1) goto L8
            r3 = 16
            goto Lb
        L8:
            if (r3 >= r0) goto Lb
            r3 = 4
        Lb:
            r2.setValNumPolygonVertices(r3)
            return
    }

    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            r0.setValColorPolyfill(r1)
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.StickNodeProperties r2) {
            r1 = this;
            r1.flagPositionAsDirty()
            float r0 = r2.x
            r1._x = r0
            float r0 = r2.y
            r1._y = r0
            float r0 = r2.localX
            r1._localX = r0
            float r0 = r2.localY
            r1._localY = r0
            float r0 = r2.defaultLength
            r1.setValDefaultLength(r0)
            float r0 = r2.length
            r1.setValLength(r0)
            int r0 = r2.defaultThickness
            r1.setValDefaultThickness(r0)
            int r0 = r2.thickness
            r1.setValThickness(r0)
            int r0 = r2.segmentCurveRadius
            r1._curveRadius = r0
            boolean r0 = r2.segmentCurveCirculization
            r1.setValSegmentCurveCirculization(r0)
            short r0 = r2.segmentCurvePrecision
            r1.setValSegmentCurvePolyfillPrecision(r0)
            boolean r0 = r2.halfArc
            r1.setValHalfArc(r0)
            short r0 = r2.rightTriangleDirection
            r1._rightTriangleDirection = r0
            boolean r0 = r2.triangleUpsideDown
            r1.setValTriangleUpsideDown(r0)
            float r0 = r2.trapezoidThickness1
            r1.setValTrapezoidThickness1(r0)
            boolean r0 = r2.trapezoidIsRounded1
            r1.setValTrapezoidIsRounded1(r0)
            float r0 = r2.trapezoidThickness2
            r1.setValTrapezoidThickness2(r0)
            boolean r0 = r2.trapezoidIsRounded2
            r1.setValTrapezoidIsRounded2(r0)
            float r0 = r2.trapezoidRatio
            r1.setValTrapezoidRatio(r0)
            short r0 = r2.numPolygonVertices
            r1.setValNumPolygonVertices(r0)
            float r0 = r2.defaultLocalAngle
            r1._defaultLocalAngle = r0
            float r0 = r2.localAngle
            r1._localAngle = r0
            float r0 = r2.defaultAngle
            r1._defaultAngle = r0
            boolean r0 = r2.useSegmentColor
            r1.setValUseSegmentColor(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.color
            r1.setValColorSegment(r0)
            boolean r0 = r2.useCircleOutline
            r1.setValUseCircleOutline(r0)
            boolean r0 = r2.circleIsHollow
            r1.setValCircleIsHollow(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.circleOutlineColor
            r1.setValColorCircleOutline(r0)
            boolean r0 = r2.useGradient
            r1.setValUseGradient(r0)
            boolean r0 = r2.reverseGradient
            r1.mGradientReversed = r0
            short r0 = r2.gradientMode
            r1.setValGradientMode(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.gradientColor
            r1.setValColorGradient(r0)
            boolean r0 = r2.useSegmentScale
            r1.setValUseSegmentScale(r0)
            float r0 = r2.scale
            r1.setValSegmentScale(r0)
            boolean r0 = r2.isStretchy
            r1.setValIsStretchy(r0)
            boolean r0 = r2.mIsFloaty
            r1.setValIsFloaty(r0)
            boolean r0 = r2.isSmartStretch
            r1.setValIsSmartStretch(r0)
            boolean r0 = r2.doNotApplySmartStretch
            r1.setValSmartStretchDoNotApply(r0)
            boolean r0 = r2.mSmartStretchResetImpulse
            r1.setValSmartStretchResetImpulse(r0)
            boolean r0 = r2.isStatic
            r1.setValIsStatic(r0)
            int r0 = r2.limbType
            r1.setValLimbType(r0)
            boolean r0 = r2.usePolyfillColor
            r1.setValUsePolyfillColor(r0)
            com.badlogic.gdx.graphics.Color r0 = r2.polyfillColor
            r1.setValColorPolyfill(r0)
            boolean r0 = r2.mIsAngleLocked
            r1.setValIsAngleLocked(r0)
            boolean r0 = r2.mAngleLockIsMainNode
            r1.setValAngleLockIsMainNode(r0)
            float r0 = r2.mAngleLockOffset
            r1.mAngleLockOffset = r0
            float r0 = r2.mAngleLockRelativeStart
            r1.setValAngleLockRelativeStart(r0)
            float r0 = r2.mAngleLockStickfigureStart
            r1.setValAngleLockStickfigureStart(r0)
            byte r0 = r2.mAngleLockRelativeMultiplier
            r1.setValAngleLockRelativeMultiplier(r0)
            boolean r0 = r2.mIsDragLocked
            r1.mIsDragLocked = r0
            float r0 = r2.mDragLockAngle
            r1.mDragLockAngle = r0
            float r2 = r2.mSmartStretchMultiplier
            r1.setValSmartStretchMultiplier(r2)
            r1.updateColorReferences()
            r1.validatePosition()
            return
    }

    public void setReverseGradient(boolean r1) {
            r0 = this;
            r0.mGradientReversed = r1
            r0.updateColorReferences()
            return
    }

    public void setRightTriangleDirection(short r3) {
            r2 = this;
            r0 = -1
            r1 = 1
            if (r3 <= r1) goto L6
            r3 = 1
            goto L9
        L6:
            if (r3 >= r0) goto L9
            r3 = -1
        L9:
            r2._rightTriangleDirection = r3
            return
    }

    public void setScale(float r4) {
            r3 = this;
            r0 = 1092616192(0x41200000, float:10.0)
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto Ld
            r4 = 953267991(0x38d1b717, float:1.0E-4)
            goto L13
        Ld:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r4 = 1092616192(0x41200000, float:10.0)
        L13:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            float r4 = r4 / r0
            r3.setValSegmentScale(r4)
            boolean r4 = r3.getValUseSegmentScale()
            if (r4 == 0) goto L29
            r3.flagPositionAsDirty()
        L29:
            return
    }

    public void setSegmentCurve(int r3) {
            r2 = this;
            r0 = -99999(0xfffffffffffe7961, float:NaN)
            r1 = 99999(0x1869f, float:1.40128E-40)
            if (r3 <= r1) goto Lc
            r3 = 99999(0x1869f, float:1.40128E-40)
            goto L11
        Lc:
            if (r3 >= r0) goto L11
            r3 = -99999(0xfffffffffffe7961, float:NaN)
        L11:
            r2._curveRadius = r3
            boolean r3 = r2.isPolyfillAnchor()
            if (r3 == 0) goto L1c
            r2.polyfillOnCurveChange(r2)
        L1c:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r2._polyAnchorParentRefs
            if (r3 == 0) goto L37
            r3 = 0
        L21:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyAnchorParentRefs
            int r0 = r0.size()
            if (r3 >= r0) goto L37
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._polyAnchorParentRefs
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.polyfillOnCurveChange(r2)
            int r3 = r3 + 1
            goto L21
        L37:
            return
    }

    public void setSegmentCurveCirculization(boolean r2) {
            r1 = this;
            boolean r0 = r1.getValSegmentCurveCirculization()
            if (r0 != r2) goto L7
            return
        L7:
            r1.setValSegmentCurveCirculization(r2)
            boolean r2 = r1.isPolyfillAnchor()
            if (r2 == 0) goto L13
            r1.polyfillOnCurveChange(r1)
        L13:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._polyAnchorParentRefs
            if (r2 == 0) goto L2e
            r2 = 0
        L18:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyAnchorParentRefs
            int r0 = r0.size()
            if (r2 >= r0) goto L2e
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r1._polyAnchorParentRefs
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r0.polyfillOnCurveChange(r1)
            int r2 = r2 + 1
            goto L18
        L2e:
            return
    }

    public void setSegmentCurvePolyfillPrecision(short r2) {
            r1 = this;
            short r0 = r1.getValSegmentCurvePolyfillPrecision()
            if (r0 != r2) goto L7
            return
        L7:
            r1.setValSegmentCurvePolyfillPrecision(r2)
            r2 = 0
            r1._triangulatedPolynodeChildrenDrawOrder = r2
            return
    }

    public void setSegmentRelativeAngleLockMultiplier(byte r3) {
            r2 = this;
            r2.flagPositionAsDirty()
            r0 = 99
            r1 = -99
            if (r3 >= r1) goto Lc
            r3 = -99
            goto L10
        Lc:
            if (r3 <= r0) goto L10
            r3 = 99
        L10:
            r2.setValAngleLockRelativeMultiplier(r3)
            return
    }

    public void setSmartStretch(boolean r1) {
            r0 = this;
            r0.setValIsSmartStretch(r1)
            r0.flagPositionAsDirty()
            boolean r1 = r0.getValIsSmartStretch()
            if (r1 == 0) goto L10
            r1 = 0
            r0.setValSmartStretchDoNotApply(r1)
        L10:
            return
    }

    public void setSmartStretchMultiplier(float r1) {
            r0 = this;
            r0.setValSmartStretchMultiplier(r1)
            return
    }

    public void setSmartStretchResetImpulse(boolean r1) {
            r0 = this;
            r0.setValSmartStretchResetImpulse(r1)
            return
    }

    public void setStatic(boolean r2) {
            r1 = this;
            boolean r2 = r1.setValIsStatic(r2)
            boolean r0 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 != 0) goto L12
            r0 = 0
            if (r2 == 0) goto Lf
            r1.setValIsSmartStretch(r0)
            goto L12
        Lf:
            r1.setValSmartStretchDoNotApply(r0)
        L12:
            return
    }

    public void setStretchy(boolean r1) {
            r0 = this;
            r0.setValIsStretchy(r1)
            return
    }

    public void setThickness(int r2) {
            r1 = this;
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r2 <= r0) goto L7
            r2 = 9999(0x270f, float:1.4012E-41)
            goto La
        L7:
            if (r2 >= 0) goto La
            r2 = 0
        La:
            r1.setValThickness(r2)
            return
    }

    public void setTrapezoidIsRounded1(boolean r1) {
            r0 = this;
            r0.setValTrapezoidIsRounded1(r1)
            return
    }

    public void setTrapezoidIsRounded2(boolean r1) {
            r0 = this;
            r0.setValTrapezoidIsRounded2(r1)
            return
    }

    public void setTrapezoidRatio(float r1) {
            r0 = this;
            r0.setValTrapezoidRatio(r1)
            return
    }

    public void setTrapezoidThickness1(float r2, float r3) {
            r1 = this;
            r0 = 1
            r1.setTrapezoidThickness1(r2, r3, r0)
            return
    }

    public void setTrapezoidThickness1(float r6, float r7, boolean r8) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            r1 = r7
            goto Lb
        L7:
            float r1 = r5.getValTrapezoidRatio()
        Lb:
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            r5.setValTrapezoidThickness1(r0)
            r5.setValTrapezoidThickness2(r0)
            return
        L16:
            r3 = 1176255488(0x461c3c00, float:9999.0)
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 <= 0) goto L21
            r6 = 1176255488(0x461c3c00, float:9999.0)
            goto L26
        L21:
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L26
            r6 = 0
        L26:
            r5.setValTrapezoidThickness1(r6)
            if (r8 == 0) goto L40
            if (r2 <= 0) goto L40
            float r6 = r6 / r1
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 <= 0) goto L36
            r0 = 1176255488(0x461c3c00, float:9999.0)
            goto L3c
        L36:
            int r7 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r7 >= 0) goto L3b
            goto L3c
        L3b:
            r0 = r6
        L3c:
            r5.setValTrapezoidThickness2(r0)
            goto L64
        L40:
            if (r8 != 0) goto L64
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L64
            float r6 = r5.getTrapezoidRatio()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L64
            float r6 = r5.getTrapezoidThickness1()
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.max(r7, r6)
            float r8 = r5.getTrapezoidThickness2()
            float r7 = java.lang.Math.max(r7, r8)
            float r6 = r6 / r7
            r5.setTrapezoidRatio(r6)
        L64:
            return
    }

    public void setTrapezoidThickness2(float r2, float r3) {
            r1 = this;
            r0 = 1
            r1.setTrapezoidThickness2(r2, r3, r0)
            return
    }

    public void setTrapezoidThickness2(float r7, float r8, boolean r9) {
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            r1 = r8
            goto Lb
        L7:
            float r1 = r6.getValTrapezoidRatio()
        Lb:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 / r1
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L1a
            r6.setValTrapezoidThickness1(r0)
            r6.setValTrapezoidThickness2(r0)
            return
        L1a:
            r4 = 1176255488(0x461c3c00, float:9999.0)
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 <= 0) goto L25
            r7 = 1176255488(0x461c3c00, float:9999.0)
            goto L2a
        L25:
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 >= 0) goto L2a
            r7 = 0
        L2a:
            r6.setValTrapezoidThickness2(r7)
            if (r9 == 0) goto L44
            if (r3 <= 0) goto L44
            float r7 = r7 / r1
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 <= 0) goto L3a
            r0 = 1176255488(0x461c3c00, float:9999.0)
            goto L40
        L3a:
            int r8 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r8 >= 0) goto L3f
            goto L40
        L3f:
            r0 = r7
        L40:
            r6.setValTrapezoidThickness1(r0)
            goto L66
        L44:
            if (r9 != 0) goto L66
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 >= 0) goto L66
            float r7 = r6.getTrapezoidRatio()
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L66
            float r7 = r6.getTrapezoidThickness1()
            float r7 = java.lang.Math.max(r2, r7)
            float r8 = r6.getTrapezoidThickness2()
            float r8 = java.lang.Math.max(r2, r8)
            float r7 = r7 / r8
            r6.setTrapezoidRatio(r7)
        L66:
            return
    }

    public void setTriangleUpsideDown(boolean r1) {
            r0 = this;
            r0.setValTriangleUpsideDown(r1)
            return
    }

    public void setUseCircleOutline(boolean r1) {
            r0 = this;
            r0.setValUseCircleOutline(r1)
            r0.updateColorReferences()
            return
    }

    public void setUsePolyfillColor(boolean r1) {
            r0 = this;
            r0.setValUsePolyfillColor(r1)
            r0.updateColorReferences()
            return
    }

    protected abstract boolean setValAngleLockIsMainNode(boolean r1);

    protected abstract float setValAngleLockRelativeMultiplier(byte r1);

    protected abstract float setValAngleLockRelativeStart(float r1);

    protected abstract float setValAngleLockStickfigureStart(float r1);

    protected abstract boolean setValCircleIsHollow(boolean r1);

    protected abstract com.badlogic.gdx.graphics.Color setValColorCircleOutline(float r1, float r2, float r3, float r4);

    protected abstract com.badlogic.gdx.graphics.Color setValColorCircleOutline(com.badlogic.gdx.graphics.Color r1);

    protected abstract com.badlogic.gdx.graphics.Color setValColorGradient(float r1, float r2, float r3, float r4);

    protected abstract com.badlogic.gdx.graphics.Color setValColorGradient(com.badlogic.gdx.graphics.Color r1);

    protected abstract com.badlogic.gdx.graphics.Color setValColorPolyfill(float r1, float r2, float r3, float r4);

    protected abstract com.badlogic.gdx.graphics.Color setValColorPolyfill(com.badlogic.gdx.graphics.Color r1);

    protected abstract com.badlogic.gdx.graphics.Color setValColorSegment(float r1, float r2, float r3, float r4);

    protected abstract com.badlogic.gdx.graphics.Color setValColorSegment(com.badlogic.gdx.graphics.Color r1);

    protected abstract float setValDefaultLength(float r1);

    protected abstract int setValDefaultThickness(int r1);

    protected abstract int setValDrawOrderIndex(int r1);

    protected abstract short setValGradientMode(short r1);

    protected abstract boolean setValHalfArc(boolean r1);

    protected abstract boolean setValIsAngleLocked(boolean r1);

    protected abstract boolean setValIsFloaty(boolean r1);

    protected abstract boolean setValIsSmartStretch(boolean r1);

    protected abstract boolean setValIsStatic(boolean r1);

    protected abstract boolean setValIsStretchy(boolean r1);

    protected abstract float setValLength(float r1);

    protected abstract int setValLimbType(int r1);

    protected abstract short setValNumPolygonVertices(short r1);

    protected abstract boolean setValSegmentCurveCirculization(boolean r1);

    protected abstract short setValSegmentCurvePolyfillPrecision(short r1);

    protected abstract float setValSegmentScale(float r1);

    protected abstract boolean setValSmartStretchDoNotApply(boolean r1);

    protected abstract float setValSmartStretchMultiplier(float r1);

    protected abstract boolean setValSmartStretchResetImpulse(boolean r1);

    protected abstract int setValThickness(int r1);

    protected abstract boolean setValTrapezoidIsRounded1(boolean r1);

    protected abstract boolean setValTrapezoidIsRounded2(boolean r1);

    protected abstract float setValTrapezoidRatio(float r1);

    protected abstract float setValTrapezoidThickness1(float r1);

    protected abstract float setValTrapezoidThickness2(float r1);

    protected abstract boolean setValTriangleUpsideDown(boolean r1);

    protected abstract boolean setValUseCircleOutline(boolean r1);

    protected abstract boolean setValUseGradient(boolean r1);

    protected abstract boolean setValUsePolyfillColor(boolean r1);

    protected abstract boolean setValUseSegmentColor(boolean r1);

    protected abstract boolean setValUseSegmentScale(boolean r1);

    public void updateAngleLock(org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.mAngleLockRelativeRememberedParentNodeRef
            int r2 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.stickfigure.INode r2 = r0.getNodeAtDrawOrderIndex(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            r1.mAngleLockRelativeRememberedParentNodeRef = r2
            return
    }

    public void updateAngleLock(boolean r3) {
            r2 = this;
            boolean r0 = r2.getValAngleLockIsMainNode()
            if (r0 == 0) goto L11
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getMainNode()
            r2.mAngleLockRelativeRememberedParentNodeRef = r0
            goto L22
        L11:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.getParentNode()
        L15:
            boolean r1 = r0.isStatic()
            if (r1 == 0) goto L20
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getParentNode()
            goto L15
        L20:
            r2.mAngleLockRelativeRememberedParentNodeRef = r0
        L22:
            if (r3 != 0) goto L57
            float r3 = r2.getAngle()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.mAngleLockRelativeRememberedParentNodeRef
            float r0 = r0.getAngle()
            float r3 = r3 - r0
            r2.mAngleLockOffset = r3
            boolean r3 = r2.isMainNode()
            if (r3 == 0) goto L3f
            r3 = 0
            r2.setValAngleLockRelativeStart(r3)
            r2.setValAngleLockStickfigureStart(r3)
            goto L57
        L3f:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2.mAngleLockRelativeRememberedParentNodeRef
            float r3 = r3.getAngle()
            r2.setValAngleLockRelativeStart(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r2.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getMainNode()
            float r3 = r3.getAngle()
            r2.setValAngleLockStickfigureStart(r3)
        L57:
            return
    }

    protected void updateColorReferences() {
            r1 = this;
            boolean r0 = r1.getValUseSegmentColor()
            if (r0 != 0) goto L1a
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r1._colorRef1 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r1._colorRef2 = r0
            goto L26
        L1a:
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorSegment()
            r1._colorRef1 = r0
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorSegment()
            r1._colorRef2 = r0
        L26:
            boolean r0 = r1.getValUseGradient()
            if (r0 == 0) goto L3d
            boolean r0 = r1.mGradientReversed
            if (r0 != 0) goto L37
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorGradient()
            r1._colorRef2 = r0
            goto L3d
        L37:
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorGradient()
            r1._colorRef1 = r0
        L3d:
            boolean r0 = r1.getValUsePolyfillColor()
            if (r0 != 0) goto L4f
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            if (r0 != 0) goto L48
            goto L4f
        L48:
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            r1._polyfillColorRef = r0
            goto L55
        L4f:
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorPolyfill()
            r1._polyfillColorRef = r0
        L55:
            return
    }

    protected void updatePosition() {
            r7 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7._parentNodeRef
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 0
            r3 = 1135869952(0x43b40000, float:360.0)
            if (r0 == 0) goto L172
            boolean r0 = r7._flipFlag
            if (r0 == 0) goto L6e
            float r0 = r7._localAngle
            float r0 = -r0
            float r0 = r0 % r3
            r7._localAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1a
            float r0 = r0 + r3
            r7._localAngle = r0
        L1a:
            float r0 = r7._defaultLocalAngle
            float r0 = -r0
            float r0 = r0 % r3
            r7._defaultLocalAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L27
            float r0 = r0 + r3
            r7._defaultLocalAngle = r0
        L27:
            float r0 = r7._defaultAngle
            float r0 = -r0
            float r0 = r0 % r3
            r7._defaultAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L34
            float r0 = r0 + r3
            r7._defaultAngle = r0
        L34:
            float r0 = r7.mDragLockAngle
            float r0 = -r0
            float r0 = r0 % r3
            r7.mDragLockAngle = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L41
            float r0 = r0 + r3
            r7.mDragLockAngle = r0
        L41:
            short r0 = r7._rightTriangleDirection
            int r0 = r0 * (-1)
            short r0 = (short) r0
            r7._rightTriangleDirection = r0
            int r0 = r7._curveRadius
            int r0 = r0 * (-1)
            r7._curveRadius = r0
            int r0 = r7._defaultCurveRadius
            int r0 = r0 * (-1)
            r7._defaultCurveRadius = r0
            int r0 = r7.getLimbType()
            boolean r4 = r7.getValUseGradient()
            if (r4 == 0) goto L6e
            short r4 = r7.getGradientMode()
            if (r4 != 0) goto L6e
            r4 = 3
            if (r0 == r4) goto L6e
            boolean r0 = r7.mGradientReversed
            r0 = r0 ^ 1
            r7.setReverseGradient(r0)
        L6e:
            boolean r0 = r7.getValIsAngleLocked()
            if (r0 == 0) goto Lfa
            boolean r0 = r7.getValAngleLockIsMainNode()
            if (r0 == 0) goto L94
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getMainNode()
            float r0 = r0.getAngle()
            float r1 = r7.mAngleLockOffset
            float r0 = r0 + r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._parentNodeRef
            float r1 = r1.getAngle()
            float r1 = r1 - r0
            float r0 = -r1
            r7._localAngle = r0
            goto Lee
        L94:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7.getParentNode()
        L98:
            boolean r4 = r0.isStatic()
            if (r4 == 0) goto La3
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getParentNode()
            goto L98
        La3:
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r7.mAngleLockRelativeRememberedParentNodeRef
            if (r0 != r4) goto Lee
            float r4 = r7.getValAngleLockStickfigureStart()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r7.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r5.getMainNode()
            float r5 = r5.getAngle()
            float r4 = r4 - r5
            float r4 = r4 % r3
            r5 = 1141309440(0x44070000, float:540.0)
            float r4 = r4 + r5
            float r4 = r4 % r3
            float r4 = r4 - r1
            float r6 = r7.getValAngleLockRelativeStart()
            float r0 = r0.getAngle()
            float r6 = r6 - r0
            float r6 = r6 % r3
            float r6 = r6 + r5
            float r6 = r6 % r3
            float r6 = r6 - r1
            float r0 = r7.getValAngleLockRelativeStart()
            byte r1 = r7.getValAngleLockRelativeMultiplier()
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r4 = r4 * r1
            float r0 = r0 + r4
            byte r1 = r7.getValAngleLockRelativeMultiplier()
            float r1 = (float) r1
            float r6 = r6 * r1
            float r0 = r0 - r6
            float r1 = r7.mAngleLockOffset
            float r0 = r0 + r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._parentNodeRef
            float r1 = r1.getAngle()
            float r1 = r1 - r0
            float r0 = -r1
            r7._localAngle = r0
        Lee:
            float r0 = r7._localAngle
            float r0 = r0 % r3
            r7._localAngle = r0
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lfa
            float r0 = r0 + r3
            r7._localAngle = r0
        Lfa:
            float r0 = r7._localAngle
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r7._parentNodeRef
            float r1 = r1.getAngle()
            float r0 = r0 + r1
            float r0 = r0 % r3
            r7._angle = r0
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L10d
            float r0 = r0 + r3
            r7._angle = r0
        L10d:
            float r0 = r7._defaultAngle
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11a
            float r0 = r7._angle
            r7._defaultAngle = r0
        L11a:
            float r0 = r7._angle
            float r0 = org.fortheloss.framework.CustomMathUtils.cosDeg(r0)
            r7._cosAngle = r0
            float r0 = r7._angle
            float r0 = org.fortheloss.framework.CustomMathUtils.sinDeg(r0)
            r7._sinAngle = r0
            float r0 = r7.getValLength()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            boolean r1 = r7.getValUseSegmentScale()
            if (r1 == 0) goto L145
            float r1 = r7.getValSegmentScale()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r7._stickfigureRef
            float r2 = r2.getScale()
            float r1 = r1 * r2
            goto L14b
        L145:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r7._stickfigureRef
            float r1 = r1.getScale()
        L14b:
            float r2 = r7._cosAngle
            float r2 = r2 * r0
            r7._localX = r2
            float r2 = r7._sinAngle
            float r2 = r2 * r0
            r7._localY = r2
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7._parentNodeRef
            float r0 = r0.getX()
            float r2 = r7._localX
            float r2 = r2 * r1
            float r0 = r0 + r2
            r7._x = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r7._parentNodeRef
            float r0 = r0.getY()
            float r2 = r7._localY
            float r2 = r2 * r1
            float r0 = r0 + r2
            r7._y = r0
            goto L1d7
        L172:
            boolean r0 = r7._flipFlag
            if (r0 == 0) goto L195
            float r0 = r7._localAngle
            float r0 = r0 - r1
            r7._localAngle = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L195
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            float r0 = r0.getJoinOffsetAngle()
            float r0 = r0 % r3
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L18f
            float r0 = r0 + r3
        L18f:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r7._stickfigureRef
            float r0 = -r0
            r1.setJoinOffsetAngle(r0)
        L195:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L1cf
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            boolean r0 = r0.getKeepJoinDuringInterpolation()
            if (r0 == 0) goto L1cf
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getJoinedToNode()
            float r0 = r0.getAngle()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r7._stickfigureRef
            float r1 = r1.getJoinOffsetAngle()
            float r0 = r0 + r1
            r7._localAngle = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r7._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0.getJoinedToNode()
            float r1 = r1.getGlobalX()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = r7._stickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getJoinedToNode()
            float r3 = r3.getGlobalY()
            r0.setPosition(r1, r3)
        L1cf:
            float r0 = r7._localAngle
            r7._angle = r0
            r7._x = r2
            r7._y = r2
        L1d7:
            r0 = 0
            r7._flipFlag = r0
            r7._positionIsDirty = r0
            boolean r0 = r7.isJoinAnchor()
            if (r0 == 0) goto L1fe
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r7._joinedFigureRefs
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1ea:
            if (r0 < 0) goto L1fe
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r7._joinedFigureRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getMainNode()
            r1.flagPositionAsDirty()
            int r0 = r0 + (-1)
            goto L1ea
        L1fe:
            boolean r0 = r7.isPolyfillAnchor()
            if (r0 == 0) goto L207
            r7.polyfillAnchorPolynodeIsDirty(r7)
        L207:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r7._polyAnchorParentRefs
            if (r0 == 0) goto L221
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L211:
            if (r0 < 0) goto L221
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r7._polyAnchorParentRefs
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.polyfillAnchorPolynodeIsDirty(r7)
            int r0 = r0 + (-1)
            goto L211
        L221:
            return
    }

    public void useGradient(boolean r1) {
            r0 = this;
            r0.setValUseGradient(r1)
            r0.updateColorReferences()
            return
    }

    public void useSegmentColor(boolean r1) {
            r0 = this;
            r0.setValUseSegmentColor(r1)
            r0.updateColorReferences()
            return
    }

    public void useSegmentScale(boolean r1) {
            r0 = this;
            r0.setValUseSegmentScale(r1)
            r0.flagPositionAsDirty()
            return
    }

    public void validatePosition() {
            r4 = this;
            boolean r0 = r4._positionIsDirty
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._parentNodeRef
            if (r0 == 0) goto L1b
            boolean r1 = r0._positionIsDirty
            if (r1 == 0) goto L1b
        Ld:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r0._parentNodeRef
            if (r1 == 0) goto L17
            boolean r2 = r0._positionIsDirty
            if (r2 == 0) goto L17
            r0 = r1
            goto Ld
        L17:
            r0.validatePosition()
            return
        L1b:
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            r0.push(r4)
        L26:
            boolean r1 = r0.empty()
            if (r1 != 0) goto L67
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r1.updatePosition()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r1._childrenNodes
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3d:
            if (r2 < 0) goto L4d
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r1._childrenNodes
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L3d
        L4d:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r2 = r1.mConnectorAttachments
            if (r2 == 0) goto L26
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L57:
            if (r2 < 0) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Connector> r3 = r1.mConnectorAttachments
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.push(r3)
            int r2 = r2 + (-1)
            goto L57
        L67:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            return
    }

    protected void writeData(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.getValLimbType()
            r3.write(r0)
            int r0 = r2.getValDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2.getValIsStatic()
            r3.write(r0)
            boolean r0 = r2.getValIsStretchy()
            r3.write(r0)
            boolean r0 = r2.getValIsFloaty()
            r3.write(r0)
            boolean r0 = r2.getValIsSmartStretch()
            r3.write(r0)
            boolean r0 = r2.getValSmartStretchDoNotApply()
            r3.write(r0)
            boolean r0 = r2.getValSmartStretchResetImpulse()
            r3.write(r0)
            boolean r0 = r2.getValUseSegmentColor()
            r3.write(r0)
            boolean r0 = r2.getValUseCircleOutline()
            r3.write(r0)
            boolean r0 = r2.getValCircleIsHollow()
            r3.write(r0)
            boolean r0 = r2.getValUseGradient()
            r3.write(r0)
            boolean r0 = r2.mGradientReversed
            r3.write(r0)
            short r0 = r2.getValGradientMode()
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r3)
            boolean r0 = r2.getValUseSegmentScale()
            r3.write(r0)
            float r0 = r2._localX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._localY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValSegmentScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValDefaultLength()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValLength()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            int r0 = r2.getValDefaultThickness()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2.getValThickness()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r2._curveRadius
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2.getValSegmentCurveCirculization()
            r3.write(r0)
            short r0 = r2.getValSegmentCurvePolyfillPrecision()
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r3)
            boolean r0 = r2.getValHalfArc()
            r3.write(r0)
            short r0 = r2._rightTriangleDirection
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r3)
            boolean r0 = r2.getValTriangleUpsideDown()
            r3.write(r0)
            float r0 = r2.getValTrapezoidThickness1()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValTrapezoidThickness2()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValTrapezoidRatio()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            boolean r0 = r2.getValTrapezoidIsRounded1()
            r3.write(r0)
            boolean r0 = r2.getValTrapezoidIsRounded2()
            r3.write(r0)
            short r0 = r2.getValNumPolygonVertices()
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r3)
            float r0 = r2._defaultLocalAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._localAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2._defaultAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.getValColorSegment()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.getValColorGradient()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            com.badlogic.gdx.graphics.Color r0 = r2.getValColorCircleOutline()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            boolean r0 = r2.getValIsAngleLocked()
            r3.write(r0)
            boolean r0 = r2.getValAngleLockIsMainNode()
            r3.write(r0)
            float r0 = r2.mAngleLockOffset
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValAngleLockRelativeStart()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValAngleLockStickfigureStart()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            byte r0 = r2.getValAngleLockRelativeMultiplier()
            r3.write(r0)
            boolean r0 = r2.mIsDragLocked
            r3.write(r0)
            float r0 = r2.mDragLockAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            float r0 = r2.getValSmartStretchMultiplier()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r2._childrenNodes
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r3)
            int r0 = r0 + (-1)
        L158:
            if (r0 < 0) goto L168
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._childrenNodes
            java.lang.Object r1 = r1.get(r0)
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r3)
            int r0 = r0 + (-1)
            goto L158
        L168:
            return
    }

    public void writePolyfillAnchorData(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.isPolyfillAnchor()
            if (r0 == 0) goto L3d
            com.badlogic.gdx.graphics.Color r0 = r3.getValColorPolyfill()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            boolean r0 = r3.getValUsePolyfillColor()
            r4.write(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r3._polynodeChildrenRefs
            int r0 = r0.size()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            r0 = 0
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r3._polynodeChildrenRefs
            int r1 = r1.size()
        L28:
            if (r0 >= r1) goto L3c
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r3._polynodeChildrenRefs
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            int r2 = r2.getDrawOrderIndex()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r4)
            int r0 = r0 + 1
            goto L28
        L3c:
            return
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't write polyfill anchor data from a node that isn't a polyfill anchor."
            r4.<init>(r0)
            throw r4
    }

    protected void writePositionalData(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.getValIsStretchy()
            r2.write(r0)
            boolean r0 = r1.getValIsFloaty()
            r2.write(r0)
            boolean r0 = r1.getValUseSegmentColor()
            r2.write(r0)
            boolean r0 = r1.getValUseCircleOutline()
            r2.write(r0)
            boolean r0 = r1.getValCircleIsHollow()
            r2.write(r0)
            boolean r0 = r1.getValUseGradient()
            r2.write(r0)
            boolean r0 = r1.mGradientReversed
            r2.write(r0)
            short r0 = r1.getValGradientMode()
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r2)
            boolean r0 = r1.getValUseSegmentScale()
            r2.write(r0)
            float r0 = r1.getValSegmentScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.getValLength()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            int r0 = r1.getValThickness()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            float r0 = r1._localAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1._defaultLocalAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1._defaultAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorSegment()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorGradient()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorCircleOutline()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            boolean r0 = r1.getValUsePolyfillColor()
            r2.write(r0)
            com.badlogic.gdx.graphics.Color r0 = r1.getValColorPolyfill()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            short r0 = r1._rightTriangleDirection
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r2)
            int r0 = r1._curveRadius
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r2)
            boolean r0 = r1.getValSegmentCurveCirculization()
            r2.write(r0)
            short r0 = r1.getValSegmentCurvePolyfillPrecision()
            org.fortheloss.sticknodes.App.writeShortToOutputStream(r0, r2)
            float r0 = r1.getValTrapezoidThickness1()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.getValTrapezoidThickness2()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            boolean r0 = r1.getValTrapezoidIsRounded1()
            r2.write(r0)
            boolean r0 = r1.getValTrapezoidIsRounded2()
            r2.write(r0)
            float r0 = r1.getValTrapezoidRatio()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            float r0 = r1.mAngleLockOffset
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            boolean r0 = r1.mIsDragLocked
            r2.write(r0)
            float r0 = r1.mDragLockAngle
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r2)
            return
    }
}
