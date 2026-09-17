package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public abstract class FocusListener implements com.badlogic.gdx.scenes.scene2d.EventListener {

    /* renamed from: com.badlogic.gdx.scenes.scene2d.utils.FocusListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type = null;

        static {
                com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type[] r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.scenes.scene2d.utils.FocusListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type = r0
                com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.keyboard     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r1 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.scroll     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static class FocusEvent extends com.badlogic.gdx.scenes.scene2d.Event {
        private boolean focused;
        private com.badlogic.gdx.scenes.scene2d.Actor relatedActor;
        private com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type type;

        public enum Type extends java.lang.Enum<com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type> {
            private static final /* synthetic */ com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type[] $VALUES = null;
            public static final com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type keyboard = null;
            public static final com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type scroll = null;

            static {
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r0 = new com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type
                    java.lang.String r1 = "keyboard"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.keyboard = r0
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r1 = new com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type
                    java.lang.String r3 = "scroll"
                    r4 = 1
                    r1.<init>(r3, r4)
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.scroll = r1
                    r3 = 2
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type[] r3 = new com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.$VALUES = r3
                    return
            }

            Type(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type valueOf(java.lang.String r1) {
                    java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type> r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r1 = (com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type) r1
                    return r1
            }

            public static com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type[] values() {
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type[] r0 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type[] r0 = (com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type[]) r0
                    return r0
            }
        }

        public FocusEvent() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.badlogic.gdx.scenes.scene2d.Actor getRelatedActor() {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.relatedActor
                return r0
        }

        public com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type getType() {
                r1 = this;
                com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r0 = r1.type
                return r0
        }

        public boolean isFocused() {
                r1 = this;
                boolean r0 = r1.focused
                return r0
        }

        @Override // com.badlogic.gdx.scenes.scene2d.Event, com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.relatedActor = r0
                return
        }

        public void setFocused(boolean r1) {
                r0 = this;
                r0.focused = r1
                return
        }

        public void setRelatedActor(com.badlogic.gdx.scenes.scene2d.Actor r1) {
                r0 = this;
                r0.relatedActor = r1
                return
        }

        public void setType(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.Type r1) {
                r0 = this;
                r0.type = r1
                return
        }
    }

    public FocusListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.EventListener
    public boolean handle(com.badlogic.gdx.scenes.scene2d.Event r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent r0 = (com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent) r0
            int[] r2 = com.badlogic.gdx.scenes.scene2d.utils.FocusListener.AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener$FocusEvent$Type r3 = r0.getType()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L28
            r3 = 2
            if (r2 == r3) goto L1c
            goto L33
        L1c:
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getTarget()
            boolean r2 = r0.isFocused()
            r4.scrollFocusChanged(r0, r5, r2)
            goto L33
        L28:
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getTarget()
            boolean r2 = r0.isFocused()
            r4.keyboardFocusChanged(r0, r5, r2)
        L33:
            return r1
    }

    public abstract void keyboardFocusChanged(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent r1, com.badlogic.gdx.scenes.scene2d.Actor r2, boolean r3);

    public void scrollFocusChanged(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent r1, com.badlogic.gdx.scenes.scene2d.Actor r2, boolean r3) {
            r0 = this;
            return
    }
}
