# Cache Implementation
The translation between the logical address space and the physical memory is known
as Memory Mapping. To translate from logical to a physical address, to aid in memory
protection also to enable better management of memory resources are objectives of
memory mapping.
During cache mapping, the block is not brought from the main memory but the main
memory block is simply copied to the cache. Cache memory generally tends to operate
in some different configurations,
  1. Direct mapping
  2. Fully associative mapping
  3. Set associative mapping
 
 ## Direct Mapping
 In Direct mapped cache memory, each block mapped to exactly one location in cache
 memory.A particular block of main memory can map the line number of cache is given by -
 Cache line number = (Block Address of Main Memory) modulo (Number of lines in Cache)
 
