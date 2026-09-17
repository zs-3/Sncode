package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.common.api.ApiMetadata zza(android.os.Parcel r5) {
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r5)
            r1 = 0
        L5:
            int r2 = r5.dataPosition()
            if (r2 >= r0) goto L23
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r5)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L1a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r5, r2)
            goto L5
        L1a:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.ComplianceOptions> r1 = com.google.android.gms.common.api.ComplianceOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r5, r2, r1)
            com.google.android.gms.common.api.ComplianceOptions r1 = (com.google.android.gms.common.api.ComplianceOptions) r1
            goto L5
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r5, r0)
            com.google.android.gms.common.api.ApiMetadata r5 = new com.google.android.gms.common.api.ApiMetadata
            r5.<init>(r1)
            return r5
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiMetadata r1 = zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiMetadata[] r1 = new com.google.android.gms.common.api.ApiMetadata[r1]
            return r1
    }
}
