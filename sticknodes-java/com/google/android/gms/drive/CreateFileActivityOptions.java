package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class CreateFileActivityOptions extends com.google.android.gms.internal.drive.zzq {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    public static class Builder {
        protected final com.google.android.gms.drive.CreateFileActivityBuilder builder;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = new com.google.android.gms.drive.CreateFileActivityBuilder
                r0.<init>()
                r1.builder = r0
                return
        }

        public com.google.android.gms.drive.CreateFileActivityOptions build() {
                r8 = this;
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = r8.builder
                r0.zzg()
                com.google.android.gms.drive.CreateFileActivityOptions r0 = new com.google.android.gms.drive.CreateFileActivityOptions
                com.google.android.gms.drive.CreateFileActivityBuilder r1 = r8.builder
                com.google.android.gms.drive.MetadataChangeSet r1 = r1.zzc()
                com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r1.zzq()
                com.google.android.gms.drive.CreateFileActivityBuilder r1 = r8.builder
                int r1 = r1.getRequestId()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.drive.CreateFileActivityBuilder r1 = r8.builder
                java.lang.String r4 = r1.zze()
                com.google.android.gms.drive.CreateFileActivityBuilder r1 = r8.builder
                com.google.android.gms.drive.DriveId r5 = r1.zzd()
                com.google.android.gms.drive.CreateFileActivityBuilder r1 = r8.builder
                int r6 = r1.zzf()
                r7 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setActivityStartFolder(com.google.android.gms.drive.DriveId r2) {
                r1 = this;
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = r1.builder
                r0.setActivityStartFolder(r2)
                return r1
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setActivityTitle(java.lang.String r2) {
                r1 = this;
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = r1.builder
                r0.setActivityTitle(r2)
                return r1
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setInitialDriveContents(com.google.android.gms.drive.DriveContents r2) {
                r1 = this;
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = r1.builder
                r0.setInitialDriveContents(r2)
                return r1
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setInitialMetadata(com.google.android.gms.drive.MetadataChangeSet r2) {
                r1 = this;
                com.google.android.gms.drive.CreateFileActivityBuilder r0 = r1.builder
                r0.setInitialMetadata(r2)
                return r1
        }
    }

    private CreateFileActivityOptions(com.google.android.gms.drive.metadata.internal.MetadataBundle r1, java.lang.Integer r2, java.lang.String r3, com.google.android.gms.drive.DriveId r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* synthetic */ CreateFileActivityOptions(com.google.android.gms.drive.metadata.internal.MetadataBundle r1, java.lang.Integer r2, java.lang.String r3, com.google.android.gms.drive.DriveId r4, int r5, com.google.android.gms.drive.zzd r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }
}
