package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class MetadataBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.drive.Metadata> {
    private com.google.android.gms.drive.MetadataBuffer.zza zzau;

    static class zza extends com.google.android.gms.drive.Metadata {
        private final int row;
        private final com.google.android.gms.common.data.DataHolder zzav;
        private final int zzaw;

        public zza(com.google.android.gms.common.data.DataHolder r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.zzav = r1
                r0.row = r2
                int r1 = r1.getWindowIndex(r2)
                r0.zzaw = r1
                return
        }

        static /* synthetic */ int zza(com.google.android.gms.drive.MetadataBuffer.zza r0) {
                int r0 = r0.row
                return r0
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final /* synthetic */ com.google.android.gms.drive.Metadata freeze() {
                r6 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe()
                java.util.Collection r1 = com.google.android.gms.drive.metadata.internal.zzf.zzbc()
                java.util.Iterator r1 = r1.iterator()
            Lc:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.next()
                com.google.android.gms.drive.metadata.MetadataField r2 = (com.google.android.gms.drive.metadata.MetadataField) r2
                com.google.android.gms.drive.metadata.MetadataField<com.google.android.gms.common.data.BitmapTeleporter> r3 = com.google.android.gms.internal.drive.zzhs.zzkq
                if (r2 == r3) goto Lc
                com.google.android.gms.common.data.DataHolder r3 = r6.zzav
                int r4 = r6.row
                int r5 = r6.zzaw
                r2.zza(r3, r0, r4, r5)
                goto Lc
            L26:
                com.google.android.gms.internal.drive.zzaa r1 = new com.google.android.gms.internal.drive.zzaa
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final boolean isDataValid() {
                r1 = this;
                com.google.android.gms.common.data.DataHolder r0 = r1.zzav
                boolean r0 = r0.isClosed()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // com.google.android.gms.drive.Metadata
        public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> r4) {
                r3 = this;
                com.google.android.gms.common.data.DataHolder r0 = r3.zzav
                int r1 = r3.row
                int r2 = r3.zzaw
                java.lang.Object r4 = r4.zza(r0, r1, r2)
                return r4
        }
    }

    public MetadataBuffer(com.google.android.gms.common.data.DataHolder r2) {
            r1 = this;
            r1.<init>(r2)
            android.os.Bundle r2 = r2.getMetadata()
            java.lang.Class<com.google.android.gms.drive.MetadataBuffer> r0 = com.google.android.gms.drive.MetadataBuffer.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            return
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final com.google.android.gms.drive.Metadata get(int r3) {
            r2 = this;
            com.google.android.gms.drive.MetadataBuffer$zza r0 = r2.zzau
            if (r0 == 0) goto La
            int r1 = com.google.android.gms.drive.MetadataBuffer.zza.zza(r0)
            if (r1 == r3) goto L13
        La:
            com.google.android.gms.drive.MetadataBuffer$zza r0 = new com.google.android.gms.drive.MetadataBuffer$zza
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            r0.<init>(r1, r3)
            r2.zzau = r0
        L13:
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.drive.Metadata r1 = r0.get(r1)
            return r1
    }

    @java.lang.Deprecated
    public final java.lang.String getNextPageToken() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 == 0) goto L7
            com.google.android.gms.drive.metadata.internal.zzf.zza(r0)
        L7:
            super.release()
            return
    }
}
