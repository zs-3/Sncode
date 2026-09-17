package androidx.work;

/* loaded from: classes.dex */
public final class ContentUriTriggers {
    private final java.util.Set<androidx.work.ContentUriTriggers.Trigger> mTriggers;

    public static final class Trigger {
        private final boolean mTriggerForDescendants;
        private final android.net.Uri mUri;

        Trigger(android.net.Uri r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mUri = r1
                r0.mTriggerForDescendants = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L25
                java.lang.Class<androidx.work.ContentUriTriggers$Trigger> r2 = androidx.work.ContentUriTriggers.Trigger.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L25
            L10:
                androidx.work.ContentUriTriggers$Trigger r5 = (androidx.work.ContentUriTriggers.Trigger) r5
                boolean r2 = r4.mTriggerForDescendants
                boolean r3 = r5.mTriggerForDescendants
                if (r2 != r3) goto L23
                android.net.Uri r2 = r4.mUri
                android.net.Uri r5 = r5.mUri
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L23
                goto L24
            L23:
                r0 = 0
            L24:
                return r0
            L25:
                return r1
        }

        public android.net.Uri getUri() {
                r1 = this;
                android.net.Uri r0 = r1.mUri
                return r0
        }

        public int hashCode() {
                r2 = this;
                android.net.Uri r0 = r2.mUri
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                boolean r1 = r2.mTriggerForDescendants
                int r0 = r0 + r1
                return r0
        }

        public boolean shouldTriggerForDescendants() {
                r1 = this;
                boolean r0 = r1.mTriggerForDescendants
                return r0
        }
    }

    public ContentUriTriggers() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mTriggers = r0
            return
    }

    public void add(android.net.Uri r2, boolean r3) {
            r1 = this;
            androidx.work.ContentUriTriggers$Trigger r0 = new androidx.work.ContentUriTriggers$Trigger
            r0.<init>(r2, r3)
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r2 = r1.mTriggers
            r2.add(r0)
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<androidx.work.ContentUriTriggers> r0 = androidx.work.ContentUriTriggers.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            androidx.work.ContentUriTriggers r3 = (androidx.work.ContentUriTriggers) r3
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r0 = r2.mTriggers
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r3 = r3.mTriggers
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public java.util.Set<androidx.work.ContentUriTriggers.Trigger> getTriggers() {
            r1 = this;
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r0 = r1.mTriggers
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r0 = r1.mTriggers
            int r0 = r0.hashCode()
            return r0
    }

    public int size() {
            r1 = this;
            java.util.Set<androidx.work.ContentUriTriggers$Trigger> r0 = r1.mTriggers
            int r0 = r0.size()
            return r0
    }
}
