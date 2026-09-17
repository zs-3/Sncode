package com.google.android.gms.drive;

/* loaded from: classes.dex */
public class TransferPreferencesBuilder {
    public static final com.google.android.gms.drive.TransferPreferences DEFAULT_PREFERENCES = null;
    private int zzbl;
    private boolean zzbm;
    private int zzbn;

    static class zza implements com.google.android.gms.drive.TransferPreferences {
        private final int zzbl;
        private final boolean zzbm;
        private final int zzbn;

        zza(int r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.zzbl = r1
                r0.zzbm = r2
                r0.zzbn = r3
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L25
                java.lang.Class<com.google.android.gms.drive.TransferPreferencesBuilder$zza> r2 = com.google.android.gms.drive.TransferPreferencesBuilder.zza.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L25
            L10:
                com.google.android.gms.drive.TransferPreferencesBuilder$zza r5 = (com.google.android.gms.drive.TransferPreferencesBuilder.zza) r5
                int r2 = r5.zzbl
                int r3 = r4.zzbl
                if (r2 != r3) goto L25
                boolean r2 = r5.zzbm
                boolean r3 = r4.zzbm
                if (r2 != r3) goto L25
                int r5 = r5.zzbn
                int r2 = r4.zzbn
                if (r5 != r2) goto L25
                return r0
            L25:
                return r1
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final int getBatteryUsagePreference() {
                r1 = this;
                int r0 = r1.zzbn
                return r0
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final int getNetworkPreference() {
                r1 = this;
                int r0 = r1.zzbl
                return r0
        }

        public final int hashCode() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r1 = r3.zzbl
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                boolean r1 = r3.zzbm
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.zzbn
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
                return r0
        }

        @Override // com.google.android.gms.drive.TransferPreferences
        public final boolean isRoamingAllowed() {
                r1 = this;
                boolean r0 = r1.zzbm
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r1 = r3.zzbl
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                boolean r1 = r3.zzbm
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.zzbn
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = "NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    static {
            com.google.android.gms.drive.TransferPreferencesBuilder$zza r0 = new com.google.android.gms.drive.TransferPreferencesBuilder$zza
            r1 = 1
            r2 = 256(0x100, float:3.59E-43)
            r0.<init>(r1, r1, r2)
            com.google.android.gms.drive.TransferPreferencesBuilder.DEFAULT_PREFERENCES = r0
            return
    }

    public TransferPreferencesBuilder() {
            r1 = this;
            com.google.android.gms.drive.TransferPreferences r0 = com.google.android.gms.drive.TransferPreferencesBuilder.DEFAULT_PREFERENCES
            r1.<init>(r0)
            return
    }

    public TransferPreferencesBuilder(com.google.android.gms.drive.FileUploadPreferences r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getNetworkTypePreference()
            r1.zzbl = r0
            boolean r0 = r2.isRoamingAllowed()
            r1.zzbm = r0
            int r2 = r2.getBatteryUsagePreference()
            r1.zzbn = r2
            return
    }

    public TransferPreferencesBuilder(com.google.android.gms.drive.TransferPreferences r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.getNetworkPreference()
            r1.zzbl = r0
            boolean r0 = r2.isRoamingAllowed()
            r1.zzbm = r0
            int r2 = r2.getBatteryUsagePreference()
            r1.zzbn = r2
            return
    }

    public com.google.android.gms.drive.TransferPreferences build() {
            r4 = this;
            com.google.android.gms.drive.TransferPreferencesBuilder$zza r0 = new com.google.android.gms.drive.TransferPreferencesBuilder$zza
            int r1 = r4.zzbl
            boolean r2 = r4.zzbm
            int r3 = r4.zzbn
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setBatteryUsagePreference(int r1) {
            r0 = this;
            r0.zzbn = r1
            return r0
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setIsRoamingAllowed(boolean r1) {
            r0 = this;
            r0.zzbm = r1
            return r0
    }

    public com.google.android.gms.drive.TransferPreferencesBuilder setNetworkPreference(int r1) {
            r0 = this;
            r0.zzbl = r1
            return r0
    }
}
