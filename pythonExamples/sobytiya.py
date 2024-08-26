from threading import Thread, Event
from time import sleep, time


event = Event()


def worker(name: str):   
   event.wait()
   print(f"Worker: {name}")


# Clear event
event.clear()

# Create and start workers
workers = [Thread(target=worker, args=(f"wrk {i}",)) for i in range(5)]
for w in workers:
   w.start()

print("Main thread")

event.set()