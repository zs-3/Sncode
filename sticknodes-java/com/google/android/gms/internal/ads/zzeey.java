package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeey extends com.google.android.gms.internal.ads.zzftp {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    public zzeey(android.content.Context r8, com.google.android.gms.internal.ads.zzgfz r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            com.google.android.gms.internal.ads.zzftr r6 = com.google.android.gms.internal.ads.zzftr.zza
            java.lang.String r3 = "AdMobOfflineBufferedPings.db"
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zza = r8
            r7.zzb = r9
            return
    }

    static /* synthetic */ java.lang.Void zzb(com.google.android.gms.ads.internal.util.client.zzr r0, android.database.sqlite.SQLiteDatabase r1) throws java.lang.Exception {
            zzj(r1, r0)
            r0 = 0
            return r0
    }

    static /* synthetic */ void zzf(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, com.google.android.gms.ads.internal.util.client.zzr r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "event_state"
            r0.put(r3, r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "offline_buffered_pings"
            java.lang.String r2 = "gws_query_id = ?"
            r4.update(r5, r0, r2, r1)
            zzj(r4, r6)
            return
    }

    static final void zzi(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = java.lang.Integer.toString(r1)
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = "offline_buffered_pings"
            java.lang.String r1 = "gws_query_id = ? AND event_state = ?"
            r2.delete(r3, r1, r0)
            return
    }

    private static void zzj(android.database.sqlite.SQLiteDatabase r14, com.google.android.gms.ads.internal.util.client.zzr r15) {
            java.lang.String r0 = "url"
            java.lang.String r1 = "timestamp"
            r14.beginTransaction()
            java.lang.String[] r4 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "event_state = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9b
            r11 = 1
            r2.append(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = "timestamp ASC"
            java.lang.String r3 = "offline_buffered_pings"
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r2 = r14
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9b
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> L9b
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9b
            r5 = 0
            r6 = 0
        L32:
            boolean r7 = r2.moveToNext()     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto L78
            int r7 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L9b
            int r8 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L9b
            r9 = -1
            if (r8 == r9) goto L75
            long r9 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r2.getString(r8)     // Catch: java.lang.Throwable -> L9b
            if (r7 != 0) goto L50
            java.lang.String r7 = ""
            goto L73
        L50:
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.common.util.Clock r8 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L9b
            long r12 = r8.currentTimeMillis()     // Catch: java.lang.Throwable -> L9b
            long r12 = r12 - r9
            android.net.Uri$Builder r7 = r7.buildUpon()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = "bd"
            java.lang.String r9 = java.lang.Long.toString(r12)     // Catch: java.lang.Throwable -> L9b
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r8, r9)     // Catch: java.lang.Throwable -> L9b
            android.net.Uri r7 = r7.build()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L9b
        L73:
            r4[r6] = r7     // Catch: java.lang.Throwable -> L9b
        L75:
            int r6 = r6 + 1
            goto L32
        L78:
            r2.close()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "event_state = ?"
            java.lang.String[] r1 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.Integer.toString(r11)     // Catch: java.lang.Throwable -> L9b
            r1[r5] = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "offline_buffered_pings"
            r14.delete(r2, r0, r1)     // Catch: java.lang.Throwable -> L9b
            r14.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L9b
            r14.endTransaction()
        L90:
            if (r5 >= r3) goto L9a
            r14 = r4[r5]
            r15.zza(r14)
            int r5 = r5 + 1
            goto L90
        L9a:
            return
        L9b:
            r15 = move-exception
            r14.endTransaction()
            throw r15
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)"
            r2.execSQL(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE IF EXISTS offline_buffered_pings"
            r1.execSQL(r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE IF EXISTS offline_buffered_pings"
            r1.execSQL(r2)
            return
    }

    final /* synthetic */ java.lang.Void zza(com.google.android.gms.internal.ads.zzefa r4, android.database.sqlite.SQLiteDatabase r5) throws java.lang.Exception {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            long r1 = r4.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzb
            java.lang.String r2 = "gws_query_id"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzc
            java.lang.String r2 = "url"
            r0.put(r2, r1)
            int r4 = r4.zzd
            int r4 = r4 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "event_state"
            r0.put(r1, r4)
            java.lang.String r4 = "offline_buffered_pings"
            r1 = 0
            r5.insert(r4, r1, r0)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r4 = r3.zza
            com.google.android.gms.ads.internal.util.zzbr r4 = com.google.android.gms.ads.internal.util.zzt.zzz(r4)
            if (r4 == 0) goto L4c
            android.content.Context r5 = r3.zza     // Catch: android.os.RemoteException -> L46
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L46
            r4.zze(r5)     // Catch: android.os.RemoteException -> L46
            goto L4c
        L46:
            r4 = move-exception
            java.lang.String r5 = "Failed to schedule offline ping sender."
            com.google.android.gms.ads.internal.util.zze.zzb(r5, r4)
        L4c:
            return r1
    }

    public final void zzc(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeew r0 = new com.google.android.gms.internal.ads.zzeew
            r0.<init>(r1, r2)
            r1.zze(r0)
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzefa r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzees r0 = new com.google.android.gms.internal.ads.zzees
            r0.<init>(r1, r2)
            r1.zze(r0)
            return
    }

    final void zze(com.google.android.gms.internal.ads.zzfkj r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeeu r0 = new com.google.android.gms.internal.ads.zzeeu
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            com.google.android.gms.internal.ads.zzeex r1 = new com.google.android.gms.internal.ads.zzeex
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)
            return
    }

    final void zzg(android.database.sqlite.SQLiteDatabase r2, com.google.android.gms.ads.internal.util.client.zzr r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeev r0 = new com.google.android.gms.internal.ads.zzeev
            r0.<init>(r2, r4, r3)
            com.google.android.gms.internal.ads.zzgfz r2 = r1.zzb
            r2.execute(r0)
            return
    }

    public final void zzh(com.google.android.gms.ads.internal.util.client.zzr r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeet r0 = new com.google.android.gms.internal.ads.zzeet
            r0.<init>(r1, r2, r3)
            r1.zze(r0)
            return
    }
}
