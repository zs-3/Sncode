package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
class MetaDataStore {
    private static final java.nio.charset.Charset UTF_8 = null;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;


    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore.UTF_8 = r0
            return
    }

    public MetaDataStore(com.google.firebase.crashlytics.internal.persistence.FileStore r1) {
            r0 = this;
            r0.<init>()
            r0.fileStore = r1
            return
    }

    private static java.util.Map<java.lang.String, java.lang.String> jsonToKeysData(java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r1 = r0.keys()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = valueOrNull(r0, r2)
            r4.put(r2, r3)
            goto Le
        L22:
            return r4
    }

    private static java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> jsonToRolloutsState(java.lang.String r7) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r7)
            java.lang.String r7 = "rolloutsState"
            org.json.JSONArray r7 = r0.getJSONArray(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L11:
            int r2 = r7.length()
            if (r1 >= r2) goto L3f
            java.lang.String r2 = r7.getString(r1)
            com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r3 = com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(r2)     // Catch: java.lang.Exception -> L23
            r0.add(r3)     // Catch: java.lang.Exception -> L23
            goto L3c
        L23:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed de-serializing rollouts state. "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.w(r2, r3)
        L3c:
            int r1 = r1 + 1
            goto L11
        L3f:
            return r0
    }

    private java.lang.String jsonToUserId(java.lang.String r2) throws org.json.JSONException {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            java.lang.String r2 = "userId"
            java.lang.String r2 = valueOrNull(r0, r2)
            return r2
    }

    private static java.lang.String keysDataToJson(java.util.Map<java.lang.String, java.lang.String> r1) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String rolloutsStateToJson(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
        Lb:
            int r3 = r6.size()
            if (r2 >= r3) goto L31
            com.google.firebase.encoders.DataEncoder r3 = com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER
            java.lang.Object r4 = r6.get(r2)
            java.lang.String r3 = r3.encode(r4)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r4.<init>(r3)     // Catch: org.json.JSONException -> L24
            r1.put(r4)     // Catch: org.json.JSONException -> L24
            goto L2e
        L24:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r5 = "Exception parsing rollout assignment!"
            r4.w(r5, r3)
        L2e:
            int r2 = r2 + 1
            goto Lb
        L31:
            java.lang.String r6 = "rolloutsState"
            r0.put(r6, r1)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private static void safeDeleteCorruptFile(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L28
            boolean r0 = r3.delete()
            if (r0 == 0) goto L28
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Deleted corrupt file: "
            r1.append(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.i(r3)
        L28:
            return
    }

    private static java.lang.String userIdToJson(java.lang.String r1) throws org.json.JSONException {
            com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1 r0 = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String valueOrNull(org.json.JSONObject r2, java.lang.String r3) {
            boolean r0 = r2.isNull(r3)
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r1 = r2.optString(r3, r1)
        Lb:
            return r1
    }

    public java.io.File getInternalKeysFileForSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "internal-keys"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            return r3
    }

    public java.io.File getKeysFileForSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "keys"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            return r3
    }

    public java.io.File getRolloutsStateForSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "rollouts-state"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            return r3
    }

    public java.io.File getUserDataFileForSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "user-data"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            return r3
    }

    java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            if (r8 == 0) goto L9
            java.io.File r7 = r6.getInternalKeysFileForSession(r7)
            goto Ld
        L9:
            java.io.File r7 = r6.getKeysFileForSession(r7)
        Ld:
            boolean r8 = r7.exists()
            if (r8 == 0) goto L52
            long r1 = r7.length()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L1e
            goto L52
        L1e:
            r8 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.lang.String r8 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r1)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4c
            java.util.Map r7 = jsonToKeysData(r8)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4c
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            return r7
        L30:
            r8 = move-exception
            goto L38
        L32:
            r7 = move-exception
            goto L4e
        L34:
            r1 = move-exception
            r5 = r1
            r1 = r8
            r8 = r5
        L38:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "Error deserializing user metadata."
            r2.w(r3, r8)     // Catch: java.lang.Throwable -> L4c
            safeDeleteCorruptFile(r7)     // Catch: java.lang.Throwable -> L4c
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
        L4c:
            r7 = move-exception
            r8 = r1
        L4e:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r8, r0)
            throw r7
        L52:
            safeDeleteCorruptFile(r7)
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
    }

    public java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> readRolloutsState(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "Failed to close rollouts state file."
            java.io.File r1 = r7.getRolloutsStateForSession(r8)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L6a
            long r2 = r1.length()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            goto L6a
        L17:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.util.List r2 = jsonToRolloutsState(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r5.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r6 = "Loaded rollouts state:\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r5.append(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r6 = "\nfor session "
            r5.append(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r5.append(r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r4.d(r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r3, r0)
            return r2
        L49:
            r8 = move-exception
            r2 = r3
            goto L66
        L4c:
            r8 = move-exception
            r2 = r3
            goto L52
        L4f:
            r8 = move-exception
            goto L66
        L51:
            r8 = move-exception
        L52:
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "Error deserializing rollouts state."
            r3.w(r4, r8)     // Catch: java.lang.Throwable -> L4f
            safeDeleteCorruptFile(r1)     // Catch: java.lang.Throwable -> L4f
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            java.util.List r8 = java.util.Collections.emptyList()
            return r8
        L66:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            throw r8
        L6a:
            safeDeleteCorruptFile(r1)
            java.util.List r8 = java.util.Collections.emptyList()
            return r8
    }

    public java.lang.String readUserId(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            java.io.File r1 = r8.getUserDataFileForSession(r9)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 == 0) goto L65
            long r4 = r1.length()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L18
            goto L65
        L18:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r2)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            java.lang.String r4 = r8.jsonToUserId(r4)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            java.lang.String r7 = "Loaded userId "
            r6.append(r7)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            r6.append(r4)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            java.lang.String r7 = " for session "
            r6.append(r7)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            r6.append(r9)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            r5.d(r9)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L5f
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            return r4
        L49:
            r9 = move-exception
            goto L4f
        L4b:
            r9 = move-exception
            goto L61
        L4d:
            r9 = move-exception
            r2 = r3
        L4f:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "Error deserializing user metadata."
            r4.w(r5, r9)     // Catch: java.lang.Throwable -> L5f
            safeDeleteCorruptFile(r1)     // Catch: java.lang.Throwable -> L5f
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            return r3
        L5f:
            r9 = move-exception
            r3 = r2
        L61:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r3, r0)
            throw r9
        L65:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "No userId set for session "
            r2.append(r4)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.d(r9)
            safeDeleteCorruptFile(r1)
            return r3
    }

    public void writeKeyData(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            r0 = 0
            r1.writeKeyData(r2, r3, r0)
            return
    }

    public void writeKeyData(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "Failed to close key/value metadata file."
            if (r8 == 0) goto L9
            java.io.File r6 = r5.getInternalKeysFileForSession(r6)
            goto Ld
        L9:
            java.io.File r6 = r5.getKeysFileForSession(r6)
        Ld:
            r8 = 0
            java.lang.String r7 = keysDataToJson(r7)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.nio.charset.Charset r4 = com.google.firebase.crashlytics.internal.metadata.MetaDataStore.UTF_8     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r1.write(r7)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            r1.flush()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            goto L45
        L2d:
            r6 = move-exception
            r8 = r1
            goto L46
        L30:
            r7 = move-exception
            r8 = r1
            goto L36
        L33:
            r6 = move-exception
            goto L46
        L35:
            r7 = move-exception
        L36:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Error serializing key/value metadata."
            r1.w(r2, r7)     // Catch: java.lang.Throwable -> L33
            safeDeleteCorruptFile(r6)     // Catch: java.lang.Throwable -> L33
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r8, r0)
        L45:
            return
        L46:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r8, r0)
            throw r6
    }

    public void writeRolloutState(java.lang.String r7, java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r8) {
            r6 = this;
            java.lang.String r0 = "Failed to close rollouts state file."
            java.io.File r7 = r6.getRolloutsStateForSession(r7)
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L10
            safeDeleteCorruptFile(r7)
            return
        L10:
            r1 = 0
            java.lang.String r8 = rolloutsStateToJson(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.nio.charset.Charset r5 = com.google.firebase.crashlytics.internal.metadata.MetaDataStore.UTF_8     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r2.write(r8)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r2.flush()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            goto L48
        L30:
            r7 = move-exception
            r1 = r2
            goto L49
        L33:
            r8 = move-exception
            r1 = r2
            goto L39
        L36:
            r7 = move-exception
            goto L49
        L38:
            r8 = move-exception
        L39:
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "Error serializing rollouts state."
            r2.w(r3, r8)     // Catch: java.lang.Throwable -> L36
            safeDeleteCorruptFile(r7)     // Catch: java.lang.Throwable -> L36
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
        L48:
            return
        L49:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            throw r7
    }

    public void writeUserData(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            java.io.File r6 = r5.getUserDataFileForSession(r6)
            r1 = 0
            java.lang.String r7 = userIdToJson(r7)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.nio.charset.Charset r6 = com.google.firebase.crashlytics.internal.metadata.MetaDataStore.UTF_8     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.write(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r2.flush()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r2, r0)
            goto L3b
        L26:
            r6 = move-exception
            r1 = r2
            goto L3c
        L29:
            r6 = move-exception
            r1 = r2
            goto L2f
        L2c:
            r6 = move-exception
            goto L3c
        L2e:
            r6 = move-exception
        L2f:
            com.google.firebase.crashlytics.internal.Logger r7 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Error serializing user metadata."
            r7.w(r2, r6)     // Catch: java.lang.Throwable -> L2c
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
        L3b:
            return
        L3c:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            throw r6
    }
}
