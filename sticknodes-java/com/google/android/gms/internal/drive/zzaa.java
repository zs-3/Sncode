package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzaa extends com.google.android.gms.drive.Metadata {
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdt;

    public zzaa(com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
            r0 = this;
            r0.<init>()
            r0.zzdt = r1
            return
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.drive.Metadata freeze() {
            r2 = this;
            com.google.android.gms.internal.drive.zzaa r0 = new com.google.android.gms.internal.drive.zzaa
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r2.zzdt
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r1.zzbf()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
            r1 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r1.zzdt
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r3.zzdt
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Metadata [mImpl="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.drive.Metadata
    public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> r2) {
            r1 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r1.zzdt
            java.lang.Object r2 = r0.zza(r2)
            return r2
    }
}
