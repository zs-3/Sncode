package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class AutoValue_ExperimentIds extends com.google.android.datatransport.cct.internal.ExperimentIds {
    private final byte[] clearBlob;
    private final byte[] encryptedBlob;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExperimentIds.Builder {
        private byte[] clearBlob;
        private byte[] encryptedBlob;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds build() {
                r4 = this;
                com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds r0 = new com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds
                byte[] r1 = r4.clearBlob
                byte[] r2 = r4.encryptedBlob
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds.Builder setClearBlob(byte[] r1) {
                r0 = this;
                r0.clearBlob = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public com.google.android.datatransport.cct.internal.ExperimentIds.Builder setEncryptedBlob(byte[] r1) {
                r0 = this;
                r0.encryptedBlob = r1
                return r0
        }
    }

    private AutoValue_ExperimentIds(byte[] r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.clearBlob = r1
            r0.encryptedBlob = r2
            return
    }

    /* synthetic */ AutoValue_ExperimentIds(byte[] r1, byte[] r2, com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.datatransport.cct.internal.ExperimentIds
            r2 = 0
            if (r1 == 0) goto L37
            com.google.android.datatransport.cct.internal.ExperimentIds r6 = (com.google.android.datatransport.cct.internal.ExperimentIds) r6
            byte[] r1 = r5.clearBlob
            boolean r3 = r6 instanceof com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds
            if (r3 == 0) goto L17
            r4 = r6
            com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds r4 = (com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds) r4
            byte[] r4 = r4.clearBlob
            goto L1b
        L17:
            byte[] r4 = r6.getClearBlob()
        L1b:
            boolean r1 = java.util.Arrays.equals(r1, r4)
            if (r1 == 0) goto L35
            byte[] r1 = r5.encryptedBlob
            if (r3 == 0) goto L2a
            com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds r6 = (com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds) r6
            byte[] r6 = r6.encryptedBlob
            goto L2e
        L2a:
            byte[] r6 = r6.getEncryptedBlob()
        L2e:
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
        L37:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getClearBlob() {
            r1 = this;
            byte[] r0 = r1.clearBlob
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getEncryptedBlob() {
            r1 = this;
            byte[] r0 = r1.encryptedBlob
            return r0
    }

    public int hashCode() {
            r2 = this;
            byte[] r0 = r2.clearBlob
            int r0 = java.util.Arrays.hashCode(r0)
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.encryptedBlob
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ExperimentIds{clearBlob="
            r0.append(r1)
            byte[] r1 = r2.clearBlob
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", encryptedBlob="
            r0.append(r1)
            byte[] r1 = r2.encryptedBlob
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
