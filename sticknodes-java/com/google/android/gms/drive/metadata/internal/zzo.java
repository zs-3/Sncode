package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzo extends com.google.android.gms.drive.metadata.internal.zzl<com.google.android.gms.drive.DriveId> implements com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<com.google.android.gms.drive.DriveId> {
    public static final com.google.android.gms.drive.metadata.internal.zzg zzjk = null;

    static {
            com.google.android.gms.drive.metadata.internal.zzp r0 = new com.google.android.gms.drive.metadata.internal.zzp
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.zzo.zzjk = r0
            return
    }

    public zzo(int r4) {
            r3 = this;
            java.util.Set r4 = java.util.Collections.emptySet()
            java.lang.String r0 = "parentsExtra"
            java.lang.String r1 = "dbInstanceId"
            java.lang.String r2 = "parentsExtraHolder"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "parents"
            r2 = 4100000(0x3e8fa0, float:5.745324E-39)
            r3.<init>(r1, r4, r0, r2)
            return
    }

    private static void zzc(com.google.android.gms.common.data.DataHolder r2) {
            android.os.Bundle r0 = r2.getMetadata()
            if (r0 != 0) goto L7
            return
        L7:
            monitor-enter(r2)
            java.lang.String r1 = "parentsExtraHolder"
            android.os.Parcelable r1 = r0.getParcelable(r1)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "parentsExtraHolder"
            r0.remove(r1)     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    static /* synthetic */ void zzd(com.google.android.gms.common.data.DataHolder r0) {
            zzc(r0)
            return
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzl, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle r1) {
            r0 = this;
            java.util.Collection r1 = r0.zzc(r1)
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.util.Collection r1 = r0.zzd(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzl
    protected final java.util.Collection<com.google.android.gms.drive.DriveId> zzc(android.os.Bundle r2) {
            r1 = this;
            java.util.Collection r2 = super.zzc(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.drive.metadata.zzb
    protected final java.util.Collection<com.google.android.gms.drive.DriveId> zzd(com.google.android.gms.common.data.DataHolder r17, int r18, int r19) {
            r16 = this;
            r1 = r17
            android.os.Bundle r0 = r17.getMetadata()
            java.lang.String r2 = "parentsExtra"
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            if (r2 != 0) goto Lcc
            java.lang.String r3 = "parentsExtraHolder"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            if (r3 == 0) goto Lc8
            monitor-enter(r17)
            android.os.Bundle r2 = r17.getMetadata()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "parentsExtraHolder"
            android.os.Parcelable r2 = r2.getParcelable(r3)     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L28
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc5
            goto Lb0
        L28:
            int r3 = r17.getCount()     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb7
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            r6 = 0
            r7 = 0
        L38:
            if (r7 >= r3) goto L56
            int r8 = r1.getWindowIndex(r7)     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.drive.metadata.internal.ParentDriveIdSet r9 = new com.google.android.gms.drive.metadata.internal.ParentDriveIdSet     // Catch: java.lang.Throwable -> Lb7
            r9.<init>()     // Catch: java.lang.Throwable -> Lb7
            r4.add(r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "sqlId"
            long r10 = r1.getLong(r10, r7, r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> Lb7
            r5.put(r8, r9)     // Catch: java.lang.Throwable -> Lb7
            int r7 = r7 + 1
            goto L38
        L56:
            android.os.Bundle r3 = r2.getMetadata()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = "childSqlIdColumn"
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "parentSqlIdColumn"
            java.lang.String r8 = r3.getString(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "parentResIdColumn"
            java.lang.String r3 = r3.getString(r9)     // Catch: java.lang.Throwable -> Lb7
            int r9 = r2.getCount()     // Catch: java.lang.Throwable -> Lb7
        L70:
            if (r6 >= r9) goto L9a
            int r10 = r2.getWindowIndex(r6)     // Catch: java.lang.Throwable -> Lb7
            long r11 = r2.getLong(r7, r6, r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r11 = r5.get(r11)     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.drive.metadata.internal.ParentDriveIdSet r11 = (com.google.android.gms.drive.metadata.internal.ParentDriveIdSet) r11     // Catch: java.lang.Throwable -> Lb7
            com.google.android.gms.drive.metadata.internal.zzq r12 = new com.google.android.gms.drive.metadata.internal.zzq     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r13 = r2.getString(r3, r6, r10)     // Catch: java.lang.Throwable -> Lb7
            long r14 = r2.getLong(r8, r6, r10)     // Catch: java.lang.Throwable -> Lb7
            r10 = 1
            r12.<init>(r13, r14, r10)     // Catch: java.lang.Throwable -> Lb7
            java.util.List<com.google.android.gms.drive.metadata.internal.zzq> r10 = r11.zzjj     // Catch: java.lang.Throwable -> Lb7
            r10.add(r12)     // Catch: java.lang.Throwable -> Lb7
            int r6 = r6 + 1
            goto L70
        L9a:
            android.os.Bundle r3 = r17.getMetadata()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "parentsExtra"
            r3.putParcelableArrayList(r5, r4)     // Catch: java.lang.Throwable -> Lb7
            r2.close()     // Catch: java.lang.Throwable -> Lc5
            android.os.Bundle r2 = r17.getMetadata()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "parentsExtraHolder"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc5
        Lb0:
            java.lang.String r1 = "parentsExtra"
            java.util.ArrayList r2 = r0.getParcelableArrayList(r1)
            goto Lc8
        Lb7:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lc5
            android.os.Bundle r2 = r17.getMetadata()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "parentsExtraHolder"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        Lc8:
            if (r2 != 0) goto Lcc
            r0 = 0
            return r0
        Lcc:
            java.lang.String r1 = "dbInstanceId"
            long r0 = r0.getLong(r1)
            r3 = r18
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.drive.metadata.internal.ParentDriveIdSet r2 = (com.google.android.gms.drive.metadata.internal.ParentDriveIdSet) r2
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.List<com.google.android.gms.drive.metadata.internal.zzq> r2 = r2.zzjj
            java.util.Iterator r2 = r2.iterator()
        Le5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L102
            java.lang.Object r3 = r2.next()
            com.google.android.gms.drive.metadata.internal.zzq r3 = (com.google.android.gms.drive.metadata.internal.zzq) r3
            com.google.android.gms.drive.DriveId r11 = new com.google.android.gms.drive.DriveId
            java.lang.String r4 = r3.zzad
            long r5 = r3.zzae
            int r9 = r3.zzaf
            r3 = r11
            r7 = r0
            r3.<init>(r4, r5, r7, r9)
            r10.add(r11)
            goto Le5
        L102:
            return r10
    }
}
