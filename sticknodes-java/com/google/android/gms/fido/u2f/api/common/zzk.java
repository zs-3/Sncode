package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator {
    public zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L50
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L4b;
                case 3: goto L46;
                case 4: goto L3c;
                case 5: goto L37;
                case 6: goto L30;
                case 7: goto L26;
                case 8: goto L21;
                default: goto L1d;
            }
        L1d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto Lc
        L21:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r1)
            goto Lc
        L26:
            android.os.Parcelable$Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue> r2 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r8 = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r8
            goto Lc
        L30:
            android.os.Parcelable$Creator<com.google.android.gms.fido.u2f.api.common.RegisteredKey> r2 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r11, r1, r2)
            goto Lc
        L37:
            byte[] r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r11, r1)
            goto Lc
        L3c:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r5 = r1
            android.net.Uri r5 = (android.net.Uri) r5
            goto Lc
        L46:
            java.lang.Double r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(r11, r1)
            goto Lc
        L4b:
            java.lang.Integer r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r11, r1)
            goto Lc
        L50:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.fido.u2f.api.common.SignRequestParams r11 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.u2f.api.common.SignRequestParams[] r1 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams[r1]
            return r1
    }
}
