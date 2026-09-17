package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class SimpleDirectionGestureDetector extends com.badlogic.gdx.input.GestureDetector {

    private static class DirectionGestureListener extends com.badlogic.gdx.input.GestureDetector.GestureAdapter {
        private org.fortheloss.framework.SimpleDirectionGestureDetector.DirectionListener directionListener;

        public DirectionGestureListener(org.fortheloss.framework.SimpleDirectionGestureDetector.DirectionListener r1) {
                r0 = this;
                r0.<init>()
                r0.directionListener = r1
                return
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean fling(float r4, float r5, int r6) {
                r3 = this;
                float r0 = java.lang.Math.abs(r4)
                float r1 = java.lang.Math.abs(r5)
                r2 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L1d
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 <= 0) goto L17
                org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionListener r0 = r3.directionListener
                r0.onRight()
                goto L2c
            L17:
                org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionListener r0 = r3.directionListener
                r0.onLeft()
                goto L2c
            L1d:
                int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r0 <= 0) goto L27
                org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionListener r0 = r3.directionListener
                r0.onDown()
                goto L2c
            L27:
                org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionListener r0 = r3.directionListener
                r0.onUp()
            L2c:
                boolean r4 = super.fling(r4, r5, r6)
                return r4
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean tap(float r2, float r3, int r4, int r5) {
                r1 = this;
                org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionListener r0 = r1.directionListener
                r0.onTap()
                boolean r2 = super.tap(r2, r3, r4, r5)
                return r2
        }
    }

    public interface DirectionListener {
        void onDown();

        void onLeft();

        void onRight();

        void onTap();

        void onUp();
    }

    public SimpleDirectionGestureDetector(org.fortheloss.framework.SimpleDirectionGestureDetector.DirectionListener r2) {
            r1 = this;
            org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionGestureListener r0 = new org.fortheloss.framework.SimpleDirectionGestureDetector$DirectionGestureListener
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }
}
