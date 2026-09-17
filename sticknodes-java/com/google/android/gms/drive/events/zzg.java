package com.google.android.gms.drive.events;

/* loaded from: classes.dex */
public final class zzg implements android.os.Parcelable.Creator<com.google.android.gms.drive.events.CompletionEvent> {
    public zzg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.CompletionEvent createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r10 = 0
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L5f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L55;
                case 3: goto L50;
                case 4: goto L46;
                case 5: goto L3c;
                case 6: goto L32;
                case 7: goto L2d;
                case 8: goto L28;
                case 9: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Le
        L23:
            android.os.IBinder r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r13, r1)
            goto Le
        L28:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            goto Le
        L2d:
            java.util.ArrayList r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r13, r1)
            goto Le
        L32:
            android.os.Parcelable$Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> r2 = com.google.android.gms.drive.metadata.internal.MetadataBundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r8 = r1
            com.google.android.gms.drive.metadata.internal.MetadataBundle r8 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r8
            goto Le
        L3c:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r7 = r1
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            goto Le
        L46:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r6 = r1
            android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6
            goto Le
        L50:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            goto Le
        L55:
            android.os.Parcelable$Creator<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            r4 = r1
            com.google.android.gms.drive.DriveId r4 = (com.google.android.gms.drive.DriveId) r4
            goto Le
        L5f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.drive.events.CompletionEvent r13 = new com.google.android.gms.drive.events.CompletionEvent
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.drive.events.CompletionEvent[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.drive.events.CompletionEvent[] r1 = new com.google.android.gms.drive.events.CompletionEvent[r1]
            return r1
    }
}
