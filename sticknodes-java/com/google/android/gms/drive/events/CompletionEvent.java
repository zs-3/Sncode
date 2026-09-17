package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CompletionEventCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class CompletionEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.ResourceEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.CompletionEvent> CREATOR = null;
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    private final int status;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.lang.String zzca;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final android.os.ParcelFileDescriptor zzcb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final android.os.ParcelFileDescriptor zzcc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzcd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final java.util.List<java.lang.String> zzce;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    private final android.os.IBinder zzcf;
    private boolean zzcg;
    private boolean zzch;
    private boolean zzci;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzk;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "CompletionEvent"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.drive.events.CompletionEvent.zzbz = r0
            com.google.android.gms.drive.events.zzg r0 = new com.google.android.gms.drive.events.zzg
            r0.<init>()
            com.google.android.gms.drive.events.CompletionEvent.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    CompletionEvent(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.ParcelFileDescriptor r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.ParcelFileDescriptor r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.drive.metadata.internal.MetadataBundle r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.util.List<java.lang.String> r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) android.os.IBinder r9) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzcg = r0
            r1.zzch = r0
            r1.zzci = r0
            r1.zzk = r2
            r1.zzca = r3
            r1.zzcb = r4
            r1.zzcc = r5
            r1.zzcd = r6
            r1.zzce = r7
            r1.status = r8
            r1.zzcf = r9
            return
    }

    private final void zza(boolean r7) {
            r6 = this;
            r6.zzv()
            r0 = 1
            r6.zzci = r0
            android.os.ParcelFileDescriptor r1 = r6.zzcb
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            android.os.ParcelFileDescriptor r1 = r6.zzcc
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r6.zzcd
            if (r1 == 0) goto L27
            com.google.android.gms.drive.metadata.MetadataField<com.google.android.gms.common.data.BitmapTeleporter> r2 = com.google.android.gms.internal.drive.zzhs.zzkq
            boolean r1 = r1.zzd(r2)
            if (r1 == 0) goto L27
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r6.zzcd
            java.lang.Object r1 = r1.zza(r2)
            com.google.android.gms.common.data.BitmapTeleporter r1 = (com.google.android.gms.common.data.BitmapTeleporter) r1
            r1.release()
        L27:
            android.os.IBinder r1 = r6.zzcf
            r2 = 0
            java.lang.String r3 = "CompletionEvent"
            java.lang.String r4 = "snooze"
            java.lang.String r5 = "dismiss"
            if (r1 != 0) goto L42
            if (r7 == 0) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.android.gms.drive.events.CompletionEvent.zzbz
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r4
            java.lang.String r1 = "No callback on %s"
            r7.efmt(r3, r1, r0)
            return
        L42:
            com.google.android.gms.internal.drive.zzeu r1 = com.google.android.gms.internal.drive.zzev.zza(r1)     // Catch: android.os.RemoteException -> L4a
            r1.zza(r7)     // Catch: android.os.RemoteException -> L4a
            return
        L4a:
            r1 = move-exception
            if (r7 == 0) goto L4e
            goto L4f
        L4e:
            r4 = r5
        L4f:
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.android.gms.drive.events.CompletionEvent.zzbz
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r4
            java.lang.String r2 = "RemoteException on %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r7.e(r3, r0, r1)
            return
    }

    private final void zzv() {
            r2 = this;
            boolean r0 = r2.zzci
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Event has already been dismissed or snoozed."
            r0.<init>(r1)
            throw r0
    }

    public final void dismiss() {
            r1 = this;
            r0 = 0
            r1.zza(r0)
            return
    }

    public final java.lang.String getAccountName() {
            r1 = this;
            r1.zzv()
            java.lang.String r0 = r1.zzca
            return r0
    }

    public final java.io.InputStream getBaseContentsInputStream() {
            r2 = this;
            r2.zzv()
            android.os.ParcelFileDescriptor r0 = r2.zzcb
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            boolean r0 = r2.zzcg
            if (r0 != 0) goto L1c
            r0 = 1
            r2.zzcg = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream
            android.os.ParcelFileDescriptor r1 = r2.zzcb
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getBaseInputStream() can only be called once per CompletionEvent instance."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    public final com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            r1.zzv()
            com.google.android.gms.drive.DriveId r0 = r1.zzk
            return r0
    }

    public final java.io.InputStream getModifiedContentsInputStream() {
            r2 = this;
            r2.zzv()
            android.os.ParcelFileDescriptor r0 = r2.zzcc
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            boolean r0 = r2.zzch
            if (r0 != 0) goto L1c
            r0 = 1
            r2.zzch = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream
            android.os.ParcelFileDescriptor r1 = r2.zzcc
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getModifiedInputStream() can only be called once per CompletionEvent instance."
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.drive.MetadataChangeSet getModifiedMetadataChangeSet() {
            r2 = this;
            r2.zzv()
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzcd
            if (r0 == 0) goto Lf
            com.google.android.gms.drive.MetadataChangeSet r0 = new com.google.android.gms.drive.MetadataChangeSet
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r2.zzcd
            r0.<init>(r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final int getStatus() {
            r1 = this;
            r1.zzv()
            int r0 = r1.status
            return r0
    }

    public final java.util.List<java.lang.String> getTrackingTags() {
            r2 = this;
            r2.zzv()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r2.zzce
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 2
            return r0
    }

    public final void snooze() {
            r1 = this;
            r0 = 1
            r1.zza(r0)
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.List<java.lang.String> r0 = r6.zzce
            r1 = 2
            if (r0 != 0) goto L8
            java.lang.String r0 = "<null>"
            goto L2b
        L8:
            java.lang.String r2 = "','"
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "'"
            r3.append(r2)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L2b:
            java.util.Locale r2 = java.util.Locale.US
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            com.google.android.gms.drive.DriveId r5 = r6.zzk
            r3[r4] = r5
            r4 = 1
            int r5 = r6.status
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3[r1] = r0
            java.lang.String r0 = "CompletionEvent [id=%s, status=%s, trackingTag=%s]"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = r6 | 1
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r1 = r4.zzca
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.os.ParcelFileDescriptor r1 = r4.zzcb
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            android.os.ParcelFileDescriptor r1 = r4.zzcc
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzcd
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.util.List<java.lang.String> r6 = r4.zzce
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r1, r6, r3)
            int r6 = r4.status
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            android.os.IBinder r6 = r4.zzcf
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
