package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class JsonReader implements com.badlogic.gdx.utils.BaseJsonReader {
    private static final byte[] _json_actions = null;
    private static final byte[] _json_eof_actions = null;
    private static final short[] _json_index_offsets = null;
    private static final byte[] _json_indicies = null;
    private static final short[] _json_key_offsets = null;
    private static final byte[] _json_range_lengths = null;
    private static final byte[] _json_single_lengths = null;
    private static final byte[] _json_trans_actions = null;
    private static final char[] _json_trans_keys = null;
    private static final byte[] _json_trans_targs = null;
    private com.badlogic.gdx.utils.JsonValue current;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> elements;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> lastChild;
    private com.badlogic.gdx.utils.JsonValue root;
    private boolean stop;

    static {
            byte[] r0 = init__json_actions_0()
            com.badlogic.gdx.utils.JsonReader._json_actions = r0
            short[] r0 = init__json_key_offsets_0()
            com.badlogic.gdx.utils.JsonReader._json_key_offsets = r0
            char[] r0 = init__json_trans_keys_0()
            com.badlogic.gdx.utils.JsonReader._json_trans_keys = r0
            byte[] r0 = init__json_single_lengths_0()
            com.badlogic.gdx.utils.JsonReader._json_single_lengths = r0
            byte[] r0 = init__json_range_lengths_0()
            com.badlogic.gdx.utils.JsonReader._json_range_lengths = r0
            short[] r0 = init__json_index_offsets_0()
            com.badlogic.gdx.utils.JsonReader._json_index_offsets = r0
            byte[] r0 = init__json_indicies_0()
            com.badlogic.gdx.utils.JsonReader._json_indicies = r0
            byte[] r0 = init__json_trans_targs_0()
            com.badlogic.gdx.utils.JsonReader._json_trans_targs = r0
            byte[] r0 = init__json_trans_actions_0()
            com.badlogic.gdx.utils.JsonReader._json_trans_actions = r0
            byte[] r0 = init__json_eof_actions_0()
            com.badlogic.gdx.utils.JsonReader._json_eof_actions = r0
            return
    }

    public JsonReader() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 8
            r0.<init>(r1)
            r2.elements = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>(r1)
            r2.lastChild = r0
            return
    }

    private void addChild(java.lang.String r2, com.badlogic.gdx.utils.JsonValue r3) {
            r1 = this;
            r3.setName(r2)
            com.badlogic.gdx.utils.JsonValue r2 = r1.current
            if (r2 != 0) goto Lc
            r1.current = r3
            r1.root = r3
            goto L44
        Lc:
            boolean r2 = r2.isArray()
            if (r2 != 0) goto L20
            com.badlogic.gdx.utils.JsonValue r2 = r1.current
            boolean r2 = r2.isObject()
            if (r2 == 0) goto L1b
            goto L20
        L1b:
            com.badlogic.gdx.utils.JsonValue r2 = r1.current
            r1.root = r2
            goto L44
        L20:
            com.badlogic.gdx.utils.JsonValue r2 = r1.current
            r3.parent = r2
            int r0 = r2.size
            if (r0 != 0) goto L2b
            r2.child = r3
            goto L37
        L2b:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r2 = r1.lastChild
            java.lang.Object r2 = r2.pop()
            com.badlogic.gdx.utils.JsonValue r2 = (com.badlogic.gdx.utils.JsonValue) r2
            r2.next = r3
            r3.prev = r2
        L37:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r2 = r1.lastChild
            r2.add(r3)
            com.badlogic.gdx.utils.JsonValue r2 = r1.current
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
        L44:
            return
    }

    private static byte[] init__json_actions_0() {
            r0 = 29
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5} // fill-array
            return r0
    }

    private static byte[] init__json_eof_actions_0() {
            r0 = 39
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0} // fill-array
            return r0
    }

    private static short[] init__json_index_offsets_0() {
            r0 = 39
            short[] r0 = new short[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207} // fill-array
            return r0
    }

    private static byte[] init__json_indicies_0() {
            r0 = 209(0xd1, float:2.93E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, 13, 14, 3, 15, 11, 10, 16, 16, 17, 18, 16, 3, 19, 19, 20, 21, 19, 3, 22, 22, 3, 21, 21, 24, 3, 25, 3, 26, 3, 27, 21, 23, 28, 29, 29, 28, 30, 31, 32, 3, 33, 34, 34, 33, 13, 35, 15, 3, 34, 34, 12, 36, 37, 3, 15, 34, 10, 16, 3, 36, 36, 12, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, 13, 13, 12, 3, 41, 3, 15, 13, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, 45, 45, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, 61, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0} // fill-array
            return r0
    }

    private static short[] init__json_key_offsets_0() {
            r0 = 39
            short[] r0 = new short[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184} // fill-array
            return r0
    }

    private static byte[] init__json_range_lengths_0() {
            r0 = 39
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0} // fill-array
            return r0
    }

    private static byte[] init__json_single_lengths_0() {
            r0 = 39
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0} // fill-array
            return r0
    }

    private static byte[] init__json_trans_actions_0() {
            r0 = 74
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [13, 0, 15, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, 13, 15, 0, 7, 3, 1, 1, 1, 1, 23, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, 13, 0, 15, 0, 0, 7, 9, 3, 1, 1, 1, 1, 26, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0} // fill-array
            return r0
    }

    private static char[] init__json_trans_keys_0() {
            r0 = 185(0xb9, float:2.59E-43)
            char[] r0 = new char[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 34, 42, 47, 13, 32, 34, 44, 47, 58, 125, 9, 10, 13, 32, 47, 58, 9, 10, 13, 32, 47, 58, 9, 10, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 9, 10, 13, 32, 44, 47, 125, 9, 10, 13, 32, 44, 47, 125, 13, 32, 34, 44, 47, 58, 125, 9, 10, 34, 13, 32, 34, 44, 47, 58, 125, 9, 10, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 125, 9, 10, 42, 47, 42, 47, 34, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 9, 10, 13, 32, 44, 47, 93, 9, 10, 13, 32, 44, 47, 93, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 34, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 42, 47, 42, 47, 13, 32, 47, 9, 10, 13, 32, 47, 9, 10, 0} // fill-array
            return r0
    }

    private static byte[] init__json_trans_targs_0() {
            r0 = 74
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, 13, 17, 22, 37, 7, 8, 9, 7, 8, 9, 7, 10, 20, 21, 11, 11, 11, 12, 17, 19, 37, 11, 12, 19, 14, 16, 15, 14, 12, 18, 17, 11, 9, 5, 24, 23, 27, 31, 34, 25, 38, 25, 25, 26, 31, 33, 38, 25, 26, 33, 28, 30, 29, 28, 26, 32, 31, 25, 23, 2, 36, 2} // fill-array
            return r0
    }

    private java.lang.String unescape(java.lang.String r7) {
            r6 = this;
            int r0 = r7.length()
            com.badlogic.gdx.utils.StringBuilder r1 = new com.badlogic.gdx.utils.StringBuilder
            int r2 = r0 + 16
            r1.<init>(r2)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L85
            int r3 = r2 + 1
            char r2 = r7.charAt(r2)
            r4 = 92
            if (r2 == r4) goto L1d
            r1.append(r2)
        L1b:
            r2 = r3
            goto Lc
        L1d:
            if (r3 != r0) goto L20
            goto L85
        L20:
            int r2 = r3 + 1
            char r3 = r7.charAt(r3)
            r5 = 117(0x75, float:1.64E-43)
            if (r3 != r5) goto L3e
            int r3 = r2 + 4
            java.lang.String r2 = r7.substring(r2, r3)
            r4 = 16
            int r2 = java.lang.Integer.parseInt(r2, r4)
            char[] r2 = java.lang.Character.toChars(r2)
            r1.append(r2)
            goto L1b
        L3e:
            r5 = 34
            if (r3 == r5) goto L81
            r5 = 47
            if (r3 == r5) goto L81
            if (r3 == r4) goto L81
            r4 = 98
            if (r3 == r4) goto L7f
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L7c
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L79
            r4 = 114(0x72, float:1.6E-43)
            if (r3 == r4) goto L76
            r4 = 116(0x74, float:1.63E-43)
            if (r3 != r4) goto L5f
            r3 = 9
            goto L81
        L5f:
            com.badlogic.gdx.utils.SerializationException r7 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal escaped character: \\"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L76:
            r3 = 13
            goto L81
        L79:
            r3 = 10
            goto L81
        L7c:
            r3 = 12
            goto L81
        L7f:
            r3 = 8
        L81:
            r1.append(r3)
            goto Lc
        L85:
            java.lang.String r7 = r1.toString()
            return r7
    }

    protected void bool(java.lang.String r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            r0.<init>(r3)
            r1.addChild(r2, r0)
            return
    }

    protected void number(java.lang.String r2, double r3, java.lang.String r5) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            r0.<init>(r3, r5)
            r1.addChild(r2, r0)
            return
    }

    protected void number(java.lang.String r2, long r3, java.lang.String r5) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            r0.<init>(r3, r5)
            r1.addChild(r2, r0)
            return
    }

    @Override // com.badlogic.gdx.utils.BaseJsonReader
    public com.badlogic.gdx.utils.JsonValue parse(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            java.lang.String r0 = "UTF-8"
            java.io.Reader r0 = r5.reader(r0)     // Catch: java.lang.Exception -> L23
            com.badlogic.gdx.utils.JsonValue r5 = r4.parse(r0)     // Catch: java.lang.Exception -> Lb
            return r5
        Lb:
            r0 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parsing file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L23:
            r0 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error reading file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public com.badlogic.gdx.utils.JsonValue parse(java.io.Reader r6) {
            r5 = this;
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            int r3 = r3 - r2
            int r3 = r6.read(r0, r2, r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r4 = -1
            if (r3 != r4) goto L17
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r6)
            com.badlogic.gdx.utils.JsonValue r6 = r5.parse(r0, r1, r2)
            return r6
        L17:
            if (r3 != 0) goto L24
            int r3 = r0.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            int r3 = r3 * 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            int r4 = r0.length     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.lang.System.arraycopy(r0, r1, r3, r1, r4)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r0 = r3
            goto L6
        L24:
            int r2 = r2 + r3
            goto L6
        L26:
            r0 = move-exception
            goto L31
        L28:
            r0 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Error reading input."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L31:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r6)
            throw r0
    }

    public com.badlogic.gdx.utils.JsonValue parse(char[] r29, int r30, int r31) {
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = 0
            r1.stop = r4
            r0 = 4
            int[] r5 = new int[r0]
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r7 = 8
            r6.<init>(r7)
            r10 = r5
            r7 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5 = r30
        L1e:
            java.lang.String r4 = "null"
            java.lang.String r0 = "false"
            java.lang.String r8 = "true"
            if (r11 == 0) goto L39
            r9 = 1
            if (r11 == r9) goto L37
            r9 = 2
            if (r11 == r9) goto L31
            r9 = 4
            if (r11 == r9) goto L379
            goto L470
        L31:
            r21 = r7
            r23 = r10
            goto L361
        L37:
            r9 = 4
            goto L44
        L39:
            r9 = 4
            if (r5 != r3) goto L40
            r0 = 4
            r4 = 0
            r11 = 4
            goto L1e
        L40:
            if (r12 != 0) goto L44
            goto L367
        L44:
            short[] r11 = com.badlogic.gdx.utils.JsonReader._json_key_offsets     // Catch: java.lang.RuntimeException -> L472
            short r11 = r11[r12]     // Catch: java.lang.RuntimeException -> L472
            short[] r18 = com.badlogic.gdx.utils.JsonReader._json_index_offsets     // Catch: java.lang.RuntimeException -> L472
            short r18 = r18[r12]     // Catch: java.lang.RuntimeException -> L472
            byte[] r20 = com.badlogic.gdx.utils.JsonReader._json_single_lengths     // Catch: java.lang.RuntimeException -> L472
            r20 = r20[r12]     // Catch: java.lang.RuntimeException -> L472
            if (r20 <= 0) goto L8b
            int r21 = r11 + r20
            int r22 = r21 + (-1)
            r9 = r22
            r22 = r13
            r13 = r11
        L5b:
            if (r9 >= r13) goto L62
            int r18 = r18 + r20
            r11 = r21
            goto L8d
        L62:
            int r23 = r9 - r13
            r19 = 1
            int r23 = r23 >> 1
            int r23 = r13 + r23
            r24 = r9
            char r9 = r2[r5]     // Catch: java.lang.RuntimeException -> L472
            char[] r25 = com.badlogic.gdx.utils.JsonReader._json_trans_keys     // Catch: java.lang.RuntimeException -> L472
            r26 = r13
            char r13 = r25[r23]     // Catch: java.lang.RuntimeException -> L472
            if (r9 >= r13) goto L7b
            int r9 = r23 + (-1)
            r13 = r26
            goto L5b
        L7b:
            char r9 = r2[r5]     // Catch: java.lang.RuntimeException -> L472
            char r13 = r25[r23]     // Catch: java.lang.RuntimeException -> L472
            if (r9 <= r13) goto L86
            int r13 = r23 + 1
            r9 = r24
            goto L5b
        L86:
            int r23 = r23 - r11
            int r18 = r18 + r23
            goto Lcf
        L8b:
            r22 = r13
        L8d:
            byte[] r9 = com.badlogic.gdx.utils.JsonReader._json_range_lengths     // Catch: java.lang.RuntimeException -> L472
            r9 = r9[r12]     // Catch: java.lang.RuntimeException -> L472
            if (r9 <= 0) goto Lcf
            int r12 = r9 << 1
            int r12 = r12 + r11
            r13 = 2
            int r12 = r12 - r13
            r13 = r11
        L99:
            if (r12 >= r13) goto L9e
            int r18 = r18 + r9
            goto Lcf
        L9e:
            int r20 = r12 - r13
            r19 = 1
            int r20 = r20 >> 1
            r20 = r20 & (-2)
            int r20 = r13 + r20
            r21 = r9
            char r9 = r2[r5]     // Catch: java.lang.RuntimeException -> L472
            char[] r23 = com.badlogic.gdx.utils.JsonReader._json_trans_keys     // Catch: java.lang.RuntimeException -> L472
            r24 = r12
            char r12 = r23[r20]     // Catch: java.lang.RuntimeException -> L472
            if (r9 >= r12) goto Lb9
            int r12 = r20 + (-2)
            r9 = r21
            goto L99
        Lb9:
            char r9 = r2[r5]     // Catch: java.lang.RuntimeException -> L472
            int r12 = r20 + 1
            char r12 = r23[r12]     // Catch: java.lang.RuntimeException -> L472
            if (r9 <= r12) goto Lc8
            int r13 = r20 + 2
            r9 = r21
            r12 = r24
            goto L99
        Lc8:
            int r20 = r20 - r11
            r9 = 1
            int r11 = r20 >> 1
            int r18 = r18 + r11
        Lcf:
            byte[] r9 = com.badlogic.gdx.utils.JsonReader._json_indicies     // Catch: java.lang.RuntimeException -> L472
            r9 = r9[r18]     // Catch: java.lang.RuntimeException -> L472
            byte[] r11 = com.badlogic.gdx.utils.JsonReader._json_trans_targs     // Catch: java.lang.RuntimeException -> L472
            r11 = r11[r9]     // Catch: java.lang.RuntimeException -> L472
            byte[] r12 = com.badlogic.gdx.utils.JsonReader._json_trans_actions     // Catch: java.lang.RuntimeException -> L472
            r13 = r12[r9]     // Catch: java.lang.RuntimeException -> L472
            if (r13 == 0) goto L359
            r9 = r12[r9]     // Catch: java.lang.RuntimeException -> L472
            byte[] r12 = com.badlogic.gdx.utils.JsonReader._json_actions     // Catch: java.lang.RuntimeException -> L472
            int r13 = r9 + 1
            r9 = r12[r9]     // Catch: java.lang.RuntimeException -> L472
            r12 = r13
            r13 = r22
        Le8:
            int r18 = r9 + (-1)
            if (r9 <= 0) goto L350
            byte[] r9 = com.badlogic.gdx.utils.JsonReader._json_actions     // Catch: java.lang.RuntimeException -> L34b
            int r20 = r12 + 1
            r9 = r9[r12]     // Catch: java.lang.RuntimeException -> L34b
            switch(r9) {
                case 0: goto L338;
                case 1: goto L276;
                case 2: goto L249;
                case 3: goto L235;
                case 4: goto L20d;
                case 5: goto L200;
                case 6: goto L1be;
                case 7: goto L120;
                case 8: goto Lfe;
                default: goto Lf5;
            }
        Lf5:
            r22 = r5
        Lf7:
            r21 = r7
            r23 = r10
            r7 = r11
            goto L340
        Lfe:
            int r5 = r5 + 1
            r9 = r5
            r12 = 0
        L102:
            char r13 = r2[r9]     // Catch: java.lang.RuntimeException -> L1fb
            r14 = 34
            if (r13 == r14) goto L114
            r14 = 92
            if (r13 == r14) goto L10d
            goto L110
        L10d:
            int r9 = r9 + 1
            r12 = 1
        L110:
            r13 = 1
            int r9 = r9 + r13
            if (r9 != r3) goto L102
        L114:
            int r9 = r9 + (-1)
            r13 = r5
            r21 = r7
            r5 = r9
            r23 = r10
            r7 = r11
            r14 = r12
            goto L340
        L120:
            r9 = 13
            if (r15 == 0) goto L15e
            r13 = r5
            r14 = 0
        L126:
            char r12 = r2[r13]     // Catch: java.lang.RuntimeException -> L159
            r16 = r14
            r14 = 10
            if (r12 == r14) goto L156
            if (r12 == r9) goto L156
            r14 = 47
            if (r12 == r14) goto L13f
            r14 = 58
            if (r12 == r14) goto L156
            r14 = 92
            if (r12 == r14) goto L13d
            goto L14f
        L13d:
            r14 = 1
            goto L151
        L13f:
            int r12 = r13 + 1
            if (r12 != r3) goto L144
            goto L14f
        L144:
            char r12 = r2[r12]     // Catch: java.lang.RuntimeException -> L159
            r14 = 47
            if (r12 == r14) goto L156
            r14 = 42
            if (r12 != r14) goto L14f
            goto L156
        L14f:
            r14 = r16
        L151:
            int r13 = r13 + 1
            if (r13 != r3) goto L126
            goto L1a8
        L156:
            r14 = r16
            goto L1a8
        L159:
            r0 = move-exception
            r7 = r0
            r5 = r13
            goto L474
        L15e:
            r12 = r5
            r13 = 0
        L160:
            char r14 = r2[r12]     // Catch: java.lang.RuntimeException -> L1b9
            r16 = r13
            r13 = 10
            if (r14 == r13) goto L19e
            if (r14 == r9) goto L19e
            r13 = 44
            if (r14 == r13) goto L19e
            r13 = 47
            if (r14 == r13) goto L182
            r13 = 125(0x7d, float:1.75E-43)
            if (r14 == r13) goto L19e
            r13 = 92
            if (r14 == r13) goto L17f
            r9 = 93
            if (r14 == r9) goto L19e
            goto L194
        L17f:
            r16 = 1
            goto L194
        L182:
            r13 = 92
            int r9 = r12 + 1
            if (r9 != r3) goto L189
            goto L194
        L189:
            char r9 = r2[r9]     // Catch: java.lang.RuntimeException -> L1b9
            r14 = 47
            if (r9 == r14) goto L19e
            r14 = 42
            if (r9 != r14) goto L194
            goto L19e
        L194:
            int r12 = r12 + 1
            if (r12 != r3) goto L199
            goto L19e
        L199:
            r13 = r16
            r9 = 13
            goto L160
        L19e:
            r13 = r12
            goto L156
        L1a0:
            char r9 = r2[r13]     // Catch: java.lang.RuntimeException -> L159
            boolean r9 = java.lang.Character.isSpace(r9)     // Catch: java.lang.RuntimeException -> L159
            if (r9 == 0) goto L1ab
        L1a8:
            int r13 = r13 + (-1)
            goto L1a0
        L1ab:
            r21 = r7
            r23 = r10
            r7 = r11
            r16 = 1
            r27 = r13
            r13 = r5
            r5 = r27
            goto L340
        L1b9:
            r0 = move-exception
            r7 = r0
            r5 = r12
            goto L474
        L1be:
            int r9 = r5 + 1
            char r5 = r2[r5]     // Catch: java.lang.RuntimeException -> L1fb
            r12 = 47
            if (r5 != r12) goto L1d6
            r5 = r9
        L1c7:
            if (r5 == r3) goto L1d2
            char r9 = r2[r5]     // Catch: java.lang.RuntimeException -> L472
            r12 = 10
            if (r9 == r12) goto L1d2
            int r5 = r5 + 1
            goto L1c7
        L1d2:
            int r5 = r5 + (-1)
            goto Lf7
        L1d6:
            r5 = r9
            int r9 = r5 + 1
            if (r9 >= r3) goto L1e7
            char r12 = r2[r5]     // Catch: java.lang.RuntimeException -> L34b
            r22 = r5
            r5 = 42
            if (r12 != r5) goto L1e4
            goto L1eb
        L1e4:
            r5 = 47
            goto L1f1
        L1e7:
            r22 = r5
            r5 = 42
        L1eb:
            char r12 = r2[r9]     // Catch: java.lang.RuntimeException -> L1f5
            r5 = 47
            if (r12 == r5) goto L1f2
        L1f1:
            goto L1d6
        L1f2:
            r5 = r9
            goto Lf7
        L1f5:
            r0 = move-exception
            r7 = r0
            r5 = r22
            goto L474
        L1fb:
            r0 = move-exception
            r7 = r0
            r5 = r9
            goto L474
        L200:
            r28.pop()     // Catch: java.lang.RuntimeException -> L472
            boolean r0 = r1.stop     // Catch: java.lang.RuntimeException -> L472
            if (r0 == 0) goto L208
            goto L23c
        L208:
            int r7 = r7 + (-1)
            r12 = r10[r7]     // Catch: java.lang.RuntimeException -> L472
            goto L244
        L20d:
            int r0 = r6.size     // Catch: java.lang.RuntimeException -> L472
            if (r0 <= 0) goto L218
            java.lang.Object r0 = r6.pop()     // Catch: java.lang.RuntimeException -> L472
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.RuntimeException -> L472
            goto L219
        L218:
            r0 = 0
        L219:
            r1.startArray(r0)     // Catch: java.lang.RuntimeException -> L472
            boolean r0 = r1.stop     // Catch: java.lang.RuntimeException -> L472
            if (r0 == 0) goto L221
            goto L23c
        L221:
            int r0 = r10.length     // Catch: java.lang.RuntimeException -> L472
            if (r7 != r0) goto L22d
            int r0 = r10.length     // Catch: java.lang.RuntimeException -> L472
            r4 = 2
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r10, r0)     // Catch: java.lang.RuntimeException -> L472
            r10 = r0
        L22d:
            int r0 = r7 + 1
            r10[r7] = r11     // Catch: java.lang.RuntimeException -> L472
            r12 = 23
            r7 = r0
            goto L244
        L235:
            r28.pop()     // Catch: java.lang.RuntimeException -> L472
            boolean r0 = r1.stop     // Catch: java.lang.RuntimeException -> L472
            if (r0 == 0) goto L240
        L23c:
            r22 = r5
            goto L32e
        L240:
            int r7 = r7 + (-1)
            r12 = r10[r7]     // Catch: java.lang.RuntimeException -> L472
        L244:
            r0 = 4
            r4 = 0
            r11 = 2
            goto L1e
        L249:
            int r0 = r6.size     // Catch: java.lang.RuntimeException -> L472
            if (r0 <= 0) goto L254
            java.lang.Object r0 = r6.pop()     // Catch: java.lang.RuntimeException -> L472
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.RuntimeException -> L472
            goto L255
        L254:
            r0 = 0
        L255:
            r1.startObject(r0)     // Catch: java.lang.RuntimeException -> L472
            boolean r0 = r1.stop     // Catch: java.lang.RuntimeException -> L472
            if (r0 == 0) goto L25d
            goto L23c
        L25d:
            int r0 = r10.length     // Catch: java.lang.RuntimeException -> L472
            if (r7 != r0) goto L26a
            int r0 = r10.length     // Catch: java.lang.RuntimeException -> L472
            r9 = 2
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r10, r0)     // Catch: java.lang.RuntimeException -> L472
            r10 = r0
            goto L26b
        L26a:
            r9 = 2
        L26b:
            int r0 = r7 + 1
            r10[r7] = r11     // Catch: java.lang.RuntimeException -> L472
            r7 = r0
            r0 = 4
            r4 = 0
            r11 = 2
            r12 = 5
            goto L1e
        L276:
            r9 = 2
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.RuntimeException -> L34b
            int r9 = r5 - r13
            r12.<init>(r2, r13, r9)     // Catch: java.lang.RuntimeException -> L34b
            if (r14 == 0) goto L284
            java.lang.String r12 = r1.unescape(r12)     // Catch: java.lang.RuntimeException -> L472
        L284:
            if (r15 == 0) goto L293
            r6.add(r12)     // Catch: java.lang.RuntimeException -> L472
            r22 = r5
            r21 = r7
            r23 = r10
            r7 = r11
            r15 = 0
            goto L32a
        L293:
            int r9 = r6.size     // Catch: java.lang.RuntimeException -> L34b
            if (r9 <= 0) goto L29e
            java.lang.Object r9 = r6.pop()     // Catch: java.lang.RuntimeException -> L472
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.RuntimeException -> L472
            goto L29f
        L29e:
            r9 = 0
        L29f:
            if (r16 == 0) goto L320
            boolean r16 = r12.equals(r8)     // Catch: java.lang.RuntimeException -> L34b
            if (r16 == 0) goto L2b4
            r12 = 1
            r1.bool(r9, r12)     // Catch: java.lang.RuntimeException -> L472
        L2ab:
            r22 = r5
            r21 = r7
        L2af:
            r23 = r10
            r7 = r11
            goto L32a
        L2b4:
            boolean r16 = r12.equals(r0)     // Catch: java.lang.RuntimeException -> L34b
            if (r16 == 0) goto L2bf
            r12 = 0
            r1.bool(r9, r12)     // Catch: java.lang.RuntimeException -> L472
            goto L2ab
        L2bf:
            boolean r16 = r12.equals(r4)     // Catch: java.lang.RuntimeException -> L34b
            if (r16 == 0) goto L2ce
            r21 = r7
            r7 = 0
            r1.string(r9, r7)     // Catch: java.lang.RuntimeException -> L472
            r22 = r5
            goto L2af
        L2ce:
            r21 = r7
            r7 = 0
            r16 = 1
        L2d3:
            if (r13 >= r5) goto L302
            r22 = r5
            char r5 = r2[r13]     // Catch: java.lang.RuntimeException -> L1f5
            r23 = r7
            r7 = 43
            if (r5 == r7) goto L2fb
            r7 = 69
            if (r5 == r7) goto L2f7
            r7 = 101(0x65, float:1.42E-43)
            if (r5 == r7) goto L2f7
            r7 = 45
            if (r5 == r7) goto L2fb
            r7 = 46
            if (r5 == r7) goto L2f7
            switch(r5) {
                case 48: goto L2fb;
                case 49: goto L2fb;
                case 50: goto L2fb;
                case 51: goto L2fb;
                case 52: goto L2fb;
                case 53: goto L2fb;
                case 54: goto L2fb;
                case 55: goto L2fb;
                case 56: goto L2fb;
                case 57: goto L2fb;
                default: goto L2f2;
            }
        L2f2:
            r16 = 0
            r23 = 0
            goto L306
        L2f7:
            r7 = 1
            r16 = 0
            goto L2fd
        L2fb:
            r7 = r23
        L2fd:
            int r13 = r13 + 1
            r5 = r22
            goto L2d3
        L302:
            r22 = r5
            r23 = r7
        L306:
            if (r23 == 0) goto L313
            r23 = r10
            r7 = r11
            double r10 = java.lang.Double.parseDouble(r12)     // Catch: java.lang.RuntimeException -> L1f5 java.lang.NumberFormatException -> L327
            r1.number(r9, r10, r12)     // Catch: java.lang.RuntimeException -> L1f5 java.lang.NumberFormatException -> L327
            goto L32a
        L313:
            r23 = r10
            r7 = r11
            if (r16 == 0) goto L327
            long r10 = java.lang.Long.parseLong(r12)     // Catch: java.lang.RuntimeException -> L1f5 java.lang.NumberFormatException -> L327
            r1.number(r9, r10, r12)     // Catch: java.lang.RuntimeException -> L1f5 java.lang.NumberFormatException -> L327
            goto L32a
        L320:
            r22 = r5
            r21 = r7
            r23 = r10
            r7 = r11
        L327:
            r1.string(r9, r12)     // Catch: java.lang.RuntimeException -> L1f5
        L32a:
            boolean r5 = r1.stop     // Catch: java.lang.RuntimeException -> L1f5
            if (r5 == 0) goto L332
        L32e:
            r5 = r22
            goto L470
        L332:
            r5 = r22
            r13 = r5
            r16 = 0
            goto L340
        L338:
            r22 = r5
            r21 = r7
            r23 = r10
            r7 = r11
            r15 = 1
        L340:
            r11 = r7
            r9 = r18
            r12 = r20
            r7 = r21
            r10 = r23
            goto Le8
        L34b:
            r0 = move-exception
            r22 = r5
            goto L473
        L350:
            r22 = r5
            r21 = r7
            r23 = r10
            r7 = r11
            r12 = r7
            goto L361
        L359:
            r21 = r7
            r23 = r10
            r7 = r11
            r12 = r7
            r13 = r22
        L361:
            if (r12 != 0) goto L36c
            r7 = r21
            r10 = r23
        L367:
            r0 = 4
            r4 = 0
            r11 = 5
            goto L1e
        L36c:
            int r5 = r5 + 1
            if (r5 == r3) goto L379
            r7 = r21
            r10 = r23
            r0 = 4
            r4 = 0
            r11 = 1
            goto L1e
        L379:
            if (r5 != r3) goto L46d
            byte[] r7 = com.badlogic.gdx.utils.JsonReader._json_eof_actions     // Catch: java.lang.RuntimeException -> L469
            r7 = r7[r12]     // Catch: java.lang.RuntimeException -> L469
            byte[] r9 = com.badlogic.gdx.utils.JsonReader._json_actions     // Catch: java.lang.RuntimeException -> L469
            int r10 = r7 + 1
            r7 = r9[r7]     // Catch: java.lang.RuntimeException -> L469
            r12 = r15
        L386:
            int r9 = r7 + (-1)
            if (r7 <= 0) goto L46d
            byte[] r7 = com.badlogic.gdx.utils.JsonReader._json_actions     // Catch: java.lang.RuntimeException -> L469
            int r11 = r10 + 1
            r7 = r7[r10]     // Catch: java.lang.RuntimeException -> L469
            r10 = 1
            if (r7 == r10) goto L39e
            r17 = r4
            r18 = r5
            r4 = r16
            r16 = r0
            r0 = r6
            goto L457
        L39e:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.RuntimeException -> L469
            int r10 = r5 - r13
            r7.<init>(r2, r13, r10)     // Catch: java.lang.RuntimeException -> L469
            if (r14 == 0) goto L3ab
            java.lang.String r7 = r1.unescape(r7)     // Catch: java.lang.RuntimeException -> L472
        L3ab:
            if (r12 == 0) goto L3ba
            r6.add(r7)     // Catch: java.lang.RuntimeException -> L472
            r16 = r0
            r17 = r4
            r18 = r5
            r0 = r6
            r12 = 0
            goto L44d
        L3ba:
            int r10 = r6.size     // Catch: java.lang.RuntimeException -> L469
            if (r10 <= 0) goto L3c5
            java.lang.Object r10 = r6.pop()     // Catch: java.lang.RuntimeException -> L472
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.RuntimeException -> L472
            goto L3c6
        L3c5:
            r10 = 0
        L3c6:
            if (r16 == 0) goto L443
            boolean r15 = r7.equals(r8)     // Catch: java.lang.RuntimeException -> L469
            if (r15 == 0) goto L3db
            r15 = 1
            r1.bool(r10, r15)     // Catch: java.lang.RuntimeException -> L472
        L3d2:
            r16 = r0
            r17 = r4
            r18 = r5
            r0 = r6
            goto L44d
        L3db:
            r15 = 1
            boolean r16 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L469
            if (r16 == 0) goto L3e7
            r7 = 0
            r1.bool(r10, r7)     // Catch: java.lang.RuntimeException -> L472
            goto L3d2
        L3e7:
            boolean r16 = r7.equals(r4)     // Catch: java.lang.RuntimeException -> L469
            if (r16 == 0) goto L3f2
            r15 = 0
            r1.string(r10, r15)     // Catch: java.lang.RuntimeException -> L472
            goto L3d2
        L3f2:
            r16 = r0
            r0 = r13
            r13 = 0
            r15 = 1
        L3f7:
            if (r0 >= r5) goto L427
            r17 = r4
            char r4 = r2[r0]     // Catch: java.lang.RuntimeException -> L469
            r18 = r5
            r5 = 43
            if (r4 == r5) goto L419
            r5 = 69
            if (r4 == r5) goto L41c
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L41c
            r5 = 45
            if (r4 == r5) goto L419
            r5 = 46
            if (r4 == r5) goto L41e
            switch(r4) {
                case 48: goto L420;
                case 49: goto L420;
                case 50: goto L420;
                case 51: goto L420;
                case 52: goto L420;
                case 53: goto L420;
                case 54: goto L420;
                case 55: goto L420;
                case 56: goto L420;
                case 57: goto L420;
                default: goto L416;
            }
        L416:
            r13 = 0
            r15 = 0
            goto L42d
        L419:
            r5 = 46
            goto L420
        L41c:
            r5 = 46
        L41e:
            r13 = 1
            r15 = 0
        L420:
            int r0 = r0 + 1
            r4 = r17
            r5 = r18
            goto L3f7
        L427:
            r17 = r4
            r18 = r5
            r5 = 46
        L42d:
            if (r13 == 0) goto L438
            r0 = r6
            double r5 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.NumberFormatException -> L44a java.lang.RuntimeException -> L464
            r1.number(r10, r5, r7)     // Catch: java.lang.NumberFormatException -> L44a java.lang.RuntimeException -> L464
            goto L44d
        L438:
            r0 = r6
            if (r15 == 0) goto L44a
            long r4 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L44a java.lang.RuntimeException -> L464
            r1.number(r10, r4, r7)     // Catch: java.lang.NumberFormatException -> L44a java.lang.RuntimeException -> L464
            goto L44d
        L443:
            r16 = r0
            r17 = r4
            r18 = r5
            r0 = r6
        L44a:
            r1.string(r10, r7)     // Catch: java.lang.RuntimeException -> L464
        L44d:
            boolean r4 = r1.stop     // Catch: java.lang.RuntimeException -> L464
            if (r4 == 0) goto L454
        L451:
            r5 = r18
            goto L470
        L454:
            r13 = r18
            r4 = 0
        L457:
            r6 = r0
            r7 = r9
            r10 = r11
            r0 = r16
            r5 = r18
            r16 = r4
            r4 = r17
            goto L386
        L464:
            r0 = move-exception
            r7 = r0
            r5 = r18
            goto L474
        L469:
            r0 = move-exception
            r18 = r5
            goto L473
        L46d:
            r18 = r5
            goto L451
        L470:
            r7 = 0
            goto L474
        L472:
            r0 = move-exception
        L473:
            r7 = r0
        L474:
            com.badlogic.gdx.utils.JsonValue r0 = r1.root
            r4 = 0
            r1.root = r4
            r1.current = r4
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r4 = r1.lastChild
            r4.clear()
            boolean r4 = r1.stop
            if (r4 != 0) goto L51e
            if (r5 >= r3) goto L4d6
            r9 = 1
            r12 = 0
        L488:
            if (r12 >= r5) goto L495
            char r0 = r2[r12]
            r4 = 10
            if (r0 != r4) goto L492
            int r9 = r9 + 1
        L492:
            int r12 = r12 + 1
            goto L488
        L495:
            int r0 = r5 + (-32)
            r4 = 0
            int r0 = java.lang.Math.max(r4, r0)
            com.badlogic.gdx.utils.SerializationException r4 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Error parsing JSON on line "
            r6.append(r8)
            r6.append(r9)
            java.lang.String r8 = " near: "
            r6.append(r8)
            java.lang.String r8 = new java.lang.String
            int r9 = r5 - r0
            r8.<init>(r2, r0, r9)
            r6.append(r8)
            java.lang.String r0 = "*ERROR*"
            r6.append(r0)
            java.lang.String r0 = new java.lang.String
            r8 = 64
            int r3 = r3 - r5
            int r3 = java.lang.Math.min(r8, r3)
            r0.<init>(r2, r5, r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.<init>(r0, r7)
            throw r4
        L4d6:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r3 = r1.elements
            int r4 = r3.size
            if (r4 == 0) goto L4ff
            java.lang.Object r0 = r3.peek()
            com.badlogic.gdx.utils.JsonValue r0 = (com.badlogic.gdx.utils.JsonValue) r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r2 = r1.elements
            r2.clear()
            if (r0 == 0) goto L4f7
            boolean r0 = r0.isObject()
            if (r0 == 0) goto L4f7
            com.badlogic.gdx.utils.SerializationException r0 = new com.badlogic.gdx.utils.SerializationException
            java.lang.String r2 = "Error parsing JSON, unmatched brace."
            r0.<init>(r2)
            throw r0
        L4f7:
            com.badlogic.gdx.utils.SerializationException r0 = new com.badlogic.gdx.utils.SerializationException
            java.lang.String r2 = "Error parsing JSON, unmatched bracket."
            r0.<init>(r2)
            throw r0
        L4ff:
            if (r7 != 0) goto L502
            goto L51e
        L502:
            com.badlogic.gdx.utils.SerializationException r0 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error parsing JSON: "
            r3.append(r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2, r7)
            throw r0
        L51e:
            return r0
    }

    protected void pop() {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r0 = r2.elements
            java.lang.Object r0 = r0.pop()
            com.badlogic.gdx.utils.JsonValue r0 = (com.badlogic.gdx.utils.JsonValue) r0
            r2.root = r0
            com.badlogic.gdx.utils.JsonValue r0 = r2.current
            int r0 = r0.size
            if (r0 <= 0) goto L15
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r0 = r2.lastChild
            r0.pop()
        L15:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r0 = r2.elements
            int r1 = r0.size
            if (r1 <= 0) goto L22
            java.lang.Object r0 = r0.peek()
            com.badlogic.gdx.utils.JsonValue r0 = (com.badlogic.gdx.utils.JsonValue) r0
            goto L23
        L22:
            r0 = 0
        L23:
            r2.current = r0
            return
    }

    protected void startArray(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            r0.<init>(r1)
            com.badlogic.gdx.utils.JsonValue r1 = r2.current
            if (r1 == 0) goto Le
            r2.addChild(r3, r0)
        Le:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r3 = r2.elements
            r3.add(r0)
            r2.current = r0
            return
    }

    protected void startObject(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.object
            r0.<init>(r1)
            com.badlogic.gdx.utils.JsonValue r1 = r2.current
            if (r1 == 0) goto Le
            r2.addChild(r3, r0)
        Le:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.JsonValue> r3 = r2.elements
            r3.add(r0)
            r2.current = r0
            return
    }

    protected void string(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            r0.<init>(r3)
            r1.addChild(r2, r0)
            return
    }
}
