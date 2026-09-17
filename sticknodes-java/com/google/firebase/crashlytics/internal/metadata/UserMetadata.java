package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
public class UserMetadata {
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap customKeys;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap internalKeys;
    private final com.google.firebase.crashlytics.internal.metadata.MetaDataStore metaDataStore;
    private final com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList rolloutsState;
    private java.lang.String sessionIdentifier;
    private final java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> userId;

    private class SerializeableKeysMap {
        private final boolean isInternal;
        final java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> map;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> queuedSerializer;
        final /* synthetic */ com.google.firebase.crashlytics.internal.metadata.UserMetadata this$0;

        /* renamed from: $r8$lambda$Mhrt0R93vmnKyGBI1i-8txGjJ0M, reason: not valid java name */
        public static /* synthetic */ void m55$r8$lambda$Mhrt0R93vmnKyGBI1i8txGjJ0M(com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap r0) {
                r0.lambda$scheduleSerializationTaskIfNeeded$0()
                return
        }

        public SerializeableKeysMap(com.google.firebase.crashlytics.internal.metadata.UserMetadata r2, boolean r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r0 = 0
                r2.<init>(r0)
                r1.queuedSerializer = r2
                r1.isInternal = r3
                com.google.firebase.crashlytics.internal.metadata.KeysMap r2 = new com.google.firebase.crashlytics.internal.metadata.KeysMap
                if (r3 == 0) goto L16
                r3 = 8192(0x2000, float:1.14794E-41)
                goto L18
            L16:
                r3 = 1024(0x400, float:1.435E-42)
            L18:
                r0 = 64
                r2.<init>(r0, r3)
                java.util.concurrent.atomic.AtomicMarkableReference r3 = new java.util.concurrent.atomic.AtomicMarkableReference
                r0 = 0
                r3.<init>(r2, r0)
                r1.map = r3
                return
        }

        private /* synthetic */ void lambda$scheduleSerializationTaskIfNeeded$0() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r2.queuedSerializer
                r1 = 0
                r0.set(r1)
                r2.serializeIfMarked()
                return
        }

        private void scheduleSerializationTaskIfNeeded() {
                r3 = this;
                com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0 r0 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                r0.<init>(r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r1 = r3.queuedSerializer
                r2 = 0
                boolean r1 = r1.compareAndSet(r2, r0)
                if (r1 == 0) goto L19
                com.google.firebase.crashlytics.internal.metadata.UserMetadata r1 = r3.this$0
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r1 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.access$000(r1)
                com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r1 = r1.diskWrite
                r1.submit(r0)
            L19:
                return
        }

        private void serializeIfMarked() {
                r4 = this;
                monitor-enter(r4)
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r0 = r4.map     // Catch: java.lang.Throwable -> L38
                boolean r0 = r0.isMarked()     // Catch: java.lang.Throwable -> L38
                if (r0 == 0) goto L22
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r0 = r4.map     // Catch: java.lang.Throwable -> L38
                java.lang.Object r0 = r0.getReference()     // Catch: java.lang.Throwable -> L38
                com.google.firebase.crashlytics.internal.metadata.KeysMap r0 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r0     // Catch: java.lang.Throwable -> L38
                java.util.Map r0 = r0.getKeys()     // Catch: java.lang.Throwable -> L38
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r1 = r4.map     // Catch: java.lang.Throwable -> L38
                java.lang.Object r2 = r1.getReference()     // Catch: java.lang.Throwable -> L38
                com.google.firebase.crashlytics.internal.metadata.KeysMap r2 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r2     // Catch: java.lang.Throwable -> L38
                r3 = 0
                r1.set(r2, r3)     // Catch: java.lang.Throwable -> L38
                goto L23
            L22:
                r0 = 0
            L23:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                if (r0 == 0) goto L37
                com.google.firebase.crashlytics.internal.metadata.UserMetadata r1 = r4.this$0
                com.google.firebase.crashlytics.internal.metadata.MetaDataStore r1 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.access$200(r1)
                com.google.firebase.crashlytics.internal.metadata.UserMetadata r2 = r4.this$0
                java.lang.String r2 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.access$100(r2)
                boolean r3 = r4.isInternal
                r1.writeKeyData(r2, r0, r3)
            L37:
                return
            L38:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                throw r0
        }

        public java.util.Map<java.lang.String, java.lang.String> getKeys() {
                r1 = this;
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r0 = r1.map
                java.lang.Object r0 = r0.getReference()
                com.google.firebase.crashlytics.internal.metadata.KeysMap r0 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r0
                java.util.Map r0 = r0.getKeys()
                return r0
        }

        public boolean setKey(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r0 = r1.map     // Catch: java.lang.Throwable -> L23
                java.lang.Object r0 = r0.getReference()     // Catch: java.lang.Throwable -> L23
                com.google.firebase.crashlytics.internal.metadata.KeysMap r0 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r0     // Catch: java.lang.Throwable -> L23
                boolean r2 = r0.setKey(r2, r3)     // Catch: java.lang.Throwable -> L23
                if (r2 != 0) goto L12
                r2 = 0
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
                return r2
            L12:
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r2 = r1.map     // Catch: java.lang.Throwable -> L23
                java.lang.Object r3 = r2.getReference()     // Catch: java.lang.Throwable -> L23
                com.google.firebase.crashlytics.internal.metadata.KeysMap r3 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r3     // Catch: java.lang.Throwable -> L23
                r0 = 1
                r2.set(r3, r0)     // Catch: java.lang.Throwable -> L23
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
                r1.scheduleSerializationTaskIfNeeded()
                return r0
            L23:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
                throw r2
        }
    }

