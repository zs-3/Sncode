package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
public final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.FilterHolder> {
    public zzh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.FilterHolder createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L7d
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L73;
                case 2: goto L69;
                case 3: goto L5f;
                case 4: goto L55;
                case 5: goto L4b;
                case 6: goto L41;
                case 7: goto L37;
                case 8: goto L2d;
                case 9: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Le
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzz> r2 = com.google.android.gms.drive.query.internal.zzz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r11 = r1
            com.google.android.gms.drive.query.internal.zzz r11 = (com.google.android.gms.drive.query.internal.zzz) r11
            goto Le
        L2d:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzl> r2 = com.google.android.gms.drive.query.internal.zzl.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r10 = r1
            com.google.android.gms.drive.query.internal.zzl r10 = (com.google.android.gms.drive.query.internal.zzl) r10
            goto Le
        L37:
            com.google.android.gms.drive.query.internal.zzo r2 = com.google.android.gms.drive.query.internal.zzn.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r9 = r1
            com.google.android.gms.drive.query.internal.zzn r9 = (com.google.android.gms.drive.query.internal.zzn) r9
            goto Le
        L41:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzt> r2 = com.google.android.gms.drive.query.internal.zzt.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r8 = r1
            com.google.android.gms.drive.query.internal.zzt r8 = (com.google.android.gms.drive.query.internal.zzt) r8
            goto Le
        L4b:
            com.google.android.gms.drive.query.internal.zzq r2 = com.google.android.gms.drive.query.internal.zzp.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r7 = r1
            com.google.android.gms.drive.query.internal.zzp r7 = (com.google.android.gms.drive.query.internal.zzp) r7
            goto Le
        L55:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzv> r2 = com.google.android.gms.drive.query.internal.zzv.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r6 = r1
            com.google.android.gms.drive.query.internal.zzv r6 = (com.google.android.gms.drive.query.internal.zzv) r6
            goto Le
        L5f:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzr> r2 = com.google.android.gms.drive.query.internal.zzr.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r5 = r1
            com.google.android.gms.drive.query.internal.zzr r5 = (com.google.android.gms.drive.query.internal.zzr) r5
            goto Le
        L69:
            android.os.Parcelable$Creator<com.google.android.gms.drive.query.internal.zzd> r2 = com.google.android.gms.drive.query.internal.zzd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r4 = r1
            com.google.android.gms.drive.query.internal.zzd r4 = (com.google.android.gms.drive.query.internal.zzd) r4
            goto Le
        L73:
            com.google.android.gms.drive.query.internal.zzc r2 = com.google.android.gms.drive.query.internal.zzb.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r3 = r1
            com.google.android.gms.drive.query.internal.zzb r3 = (com.google.android.gms.drive.query.internal.zzb) r3
            goto Le
        L7d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.drive.query.internal.FilterHolder r13 = new com.google.android.gms.drive.query.internal.FilterHolder
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.query.internal.FilterHolder[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.query.internal.FilterHolder[] r1 = new com.google.android.gms.drive.query.internal.FilterHolder[r1]
            return r1
    }
}
