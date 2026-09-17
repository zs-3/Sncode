package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzfq implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfp> {
    public zzfq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfp createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r4 = 0
        Ld:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L77
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L72
            r3 = 3
            if (r2 == r3) goto L68
            r3 = 5
            if (r2 == r3) goto L5e
            r3 = 6
            if (r2 == r3) goto L54
            r3 = 7
            if (r2 == r3) goto L4a
            r3 = 9
            if (r2 == r3) goto L40
            r3 = 10
            if (r2 == r3) goto L36
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Ld
        L36:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzr> r2 = com.google.android.gms.drive.events.zzr.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r10 = r1
            com.google.android.gms.drive.events.zzr r10 = (com.google.android.gms.drive.events.zzr) r10
            goto Ld
        L40:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzv> r2 = com.google.android.gms.drive.events.zzv.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r9 = r1
            com.google.android.gms.drive.events.zzv r9 = (com.google.android.gms.drive.events.zzv) r9
            goto Ld
        L4a:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzb> r2 = com.google.android.gms.drive.events.zzb.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r8 = r1
            com.google.android.gms.drive.events.zzb r8 = (com.google.android.gms.drive.events.zzb) r8
            goto Ld
        L54:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.zzo> r2 = com.google.android.gms.drive.events.zzo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r7 = r1
            com.google.android.gms.drive.events.zzo r7 = (com.google.android.gms.drive.events.zzo) r7
            goto Ld
        L5e:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.CompletionEvent> r2 = com.google.android.gms.drive.events.CompletionEvent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r6 = r1
            com.google.android.gms.drive.events.CompletionEvent r6 = (com.google.android.gms.drive.events.CompletionEvent) r6
            goto Ld
        L68:
            android.os.Parcelable$Creator<com.google.android.gms.drive.events.ChangeEvent> r2 = com.google.android.gms.drive.events.ChangeEvent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r5 = r1
            com.google.android.gms.drive.events.ChangeEvent r5 = (com.google.android.gms.drive.events.ChangeEvent) r5
            goto Ld
        L72:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            goto Ld
        L77:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.internal.drive.zzfp r12 = new com.google.android.gms.internal.drive.zzfp
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfp[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzfp[] r1 = new com.google.android.gms.internal.drive.zzfp[r1]
            return r1
    }
}
