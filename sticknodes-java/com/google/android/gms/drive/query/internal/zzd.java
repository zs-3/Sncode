package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldOnlyFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzd> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.MetadataField<?> zzmb;

    static {
            com.google.android.gms.drive.query.internal.zze r0 = new com.google.android.gms.drive.query.internal.zze
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzd.CREATOR = r0
            return
    }

    public zzd(com.google.android.gms.drive.metadata.SearchableMetadataField<?> r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(r2, r0)
            r1.<init>(r2)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzd(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
            r0 = this;
            r0.<init>()
            r0.zzma = r1
            com.google.android.gms.drive.metadata.MetadataField r1 = com.google.android.gms.drive.query.internal.zzi.zza(r1)
            r0.zzmb = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzma
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> r2) {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<?> r0 = r1.zzmb
            java.lang.Object r2 = r2.zze(r0)
            return r2
    }
}
