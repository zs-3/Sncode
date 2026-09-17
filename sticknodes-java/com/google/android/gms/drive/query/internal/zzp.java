package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "InFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzp<T> extends com.google.android.gms.drive.query.internal.zza {
    public static final com.google.android.gms.drive.query.internal.zzq CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzma;
    private final com.google.android.gms.drive.metadata.zzb<T> zzmn;

    static {
            com.google.android.gms.drive.query.internal.zzq r0 = new com.google.android.gms.drive.query.internal.zzq
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzp.CREATOR = r0
            return
    }

    public zzp(com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<T> r1, T r2) {
            r0 = this;
            java.util.Set r2 = java.util.Collections.singleton(r2)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zza(r1, r2)
            r0.<init>(r1)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzp(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
            r0 = this;
            r0.<init>()
            r0.zzma = r1
            com.google.android.gms.drive.metadata.MetadataField r1 = com.google.android.gms.drive.query.internal.zzi.zza(r1)
            com.google.android.gms.drive.metadata.zzb r1 = (com.google.android.gms.drive.metadata.zzb) r1
            r0.zzmn = r1
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
            com.google.android.gms.drive.metadata.zzb<T> r0 = r2.zzmn
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r2.zzma
            java.lang.Object r1 = r1.zza(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Object r3 = r3.zza(r0, r1)
            return r3
    }
}
