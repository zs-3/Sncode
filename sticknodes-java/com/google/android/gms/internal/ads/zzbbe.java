package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbe implements android.os.Parcelable.Creator {
    public zzbbe() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r4 = 0
            r9 = r2
            r6 = r4
            r7 = 0
            r8 = 0
            r11 = 0
        Ld:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L50
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L46
            r3 = 3
            if (r2 == r3) goto L40
            r3 = 4
            if (r2 == r3) goto L3a
            r3 = 5
            if (r2 == r3) goto L34
            r3 = 6
            if (r2 == r3) goto L2e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Ld
        L2e:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            r11 = r1
            goto Ld
        L34:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            r9 = r1
            goto Ld
        L3a:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            r8 = r1
            goto Ld
        L40:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            r7 = r1
            goto Ld
        L46:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r6 = r1
            goto Ld
        L50:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.internal.ads.zzbbd r13 = new com.google.android.gms.internal.ads.zzbbd
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbbd[] r1 = new com.google.android.gms.internal.ads.zzbbd[r1]
            return r1
    }
}
