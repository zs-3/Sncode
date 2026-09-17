package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzid extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> {
    public static final com.google.android.gms.drive.metadata.internal.zzg zzlc = null;

    static {
            com.google.android.gms.internal.drive.zzie r0 = new com.google.android.gms.internal.drive.zzie
            r0.<init>()
            com.google.android.gms.internal.drive.zzid.zzlc = r0
            return
    }

    public zzid(int r4) {
            r3 = this;
            java.lang.String r4 = "hasCustomProperties"
            java.lang.String r0 = "sqlId"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.String r0 = "customPropertiesExtra"
            java.lang.String r1 = "customPropertiesExtraHolder"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "customProperties"
            r2 = 5000000(0x4c4b40, float:7.006492E-39)
            r3.<init>(r1, r4, r0, r2)
            return
    }

    private static void zzc(com.google.android.gms.common.data.DataHolder r2) {
            android.os.Bundle r0 = r2.getMetadata()
            if (r0 != 0) goto L7
            return
        L7:
            monitor-enter(r2)
            java.lang.String r1 = "customPropertiesExtraHolder"
            android.os.Parcelable r1 = r0.getParcelable(r1)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "customPropertiesExtraHolder"
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

    private static com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzf(com.google.android.gms.common.data.DataHolder r16, int r17, int r18) {
            r1 = r16
            android.os.Bundle r0 = r16.getMetadata()
            java.lang.String r2 = "customPropertiesExtra"
            android.util.SparseArray r2 = r0.getSparseParcelableArray(r2)
            if (r2 != 0) goto Ldf
            java.lang.String r3 = "customPropertiesExtraHolder"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            if (r3 == 0) goto Lda
            monitor-enter(r16)
            android.os.Bundle r2 = r16.getMetadata()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "customPropertiesExtraHolder"
            android.os.Parcelable r2 = r2.getParcelable(r3)     // Catch: java.lang.Throwable -> Ld7
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2     // Catch: java.lang.Throwable -> Ld7
            if (r2 != 0) goto L28
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Ld7
            goto Lc2
        L28:
            android.os.Bundle r3 = r2.getMetadata()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "entryIdColumn"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "keyColumn"
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "visibilityColumn"
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "valueColumn"
            java.lang.String r3 = r3.getString(r7)     // Catch: java.lang.Throwable -> Lc9
            androidx.collection.LongSparseArray r7 = new androidx.collection.LongSparseArray     // Catch: java.lang.Throwable -> Lc9
            r7.<init>()     // Catch: java.lang.Throwable -> Lc9
            r9 = 0
        L4a:
            int r10 = r2.getCount()     // Catch: java.lang.Throwable -> Lc9
            if (r9 >= r10) goto L84
            int r10 = r2.getWindowIndex(r9)     // Catch: java.lang.Throwable -> Lc9
            long r11 = r2.getLong(r4, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r13 = r2.getString(r5, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            int r14 = r2.getInteger(r6, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r10 = r2.getString(r3, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.drive.metadata.internal.zzc r15 = new com.google.android.gms.drive.metadata.internal.zzc     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.drive.metadata.CustomPropertyKey r8 = new com.google.android.gms.drive.metadata.CustomPropertyKey     // Catch: java.lang.Throwable -> Lc9
            r8.<init>(r13, r14)     // Catch: java.lang.Throwable -> Lc9
            r15.<init>(r8, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r8 = r7.get(r11)     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r8 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza) r8     // Catch: java.lang.Throwable -> Lc9
            if (r8 != 0) goto L7e
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r8 = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza     // Catch: java.lang.Throwable -> Lc9
            r8.<init>()     // Catch: java.lang.Throwable -> Lc9
            r7.put(r11, r8)     // Catch: java.lang.Throwable -> Lc9
        L7e:
            r8.zza(r15)     // Catch: java.lang.Throwable -> Lc9
            int r9 = r9 + 1
            goto L4a
        L84:
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> Lc9
            r3.<init>()     // Catch: java.lang.Throwable -> Lc9
            r8 = 0
        L8a:
            int r4 = r16.getCount()     // Catch: java.lang.Throwable -> Lc9
            if (r8 >= r4) goto Lac
            java.lang.String r4 = "sqlId"
            int r5 = r1.getWindowIndex(r8)     // Catch: java.lang.Throwable -> Lc9
            long r4 = r1.getLong(r4, r8, r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r4 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza) r4     // Catch: java.lang.Throwable -> Lc9
            if (r4 == 0) goto La9
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r4 = r4.zzbb()     // Catch: java.lang.Throwable -> Lc9
            r3.append(r8, r4)     // Catch: java.lang.Throwable -> Lc9
        La9:
            int r8 = r8 + 1
            goto L8a
        Lac:
            android.os.Bundle r4 = r16.getMetadata()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "customPropertiesExtra"
            r4.putSparseParcelableArray(r5, r3)     // Catch: java.lang.Throwable -> Lc9
            r2.close()     // Catch: java.lang.Throwable -> Ld7
            android.os.Bundle r2 = r16.getMetadata()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "customPropertiesExtraHolder"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Ld7
        Lc2:
            java.lang.String r1 = "customPropertiesExtra"
            android.util.SparseArray r2 = r0.getSparseParcelableArray(r1)
            goto Lda
        Lc9:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Ld7
            android.os.Bundle r2 = r16.getMetadata()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "customPropertiesExtraHolder"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Ld7
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Ld7
            throw r0
        Lda:
            if (r2 != 0) goto Ldf
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zzjb
            return r0
        Ldf:
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zzjb
            r1 = r17
            java.lang.Object r0 = r2.get(r1, r0)
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) r0
            return r0
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r1 = zzf(r1, r2, r3)
            return r1
    }
}
