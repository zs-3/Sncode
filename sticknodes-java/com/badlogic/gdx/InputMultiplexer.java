package com.badlogic.gdx;

/* loaded from: classes.dex */
public class InputMultiplexer implements com.badlogic.gdx.InputProcessor {
    private com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> processors;

    public InputMultiplexer() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.SnapshotArray r0 = new com.badlogic.gdx.utils.SnapshotArray
            r1 = 4
            r0.<init>(r1)
            r2.processors = r0
            return
    }

    public void addProcessor(int r2, com.badlogic.gdx.InputProcessor r3) {
            r1 = this;
            java.lang.String r0 = "processor cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r1.processors
            r0.insert(r2, r3)
            return
    }

    public void addProcessor(com.badlogic.gdx.InputProcessor r2) {
            r1 = this;
            java.lang.String r0 = "processor cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r1.processors
            r0.add(r2)
            return
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyDown(int r6) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.keyDown(r6)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            r0.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyTyped(char r6) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.keyTyped(r6)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            r0.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyUp(int r6) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.keyUp(r6)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            r0.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean mouseMoved(int r6, int r7) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.mouseMoved(r6, r7)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }

    public void removeProcessor(com.badlogic.gdx.InputProcessor r3) {
            r2 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r2.processors
            r1 = 1
            r0.removeValue(r3, r1)
            return
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean scrolled(float r6, float r7) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.scrolled(r6, r7)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int r6, int r7, int r8, int r9) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.touchCancelled(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDown(int r6, int r7, int r8, int r9) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.touchDown(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int r6, int r7, int r8) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.touchDragged(r6, r7, r8)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchUp(int r6, int r7, int r8, int r9) {
            r5 = this;
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r0 = r5.processors
            java.lang.Object[] r0 = r0.begin()
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r1 = r5.processors     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L28
            com.badlogic.gdx.InputProcessor r4 = (com.badlogic.gdx.InputProcessor) r4     // Catch: java.lang.Throwable -> L28
            boolean r4 = r4.touchUp(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L1f
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lc
        L22:
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r6 = r5.processors
            r6.end()
            return r2
        L28:
            r6 = move-exception
            com.badlogic.gdx.utils.SnapshotArray<com.badlogic.gdx.InputProcessor> r7 = r5.processors
            r7.end()
            throw r6
    }
}
