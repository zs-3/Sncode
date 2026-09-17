package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
public class SQLiteEventStore implements com.google.android.datatransport.runtime.scheduling.persistence.EventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard, com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final java.lang.String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final com.google.android.datatransport.Encoding PROTOBUF_ENCODING = null;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig config;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final javax.inject.Provider<java.lang.String> packageName;
    private final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    interface Function<T, U> {
        U apply(T r1);
    }

    private static class Metadata {
        final java.lang.String key;
        final java.lang.String value;

        private Metadata(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }

        /* synthetic */ Metadata(java.lang.String r1, java.lang.String r2, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    interface Producer<T> {
        T produce();
    }

    /* renamed from: $r8$lambda$0pNhga4xM-MK_qplFBb1XL4Lznc, reason: not valid java name */
    public static /* synthetic */ android.database.sqlite.SQLiteDatabase m27$r8$lambda$0pNhga4xMMK_qplFBb1XL4Lznc(java.lang.Throwable r0) {
            android.database.sqlite.SQLiteDatabase r0 = lambda$getDb$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$6RFrfsb5pycEbPbzd1j5FC6eAZQ(java.lang.Throwable r0) {
            java.lang.Object r0 = lambda$ensureBeginTransaction$25(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow $r8$lambda$8o3pcLz42hQl7SSs5rPondQ4HSw(long r0, android.database.Cursor r2) {
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = lambda$getTimeWindow$21(r0, r2)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$AMBKwQ3I9Cpq6b0pGBz39qvBDN8(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, com.google.android.datatransport.runtime.TransportContext r1, android.database.sqlite.SQLiteDatabase r2) {
            java.util.List r0 = r0.lambda$loadBatch$8(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$CVcnzpiKCONHRUqzlHyi1YquY4g(android.database.sqlite.SQLiteDatabase r0) {
            java.lang.Object r0 = lambda$ensureBeginTransaction$24(r0)
            return r0
    }

    /* renamed from: $r8$lambda$F-UkvFX_U94l7yAdspBUc1dmFfM, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m28$r8$lambda$FUkvFX_U94l7yAdspBUc1dmFfM(long r0, com.google.android.datatransport.runtime.TransportContext r2, android.database.sqlite.SQLiteDatabase r3) {
            java.lang.Object r0 = lambda$recordNextCallTime$7(r0, r2, r3)
            return r0
    }

    public static /* synthetic */ byte[] $r8$lambda$FlNQ3Xs5Lo96E__4ij8CYS3DCt4(android.database.Cursor r0) {
            byte[] r0 = lambda$readPayload$15(r0)
            return r0
    }

    /* renamed from: $r8$lambda$I_y4b2XHWQ-nvmTGxCD92WQAI2Q, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m29$r8$lambda$I_y4b2XHWQnvmTGxCD92WQAI2Q(android.database.sqlite.SQLiteDatabase r0) {
            java.lang.Object r0 = lambda$clearDb$13(r0)
            return r0
    }

    /* renamed from: $r8$lambda$LwIniJ7TEMABr5XDNZ-hjZEDpbo, reason: not valid java name */
    public static /* synthetic */ java.util.List m30$r8$lambda$LwIniJ7TEMABr5XDNZhjZEDpbo(android.database.Cursor r0) {
            java.util.List r0 = lambda$loadActiveContexts$9(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$NKvoNxJPscgNvO9I_BUschNgwU0(java.lang.String r0, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r1, long r2, android.database.sqlite.SQLiteDatabase r4) {
            java.lang.Object r0 = lambda$recordLogEventDropped$18(r0, r1, r2, r4)
            return r0
    }

    /* renamed from: $r8$lambda$PgfELoGbz8gaLSIcjI-ayg_Hoks, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m31$r8$lambda$PgfELoGbz8gaLSIcjIayg_Hoks(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, android.database.Cursor r1) {
            java.lang.Object r0 = r0.lambda$cleanUp$11(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$QMebUAXXtKjpg4z3JpJv7FltEYU(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, com.google.android.datatransport.runtime.TransportContext r1, android.database.sqlite.SQLiteDatabase r2) {
            java.lang.Boolean r0 = r0.lambda$hasPendingEventsFor$6(r1, r2)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow $r8$lambda$RSWpojPKkDrMvBeSxocdJR65pic(long r0, android.database.sqlite.SQLiteDatabase r2) {
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = lambda$getTimeWindow$22(r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Long $r8$lambda$Sh6yJGFWTLsd_30cUzl9yLa_YMg(android.database.Cursor r0) {
            java.lang.Long r0 = lambda$getNextCallTime$5(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics $r8$lambda$Tp04eFGXofDuQuggKYF7mlQ8_nE(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, java.lang.String r1, java.util.Map r2, com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder r3, android.database.sqlite.SQLiteDatabase r4) {
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = r0.lambda$loadClientMetrics$20(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$_ODvwrA4e5PffihOIPekiQxZ_ys(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, java.util.List r1, com.google.android.datatransport.runtime.TransportContext r2, android.database.Cursor r3) {
            java.lang.Object r0 = r0.lambda$loadEvents$14(r1, r2, r3)
            return r0
    }

    /* renamed from: $r8$lambda$ay-gMZD86BC6lBcqzDnqrGFe1do, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m32$r8$lambda$aygMZD86BC6lBcqzDnqrGFe1do(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, android.database.sqlite.SQLiteDatabase r1) {
            java.lang.Object r0 = r0.lambda$resetClientMetrics$23(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Long $r8$lambda$dHdF4FfDiVZdg0Y0Qp9a2i_CYcE(android.database.Cursor r0) {
            java.lang.Long r0 = lambda$getTransportContextId$2(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$gKYqXsg1_yufDN2V8syELXN02mo(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, java.lang.String r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase r3) {
            java.lang.Object r0 = r0.lambda$recordFailure$4(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Long $r8$lambda$iYuxN0Ty41ycitE3CEiSDQ_wwLA(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, com.google.android.datatransport.runtime.EventInternal r1, com.google.android.datatransport.runtime.TransportContext r2, android.database.sqlite.SQLiteDatabase r3) {
            java.lang.Long r0 = r0.lambda$persist$1(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$jHvNLuj_MNfbJKoNwQY_V7SxzbM(java.util.Map r0, android.database.Cursor r1) {
            java.lang.Object r0 = lambda$loadMetadata$16(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics $r8$lambda$jToXvdvvCkSFXZmkvvCA8P63UU0(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, java.util.Map r1, com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder r2, android.database.Cursor r3) {
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = r0.lambda$loadClientMetrics$19(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$nJYrpP_782AsLmrJLLB1GwW_GSI(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, android.database.Cursor r1) {
            java.lang.Object r0 = r0.lambda$recordFailure$3(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer $r8$lambda$oKqdxOixQwtlnwudfP7AamBZ6Fk(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0, long r1, android.database.sqlite.SQLiteDatabase r3) {
            java.lang.Integer r0 = r0.lambda$cleanUp$12(r1, r3)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$zn4IshrquL3Sn0eA13DcwuSm0VQ(android.database.sqlite.SQLiteDatabase r0) {
            java.util.List r0 = lambda$loadActiveContexts$10(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$zvHxP8cxNeVDvHakg6AjdD6K3mQ(android.database.Cursor r0) {
            java.lang.Boolean r0 = lambda$recordLogEventDropped$17(r0)
            return r0
    }

    static {
            java.lang.String r0 = "proto"
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.PROTOBUF_ENCODING = r0
            return
    }

    SQLiteEventStore(@com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r1, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r3, com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r4, javax.inject.Provider<java.lang.String> r5) {
            r0 = this;
            r0.<init>()
            r0.schemaManager = r4
            r0.wallClock = r1
            r0.monotonicClock = r2
            r0.config = r3
            r0.packageName = r5
            return
    }

    private com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason convertToReason(int r4) {
            r3 = this;
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN
            int r1 = r0.getNumber()
            if (r4 != r1) goto L9
            return r0
        L9:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD
            int r2 = r1.getNumber()
            if (r4 != r2) goto L12
            return r1
        L12:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL
            int r2 = r1.getNumber()
            if (r4 != r2) goto L1b
            return r1
        L1b:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.PAYLOAD_TOO_BIG
            int r2 = r1.getNumber()
            if (r4 != r2) goto L24
            return r1
        L24:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED
            int r2 = r1.getNumber()
            if (r4 != r2) goto L2d
            return r1
        L2d:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD
            int r2 = r1.getNumber()
            if (r4 != r2) goto L36
            return r1
        L36:
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.SERVER_ERROR
            int r2 = r1.getNumber()
            if (r4 != r2) goto L3f
            return r1
        L3f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "SQLiteEventStore"
            java.lang.String r2 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r2, r4)
            return r0
    }

    private void ensureBeginTransaction(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda26 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda26
            r0.<init>(r2)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda25 r2 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda25.INSTANCE
            r1.retryIfDbLocked(r0, r2)
            return
    }

    private long ensureTransportContext(android.database.sqlite.SQLiteDatabase r5, com.google.android.datatransport.runtime.TransportContext r6) {
            r4 = this;
            java.lang.Long r0 = r4.getTransportContextId(r5, r6)
            if (r0 == 0) goto Lb
            long r5 = r0.longValue()
            return r5
        Lb:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = r6.getBackendName()
            java.lang.String r2 = "backend_name"
            r0.put(r2, r1)
            com.google.android.datatransport.Priority r1 = r6.getPriority()
            int r1 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "priority"
            r0.put(r2, r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "next_request_ms"
            r0.put(r3, r2)
            byte[] r2 = r6.getExtras()
            if (r2 == 0) goto L47
            byte[] r6 = r6.getExtras()
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r1)
            java.lang.String r1 = "extras"
            r0.put(r1, r6)
        L47:
            r6 = 0
            java.lang.String r1 = "transport_contexts"
            long r5 = r5.insert(r1, r6, r0)
            return r5
    }

    private com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetrics() {
            r4 = this;
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder r0 = com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.newBuilder()
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder r1 = com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.newBuilder()
            long r2 = r4.getByteSize()
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder r1 = r1.setCurrentCacheSizeBytes(r2)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT
            long r2 = r2.getMaxStorageSizeInBytes()
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder r1 = r1.setMaxCacheSizeBytes(r2)
            com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r1 = r1.build()
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder r0 = r0.setStorageMetrics(r1)
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r0 = r0.build()
            return r0
    }

    private long getPageCount() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            java.lang.String r1 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    private long getPageSize() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            java.lang.String r1 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    private com.google.android.datatransport.runtime.firebase.transport.TimeWindow getTimeWindow() {
            r3 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r3.wallClock
            long r0 = r0.getTime()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda1 r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda1
            r2.<init>(r0)
            java.lang.Object r0 = r3.inTransaction(r2)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r0 = (com.google.android.datatransport.runtime.firebase.transport.TimeWindow) r0
            return r0
    }

    private java.lang.Long getTransportContextId(android.database.sqlite.SQLiteDatabase r14, com.google.android.datatransport.runtime.TransportContext r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "backend_name = ? and priority = ?"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r15.getBackendName()
            r4 = 0
            r2[r4] = r3
            com.google.android.datatransport.Priority r3 = r15.getPriority()
            int r3 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            byte[] r2 = r15.getExtras()
            if (r2 == 0) goto L40
            java.lang.String r2 = " and extras = ?"
            r0.append(r2)
            byte[] r15 = r15.getExtras()
            java.lang.String r15 = android.util.Base64.encodeToString(r15, r4)
            r1.add(r15)
            goto L45
        L40:
            java.lang.String r15 = " and extras is null"
            r0.append(r15)
        L45:
            java.lang.String r15 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r15}
            java.lang.String r8 = r0.toString()
            java.lang.String[] r15 = new java.lang.String[r4]
            java.lang.Object[] r15 = r1.toArray(r15)
            r9 = r15
            java.lang.String[] r9 = (java.lang.String[]) r9
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r6 = "transport_contexts"
            r5 = r14
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda19 r15 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda19.INSTANCE
            java.lang.Object r14 = tryWithCursor(r14, r15)
            java.lang.Long r14 = (java.lang.Long) r14
            return r14
    }

    private boolean isStorageAtLimit() {
            r5 = this;
            long r0 = r5.getPageCount()
            long r2 = r5.getPageSize()
            long r0 = r0 * r2
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = r5.config
            long r2 = r2.getMaxStorageSizeInBytes()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> join(java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r7, java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> r8) {
            r6 = this;
            java.util.ListIterator r0 = r7.listIterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r1
            long r2 = r1.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r8.containsKey(r2)
            if (r2 != 0) goto L1f
            goto L4
        L1f:
            com.google.android.datatransport.runtime.EventInternal r2 = r1.getEvent()
            com.google.android.datatransport.runtime.EventInternal$Builder r2 = r2.toBuilder()
            long r3 = r1.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r8.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r3.next()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata r4 = (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata) r4
            java.lang.String r5 = r4.key
            java.lang.String r4 = r4.value
            r2.addMetadata(r5, r4)
            goto L39
        L4d:
            long r3 = r1.getId()
            com.google.android.datatransport.runtime.TransportContext r1 = r1.getTransportContext()
            com.google.android.datatransport.runtime.EventInternal r2 = r2.build()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r3, r1, r2)
            r0.set(r1)
            goto L4
        L61:
            return r7
    }

    private /* synthetic */ java.lang.Object lambda$cleanUp$11(android.database.Cursor r5) {
            r4 = this;
        L0:
            boolean r0 = r5.moveToNext()
            if (r0 == 0) goto L17
            r0 = 0
            int r0 = r5.getInt(r0)
            r1 = 1
            java.lang.String r1 = r5.getString(r1)
            long r2 = (long) r0
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD
            r4.recordLogEventDropped(r2, r0, r1)
            goto L0
        L17:
            r5 = 0
            return r5
    }

    private /* synthetic */ java.lang.Integer lambda$cleanUp$12(long r2, android.database.sqlite.SQLiteDatabase r4) {
            r1 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"
            android.database.Cursor r2 = r4.rawQuery(r2, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda3 r3 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda3
            r3.<init>(r1)
            tryWithCursor(r2, r3)
            java.lang.String r2 = "events"
            java.lang.String r3 = "timestamp_ms < ?"
            int r2 = r4.delete(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    private static /* synthetic */ java.lang.Object lambda$clearDb$13(android.database.sqlite.SQLiteDatabase r4) {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "events"
            r3 = 0
            r4.delete(r2, r3, r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "transport_contexts"
            r4.delete(r1, r3, r0)
            return r3
    }

    private static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$24(android.database.sqlite.SQLiteDatabase r0) {
            r0.beginTransaction()
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$25(java.lang.Throwable r2) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationException r0 = new com.google.android.datatransport.runtime.synchronization.SynchronizationException
            java.lang.String r1 = "Timed out while trying to acquire the lock."
            r0.<init>(r1, r2)
            throw r0
    }

    private static /* synthetic */ android.database.sqlite.SQLiteDatabase lambda$getDb$0(java.lang.Throwable r2) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationException r0 = new com.google.android.datatransport.runtime.synchronization.SynchronizationException
            java.lang.String r1 = "Timed out while trying to open db."
            r0.<init>(r1, r2)
            throw r0
    }

    private static /* synthetic */ java.lang.Long lambda$getNextCallTime$5(android.database.Cursor r2) {
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L10
            r0 = 0
            long r0 = r2.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L10:
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    private static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow lambda$getTimeWindow$21(long r2, android.database.Cursor r4) {
            r4.moveToNext()
            r0 = 0
            long r0 = r4.getLong(r0)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder r4 = com.google.android.datatransport.runtime.firebase.transport.TimeWindow.newBuilder()
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder r4 = r4.setStartMs(r0)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow$Builder r2 = r4.setEndMs(r2)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r2 = r2.build()
            return r2
    }

    private static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow lambda$getTimeWindow$22(long r2, android.database.sqlite.SQLiteDatabase r4) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r4 = r4.rawQuery(r1, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda0 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda0
            r0.<init>(r2)
            java.lang.Object r2 = tryWithCursor(r4, r0)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r2 = (com.google.android.datatransport.runtime.firebase.transport.TimeWindow) r2
            return r2
    }

    private static /* synthetic */ java.lang.Long lambda$getTransportContextId$2(android.database.Cursor r2) {
            boolean r0 = r2.moveToNext()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            long r0 = r2.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    private /* synthetic */ java.lang.Boolean lambda$hasPendingEventsFor$6(com.google.android.datatransport.runtime.TransportContext r3, android.database.sqlite.SQLiteDatabase r4) {
            r2 = this;
            java.lang.Long r3 = r2.getTransportContextId(r4, r3)
            if (r3 != 0) goto L9
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L9:
            android.database.sqlite.SQLiteDatabase r4 = r2.getDb()
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r3 = r3.toString()
            r0[r1] = r3
            java.lang.String r3 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            android.database.Cursor r3 = r4.rawQuery(r3, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda21 r4 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda21.INSTANCE
            java.lang.Object r3 = tryWithCursor(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
    }

    private static /* synthetic */ java.util.List lambda$loadActiveContexts$10(android.database.sqlite.SQLiteDatabase r2) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
            android.database.Cursor r2 = r2.rawQuery(r1, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda17 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda17.INSTANCE
            java.lang.Object r2 = tryWithCursor(r2, r0)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    private static /* synthetic */ java.util.List lambda$loadActiveContexts$9(android.database.Cursor r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            boolean r1 = r3.moveToNext()
            if (r1 == 0) goto L3a
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = com.google.android.datatransport.runtime.TransportContext.builder()
            r2 = 1
            java.lang.String r2 = r3.getString(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setBackendName(r2)
            r2 = 2
            int r2 = r3.getInt(r2)
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setPriority(r2)
            r2 = 3
            java.lang.String r2 = r3.getString(r2)
            byte[] r2 = maybeBase64Decode(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r1 = r1.setExtras(r2)
            com.google.android.datatransport.runtime.TransportContext r1 = r1.build()
            r0.add(r1)
            goto L5
        L3a:
            return r0
    }

    private /* synthetic */ java.util.List lambda$loadBatch$8(com.google.android.datatransport.runtime.TransportContext r8, android.database.sqlite.SQLiteDatabase r9) {
            r7 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = r7.config
            int r0 = r0.getLoadBatchSize()
            java.util.List r0 = r7.loadEvents(r9, r8, r0)
            com.google.android.datatransport.Priority[] r1 = com.google.android.datatransport.Priority.values()
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L37
            r4 = r1[r3]
            com.google.android.datatransport.Priority r5 = r8.getPriority()
            if (r4 != r5) goto L1b
            goto L34
        L1b:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r5 = r7.config
            int r5 = r5.getLoadBatchSize()
            int r6 = r0.size()
            int r5 = r5 - r6
            if (r5 > 0) goto L29
            goto L37
        L29:
            com.google.android.datatransport.runtime.TransportContext r4 = r8.withPriority(r4)
            java.util.List r4 = r7.loadEvents(r9, r4, r5)
            r0.addAll(r4)
        L34:
            int r3 = r3 + 1
            goto L10
        L37:
            java.util.Map r8 = r7.loadMetadata(r9, r0)
            java.util.List r8 = r7.join(r0, r8)
            return r8
    }

    private /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics lambda$loadClientMetrics$19(java.util.Map r6, com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder r7, android.database.Cursor r8) {
            r5 = this;
        L0:
            boolean r0 = r8.moveToNext()
            if (r0 == 0) goto L41
            r0 = 0
            java.lang.String r0 = r8.getString(r0)
            r1 = 1
            int r1 = r8.getInt(r1)
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r1 = r5.convertToReason(r1)
            r2 = 2
            long r2 = r8.getLong(r2)
            boolean r4 = r6.containsKey(r0)
            if (r4 != 0) goto L27
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.put(r0, r4)
        L27:
            java.lang.Object r0 = r6.get(r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder r4 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.newBuilder()
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder r1 = r4.setReason(r1)
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder r1 = r1.setEventsDroppedCount(r2)
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r1 = r1.build()
            r0.add(r1)
            goto L0
        L41:
            r5.populateLogSourcesMetrics(r7, r6)
            com.google.android.datatransport.runtime.firebase.transport.TimeWindow r6 = r5.getTimeWindow()
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r6 = r7.setWindow(r6)
            com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r7 = r5.getGlobalMetrics()
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r6 = r6.setGlobalMetrics(r7)
            javax.inject.Provider<java.lang.String> r7 = r5.packageName
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r6 = r6.setAppNamespace(r7)
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r6 = r6.build()
            return r6
    }

    private /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics lambda$loadClientMetrics$20(java.lang.String r2, java.util.Map r3, com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder r4, android.database.sqlite.SQLiteDatabase r5) {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            android.database.Cursor r2 = r5.rawQuery(r2, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda13 r5 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda13
            r5.<init>(r1, r3, r4)
            java.lang.Object r2 = tryWithCursor(r2, r5)
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r2 = (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) r2
            return r2
    }

    private /* synthetic */ java.lang.Object lambda$loadEvents$14(java.util.List r7, com.google.android.datatransport.runtime.TransportContext r8, android.database.Cursor r9) {
            r6 = this;
        L0:
            boolean r0 = r9.moveToNext()
            if (r0 == 0) goto Lbe
            r0 = 0
            long r1 = r9.getLong(r0)
            r3 = 7
            int r3 = r9.getInt(r3)
            r4 = 1
            if (r3 == 0) goto L14
            r0 = 1
        L14:
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = com.google.android.datatransport.runtime.EventInternal.builder()
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setTransportName(r4)
            r4 = 2
            long r4 = r9.getLong(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setEventMillis(r4)
            r4 = 3
            long r4 = r9.getLong(r4)
            com.google.android.datatransport.runtime.EventInternal$Builder r3 = r3.setUptimeMillis(r4)
            r4 = 4
            if (r0 == 0) goto L4b
            com.google.android.datatransport.runtime.EncodedPayload r0 = new com.google.android.datatransport.runtime.EncodedPayload
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.Encoding r4 = toEncoding(r4)
            r5 = 5
            byte[] r5 = r9.getBlob(r5)
            r0.<init>(r4, r5)
            r3.setEncodedPayload(r0)
            goto L5f
        L4b:
            com.google.android.datatransport.runtime.EncodedPayload r0 = new com.google.android.datatransport.runtime.EncodedPayload
            java.lang.String r4 = r9.getString(r4)
            com.google.android.datatransport.Encoding r4 = toEncoding(r4)
            byte[] r5 = r6.readPayload(r1)
            r0.<init>(r4, r5)
            r3.setEncodedPayload(r0)
        L5f:
            r0 = 6
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto L71
            int r0 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setCode(r0)
        L71:
            r0 = 8
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto L84
            int r0 = r9.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setProductId(r0)
        L84:
            r0 = 9
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto L93
            java.lang.String r0 = r9.getString(r0)
            r3.setPseudonymousId(r0)
        L93:
            r0 = 10
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto La2
            byte[] r0 = r9.getBlob(r0)
            r3.setExperimentIdsClear(r0)
        La2:
            r0 = 11
            boolean r4 = r9.isNull(r0)
            if (r4 != 0) goto Lb1
            byte[] r0 = r9.getBlob(r0)
            r3.setExperimentIdsEncrypted(r0)
        Lb1:
            com.google.android.datatransport.runtime.EventInternal r0 = r3.build()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r0 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r1, r8, r0)
            r7.add(r0)
            goto L0
        Lbe:
            r7 = 0
            return r7
    }

    private static /* synthetic */ java.lang.Object lambda$loadMetadata$16(java.util.Map r5, android.database.Cursor r6) {
        L0:
            boolean r0 = r6.moveToNext()
            r1 = 0
            if (r0 == 0) goto L37
            r0 = 0
            long r2 = r6.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r5.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L24
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.put(r2, r0)
        L24:
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata
            r3 = 1
            java.lang.String r3 = r6.getString(r3)
            r4 = 2
            java.lang.String r4 = r6.getString(r4)
            r2.<init>(r3, r4, r1)
            r0.add(r2)
            goto L0
        L37:
            return r1
    }

    private /* synthetic */ java.lang.Long lambda$persist$1(com.google.android.datatransport.runtime.EventInternal r12, com.google.android.datatransport.runtime.TransportContext r13, android.database.sqlite.SQLiteDatabase r14) {
            r11 = this;
            boolean r0 = r11.isStorageAtLimit()
            if (r0 == 0) goto L18
            r13 = 1
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL
            java.lang.String r12 = r12.getTransportName()
            r11.recordLogEventDropped(r13, r0, r12)
            r12 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            return r12
        L18:
            long r0 = r11.ensureTransportContext(r14, r13)
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r13 = r11.config
            int r13 = r13.getMaxBlobByteSizePerRow()
            com.google.android.datatransport.runtime.EncodedPayload r2 = r12.getEncodedPayload()
            byte[] r2 = r2.getBytes()
            int r3 = r2.length
            r4 = 0
            r5 = 1
            if (r3 > r13) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "context_id"
            r6.put(r1, r0)
            java.lang.String r0 = r12.getTransportName()
            java.lang.String r1 = "transport_name"
            r6.put(r1, r0)
            long r0 = r12.getEventMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "timestamp_ms"
            r6.put(r1, r0)
            long r0 = r12.getUptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "uptime_ms"
            r6.put(r1, r0)
            com.google.android.datatransport.runtime.EncodedPayload r0 = r12.getEncodedPayload()
            com.google.android.datatransport.Encoding r0 = r0.getEncoding()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "payload_encoding"
            r6.put(r1, r0)
            java.lang.Integer r0 = r12.getCode()
            java.lang.String r1 = "code"
            r6.put(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "num_attempts"
            r6.put(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "inline"
            r6.put(r1, r0)
            if (r3 == 0) goto L93
            r0 = r2
            goto L95
        L93:
            byte[] r0 = new byte[r4]
        L95:
            java.lang.String r1 = "payload"
            r6.put(r1, r0)
            java.lang.Integer r0 = r12.getProductId()
            java.lang.String r1 = "product_id"
            r6.put(r1, r0)
            java.lang.String r0 = r12.getPseudonymousId()
            java.lang.String r1 = "pseudonymous_id"
            r6.put(r1, r0)
            byte[] r0 = r12.getExperimentIdsClear()
            java.lang.String r1 = "experiment_ids_clear_blob"
            r6.put(r1, r0)
            byte[] r0 = r12.getExperimentIdsEncrypted()
            java.lang.String r1 = "experiment_ids_encrypted_blob"
            r6.put(r1, r0)
            java.lang.String r0 = "events"
            r1 = 0
            long r6 = r14.insert(r0, r1, r6)
            java.lang.String r0 = "event_id"
            if (r3 != 0) goto L105
            int r3 = r2.length
            double r3 = (double) r3
            double r8 = (double) r13
            double r3 = r3 / r8
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
        Ld2:
            if (r5 > r3) goto L105
            int r4 = r5 + (-1)
            int r4 = r4 * r13
            int r8 = r5 * r13
            int r9 = r2.length
            int r8 = java.lang.Math.min(r8, r9)
            byte[] r4 = java.util.Arrays.copyOfRange(r2, r4, r8)
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r8.put(r0, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "sequence_num"
            r8.put(r10, r9)
            java.lang.String r9 = "bytes"
            r8.put(r9, r4)
            java.lang.String r4 = "event_payloads"
            r14.insert(r4, r1, r8)
            int r5 = r5 + 1
            goto Ld2
        L105:
            java.util.Map r12 = r12.getMetadata()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L111:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L145
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r2.put(r0, r3)
            java.lang.Object r3 = r13.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "name"
            r2.put(r4, r3)
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r3 = "value"
            r2.put(r3, r13)
            java.lang.String r13 = "event_metadata"
            r14.insert(r13, r1, r2)
            goto L111
        L145:
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            return r12
    }

    private static /* synthetic */ byte[] lambda$readPayload$15(android.database.Cursor r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            boolean r3 = r6.moveToNext()
            if (r3 == 0) goto L17
            byte[] r3 = r6.getBlob(r1)
            r0.add(r3)
            int r3 = r3.length
            int r2 = r2 + r3
            goto L7
        L17:
            byte[] r6 = new byte[r2]
            r2 = 0
            r3 = 0
        L1b:
            int r4 = r0.size()
            if (r2 >= r4) goto L30
            java.lang.Object r4 = r0.get(r2)
            byte[] r4 = (byte[]) r4
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r6, r3, r5)
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L1b
        L30:
            return r6
    }

    private /* synthetic */ java.lang.Object lambda$recordFailure$3(android.database.Cursor r5) {
            r4 = this;
        L0:
            boolean r0 = r5.moveToNext()
            if (r0 == 0) goto L17
            r0 = 0
            int r0 = r5.getInt(r0)
            r1 = 1
            java.lang.String r1 = r5.getString(r1)
            long r2 = (long) r0
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED
            r4.recordLogEventDropped(r2, r0, r1)
            goto L0
        L17:
            r5 = 0
            return r5
    }

    private /* synthetic */ java.lang.Object lambda$recordFailure$4(java.lang.String r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase r4) {
            r1 = this;
            android.database.sqlite.SQLiteStatement r2 = r4.compileStatement(r2)
            r2.execute()
            r2 = 0
            android.database.Cursor r3 = r4.rawQuery(r3, r2)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda4 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda4
            r0.<init>(r1)
            tryWithCursor(r3, r0)
            java.lang.String r3 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r3 = r4.compileStatement(r3)
            r3.execute()
            return r2
    }

    private static /* synthetic */ java.lang.Boolean lambda$recordLogEventDropped$17(android.database.Cursor r0) {
            int r0 = r0.getCount()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$recordLogEventDropped$18(java.lang.String r6, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r7, long r8, android.database.sqlite.SQLiteDatabase r10) {
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r6
            int r3 = r7.getNumber()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?"
            android.database.Cursor r1 = r10.rawQuery(r3, r1)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda20 r3 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda20.INSTANCE
            java.lang.Object r1 = tryWithCursor(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 0
            if (r1 != 0) goto L4c
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "log_source"
            r0.put(r1, r6)
            int r6 = r7.getNumber()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "reason"
            r0.put(r7, r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.String r7 = "events_dropped_count"
            r0.put(r7, r6)
            java.lang.String r6 = "log_event_dropped"
            r10.insert(r6, r3, r0)
            goto L73
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + "
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = " WHERE log_source = ? AND reason = ?"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String[] r9 = new java.lang.String[r0]
            r9[r2] = r6
            int r6 = r7.getNumber()
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r9[r4] = r6
            r10.execSQL(r8, r9)
        L73:
            return r3
    }

    private static /* synthetic */ java.lang.Object lambda$recordNextCallTime$7(long r3, com.google.android.datatransport.runtime.TransportContext r5, android.database.sqlite.SQLiteDatabase r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "next_request_ms"
            r0.put(r4, r3)
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = r5.getBackendName()
            r1 = 0
            r3[r1] = r4
            com.google.android.datatransport.Priority r4 = r5.getPriority()
            int r4 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1 = 1
            r3[r1] = r4
            java.lang.String r4 = "transport_contexts"
            java.lang.String r2 = "backend_name = ? and priority = ?"
            int r3 = r6.update(r4, r0, r2, r3)
            r2 = 0
            if (r3 >= r1) goto L4f
            java.lang.String r3 = r5.getBackendName()
            java.lang.String r1 = "backend_name"
            r0.put(r1, r3)
            com.google.android.datatransport.Priority r3 = r5.getPriority()
            int r3 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "priority"
            r0.put(r5, r3)
            r6.insert(r4, r2, r0)
        L4f:
            return r2
    }

    private /* synthetic */ java.lang.Object lambda$resetClientMetrics$23(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            java.lang.String r0 = "DELETE FROM log_event_dropped"
            android.database.sqlite.SQLiteStatement r0 = r4.compileStatement(r0)
            r0.execute()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UPDATE global_log_event_state SET last_metrics_upload_ms="
            r0.append(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r3.wallClock
            long r1 = r1.getTime()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.database.sqlite.SQLiteStatement r4 = r4.compileStatement(r0)
            r4.execute()
            r4 = 0
            return r4
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadEvents(android.database.sqlite.SQLiteDatabase r24, com.google.android.datatransport.runtime.TransportContext r25, int r26) {
            r23 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r23.getTransportContextId(r24, r25)
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r2 = "_id"
            java.lang.String r3 = "transport_name"
            java.lang.String r4 = "timestamp_ms"
            java.lang.String r5 = "uptime_ms"
            java.lang.String r6 = "payload_encoding"
            java.lang.String r7 = "payload"
            java.lang.String r8 = "code"
            java.lang.String r9 = "inline"
            java.lang.String r10 = "product_id"
            java.lang.String r11 = "pseudonymous_id"
            java.lang.String r12 = "experiment_ids_clear_blob"
            java.lang.String r13 = "experiment_ids_encrypted_blob"
            java.lang.String[] r16 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r1 = r1.toString()
            r2[r3] = r1
            r19 = 0
            r20 = 0
            r21 = 0
            java.lang.String r22 = java.lang.String.valueOf(r26)
            java.lang.String r15 = "events"
            java.lang.String r17 = "context_id = ?"
            r14 = r24
            r18 = r2
            android.database.Cursor r1 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda12 r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda12
            r3 = r23
            r4 = r25
            r2.<init>(r3, r0, r4)
            tryWithCursor(r1, r2)
            return r0
    }

    private java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> loadMetadata(android.database.sqlite.SQLiteDatabase r13, java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r14) {
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "event_id IN ("
            r1.<init>(r2)
            r2 = 0
        Ld:
            int r3 = r14.size()
            if (r2 >= r3) goto L30
            java.lang.Object r3 = r14.get(r2)
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r3 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r3
            long r3 = r3.getId()
            r1.append(r3)
            int r3 = r14.size()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L2d
            r3 = 44
            r1.append(r3)
        L2d:
            int r2 = r2 + 1
            goto Ld
        L30:
            r14 = 41
            r1.append(r14)
            java.lang.String r14 = "event_id"
            java.lang.String r2 = "name"
            java.lang.String r3 = "value"
            java.lang.String[] r6 = new java.lang.String[]{r14, r2, r3}
            java.lang.String r7 = r1.toString()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r5 = "event_metadata"
            r4 = r13
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda15 r14 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda15
            r14.<init>(r0)
            tryWithCursor(r13, r14)
            return r0
    }

    private static byte[] maybeBase64Decode(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    private void populateLogSourcesMetrics(com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder r4, java.util.Map<java.lang.String, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped>> r5) {
            r3 = this;
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder r1 = com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.newBuilder()
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder r1 = r1.setLogSource(r2)
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder r0 = r1.setLogEventDroppedList(r0)
            com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r0 = r0.build()
            r4.addLogSourceMetrics(r0)
            goto L8
        L34:
            return
    }

    private byte[] readPayload(long r9) {
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getDb()
            java.lang.String r1 = "bytes"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10 = 0
            r4[r10] = r9
            java.lang.String r1 = "event_payloads"
            java.lang.String r3 = "event_id = ?"
            r5 = 0
            r6 = 0
            java.lang.String r7 = "sequence_num"
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda16 r10 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda16.INSTANCE
            java.lang.Object r9 = tryWithCursor(r9, r10)
            byte[] r9 = (byte[]) r9
            return r9
    }

    private <T> T retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer<T> r9, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<java.lang.Throwable, T> r10) {
            r8 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r8.monotonicClock
            long r0 = r0.getTime()
        L6:
            java.lang.Object r9 = r9.produce()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> Lb
            return r9
        Lb:
            r2 = move-exception
            com.google.android.datatransport.runtime.time.Clock r3 = r8.monotonicClock
            long r3 = r3.getTime()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r5 = r8.config
            int r5 = r5.getCriticalSectionEnterTimeoutMs()
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L23
            java.lang.Object r9 = r10.apply(r2)
            return r9
        L23:
            r2 = 50
            android.os.SystemClock.sleep(r2)
            goto L6
    }

    private static com.google.android.datatransport.Encoding toEncoding(java.lang.String r0) {
            if (r0 != 0) goto L5
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.PROTOBUF_ENCODING
            return r0
        L5:
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            return r0
    }

    private static java.lang.String toIdList(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r1 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r1
            long r1 = r1.getId()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Lb
            r1 = 44
            r0.append(r1)
            goto Lb
        L2a:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    static <T> T tryWithCursor(android.database.Cursor r0, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.Cursor, T> r1) {
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L8
            r0.close()
            return r1
        L8:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
            r4 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r4.wallClock
            long r0 = r0.getTime()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r2 = r4.config
            long r2 = r2.getEventCleanUpAge()
            long r0 = r0 - r2
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda6 r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda6
            r2.<init>(r4, r0)
            java.lang.Object r0 = r4.inTransaction(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public void clearDb() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda22 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda22.INSTANCE
            r1.inTransaction(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = r1.schemaManager
            r0.close()
            return
    }

    long getByteSize() {
            r4 = this;
            long r0 = r4.getPageCount()
            long r2 = r4.getPageSize()
            long r0 = r0 * r2
            return r0
    }

    android.database.sqlite.SQLiteDatabase getDb() {
            r2 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r0 = r2.schemaManager
            java.util.Objects.requireNonNull(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda27 r1 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda27
            r1.<init>(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda24 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda24.INSTANCE
            java.lang.Object r0 = r2.retryIfDbLocked(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(com.google.android.datatransport.runtime.TransportContext r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.getDb()
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = r5.getBackendName()
            r3 = 0
            r1[r3] = r2
            com.google.android.datatransport.Priority r5 = r5.getPriority()
            int r5 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"
            android.database.Cursor r5 = r0.rawQuery(r5, r1)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda18 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda18.INSTANCE
            java.lang.Object r5 = tryWithCursor(r5, r0)
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda9 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda9
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.inTransaction(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    <T> T inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.sqlite.SQLiteDatabase, T> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getDb()
            r0.beginTransaction()
            java.lang.Object r2 = r2.apply(r0)     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r2
        L12:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda23 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda23.INSTANCE
            java.lang.Object r0 = r1.inTransaction(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext r2) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda8 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda8
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.inTransaction(r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics loadClientMetrics() {
            r4 = this;
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder r0 = com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.newBuilder()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda11 r2 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda11
            java.lang.String r3 = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"
            r2.<init>(r4, r3, r1, r0)
            java.lang.Object r0 = r4.inTransaction(r2)
            com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r0 = (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext r6, com.google.android.datatransport.runtime.EventInternal r7) {
            r5 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.datatransport.Priority r1 = r6.getPriority()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r7.getTransportName()
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r6.getBackendName()
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "SQLiteEventStore"
            java.lang.String r2 = "Storing event with priority=%s, name=%s for destination %s"
            com.google.android.datatransport.runtime.logging.Logging.d(r1, r2, r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda7 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda7
            r0.<init>(r5, r7, r6)
            java.lang.Object r0 = r5.inTransaction(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L36
            r6 = 0
            return r6
        L36:
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r6 = com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(r0, r6, r7)
            return r6
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            r0.append(r1)
            java.lang.String r3 = toIdList(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda10 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda10
            java.lang.String r1 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"
            r0.<init>(r2, r3, r1)
            r2.inTransaction(r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(long r2, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason r4, java.lang.String r5) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda14 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda14
            r0.<init>(r5, r4, r2)
            r1.inTransaction(r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext r2, long r3) {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda2 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda2
            r0.<init>(r3, r2)
            r1.inTransaction(r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DELETE FROM events WHERE _id in "
            r0.append(r1)
            java.lang.String r3 = toIdList(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r2.getDb()
            android.database.sqlite.SQLiteStatement r3 = r0.compileStatement(r3)
            r3.execute()
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda5 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda5
            r0.<init>(r1)
            r1.inTransaction(r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.getDb()
            r1.ensureBeginTransaction(r0)
            java.lang.Object r2 = r2.execute()     // Catch: java.lang.Throwable -> L12
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()
            return r2
        L12:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }
}
