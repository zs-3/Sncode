package com.google.android.gms.drive;

/* loaded from: classes.dex */
public class ExecutionOptions {
    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
    private final java.lang.String zzan;
    private final boolean zzao;
    private final int zzap;

    public static class Builder {
        protected java.lang.String zzaq;
        protected boolean zzar;
        protected int zzas;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zzas = r0
                return
        }

        public com.google.android.gms.drive.ExecutionOptions build() {
                r4 = this;
                r4.zzo()
                com.google.android.gms.drive.ExecutionOptions r0 = new com.google.android.gms.drive.ExecutionOptions
                java.lang.String r1 = r4.zzaq
                boolean r2 = r4.zzar
                int r3 = r4.zzas
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.android.gms.drive.ExecutionOptions.Builder setConflictStrategy(int r4) {
                r3 = this;
                r0 = 1
                if (r4 == 0) goto L6
                if (r4 == r0) goto L6
                r0 = 0
            L6:
                if (r0 == 0) goto Lb
                r3.zzas = r4
                return r3
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = 53
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Unrecognized value for conflict strategy: "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r0.<init>(r4)
                throw r0
        }

        public com.google.android.gms.drive.ExecutionOptions.Builder setNotifyOnCompletion(boolean r1) {
                r0 = this;
                r0.zzar = r1
                return r0
        }

        public com.google.android.gms.drive.ExecutionOptions.Builder setTrackingTag(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 1
                r2 = 65536(0x10000, float:9.18355E-41)
                r3 = 0
                if (r0 != 0) goto L12
                int r0 = r5.length()
                if (r0 > r2) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L18
                r4.zzaq = r5
                return r4
            L18:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r3] = r1
                java.lang.String r1 = "trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r5.<init>(r0)
                throw r5
        }

        protected final void zzo() {
                r2 = this;
                int r0 = r2.zzas
                r1 = 1
                if (r0 != r1) goto L12
                boolean r0 = r2.zzar
                if (r0 == 0) goto La
                goto L12
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications"
                r0.<init>(r1)
                throw r0
            L12:
                return
        }
    }

    public ExecutionOptions(java.lang.String r1, boolean r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzan = r1
            r0.zzao = r2
            r0.zzap = r3
            return
    }

    public static boolean zza(int r1) {
            r0 = 1
            if (r1 == r0) goto L5
            r1 = 0
            return r1
        L5:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Le
            goto L2b
        Le:
            r1 = 1
            if (r5 != r4) goto L12
            return r1
        L12:
            com.google.android.gms.drive.ExecutionOptions r5 = (com.google.android.gms.drive.ExecutionOptions) r5
            java.lang.String r2 = r4.zzan
            java.lang.String r3 = r5.zzan
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L2b
            int r2 = r4.zzap
            int r3 = r5.zzap
            if (r2 != r3) goto L2b
            boolean r2 = r4.zzao
            boolean r5 = r5.zzao
            if (r2 != r5) goto L2b
            return r1
        L2b:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzan
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.zzao
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @java.lang.Deprecated
    public final void zza(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r2 = r2.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r2 = (com.google.android.gms.internal.drive.zzaw) r2
            r1.zza(r2)
            return
    }

    public final void zza(com.google.android.gms.internal.drive.zzaw r2) {
            r1 = this;
            boolean r0 = r1.zzao
            if (r0 == 0) goto L13
            boolean r2 = r2.zzah()
            if (r2 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion"
            r2.<init>(r0)
            throw r2
        L13:
            return
    }

    public final java.lang.String zzl() {
            r1 = this;
            java.lang.String r0 = r1.zzan
            return r0
    }

    public final boolean zzm() {
            r1 = this;
            boolean r0 = r1.zzao
            return r0
    }

    public final int zzn() {
            r1 = this;
            int r0 = r1.zzap
            return r0
    }
}
