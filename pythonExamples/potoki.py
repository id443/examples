from threading import Thread, Lock
from time import sleep

def func():
    for i in range(5):
        print(f"from child thread: {i}")
        sleep(0.5)

th = Thread(target=func)
th.start()

for i in range(5):
    print(f"from main thread: {i}")
    sleep(1)

lock = Lock()
stop_thread = False
def infinit_worker():
    print("Start infinit_worker()")
    while True:
        print("--> thread work")
        lock.acquire()
        if stop_thread is True:
           break
        lock.release()
        sleep(0.1)
    print("Stop infinit_worker()")
# Create and start thread
th = Thread(target=infinit_worker)
th.start()
sleep(2)
# Stop thread
lock.acquire()
stop_thread = True
lock.release()

class CustomThread(Thread):
    def __init__(self, limit):
        Thread.__init__(self)
        self._limit = limit
    def run(self):
        for i in range(self._limit):
            print(f"from CustomThread: {i}")
            sleep(0.5)
cth = CustomThread(3)
cth.start()

th = Thread(target=func)
print(f"thread status: {th.is_alive()}")

th.start()
print(f"thread status: {th.is_alive()}")

sleep(5)
print(f"thread status: {th.is_alive()}")