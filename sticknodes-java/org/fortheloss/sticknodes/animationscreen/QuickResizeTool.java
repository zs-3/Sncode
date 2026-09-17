package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class QuickResizeTool extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.math.Vector2 _activeRotationPositionRef;
    private com.badlogic.gdx.math.Vector2 _activeScalePositionRef;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _backwardButton;
    private float _buttonRotation;
    private float _buttonRotationAccumulator;
    private int _buttonState;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _clickListener;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationCopyButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationCopySingleButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationDeleteButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationDeleteSingleButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationPasteButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _creationPasteButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup _creationRoot;
    private boolean _deadzoneComplete;
    private float _deadzoneRadiusSquared;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _dot;
    private com.badlogic.gdx.math.Vector2 _dragPosition;
    private boolean _enabled;
    private boolean _enabledDuringDrag;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _figureCopyButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _figurePasteButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _forwardButton;
    private com.badlogic.gdx.graphics.g2d.GlyphLayout _glyphLayout;
    private boolean _isDisposed;
    private boolean _isToggledOn;
    private float _lastButtonRotation;
    private int _objectStartCurve;
    private float _objectStartLength;
    private float _objectStartRotation;
    private float _objectStartScale;
    private int _objectStartThickness;
    private float _objectTrapezoidForceRatio;
    private float _objectTrapezoidThickness;
    private com.badlogic.gdx.graphics.g2d.BitmapFont _outlineBitmapFont;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _pressedButtonRef;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _rotateButton;
    private com.badlogic.gdx.math.Vector2 _rotatePosition1;
    private com.badlogic.gdx.math.Vector2 _rotatePosition2;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _scaleButton;
    private com.badlogic.gdx.math.Vector2 _scalePosition1;
    private com.badlogic.gdx.math.Vector2 _scalePosition2;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryCurveButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryDragModeButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryLockButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryParentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup _secondaryRoot;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryRotateButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryStaticButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryStretchyButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _secondaryThicknessButton;
    private int _showState;
    private boolean _showStateSS;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _spriteDragModeButton;
    private org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton _spriteLinkButton;
    private org.fortheloss.sticknodes.animationscreen.IStageObject _stageObjectRef;
    private com.badlogic.gdx.math.Vector2 _startPosition;
    private org.fortheloss.sticknodes.stickfigure.StickNode _stickNodeRef;
    private com.badlogic.gdx.math.Vector2 _tempVector1;
    private com.badlogic.gdx.math.Vector2 _tempVector2;


    private static class QuickButton extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
        private com.badlogic.gdx.graphics.g2d.TextureRegion _trBackground;
        private com.badlogic.gdx.graphics.g2d.TextureRegion _trBubble;
        private com.badlogic.gdx.graphics.g2d.TextureRegion _trIcon;

        public QuickButton(com.badlogic.gdx.graphics.g2d.TextureRegion r2, com.badlogic.gdx.graphics.g2d.TextureRegion r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public QuickButton(com.badlogic.gdx.graphics.g2d.TextureRegion r1, com.badlogic.gdx.graphics.g2d.TextureRegion r2, com.badlogic.gdx.graphics.g2d.TextureRegion r3) {
                r0 = this;
                r0.<init>()
                r0._trBackground = r1
                r0._trIcon = r2
                r0._trBubble = r3
                int r1 = r1.getRegionWidth()
                com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trIcon
                int r2 = r2.getRegionWidth()
                int r1 = java.lang.Math.max(r1, r2)
                float r1 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trBackground
                int r2 = r2.getRegionHeight()
                com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r0._trIcon
                int r3 = r3.getRegionHeight()
                int r2 = java.lang.Math.max(r2, r3)
                float r2 = (float) r2
                r0.setSize(r1, r2)
                float r1 = r0.getWidth()
                r2 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 * r2
                float r3 = r0.getHeight()
                float r3 = r3 * r2
                r0.setOrigin(r1, r3)
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1._trBackground = r0
                r1._trIcon = r0
                r1._trBubble = r0
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
        public void draw(com.badlogic.gdx.graphics.g2d.Batch r16, float r17) {
                r15 = this;
                r0 = r15
                r12 = r16
                super.draw(r16, r17)
                com.badlogic.gdx.graphics.Color r13 = r15.getColor()
                float r1 = r13.r
                float r2 = r13.g
                float r3 = r13.b
                float r4 = r13.a
                float r4 = r4 * r17
                r12.setColor(r1, r2, r3, r4)
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trBackground
                int r1 = r1.getRegionWidth()
                float r7 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trBackground
                int r1 = r1.getRegionHeight()
                float r8 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trBackground
                float r1 = r15.getX()
                float r3 = r15.getOriginX()
                float r1 = r1 + r3
                r14 = 1056964608(0x3f000000, float:0.5)
                float r5 = r7 * r14
                float r3 = r1 - r5
                float r1 = r15.getY()
                float r4 = r15.getOriginY()
                float r1 = r1 + r4
                float r6 = r8 * r14
                float r4 = r1 - r6
                float r9 = r15.getScaleX()
                float r10 = r15.getScaleY()
                r11 = 0
                r1 = r16
                r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trBubble
                if (r1 == 0) goto L9b
                int r1 = r1.getRegionWidth()
                float r7 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trBubble
                int r1 = r1.getRegionHeight()
                float r8 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trBubble
                float r1 = r15.getX()
                r3 = 1117519872(0x429c0000, float:78.0)
                float r4 = org.fortheloss.sticknodes.App.assetScaling
                float r4 = r4 * r3
                float r3 = r1 + r4
                float r1 = r15.getY()
                r4 = 1106247680(0x41f00000, float:30.0)
                float r5 = org.fortheloss.sticknodes.App.assetScaling
                float r5 = r5 * r4
                float r4 = r1 + r5
                float r1 = r15.getX()
                float r5 = r15.getOriginX()
                float r5 = r5 + r1
                float r1 = r15.getY()
                float r6 = r15.getOriginY()
                float r6 = r6 + r1
                float r9 = r15.getScaleX()
                float r10 = r15.getScaleY()
                r11 = 0
                r1 = r16
                r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L9b:
                float r1 = r13.r
                float r2 = r13.g
                float r3 = r13.b
                float r4 = r13.a
                r5 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 - r4
                r6 = 1048576000(0x3e800000, float:0.25)
                float r5 = r5 * r6
                float r5 = r5 * r17
                float r4 = r4 + r5
                r12.setColor(r1, r2, r3, r4)
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trIcon
                int r1 = r1.getRegionWidth()
                float r7 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._trIcon
                int r1 = r1.getRegionHeight()
                float r8 = (float) r1
                com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._trIcon
                float r1 = r15.getX()
                float r3 = r15.getOriginX()
                float r1 = r1 + r3
                float r5 = r7 * r14
                float r3 = r1 - r5
                float r1 = r15.getY()
                float r4 = r15.getOriginY()
                float r1 = r1 + r4
                float r6 = r8 * r14
                float r4 = r1 - r6
                float r9 = r15.getScaleX()
                float r10 = r15.getScaleY()
                float r11 = r15.getRotation()
                r1 = r16
                r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
        public float getPrefHeight() {
                r1 = this;
                float r0 = r1.getHeight()
                return r0
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
        public float getPrefWidth() {
                r1 = this;
                float r0 = r1.getWidth()
                return r0
        }

        @Override // com.badlogic.gdx.scenes.scene2d.Actor
        public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
                r2 = this;
                r0 = 0
                if (r5 == 0) goto Lc
                com.badlogic.gdx.scenes.scene2d.Touchable r5 = r2.getTouchable()
                com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                if (r5 == r1) goto Lc
                return r0
            Lc:
                boolean r5 = r2.isVisible()
                if (r5 != 0) goto L13
                return r0
            L13:
                r5 = 1101004800(0x41a00000, float:20.0)
                float r1 = org.fortheloss.sticknodes.App.assetScaling
                float r1 = r1 * r5
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 < 0) goto L34
                float r5 = r2.getWidth()
                float r5 = r5 - r1
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 >= 0) goto L34
                int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r3 < 0) goto L34
                float r3 = r2.getHeight()
                float r3 = r3 - r1
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 >= 0) goto L34
                r0 = r2
            L34:
                return r0
        }
    }

    /* renamed from: -$$Nest$fget_backwardButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m249$$Nest$fget_backwardButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._backwardButton
            return r0
    }

    /* renamed from: -$$Nest$fget_buttonState, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m250$$Nest$fget_buttonState(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            int r0 = r0._buttonState
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m251$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_creationCopyButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m252$$Nest$fget_creationCopyButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationCopyButton
            return r0
    }

    /* renamed from: -$$Nest$fget_creationCopySingleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m253$$Nest$fget_creationCopySingleButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationCopySingleButton
            return r0
    }

    /* renamed from: -$$Nest$fget_creationDeleteButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m254$$Nest$fget_creationDeleteButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationDeleteButton
            return r0
    }

    /* renamed from: -$$Nest$fget_creationDeleteSingleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m255$$Nest$fget_creationDeleteSingleButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationDeleteSingleButton
            return r0
    }

    /* renamed from: -$$Nest$fget_creationPasteButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m256$$Nest$fget_creationPasteButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationPasteButton
            return r0
    }

    /* renamed from: -$$Nest$fget_creationPasteButton2, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m257$$Nest$fget_creationPasteButton2(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._creationPasteButton2
            return r0
    }

    /* renamed from: -$$Nest$fget_deadzoneComplete, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m258$$Nest$fget_deadzoneComplete(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            boolean r0 = r0._deadzoneComplete
            return r0
    }

    /* renamed from: -$$Nest$fget_deadzoneRadiusSquared, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m259$$Nest$fget_deadzoneRadiusSquared(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            float r0 = r0._deadzoneRadiusSquared
            return r0
    }

    /* renamed from: -$$Nest$fget_dragPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m260$$Nest$fget_dragPosition(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._dragPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_figureCopyButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m261$$Nest$fget_figureCopyButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._figureCopyButton
            return r0
    }

    /* renamed from: -$$Nest$fget_figurePasteButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m262$$Nest$fget_figurePasteButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._figurePasteButton
            return r0
    }

    /* renamed from: -$$Nest$fget_forwardButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m263$$Nest$fget_forwardButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._forwardButton
            return r0
    }

    /* renamed from: -$$Nest$fget_isDisposed, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m264$$Nest$fget_isDisposed(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            boolean r0 = r0._isDisposed
            return r0
    }

    /* renamed from: -$$Nest$fget_objectStartCurve, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m265$$Nest$fget_objectStartCurve(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            int r0 = r0._objectStartCurve
            return r0
    }

    /* renamed from: -$$Nest$fget_objectStartLength, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m266$$Nest$fget_objectStartLength(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            float r0 = r0._objectStartLength
            return r0
    }

    /* renamed from: -$$Nest$fget_objectStartScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m267$$Nest$fget_objectStartScale(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            float r0 = r0._objectStartScale
            return r0
    }

    /* renamed from: -$$Nest$fget_objectStartThickness, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m268$$Nest$fget_objectStartThickness(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            int r0 = r0._objectStartThickness
            return r0
    }

    /* renamed from: -$$Nest$fget_objectTrapezoidForceRatio, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m269$$Nest$fget_objectTrapezoidForceRatio(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            float r0 = r0._objectTrapezoidForceRatio
            return r0
    }

    /* renamed from: -$$Nest$fget_objectTrapezoidThickness, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m270$$Nest$fget_objectTrapezoidThickness(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            float r0 = r0._objectTrapezoidThickness
            return r0
    }

    /* renamed from: -$$Nest$fget_pressedButtonRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m271$$Nest$fget_pressedButtonRef(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._pressedButtonRef
            return r0
    }

    /* renamed from: -$$Nest$fget_rotateButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m272$$Nest$fget_rotateButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._rotateButton
            return r0
    }

    /* renamed from: -$$Nest$fget_scaleButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m273$$Nest$fget_scaleButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._scaleButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryCurveButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m274$$Nest$fget_secondaryCurveButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryCurveButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryDragModeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m275$$Nest$fget_secondaryDragModeButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryDragModeButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryLockButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m276$$Nest$fget_secondaryLockButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryLockButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryParentButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m277$$Nest$fget_secondaryParentButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryParentButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryRotateButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m278$$Nest$fget_secondaryRotateButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryRotateButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryStaticButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m279$$Nest$fget_secondaryStaticButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryStaticButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryStretchyButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m280$$Nest$fget_secondaryStretchyButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryStretchyButton
            return r0
    }

    /* renamed from: -$$Nest$fget_secondaryThicknessButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m281$$Nest$fget_secondaryThicknessButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._secondaryThicknessButton
            return r0
    }

    /* renamed from: -$$Nest$fget_spriteDragModeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m282$$Nest$fget_spriteDragModeButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._spriteDragModeButton
            return r0
    }

    /* renamed from: -$$Nest$fget_spriteLinkButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton m283$$Nest$fget_spriteLinkButton(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r0._spriteLinkButton
            return r0
    }

    /* renamed from: -$$Nest$fget_stageObjectRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.IStageObject m284$$Nest$fget_stageObjectRef(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r0._stageObjectRef
            return r0
    }

    /* renamed from: -$$Nest$fget_startPosition, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.math.Vector2 m285$$Nest$fget_startPosition(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            com.badlogic.gdx.math.Vector2 r0 = r0._startPosition
            return r0
    }

    /* renamed from: -$$Nest$fget_stickNodeRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.StickNode m286$$Nest$fget_stickNodeRef(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0._stickNodeRef
            return r0
    }

    /* renamed from: -$$Nest$fput_buttonRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m287$$Nest$fput_buttonRotation(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._buttonRotation = r1
            return
    }

    /* renamed from: -$$Nest$fput_buttonRotationAccumulator, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m288$$Nest$fput_buttonRotationAccumulator(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._buttonRotationAccumulator = r1
            return
    }

    /* renamed from: -$$Nest$fput_buttonState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m289$$Nest$fput_buttonState(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, int r1) {
            r0._buttonState = r1
            return
    }

    /* renamed from: -$$Nest$fput_deadzoneComplete, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m290$$Nest$fput_deadzoneComplete(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, boolean r1) {
            r0._deadzoneComplete = r1
            return
    }

    /* renamed from: -$$Nest$fput_lastButtonRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m291$$Nest$fput_lastButtonRotation(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._lastButtonRotation = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectStartCurve, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m292$$Nest$fput_objectStartCurve(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, int r1) {
            r0._objectStartCurve = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectStartLength, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m293$$Nest$fput_objectStartLength(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._objectStartLength = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectStartRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m294$$Nest$fput_objectStartRotation(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._objectStartRotation = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectStartScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m295$$Nest$fput_objectStartScale(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._objectStartScale = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectStartThickness, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m296$$Nest$fput_objectStartThickness(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, int r1) {
            r0._objectStartThickness = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectTrapezoidForceRatio, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m297$$Nest$fput_objectTrapezoidForceRatio(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._objectTrapezoidForceRatio = r1
            return
    }

    /* renamed from: -$$Nest$fput_objectTrapezoidThickness, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m298$$Nest$fput_objectTrapezoidThickness(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, float r1) {
            r0._objectTrapezoidThickness = r1
            return
    }

    /* renamed from: -$$Nest$fput_pressedButtonRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m299$$Nest$fput_pressedButtonRef(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, org.fortheloss.sticknodes.animationscreen.QuickResizeTool.QuickButton r1) {
            r0._pressedButtonRef = r1
            return
    }

    /* renamed from: -$$Nest$mdoFigureRotate, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m300$$Nest$mdoFigureRotate(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, boolean r1) {
            r0.doFigureRotate(r1)
            return
    }

    /* renamed from: -$$Nest$mdoNodeDragLockRotate, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m301$$Nest$mdoNodeDragLockRotate(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, boolean r1) {
            r0.doNodeDragLockRotate(r1)
            return
    }

    /* renamed from: -$$Nest$mdoNodeRotate, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m302$$Nest$mdoNodeRotate(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0, boolean r1) {
            r0.doNodeRotate(r1)
            return
    }

    /* renamed from: -$$Nest$mobjectSnapRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m303$$Nest$mobjectSnapRotation(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            r0.objectSnapRotation()
            return
    }

    /* renamed from: -$$Nest$msnapNodeRotation, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m304$$Nest$msnapNodeRotation(org.fortheloss.sticknodes.animationscreen.QuickResizeTool r0) {
            r0.snapNodeRotation()
            return
    }

    public QuickResizeTool(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r19, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r20, com.badlogic.gdx.graphics.g2d.TextureAtlas r21, com.badlogic.gdx.graphics.g2d.BitmapFont r22) {
            r18 = this;
            r0 = r18
            r1 = r21
            r18.<init>()
            r2 = 0
            r0._objectStartCurve = r2
            r0._objectStartThickness = r2
            r3 = 0
            r0._objectTrapezoidThickness = r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r0._objectTrapezoidForceRatio = r4
            r0._objectStartLength = r3
            r0._objectStartScale = r3
            r0._objectStartRotation = r3
            r0._buttonRotation = r3
            r0._lastButtonRotation = r3
            r0._buttonRotationAccumulator = r3
            r0._buttonState = r2
            r5 = -1
            r0._showState = r5
            r0._showStateSS = r2
            r5 = 1
            r0._enabled = r5
            r0._enabledDuringDrag = r5
            r0._isToggledOn = r5
            r0._isDisposed = r2
            r0._deadzoneComplete = r2
            r0._deadzoneRadiusSquared = r3
            r6 = r19
            r0._canvasModuleRef = r6
            r6 = r20
            r0._createToolsModuleRef = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>()
            r0._tempVector1 = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>()
            r0._tempVector2 = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>()
            r0._startPosition = r6
            com.badlogic.gdx.math.Vector2 r6 = new com.badlogic.gdx.math.Vector2
            r6.<init>()
            r0._dragPosition = r6
            java.lang.String r6 = "a_quick_button_main"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r6)
            java.lang.String r7 = "a_quick_button_secondary"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r7)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r8 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r9 = "b_quick_secondary_node_paste"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r1.findRegion(r9)
            r8.<init>(r6, r10)
            r0._creationPasteButton2 = r8
            r10 = 1055286886(0x3ee66666, float:0.45)
            r8.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r8 = r0._creationPasteButton2
            float r11 = r8.getWidth()
            float r11 = -r11
            r12 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r12
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r14 = -1018691584(0xffffffffc3480000, float:-200.0)
            float r13 = r13 * r14
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r15 = r0._creationPasteButton2
            float r15 = r15.getHeight()
            r16 = 1061158912(0x3f400000, float:0.75)
            float r15 = r15 * r16
            float r13 = r13 - r15
            r8.setPosition(r11, r13)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r8 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r11 = "a_quick_main_scale"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r1.findRegion(r11)
            r8.<init>(r6, r11)
            r0._scaleButton = r8
            com.badlogic.gdx.math.Vector2 r8 = new com.badlogic.gdx.math.Vector2
            r11 = 1126170624(0x43200000, float:160.0)
            float r13 = com.badlogic.gdx.math.MathUtils.cosDeg(r11)
            r15 = 1128792064(0x43480000, float:200.0)
            float r13 = r13 * r15
            float r16 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r16
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._scaleButton
            float r2 = r2.getWidth()
            float r2 = r2 * r12
            float r13 = r13 - r2
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r11)
            float r2 = r2 * r15
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._scaleButton
            float r11 = r11.getHeight()
            float r11 = r11 * r12
            float r2 = r2 - r11
            r8.<init>(r13, r2)
            r0._scalePosition1 = r8
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r14
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._scaleButton
            float r11 = r11.getWidth()
            float r11 = r11 * r12
            float r8 = r8 - r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._scaleButton
            float r11 = r11.getHeight()
            float r11 = -r11
            float r11 = r11 * r12
            r2.<init>(r8, r11)
            r0._scalePosition2 = r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._scaleButton
            com.badlogic.gdx.math.Vector2 r8 = r0._scalePosition1
            float r11 = r8.x
            float r8 = r8.y
            r2.setPosition(r11, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._scaleButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "e_quick_main_sprite_linked"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r8)
            r2.<init>(r6, r8)
            r0._spriteLinkButton = r2
            com.badlogic.gdx.math.Vector2 r8 = r0._scalePosition1
            float r11 = r8.x
            float r8 = r8.y
            r2.setPosition(r11, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._spriteLinkButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "g_quick_main_sprite_drag_mode"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r8)
            r2.<init>(r6, r8)
            r0._spriteDragModeButton = r2
            com.badlogic.gdx.math.Vector2 r8 = r0._scalePosition1
            float r11 = r8.x
            float r8 = r8.y
            r2.setPosition(r11, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._spriteDragModeButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "a_quick_main_rotation"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r8)
            r2.<init>(r6, r8)
            r0._rotateButton = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            r8 = 1101004800(0x41a00000, float:20.0)
            float r11 = com.badlogic.gdx.math.MathUtils.cosDeg(r8)
            float r11 = r11 * r15
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._rotateButton
            float r13 = r13.getWidth()
            float r13 = r13 * r12
            float r11 = r11 - r13
            float r8 = com.badlogic.gdx.math.MathUtils.sinDeg(r8)
            float r8 = r8 * r15
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._rotateButton
            float r13 = r13.getHeight()
            float r13 = r13 * r12
            float r8 = r8 - r13
            r2.<init>(r11, r8)
            r0._rotatePosition1 = r2
            com.badlogic.gdx.math.Vector2 r2 = new com.badlogic.gdx.math.Vector2
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r15
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._rotateButton
            float r11 = r11.getWidth()
            float r11 = r11 * r12
            float r8 = r8 - r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._rotateButton
            float r11 = r11.getHeight()
            float r11 = -r11
            float r11 = r11 * r12
            r2.<init>(r8, r11)
            r0._rotatePosition2 = r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._rotateButton
            com.badlogic.gdx.math.Vector2 r8 = r0._rotatePosition1
            float r11 = r8.x
            float r8 = r8.y
            r2.setPosition(r11, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._rotateButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "a_quick_main_push_forward"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r8)
            r2.<init>(r6, r8)
            r0._forwardButton = r2
            r8 = 1135214592(0x43aa0000, float:340.0)
            float r11 = com.badlogic.gdx.math.MathUtils.cosDeg(r8)
            float r11 = r11 * r15
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._forwardButton
            float r13 = r13.getWidth()
            float r13 = r13 * r12
            float r11 = r11 - r13
            float r8 = com.badlogic.gdx.math.MathUtils.sinDeg(r8)
            float r8 = r8 * r15
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._forwardButton
            float r13 = r13.getHeight()
            float r13 = r13 * r12
            float r8 = r8 - r13
            r2.setPosition(r11, r8)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._forwardButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "a_quick_main_push_backward"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r1.findRegion(r8)
            r2.<init>(r6, r8)
            r0._backwardButton = r2
            float r8 = com.badlogic.gdx.math.MathUtils.cosDeg(r15)
            float r8 = r8 * r15
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._backwardButton
            float r11 = r11.getWidth()
            float r11 = r11 * r12
            float r8 = r8 - r11
            float r11 = com.badlogic.gdx.math.MathUtils.sinDeg(r15)
            float r11 = r11 * r15
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._backwardButton
            float r13 = r13.getHeight()
            float r13 = r13 * r12
            float r11 = r11 - r13
            r2.setPosition(r8, r11)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._backwardButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r8 = "b_quick_secondary_node_copy"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r1.findRegion(r8)
            r2.<init>(r6, r11)
            r0._figureCopyButton = r2
            r11 = 1127481344(0x43340000, float:180.0)
            float r13 = com.badlogic.gdx.math.MathUtils.cosDeg(r11)
            float r13 = r13 * r15
            r14 = 1069547520(0x3fc00000, float:1.5)
            float r13 = r13 * r14
            float r17 = org.fortheloss.sticknodes.App.assetScaling
            float r13 = r13 * r17
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._figureCopyButton
            float r5 = r5.getWidth()
            float r5 = r5 * r12
            float r13 = r13 - r5
            float r5 = com.badlogic.gdx.math.MathUtils.sinDeg(r11)
            float r5 = r5 * r15
            float r5 = r5 * r14
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._figureCopyButton
            float r11 = r11.getHeight()
            float r11 = r11 * r12
            float r5 = r5 - r11
            r2.setPosition(r13, r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._figureCopyButton
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r9)
            r2.<init>(r6, r5)
            r0._figurePasteButton = r2
            float r5 = com.badlogic.gdx.math.MathUtils.cosDeg(r3)
            float r5 = r5 * r15
            float r5 = r5 * r14
            float r11 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r11
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r11 = r0._figurePasteButton
            float r11 = r11.getWidth()
            float r11 = r11 * r12
            float r5 = r5 - r11
            float r11 = com.badlogic.gdx.math.MathUtils.sinDeg(r3)
            float r11 = r11 * r15
            float r11 = r11 * r14
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            float r11 = r11 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r13 = r0._figurePasteButton
            float r13 = r13.getHeight()
            float r13 = r13 * r12
            float r11 = r11 - r13
            r2.setPosition(r5, r11)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._figurePasteButton
            r2.setColor(r4, r4, r4, r10)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r2.<init>()
            r0._secondaryRoot = r2
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r2.space(r3)
            r5 = 1
            r2.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            r5 = 0
            r2.setTransform(r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "g_quick_secondary_jump_to_parent"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryParentButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "a_quick_secondary_curve"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryCurveButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "a_quick_secondary_thickness"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryThicknessButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "h_quick_secondary_lock"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryLockButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "h_quick_secondary_drag_lock"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryDragModeButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "a_quick_secondary_static"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryStaticButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "a_quick_secondary_stretch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryStretchyButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "a_quick_secondary_rotation"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r7, r5)
            r0._secondaryRotateButton = r2
            r2.setColor(r4, r4, r4, r10)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryParentButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryCurveButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryThicknessButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryLockButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryDragModeButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryStaticButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryStretchyButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r0._secondaryRotateButton
            r2.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r2.<init>()
            r0._creationRoot = r2
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r2.space(r3)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r2.align(r5)
            r2.rowTop()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._creationRoot
            r5 = 0
            r2.setTransform(r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r8)
            r2.<init>(r6, r5)
            r0._creationCopyButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "b_quick_secondary_node_copy_single"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r6, r5)
            r0._creationCopySingleButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r9)
            r2.<init>(r6, r5)
            r0._creationPasteButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "b_quick_secondary_node_delete"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r6, r5)
            r0._creationDeleteButton = r2
            r2.setColor(r4, r4, r4, r10)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton
            java.lang.String r5 = "b_quick_secondary_node_delete_single"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r2.<init>(r6, r5)
            r0._creationDeleteSingleButton = r2
            r2.setColor(r4, r4, r4, r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r2.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r2.space(r3)
            r5 = 1
            r4.align(r5)
            r4 = 0
            r2.setTransform(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r6.space(r3)
            r3.align(r5)
            r6.setTransform(r4)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r0._creationCopyButton
            r2.addActor(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r0._creationCopySingleButton
            r2.addActor(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r0._creationDeleteButton
            r6.addActor(r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r0._creationDeleteSingleButton
            r6.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r0._creationRoot
            r3.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._creationRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r0._creationPasteButton
            r2.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._creationRoot
            r2.addActor(r6)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._scaleButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._spriteLinkButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._rotateButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._spriteDragModeButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._forwardButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._backwardButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._figureCopyButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._figurePasteButton
            r0.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r0._creationPasteButton2
            r0.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._secondaryRoot
            r0.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r0._creationRoot
            r0.addActor(r2)
            r2 = r22
            r0._outlineBitmapFont = r2
            com.badlogic.gdx.graphics.g2d.GlyphLayout r2 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r2.<init>()
            r0._glyphLayout = r2
            java.lang.String r2 = "a_dot"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r0._dot = r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$1 r1 = new org.fortheloss.sticknodes.animationscreen.QuickResizeTool$1
            r1.<init>(r0)
            r0._clickListener = r1
            r1 = 0
            r0.setTransform(r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r2)
            r2 = 3
            r0.setShowing(r2)
            r0._deadzoneComplete = r1
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            float r1 = r1.getPpiX()
            r2 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r2
            float r1 = r1 * r1
            r0._deadzoneRadiusSquared = r1
            return
    }

    private int boundAngle(float r2) {
            r1 = this;
            int r2 = java.lang.Math.round(r2)
        L4:
            if (r2 >= 0) goto L9
            int r2 = r2 + 360
            goto L4
        L9:
            r0 = 360(0x168, float:5.04E-43)
            if (r2 < r0) goto L10
            int r2 = r2 + (-360)
            goto L9
        L10:
            return r2
    }

    private void doFigureRotate(boolean r6) {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._rotateButton
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r5._rotateButton
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r5._rotateButton
            float r2 = r2.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r5._rotateButton
            float r4 = r4.getHeight()
            float r4 = r4 * r3
            float r1 = r1 + r4
            com.badlogic.gdx.math.Vector2 r3 = r5._dragPosition
            float r4 = r3.y
            float r1 = r1 - r4
            float r0 = r0 + r2
            float r2 = r3.x
            float r0 = r0 - r2
            float r0 = com.badlogic.gdx.math.MathUtils.atan2(r1, r0)
            r1 = 1113927392(0x42652ee0, float:57.295776)
            float r0 = r0 * r1
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 - r1
            r5._buttonRotation = r0
            float r1 = r5._buttonRotationAccumulator
            float r2 = r5._lastButtonRotation
            float r0 = r5.getAngleDifference(r0, r2)
            float r1 = r1 - r0
            r5._buttonRotationAccumulator = r1
            float r0 = r5._buttonRotation
            r5._lastButtonRotation = r0
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r5._stageObjectRef
            float r2 = r5._objectStartRotation
            r3 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r3
            r5.onRotationDrag(r0, r2, r1, r6)
            return
    }

    private void doNodeDragLockRotate(boolean r6) {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            if (r0 == 0) goto L62
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r5._secondaryRoot
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r5._secondaryDragModeButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r5._secondaryRoot
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r5._secondaryDragModeButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r5._secondaryDragModeButton
            float r2 = r2.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r5._secondaryDragModeButton
            float r4 = r4.getHeight()
            float r4 = r4 * r3
            float r1 = r1 + r4
            com.badlogic.gdx.math.Vector2 r3 = r5._dragPosition
            float r4 = r3.y
            float r1 = r1 - r4
            float r0 = r0 + r2
            float r2 = r3.x
            float r0 = r0 - r2
            float r0 = com.badlogic.gdx.math.MathUtils.atan2(r1, r0)
            r1 = 1113927392(0x42652ee0, float:57.295776)
            float r0 = r0 * r1
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 - r1
            r5._buttonRotation = r0
            float r1 = r5._buttonRotationAccumulator
            float r2 = r5._lastButtonRotation
            float r0 = r5.getAngleDifference(r0, r2)
            float r1 = r1 - r0
            r5._buttonRotationAccumulator = r1
            float r0 = r5._buttonRotation
            r5._lastButtonRotation = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            float r2 = r5._objectStartRotation
            r3 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r3
            r5.onNodeDragLockRotation(r0, r2, r1, r6)
        L62:
            return
    }

    private void doNodeRotate(boolean r6) {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            if (r0 == 0) goto L62
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r5._secondaryRoot
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r5._secondaryRotateButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r5._secondaryRoot
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r5._secondaryRotateButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r5._secondaryRotateButton
            float r2 = r2.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r5._secondaryRotateButton
            float r4 = r4.getHeight()
            float r4 = r4 * r3
            float r1 = r1 + r4
            com.badlogic.gdx.math.Vector2 r3 = r5._dragPosition
            float r4 = r3.y
            float r1 = r1 - r4
            float r0 = r0 + r2
            float r2 = r3.x
            float r0 = r0 - r2
            float r0 = com.badlogic.gdx.math.MathUtils.atan2(r1, r0)
            r1 = 1113927392(0x42652ee0, float:57.295776)
            float r0 = r0 * r1
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 - r1
            r5._buttonRotation = r0
            float r1 = r5._buttonRotationAccumulator
            float r2 = r5._lastButtonRotation
            float r0 = r5.getAngleDifference(r0, r2)
            float r1 = r1 - r0
            r5._buttonRotationAccumulator = r1
            float r0 = r5._buttonRotation
            r5._lastButtonRotation = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            float r2 = r5._objectStartRotation
            r3 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r3
            r5.onNodeRotationDrag(r0, r2, r1, r6)
        L62:
            return
    }

    private void drawDots(com.badlogic.gdx.graphics.g2d.Batch r8, float r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            float r12 = r12 - r10
            float r13 = r13 - r11
            float r0 = com.badlogic.gdx.math.MathUtils.atan2(r13, r12)
            float r1 = com.badlogic.gdx.math.MathUtils.cos(r0)
            float r0 = com.badlogic.gdx.math.MathUtils.sin(r0)
            float r12 = r12 * r12
            float r13 = r13 * r13
            float r12 = r12 + r13
            double r12 = (double) r12
            double r12 = java.lang.Math.sqrt(r12)
            float r12 = (float) r12
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r7._dot
            int r13 = r13.getRegionWidth()
            float r13 = (float) r13
            r2 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r7._dot
            int r3 = r3.getRegionWidth()
            float r3 = (float) r3
            float r3 = r3 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r7._dot
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            float r4 = r4 * r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.setColor(r2, r2, r2, r9)
            float r12 = r12 / r13
            double r5 = (double) r12
            double r5 = java.lang.Math.ceil(r5)
            int r9 = (int) r5
            r12 = 0
        L43:
            if (r12 >= r9) goto L58
            float r2 = (float) r12
            float r2 = r2 * r13
            float r5 = r1 * r2
            float r5 = r5 + r10
            float r5 = r5 - r3
            float r2 = r2 * r0
            float r2 = r2 + r11
            float r2 = r2 - r4
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r7._dot
            r8.draw(r6, r5, r2)
            int r12 = r12 + 1
            goto L43
        L58:
            return
    }

    private void drawFont(com.badlogic.gdx.graphics.g2d.Batch r5, float r6, com.badlogic.gdx.math.Vector2 r7, java.lang.String r8) {
            r4 = this;
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r4._glyphLayout
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r4._outlineBitmapFont
            r0.setText(r1, r8)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r4._glyphLayout
            float r1 = r0.width
            float r0 = r0.height
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r2, r2, r2, r6)
            com.badlogic.gdx.graphics.g2d.BitmapFont r6 = r4._outlineBitmapFont
            float r2 = r7.x
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            float r2 = r2 - r1
            float r7 = r7.y
            float r0 = r0 * r3
            float r7 = r7 + r0
            r6.draw(r5, r8, r2, r7)
            return
    }

    private void drawPressedButton(com.badlogic.gdx.graphics.g2d.Batch r4, float r5, com.badlogic.gdx.math.Vector2 r6, float r7, float r8, float r9) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r3._pressedButtonRef
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.math.Vector2 r1 = r3._tempVector2
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r3._pressedButtonRef
            float r2 = r2.getY()
            r1.set(r0, r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r3._pressedButtonRef
            r1 = 1062836634(0x3f59999a, float:0.85)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r3._pressedButtonRef
            r0.setScale(r8, r9)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r8 = r3._pressedButtonRef
            r8.setRotation(r7)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r7 = r3._pressedButtonRef
            float r8 = r6.x
            float r6 = r6.y
            r7.setPosition(r8, r6)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r3._pressedButtonRef
            r6.draw(r4, r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r3._pressedButtonRef
            r5 = 1055286886(0x3ee66666, float:0.45)
            r4.setColor(r2, r2, r2, r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r3._pressedButtonRef
            r4.setScale(r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r3._pressedButtonRef
            r5 = 0
            r4.setRotation(r5)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r4 = r3._pressedButtonRef
            com.badlogic.gdx.math.Vector2 r5 = r3._tempVector2
            float r6 = r5.x
            float r5 = r5.y
            r4.setPosition(r6, r5)
            return
    }

    private float getAngleDifference(float r2, float r3) {
            r1 = this;
            float r3 = r3 - r2
            r2 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 + r2
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            float r3 = r3 - r2
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lf
            float r3 = r3 + r0
        Lf:
            return r3
    }

    private void objectSnapRotation() {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r7._stageObjectRef
            if (r0 == 0) goto L6c
            float r0 = r0.getRotation()
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L11
            float r0 = r0 + r1
        L11:
            r3 = 1132920832(0x43870000, float:270.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L1e
        L1b:
            r2 = 1119092736(0x42b40000, float:90.0)
            goto L4d
        L1e:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L25
        L22:
            r2 = 1127481344(0x43340000, float:180.0)
            goto L4d
        L25:
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 != 0) goto L2c
        L29:
            r2 = 1132920832(0x43870000, float:270.0)
            goto L4d
        L2c:
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L31
            goto L4d
        L31:
            r6 = 1092616192(0x41200000, float:10.0)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L38
            goto L4d
        L38:
            r6 = 1120403456(0x42c80000, float:100.0)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L3f
            goto L1b
        L3f:
            r4 = 1128136704(0x433e0000, float:190.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L46
            goto L22
        L46:
            r4 = 1133248512(0x438c0000, float:280.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L4d
            goto L29
        L4d:
            org.fortheloss.sticknodes.animationscreen.IStageObject r3 = r7._stageObjectRef
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 == 0) goto L67
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            boolean r4 = r3.isJoined()
            if (r4 == 0) goto L67
            float r2 = r2 - r0
            float r2 = r2 % r1
            r0 = 1141309440(0x44070000, float:540.0)
            float r2 = r2 + r0
            float r2 = r2 % r1
            float r2 = r2 - r5
            float r0 = r3.getJoinOffsetAngle()
            float r2 = r2 + r0
        L67:
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r7._stageObjectRef
            r7.onRotationSnap(r0, r2)
        L6c:
            return
    }

    private void setShowing(int r2) {
            r1 = this;
            r0 = 0
            r1.setShowing(r2, r0)
            return
    }

    private void setShowing(int r5, boolean r6) {
            r4 = this;
            int r0 = r4._showState
            if (r0 != r5) goto L9
            boolean r0 = r4._showStateSS
            if (r0 != r6) goto L9
            return
        L9:
            r4._showState = r5
            r4._showStateSS = r6
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._creationPasteButton2
            r0 = 0
            r5.setVisible(r0)
            int r5 = r4._showState
            r1 = 1
            r5 = r5 & r1
            if (r5 == 0) goto L9f
            if (r6 != 0) goto L9f
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._rotateButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.IStageObject r5 = r4._stageObjectRef
            boolean r5 = r5 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L3e
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._scaleButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteLinkButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._rotateButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteDragModeButton
            r5.setVisible(r1)
            r4.updateSpriteProperties()
            goto L52
        L3e:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._scaleButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteLinkButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._rotateButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteDragModeButton
            r5.setVisible(r0)
        L52:
            int r5 = r4._showState
            r5 = r5 & 2
            if (r5 == 0) goto L61
            com.badlogic.gdx.math.Vector2 r5 = r4._scalePosition1
            r4._activeScalePositionRef = r5
            com.badlogic.gdx.math.Vector2 r5 = r4._rotatePosition1
            r4._activeRotationPositionRef = r5
            goto L6e
        L61:
            com.badlogic.gdx.math.Vector2 r5 = r4._scalePosition2
            r4._activeScalePositionRef = r5
            com.badlogic.gdx.math.Vector2 r5 = r4._rotatePosition2
            r4._activeRotationPositionRef = r5
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._creationPasteButton2
            r5.setVisible(r1)
        L6e:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._scaleButton
            com.badlogic.gdx.math.Vector2 r2 = r4._activeScalePositionRef
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = r4._activeRotationPositionRef
            float r3 = r3.y
            r5.setPosition(r2, r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteLinkButton
            com.badlogic.gdx.math.Vector2 r2 = r4._activeScalePositionRef
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = r4._activeRotationPositionRef
            float r3 = r3.y
            r5.setPosition(r2, r3)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._rotateButton
            com.badlogic.gdx.math.Vector2 r2 = r4._activeRotationPositionRef
            float r3 = r2.x
            float r2 = r2.y
            r5.setPosition(r3, r2)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteDragModeButton
            com.badlogic.gdx.math.Vector2 r2 = r4._activeRotationPositionRef
            float r3 = r2.x
            float r2 = r2.y
            r5.setPosition(r3, r2)
            goto Lb3
        L9f:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._scaleButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteLinkButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._rotateButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._spriteDragModeButton
            r5.setVisible(r0)
        Lb3:
            int r5 = r4._showState
            r5 = r5 & 2
            if (r5 == 0) goto Lce
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._backwardButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._forwardButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._figureCopyButton
            r5.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._figurePasteButton
            r5.setVisible(r1)
            goto Le2
        Lce:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._backwardButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._forwardButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._figureCopyButton
            r5.setVisible(r0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r5 = r4._figurePasteButton
            r5.setVisible(r0)
        Le2:
            int r5 = r4._showState
            r5 = r5 & 4
            if (r5 == 0) goto L19c
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._creationRoot
            r5.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            r5.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryParentButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryLockButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryDragModeButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryStaticButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryThicknessButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryCurveButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryStretchyButton
            r5.removeActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryRotateButton
            r5.removeActor(r2)
            int r5 = r4._showState
            r5 = r5 & 64
            if (r5 != 0) goto L13e
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryRotateButton
            r5.addActorAt(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r4._secondaryStretchyButton
            r5.addActorAt(r0, r2)
        L13e:
            int r5 = r4._showState
            r2 = r5 & 8
            if (r2 == 0) goto L16f
            if (r6 == 0) goto L14c
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._creationRoot
            r5.setVisible(r0)
            goto L151
        L14c:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._creationRoot
            r5.setVisible(r1)
        L151:
            int r5 = r4._showState
            r5 = r5 & 64
            if (r5 != 0) goto L15e
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r4._secondaryDragModeButton
            r5.addActorAt(r0, r1)
        L15e:
            if (r6 != 0) goto L167
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryStaticButton
            r5.addActorAt(r0, r6)
        L167:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryThicknessButton
            r5.addActorAt(r0, r6)
            goto L181
        L16f:
            r5 = r5 & 64
            if (r5 != 0) goto L17a
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryDragModeButton
            r5.addActorAt(r0, r6)
        L17a:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryLockButton
            r5.addActorAt(r0, r6)
        L181:
            int r5 = r4._showState
            r5 = r5 & 16
            if (r5 == 0) goto L18e
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryCurveButton
            r5.addActorAt(r0, r6)
        L18e:
            int r5 = r4._showState
            r5 = r5 & 8
            if (r5 == 0) goto L1a6
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r6 = r4._secondaryParentButton
            r5.addActorAt(r0, r6)
            goto L1a6
        L19c:
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._creationRoot
            r5.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = r4._secondaryRoot
            r5.setVisible(r0)
        L1a6:
            return
    }

    private void snapNodeRotation() {
            r6 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._stickNodeRef
            if (r0 == 0) goto L52
            float r0 = r0.getAngle()
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L11
            float r0 = r0 + r1
        L11:
            r1 = 1132920832(0x43870000, float:270.0)
            r3 = 1127481344(0x43340000, float:180.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L1e
        L1b:
            r2 = 1119092736(0x42b40000, float:90.0)
            goto L4d
        L1e:
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L25
        L22:
            r2 = 1127481344(0x43340000, float:180.0)
            goto L4d
        L25:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L2c
        L29:
            r2 = 1132920832(0x43870000, float:270.0)
            goto L4d
        L2c:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            goto L4d
        L31:
            r5 = 1092616192(0x41200000, float:10.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L38
            goto L4d
        L38:
            r5 = 1120403456(0x42c80000, float:100.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L3f
            goto L1b
        L3f:
            r4 = 1128136704(0x433e0000, float:190.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L46
            goto L22
        L46:
            r3 = 1133248512(0x438c0000, float:280.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4d
            goto L29
        L4d:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._stickNodeRef
            r6.onNodeRotationSnap(r0, r2)
        L52:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 1
            r1._isDisposed = r0
            r0 = 0
            r1._tempVector1 = r0
            r1._tempVector2 = r0
            r1._startPosition = r0
            r1._dragPosition = r0
            r1._canvasModuleRef = r0
            r1._createToolsModuleRef = r0
            r1._stageObjectRef = r0
            r1._stickNodeRef = r0
            r1._clickListener = r0
            r1._scaleButton = r0
            r1._spriteLinkButton = r0
            r1._spriteDragModeButton = r0
            r1._rotateButton = r0
            r1._forwardButton = r0
            r1._backwardButton = r0
            r1._figureCopyButton = r0
            r1._figurePasteButton = r0
            r1._scalePosition1 = r0
            r1._scalePosition2 = r0
            r1._rotatePosition1 = r0
            r1._rotatePosition2 = r0
            r1._secondaryParentButton = r0
            r1._secondaryCurveButton = r0
            r1._secondaryThicknessButton = r0
            r1._secondaryStaticButton = r0
            r1._secondaryLockButton = r0
            r1._secondaryDragModeButton = r0
            r1._secondaryStretchyButton = r0
            r1._secondaryRotateButton = r0
            r1._creationCopyButton = r0
            r1._creationCopySingleButton = r0
            r1._creationPasteButton = r0
            r1._creationPasteButton2 = r0
            r1._creationDeleteButton = r0
            r1._creationDeleteSingleButton = r0
            r1._secondaryRoot = r0
            r1._creationRoot = r0
            r1._activeScalePositionRef = r0
            r1._activeRotationPositionRef = r0
            r1._outlineBitmapFont = r0
            r1._glyphLayout = r0
            r1._dot = r0
            r1._pressedButtonRef = r0
            r1.clear()
            r1.remove()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.drawChildren(r12, r13)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r11._pressedButtonRef
            if (r0 != 0) goto L8
            return
        L8:
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._backwardButton
            if (r0 != r1) goto L3b
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._backwardButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._backwardButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L3b:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._forwardButton
            if (r0 != r1) goto L69
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._forwardButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._forwardButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L69:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationPasteButton2
            if (r0 != r1) goto L97
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationPasteButton2
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._creationPasteButton2
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L97:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._figureCopyButton
            if (r0 != r1) goto Lc5
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._figureCopyButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._figureCopyButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        Lc5:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._figurePasteButton
            if (r0 != r1) goto Lf3
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._figurePasteButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._figurePasteButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        Lf3:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryLockButton
            if (r0 != r1) goto L12f
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getX()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryLockButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r11._secondaryRoot
            float r3 = r3.getY()
            float r2 = r2 + r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._secondaryLockButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L12f:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStaticButton
            if (r0 != r1) goto L16b
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getX()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryStaticButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r11._secondaryRoot
            float r3 = r3.getY()
            float r2 = r2 + r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._secondaryStaticButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L16b:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryParentButton
            if (r0 != r1) goto L1a7
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getX()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryParentButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r3 = r11._secondaryRoot
            float r3 = r3.getY()
            float r2 = r2 + r3
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._secondaryParentButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L1a7:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStretchyButton
            r7 = 1062836634(0x3f59999a, float:0.85)
            r8 = 1120403456(0x42c80000, float:100.0)
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r0 != r1) goto L262
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            if (r0 == 0) goto L837
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._secondaryRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStretchyButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryStretchyButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._dragPosition
            float r2 = r2.y
            com.badlogic.gdx.math.Vector2 r3 = r11._startPosition
            float r3 = r3.y
            float r2 = r2 - r3
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r2 = r2 + r1
            r3.set(r0, r2)
            float r7 = r7 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryStretchyButton
            float r2 = r2.getWidth()
            float r2 = r2 * r9
            float r3 = r0 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r11._secondaryStretchyButton
            float r0 = r0.getHeight()
            float r0 = r0 * r9
            float r4 = r1 + r0
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStretchyButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r5 = r0 + r1
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStretchyButton
            float r1 = r1.getHeight()
            float r1 = r1 * r9
            float r6 = r0 + r1
            r0 = r11
            r1 = r12
            r2 = r7
            r0.drawDots(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryStretchyButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r0 = r0 - r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryStretchyButton
            float r2 = r2.getHeight()
            float r2 = r2 * r9
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            float r0 = r0.getLength()
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            r11.drawFont(r12, r7, r1, r0)
            goto L837
        L262:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._spriteLinkButton
            if (r0 != r1) goto L290
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._spriteLinkButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._spriteLinkButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L290:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._spriteDragModeButton
            if (r0 != r1) goto L2be
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r1 = r11.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._spriteDragModeButton
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r11.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r3 = r11._spriteDragModeButton
            float r3 = r3.getY()
            float r2 = r2 + r3
            r0.set(r1, r2)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L2be:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            if (r0 != r1) goto L3bc
            com.badlogic.gdx.math.Vector2 r0 = r11._dragPosition
            float r0 = r0.y
            com.badlogic.gdx.math.Vector2 r1 = r11._startPosition
            float r1 = r1.y
            float r0 = r0 - r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r2 = r11.getX()
            com.badlogic.gdx.math.Vector2 r3 = r11._activeScalePositionRef
            float r3 = r3.x
            float r2 = r2 + r3
            float r3 = r11.getY()
            com.badlogic.gdx.math.Vector2 r4 = r11._activeScalePositionRef
            float r4 = r4.y
            float r3 = r3 + r4
            float r3 = r3 + r0
            r1.set(r2, r3)
            float r7 = r7 * r13
            float r0 = r11.getX()
            com.badlogic.gdx.math.Vector2 r1 = r11._activeScalePositionRef
            float r1 = r1.x
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r3 = r0 + r1
            float r0 = r11.getY()
            com.badlogic.gdx.math.Vector2 r1 = r11._activeScalePositionRef
            float r1 = r1.y
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            float r1 = r1.getHeight()
            float r1 = r1 * r9
            float r4 = r0 + r1
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r5 = r0 + r1
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            float r1 = r1.getHeight()
            float r1 = r1 * r9
            float r6 = r0 + r1
            r0 = r11
            r1 = r12
            r2 = r7
            r0.drawDots(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._scaleButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r0 = r0 - r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._scaleButton
            float r2 = r2.getHeight()
            float r2 = r2 * r9
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r11._stageObjectRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            r2 = 0
            r3 = 1
            java.lang.String r4 = "%.2f"
            if (r1 == 0) goto L3a3
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r3]
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            float r0 = r0.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5[r2] = r0
            java.lang.String r0 = java.lang.String.format(r1, r4, r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            org.fortheloss.sticknodes.animationscreen.IStageObject r5 = r11._stageObjectRef
            org.fortheloss.sticknodes.sprite.SpriteRef r5 = (org.fortheloss.sticknodes.sprite.SpriteRef) r5
            float r5 = r5.getScaleY()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r2] = r5
            java.lang.String r1 = java.lang.String.format(r1, r4, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " x "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L3b5
        L3a3:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r0 = r0.getScale()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = java.lang.String.format(r1, r4, r3)
        L3b5:
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            r11.drawFont(r12, r7, r1, r0)
            goto L837
        L3bc:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._rotateButton
            if (r0 != r1) goto L437
            float r0 = r1.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._rotateButton
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._rotateButton
            float r2 = r2.getWidth()
            float r10 = r2 * r9
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._rotateButton
            float r2 = r2.getHeight()
            float r9 = r9 * r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            float r3 = r11.getX()
            float r3 = r3 + r0
            float r0 = r11.getY()
            float r0 = r0 + r1
            r2.set(r3, r0)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r4 = r11._buttonRotation
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            float r0 = r0 + r10
            float r1 = r11._buttonRotation
            float r1 = com.badlogic.gdx.math.MathUtils.cosDeg(r1)
            float r1 = r1 * r8
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r0 = r0 + r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            float r1 = r1 + r9
            float r2 = r11._buttonRotation
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
            float r2 = r2 * r8
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r11._stageObjectRef
            float r0 = r0.getRotation()
            int r0 = r11.boundAngle(r0)
            float r1 = r13 * r7
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.drawFont(r12, r1, r2, r0)
            goto L837
        L437:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryThicknessButton
            if (r0 != r1) goto L4ea
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            if (r0 == 0) goto L837
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._secondaryRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryThicknessButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryThicknessButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._dragPosition
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = r11._startPosition
            float r3 = r3.x
            float r2 = r2 - r3
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r2 = r2 + r0
            r3.set(r2, r1)
            float r7 = r7 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryThicknessButton
            float r2 = r2.getWidth()
            float r2 = r2 * r9
            float r3 = r0 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r11._secondaryThicknessButton
            float r0 = r0.getHeight()
            float r0 = r0 * r9
            float r4 = r1 + r0
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryThicknessButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r5 = r0 + r1
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryThicknessButton
            float r1 = r1.getHeight()
            float r1 = r1 * r9
            float r6 = r0 + r1
            r0 = r11
            r1 = r12
            r2 = r7
            r0.drawDots(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryThicknessButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r0 = r0 - r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryThicknessButton
            float r2 = r2.getHeight()
            float r2 = r2 * r9
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            int r0 = r0.getThickness()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            r11.drawFont(r12, r7, r1, r0)
            goto L837
        L4ea:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryCurveButton
            if (r0 != r1) goto L59d
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            if (r0 == 0) goto L837
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._secondaryRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryCurveButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._secondaryRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryCurveButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._dragPosition
            float r2 = r2.x
            com.badlogic.gdx.math.Vector2 r3 = r11._startPosition
            float r3 = r3.x
            float r2 = r2 - r3
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r2 = r2 + r0
            r3.set(r2, r1)
            float r7 = r7 * r13
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryCurveButton
            float r2 = r2.getWidth()
            float r2 = r2 * r9
            float r3 = r0 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r11._secondaryCurveButton
            float r0 = r0.getHeight()
            float r0 = r0 * r9
            float r4 = r1 + r0
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryCurveButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r5 = r0 + r1
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryCurveButton
            float r1 = r1.getHeight()
            float r1 = r1 * r9
            float r6 = r0 + r1
            r0 = r11
            r1 = r12
            r2 = r7
            r0.drawDots(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryCurveButton
            float r1 = r1.getWidth()
            float r1 = r1 * r9
            float r0 = r0 + r1
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r8
            float r0 = r0 - r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryCurveButton
            float r2 = r2.getHeight()
            float r2 = r2 * r9
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            int r0 = r0.getSegmentCurve()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            r11.drawFont(r12, r7, r1, r0)
            goto L837
        L59d:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryRotateButton
            if (r0 != r1) goto L62c
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            if (r0 == 0) goto L837
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r11._secondaryRoot
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryRotateButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._secondaryRoot
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryRotateButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryRotateButton
            float r2 = r2.getWidth()
            float r10 = r2 * r9
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryRotateButton
            float r2 = r2.getHeight()
            float r9 = r9 * r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            float r3 = r11.getX()
            float r3 = r3 + r0
            float r0 = r11.getY()
            float r0 = r0 + r1
            r2.set(r3, r0)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r4 = r11._buttonRotation
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            float r0 = r0 + r10
            float r1 = r11._buttonRotation
            float r1 = com.badlogic.gdx.math.MathUtils.cosDeg(r1)
            float r1 = r1 * r8
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r0 = r0 + r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            float r1 = r1 + r9
            float r2 = r11._buttonRotation
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
            float r2 = r2 * r8
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            float r0 = r0.getAngle()
            int r0 = r11.boundAngle(r0)
            float r1 = r13 * r7
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.drawFont(r12, r1, r2, r0)
            goto L837
        L62c:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryDragModeButton
            if (r0 != r1) goto L6bb
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            if (r0 == 0) goto L837
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r11._secondaryRoot
            float r0 = r0.getX()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._secondaryDragModeButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._secondaryRoot
            float r1 = r1.getY()
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryDragModeButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryDragModeButton
            float r2 = r2.getWidth()
            float r10 = r2 * r9
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._secondaryDragModeButton
            float r2 = r2.getHeight()
            float r9 = r9 * r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            float r3 = r11.getX()
            float r3 = r3 + r0
            float r0 = r11.getY()
            float r0 = r0 + r1
            r2.set(r3, r0)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            float r4 = r11._buttonRotation
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.math.Vector2 r0 = r11._tempVector1
            float r0 = r0.x
            float r0 = r0 + r10
            float r1 = r11._buttonRotation
            float r1 = com.badlogic.gdx.math.MathUtils.cosDeg(r1)
            float r1 = r1 * r8
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r0 = r0 + r1
            com.badlogic.gdx.math.Vector2 r1 = r11._tempVector1
            float r1 = r1.y
            float r1 = r1 + r9
            float r2 = r11._buttonRotation
            float r2 = com.badlogic.gdx.math.MathUtils.sinDeg(r2)
            float r2 = r2 * r8
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r11._stickNodeRef
            float r0 = r0.getDragLockAngle()
            int r0 = r11.boundAngle(r0)
            float r1 = r13 * r7
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.drawFont(r12, r1, r2, r0)
            goto L837
        L6bb:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopyButton
            if (r0 != r1) goto L70d
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._creationRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopyButton
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.getParent()
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopyButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._creationRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationCopyButton
            com.badlogic.gdx.scenes.scene2d.Group r2 = r2.getParent()
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationCopyButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L70d:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopySingleButton
            if (r0 != r1) goto L75f
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._creationRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopySingleButton
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.getParent()
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationCopySingleButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._creationRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationCopySingleButton
            com.badlogic.gdx.scenes.scene2d.Group r2 = r2.getParent()
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationCopySingleButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L75f:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationPasteButton
            if (r0 != r1) goto L79b
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._creationRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationPasteButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._creationRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationPasteButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L79b:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteButton
            if (r0 != r1) goto L7ec
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._creationRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteButton
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.getParent()
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._creationRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationDeleteButton
            com.badlogic.gdx.scenes.scene2d.Group r2 = r2.getParent()
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationDeleteButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
            goto L837
        L7ec:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteSingleButton
            if (r0 != r1) goto L837
            float r0 = r11.getX()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r11._creationRoot
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteSingleButton
            com.badlogic.gdx.scenes.scene2d.Group r1 = r1.getParent()
            float r1 = r1.getX()
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r11._creationDeleteSingleButton
            float r1 = r1.getX()
            float r0 = r0 + r1
            float r1 = r11.getY()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r11._creationRoot
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationDeleteSingleButton
            com.badlogic.gdx.scenes.scene2d.Group r2 = r2.getParent()
            float r2 = r2.getY()
            float r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r2 = r11._creationDeleteSingleButton
            float r2 = r2.getY()
            float r1 = r1 + r2
            com.badlogic.gdx.math.Vector2 r2 = r11._tempVector1
            r2.set(r0, r1)
            com.badlogic.gdx.math.Vector2 r3 = r11._tempVector1
            r0 = r11
            r1 = r12
            r2 = r13
            r0.drawPressedButton(r1, r2, r3, r4, r5, r6)
        L837:
            return
    }

    public boolean getTemporaryToggleOn() {
            r1 = this;
            boolean r0 = r1._isToggledOn
            return r0
    }

    public void hide() {
            r1 = this;
            r0 = 0
            r1._stageObjectRef = r0
            r1._stickNodeRef = r0
            r1.clearListeners()
            r0 = 0
            r1.setVisible(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public boolean isVisible() {
            r2 = this;
            boolean r0 = super.isVisible()
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r2._enabled
            if (r0 == 0) goto L14
            boolean r0 = r2._enabledDuringDrag
            if (r0 == 0) goto L14
            boolean r0 = r2._isToggledOn
            if (r0 == 0) goto L14
            r1 = 1
        L14:
            return r1
    }

    protected void onCopyClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            return
    }

    protected void onNodeCreationCopyClick(org.fortheloss.sticknodes.stickfigure.StickNode r1, boolean r2) {
            r0 = this;
            return
    }

    protected void onNodeCreationDeleteClick(org.fortheloss.sticknodes.stickfigure.StickNode r1, boolean r2) {
            r0 = this;
            return
    }

    protected void onNodeCreationPasteClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            return
    }

    protected void onNodeCurveDrag(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2, float r3, boolean r4) {
            r0 = this;
            return
    }

    protected void onNodeDragLockRotation(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2, float r3, boolean r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onNodeDragLockRotationClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            return
    }

    protected void onNodeJumpToParentClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            return
    }

    protected void onNodeLengthDrag(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2, float r3) {
            r0 = this;
            return
    }

    protected void onNodeLockClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            return
    }

    protected void onNodeRotationDrag(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2, float r3, boolean r4) {
            r0 = this;
            return
    }

    protected void onNodeRotationSnap(org.fortheloss.sticknodes.stickfigure.StickNode r1, float r2) {
            r0 = this;
            return
    }

    protected void onNodeStaticClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onNodeStretchyClick(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            return
    }

    protected void onNodeThicknessDrag(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    protected void onPasteClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            return
    }

    protected void onPushBackwardClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            return
    }

    protected void onPushForwardClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            return
    }

    protected void onRotationDrag(org.fortheloss.sticknodes.animationscreen.IStageObject r1, float r2, float r3, boolean r4) {
            r0 = this;
            return
    }

    protected void onRotationSnap(org.fortheloss.sticknodes.animationscreen.IStageObject r1, float r2) {
            r0 = this;
            return
    }

    protected void onScaleDrag(org.fortheloss.sticknodes.animationscreen.IStageObject r1, float r2, float r3, boolean r4) {
            r0 = this;
            return
    }

    protected void onSpriteDragModeClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onSpriteLinkClick(org.fortheloss.sticknodes.animationscreen.IStageObject r1) {
            r0 = this;
            return
    }

    protected void onTouchDown() {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected void onTouchUp() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0._enabled = r1
            return
    }

    public void setEnabledDuringDrag(boolean r1) {
            r0 = this;
            r0._enabledDuringDrag = r1
            return
    }

    public void setMainPosition(float r2, float r3) {
            r1 = this;
            int r0 = r1._buttonState
            if (r0 != 0) goto L7
            r1.setPosition(r2, r3)
        L7:
            return
    }

    public void setSecondaryPosition(float r6, float r7) {
            r5 = this;
            int r0 = r5._buttonState
            if (r0 != 0) goto L34
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r5._secondaryRoot
            float r1 = r0.getWidth()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r1 = r6 - r1
            r3 = 1128792064(0x43480000, float:200.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r4 = r4 + r7
            r0.setPosition(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r0 = r5._creationRoot
            float r1 = r0.getWidth()
            float r1 = r1 * r2
            float r6 = r6 - r1
            r1 = 1124859904(0x430c0000, float:140.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            float r7 = r7 - r2
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = r5._creationRoot
            float r1 = r1.getHeight()
            float r7 = r7 + r1
            r0.setPosition(r6, r7)
        L34:
            return
    }

    public void setTemporaryToggleOn(boolean r1) {
            r0 = this;
            r0._isToggledOn = r1
            return
    }

    public void show(org.fortheloss.sticknodes.animationscreen.IStageObject r4, int r5, org.fortheloss.sticknodes.stickfigure.INode r6) {
            r3 = this;
            r3._stageObjectRef = r4
            r4 = 0
            r3._stickNodeRef = r4
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3._clickListener
            r3.addListener(r4)
            r4 = 1
            r3.setVisible(r4)
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r3._stageObjectRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.TextfieldBox
            if (r1 == 0) goto L19
            r3.setShowing(r4)
            goto L87
        L19:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 == 0) goto L23
            r4 = 35
            r3.setShowing(r4)
            goto L87
        L23:
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            r1 = 3
            if (r0 == 0) goto L2c
            r3.setShowing(r1)
            goto L87
        L2c:
            if (r6 == 0) goto L83
            boolean r0 = r6.isMainNode()
            if (r0 == 0) goto L4a
            if (r5 != r4) goto L46
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r5 = r3._createToolsModuleRef
            boolean r5 = r5.userIsTestingSmartStretch()
            if (r5 == 0) goto L42
            r3.setShowing(r4, r4)
            goto L87
        L42:
            r3.setShowing(r4)
            goto L87
        L46:
            r3.setShowing(r1)
            goto L87
        L4a:
            r0 = 4
            if (r5 != r4) goto L4f
            r0 = 12
        L4f:
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = (org.fortheloss.sticknodes.stickfigure.StickNode) r6
            int r1 = r6.getLimbType()
            if (r1 == r4) goto L64
            int r1 = r6.getLimbType()
            if (r1 == 0) goto L64
            int r1 = r6.getLimbType()
            r2 = 6
            if (r1 != r2) goto L66
        L64:
            r0 = r0 | 16
        L66:
            boolean r1 = r6 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r1 == 0) goto L6c
            r0 = r0 | 64
        L6c:
            if (r5 != r4) goto L7a
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r5 = r3._createToolsModuleRef
            boolean r5 = r5.userIsTestingSmartStretch()
            if (r5 == 0) goto L7a
            r3.setShowing(r0, r4)
            goto L7d
        L7a:
            r3.setShowing(r0)
        L7d:
            r3._stickNodeRef = r6
            r3.updateNodeProperties()
            goto L87
        L83:
            r4 = -1
            r3.setShowing(r4)
        L87:
            return
    }

    protected void updateMenu(int r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r3, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r4) {
            r0 = this;
            if (r1 != 0) goto L23
            org.fortheloss.sticknodes.animationscreen.IStageObject r1 = r0._stageObjectRef
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r3 == 0) goto Lf
            r2.updateStickfigureTools()
            r2.updateSegmentTools()
            goto L36
        Lf:
            boolean r3 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto L17
            r2.updateSpriteTools()
            goto L36
        L17:
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 == 0) goto L1f
            r2.updateMovieclipTools()
            goto L36
        L1f:
            r2.updateTextfieldTools()
            goto L36
        L23:
            r2 = 2
            if (r1 != r2) goto L2d
            r3.updateStickfigureTools()
            r3.updateSegmentTools()
            goto L36
        L2d:
            r4.updateStickfigureTools()
            r4.updateSegmentTools()
            r4.updateShapeTools()
        L36:
            return
    }

    public void updateNodeProperties() {
            r5 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            if (r0 == 0) goto L72
            int r1 = r5._showState
            r1 = r1 & 4
            if (r1 != 0) goto Lb
            goto L72
        Lb:
            boolean r0 = r0.isStretchy()
            r1 = 1062836634(0x3f59999a, float:0.85)
            r2 = 1055286886(0x3ee66666, float:0.45)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L1f
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryStretchyButton
            r0.setColor(r3, r3, r3, r1)
            goto L24
        L1f:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryStretchyButton
            r0.setColor(r3, r3, r3, r2)
        L24:
            int r0 = r5._showState
            r0 = r0 & 8
            if (r0 == 0) goto L3e
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L38
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryStaticButton
            r0.setColor(r3, r3, r3, r1)
            goto L57
        L38:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryStaticButton
            r0.setColor(r3, r3, r3, r2)
            goto L57
        L3e:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getStickfigure()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getLockedStickNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r5._stickNodeRef
            if (r0 != r4) goto L52
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryLockButton
            r0.setColor(r3, r3, r3, r1)
            goto L57
        L52:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryLockButton
            r0.setColor(r3, r3, r3, r2)
        L57:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            boolean r0 = r0.getIsDragLocked()
            if (r0 == 0) goto L6d
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._stickNodeRef
            boolean r0 = r0.getIsAngleLocked()
            if (r0 != 0) goto L6d
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryDragModeButton
            r0.setColor(r3, r3, r3, r1)
            goto L72
        L6d:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._secondaryDragModeButton
            r0.setColor(r3, r3, r3, r2)
        L72:
            return
    }

    public void updateSpriteProperties() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.IStageObject r0 = r5._stageObjectRef
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r1 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            boolean r1 = r0.getScaleLinked()
            r2 = 1062836634(0x3f59999a, float:0.85)
            r3 = 1055286886(0x3ee66666, float:0.45)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1d
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r5._spriteLinkButton
            r1.setColor(r4, r4, r4, r2)
            goto L22
        L1d:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r1 = r5._spriteLinkButton
            r1.setColor(r4, r4, r4, r3)
        L22:
            boolean r0 = r0.isDragOriginBased()
            if (r0 != 0) goto L2e
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._spriteDragModeButton
            r0.setColor(r4, r4, r4, r2)
            goto L33
        L2e:
            org.fortheloss.sticknodes.animationscreen.QuickResizeTool$QuickButton r0 = r5._spriteDragModeButton
            r0.setColor(r4, r4, r4, r3)
        L33:
            return
    }
}
