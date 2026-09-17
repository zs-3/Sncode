package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "HasFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzn<T> extends com.google.android.gms.drive.query.internal.zza {
    public static final com.google.android.gms.drive.query.internal.zzo CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.MetadataField<T> zzmb;

    static {
            com.google.android.gms.drive.query.internal.zzo r0 = new com.google.android.gms.drive.query.internal.zzo
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzn.CREATOR = r0
            return
    }

    public zzn(com.google.android.gms.drive.metadata.SearchableMetadataField<T> r1, T r2) {
            r0 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(r1, r2)
            r0.<init>(r1)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzn(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
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
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> r3) {
            r2 = this;
            com.google.android.gms.drive.metadata.MetadataField<T> r0 = r2.zzmb
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r2.zzma
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Object r3 = r3.zzc(r0, r1)
            return r3
    }
}
