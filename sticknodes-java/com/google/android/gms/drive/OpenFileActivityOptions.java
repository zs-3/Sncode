package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class OpenFileActivityOptions {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    public final java.lang.String zzba;
    public final java.lang.String[] zzbb;
    public final com.google.android.gms.drive.DriveId zzbd;
    public final com.google.android.gms.drive.query.internal.FilterHolder zzbe;

    public static class Builder {
        private final com.google.android.gms.drive.OpenFileActivityBuilder zzbf;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = new com.google.android.gms.drive.OpenFileActivityBuilder
                r0.<init>()
                r1.zzbf = r0
                return
        }

        public com.google.android.gms.drive.OpenFileActivityOptions build() {
                r7 = this;
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = r7.zzbf
                r0.zzg()
                com.google.android.gms.drive.OpenFileActivityOptions r0 = new com.google.android.gms.drive.OpenFileActivityOptions
                com.google.android.gms.drive.OpenFileActivityBuilder r1 = r7.zzbf
                java.lang.String r2 = r1.getTitle()
                com.google.android.gms.drive.OpenFileActivityBuilder r1 = r7.zzbf
                java.lang.String[] r3 = r1.zzs()
                com.google.android.gms.drive.OpenFileActivityBuilder r1 = r7.zzbf
                com.google.android.gms.drive.query.Filter r4 = r1.zzt()
                com.google.android.gms.drive.OpenFileActivityBuilder r1 = r7.zzbf
                com.google.android.gms.drive.DriveId r5 = r1.zzu()
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setActivityStartFolder(com.google.android.gms.drive.DriveId r2) {
                r1 = this;
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = r1.zzbf
                r0.setActivityStartFolder(r2)
                return r1
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setActivityTitle(java.lang.String r2) {
                r1 = this;
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = r1.zzbf
                r0.setActivityTitle(r2)
                return r1
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setMimeType(java.util.List<java.lang.String> r3) {
                r2 = this;
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = r2.zzbf
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r3 = r3.toArray(r1)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r0.setMimeType(r3)
                return r2
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setSelectionFilter(com.google.android.gms.drive.query.Filter r2) {
                r1 = this;
                com.google.android.gms.drive.OpenFileActivityBuilder r0 = r1.zzbf
                r0.setSelectionFilter(r2)
                return r1
        }
    }

    private OpenFileActivityOptions(java.lang.String r1, java.lang.String[] r2, com.google.android.gms.drive.query.Filter r3, com.google.android.gms.drive.DriveId r4) {
            r0 = this;
            r0.<init>()
            r0.zzba = r1
            r0.zzbb = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto L10
        Lb:
            com.google.android.gms.drive.query.internal.FilterHolder r1 = new com.google.android.gms.drive.query.internal.FilterHolder
            r1.<init>(r3)
        L10:
            r0.zzbe = r1
            r0.zzbd = r4
            return
    }

    /* synthetic */ OpenFileActivityOptions(java.lang.String r1, java.lang.String[] r2, com.google.android.gms.drive.query.Filter r3, com.google.android.gms.drive.DriveId r4, com.google.android.gms.drive.zzq r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }
}
