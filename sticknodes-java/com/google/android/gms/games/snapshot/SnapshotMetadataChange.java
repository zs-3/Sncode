package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface SnapshotMetadataChange {
    public static final com.google.android.gms.games.snapshot.SnapshotMetadataChange EMPTY_CHANGE = null;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    public static final class Builder {
        private java.lang.String zza;
        private java.lang.Long zzb;
        private java.lang.Long zzc;
        private com.google.android.gms.common.data.BitmapTeleporter zzd;
        private android.net.Uri zze;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange build() {
                r7 = this;
                com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r6 = new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity
                java.lang.String r1 = r7.zza
                java.lang.Long r2 = r7.zzb
                com.google.android.gms.common.data.BitmapTeleporter r3 = r7.zzd
                android.net.Uri r4 = r7.zze
                java.lang.Long r5 = r7.zzc
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder fromMetadata(com.google.android.gms.games.snapshot.SnapshotMetadata r7) {
                r6 = this;
                java.lang.String r0 = r7.getDescription()
                r6.zza = r0
                long r0 = r7.getPlayedTime()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.zzb = r0
                long r0 = r7.getProgressValue()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r6.zzc = r0
                java.lang.Long r0 = r6.zzb
                long r0 = r0.longValue()
                r2 = 0
                r3 = -1
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L29
                r6.zzb = r2
            L29:
                android.net.Uri r7 = r7.getCoverImageUri()
                r6.zze = r7
                if (r7 == 0) goto L33
                r6.zzd = r2
            L33:
                return r6
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setCoverImage(android.graphics.Bitmap r2) {
                r1 = this;
                com.google.android.gms.common.data.BitmapTeleporter r0 = new com.google.android.gms.common.data.BitmapTeleporter
                r0.<init>(r2)
                r1.zzd = r0
                r2 = 0
                r1.zze = r2
                return r1
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setDescription(java.lang.String r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setPlayedTimeMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder setProgressValue(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotMetadataChange.EMPTY_CHANGE = r0
            return
    }

    android.graphics.Bitmap getCoverImage();

    java.lang.String getDescription();

    java.lang.Long getPlayedTimeMillis();

    java.lang.Long getProgressValue();

    com.google.android.gms.common.data.BitmapTeleporter zza();
}