    public static /* synthetic */ void $r8$lambda$A954FMNvk_zg7SYNezRMjMylVWQ(com.google.firebase.crashlytics.internal.metadata.UserMetadata r0, java.lang.String r1, java.util.Map r2, java.util.List r3) {
            r0.lambda$setNewSession$0(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$zQfHk8FIW8Yz9bLnZuvvkpuUU1g(com.google.firebase.crashlytics.internal.metadata.UserMetadata r0) {
            r0.serializeUserDataIfNeeded()
            return
    }

    public UserMetadata(java.lang.String r4, com.google.firebase.crashlytics.internal.persistence.FileStore r5, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r6) {
            r3 = this;
            r3.<init>()
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap
            r1 = 0
            r0.<init>(r3, r1)
            r3.customKeys = r0
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap
            r2 = 1
            r0.<init>(r3, r2)
            r3.internalKeys = r0
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList r0 = new com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList
            r2 = 128(0x80, float:1.794E-43)
            r0.<init>(r2)
            r3.rolloutsState = r0
            java.util.concurrent.atomic.AtomicMarkableReference r0 = new java.util.concurrent.atomic.AtomicMarkableReference
            r2 = 0
            r0.<init>(r2, r1)
            r3.userId = r0
            r3.sessionIdentifier = r4
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r4 = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore
            r4.<init>(r5)
            r3.metaDataStore = r4
            r3.crashlyticsWorkers = r6
            return
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers access$000(com.google.firebase.crashlytics.internal.metadata.UserMetadata r0) {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r0 = r0.crashlyticsWorkers
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.firebase.crashlytics.internal.metadata.UserMetadata r0) {
            java.lang.String r0 = r0.sessionIdentifier
            return r0
    }

    static /* synthetic */ com.google.firebase.crashlytics.internal.metadata.MetaDataStore access$200(com.google.firebase.crashlytics.internal.metadata.UserMetadata r0) {
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = r0.metaDataStore
            return r0
    }

    private /* synthetic */ void lambda$setNewSession$0(java.lang.String r3, java.util.Map r4, java.util.List r5) {
            r2 = this;
            java.lang.String r0 = r2.getUserId()
            if (r0 == 0) goto Lf
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = r2.metaDataStore
            java.lang.String r1 = r2.getUserId()
            r0.writeUserData(r3, r1)
        Lf:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1a
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = r2.metaDataStore
            r0.writeKeyData(r3, r4)
        L1a:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L25
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r4 = r2.metaDataStore
            r4.writeRolloutState(r3, r5)
        L25:
            return
    }

    public static com.google.firebase.crashlytics.internal.metadata.UserMetadata loadFromExistingSession(java.lang.String r3, com.google.firebase.crashlytics.internal.persistence.FileStore r4, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r5) {
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore
            r0.<init>(r4)
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r1 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata
            r1.<init>(r3, r4, r5)
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r4 = r1.customKeys
            java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r4 = r4.map
            java.lang.Object r4 = r4.getReference()
            com.google.firebase.crashlytics.internal.metadata.KeysMap r4 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r4
            r5 = 0
            java.util.Map r2 = r0.readKeyData(r3, r5)
            r4.setKeys(r2)
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r4 = r1.internalKeys
            java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> r4 = r4.map
            java.lang.Object r4 = r4.getReference()
            com.google.firebase.crashlytics.internal.metadata.KeysMap r4 = (com.google.firebase.crashlytics.internal.metadata.KeysMap) r4
            r2 = 1
            java.util.Map r2 = r0.readKeyData(r3, r2)
            r4.setKeys(r2)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r4 = r1.userId
            java.lang.String r2 = r0.readUserId(r3)
            r4.set(r2, r5)
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList r4 = r1.rolloutsState
            java.util.List r3 = r0.readRolloutsState(r3)
            r4.updateRolloutAssignmentList(r3)
            return r1
    }

    public static java.lang.String readUserId(java.lang.String r1, com.google.firebase.crashlytics.internal.persistence.FileStore r2) {
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore
            r0.<init>(r2)
            java.lang.String r1 = r0.readUserId(r1)
            return r1
    }

    private void serializeUserDataIfNeeded() {
            r5 = this;
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r0 = r5.userId
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r1 = r5.userId     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isMarked()     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.String r1 = r5.getUserId()     // Catch: java.lang.Throwable -> L24
            r3 = 1
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r4 = r5.userId     // Catch: java.lang.Throwable -> L24
            r4.set(r1, r2)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L23
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore r0 = r5.metaDataStore
            java.lang.String r2 = r5.sessionIdentifier
            r0.writeUserData(r2, r1)
        L23:
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomKeys() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = r1.customKeys
            java.util.Map r0 = r0.getKeys()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getInternalKeys() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = r1.internalKeys
            java.util.Map r0 = r0.getKeys()
            return r0
    }

    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList r0 = r1.rolloutsState
            java.util.List r0 = r0.getReportRolloutsState()
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r0 = r1.userId
            java.lang.Object r0 = r0.getReference()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public boolean setCustomKey(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = r1.customKeys
            boolean r2 = r0.setKey(r2, r3)
            return r2
    }

    public boolean setInternalKey(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r0 = r1.internalKeys
            boolean r2 = r0.setKey(r2, r3)
            return r2
    }

    public void setNewSession(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = r5.sessionIdentifier
            monitor-enter(r0)
            r5.sessionIdentifier = r6     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap r1 = r5.customKeys     // Catch: java.lang.Throwable -> L1f
            java.util.Map r1 = r1.getKeys()     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList r2 = r5.rolloutsState     // Catch: java.lang.Throwable -> L1f
            java.util.List r2 = r2.getRolloutAssignmentList()     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r3 = r5.crashlyticsWorkers     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r3 = r3.diskWrite     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1 r4 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L1f
            r3.submit(r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r6
    }

    public void setUserId(java.lang.String r4) {
            r3 = this;
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String r4 = com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(r4, r0)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r0 = r3.userId
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r1 = r3.userId     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.getReference()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2d
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(r4, r1)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L19:
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r1 = r3.userId     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r1.set(r4, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r4 = r3.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r4 = r4.diskWrite
            com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0 r0 = new com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r4.submit(r0)
            return
        L2d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }
}
