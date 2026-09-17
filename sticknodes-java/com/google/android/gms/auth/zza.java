package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r2 = 0
            r3 = 0
            r9 = r1
            r12 = r9
            r7 = r3
            r6 = 0
            r10 = 0
            r11 = 0
        Le:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L47
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3b;
                case 3: goto L35;
                case 4: goto L2f;
                case 5: goto L29;
                case 6: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Le
        L23:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            r12 = r1
            goto Le
        L29:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r11 = r1
            goto Le
        L2f:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r10 = r1
            goto Le
        L35:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            r9 = r1
            goto Le
        L3b:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r1)
            r7 = r1
            goto Le
        L41:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r6 = r1
            goto Le
        L47:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.auth.AccountChangeEvent r14 = new com.google.android.gms.auth.AccountChangeEvent
            r5 = r14
            r5.<init>(r6, r7, r9, r10, r11, r12)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.AccountChangeEvent[] r1 = new com.google.android.gms.auth.AccountChangeEvent[r1]
            return r1
    }
}
