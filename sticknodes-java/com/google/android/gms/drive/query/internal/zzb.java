package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ComparisonFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzb<T> extends com.google.android.gms.drive.query.internal.zza {
    public static final com.google.android.gms.drive.query.internal.zzc CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.query.internal.zzx zzlz;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.MetadataField<T> zzmb;

    static {
            com.google.android.gms.drive.query.internal.zzc r0 = new com.google.android.gms.drive.query.internal.zzc
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzb.CREATOR = r0
            return
    }

    public zzb(com.google.android.gms.drive.query.internal.zzx r1, com.google.android.gms.drive.metadata.SearchableMetadataField<T> r2, T r3) {
            r0 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.query.internal.zzx r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.metadata.internal.MetadataBundle r2) {
            r0 = this;
            r0.<init>()
            r0.zzlz = r1
            r0.zzma = r2
            com.google.android.gms.drive.metadata.MetadataField r1 = com.google.android.gms.drive.query.internal.zzi.zza(r2)
            r0.zzmb = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.query.internal.zzx r1 = r4.zzlz
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzma
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> r4) {
            r3 = this;
            com.google.android.gms.drive.query.internal.zzx r0 = r3.zzlz
            com.google.android.gms.drive.metadata.MetadataField<T> r1 = r3.zzmb
            com.google.android.gms.drive.metadata.internal.MetadataBundle r2 = r3.zzma
            java.lang.Object r2 = r2.zza(r1)
            java.lang.Object r4 = r4.zza(r0, r1, r2)
            return r4
    }
}
